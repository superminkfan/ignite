/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.management.api;

import java.util.function.Consumer;
import org.apache.ignite.internal.client.GridClientBeforeNodeStart;
import org.apache.ignite.internal.client.GridClientNodeStateBeforeStart;
import org.apache.ignite.internal.dto.IgniteDataTransferObject;

/**
 * Command that must be executed directly using {@link GridClientBeforeNodeStart} instance.
 */
public interface BeforeNodeStartCommand<A extends IgniteDataTransferObject, R> extends Command<A, R> {
    /**
     * @param beforeStart {@link GridClientBeforeNodeStart} client instance.
     * @param arg Command argument.
     * @param printer Results printer.
     * @return Command result.
     */
    public R execute(GridClientNodeStateBeforeStart beforeStart, A arg, Consumer<String> printer) throws Exception;
}
