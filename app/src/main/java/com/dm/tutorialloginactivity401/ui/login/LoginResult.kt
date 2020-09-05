package com.dm.tutorialloginactivity401.ui.login

/**
 * Risultato dell'autenticazione: successo (dettagli utente) o messaggio di errore.
 */
data class LoginResult(
        val success: LoggedInUserView? = null,
        val error: Int? = null
)