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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class URLPath extends AbstractModel {

    /**
    * 执行动作，取值有：
<li>follow：跟随请求；</li>
<li>custom：自定义；</li>
<li>regex：正则匹配。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 正则匹配的表达式，长度范围为 1～1024。<br>注意：当 Action 为 regex 时，此字段必填；当 Action 为 follow 或 custom 时，无需填写此字段，若填写则不生效。
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
    * 重定向的目标URL，长度范围为 1～1024。<br>注意：当 Action 为 regex 或 custom 时，此字段必填；当 Action 为 follow 时，无需填写此字段，若填写则不生效。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 执行动作，取值有：
<li>follow：跟随请求；</li>
<li>custom：自定义；</li>
<li>regex：正则匹配。</li> 
     * @return Action 执行动作，取值有：
<li>follow：跟随请求；</li>
<li>custom：自定义；</li>
<li>regex：正则匹配。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行动作，取值有：
<li>follow：跟随请求；</li>
<li>custom：自定义；</li>
<li>regex：正则匹配。</li>
     * @param Action 执行动作，取值有：
<li>follow：跟随请求；</li>
<li>custom：自定义；</li>
<li>regex：正则匹配。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 正则匹配的表达式，长度范围为 1～1024。<br>注意：当 Action 为 regex 时，此字段必填；当 Action 为 follow 或 custom 时，无需填写此字段，若填写则不生效。 
     * @return Regex 正则匹配的表达式，长度范围为 1～1024。<br>注意：当 Action 为 regex 时，此字段必填；当 Action 为 follow 或 custom 时，无需填写此字段，若填写则不生效。
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set 正则匹配的表达式，长度范围为 1～1024。<br>注意：当 Action 为 regex 时，此字段必填；当 Action 为 follow 或 custom 时，无需填写此字段，若填写则不生效。
     * @param Regex 正则匹配的表达式，长度范围为 1～1024。<br>注意：当 Action 为 regex 时，此字段必填；当 Action 为 follow 或 custom 时，无需填写此字段，若填写则不生效。
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    /**
     * Get 重定向的目标URL，长度范围为 1～1024。<br>注意：当 Action 为 regex 或 custom 时，此字段必填；当 Action 为 follow 时，无需填写此字段，若填写则不生效。 
     * @return Value 重定向的目标URL，长度范围为 1～1024。<br>注意：当 Action 为 regex 或 custom 时，此字段必填；当 Action 为 follow 时，无需填写此字段，若填写则不生效。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 重定向的目标URL，长度范围为 1～1024。<br>注意：当 Action 为 regex 或 custom 时，此字段必填；当 Action 为 follow 时，无需填写此字段，若填写则不生效。
     * @param Value 重定向的目标URL，长度范围为 1～1024。<br>注意：当 Action 为 regex 或 custom 时，此字段必填；当 Action 为 follow 时，无需填写此字段，若填写则不生效。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public URLPath() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public URLPath(URLPath source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

