package com.example.smartsolutions

sealed interface ChatAreaUIState {

    data object Ideal: ChatAreaUIState

    data object Loading : ChatAreaUIState

    data class Success (val ChatData: String): ChatAreaUIState

    data class Error (val ChatError : String): ChatAreaUIState
}