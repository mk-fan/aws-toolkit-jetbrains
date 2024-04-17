// Copyright 2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: Apache-2.0

package software.aws.toolkits.jetbrains.services.codemodernizer.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/*
data class HilInput(
    val dependenciesRoot: String,
    val pomGroupId: String,
    val pomArtifactId: String,
    val targetPomVersion: String,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class CodeTransformHilManifest(
    val hilCapability: String,
    val hilInput: HilInput,
)
*/

@JsonIgnoreProperties(ignoreUnknown = true)
data class CodeTransformHilDownloadManifest(
    val pomArtifactId: String,
    val pomFolderName: String,
    val hilCapability: String,
    val pomGroupId: String,
    val sourcePomVersion: String?
)
