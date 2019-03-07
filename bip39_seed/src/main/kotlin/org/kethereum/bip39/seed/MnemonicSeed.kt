package org.kethereum.bip39.seed

import org.kethereum.bip32.model.Seed
import org.kethereum.bip32.toKey
import org.kethereum.bip39.model.MnemonicWords
import org.kethereum.crypto.CryptoAPI

/**
 * Generates a seed buffer from a mnemonic phrase according to the BIP39 spec.
 * The mnemonic phrase is given as a list of words and the seed can be salted using a password
 */
fun MnemonicWords.toSeed(password: String = ""): Seed {
    val pass = words.joinToString(" ")
    val salt = "mnemonic$password"
    return org.kethereum.bip32.model.Seed(CryptoAPI.pbkdf2.derive(pass.toCharArray(), salt.toByteArray()))
}


fun MnemonicWords.toKey(path: String, saltPhrase: String = "") =
        toSeed(saltPhrase).toKey(path)