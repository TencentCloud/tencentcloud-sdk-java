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

public class DescribeAllocationSummaryByItemRequest extends AbstractModel {

    /**
    * 数量，最大值为1000

    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，以此类推
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
RiTimeSpan - 预留实例抵扣时长
ExtendPayAmount1 - 预留实例抵扣组件原价
RealCost - 折后总价
CashPayAmount - 现金金额
VoucherPayAmount - 代金券金额
IncentivePayAmount - 赠送金金额
TransferPayAmount -分成金金额
Cost - 组件原价
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
    * 产品编码，用作筛选

    */
    @SerializedName("BusinessCodes")
    @Expose
    private String [] BusinessCodes;

    /**
    * 使用者UIN，用作筛选

    */
    @SerializedName("OwnerUins")
    @Expose
    private String [] OwnerUins;

    /**
    * 操作者UIN，用作筛选

    */
    @SerializedName("OperateUins")
    @Expose
    private String [] OperateUins;

    /**
    * 计费模式编码，用作筛选

    */
    @SerializedName("PayModes")
    @Expose
    private String [] PayModes;

    /**
    * 交易类型编码，用作筛选

    */
    @SerializedName("ActionTypes")
    @Expose
    private String [] ActionTypes;

    /**
    * 子产品编码，用作筛选

    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
    * 地域ID，用作筛选

    */
    @SerializedName("RegionIds")
    @Expose
    private String [] RegionIds;

    /**
    * 可用区ID，用作筛选

    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 实例类型编码，用作筛选

    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * 标签，用作筛选

    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * 组件类型编码，用作筛选
    */
    @SerializedName("ComponentCodes")
    @Expose
    private String [] ComponentCodes;

    /**
    * 组件名称编码，用作筛选
    */
    @SerializedName("ItemCodes")
    @Expose
    private String [] ItemCodes;

    /**
    * 模糊搜索：支持标签、资源id、资源别名
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 项目ID，用作筛选

    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 费用归集类型，枚举值如下：
0 - 分摊
1 - 归集
-1 - 未分配
    */
    @SerializedName("AllocationType")
    @Expose
    private Long [] AllocationType;

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
     * Get 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，以此类推 
     * @return Offset 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，以此类推
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，以此类推
     * @param Offset 分页偏移量，Offset=0表示第一页，如果Limit=100，则Offset=100表示第二页，Offset=200表示第三页，以此类推
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
RiTimeSpan - 预留实例抵扣时长
ExtendPayAmount1 - 预留实例抵扣组件原价
RealCost - 折后总价
CashPayAmount - 现金金额
VoucherPayAmount - 代金券金额
IncentivePayAmount - 赠送金金额
TransferPayAmount -分成金金额
Cost - 组件原价 
     * @return Sort 排序字段，枚举值如下：
RiTimeSpan - 预留实例抵扣时长
ExtendPayAmount1 - 预留实例抵扣组件原价
RealCost - 折后总价
CashPayAmount - 现金金额
VoucherPayAmount - 代金券金额
IncentivePayAmount - 赠送金金额
TransferPayAmount -分成金金额
Cost - 组件原价
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序字段，枚举值如下：
RiTimeSpan - 预留实例抵扣时长
ExtendPayAmount1 - 预留实例抵扣组件原价
RealCost - 折后总价
CashPayAmount - 现金金额
VoucherPayAmount - 代金券金额
IncentivePayAmount - 赠送金金额
TransferPayAmount -分成金金额
Cost - 组件原价
     * @param Sort 排序字段，枚举值如下：
RiTimeSpan - 预留实例抵扣时长
ExtendPayAmount1 - 预留实例抵扣组件原价
RealCost - 折后总价
CashPayAmount - 现金金额
VoucherPayAmount - 代金券金额
IncentivePayAmount - 赠送金金额
TransferPayAmount -分成金金额
Cost - 组件原价
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

    /**
     * Get 产品编码，用作筛选
 
     * @return BusinessCodes 产品编码，用作筛选

     */
    public String [] getBusinessCodes() {
        return this.BusinessCodes;
    }

    /**
     * Set 产品编码，用作筛选

     * @param BusinessCodes 产品编码，用作筛选

     */
    public void setBusinessCodes(String [] BusinessCodes) {
        this.BusinessCodes = BusinessCodes;
    }

    /**
     * Get 使用者UIN，用作筛选
 
     * @return OwnerUins 使用者UIN，用作筛选

     */
    public String [] getOwnerUins() {
        return this.OwnerUins;
    }

    /**
     * Set 使用者UIN，用作筛选

     * @param OwnerUins 使用者UIN，用作筛选

     */
    public void setOwnerUins(String [] OwnerUins) {
        this.OwnerUins = OwnerUins;
    }

    /**
     * Get 操作者UIN，用作筛选
 
     * @return OperateUins 操作者UIN，用作筛选

     */
    public String [] getOperateUins() {
        return this.OperateUins;
    }

    /**
     * Set 操作者UIN，用作筛选

     * @param OperateUins 操作者UIN，用作筛选

     */
    public void setOperateUins(String [] OperateUins) {
        this.OperateUins = OperateUins;
    }

    /**
     * Get 计费模式编码，用作筛选
 
     * @return PayModes 计费模式编码，用作筛选

     */
    public String [] getPayModes() {
        return this.PayModes;
    }

    /**
     * Set 计费模式编码，用作筛选

     * @param PayModes 计费模式编码，用作筛选

     */
    public void setPayModes(String [] PayModes) {
        this.PayModes = PayModes;
    }

    /**
     * Get 交易类型编码，用作筛选
 
     * @return ActionTypes 交易类型编码，用作筛选

     */
    public String [] getActionTypes() {
        return this.ActionTypes;
    }

    /**
     * Set 交易类型编码，用作筛选

     * @param ActionTypes 交易类型编码，用作筛选

     */
    public void setActionTypes(String [] ActionTypes) {
        this.ActionTypes = ActionTypes;
    }

    /**
     * Get 子产品编码，用作筛选
 
     * @return ProductCodes 子产品编码，用作筛选

     */
    public String [] getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set 子产品编码，用作筛选

     * @param ProductCodes 子产品编码，用作筛选

     */
    public void setProductCodes(String [] ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    /**
     * Get 地域ID，用作筛选
 
     * @return RegionIds 地域ID，用作筛选

     */
    public String [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set 地域ID，用作筛选

     * @param RegionIds 地域ID，用作筛选

     */
    public void setRegionIds(String [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get 可用区ID，用作筛选
 
     * @return ZoneIds 可用区ID，用作筛选

     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 可用区ID，用作筛选

     * @param ZoneIds 可用区ID，用作筛选

     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 实例类型编码，用作筛选
 
     * @return InstanceTypes 实例类型编码，用作筛选

     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set 实例类型编码，用作筛选

     * @param InstanceTypes 实例类型编码，用作筛选

     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get 标签，用作筛选
 
     * @return Tag 标签，用作筛选

     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set 标签，用作筛选

     * @param Tag 标签，用作筛选

     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 组件类型编码，用作筛选 
     * @return ComponentCodes 组件类型编码，用作筛选
     */
    public String [] getComponentCodes() {
        return this.ComponentCodes;
    }

    /**
     * Set 组件类型编码，用作筛选
     * @param ComponentCodes 组件类型编码，用作筛选
     */
    public void setComponentCodes(String [] ComponentCodes) {
        this.ComponentCodes = ComponentCodes;
    }

    /**
     * Get 组件名称编码，用作筛选 
     * @return ItemCodes 组件名称编码，用作筛选
     */
    public String [] getItemCodes() {
        return this.ItemCodes;
    }

    /**
     * Set 组件名称编码，用作筛选
     * @param ItemCodes 组件名称编码，用作筛选
     */
    public void setItemCodes(String [] ItemCodes) {
        this.ItemCodes = ItemCodes;
    }

    /**
     * Get 模糊搜索：支持标签、资源id、资源别名 
     * @return SearchKey 模糊搜索：支持标签、资源id、资源别名
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 模糊搜索：支持标签、资源id、资源别名
     * @param SearchKey 模糊搜索：支持标签、资源id、资源别名
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 项目ID，用作筛选
 
     * @return ProjectIds 项目ID，用作筛选

     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID，用作筛选

     * @param ProjectIds 项目ID，用作筛选

     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 费用归集类型，枚举值如下：
0 - 分摊
1 - 归集
-1 - 未分配 
     * @return AllocationType 费用归集类型，枚举值如下：
0 - 分摊
1 - 归集
-1 - 未分配
     */
    public Long [] getAllocationType() {
        return this.AllocationType;
    }

    /**
     * Set 费用归集类型，枚举值如下：
0 - 分摊
1 - 归集
-1 - 未分配
     * @param AllocationType 费用归集类型，枚举值如下：
0 - 分摊
1 - 归集
-1 - 未分配
     */
    public void setAllocationType(Long [] AllocationType) {
        this.AllocationType = AllocationType;
    }

    public DescribeAllocationSummaryByItemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationSummaryByItemRequest(DescribeAllocationSummaryByItemRequest source) {
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
        if (source.ComponentCodes != null) {
            this.ComponentCodes = new String[source.ComponentCodes.length];
            for (int i = 0; i < source.ComponentCodes.length; i++) {
                this.ComponentCodes[i] = new String(source.ComponentCodes[i]);
            }
        }
        if (source.ItemCodes != null) {
            this.ItemCodes = new String[source.ItemCodes.length];
            for (int i = 0; i < source.ItemCodes.length; i++) {
                this.ItemCodes[i] = new String(source.ItemCodes[i]);
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
        this.setParamArraySimple(map, prefix + "ComponentCodes.", this.ComponentCodes);
        this.setParamArraySimple(map, prefix + "ItemCodes.", this.ItemCodes);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "AllocationType.", this.AllocationType);

    }
}

