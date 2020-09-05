package com.dm.tutorialloginactivity401.ui.login

/**
 * Stato di convalida dei dati del modulo di accesso.
 */
data class LoginFormState(val usernameError: Int? = null,
                          val passwordError: Int? = null,
                          val isDataValid: Boolean = false)