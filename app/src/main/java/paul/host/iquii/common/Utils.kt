package paul.host.iquii.common

//here to giving of understanding how I <3 kotlin ;)
infix fun <T> Boolean.isTrue(t: T): T? = if (this) t else null
