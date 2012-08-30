package org.openbakery

import org.gradle.api.Project
import org.gradle.api.Plugin

class XcodeBuildPluginExtension {
	def String infoPlist = null
	def String configuration = 'Debug'
	def String sdk = 'iphonesimulator'
	def target = 'unknown'
	def String buildRoot = 'build'
	def String dstRoot = buildRoot + '/dst'
	def String objRoot = buildRoot + '/obj'
	def String symRoot = buildRoot + '/sym'
	def String sharedPrecompsDir = buildRoot + '/shared'
	def String sourceDirectory = '.'
	def String signIdentity = null
	def additionalParameters = null
	def String bundleNameSuffix = null
	def String arch = null
}