package org.kethereum.bip39.wordlists

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MnemonicTest {

    @Test
    fun throwsOnWrongEntropySize() {
        assertEquals(wordListOfEnglish().size, 2048)
        assertEquals(wordListOfChineseSimplified().size, 2048)
        assertEquals(wordListOfChineseTraditional().size, 2048)
        assertEquals(wordListOfFrench().size, 2048)
        assertEquals(wordListOfItalian().size, 2048)
        assertEquals(wordListOfJapanese().size, 2048)
        assertEquals(wordListOfKorean().size, 2048)
        assertEquals(wordListOfSpanish().size, 2048)
    }

}