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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Usage extends AbstractModel {

    /**
    * 文档页数
    */
    @SerializedName("TotalPages")
    @Expose
    private Long TotalPages;

    /**
    * 输入token数
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * 输出token数
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * 总token数
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get 文档页数 
     * @return TotalPages 文档页数
     */
    public Long getTotalPages() {
        return this.TotalPages;
    }

    /**
     * Set 文档页数
     * @param TotalPages 文档页数
     */
    public void setTotalPages(Long TotalPages) {
        this.TotalPages = TotalPages;
    }

    /**
     * Get 输入token数 
     * @return InputTokens 输入token数
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set 输入token数
     * @param InputTokens 输入token数
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get 输出token数 
     * @return OutputTokens 输出token数
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set 输出token数
     * @param OutputTokens 输出token数
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get 总token数 
     * @return TotalTokens 总token数
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set 总token数
     * @param TotalTokens 总token数
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
        if (source.TotalPages != null) {
            this.TotalPages = new Long(source.TotalPages);
        }
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.OutputTokens != null) {
            this.OutputTokens = new Long(source.OutputTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalPages", this.TotalPages);
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

