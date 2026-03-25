package oop_126061_MochamadRifkyFauzan.week01.week07

enum class AppState {
    STARTING, RUNNING, STOPPED
}
sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}