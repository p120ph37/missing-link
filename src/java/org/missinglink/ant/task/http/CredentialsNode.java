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

package org.missinglink.ant.task.http;

import org.apache.tools.ant.types.DataType;

/**
 * @author alex.sherwin
 *
 */
public class CredentialsNode extends DataType {

  protected String username;
  protected String password;
  protected boolean show = false;

  public CredentialsNode() {
    super();
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(final String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(final String password) {
    this.password = password;
  }

  public boolean isShow() {
    return show;
  }

  public void setShow(final boolean show) {
    this.show = show;
  }

  public boolean isValid() {
    if (null != username && username.length() > 0) {
      return true;
    }
    return false;
  }
}
