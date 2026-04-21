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

public class DescribeAllocationBillConditionsRequest extends AbstractModel {

    /**
    * <p>账单月份，格式为2024-02，不传默认当前月</p>
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * <p>分账单元唯一标识，用作筛选</p>
    */
    @SerializedName("TreeNodeUniqKeys")
    @Expose
    private String [] TreeNodeUniqKeys;

    /**
    * <p>日期</p>
    */
    @SerializedName("BillDates")
    @Expose
    private String [] BillDates;

    /**
    * <p>产品编码</p>
    */
    @SerializedName("BusinessCodes")
    @Expose
    private String [] BusinessCodes;

    /**
    * <p>使用者UIN</p>
    */
    @SerializedName("OwnerUins")
    @Expose
    private String [] OwnerUins;

    /**
    * <p>操作者UIN</p>
    */
    @SerializedName("OperateUins")
    @Expose
    private String [] OperateUins;

    /**
    * <p>计费模式编码</p>
    */
    @SerializedName("PayModes")
    @Expose
    private String [] PayModes;

    /**
    * <p>交易类型编码</p>
    */
    @SerializedName("ActionTypes")
    @Expose
    private String [] ActionTypes;

    /**
    * <p>子产品编码</p>
    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
    * <p>地域ID</p>
    */
    @SerializedName("RegionIds")
    @Expose
    private String [] RegionIds;

    /**
    * <p>可用区ID</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * <p>实例类型编码</p>
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * <p>组件类型编码</p>
    */
    @SerializedName("ComponentCodes")
    @Expose
    private String [] ComponentCodes;

    /**
    * <p>组件名称编码</p>
    */
    @SerializedName("ItemCodes")
    @Expose
    private String [] ItemCodes;

    /**
    * <p>模糊搜索条件</p>
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * <p>费用归集类型</p><p>枚举值：</p><ul><li>0： 分摊</li><li>1： 归集</li><li>-1： 未分配</li></ul>
    */
    @SerializedName("AllocationType")
    @Expose
    private Long [] AllocationType;

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
     * Get <p>日期</p> 
     * @return BillDates <p>日期</p>
     */
    public String [] getBillDates() {
        return this.BillDates;
    }

    /**
     * Set <p>日期</p>
     * @param BillDates <p>日期</p>
     */
    public void setBillDates(String [] BillDates) {
        this.BillDates = BillDates;
    }

    /**
     * Get <p>产品编码</p> 
     * @return BusinessCodes <p>产品编码</p>
     */
    public String [] getBusinessCodes() {
        return this.BusinessCodes;
    }

    /**
     * Set <p>产品编码</p>
     * @param BusinessCodes <p>产品编码</p>
     */
    public void setBusinessCodes(String [] BusinessCodes) {
        this.BusinessCodes = BusinessCodes;
    }

    /**
     * Get <p>使用者UIN</p> 
     * @return OwnerUins <p>使用者UIN</p>
     */
    public String [] getOwnerUins() {
        return this.OwnerUins;
    }

    /**
     * Set <p>使用者UIN</p>
     * @param OwnerUins <p>使用者UIN</p>
     */
    public void setOwnerUins(String [] OwnerUins) {
        this.OwnerUins = OwnerUins;
    }

    /**
     * Get <p>操作者UIN</p> 
     * @return OperateUins <p>操作者UIN</p>
     */
    public String [] getOperateUins() {
        return this.OperateUins;
    }

    /**
     * Set <p>操作者UIN</p>
     * @param OperateUins <p>操作者UIN</p>
     */
    public void setOperateUins(String [] OperateUins) {
        this.OperateUins = OperateUins;
    }

    /**
     * Get <p>计费模式编码</p> 
     * @return PayModes <p>计费模式编码</p>
     */
    public String [] getPayModes() {
        return this.PayModes;
    }

    /**
     * Set <p>计费模式编码</p>
     * @param PayModes <p>计费模式编码</p>
     */
    public void setPayModes(String [] PayModes) {
        this.PayModes = PayModes;
    }

    /**
     * Get <p>交易类型编码</p> 
     * @return ActionTypes <p>交易类型编码</p>
     */
    public String [] getActionTypes() {
        return this.ActionTypes;
    }

    /**
     * Set <p>交易类型编码</p>
     * @param ActionTypes <p>交易类型编码</p>
     */
    public void setActionTypes(String [] ActionTypes) {
        this.ActionTypes = ActionTypes;
    }

    /**
     * Get <p>子产品编码</p> 
     * @return ProductCodes <p>子产品编码</p>
     */
    public String [] getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set <p>子产品编码</p>
     * @param ProductCodes <p>子产品编码</p>
     */
    public void setProductCodes(String [] ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    /**
     * Get <p>地域ID</p> 
     * @return RegionIds <p>地域ID</p>
     */
    public String [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set <p>地域ID</p>
     * @param RegionIds <p>地域ID</p>
     */
    public void setRegionIds(String [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get <p>可用区ID</p> 
     * @return ZoneIds <p>可用区ID</p>
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>可用区ID</p>
     * @param ZoneIds <p>可用区ID</p>
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>实例类型编码</p> 
     * @return InstanceTypes <p>实例类型编码</p>
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set <p>实例类型编码</p>
     * @param InstanceTypes <p>实例类型编码</p>
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get <p>标签</p> 
     * @return Tag <p>标签</p>
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set <p>标签</p>
     * @param Tag <p>标签</p>
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>组件类型编码</p> 
     * @return ComponentCodes <p>组件类型编码</p>
     */
    public String [] getComponentCodes() {
        return this.ComponentCodes;
    }

    /**
     * Set <p>组件类型编码</p>
     * @param ComponentCodes <p>组件类型编码</p>
     */
    public void setComponentCodes(String [] ComponentCodes) {
        this.ComponentCodes = ComponentCodes;
    }

    /**
     * Get <p>组件名称编码</p> 
     * @return ItemCodes <p>组件名称编码</p>
     */
    public String [] getItemCodes() {
        return this.ItemCodes;
    }

    /**
     * Set <p>组件名称编码</p>
     * @param ItemCodes <p>组件名称编码</p>
     */
    public void setItemCodes(String [] ItemCodes) {
        this.ItemCodes = ItemCodes;
    }

    /**
     * Get <p>模糊搜索条件</p> 
     * @return SearchKey <p>模糊搜索条件</p>
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set <p>模糊搜索条件</p>
     * @param SearchKey <p>模糊搜索条件</p>
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get <p>项目id</p> 
     * @return ProjectIds <p>项目id</p>
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>项目id</p>
     * @param ProjectIds <p>项目id</p>
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>费用归集类型</p><p>枚举值：</p><ul><li>0： 分摊</li><li>1： 归集</li><li>-1： 未分配</li></ul> 
     * @return AllocationType <p>费用归集类型</p><p>枚举值：</p><ul><li>0： 分摊</li><li>1： 归集</li><li>-1： 未分配</li></ul>
     */
    public Long [] getAllocationType() {
        return this.AllocationType;
    }

    /**
     * Set <p>费用归集类型</p><p>枚举值：</p><ul><li>0： 分摊</li><li>1： 归集</li><li>-1： 未分配</li></ul>
     * @param AllocationType <p>费用归集类型</p><p>枚举值：</p><ul><li>0： 分摊</li><li>1： 归集</li><li>-1： 未分配</li></ul>
     */
    public void setAllocationType(Long [] AllocationType) {
        this.AllocationType = AllocationType;
    }

    public DescribeAllocationBillConditionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationBillConditionsRequest(DescribeAllocationBillConditionsRequest source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.TreeNodeUniqKeys != null) {
            this.TreeNodeUniqKeys = new String[source.TreeNodeUniqKeys.length];
            for (int i = 0; i < source.TreeNodeUniqKeys.length; i++) {
                this.TreeNodeUniqKeys[i] = new String(source.TreeNodeUniqKeys[i]);
            }
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
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamArraySimple(map, prefix + "TreeNodeUniqKeys.", this.TreeNodeUniqKeys);
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

