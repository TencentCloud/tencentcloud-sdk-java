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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetPGAccountPasswordRequest extends AbstractModel {

    /**
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>要设置的密码</p><p>入参限制：长度8 ~ 32位，不能以&quot; / &quot;开头; 必须包含以下四项，字符种类:  小写字母： [a ~ z] 大写字母：[A ～ Z] 数字：0 - 9 特殊字符：()~!@#$%^&amp;*-+=_|{}[]:&lt;&gt;,.?/` 示例值：A8b!C2d#E4f&amp;</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get <p>环境ID</p> 
     * @return EnvId <p>环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID</p>
     * @param EnvId <p>环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>要设置的密码</p><p>入参限制：长度8 ~ 32位，不能以&quot; / &quot;开头; 必须包含以下四项，字符种类:  小写字母： [a ~ z] 大写字母：[A ～ Z] 数字：0 - 9 特殊字符：()~!@#$%^&amp;*-+=_|{}[]:&lt;&gt;,.?/` 示例值：A8b!C2d#E4f&amp;</p> 
     * @return Password <p>要设置的密码</p><p>入参限制：长度8 ~ 32位，不能以&quot; / &quot;开头; 必须包含以下四项，字符种类:  小写字母： [a ~ z] 大写字母：[A ～ Z] 数字：0 - 9 特殊字符：()~!@#$%^&amp;*-+=_|{}[]:&lt;&gt;,.?/` 示例值：A8b!C2d#E4f&amp;</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>要设置的密码</p><p>入参限制：长度8 ~ 32位，不能以&quot; / &quot;开头; 必须包含以下四项，字符种类:  小写字母： [a ~ z] 大写字母：[A ～ Z] 数字：0 - 9 特殊字符：()~!@#$%^&amp;*-+=_|{}[]:&lt;&gt;,.?/` 示例值：A8b!C2d#E4f&amp;</p>
     * @param Password <p>要设置的密码</p><p>入参限制：长度8 ~ 32位，不能以&quot; / &quot;开头; 必须包含以下四项，字符种类:  小写字母： [a ~ z] 大写字母：[A ～ Z] 数字：0 - 9 特殊字符：()~!@#$%^&amp;*-+=_|{}[]:&lt;&gt;,.?/` 示例值：A8b!C2d#E4f&amp;</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ResetPGAccountPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetPGAccountPasswordRequest(ResetPGAccountPasswordRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

