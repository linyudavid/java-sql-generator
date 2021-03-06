/*
 * Copyright (c) 2010, Stanislav Muhametsin. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.sql.generation.api.grammar.builders.booleans;

import org.sql.generation.api.grammar.booleans.BooleanExpression;
import org.sql.generation.api.grammar.builders.AbstractBuilder;

/**
 * A builder-pattern interface to build boolean expressions. It holds the current expression, modifying it as per user's
 * instructions, and returns it once the {@link #createExpression()} method is called.
 * 
 * @author Stanislav Muhametsin
 */
public interface BooleanBuilder
    extends AbstractBuilder<BooleanExpression>
{

    /**
     * Sets current expression as current expression {@code AND next}.
     * 
     * @param next The expression on a right hand of {@code AND}.
     * @return This builder.
     */
    public BooleanBuilder and( BooleanExpression next );

    /**
     * Sets current expression as current expression {@code OR next}
     * 
     * @param next The expression on a right hand of {@code OR}
     * @return This builder.
     */
    public BooleanBuilder or( BooleanExpression next );

    /**
     * Sets current expression as {@code NOT} current expression.
     * 
     * @return This builder.
     */
    public BooleanBuilder not();

    /**
     * Sets current expression as given parameter.
     * 
     * @param newExpression The new expression.
     * @return This builder.
     */
    public BooleanBuilder reset( BooleanExpression newExpression );
}
