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
    * 复刻类型。
0 - 轻量版声音复刻（默认）;
5 - 一句话声音复刻。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 音色场景。（仅支持一句话声音复刻，其余复刻类型不生效） 
0 - 通用场景（默认）； 
1 - 聊天场景； 
2 - 阅读场景； 
3 - 资讯播报场景。
    */
    @SerializedName("Domain")
    @Expose
    private Long Domain;

    /**
    * 文本语种。（仅支持一句话声音复刻，其余复刻类型不生效） 
1 - 中文（默认）。
    */
    @SerializedName("TextLanguage")
    @Expose
    private Long TextLanguage;

    /**
     * Get 复刻类型。
0 - 轻量版声音复刻（默认）;
5 - 一句话声音复刻。 
     * @return TaskType 复刻类型。
0 - 轻量版声音复刻（默认）;
5 - 一句话声音复刻。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 复刻类型。
0 - 轻量版声音复刻（默认）;
5 - 一句话声音复刻。
     * @param TaskType 复刻类型。
0 - 轻量版声音复刻（默认）;
5 - 一句话声音复刻。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 音色场景。（仅支持一句话声音复刻，其余复刻类型不生效） 
0 - 通用场景（默认）； 
1 - 聊天场景； 
2 - 阅读场景； 
3 - 资讯播报场景。 
     * @return Domain 音色场景。（仅支持一句话声音复刻，其余复刻类型不生效） 
0 - 通用场景（默认）； 
1 - 聊天场景； 
2 - 阅读场景； 
3 - 资讯播报场景。
     */
    public Long getDomain() {
        return this.Domain;
    }

    /**
     * Set 音色场景。（仅支持一句话声音复刻，其余复刻类型不生效） 
0 - 通用场景（默认）； 
1 - 聊天场景； 
2 - 阅读场景； 
3 - 资讯播报场景。
     * @param Domain 音色场景。（仅支持一句话声音复刻，其余复刻类型不生效） 
0 - 通用场景（默认）； 
1 - 聊天场景； 
2 - 阅读场景； 
3 - 资讯播报场景。
     */
    public void setDomain(Long Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 文本语种。（仅支持一句话声音复刻，其余复刻类型不生效） 
1 - 中文（默认）。 
     * @return TextLanguage 文本语种。（仅支持一句话声音复刻，其余复刻类型不生效） 
1 - 中文（默认）。
     */
    public Long getTextLanguage() {
        return this.TextLanguage;
    }

    /**
     * Set 文本语种。（仅支持一句话声音复刻，其余复刻类型不生效） 
1 - 中文（默认）。
     * @param TextLanguage 文本语种。（仅支持一句话声音复刻，其余复刻类型不生效） 
1 - 中文（默认）。
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

