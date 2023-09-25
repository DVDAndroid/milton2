/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.milton.http.values;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Holds a list of href values which will be written as a list of <href> elements
 * <p>
 * See HrefListValueWriter
 *
 * @author brad
 */
public class HrefList extends ArrayList<String> {

    private static final long serialVersionUID = 1L;

    public static HrefList asList(String... items) {
        HrefList l = new HrefList();
        l.addAll(Arrays.asList(items));
        return l;
    }
}
