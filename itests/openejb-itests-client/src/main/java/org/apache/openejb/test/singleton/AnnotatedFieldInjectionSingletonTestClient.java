/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.openejb.test.singleton;

/**
 * [2] Should be run as the second test suite of the BasicSingletonTestClients
 * 
 * @author <a href="mailto:david.blevins@visi.com">David Blevins</a>
 * @author <a href="mailto:Richard@Monson-Haefel.com">Richard Monson-Haefel</a>
 * @author <a href="mailto:nour.mohammad@gmail.com">Mohammad Nour El-Din</a>
 * 
 * @version $Rev: 607077 $ $Date: 2007-12-27 06:55:23 -0800 (Thu, 27 Dec 2007) $
 */
public abstract class AnnotatedFieldInjectionSingletonTestClient extends BasicSingletonTestClient {

    public AnnotatedFieldInjectionSingletonTestClient(String name) {
        super("AnnotatedFieldInjectionSingletonTestClient." + name);
    }
    
    protected void setUp() throws Exception{
        super.setUp();
        processFieldInjections();
    }
    
}

