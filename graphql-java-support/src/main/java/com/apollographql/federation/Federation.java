/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.apollographql.federation;

import graphql.schema.*;
import org.jetbrains.annotations.NotNull;

public final class Federation {
    @NotNull
    public static SchemaTransformer transform(final GraphQLSchema schema) {
        return new SchemaTransformer(schema);
    }

    private Federation() {
    }
}