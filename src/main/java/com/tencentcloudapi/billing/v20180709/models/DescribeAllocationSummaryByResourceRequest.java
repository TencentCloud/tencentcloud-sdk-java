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

public class DescribeAllocationSummaryByResourceRequest extends AbstractModel {

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
    * <p>排序字段，枚举值如下：<br>RiTimeSpan - 预留实例抵扣时长<br>ExtendPayAmount1 - 预留实例抵扣组件原价<br>RealCost - 折后总价<br>CashPayAmount - 现金金额<br>VoucherPayAmount - 代金券金额<br>IncentivePayAmount - 赠送金金额<br>TransferPayAmount -分成金金额<br>Cost - 组件原价</p>
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
    * <p>产品编码，用作筛选</p>
    */
    @SerializedName("BusinessCodes")
    @Expose
    private String [] BusinessCodes;

    /**
    * <p>使用者UIN，用作筛选</p>
    */
    @SerializedName("OwnerUins")
    @Expose
    private String [] OwnerUins;

    /**
    * <p>操作者UIN，用作筛选</p>
    */
    @SerializedName("OperateUins")
    @Expose
    private String [] OperateUins;

    /**
    * <p>计费模式编码，用作筛选</p>
    */
    @SerializedName("PayModes")
    @Expose
    private String [] PayModes;

    /**
    * <p>交易类型编码，用作筛选</p>
    */
    @SerializedName("ActionTypes")
    @Expose
    private String [] ActionTypes;

    /**
    * <p>子产品编码，用作筛选</p>
    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
    * <p>地域ID，用作筛选</p>
    */
    @SerializedName("RegionIds")
    @Expose
    private String [] RegionIds;

    /**
    * <p>可用区ID，用作筛选</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * <p>实例类型编码，用作筛选</p>
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * <p>标签，用作筛选</p>
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * <p>模糊搜索：支持标签、资源id、资源别名</p>
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * <p>项目ID，用作筛选</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * <p>费用归集类型，枚举值如下：<br>0 - 分摊<br>1 - 归集<br>-1 -  未分配</p>
    */
    @SerializedName("AllocationType")
    @Expose
    private Long [] AllocationType;

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
     * Get <p>排序字段，枚举值如下：<br>RiTimeSpan - 预留实例抵扣时长<br>ExtendPayAmount1 - 预留实例抵扣组件原价<br>RealCost - 折后总价<br>CashPayAmount - 现金金额<br>VoucherPayAmount - 代金券金额<br>IncentivePayAmount - 赠送金金额<br>TransferPayAmount -分成金金额<br>Cost - 组件原价</p> 
     * @return Sort <p>排序字段，枚举值如下：<br>RiTimeSpan - 预留实例抵扣时长<br>ExtendPayAmount1 - 预留实例抵扣组件原价<br>RealCost - 折后总价<br>CashPayAmount - 现金金额<br>VoucherPayAmount - 代金券金额<br>IncentivePayAmount - 赠送金金额<br>TransferPayAmount -分成金金额<br>Cost - 组件原价</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序字段，枚举值如下：<br>RiTimeSpan - 预留实例抵扣时长<br>ExtendPayAmount1 - 预留实例抵扣组件原价<br>RealCost - 折后总价<br>CashPayAmount - 现金金额<br>VoucherPayAmount - 代金券金额<br>IncentivePayAmount - 赠送金金额<br>TransferPayAmount -分成金金额<br>Cost - 组件原价</p>
     * @param Sort <p>排序字段，枚举值如下：<br>RiTimeSpan - 预留实例抵扣时长<br>ExtendPayAmount1 - 预留实例抵扣组件原价<br>RealCost - 折后总价<br>CashPayAmount - 现金金额<br>VoucherPayAmount - 代金券金额<br>IncentivePayAmount - 赠送金金额<br>TransferPayAmount -分成金金额<br>Cost - 组件原价</p>
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

    /**
     * Get <p>产品编码，用作筛选</p> 
     * @return BusinessCodes <p>产品编码，用作筛选</p>
     */
    public String [] getBusinessCodes() {
        return this.BusinessCodes;
    }

    /**
     * Set <p>产品编码，用作筛选</p>
     * @param BusinessCodes <p>产品编码，用作筛选</p>
     */
    public void setBusinessCodes(String [] BusinessCodes) {
        this.BusinessCodes = BusinessCodes;
    }

    /**
     * Get <p>使用者UIN，用作筛选</p> 
     * @return OwnerUins <p>使用者UIN，用作筛选</p>
     */
    public String [] getOwnerUins() {
        return this.OwnerUins;
    }

    /**
     * Set <p>使用者UIN，用作筛选</p>
     * @param OwnerUins <p>使用者UIN，用作筛选</p>
     */
    public void setOwnerUins(String [] OwnerUins) {
        this.OwnerUins = OwnerUins;
    }

    /**
     * Get <p>操作者UIN，用作筛选</p> 
     * @return OperateUins <p>操作者UIN，用作筛选</p>
     */
    public String [] getOperateUins() {
        return this.OperateUins;
    }

    /**
     * Set <p>操作者UIN，用作筛选</p>
     * @param OperateUins <p>操作者UIN，用作筛选</p>
     */
    public void setOperateUins(String [] OperateUins) {
        this.OperateUins = OperateUins;
    }

    /**
     * Get <p>计费模式编码，用作筛选</p> 
     * @return PayModes <p>计费模式编码，用作筛选</p>
     */
    public String [] getPayModes() {
        return this.PayModes;
    }

    /**
     * Set <p>计费模式编码，用作筛选</p>
     * @param PayModes <p>计费模式编码，用作筛选</p>
     */
    public void setPayModes(String [] PayModes) {
        this.PayModes = PayModes;
    }

    /**
     * Get <p>交易类型编码，用作筛选</p> 
     * @return ActionTypes <p>交易类型编码，用作筛选</p>
     */
    public String [] getActionTypes() {
        return this.ActionTypes;
    }

    /**
     * Set <p>交易类型编码，用作筛选</p>
     * @param ActionTypes <p>交易类型编码，用作筛选</p>
     */
    public void setActionTypes(String [] ActionTypes) {
        this.ActionTypes = ActionTypes;
    }

    /**
     * Get <p>子产品编码，用作筛选</p> 
     * @return ProductCodes <p>子产品编码，用作筛选</p>
     */
    public String [] getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set <p>子产品编码，用作筛选</p>
     * @param ProductCodes <p>子产品编码，用作筛选</p>
     */
    public void setProductCodes(String [] ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    /**
     * Get <p>地域ID，用作筛选</p> 
     * @return RegionIds <p>地域ID，用作筛选</p>
     */
    public String [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set <p>地域ID，用作筛选</p>
     * @param RegionIds <p>地域ID，用作筛选</p>
     */
    public void setRegionIds(String [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get <p>可用区ID，用作筛选</p> 
     * @return ZoneIds <p>可用区ID，用作筛选</p>
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>可用区ID，用作筛选</p>
     * @param ZoneIds <p>可用区ID，用作筛选</p>
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>实例类型编码，用作筛选</p> 
     * @return InstanceTypes <p>实例类型编码，用作筛选</p>
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set <p>实例类型编码，用作筛选</p>
     * @param InstanceTypes <p>实例类型编码，用作筛选</p>
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get <p>标签，用作筛选</p> 
     * @return Tag <p>标签，用作筛选</p>
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set <p>标签，用作筛选</p>
     * @param Tag <p>标签，用作筛选</p>
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>模糊搜索：支持标签、资源id、资源别名</p> 
     * @return SearchKey <p>模糊搜索：支持标签、资源id、资源别名</p>
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set <p>模糊搜索：支持标签、资源id、资源别名</p>
     * @param SearchKey <p>模糊搜索：支持标签、资源id、资源别名</p>
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get <p>项目ID，用作筛选</p> 
     * @return ProjectIds <p>项目ID，用作筛选</p>
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>项目ID，用作筛选</p>
     * @param ProjectIds <p>项目ID，用作筛选</p>
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>费用归集类型，枚举值如下：<br>0 - 分摊<br>1 - 归集<br>-1 -  未分配</p> 
     * @return AllocationType <p>费用归集类型，枚举值如下：<br>0 - 分摊<br>1 - 归集<br>-1 -  未分配</p>
     */
    public Long [] getAllocationType() {
        return this.AllocationType;
    }

    /**
     * Set <p>费用归集类型，枚举值如下：<br>0 - 分摊<br>1 - 归集<br>-1 -  未分配</p>
     * @param AllocationType <p>费用归集类型，枚举值如下：<br>0 - 分摊<br>1 - 归集<br>-1 -  未分配</p>
     */
    public void setAllocationType(Long [] AllocationType) {
        this.AllocationType = AllocationType;
    }

    public DescribeAllocationSummaryByResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationSummaryByResourceRequest(DescribeAllocationSummaryByResourceRequest source) {
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
        if (source.BusinessCodes != null) {
            this.BusinessCodes = new String[source.BusinessCodes.length];
            for (int i = 0; i < source.BusinessCodes.length; i++) {
                this.BusinessCodes[i] = new String(source.BusinessCodes[i]);
            }
        }
        if (source.OwnerUins != null) {
            this.OwnerUins = new String[source.OwnerUins.length];
            for (int i = 0; i < source.OwnerUins.length; i++) {
                this.OwnerUins[i] = new String(source.OwnerUins[i]);
            }
        }
        if (source.OperateUins != null) {
            this.OperateUins = new String[source.OperateUins.length];
            for (int i = 0; i < source.OperateUins.length; i++) {
                this.OperateUins[i] = new String(source.OperateUins[i]);
            }
        }
        if (source.PayModes != null) {
            this.PayModes = new String[source.PayModes.length];
            for (int i = 0; i < source.PayModes.length; i++) {
                this.PayModes[i] = new String(source.PayModes[i]);
            }
        }
        if (source.ActionTypes != null) {
            this.ActionTypes = new String[source.ActionTypes.length];
            for (int i = 0; i < source.ActionTypes.length; i++) {
                this.ActionTypes[i] = new String(source.ActionTypes[i]);
            }
        }
        if (source.ProductCodes != null) {
            this.ProductCodes = new String[source.ProductCodes.length];
            for (int i = 0; i < source.ProductCodes.length; i++) {
                this.ProductCodes[i] = new String(source.ProductCodes[i]);
            }
        }
        if (source.RegionIds != null) {
            this.RegionIds = new String[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new String(source.RegionIds[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new String[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new String(source.InstanceTypes[i]);
            }
        }
        if (source.Tag != null) {
            this.Tag = new String[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new String(source.Tag[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.AllocationType != null) {
            this.AllocationType = new Long[source.AllocationType.length];
            for (int i = 0; i < source.AllocationType.length; i++) {
                this.AllocationType[i] = new Long(source.AllocationType[i]);
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
        this.setParamArraySimple(map, prefix + "BusinessCodes.", this.BusinessCodes);
        this.setParamArraySimple(map, prefix + "OwnerUins.", this.OwnerUins);
        this.setParamArraySimple(map, prefix + "OperateUins.", this.OperateUins);
        this.setParamArraySimple(map, prefix + "PayModes.", this.PayModes);
        this.setParamArraySimple(map, prefix + "ActionTypes.", this.ActionTypes);
        this.setParamArraySimple(map, prefix + "ProductCodes.", this.ProductCodes);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamArraySimple(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "AllocationType.", this.AllocationType);

    }
}

