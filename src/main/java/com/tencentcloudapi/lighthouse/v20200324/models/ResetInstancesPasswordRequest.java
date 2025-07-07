/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetInstancesPasswordRequest extends AbstractModel {

    /**
    * 实例 ID 列表。每次请求批量实例的上限为 100。可通过 <a href="https://cloud.tencent.com/document/product/1207/47573">DescribeInstances</a> 接口返回值中的 InstanceId 获取。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：</br> `LINUX_UNIX` 实例密码必须 8-30 位，推荐使用 12 位以上密码，不能以“/”开头，至少包含以下字符中的三种不同字符，字符种类：</br> <li>小写字母：[a-z]</br></li> <li>大写字母：[A-Z]</br></li> <li>数字：0-9</br></li> <li>特殊字符： ()\`\~!@#$%^&\*-+=\_|{}[]:;' <>,.?/</li></br> `WINDOWS` 实例密码必须 12-30 位，不能以“/”开头且不包括用户名，至少包含以下字符中的三种不同字符</br> <li>小写字母：[a-z]</br></li> <li>大写字母：[A-Z]</br></li> <li>数字： 0-9</br></li> <li>特殊字符：()\`~!@#$%^&\*-+=\_|{}[]:;' <>,.?/</br></li> <li>如果实例即包含 `LINUX_UNIX` 实例又包含 `WINDOWS` 实例，则密码复杂度限制按照 `WINDOWS` 实例的限制。</li>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 待重置密码的实例操作系统用户名。不得超过 64 个字符。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get 实例 ID 列表。每次请求批量实例的上限为 100。可通过 <a href="https://cloud.tencent.com/document/product/1207/47573">DescribeInstances</a> 接口返回值中的 InstanceId 获取。 
     * @return InstanceIds 实例 ID 列表。每次请求批量实例的上限为 100。可通过 <a href="https://cloud.tencent.com/document/product/1207/47573">DescribeInstances</a> 接口返回值中的 InstanceId 获取。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例 ID 列表。每次请求批量实例的上限为 100。可通过 <a href="https://cloud.tencent.com/document/product/1207/47573">DescribeInstances</a> 接口返回值中的 InstanceId 获取。
     * @param InstanceIds 实例 ID 列表。每次请求批量实例的上限为 100。可通过 <a href="https://cloud.tencent.com/document/product/1207/47573">DescribeInstances</a> 接口返回值中的 InstanceId 获取。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：</br> `LINUX_UNIX` 实例密码必须 8-30 位，推荐使用 12 位以上密码，不能以“/”开头，至少包含以下字符中的三种不同字符，字符种类：</br> <li>小写字母：[a-z]</br></li> <li>大写字母：[A-Z]</br></li> <li>数字：0-9</br></li> <li>特殊字符： ()\`\~!@#$%^&\*-+=\_|{}[]:;' <>,.?/</li></br> `WINDOWS` 实例密码必须 12-30 位，不能以“/”开头且不包括用户名，至少包含以下字符中的三种不同字符</br> <li>小写字母：[a-z]</br></li> <li>大写字母：[A-Z]</br></li> <li>数字： 0-9</br></li> <li>特殊字符：()\`~!@#$%^&\*-+=\_|{}[]:;' <>,.?/</br></li> <li>如果实例即包含 `LINUX_UNIX` 实例又包含 `WINDOWS` 实例，则密码复杂度限制按照 `WINDOWS` 实例的限制。</li> 
     * @return Password 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：</br> `LINUX_UNIX` 实例密码必须 8-30 位，推荐使用 12 位以上密码，不能以“/”开头，至少包含以下字符中的三种不同字符，字符种类：</br> <li>小写字母：[a-z]</br></li> <li>大写字母：[A-Z]</br></li> <li>数字：0-9</br></li> <li>特殊字符： ()\`\~!@#$%^&\*-+=\_|{}[]:;' <>,.?/</li></br> `WINDOWS` 实例密码必须 12-30 位，不能以“/”开头且不包括用户名，至少包含以下字符中的三种不同字符</br> <li>小写字母：[a-z]</br></li> <li>大写字母：[A-Z]</br></li> <li>数字： 0-9</br></li> <li>特殊字符：()\`~!@#$%^&\*-+=\_|{}[]:;' <>,.?/</br></li> <li>如果实例即包含 `LINUX_UNIX` 实例又包含 `WINDOWS` 实例，则密码复杂度限制按照 `WINDOWS` 实例的限制。</li>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：</br> `LINUX_UNIX` 实例密码必须 8-30 位，推荐使用 12 位以上密码，不能以“/”开头，至少包含以下字符中的三种不同字符，字符种类：</br> <li>小写字母：[a-z]</br></li> <li>大写字母：[A-Z]</br></li> <li>数字：0-9</br></li> <li>特殊字符： ()\`\~!@#$%^&\*-+=\_|{}[]:;' <>,.?/</li></br> `WINDOWS` 实例密码必须 12-30 位，不能以“/”开头且不包括用户名，至少包含以下字符中的三种不同字符</br> <li>小写字母：[a-z]</br></li> <li>大写字母：[A-Z]</br></li> <li>数字： 0-9</br></li> <li>特殊字符：()\`~!@#$%^&\*-+=\_|{}[]:;' <>,.?/</br></li> <li>如果实例即包含 `LINUX_UNIX` 实例又包含 `WINDOWS` 实例，则密码复杂度限制按照 `WINDOWS` 实例的限制。</li>
     * @param Password 实例登录密码。不同操作系统类型密码复杂度限制不一样，具体如下：</br> `LINUX_UNIX` 实例密码必须 8-30 位，推荐使用 12 位以上密码，不能以“/”开头，至少包含以下字符中的三种不同字符，字符种类：</br> <li>小写字母：[a-z]</br></li> <li>大写字母：[A-Z]</br></li> <li>数字：0-9</br></li> <li>特殊字符： ()\`\~!@#$%^&\*-+=\_|{}[]:;' <>,.?/</li></br> `WINDOWS` 实例密码必须 12-30 位，不能以“/”开头且不包括用户名，至少包含以下字符中的三种不同字符</br> <li>小写字母：[a-z]</br></li> <li>大写字母：[A-Z]</br></li> <li>数字： 0-9</br></li> <li>特殊字符：()\`~!@#$%^&\*-+=\_|{}[]:;' <>,.?/</br></li> <li>如果实例即包含 `LINUX_UNIX` 实例又包含 `WINDOWS` 实例，则密码复杂度限制按照 `WINDOWS` 实例的限制。</li>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 待重置密码的实例操作系统用户名。不得超过 64 个字符。 
     * @return UserName 待重置密码的实例操作系统用户名。不得超过 64 个字符。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 待重置密码的实例操作系统用户名。不得超过 64 个字符。
     * @param UserName 待重置密码的实例操作系统用户名。不得超过 64 个字符。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public ResetInstancesPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetInstancesPasswordRequest(ResetInstancesPasswordRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

