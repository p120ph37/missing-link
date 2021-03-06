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

package org.missinglink.http.exception;

/**
 * @author alex.sherwin
 * 
 */
public abstract class HttpClientException extends Exception {

  private static final long serialVersionUID = -3170616202635592971L;

  protected Integer statusCode;

  /**
   * 
   */
  public HttpClientException() {
    super();
  }

  /**
   * @param message
   * @param cause
   */
  public HttpClientException(final String message, final Throwable cause) {
    super(message, cause);
  }

  /**
   * @param message
   */
  public HttpClientException(final String message) {
    super(message);
  }

  /**
   * @param cause
   */
  public HttpClientException(final Throwable cause) {
    super(cause);
  }

  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(final Integer statusCode) {
    this.statusCode = statusCode;
  }

}
