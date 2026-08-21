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
package com.tencentcloudapi.vrs.v20200824.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTrainingTextRequest extends AbstractModel {

    /**
    * <p>复刻类型。<br>5 - 一句话声音复刻。</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>音色场景。（仅支持一句话声音复刻，其余复刻类型不生效）<br>0 - 通用场景（默认）；<br>1 - 聊天场景；<br>2 - 阅读场景；<br>3 - 资讯播报场景。</p>
    */
    @SerializedName("Domain")
    @Expose
    private Long Domain;

    /**
    * <p>文本语种。（仅支持一句话声音复刻，其余复刻类型不生效）<br>1 - 中文（默认）。</p>
    */
    @SerializedName("TextLanguage")
    @Expose
    private Long TextLanguage;

    /**
     * Get <p>复刻类型。<br>5 - 一句话声音复刻。</p> 
     * @return TaskType <p>复刻类型。<br>5 - 一句话声音复刻。</p>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>复刻类型。<br>5 - 一句话声音复刻。</p>
     * @param TaskType <p>复刻类型。<br>5 - 一句话声音复刻。</p>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>音色场景。（仅支持一句话声音复刻，其余复刻类型不生效）<br>0 - 通用场景（默认）；<br>1 - 聊天场景；<br>2 - 阅读场景；<br>3 - 资讯播报场景。</p> 
     * @return Domain <p>音色场景。（仅支持一句话声音复刻，其余复刻类型不生效）<br>0 - 通用场景（默认）；<br>1 - 聊天场景；<br>2 - 阅读场景；<br>3 - 资讯播报场景。</p>
     */
    public Long getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>音色场景。（仅支持一句话声音复刻，其余复刻类型不生效）<br>0 - 通用场景（默认）；<br>1 - 聊天场景；<br>2 - 阅读场景；<br>3 - 资讯播报场景。</p>
     * @param Domain <p>音色场景。（仅支持一句话声音复刻，其余复刻类型不生效）<br>0 - 通用场景（默认）；<br>1 - 聊天场景；<br>2 - 阅读场景；<br>3 - 资讯播报场景。</p>
     */
    public void setDomain(Long Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>文本语种。（仅支持一句话声音复刻，其余复刻类型不生效）<br>1 - 中文（默认）。</p> 
     * @return TextLanguage <p>文本语种。（仅支持一句话声音复刻，其余复刻类型不生效）<br>1 - 中文（默认）。</p>
     */
    public Long getTextLanguage() {
        return this.TextLanguage;
    }

    /**
     * Set <p>文本语种。（仅支持一句话声音复刻，其余复刻类型不生效）<br>1 - 中文（默认）。</p>
     * @param TextLanguage <p>文本语种。（仅支持一句话声音复刻，其余复刻类型不生效）<br>1 - 中文（默认）。</p>
     */
    public void setTextLanguage(Long TextLanguage) {
        this.TextLanguage = TextLanguage;
    }

    public GetTrainingTextRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTrainingTextRequest(GetTrainingTextRequest source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.Domain != null) {
            this.Domain = new Long(source.Domain);
        }
        if (source.TextLanguage != null) {
            this.TextLanguage = new Long(source.TextLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "TextLanguage", this.TextLanguage);

    }
}

