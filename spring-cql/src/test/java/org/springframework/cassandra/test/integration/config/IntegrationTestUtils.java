/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cassandra.test.integration.config;

import static org.assertj.core.api.Assertions.*;

import org.springframework.cassandra.core.CqlTemplate;

import com.datastax.driver.core.Session;

/**
 * @author Matthew T. Adams
 */
public class IntegrationTestUtils {

	public static void assertCqlTemplate(CqlTemplate cqlTemplate) {
		assertThat(cqlTemplate).isNotNull();
	}

	public static void assertSession(Session session) {
		assertThat(session).isNotNull();
	}

	public static void assertKeyspaceExists(String keyspace, Session session) {
		assertThat(session.getCluster().getMetadata().getKeyspace(keyspace)).isNotNull();
	}
}
