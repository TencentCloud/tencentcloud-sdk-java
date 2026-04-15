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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiPrompt extends AbstractModel {

    /**
    * <p>分镜序号</p>
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * <p>分镜提示词</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>时长</p>
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
     * Get <p>分镜序号</p> 
     * @return Index <p>分镜序号</p>
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>分镜序号</p>
     * @param Index <p>分镜序号</p>
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get <p>分镜提示词</p> 
     * @return Prompt <p>分镜提示词</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>分镜提示词</p>
     * @param Prompt <p>分镜提示词</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>时长</p> 
     * @return Duration <p>时长</p>
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>时长</p>
     * @param Duration <p>时长</p>
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public MultiPrompt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiPrompt(MultiPrompt source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

