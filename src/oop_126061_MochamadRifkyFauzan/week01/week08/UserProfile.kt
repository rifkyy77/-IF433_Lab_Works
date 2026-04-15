package oop_126061_MochamadRifkyFauzan.week01.week08

// name adalah Non-null (wajib), email dan phone adalah Nullable (opsional)
class UserProfile(
    val name: String,
    val email: String?,
    val phone: String? = null // default argument null
)