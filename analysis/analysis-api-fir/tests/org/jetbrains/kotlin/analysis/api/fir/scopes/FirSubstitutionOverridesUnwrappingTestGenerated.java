/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.scopes;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.impl.barebone.test.FrontendApiTestConfiguratorService;
import org.jetbrains.kotlin.analysis.api.fir.FirFrontendApiTestConfiguratorService;
import org.jetbrains.kotlin.analysis.api.impl.base.test.scopes.AbstractSubstitutionOverridesUnwrappingTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping")
@TestDataPath("$PROJECT_ROOT")
public class FirSubstitutionOverridesUnwrappingTestGenerated extends AbstractSubstitutionOverridesUnwrappingTest {
    @NotNull
    @Override
    public FrontendApiTestConfiguratorService getConfigurator() {
        return FirFrontendApiTestConfiguratorService.INSTANCE;
    }

    @Test
    public void testAllFilesPresentInSubstitutionOverridesUnwrapping() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("ClassWithGenericBase1.kt")
    public void testClassWithGenericBase1() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping/ClassWithGenericBase1.kt");
    }

    @Test
    @TestMetadata("ClassWithGenericBase2.kt")
    public void testClassWithGenericBase2() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping/ClassWithGenericBase2.kt");
    }

    @Test
    @TestMetadata("ClassWithGenericBase3.kt")
    public void testClassWithGenericBase3() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping/ClassWithGenericBase3.kt");
    }

    @Test
    @TestMetadata("ClassWithGenericBase4.kt")
    public void testClassWithGenericBase4() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping/ClassWithGenericBase4.kt");
    }

    @Test
    @TestMetadata("GenericFromFunctionInLocalClass1.kt")
    public void testGenericFromFunctionInLocalClass1() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping/GenericFromFunctionInLocalClass1.kt");
    }

    @Test
    @TestMetadata("GenericFromFunctionInLocalClass2.kt")
    public void testGenericFromFunctionInLocalClass2() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping/GenericFromFunctionInLocalClass2.kt");
    }

    @Test
    @TestMetadata("GenericFromOuterClassInInnerClass1.kt")
    public void testGenericFromOuterClassInInnerClass1() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping/GenericFromOuterClassInInnerClass1.kt");
    }

    @Test
    @TestMetadata("GenericFromOuterClassInInnerClass2.kt")
    public void testGenericFromOuterClassInInnerClass2() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping/GenericFromOuterClassInInnerClass2.kt");
    }

    @Test
    @TestMetadata("GenericFromOuterClassInInnerClassInInheritor1.kt")
    public void testGenericFromOuterClassInInnerClassInInheritor1() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping/GenericFromOuterClassInInnerClassInInheritor1.kt");
    }

    @Test
    @TestMetadata("GenericFromOuterClassInInnerClassInInheritor2.kt")
    public void testGenericFromOuterClassInInnerClassInInheritor2() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping/GenericFromOuterClassInInnerClassInInheritor2.kt");
    }

    @Test
    @TestMetadata("GenericFromOuterClassInInnerClassInInheritor3.kt")
    public void testGenericFromOuterClassInInnerClassInInheritor3() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping/GenericFromOuterClassInInnerClassInInheritor3.kt");
    }

    @Test
    @TestMetadata("Implement_java_util_Collection.kt")
    public void testImplement_java_util_Collection() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping/Implement_java_util_Collection.kt");
    }

    @Test
    @TestMetadata("MemberFunctionWithOuterTypeParameterBound.kt")
    public void testMemberFunctionWithOuterTypeParameterBound() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping/MemberFunctionWithOuterTypeParameterBound.kt");
    }

    @Test
    @TestMetadata("MemberPropertyWithOuterTypeParameterBound.kt")
    public void testMemberPropertyWithOuterTypeParameterBound() throws Exception {
        runTest("analysis/analysis-api/testData/scopes/substitutionOverridesUnwrapping/MemberPropertyWithOuterTypeParameterBound.kt");
    }
}
