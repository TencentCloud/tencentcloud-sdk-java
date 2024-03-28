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

public class DescribeGatherResourceRequest extends AbstractModel {

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
    * 分账单元唯一标识，用作筛选
    */
    @SerializedName("TreeNodeUniqKey")
    @Expose
    private String TreeNodeUniqKey;

    /**
    * 资源目录类别，枚举值如下：
all - 全部 
none - 未归集
    */
    @SerializedName("GatherType")
    @Expose
    private String GatherType;

    /**
    * 排序字段，枚举值如下：
realCost  - 折后总价
cashPayAmount - 现金金额
voucherPayAmount - 代金券金额
incentivePayAmount  - 赠送金金额
transferPayAmount -分成金金额
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
    * 产品编码，用作筛选
    */
    @SerializedName("BusinessCodes")
    @Expose
    private String [] BusinessCodes;

    /**
    * 子产品编码，用作筛选
    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
    * 组件名称编码，用作筛选
    */
    @SerializedName("ItemCodes")
    @Expose
    private String [] ItemCodes;

    /**
    * 地域ID，用作筛选
    */
    @SerializedName("RegionIds")
    @Expose
    private Long [] RegionIds;

    /**
    * 实例类型编码，用作筛选
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * 计费模式编码，用作筛选
    */
    @SerializedName("PayModes")
    @Expose
    private String [] PayModes;

    /**
    * 操作者UIN，用作筛选
    */
    @SerializedName("OperateUins")
    @Expose
    private String [] OperateUins;

    /**
    * 使用者UIN，用作筛选
    */
    @SerializedName("OwnerUins")
    @Expose
    private String [] OwnerUins;

    /**
    * 模糊搜索：支持标签、资源id、资源别名
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 标签，用作筛选
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * 项目ID，用作筛选
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * 交易类型编码，用作筛选
    */
    @SerializedName("ActionTypes")
    @Expose
    private String [] ActionTypes;

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
     * Get 分账单元唯一标识，用作筛选 
     * @return TreeNodeUniqKey 分账单元唯一标识，用作筛选
     */
    public String getTreeNodeUniqKey() {
        return this.TreeNodeUniqKey;
    }

    /**
     * Set 分账单元唯一标识，用作筛选
     * @param TreeNodeUniqKey 分账单元唯一标识，用作筛选
     */
    public void setTreeNodeUniqKey(String TreeNodeUniqKey) {
        this.TreeNodeUniqKey = TreeNodeUniqKey;
    }

    /**
     * Get 资源目录类别，枚举值如下：
all - 全部 
none - 未归集 
     * @return GatherType 资源目录类别，枚举值如下：
all - 全部 
none - 未归集
     */
    public String getGatherType() {
        return this.GatherType;
    }

    /**
     * Set 资源目录类别，枚举值如下：
all - 全部 
none - 未归集
     * @param GatherType 资源目录类别，枚举值如下：
all - 全部 
none - 未归集
     */
    public void setGatherType(String GatherType) {
        this.GatherType = GatherType;
    }

    /**
     * Get 排序字段，枚举值如下：
realCost  - 折后总价
cashPayAmount - 现金金额
voucherPayAmount - 代金券金额
incentivePayAmount  - 赠送金金额
transferPayAmount -分成金金额 
     * @return Sort 排序字段，枚举值如下：
realCost  - 折后总价
cashPayAmount - 现金金额
voucherPayAmount - 代金券金额
incentivePayAmount  - 赠送金金额
transferPayAmount -分成金金额
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序字段，枚举值如下：
realCost  - 折后总价
cashPayAmount - 现金金额
voucherPayAmount - 代金券金额
incentivePayAmount  - 赠送金金额
transferPayAmount -分成金金额
     * @param Sort 排序字段，枚举值如下：
realCost  - 折后总价
cashPayAmount - 现金金额
voucherPayAmount - 代金券金额
incentivePayAmount  - 赠送金金额
transferPayAmount -分成金金额
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
     * Get 地域ID，用作筛选 
     * @return RegionIds 地域ID，用作筛选
     */
    public Long [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set 地域ID，用作筛选
     * @param RegionIds 地域ID，用作筛选
     */
    public void setRegionIds(Long [] RegionIds) {
        this.RegionIds = RegionIds;
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
     * Get 项目ID，用作筛选 
     * @return ProjectIds 项目ID，用作筛选
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID，用作筛选
     * @param ProjectIds 项目ID，用作筛选
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
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

    public DescribeGatherResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatherResourceRequest(DescribeGatherResourceRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.TreeNodeUniqKey != null) {
            this.TreeNodeUniqKey = new String(source.TreeNodeUniqKey);
        }
        if (source.GatherType != null) {
            this.GatherType = new String(source.GatherType);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.BusinessCodes != null) {
            this.BusinessCodes = new String[source.BusinessCodes.length];
            for (int i = 0; i < source.BusinessCodes.length; i++) {
                this.BusinessCodes[i] = new String(source.BusinessCodes[i]);
            }
        }
        if (source.ProductCodes != null) {
            this.ProductCodes = new String[source.ProductCodes.length];
            for (int i = 0; i < source.ProductCodes.length; i++) {
                this.ProductCodes[i] = new String(source.ProductCodes[i]);
            }
        }
        if (source.ItemCodes != null) {
            this.ItemCodes = new String[source.ItemCodes.length];
            for (int i = 0; i < source.ItemCodes.length; i++) {
                this.ItemCodes[i] = new String(source.ItemCodes[i]);
            }
        }
        if (source.RegionIds != null) {
            this.RegionIds = new Long[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new Long(source.RegionIds[i]);
            }
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new String[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new String(source.InstanceTypes[i]);
            }
        }
        if (source.PayModes != null) {
            this.PayModes = new String[source.PayModes.length];
            for (int i = 0; i < source.PayModes.length; i++) {
                this.PayModes[i] = new String(source.PayModes[i]);
            }
        }
        if (source.OperateUins != null) {
            this.OperateUins = new String[source.OperateUins.length];
            for (int i = 0; i < source.OperateUins.length; i++) {
                this.OperateUins[i] = new String(source.OperateUins[i]);
            }
        }
        if (source.OwnerUins != null) {
            this.OwnerUins = new String[source.OwnerUins.length];
            for (int i = 0; i < source.OwnerUins.length; i++) {
                this.OwnerUins[i] = new String(source.OwnerUins[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.Tag != null) {
            this.Tag = new String[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new String(source.Tag[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.ActionTypes != null) {
            this.ActionTypes = new String[source.ActionTypes.length];
            for (int i = 0; i < source.ActionTypes.length; i++) {
                this.ActionTypes[i] = new String(source.ActionTypes[i]);
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
        this.setParamSimple(map, prefix + "TreeNodeUniqKey", this.TreeNodeUniqKey);
        this.setParamSimple(map, prefix + "GatherType", this.GatherType);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamArraySimple(map, prefix + "BusinessCodes.", this.BusinessCodes);
        this.setParamArraySimple(map, prefix + "ProductCodes.", this.ProductCodes);
        this.setParamArraySimple(map, prefix + "ItemCodes.", this.ItemCodes);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamArraySimple(map, prefix + "PayModes.", this.PayModes);
        this.setParamArraySimple(map, prefix + "OperateUins.", this.OperateUins);
        this.setParamArraySimple(map, prefix + "OwnerUins.", this.OwnerUins);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "Tag.", this.Tag);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "ActionTypes.", this.ActionTypes);

    }
}

