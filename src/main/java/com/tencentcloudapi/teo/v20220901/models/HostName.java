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

public class HostName extends AbstractModel {

    /**
    * 目标 HostName 配置，取值有：
<li>follow：跟随请求；</li>
<li>custom：自定义。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 目标 HostName 自定义取值，最大长度 1024。<br>注意：当 Action 为 custom 时，此字段必填；当 Action 为 follow 时，此字段不生效。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 目标 HostName 配置，取值有：
<li>follow：跟随请求；</li>
<li>custom：自定义。</li> 
     * @return Action 目标 HostName 配置，取值有：
<li>follow：跟随请求；</li>
<li>custom：自定义。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 目标 HostName 配置，取值有：
<li>follow：跟随请求；</li>
<li>custom：自定义。</li>
     * @param Action 目标 HostName 配置，取值有：
<li>follow：跟随请求；</li>
<li>custom：自定义。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 目标 HostName 自定义取值，最大长度 1024。<br>注意：当 Action 为 custom 时，此字段必填；当 Action 为 follow 时，此字段不生效。 
     * @return Value 目标 HostName 自定义取值，最大长度 1024。<br>注意：当 Action 为 custom 时，此字段必填；当 Action 为 follow 时，此字段不生效。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 目标 HostName 自定义取值，最大长度 1024。<br>注意：当 Action 为 custom 时，此字段必填；当 Action 为 follow 时，此字段不生效。
     * @param Value 目标 HostName 自定义取值，最大长度 1024。<br>注意：当 Action 为 custom 时，此字段必填；当 Action 为 follow 时，此字段不生效。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public HostName() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostName(HostName source) {
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
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

