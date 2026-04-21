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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllocationOverviewRequest extends AbstractModel {

    /**
    * <p>数量，最大值为1000</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，以此类推</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>账单月份，格式为2024-02，不传默认当前月</p>
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * <p>统计周期，枚举值如下<br>month - 月<br>day - 日</p>
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * <p>分账单元唯一标识，用作筛选</p>
    */
    @SerializedName("TreeNodeUniqKeys")
    @Expose
    private String [] TreeNodeUniqKeys;

    /**
    * <p>排序字段，枚举值如下：<br>GatherCashPayAmount - 归集费用(现金)<br>GatherVoucherPayAmount- 归集费用(优惠券)<br>GatherIncentivePayAmount -  归集费用(赠送金)<br>GatherTransferPayAmount - 归集费用(分成金)<br>AllocateCashPayAmount - 分摊费用(现金)<br>AllocateVoucherPayAmount - 分摊费用(优惠券)<br>AllocateIncentivePayAmount - 分摊费用(赠送金)<br>AllocateTransferPayAmount - 分摊费用(分成金)<br>TotalCashPayAmount - 合计费用(现金)<br>TotalVoucherPayAmount - 合计费用(优惠券)<br>TotalIncentivePayAmount - 合计费用(赠送金)<br>TotalTransferPayAmount - 合计费用(分成金)<br>GatherRealCost - 归集费用(折后总额)<br>AllocateRealCost - 分摊费用(折后总额)<br>RealTotalCost - 合计费用(折后总额)<br>Ratio  - 占比(折后总额)</p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>排序类型，枚举值如下：<br>asc - 升序<br>desc - 降序</p>
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * <p>日期，用作筛选</p>
    */
    @SerializedName("BillDates")
    @Expose
    private String [] BillDates;

    /**
     * Get <p>数量，最大值为1000</p> 
     * @return Limit <p>数量，最大值为1000</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>数量，最大值为1000</p>
     * @param Limit <p>数量，最大值为1000</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，以此类推</p> 
     * @return Offset <p>分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，以此类推</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，以此类推</p>
     * @param Offset <p>分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，以此类推</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>账单月份，格式为2024-02，不传默认当前月</p> 
     * @return Month <p>账单月份，格式为2024-02，不传默认当前月</p>
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set <p>账单月份，格式为2024-02，不传默认当前月</p>
     * @param Month <p>账单月份，格式为2024-02，不传默认当前月</p>
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get <p>统计周期，枚举值如下<br>month - 月<br>day - 日</p> 
     * @return PeriodType <p>统计周期，枚举值如下<br>month - 月<br>day - 日</p>
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set <p>统计周期，枚举值如下<br>month - 月<br>day - 日</p>
     * @param PeriodType <p>统计周期，枚举值如下<br>month - 月<br>day - 日</p>
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get <p>分账单元唯一标识，用作筛选</p> 
     * @return TreeNodeUniqKeys <p>分账单元唯一标识，用作筛选</p>
     */
    public String [] getTreeNodeUniqKeys() {
        return this.TreeNodeUniqKeys;
    }

    /**
     * Set <p>分账单元唯一标识，用作筛选</p>
     * @param TreeNodeUniqKeys <p>分账单元唯一标识，用作筛选</p>
     */
    public void setTreeNodeUniqKeys(String [] TreeNodeUniqKeys) {
        this.TreeNodeUniqKeys = TreeNodeUniqKeys;
    }

    /**
     * Get <p>排序字段，枚举值如下：<br>GatherCashPayAmount - 归集费用(现金)<br>GatherVoucherPayAmount- 归集费用(优惠券)<br>GatherIncentivePayAmount -  归集费用(赠送金)<br>GatherTransferPayAmount - 归集费用(分成金)<br>AllocateCashPayAmount - 分摊费用(现金)<br>AllocateVoucherPayAmount - 分摊费用(优惠券)<br>AllocateIncentivePayAmount - 分摊费用(赠送金)<br>AllocateTransferPayAmount - 分摊费用(分成金)<br>TotalCashPayAmount - 合计费用(现金)<br>TotalVoucherPayAmount - 合计费用(优惠券)<br>TotalIncentivePayAmount - 合计费用(赠送金)<br>TotalTransferPayAmount - 合计费用(分成金)<br>GatherRealCost - 归集费用(折后总额)<br>AllocateRealCost - 分摊费用(折后总额)<br>RealTotalCost - 合计费用(折后总额)<br>Ratio  - 占比(折后总额)</p> 
     * @return Sort <p>排序字段，枚举值如下：<br>GatherCashPayAmount - 归集费用(现金)<br>GatherVoucherPayAmount- 归集费用(优惠券)<br>GatherIncentivePayAmount -  归集费用(赠送金)<br>GatherTransferPayAmount - 归集费用(分成金)<br>AllocateCashPayAmount - 分摊费用(现金)<br>AllocateVoucherPayAmount - 分摊费用(优惠券)<br>AllocateIncentivePayAmount - 分摊费用(赠送金)<br>AllocateTransferPayAmount - 分摊费用(分成金)<br>TotalCashPayAmount - 合计费用(现金)<br>TotalVoucherPayAmount - 合计费用(优惠券)<br>TotalIncentivePayAmount - 合计费用(赠送金)<br>TotalTransferPayAmount - 合计费用(分成金)<br>GatherRealCost - 归集费用(折后总额)<br>AllocateRealCost - 分摊费用(折后总额)<br>RealTotalCost - 合计费用(折后总额)<br>Ratio  - 占比(折后总额)</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序字段，枚举值如下：<br>GatherCashPayAmount - 归集费用(现金)<br>GatherVoucherPayAmount- 归集费用(优惠券)<br>GatherIncentivePayAmount -  归集费用(赠送金)<br>GatherTransferPayAmount - 归集费用(分成金)<br>AllocateCashPayAmount - 分摊费用(现金)<br>AllocateVoucherPayAmount - 分摊费用(优惠券)<br>AllocateIncentivePayAmount - 分摊费用(赠送金)<br>AllocateTransferPayAmount - 分摊费用(分成金)<br>TotalCashPayAmount - 合计费用(现金)<br>TotalVoucherPayAmount - 合计费用(优惠券)<br>TotalIncentivePayAmount - 合计费用(赠送金)<br>TotalTransferPayAmount - 合计费用(分成金)<br>GatherRealCost - 归集费用(折后总额)<br>AllocateRealCost - 分摊费用(折后总额)<br>RealTotalCost - 合计费用(折后总额)<br>Ratio  - 占比(折后总额)</p>
     * @param Sort <p>排序字段，枚举值如下：<br>GatherCashPayAmount - 归集费用(现金)<br>GatherVoucherPayAmount- 归集费用(优惠券)<br>GatherIncentivePayAmount -  归集费用(赠送金)<br>GatherTransferPayAmount - 归集费用(分成金)<br>AllocateCashPayAmount - 分摊费用(现金)<br>AllocateVoucherPayAmount - 分摊费用(优惠券)<br>AllocateIncentivePayAmount - 分摊费用(赠送金)<br>AllocateTransferPayAmount - 分摊费用(分成金)<br>TotalCashPayAmount - 合计费用(现金)<br>TotalVoucherPayAmount - 合计费用(优惠券)<br>TotalIncentivePayAmount - 合计费用(赠送金)<br>TotalTransferPayAmount - 合计费用(分成金)<br>GatherRealCost - 归集费用(折后总额)<br>AllocateRealCost - 分摊费用(折后总额)<br>RealTotalCost - 合计费用(折后总额)<br>Ratio  - 占比(折后总额)</p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>排序类型，枚举值如下：<br>asc - 升序<br>desc - 降序</p> 
     * @return SortType <p>排序类型，枚举值如下：<br>asc - 升序<br>desc - 降序</p>
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set <p>排序类型，枚举值如下：<br>asc - 升序<br>desc - 降序</p>
     * @param SortType <p>排序类型，枚举值如下：<br>asc - 升序<br>desc - 降序</p>
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get <p>日期，用作筛选</p> 
     * @return BillDates <p>日期，用作筛选</p>
     */
    public String [] getBillDates() {
        return this.BillDates;
    }

    /**
     * Set <p>日期，用作筛选</p>
     * @param BillDates <p>日期，用作筛选</p>
     */
    public void setBillDates(String [] BillDates) {
        this.BillDates = BillDates;
    }

    public DescribeAllocationOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationOverviewRequest(DescribeAllocationOverviewRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
        if (source.TreeNodeUniqKeys != null) {
            this.TreeNodeUniqKeys = new String[source.TreeNodeUniqKeys.length];
            for (int i = 0; i < source.TreeNodeUniqKeys.length; i++) {
                this.TreeNodeUniqKeys[i] = new String(source.TreeNodeUniqKeys[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.BillDates != null) {
            this.BillDates = new String[source.BillDates.length];
            for (int i = 0; i < source.BillDates.length; i++) {
                this.BillDates[i] = new String(source.BillDates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamArraySimple(map, prefix + "TreeNodeUniqKeys.", this.TreeNodeUniqKeys);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamArraySimple(map, prefix + "BillDates.", this.BillDates);

    }
}

