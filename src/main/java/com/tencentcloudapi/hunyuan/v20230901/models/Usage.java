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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Usage extends AbstractModel {

    /**
    * 输入 Token 数量。
    */
    @SerializedName("PromptTokens")
    @Expose
    private Long PromptTokens;

    /**
    * 输出 Token 数量。
    */
    @SerializedName("CompletionTokens")
    @Expose
    private Long CompletionTokens;

    /**
    * 总 Token 数量。
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get 输入 Token 数量。 
     * @return PromptTokens 输入 Token 数量。
     */
    public Long getPromptTokens() {
        return this.PromptTokens;
    }

    /**
     * Set 输入 Token 数量。
     * @param PromptTokens 输入 Token 数量。
     */
    public void setPromptTokens(Long PromptTokens) {
        this.PromptTokens = PromptTokens;
    }

    /**
     * Get 输出 Token 数量。 
     * @return CompletionTokens 输出 Token 数量。
     */
    public Long getCompletionTokens() {
        return this.CompletionTokens;
    }

    /**
     * Set 输出 Token 数量。
     * @param CompletionTokens 输出 Token 数量。
     */
    public void setCompletionTokens(Long CompletionTokens) {
        this.CompletionTokens = CompletionTokens;
    }

    /**
     * Get 总 Token 数量。 
     * @return TotalTokens 总 Token 数量。
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set 总 Token 数量。
     * @param TotalTokens 总 Token 数量。
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public Usage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Usage(Usage source) {
        if (source.PromptTokens != null) {
            this.PromptTokens = new Long(source.PromptTokens);
        }
        if (source.CompletionTokens != null) {
            this.CompletionTokens = new Long(source.CompletionTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PromptTokens", this.PromptTokens);
        this.setParamSimple(map, prefix + "CompletionTokens", this.CompletionTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

