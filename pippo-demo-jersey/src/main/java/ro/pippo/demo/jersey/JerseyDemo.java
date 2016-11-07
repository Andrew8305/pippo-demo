/*
 * Copyright (C) 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.pippo.demo.jersey;

import org.slf4j.bridge.SLF4JBridgeHandler;
import ro.pippo.core.Pippo;

import java.util.logging.LogManager;

/**
 * @author Decebal Suiu
 */
public class JerseyDemo {

    // for jersey log
    static {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        LogManager.getLogManager().reset();
        SLF4JBridgeHandler.install();
    }

    public static void main(String[] args) {
//        Pippo pippo = new Pippo();
        Pippo pippo = new Pippo(new JerseyApplication());

        // set pippo filter path
        pippo.getServer().setPippoFilterPath("/app/*");

        // add route
//        pippo.GET("/", routeContext -> routeContext.send("Hello from Pippo!"));

        pippo.start();
    }

}
