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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeAISearchServiceRequest extends AbstractModel {

    /**
    * <p>产品ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>自然语言查询</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH</p>
    */
    @SerializedName("SummaryLang")
    @Expose
    private String SummaryLang;

    /**
    * <p>通道ID</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * <p>是否需要返回总结，默认为True；  开启后会加大接口响应时长</p>
    */
    @SerializedName("EnableSummary")
    @Expose
    private Boolean EnableSummary;

    /**
    * <p>开始时间。</p><p>注：</p><ol><li>单位为毫秒（ms）</li><li>如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后1天内的数据， 反之EndTimeMs也一样）</li><li>只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为&quot;过去三天关于猫咪的视频&quot;， 则会将&quot;过去三天忽略&quot;）</li></ol>
    */
    @SerializedName("StartTimeMs")
    @Expose
    private Long StartTimeMs;

    /**
    * <p>结束时间。</p><p>注：</p><ol><li>单位为毫秒（ms）</li><li>如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后1天内的数据， 反之EndTimeMs也一样）</li><li>只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为&quot;过去三天关于猫咪的视频&quot;， 则会将&quot;过去三天忽略&quot;）</li></ol>
    */
    @SerializedName("EndTimeMs")
    @Expose
    private Long EndTimeMs;

    /**
    * <p>时区。默认值：Asia/Shanghai</p><p>注：<br>符合iana标准 https://www.iana.org/time-zones，例如Asia/Shanghai、Asia/Bangkok</p>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>取值为1表示高级搜索，取值为2表示简单搜索，默认为1</p>
    */
    @SerializedName("SearchMode")
    @Expose
    private Long SearchMode;

    /**
    * <p>最终输出的条数；仅当SearchMode为2时支持自定义设置，默认为50</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>向量搜索的相似度搜索半径，取值范围[-1, 1]；仅当SearchMode为2时支持自定义设置，默认为0.5</p>
    */
    @SerializedName("VectorSearchRadius")
    @Expose
    private Float VectorSearchRadius;

    /**
    * <p>指定向量搜索最相似的 Top K；仅当SearchMode为2时支持自定义设置，默认为100</p>
    */
    @SerializedName("VectorSearchTopK")
    @Expose
    private Long VectorSearchTopK;

    /**
    * <p>搜索结果的排序方式，可选值：</p><ul><li><code>CORRELATION</code>：按相关性（默认）</li><li><code>TIME_ASC</code>：按时间升序</li><li><code>TIME_DESC</code>：按时间降序</li></ul>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get <p>产品ID</p> 
     * @return ProductId <p>产品ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品ID</p>
     * @param ProductId <p>产品ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名称</p> 
     * @return DeviceName <p>设备名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名称</p>
     * @param DeviceName <p>设备名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>自然语言查询</p> 
     * @return Query <p>自然语言查询</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>自然语言查询</p>
     * @param Query <p>自然语言查询</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH</p> 
     * @return SummaryLang <p>搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH</p>
     */
    public String getSummaryLang() {
        return this.SummaryLang;
    }

    /**
     * Set <p>搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH</p>
     * @param SummaryLang <p>搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH</p>
     */
    public void setSummaryLang(String SummaryLang) {
        this.SummaryLang = SummaryLang;
    }

    /**
     * Get <p>通道ID</p> 
     * @return ChannelId <p>通道ID</p>
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道ID</p>
     * @param ChannelId <p>通道ID</p>
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>是否需要返回总结，默认为True；  开启后会加大接口响应时长</p> 
     * @return EnableSummary <p>是否需要返回总结，默认为True；  开启后会加大接口响应时长</p>
     */
    public Boolean getEnableSummary() {
        return this.EnableSummary;
    }

    /**
     * Set <p>是否需要返回总结，默认为True；  开启后会加大接口响应时长</p>
     * @param EnableSummary <p>是否需要返回总结，默认为True；  开启后会加大接口响应时长</p>
     */
    public void setEnableSummary(Boolean EnableSummary) {
        this.EnableSummary = EnableSummary;
    }

    /**
     * Get <p>开始时间。</p><p>注：</p><ol><li>单位为毫秒（ms）</li><li>如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后1天内的数据， 反之EndTimeMs也一样）</li><li>只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为&quot;过去三天关于猫咪的视频&quot;， 则会将&quot;过去三天忽略&quot;）</li></ol> 
     * @return StartTimeMs <p>开始时间。</p><p>注：</p><ol><li>单位为毫秒（ms）</li><li>如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后1天内的数据， 反之EndTimeMs也一样）</li><li>只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为&quot;过去三天关于猫咪的视频&quot;， 则会将&quot;过去三天忽略&quot;）</li></ol>
     */
    public Long getStartTimeMs() {
        return this.StartTimeMs;
    }

    /**
     * Set <p>开始时间。</p><p>注：</p><ol><li>单位为毫秒（ms）</li><li>如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后1天内的数据， 反之EndTimeMs也一样）</li><li>只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为&quot;过去三天关于猫咪的视频&quot;， 则会将&quot;过去三天忽略&quot;）</li></ol>
     * @param StartTimeMs <p>开始时间。</p><p>注：</p><ol><li>单位为毫秒（ms）</li><li>如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后1天内的数据， 反之EndTimeMs也一样）</li><li>只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为&quot;过去三天关于猫咪的视频&quot;， 则会将&quot;过去三天忽略&quot;）</li></ol>
     */
    public void setStartTimeMs(Long StartTimeMs) {
        this.StartTimeMs = StartTimeMs;
    }

    /**
     * Get <p>结束时间。</p><p>注：</p><ol><li>单位为毫秒（ms）</li><li>如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后1天内的数据， 反之EndTimeMs也一样）</li><li>只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为&quot;过去三天关于猫咪的视频&quot;， 则会将&quot;过去三天忽略&quot;）</li></ol> 
     * @return EndTimeMs <p>结束时间。</p><p>注：</p><ol><li>单位为毫秒（ms）</li><li>如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后1天内的数据， 反之EndTimeMs也一样）</li><li>只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为&quot;过去三天关于猫咪的视频&quot;， 则会将&quot;过去三天忽略&quot;）</li></ol>
     */
    public Long getEndTimeMs() {
        return this.EndTimeMs;
    }

    /**
     * Set <p>结束时间。</p><p>注：</p><ol><li>单位为毫秒（ms）</li><li>如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后1天内的数据， 反之EndTimeMs也一样）</li><li>只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为&quot;过去三天关于猫咪的视频&quot;， 则会将&quot;过去三天忽略&quot;）</li></ol>
     * @param EndTimeMs <p>结束时间。</p><p>注：</p><ol><li>单位为毫秒（ms）</li><li>如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后1天内的数据， 反之EndTimeMs也一样）</li><li>只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为&quot;过去三天关于猫咪的视频&quot;， 则会将&quot;过去三天忽略&quot;）</li></ol>
     */
    public void setEndTimeMs(Long EndTimeMs) {
        this.EndTimeMs = EndTimeMs;
    }

    /**
     * Get <p>时区。默认值：Asia/Shanghai</p><p>注：<br>符合iana标准 https://www.iana.org/time-zones，例如Asia/Shanghai、Asia/Bangkok</p> 
     * @return TimeZone <p>时区。默认值：Asia/Shanghai</p><p>注：<br>符合iana标准 https://www.iana.org/time-zones，例如Asia/Shanghai、Asia/Bangkok</p>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>时区。默认值：Asia/Shanghai</p><p>注：<br>符合iana标准 https://www.iana.org/time-zones，例如Asia/Shanghai、Asia/Bangkok</p>
     * @param TimeZone <p>时区。默认值：Asia/Shanghai</p><p>注：<br>符合iana标准 https://www.iana.org/time-zones，例如Asia/Shanghai、Asia/Bangkok</p>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>取值为1表示高级搜索，取值为2表示简单搜索，默认为1</p> 
     * @return SearchMode <p>取值为1表示高级搜索，取值为2表示简单搜索，默认为1</p>
     */
    public Long getSearchMode() {
        return this.SearchMode;
    }

    /**
     * Set <p>取值为1表示高级搜索，取值为2表示简单搜索，默认为1</p>
     * @param SearchMode <p>取值为1表示高级搜索，取值为2表示简单搜索，默认为1</p>
     */
    public void setSearchMode(Long SearchMode) {
        this.SearchMode = SearchMode;
    }

    /**
     * Get <p>最终输出的条数；仅当SearchMode为2时支持自定义设置，默认为50</p> 
     * @return Limit <p>最终输出的条数；仅当SearchMode为2时支持自定义设置，默认为50</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>最终输出的条数；仅当SearchMode为2时支持自定义设置，默认为50</p>
     * @param Limit <p>最终输出的条数；仅当SearchMode为2时支持自定义设置，默认为50</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>向量搜索的相似度搜索半径，取值范围[-1, 1]；仅当SearchMode为2时支持自定义设置，默认为0.5</p> 
     * @return VectorSearchRadius <p>向量搜索的相似度搜索半径，取值范围[-1, 1]；仅当SearchMode为2时支持自定义设置，默认为0.5</p>
     */
    public Float getVectorSearchRadius() {
        return this.VectorSearchRadius;
    }

    /**
     * Set <p>向量搜索的相似度搜索半径，取值范围[-1, 1]；仅当SearchMode为2时支持自定义设置，默认为0.5</p>
     * @param VectorSearchRadius <p>向量搜索的相似度搜索半径，取值范围[-1, 1]；仅当SearchMode为2时支持自定义设置，默认为0.5</p>
     */
    public void setVectorSearchRadius(Float VectorSearchRadius) {
        this.VectorSearchRadius = VectorSearchRadius;
    }

    /**
     * Get <p>指定向量搜索最相似的 Top K；仅当SearchMode为2时支持自定义设置，默认为100</p> 
     * @return VectorSearchTopK <p>指定向量搜索最相似的 Top K；仅当SearchMode为2时支持自定义设置，默认为100</p>
     */
    public Long getVectorSearchTopK() {
        return this.VectorSearchTopK;
    }

    /**
     * Set <p>指定向量搜索最相似的 Top K；仅当SearchMode为2时支持自定义设置，默认为100</p>
     * @param VectorSearchTopK <p>指定向量搜索最相似的 Top K；仅当SearchMode为2时支持自定义设置，默认为100</p>
     */
    public void setVectorSearchTopK(Long VectorSearchTopK) {
        this.VectorSearchTopK = VectorSearchTopK;
    }

    /**
     * Get <p>搜索结果的排序方式，可选值：</p><ul><li><code>CORRELATION</code>：按相关性（默认）</li><li><code>TIME_ASC</code>：按时间升序</li><li><code>TIME_DESC</code>：按时间降序</li></ul> 
     * @return Order <p>搜索结果的排序方式，可选值：</p><ul><li><code>CORRELATION</code>：按相关性（默认）</li><li><code>TIME_ASC</code>：按时间升序</li><li><code>TIME_DESC</code>：按时间降序</li></ul>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>搜索结果的排序方式，可选值：</p><ul><li><code>CORRELATION</code>：按相关性（默认）</li><li><code>TIME_ASC</code>：按时间升序</li><li><code>TIME_DESC</code>：按时间降序</li></ul>
     * @param Order <p>搜索结果的排序方式，可选值：</p><ul><li><code>CORRELATION</code>：按相关性（默认）</li><li><code>TIME_ASC</code>：按时间升序</li><li><code>TIME_DESC</code>：按时间降序</li></ul>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public InvokeAISearchServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeAISearchServiceRequest(InvokeAISearchServiceRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.SummaryLang != null) {
            this.SummaryLang = new String(source.SummaryLang);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.EnableSummary != null) {
            this.EnableSummary = new Boolean(source.EnableSummary);
        }
        if (source.StartTimeMs != null) {
            this.StartTimeMs = new Long(source.StartTimeMs);
        }
        if (source.EndTimeMs != null) {
            this.EndTimeMs = new Long(source.EndTimeMs);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.SearchMode != null) {
            this.SearchMode = new Long(source.SearchMode);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.VectorSearchRadius != null) {
            this.VectorSearchRadius = new Float(source.VectorSearchRadius);
        }
        if (source.VectorSearchTopK != null) {
            this.VectorSearchTopK = new Long(source.VectorSearchTopK);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "SummaryLang", this.SummaryLang);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "EnableSummary", this.EnableSummary);
        this.setParamSimple(map, prefix + "StartTimeMs", this.StartTimeMs);
        this.setParamSimple(map, prefix + "EndTimeMs", this.EndTimeMs);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "SearchMode", this.SearchMode);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "VectorSearchRadius", this.VectorSearchRadius);
        this.setParamSimple(map, prefix + "VectorSearchTopK", this.VectorSearchTopK);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

