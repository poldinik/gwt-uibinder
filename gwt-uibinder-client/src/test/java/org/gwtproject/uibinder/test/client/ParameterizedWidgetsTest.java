/*
 * Copyright 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.uibinder.test.client;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Test that {@literal @}UiFactory and parameterized return types get along.
 */
public class ParameterizedWidgetsTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "org.gwtproject.uibinder.test.UiBinderSuite";
  }

  public void testHappy() {
    ParameterizedWidget<String> ui = new ParameterizedWidget<String>();
    assertNotNull(ui.fromFactory);
  }
}