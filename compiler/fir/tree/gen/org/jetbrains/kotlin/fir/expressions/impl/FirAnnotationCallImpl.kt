/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.expressions.impl

import org.jetbrains.kotlin.KtSourceElement
import org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget
import org.jetbrains.kotlin.fir.expressions.FirAnnotation
import org.jetbrains.kotlin.fir.expressions.FirAnnotationArgumentMapping
import org.jetbrains.kotlin.fir.expressions.FirAnnotationCall
import org.jetbrains.kotlin.fir.expressions.FirArgumentList
import org.jetbrains.kotlin.fir.references.FirReference
import org.jetbrains.kotlin.fir.types.FirTypeRef
import org.jetbrains.kotlin.fir.visitors.*

/*
 * This file was generated automatically
 * DO NOT MODIFY IT MANUALLY
 */

internal class FirAnnotationCallImpl(
    override val source: KtSourceElement?,
    override val useSiteTarget: AnnotationUseSiteTarget?,
    override var annotationTypeRef: FirTypeRef,
    override var argumentList: FirArgumentList,
    override var calleeReference: FirReference,
    override var argumentMapping: FirAnnotationArgumentMapping,
) : FirAnnotationCall() {
    override val typeRef: FirTypeRef get() = annotationTypeRef
    override val annotations: List<FirAnnotation> get() = emptyList()

    override fun <R, D> acceptChildren(visitor: FirVisitor<R, D>, data: D) {
        annotationTypeRef.accept(visitor, data)
        argumentList.accept(visitor, data)
        calleeReference.accept(visitor, data)
    }

    override fun <D> transformChildren(transformer: FirTransformer<D>, data: D): FirAnnotationCallImpl {
        transformAnnotationTypeRef(transformer, data)
        argumentList = argumentList.transform(transformer, data)
        transformCalleeReference(transformer, data)
        return this
    }

    override fun <D> transformAnnotations(transformer: FirTransformer<D>, data: D): FirAnnotationCallImpl {
        return this
    }

    override fun <D> transformAnnotationTypeRef(transformer: FirTransformer<D>, data: D): FirAnnotationCallImpl {
        annotationTypeRef = annotationTypeRef.transform(transformer, data)
        return this
    }

    override fun <D> transformCalleeReference(transformer: FirTransformer<D>, data: D): FirAnnotationCallImpl {
        calleeReference = calleeReference.transform(transformer, data)
        return this
    }

    override fun replaceTypeRef(newTypeRef: FirTypeRef) {}

    override fun replaceArgumentList(newArgumentList: FirArgumentList) {
        argumentList = newArgumentList
    }

    override fun replaceCalleeReference(newCalleeReference: FirReference) {
        calleeReference = newCalleeReference
    }

    override fun replaceArgumentMapping(newArgumentMapping: FirAnnotationArgumentMapping) {
        argumentMapping = newArgumentMapping
    }
}
