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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAgentApplicationRequest extends AbstractModel {

    /**
    * <p>应用名称</p><p>入参限制：</p><ul><li>不能为空字符串</li><li>不能包含字符<code>|</code></li><li>不能超过64字符</li></ul>
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * <p>接入类型</p><p>枚举值：</p><ul><li>Langfuse： Langfuse 是一款开源的 LLM（大语言模型）工程与可观测性平台（LLMOps Tool）</li></ul>
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
     * Get <p>应用名称</p><p>入参限制：</p><ul><li>不能为空字符串</li><li>不能包含字符<code>|</code></li><li>不能超过64字符</li></ul> 
     * @return ApplicationName <p>应用名称</p><p>入参限制：</p><ul><li>不能为空字符串</li><li>不能包含字符<code>|</code></li><li>不能超过64字符</li></ul>
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>应用名称</p><p>入参限制：</p><ul><li>不能为空字符串</li><li>不能包含字符<code>|</code></li><li>不能超过64字符</li></ul>
     * @param ApplicationName <p>应用名称</p><p>入参限制：</p><ul><li>不能为空字符串</li><li>不能包含字符<code>|</code></li><li>不能超过64字符</li></ul>
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get <p>接入类型</p><p>枚举值：</p><ul><li>Langfuse： Langfuse 是一款开源的 LLM（大语言模型）工程与可观测性平台（LLMOps Tool）</li></ul> 
     * @return AccessType <p>接入类型</p><p>枚举值：</p><ul><li>Langfuse： Langfuse 是一款开源的 LLM（大语言模型）工程与可观测性平台（LLMOps Tool）</li></ul>
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>接入类型</p><p>枚举值：</p><ul><li>Langfuse： Langfuse 是一款开源的 LLM（大语言模型）工程与可观测性平台（LLMOps Tool）</li></ul>
     * @param AccessType <p>接入类型</p><p>枚举值：</p><ul><li>Langfuse： Langfuse 是一款开源的 LLM（大语言模型）工程与可观测性平台（LLMOps Tool）</li></ul>
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p> 
     * @return LogsetId <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p>
     * @param LogsetId <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    public CreateAgentApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAgentApplicationRequest(CreateAgentApplicationRequest source) {
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);

    }
}

