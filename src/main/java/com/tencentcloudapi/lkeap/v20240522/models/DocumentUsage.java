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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocumentUsage extends AbstractModel {

    /**
    * 文档拆分任务的页数
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 文档拆分任务消耗的总token数
    */
    @SerializedName("TotalToken")
    @Expose
    private Long TotalToken;

    /**
    * 文档拆分任务消耗的总token数
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * 拆分消耗的token数
    */
    @SerializedName("SplitTokens")
    @Expose
    private Long SplitTokens;

    /**
    * mllm消耗的token数
    */
    @SerializedName("MllmTokens")
    @Expose
    private Long MllmTokens;

    /**
     * Get 文档拆分任务的页数 
     * @return PageNumber 文档拆分任务的页数
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 文档拆分任务的页数
     * @param PageNumber 文档拆分任务的页数
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 文档拆分任务消耗的总token数 
     * @return TotalToken 文档拆分任务消耗的总token数
     * @deprecated
     */
    @Deprecated
    public Long getTotalToken() {
        return this.TotalToken;
    }

    /**
     * Set 文档拆分任务消耗的总token数
     * @param TotalToken 文档拆分任务消耗的总token数
     * @deprecated
     */
    @Deprecated
    public void setTotalToken(Long TotalToken) {
        this.TotalToken = TotalToken;
    }

    /**
     * Get 文档拆分任务消耗的总token数 
     * @return TotalTokens 文档拆分任务消耗的总token数
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set 文档拆分任务消耗的总token数
     * @param TotalTokens 文档拆分任务消耗的总token数
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get 拆分消耗的token数 
     * @return SplitTokens 拆分消耗的token数
     */
    public Long getSplitTokens() {
        return this.SplitTokens;
    }

    /**
     * Set 拆分消耗的token数
     * @param SplitTokens 拆分消耗的token数
     */
    public void setSplitTokens(Long SplitTokens) {
        this.SplitTokens = SplitTokens;
    }

    /**
     * Get mllm消耗的token数 
     * @return MllmTokens mllm消耗的token数
     */
    public Long getMllmTokens() {
        return this.MllmTokens;
    }

    /**
     * Set mllm消耗的token数
     * @param MllmTokens mllm消耗的token数
     */
    public void setMllmTokens(Long MllmTokens) {
        this.MllmTokens = MllmTokens;
    }

    public DocumentUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocumentUsage(DocumentUsage source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.TotalToken != null) {
            this.TotalToken = new Long(source.TotalToken);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
        if (source.SplitTokens != null) {
            this.SplitTokens = new Long(source.SplitTokens);
        }
        if (source.MllmTokens != null) {
            this.MllmTokens = new Long(source.MllmTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "TotalToken", this.TotalToken);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamSimple(map, prefix + "SplitTokens", this.SplitTokens);
        this.setParamSimple(map, prefix + "MllmTokens", this.MllmTokens);

    }
}

