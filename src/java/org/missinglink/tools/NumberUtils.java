/**
 *   Copyright Alex Sherwin and other contributers as noted.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.missinglink.tools;

/**
 * @author alex.sherwin
 * 
 */
public abstract class NumberUtils {

  protected NumberUtils() {
    super();
  }

  /**
   * Attempt to convert str to an {@link Integer}, on any failure whatsoever
   * return defaultNumber
   * 
   * @param str
   */
  public static Integer defaultInteger(final String str, final Integer defaultNumber) {
    try {
      return Integer.valueOf(str);
    } catch (final Throwable t) {
      return defaultNumber;
    }
  }

}
