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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpstreamURLRewriteParameters extends AbstractModel {

    /**
    * 回源 URL 重写类型。仅支持填写 Path。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 回源 URL 重写动作。取值有：
<li><b>replace</b>：指替换完整路径。用于将完整的请求 URL Path 替换为指定路径。
</li>
<li><b>addPrefix</b>：指增加路径前缀。用于增加指定路径前缀至请求 URL Path。
</li>
<li><b>rmvPrefix</b>：指移除路径前缀。用于移除请求 URL Path 的指定路径前缀。
</li>
<li><b>regexReplace</b>：指正则替换完整路径。用于通过 Google RE2 正则表达式匹配和替换完整路径。
</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 回源 URL 重写值。需要满足 URL Path 规范，且保证重写后的 Path 以 / 开头，以防止回源 URL 的 Host 被修改，长度范围为 1～1024。当 Action 为 addPrefix 时，不能以 / 结尾；当 Action 为 rmvPrefix 时，不能存在 *；当 Action 为 regexReplace 时，支持用 $NUM 引用正则捕获组，其中 NUM 代表组编号，如 $1，最多支持 $9。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 回源 URL 重写用于正则替换匹配完整路径的正则表达式。需要满足 Google RE2 规范，长度范围为 1～1024。当 Action 为 regexReplace 时，此字段必填，否则无需填写此字段。
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
     * Get 回源 URL 重写类型。仅支持填写 Path。 
     * @return Type 回源 URL 重写类型。仅支持填写 Path。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 回源 URL 重写类型。仅支持填写 Path。
     * @param Type 回源 URL 重写类型。仅支持填写 Path。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 回源 URL 重写动作。取值有：
<li><b>replace</b>：指替换完整路径。用于将完整的请求 URL Path 替换为指定路径。
</li>
<li><b>addPrefix</b>：指增加路径前缀。用于增加指定路径前缀至请求 URL Path。
</li>
<li><b>rmvPrefix</b>：指移除路径前缀。用于移除请求 URL Path 的指定路径前缀。
</li>
<li><b>regexReplace</b>：指正则替换完整路径。用于通过 Google RE2 正则表达式匹配和替换完整路径。
</li> 
     * @return Action 回源 URL 重写动作。取值有：
<li><b>replace</b>：指替换完整路径。用于将完整的请求 URL Path 替换为指定路径。
</li>
<li><b>addPrefix</b>：指增加路径前缀。用于增加指定路径前缀至请求 URL Path。
</li>
<li><b>rmvPrefix</b>：指移除路径前缀。用于移除请求 URL Path 的指定路径前缀。
</li>
<li><b>regexReplace</b>：指正则替换完整路径。用于通过 Google RE2 正则表达式匹配和替换完整路径。
</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 回源 URL 重写动作。取值有：
<li><b>replace</b>：指替换完整路径。用于将完整的请求 URL Path 替换为指定路径。
</li>
<li><b>addPrefix</b>：指增加路径前缀。用于增加指定路径前缀至请求 URL Path。
</li>
<li><b>rmvPrefix</b>：指移除路径前缀。用于移除请求 URL Path 的指定路径前缀。
</li>
<li><b>regexReplace</b>：指正则替换完整路径。用于通过 Google RE2 正则表达式匹配和替换完整路径。
</li>
     * @param Action 回源 URL 重写动作。取值有：
<li><b>replace</b>：指替换完整路径。用于将完整的请求 URL Path 替换为指定路径。
</li>
<li><b>addPrefix</b>：指增加路径前缀。用于增加指定路径前缀至请求 URL Path。
</li>
<li><b>rmvPrefix</b>：指移除路径前缀。用于移除请求 URL Path 的指定路径前缀。
</li>
<li><b>regexReplace</b>：指正则替换完整路径。用于通过 Google RE2 正则表达式匹配和替换完整路径。
</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 回源 URL 重写值。需要满足 URL Path 规范，且保证重写后的 Path 以 / 开头，以防止回源 URL 的 Host 被修改，长度范围为 1～1024。当 Action 为 addPrefix 时，不能以 / 结尾；当 Action 为 rmvPrefix 时，不能存在 *；当 Action 为 regexReplace 时，支持用 $NUM 引用正则捕获组，其中 NUM 代表组编号，如 $1，最多支持 $9。 
     * @return Value 回源 URL 重写值。需要满足 URL Path 规范，且保证重写后的 Path 以 / 开头，以防止回源 URL 的 Host 被修改，长度范围为 1～1024。当 Action 为 addPrefix 时，不能以 / 结尾；当 Action 为 rmvPrefix 时，不能存在 *；当 Action 为 regexReplace 时，支持用 $NUM 引用正则捕获组，其中 NUM 代表组编号，如 $1，最多支持 $9。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 回源 URL 重写值。需要满足 URL Path 规范，且保证重写后的 Path 以 / 开头，以防止回源 URL 的 Host 被修改，长度范围为 1～1024。当 Action 为 addPrefix 时，不能以 / 结尾；当 Action 为 rmvPrefix 时，不能存在 *；当 Action 为 regexReplace 时，支持用 $NUM 引用正则捕获组，其中 NUM 代表组编号，如 $1，最多支持 $9。
     * @param Value 回源 URL 重写值。需要满足 URL Path 规范，且保证重写后的 Path 以 / 开头，以防止回源 URL 的 Host 被修改，长度范围为 1～1024。当 Action 为 addPrefix 时，不能以 / 结尾；当 Action 为 rmvPrefix 时，不能存在 *；当 Action 为 regexReplace 时，支持用 $NUM 引用正则捕获组，其中 NUM 代表组编号，如 $1，最多支持 $9。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 回源 URL 重写用于正则替换匹配完整路径的正则表达式。需要满足 Google RE2 规范，长度范围为 1～1024。当 Action 为 regexReplace 时，此字段必填，否则无需填写此字段。 
     * @return Regex 回源 URL 重写用于正则替换匹配完整路径的正则表达式。需要满足 Google RE2 规范，长度范围为 1～1024。当 Action 为 regexReplace 时，此字段必填，否则无需填写此字段。
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set 回源 URL 重写用于正则替换匹配完整路径的正则表达式。需要满足 Google RE2 规范，长度范围为 1～1024。当 Action 为 regexReplace 时，此字段必填，否则无需填写此字段。
     * @param Regex 回源 URL 重写用于正则替换匹配完整路径的正则表达式。需要满足 Google RE2 规范，长度范围为 1～1024。当 Action 为 regexReplace 时，此字段必填，否则无需填写此字段。
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    public UpstreamURLRewriteParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamURLRewriteParameters(UpstreamURLRewriteParameters source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Regex", this.Regex);

    }
}

