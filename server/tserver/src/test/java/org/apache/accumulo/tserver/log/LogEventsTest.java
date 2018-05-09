/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.accumulo.tserver.log;

import org.apache.accumulo.tserver.logger.LogEvents;
import org.junit.Assert;
import org.junit.Test;

public class LogEventsTest {
  @Test
  public void testOrdinals() {
    // Ordinals are used for persistence, so its important they are stable.

    LogEvents[] expectedOrder = {LogEvents.OPEN, LogEvents.DEFINE_TABLET, LogEvents.MUTATION,
        LogEvents.MANY_MUTATIONS, LogEvents.COMPACTION_START, LogEvents.COMPACTION_FINISH};

    for (int i = 0; i < expectedOrder.length; i++) {
      Assert.assertEquals(i, expectedOrder[i].ordinal());
    }
  }
}
