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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageStats extends AbstractModel {

    /**
    * <p>[tokens 族] 时间周期内的累计总 token 数。</p>
    */
    @SerializedName("TotalToken")
    @Expose
    private Long TotalToken;

    /**
    * <p>[tokens 族] 时间周期内的累计输入 token 数。</p>
    */
    @SerializedName("InputTotalToken")
    @Expose
    private Long InputTotalToken;

    /**
    * <p>[tokens 族] 时间周期内的累计输出 token 数。</p>
    */
    @SerializedName("OutputTotalToken")
    @Expose
    private Long OutputTotalToken;

    /**
    * <p>[tokens 族] 时间周期内的累计读缓存 token 数（命中缓存部分）</p>
    */
    @SerializedName("CacheTotalToken")
    @Expose
    private Long CacheTotalToken;

    /**
    * <p>[search 族] 整段累计联网搜索请求数</p>
    */
    @SerializedName("SearchRequestCount")
    @Expose
    private Long SearchRequestCount;

    /**
    * <p>[search 族] 整段累计搜索引擎调用次数</p>
    */
    @SerializedName("SearchCount")
    @Expose
    private Long SearchCount;

    /**
     * Get <p>[tokens 族] 时间周期内的累计总 token 数。</p> 
     * @return TotalToken <p>[tokens 族] 时间周期内的累计总 token 数。</p>
     */
    public Long getTotalToken() {
        return this.TotalToken;
    }

    /**
     * Set <p>[tokens 族] 时间周期内的累计总 token 数。</p>
     * @param TotalToken <p>[tokens 族] 时间周期内的累计总 token 数。</p>
     */
    public void setTotalToken(Long TotalToken) {
        this.TotalToken = TotalToken;
    }

    /**
     * Get <p>[tokens 族] 时间周期内的累计输入 token 数。</p> 
     * @return InputTotalToken <p>[tokens 族] 时间周期内的累计输入 token 数。</p>
     */
    public Long getInputTotalToken() {
        return this.InputTotalToken;
    }

    /**
     * Set <p>[tokens 族] 时间周期内的累计输入 token 数。</p>
     * @param InputTotalToken <p>[tokens 族] 时间周期内的累计输入 token 数。</p>
     */
    public void setInputTotalToken(Long InputTotalToken) {
        this.InputTotalToken = InputTotalToken;
    }

    /**
     * Get <p>[tokens 族] 时间周期内的累计输出 token 数。</p> 
     * @return OutputTotalToken <p>[tokens 族] 时间周期内的累计输出 token 数。</p>
     */
    public Long getOutputTotalToken() {
        return this.OutputTotalToken;
    }

    /**
     * Set <p>[tokens 族] 时间周期内的累计输出 token 数。</p>
     * @param OutputTotalToken <p>[tokens 族] 时间周期内的累计输出 token 数。</p>
     */
    public void setOutputTotalToken(Long OutputTotalToken) {
        this.OutputTotalToken = OutputTotalToken;
    }

    /**
     * Get <p>[tokens 族] 时间周期内的累计读缓存 token 数（命中缓存部分）</p> 
     * @return CacheTotalToken <p>[tokens 族] 时间周期内的累计读缓存 token 数（命中缓存部分）</p>
     */
    public Long getCacheTotalToken() {
        return this.CacheTotalToken;
    }

    /**
     * Set <p>[tokens 族] 时间周期内的累计读缓存 token 数（命中缓存部分）</p>
     * @param CacheTotalToken <p>[tokens 族] 时间周期内的累计读缓存 token 数（命中缓存部分）</p>
     */
    public void setCacheTotalToken(Long CacheTotalToken) {
        this.CacheTotalToken = CacheTotalToken;
    }

    /**
     * Get <p>[search 族] 整段累计联网搜索请求数</p> 
     * @return SearchRequestCount <p>[search 族] 整段累计联网搜索请求数</p>
     */
    public Long getSearchRequestCount() {
        return this.SearchRequestCount;
    }

    /**
     * Set <p>[search 族] 整段累计联网搜索请求数</p>
     * @param SearchRequestCount <p>[search 族] 整段累计联网搜索请求数</p>
     */
    public void setSearchRequestCount(Long SearchRequestCount) {
        this.SearchRequestCount = SearchRequestCount;
    }

    /**
     * Get <p>[search 族] 整段累计搜索引擎调用次数</p> 
     * @return SearchCount <p>[search 族] 整段累计搜索引擎调用次数</p>
     */
    public Long getSearchCount() {
        return this.SearchCount;
    }

    /**
     * Set <p>[search 族] 整段累计搜索引擎调用次数</p>
     * @param SearchCount <p>[search 族] 整段累计搜索引擎调用次数</p>
     */
    public void setSearchCount(Long SearchCount) {
        this.SearchCount = SearchCount;
    }

    public UsageStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageStats(UsageStats source) {
        if (source.TotalToken != null) {
            this.TotalToken = new Long(source.TotalToken);
        }
        if (source.InputTotalToken != null) {
            this.InputTotalToken = new Long(source.InputTotalToken);
        }
        if (source.OutputTotalToken != null) {
            this.OutputTotalToken = new Long(source.OutputTotalToken);
        }
        if (source.CacheTotalToken != null) {
            this.CacheTotalToken = new Long(source.CacheTotalToken);
        }
        if (source.SearchRequestCount != null) {
            this.SearchRequestCount = new Long(source.SearchRequestCount);
        }
        if (source.SearchCount != null) {
            this.SearchCount = new Long(source.SearchCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalToken", this.TotalToken);
        this.setParamSimple(map, prefix + "InputTotalToken", this.InputTotalToken);
        this.setParamSimple(map, prefix + "OutputTotalToken", this.OutputTotalToken);
        this.setParamSimple(map, prefix + "CacheTotalToken", this.CacheTotalToken);
        this.setParamSimple(map, prefix + "SearchRequestCount", this.SearchRequestCount);
        this.setParamSimple(map, prefix + "SearchCount", this.SearchCount);

    }
}

