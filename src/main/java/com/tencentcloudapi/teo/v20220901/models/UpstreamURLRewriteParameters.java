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

public class UpstreamURLRewriteParameters extends AbstractModel {

    /**
    * 回源 URL 重写类型，仅支持填写 Path。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 回源 URL 重写动作。取值有：
<li>replace：替换路径前缀；</li>
<li>addPrefix：增加路径前缀；</li>
<li>rmvPrefix：移除路径前缀。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 回源 URL 重写值，最大长度 1024，必须以 / 开头。<br>注意：当 Action 为 addPrefix 时，不能以 / 结尾；当 Action 为 rmvPrefix 时，不能存在 *。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 回源 URL 重写类型，仅支持填写 Path。 
     * @return Type 回源 URL 重写类型，仅支持填写 Path。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 回源 URL 重写类型，仅支持填写 Path。
     * @param Type 回源 URL 重写类型，仅支持填写 Path。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 回源 URL 重写动作。取值有：
<li>replace：替换路径前缀；</li>
<li>addPrefix：增加路径前缀；</li>
<li>rmvPrefix：移除路径前缀。</li> 
     * @return Action 回源 URL 重写动作。取值有：
<li>replace：替换路径前缀；</li>
<li>addPrefix：增加路径前缀；</li>
<li>rmvPrefix：移除路径前缀。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 回源 URL 重写动作。取值有：
<li>replace：替换路径前缀；</li>
<li>addPrefix：增加路径前缀；</li>
<li>rmvPrefix：移除路径前缀。</li>
     * @param Action 回源 URL 重写动作。取值有：
<li>replace：替换路径前缀；</li>
<li>addPrefix：增加路径前缀；</li>
<li>rmvPrefix：移除路径前缀。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 回源 URL 重写值，最大长度 1024，必须以 / 开头。<br>注意：当 Action 为 addPrefix 时，不能以 / 结尾；当 Action 为 rmvPrefix 时，不能存在 *。 
     * @return Value 回源 URL 重写值，最大长度 1024，必须以 / 开头。<br>注意：当 Action 为 addPrefix 时，不能以 / 结尾；当 Action 为 rmvPrefix 时，不能存在 *。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 回源 URL 重写值，最大长度 1024，必须以 / 开头。<br>注意：当 Action 为 addPrefix 时，不能以 / 结尾；当 Action 为 rmvPrefix 时，不能存在 *。
     * @param Value 回源 URL 重写值，最大长度 1024，必须以 / 开头。<br>注意：当 Action 为 addPrefix 时，不能以 / 结尾；当 Action 为 rmvPrefix 时，不能存在 *。
     */
    public void setValue(String Value) {
        this.Value = Value;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

