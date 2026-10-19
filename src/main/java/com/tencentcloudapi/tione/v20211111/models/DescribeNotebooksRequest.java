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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNotebooksRequest extends AbstractModel {

    /**
    * <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>偏移量，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页返回的实例数，默认为 10，最小值 0，最大值 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列。默认为DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>根据哪个字段排序，如：CreateTime、UpdateTime，默认为UpdateTime</p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * <p>过滤器，eg：[{ &quot;Name&quot;: &quot;Id&quot;, &quot;Values&quot;: [&quot;nb-123456789&quot;] }]</p><p>取值范围<br>Name（名称）：notebook1<br>Id（notebook ID）：nb-123456789<br>Status（状态）：Starting / Running / Stopped / Stopping / Failed / SubmitFailed<br>Creator（创建者 uin）：100014761913<br>ChargeType（计费类型）：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）<br>ChargeStatus（计费状态）：NOT_BILLING（未开始计费）/ BILLING（计费中）/ BILLING_STORAGE（存储计费中）/ARREARS_STOP（欠费停止）<br>DefaultCodeRepoId（默认代码仓库ID）：cr-123456789<br>AdditionalCodeRepoId（关联代码仓库ID）：cr-123456789<br>LifecycleScriptId（生命周期ID）：ls-12312312311312</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>标签过滤器，eg：[{ &quot;TagKey&quot;: &quot;TagKeyA&quot;, &quot;TagValue&quot;: [&quot;TagValueA&quot;] }]</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>偏移量，默认为0</p> 
     * @return Offset <p>偏移量，默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0</p>
     * @param Offset <p>偏移量，默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页返回的实例数，默认为 10，最小值 0，最大值 100</p> 
     * @return Limit <p>每页返回的实例数，默认为 10，最小值 0，最大值 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页返回的实例数，默认为 10，最小值 0，最大值 100</p>
     * @param Limit <p>每页返回的实例数，默认为 10，最小值 0，最大值 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列。默认为DESC</p> 
     * @return Order <p>输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列。默认为DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列。默认为DESC</p>
     * @param Order <p>输出列表的排列顺序。取值范围：ASC：升序排列 DESC：降序排列。默认为DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>根据哪个字段排序，如：CreateTime、UpdateTime，默认为UpdateTime</p> 
     * @return OrderField <p>根据哪个字段排序，如：CreateTime、UpdateTime，默认为UpdateTime</p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>根据哪个字段排序，如：CreateTime、UpdateTime，默认为UpdateTime</p>
     * @param OrderField <p>根据哪个字段排序，如：CreateTime、UpdateTime，默认为UpdateTime</p>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get <p>过滤器，eg：[{ &quot;Name&quot;: &quot;Id&quot;, &quot;Values&quot;: [&quot;nb-123456789&quot;] }]</p><p>取值范围<br>Name（名称）：notebook1<br>Id（notebook ID）：nb-123456789<br>Status（状态）：Starting / Running / Stopped / Stopping / Failed / SubmitFailed<br>Creator（创建者 uin）：100014761913<br>ChargeType（计费类型）：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）<br>ChargeStatus（计费状态）：NOT_BILLING（未开始计费）/ BILLING（计费中）/ BILLING_STORAGE（存储计费中）/ARREARS_STOP（欠费停止）<br>DefaultCodeRepoId（默认代码仓库ID）：cr-123456789<br>AdditionalCodeRepoId（关联代码仓库ID）：cr-123456789<br>LifecycleScriptId（生命周期ID）：ls-12312312311312</p> 
     * @return Filters <p>过滤器，eg：[{ &quot;Name&quot;: &quot;Id&quot;, &quot;Values&quot;: [&quot;nb-123456789&quot;] }]</p><p>取值范围<br>Name（名称）：notebook1<br>Id（notebook ID）：nb-123456789<br>Status（状态）：Starting / Running / Stopped / Stopping / Failed / SubmitFailed<br>Creator（创建者 uin）：100014761913<br>ChargeType（计费类型）：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）<br>ChargeStatus（计费状态）：NOT_BILLING（未开始计费）/ BILLING（计费中）/ BILLING_STORAGE（存储计费中）/ARREARS_STOP（欠费停止）<br>DefaultCodeRepoId（默认代码仓库ID）：cr-123456789<br>AdditionalCodeRepoId（关联代码仓库ID）：cr-123456789<br>LifecycleScriptId（生命周期ID）：ls-12312312311312</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤器，eg：[{ &quot;Name&quot;: &quot;Id&quot;, &quot;Values&quot;: [&quot;nb-123456789&quot;] }]</p><p>取值范围<br>Name（名称）：notebook1<br>Id（notebook ID）：nb-123456789<br>Status（状态）：Starting / Running / Stopped / Stopping / Failed / SubmitFailed<br>Creator（创建者 uin）：100014761913<br>ChargeType（计费类型）：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）<br>ChargeStatus（计费状态）：NOT_BILLING（未开始计费）/ BILLING（计费中）/ BILLING_STORAGE（存储计费中）/ARREARS_STOP（欠费停止）<br>DefaultCodeRepoId（默认代码仓库ID）：cr-123456789<br>AdditionalCodeRepoId（关联代码仓库ID）：cr-123456789<br>LifecycleScriptId（生命周期ID）：ls-12312312311312</p>
     * @param Filters <p>过滤器，eg：[{ &quot;Name&quot;: &quot;Id&quot;, &quot;Values&quot;: [&quot;nb-123456789&quot;] }]</p><p>取值范围<br>Name（名称）：notebook1<br>Id（notebook ID）：nb-123456789<br>Status（状态）：Starting / Running / Stopped / Stopping / Failed / SubmitFailed<br>Creator（创建者 uin）：100014761913<br>ChargeType（计费类型）：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）<br>ChargeStatus（计费状态）：NOT_BILLING（未开始计费）/ BILLING（计费中）/ BILLING_STORAGE（存储计费中）/ARREARS_STOP（欠费停止）<br>DefaultCodeRepoId（默认代码仓库ID）：cr-123456789<br>AdditionalCodeRepoId（关联代码仓库ID）：cr-123456789<br>LifecycleScriptId（生命周期ID）：ls-12312312311312</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>标签过滤器，eg：[{ &quot;TagKey&quot;: &quot;TagKeyA&quot;, &quot;TagValue&quot;: [&quot;TagValueA&quot;] }]</p> 
     * @return TagFilters <p>标签过滤器，eg：[{ &quot;TagKey&quot;: &quot;TagKeyA&quot;, &quot;TagValue&quot;: [&quot;TagValueA&quot;] }]</p>
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>标签过滤器，eg：[{ &quot;TagKey&quot;: &quot;TagKeyA&quot;, &quot;TagValue&quot;: [&quot;TagValueA&quot;] }]</p>
     * @param TagFilters <p>标签过滤器，eg：[{ &quot;TagKey&quot;: &quot;TagKeyA&quot;, &quot;TagValue&quot;: [&quot;TagValueA&quot;] }]</p>
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeNotebooksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNotebooksRequest(DescribeNotebooksRequest source) {
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

