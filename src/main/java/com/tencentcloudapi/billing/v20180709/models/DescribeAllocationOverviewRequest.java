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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllocationOverviewRequest extends AbstractModel {

    /**
    * 数量，最大值为1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 账单月份，格式为2024-02，不传默认当前月
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * 统计周期，枚举值如下
month - 月
day - 日
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * 分账单元唯一标识，用作筛选
    */
    @SerializedName("TreeNodeUniqKeys")
    @Expose
    private String [] TreeNodeUniqKeys;

    /**
    * 排序字段，枚举值如下： 
GatherCashPayAmount - 归集费用(现金)
GatherVoucherPayAmount- 归集费用(优惠券)
GatherIncentivePayAmount -  归集费用(赠送金)
GatherTransferPayAmount - 归集费用(分成金)
AllocateCashPayAmount - 分摊费用(现金)
AllocateVoucherPayAmount - 分摊费用(优惠券)
AllocateIncentivePayAmount - 分摊费用(赠送金)
AllocateTransferPayAmount - 分摊费用(分成金)
TotalCashPayAmount - 合计费用(现金)
TotalVoucherPayAmount - 合计费用(优惠券)
TotalIncentivePayAmount - 合计费用(赠送金)
TotalTransferPayAmount - 合计费用(分成金)
GatherRealCost - 归集费用(折后总额)
AllocateRealCost - 分摊费用(折后总额)
RealTotalCost - 合计费用(折后总额)
Ratio  - 占比(折后总额)
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 排序类型，枚举值如下：
asc - 升序
desc - 降序
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * 日期，用作筛选
    */
    @SerializedName("BillDates")
    @Expose
    private String [] BillDates;

    /**
     * Get 数量，最大值为1000 
     * @return Limit 数量，最大值为1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数量，最大值为1000
     * @param Limit 数量，最大值为1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推 
     * @return Offset 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推
     * @param Offset 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，依次类推
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 账单月份，格式为2024-02，不传默认当前月 
     * @return Month 账单月份，格式为2024-02，不传默认当前月
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 账单月份，格式为2024-02，不传默认当前月
     * @param Month 账单月份，格式为2024-02，不传默认当前月
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get 统计周期，枚举值如下
month - 月
day - 日 
     * @return PeriodType 统计周期，枚举值如下
month - 月
day - 日
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set 统计周期，枚举值如下
month - 月
day - 日
     * @param PeriodType 统计周期，枚举值如下
month - 月
day - 日
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get 分账单元唯一标识，用作筛选 
     * @return TreeNodeUniqKeys 分账单元唯一标识，用作筛选
     */
    public String [] getTreeNodeUniqKeys() {
        return this.TreeNodeUniqKeys;
    }

    /**
     * Set 分账单元唯一标识，用作筛选
     * @param TreeNodeUniqKeys 分账单元唯一标识，用作筛选
     */
    public void setTreeNodeUniqKeys(String [] TreeNodeUniqKeys) {
        this.TreeNodeUniqKeys = TreeNodeUniqKeys;
    }

    /**
     * Get 排序字段，枚举值如下： 
GatherCashPayAmount - 归集费用(现金)
GatherVoucherPayAmount- 归集费用(优惠券)
GatherIncentivePayAmount -  归集费用(赠送金)
GatherTransferPayAmount - 归集费用(分成金)
AllocateCashPayAmount - 分摊费用(现金)
AllocateVoucherPayAmount - 分摊费用(优惠券)
AllocateIncentivePayAmount - 分摊费用(赠送金)
AllocateTransferPayAmount - 分摊费用(分成金)
TotalCashPayAmount - 合计费用(现金)
TotalVoucherPayAmount - 合计费用(优惠券)
TotalIncentivePayAmount - 合计费用(赠送金)
TotalTransferPayAmount - 合计费用(分成金)
GatherRealCost - 归集费用(折后总额)
AllocateRealCost - 分摊费用(折后总额)
RealTotalCost - 合计费用(折后总额)
Ratio  - 占比(折后总额) 
     * @return Sort 排序字段，枚举值如下： 
GatherCashPayAmount - 归集费用(现金)
GatherVoucherPayAmount- 归集费用(优惠券)
GatherIncentivePayAmount -  归集费用(赠送金)
GatherTransferPayAmount - 归集费用(分成金)
AllocateCashPayAmount - 分摊费用(现金)
AllocateVoucherPayAmount - 分摊费用(优惠券)
AllocateIncentivePayAmount - 分摊费用(赠送金)
AllocateTransferPayAmount - 分摊费用(分成金)
TotalCashPayAmount - 合计费用(现金)
TotalVoucherPayAmount - 合计费用(优惠券)
TotalIncentivePayAmount - 合计费用(赠送金)
TotalTransferPayAmount - 合计费用(分成金)
GatherRealCost - 归集费用(折后总额)
AllocateRealCost - 分摊费用(折后总额)
RealTotalCost - 合计费用(折后总额)
Ratio  - 占比(折后总额)
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序字段，枚举值如下： 
GatherCashPayAmount - 归集费用(现金)
GatherVoucherPayAmount- 归集费用(优惠券)
GatherIncentivePayAmount -  归集费用(赠送金)
GatherTransferPayAmount - 归集费用(分成金)
AllocateCashPayAmount - 分摊费用(现金)
AllocateVoucherPayAmount - 分摊费用(优惠券)
AllocateIncentivePayAmount - 分摊费用(赠送金)
AllocateTransferPayAmount - 分摊费用(分成金)
TotalCashPayAmount - 合计费用(现金)
TotalVoucherPayAmount - 合计费用(优惠券)
TotalIncentivePayAmount - 合计费用(赠送金)
TotalTransferPayAmount - 合计费用(分成金)
GatherRealCost - 归集费用(折后总额)
AllocateRealCost - 分摊费用(折后总额)
RealTotalCost - 合计费用(折后总额)
Ratio  - 占比(折后总额)
     * @param Sort 排序字段，枚举值如下： 
GatherCashPayAmount - 归集费用(现金)
GatherVoucherPayAmount- 归集费用(优惠券)
GatherIncentivePayAmount -  归集费用(赠送金)
GatherTransferPayAmount - 归集费用(分成金)
AllocateCashPayAmount - 分摊费用(现金)
AllocateVoucherPayAmount - 分摊费用(优惠券)
AllocateIncentivePayAmount - 分摊费用(赠送金)
AllocateTransferPayAmount - 分摊费用(分成金)
TotalCashPayAmount - 合计费用(现金)
TotalVoucherPayAmount - 合计费用(优惠券)
TotalIncentivePayAmount - 合计费用(赠送金)
TotalTransferPayAmount - 合计费用(分成金)
GatherRealCost - 归集费用(折后总额)
AllocateRealCost - 分摊费用(折后总额)
RealTotalCost - 合计费用(折后总额)
Ratio  - 占比(折后总额)
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 排序类型，枚举值如下：
asc - 升序
desc - 降序 
     * @return SortType 排序类型，枚举值如下：
asc - 升序
desc - 降序
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 排序类型，枚举值如下：
asc - 升序
desc - 降序
     * @param SortType 排序类型，枚举值如下：
asc - 升序
desc - 降序
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 日期，用作筛选 
     * @return BillDates 日期，用作筛选
     */
    public String [] getBillDates() {
        return this.BillDates;
    }

    /**
     * Set 日期，用作筛选
     * @param BillDates 日期，用作筛选
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

