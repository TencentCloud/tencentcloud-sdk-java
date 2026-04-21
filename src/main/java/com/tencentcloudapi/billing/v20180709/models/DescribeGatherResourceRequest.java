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

public class DescribeGatherResourceRequest extends AbstractModel {

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
    * <p>分账单元唯一标识，用作筛选</p>
    */
    @SerializedName("TreeNodeUniqKey")
    @Expose
    private String TreeNodeUniqKey;

    /**
    * <p>资源目录类别，枚举值如下：<br>all - 全部<br>none - 未归集</p>
    */
    @SerializedName("GatherType")
    @Expose
    private String GatherType;

    /**
    * <p>排序字段，枚举值如下：<br>realCost  - 折后总价<br>cashPayAmount - 现金金额<br>voucherPayAmount - 代金券金额<br>incentivePayAmount  - 赠送金金额<br>transferPayAmount -分成金金额</p>
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
    * <p>产品编码，用作筛选</p>
    */
    @SerializedName("BusinessCodes")
    @Expose
    private String [] BusinessCodes;

    /**
    * <p>子产品编码，用作筛选</p>
    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
    * <p>组件名称编码，用作筛选</p>
    */
    @SerializedName("ItemCodes")
    @Expose
    private String [] ItemCodes;

    /**
    * <p>地域ID，用作筛选</p>
    */
    @SerializedName("RegionIds")
    @Expose
    private Long [] RegionIds;

    /**
    * <p>实例类型编码，用作筛选</p>
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * <p>计费模式编码，用作筛选</p>
    */
    @SerializedName("PayModes")
    @Expose
    private String [] PayModes;

    /**
    * <p>操作者UIN，用作筛选</p>
    */
    @SerializedName("OperateUins")
    @Expose
    private String [] OperateUins;

    /**
    * <p>使用者UIN，用作筛选</p>
    */
    @SerializedName("OwnerUins")
    @Expose
    private String [] OwnerUins;

    /**
    * <p>模糊搜索：支持标签、资源id、资源别名</p>
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * <p>标签，用作筛选</p>
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * <p>项目ID，用作筛选</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * <p>交易类型编码，用作筛选</p>
    */
    @SerializedName("ActionTypes")
    @Expose
    private String [] ActionTypes;

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
     * Get <p>分账单元唯一标识，用作筛选</p> 
     * @return TreeNodeUniqKey <p>分账单元唯一标识，用作筛选</p>
     */
    public String getTreeNodeUniqKey() {
        return this.TreeNodeUniqKey;
    }

    /**
     * Set <p>分账单元唯一标识，用作筛选</p>
     * @param TreeNodeUniqKey <p>分账单元唯一标识，用作筛选</p>
     */
    public void setTreeNodeUniqKey(String TreeNodeUniqKey) {
        this.TreeNodeUniqKey = TreeNodeUniqKey;
    }

    /**
     * Get <p>资源目录类别，枚举值如下：<br>all - 全部<br>none - 未归集</p> 
     * @return GatherType <p>资源目录类别，枚举值如下：<br>all - 全部<br>none - 未归集</p>
     */
    public String getGatherType() {
        return this.GatherType;
    }

    /**
     * Set <p>资源目录类别，枚举值如下：<br>all - 全部<br>none - 未归集</p>
     * @param GatherType <p>资源目录类别，枚举值如下：<br>all - 全部<br>none - 未归集</p>
     */
    public void setGatherType(String GatherType) {
        this.GatherType = GatherType;
    }

    /**
     * Get <p>排序字段，枚举值如下：<br>realCost  - 折后总价<br>cashPayAmount - 现金金额<br>voucherPayAmount - 代金券金额<br>incentivePayAmount  - 赠送金金额<br>transferPayAmount -分成金金额</p> 
     * @return Sort <p>排序字段，枚举值如下：<br>realCost  - 折后总价<br>cashPayAmount - 现金金额<br>voucherPayAmount - 代金券金额<br>incentivePayAmount  - 赠送金金额<br>transferPayAmount -分成金金额</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序字段，枚举值如下：<br>realCost  - 折后总价<br>cashPayAmount - 现金金额<br>voucherPayAmount - 代金券金额<br>incentivePayAmount  - 赠送金金额<br>transferPayAmount -分成金金额</p>
     * @param Sort <p>排序字段，枚举值如下：<br>realCost  - 折后总价<br>cashPayAmount - 现金金额<br>voucherPayAmount - 代金券金额<br>incentivePayAmount  - 赠送金金额<br>transferPayAmount -分成金金额</p>
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
     * Get <p>组件名称编码，用作筛选</p> 
     * @return ItemCodes <p>组件名称编码，用作筛选</p>
     */
    public String [] getItemCodes() {
        return this.ItemCodes;
    }

    /**
     * Set <p>组件名称编码，用作筛选</p>
     * @param ItemCodes <p>组件名称编码，用作筛选</p>
     */
    public void setItemCodes(String [] ItemCodes) {
        this.ItemCodes = ItemCodes;
    }

    /**
     * Get <p>地域ID，用作筛选</p> 
     * @return RegionIds <p>地域ID，用作筛选</p>
     */
    public Long [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set <p>地域ID，用作筛选</p>
     * @param RegionIds <p>地域ID，用作筛选</p>
     */
    public void setRegionIds(Long [] RegionIds) {
        this.RegionIds = RegionIds;
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
     * Get <p>项目ID，用作筛选</p> 
     * @return ProjectIds <p>项目ID，用作筛选</p>
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>项目ID，用作筛选</p>
     * @param ProjectIds <p>项目ID，用作筛选</p>
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
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

