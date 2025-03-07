/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.components.smartCastProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.impl.barebone.test.FrontendApiTestConfiguratorService;
import org.jetbrains.kotlin.analysis.api.descriptors.test.KtFe10FrontendApiTestConfiguratorService;
import org.jetbrains.kotlin.analysis.api.impl.base.test.components.smartCastProvider.AbstractHLSmartCastInfoTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/smartCastProvider/smartCastInfo")
@TestDataPath("$PROJECT_ROOT")
public class Fe10HLSmartCastInfoTestGenerated extends AbstractHLSmartCastInfoTest {
    @NotNull
    @Override
    public FrontendApiTestConfiguratorService getConfigurator() {
        return KtFe10FrontendApiTestConfiguratorService.INSTANCE;
    }

    @Test
    public void testAllFilesPresentInSmartCastInfo() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/smartCastProvider/smartCastInfo"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("multiSmartcastAsReceiver_stable.kt")
    public void testMultiSmartcastAsReceiver_stable() throws Exception {
        runTest("analysis/analysis-api/testData/components/smartCastProvider/smartCastInfo/multiSmartcastAsReceiver_stable.kt");
    }

    @Test
    @TestMetadata("multiSmartcastAsReceiver_unstable.kt")
    public void testMultiSmartcastAsReceiver_unstable() throws Exception {
        runTest("analysis/analysis-api/testData/components/smartCastProvider/smartCastInfo/multiSmartcastAsReceiver_unstable.kt");
    }

    @Test
    @TestMetadata("multiSmartcast_stable.kt")
    public void testMultiSmartcast_stable() throws Exception {
        runTest("analysis/analysis-api/testData/components/smartCastProvider/smartCastInfo/multiSmartcast_stable.kt");
    }

    @Test
    @TestMetadata("multiSmartcast_unstable.kt")
    public void testMultiSmartcast_unstable() throws Exception {
        runTest("analysis/analysis-api/testData/components/smartCastProvider/smartCastInfo/multiSmartcast_unstable.kt");
    }

    @Test
    @TestMetadata("smartcastAsReceiver_stable.kt")
    public void testSmartcastAsReceiver_stable() throws Exception {
        runTest("analysis/analysis-api/testData/components/smartCastProvider/smartCastInfo/smartcastAsReceiver_stable.kt");
    }

    @Test
    @TestMetadata("smartcastAsReceiver_unstable.kt")
    public void testSmartcastAsReceiver_unstable() throws Exception {
        runTest("analysis/analysis-api/testData/components/smartCastProvider/smartCastInfo/smartcastAsReceiver_unstable.kt");
    }

    @Test
    @TestMetadata("smartcast_stable.kt")
    public void testSmartcast_stable() throws Exception {
        runTest("analysis/analysis-api/testData/components/smartCastProvider/smartCastInfo/smartcast_stable.kt");
    }

    @Test
    @TestMetadata("smartcast_unstable.kt")
    public void testSmartcast_unstable() throws Exception {
        runTest("analysis/analysis-api/testData/components/smartCastProvider/smartCastInfo/smartcast_unstable.kt");
    }
}
