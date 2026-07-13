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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcVideoTaskUsage extends AbstractModel {

    /**
    * <p>输入 Token 数目。</p>
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>思考产生的 Token 数目。</p>
    */
    @SerializedName("ThoughtTokens")
    @Expose
    private Long ThoughtTokens;

    /**
     * Get <p>输入 Token 数目。</p> 
     * @return InputTokens <p>输入 Token 数目。</p>
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>输入 Token 数目。</p>
     * @param InputTokens <p>输入 Token 数目。</p>
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>思考产生的 Token 数目。</p> 
     * @return ThoughtTokens <p>思考产生的 Token 数目。</p>
     */
    public Long getThoughtTokens() {
        return this.ThoughtTokens;
    }

    /**
     * Set <p>思考产生的 Token 数目。</p>
     * @param ThoughtTokens <p>思考产生的 Token 数目。</p>
     */
    public void setThoughtTokens(Long ThoughtTokens) {
        this.ThoughtTokens = ThoughtTokens;
    }

    public AigcVideoTaskUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskUsage(AigcVideoTaskUsage source) {
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.ThoughtTokens != null) {
            this.ThoughtTokens = new Long(source.ThoughtTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "ThoughtTokens", this.ThoughtTokens);

    }
}

