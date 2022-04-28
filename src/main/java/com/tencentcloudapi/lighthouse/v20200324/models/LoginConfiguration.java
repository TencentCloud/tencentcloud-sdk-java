/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginConfiguration extends AbstractModel{

    /**
    * <li>"YES"代表选择自动生成密码，这时不指定Password字段。</li>
<li>"NO"代表选择自定义密码，这时要指定Password字段。</li>
    */
    @SerializedName("AutoGeneratePassword")
    @Expose
    private String AutoGeneratePassword;

    /**
    * 实例登录密码。具体按照操作系统的复杂度要求。
WINDOWS 实例密码必须 12-30 位，不能以“/”开头且不包括用户名，至少包含以下字符中的三种不同字符
<li>小写字母：[a-z]</li>
<li>大写字母：[A-Z]</li>
<li>数字： 0-9</li>
<li>特殊字符：()`~!@#$%^&*-+=_|{}[]:;' <>,.?/</li>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get <li>"YES"代表选择自动生成密码，这时不指定Password字段。</li>
<li>"NO"代表选择自定义密码，这时要指定Password字段。</li> 
     * @return AutoGeneratePassword <li>"YES"代表选择自动生成密码，这时不指定Password字段。</li>
<li>"NO"代表选择自定义密码，这时要指定Password字段。</li>
     */
    public String getAutoGeneratePassword() {
        return this.AutoGeneratePassword;
    }

    /**
     * Set <li>"YES"代表选择自动生成密码，这时不指定Password字段。</li>
<li>"NO"代表选择自定义密码，这时要指定Password字段。</li>
     * @param AutoGeneratePassword <li>"YES"代表选择自动生成密码，这时不指定Password字段。</li>
<li>"NO"代表选择自定义密码，这时要指定Password字段。</li>
     */
    public void setAutoGeneratePassword(String AutoGeneratePassword) {
        this.AutoGeneratePassword = AutoGeneratePassword;
    }

    /**
     * Get 实例登录密码。具体按照操作系统的复杂度要求。
WINDOWS 实例密码必须 12-30 位，不能以“/”开头且不包括用户名，至少包含以下字符中的三种不同字符
<li>小写字母：[a-z]</li>
<li>大写字母：[A-Z]</li>
<li>数字： 0-9</li>
<li>特殊字符：()`~!@#$%^&*-+=_|{}[]:;' <>,.?/</li> 
     * @return Password 实例登录密码。具体按照操作系统的复杂度要求。
WINDOWS 实例密码必须 12-30 位，不能以“/”开头且不包括用户名，至少包含以下字符中的三种不同字符
<li>小写字母：[a-z]</li>
<li>大写字母：[A-Z]</li>
<li>数字： 0-9</li>
<li>特殊字符：()`~!@#$%^&*-+=_|{}[]:;' <>,.?/</li>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 实例登录密码。具体按照操作系统的复杂度要求。
WINDOWS 实例密码必须 12-30 位，不能以“/”开头且不包括用户名，至少包含以下字符中的三种不同字符
<li>小写字母：[a-z]</li>
<li>大写字母：[A-Z]</li>
<li>数字： 0-9</li>
<li>特殊字符：()`~!@#$%^&*-+=_|{}[]:;' <>,.?/</li>
     * @param Password 实例登录密码。具体按照操作系统的复杂度要求。
WINDOWS 实例密码必须 12-30 位，不能以“/”开头且不包括用户名，至少包含以下字符中的三种不同字符
<li>小写字母：[a-z]</li>
<li>大写字母：[A-Z]</li>
<li>数字： 0-9</li>
<li>特殊字符：()`~!@#$%^&*-+=_|{}[]:;' <>,.?/</li>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public LoginConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginConfiguration(LoginConfiguration source) {
        if (source.AutoGeneratePassword != null) {
            this.AutoGeneratePassword = new String(source.AutoGeneratePassword);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoGeneratePassword", this.AutoGeneratePassword);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

