// Copyright 2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: Apache-2.0

package software.aws.toolkits.jetbrains.services.codemodernizer.commands

import software.aws.toolkits.jetbrains.services.amazonq.messages.AmazonQMessage
import software.aws.toolkits.jetbrains.services.codemodernizer.model.CodeModernizerJobCompletedResult
import software.aws.toolkits.jetbrains.services.codemodernizer.model.MavenCopyCommandsResult

// TODO move to the right file
data class HilArtifact(
    val dependencyName: String,
    val currentVersion: String,
    val availableVersions: List<String>
)

data class CodeTransformActionMessage(
    val command: CodeTransformCommand,
    val mavenBuildResult: MavenCopyCommandsResult? = null,
    val transformResult: CodeModernizerJobCompletedResult? = null,
    val hilArtifact: HilArtifact? = null
) : AmazonQMessage
