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

public class UsageSeries extends AbstractModel {

    /**
    * <p>[tokens 族]总 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[12,null,15]&quot;</code>。</p>
    */
    @SerializedName("TotalToken")
    @Expose
    private String TotalToken;

    /**
    * <p>[tokens 族]输入 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[7,null,9]&quot;</code>。</p>
    */
    @SerializedName("InputTotalToken")
    @Expose
    private String InputTotalToken;

    /**
    * <p>[tokens 族]输出 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[5,null,6]&quot;</code>。</p>
    */
    @SerializedName("OutputTotalToken")
    @Expose
    private String OutputTotalToken;

    /**
    * <p>[tokens 族]读缓存 token 数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p>
    */
    @SerializedName("CacheTotalToken")
    @Expose
    private String CacheTotalToken;

    /**
    * <p>[search 族] 搜索请求数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p>
    */
    @SerializedName("SearchRequestCount")
    @Expose
    private String SearchRequestCount;

    /**
    * <p>[search 族] 搜索引擎调用次数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p>
    */
    @SerializedName("SearchCount")
    @Expose
    private String SearchCount;

    /**
     * Get <p>[tokens 族]总 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[12,null,15]&quot;</code>。</p> 
     * @return TotalToken <p>[tokens 族]总 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[12,null,15]&quot;</code>。</p>
     */
    public String getTotalToken() {
        return this.TotalToken;
    }

    /**
     * Set <p>[tokens 族]总 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[12,null,15]&quot;</code>。</p>
     * @param TotalToken <p>[tokens 族]总 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[12,null,15]&quot;</code>。</p>
     */
    public void setTotalToken(String TotalToken) {
        this.TotalToken = TotalToken;
    }

    /**
     * Get <p>[tokens 族]输入 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[7,null,9]&quot;</code>。</p> 
     * @return InputTotalToken <p>[tokens 族]输入 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[7,null,9]&quot;</code>。</p>
     */
    public String getInputTotalToken() {
        return this.InputTotalToken;
    }

    /**
     * Set <p>[tokens 族]输入 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[7,null,9]&quot;</code>。</p>
     * @param InputTotalToken <p>[tokens 族]输入 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[7,null,9]&quot;</code>。</p>
     */
    public void setInputTotalToken(String InputTotalToken) {
        this.InputTotalToken = InputTotalToken;
    }

    /**
     * Get <p>[tokens 族]输出 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[5,null,6]&quot;</code>。</p> 
     * @return OutputTotalToken <p>[tokens 族]输出 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[5,null,6]&quot;</code>。</p>
     */
    public String getOutputTotalToken() {
        return this.OutputTotalToken;
    }

    /**
     * Set <p>[tokens 族]输出 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[5,null,6]&quot;</code>。</p>
     * @param OutputTotalToken <p>[tokens 族]输出 token 数用量时间周期内的 JSON 字符串形式，如 <code>&quot;[5,null,6]&quot;</code>。</p>
     */
    public void setOutputTotalToken(String OutputTotalToken) {
        this.OutputTotalToken = OutputTotalToken;
    }

    /**
     * Get <p>[tokens 族]读缓存 token 数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p> 
     * @return CacheTotalToken <p>[tokens 族]读缓存 token 数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p>
     */
    public String getCacheTotalToken() {
        return this.CacheTotalToken;
    }

    /**
     * Set <p>[tokens 族]读缓存 token 数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p>
     * @param CacheTotalToken <p>[tokens 族]读缓存 token 数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p>
     */
    public void setCacheTotalToken(String CacheTotalToken) {
        this.CacheTotalToken = CacheTotalToken;
    }

    /**
     * Get <p>[search 族] 搜索请求数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p> 
     * @return SearchRequestCount <p>[search 族] 搜索请求数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p>
     */
    public String getSearchRequestCount() {
        return this.SearchRequestCount;
    }

    /**
     * Set <p>[search 族] 搜索请求数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p>
     * @param SearchRequestCount <p>[search 族] 搜索请求数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p>
     */
    public void setSearchRequestCount(String SearchRequestCount) {
        this.SearchRequestCount = SearchRequestCount;
    }

    /**
     * Get <p>[search 族] 搜索引擎调用次数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p> 
     * @return SearchCount <p>[search 族] 搜索引擎调用次数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p>
     */
    public String getSearchCount() {
        return this.SearchCount;
    }

    /**
     * Set <p>[search 族] 搜索引擎调用次数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p>
     * @param SearchCount <p>[search 族] 搜索引擎调用次数用量时间周期内的 JSON 字符串形式，如<code>&quot;[5,null,6]&quot;</code>。</p>
     */
    public void setSearchCount(String SearchCount) {
        this.SearchCount = SearchCount;
    }

    public UsageSeries() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageSeries(UsageSeries source) {
        if (source.TotalToken != null) {
            this.TotalToken = new String(source.TotalToken);
        }
        if (source.InputTotalToken != null) {
            this.InputTotalToken = new String(source.InputTotalToken);
        }
        if (source.OutputTotalToken != null) {
            this.OutputTotalToken = new String(source.OutputTotalToken);
        }
        if (source.CacheTotalToken != null) {
            this.CacheTotalToken = new String(source.CacheTotalToken);
        }
        if (source.SearchRequestCount != null) {
            this.SearchRequestCount = new String(source.SearchRequestCount);
        }
        if (source.SearchCount != null) {
            this.SearchCount = new String(source.SearchCount);
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

