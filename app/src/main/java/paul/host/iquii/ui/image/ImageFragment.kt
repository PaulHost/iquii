package paul.host.iquii.ui.image

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import paul.host.iquii.ui.view.InteractiveImageView


class ImageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = InteractiveImageView(requireContext())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (view as InteractiveImageView).setImage(arguments?.getString(IMAGE_URL))
    }

    companion object {
        private const val IMAGE_URL = " IMAGE_URL "

        val instance = ImageFragment()

        fun getInstance(url: String?): Fragment =
            instance.apply { arguments = Bundle().apply { putString(IMAGE_URL, url) } }
    }
}
