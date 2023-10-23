package com.akjaw.konsist

import com.lemonappdev.konsist.api.Konsist
import com.lemonappdev.konsist.api.verify.assertTrue
import org.junit.Test

class KonsistTest {

    @Test
    fun `no empty files allowed`() {
        Konsist
            .scopeFromProject()
            .files
            .assertTrue { it.text.isNotBlank() }
    }
}
