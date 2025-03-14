/*-
 * #%L
 * HAPI FHIR - Core Library
 * %%
 * Copyright (C) 2014 - 2025 Smile CDR, Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package ca.uhn.fhir.i18n;

public final class Msg {
	private static final String ERROR_CODE_PREFIX = "HAPI";

	/**
	 * IMPORTANT: Please update the table in the following link after you add a new code:
	 * https://github.com/hapifhir/hapi-fhir/wiki/Bumping-Error-Code
	 */
	private Msg() {}

	public static String code(int theCode) {
		return String.format("%s-%04d: ", ERROR_CODE_PREFIX, theCode);
	}
}
