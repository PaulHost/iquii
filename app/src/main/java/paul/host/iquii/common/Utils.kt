package paul.host.iquii.common

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import com.jakewharton.rx.ReplayingShare
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.FlowableEmitter
import io.reactivex.FlowableOnSubscribe
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

//here to giving of understanding how I <3 kotlin ;)
infix fun <T> Boolean.isTrue(t: T): T? = if (this) t else null

fun <T> Flowable<T>.applySchedulers(): Flowable<T> =
    subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread())

fun <T> createFlowable(
    default: T? = null, emitter: (FlowableEmitter<T>) -> Unit
) = Flowable.create(FlowableOnSubscribe<T> { emitter(it) }, BackpressureStrategy.LATEST)
    .apply {
        if (default != null) defaultIfEmpty(default)
        compose(ReplayingShare.instance())
    }

fun EditText.onTextChange(function: (String) -> Unit) = addTextChangedListener(
    object : TextWatcher {
        override fun afterTextChanged(s: Editable?) = Unit
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            function(s.toString())
        }
    }
)
