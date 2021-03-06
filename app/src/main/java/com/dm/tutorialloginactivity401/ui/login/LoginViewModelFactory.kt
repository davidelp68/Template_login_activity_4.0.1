package com.dm.tutorialloginactivity401.ui.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dm.tutorialloginactivity401.data.LoginDataSource
import com.dm.tutorialloginactivity401.data.LoginRepository

/**
 * Factory di provider ViewModel per istanziare LoginViewModel.
 * Obbligatorio dato che LoginViewModel ha un costruttore non vuoto
 */
class LoginViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(
                    loginRepository = LoginRepository(
                            dataSource = LoginDataSource()
                    )
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}