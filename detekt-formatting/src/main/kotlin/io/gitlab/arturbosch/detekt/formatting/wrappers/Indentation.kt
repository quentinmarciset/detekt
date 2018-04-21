package io.gitlab.arturbosch.detekt.formatting.wrappers

import com.github.shyiko.ktlint.ruleset.standard.IndentationRule
import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.formatting.FormattingRule

/**
 * See https://ktlint.github.io for documentation.
 *
 * @author Artur Bosch
 */
class Indentation(config: Config) : FormattingRule(config) {

	override val wrapping = IndentationRule()
	override val issue = issueFor("Reports mis-indented code")
}