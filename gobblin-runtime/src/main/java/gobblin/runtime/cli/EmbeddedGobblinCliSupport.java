/*
 * Copyright (C) 2014-2016 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 */

package gobblin.runtime.cli;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Specifies that the annotated constructor should be used to instantiate the
 * {@link gobblin.runtime.embedded.EmbeddedGobblin} for running from CLI. Note the length of {@link #argumentNames()}
 * must exactly match the number of parameters in the constructor.
 * This annotation will be ignored unless it is applied to a constructor with only {@link String} parameters. Note
 * that annotating multiple valid constructors in the same class is an error.
 */
@Retention(value= RetentionPolicy.RUNTIME) @Target(value= {ElementType.CONSTRUCTOR})
public @interface EmbeddedGobblinCliSupport {
  /**
   * An array specifying the display name of each constructor parameter as an option in the CLI. The length of this
   * array must be exactly the same as the number of parameters in the constructor.
   */
  String[] argumentNames() default {};
}
