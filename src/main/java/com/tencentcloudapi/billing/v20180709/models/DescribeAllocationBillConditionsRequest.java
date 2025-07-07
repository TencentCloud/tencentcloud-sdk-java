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
    * 账单月份，格式为2024-02，不传默认当前月
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * 分账单元唯一标识，用作筛选
    */
    @SerializedName("TreeNodeUniqKeys")
    @Expose
    private String [] TreeNodeUniqKeys;

    /**
    * 日期
    */
    @SerializedName("BillDates")
    @Expose
    private String [] BillDates;

    /**
    * 产品编码
    */
    @SerializedName("BusinessCodes")
    @Expose
    private String [] BusinessCodes;

    /**
    * 使用者UIN
    */
    @SerializedName("OwnerUins")
    @Expose
    private String [] OwnerUins;

    /**
    * 操作者UIN
    */
    @SerializedName("OperateUins")
    @Expose
    private String [] OperateUins;

    /**
    * 计费模式编码
    */
    @SerializedName("PayModes")
    @Expose
    private String [] PayModes;

    /**
    * 交易类型编码
    */
    @SerializedName("ActionTypes")
    @Expose
    private String [] ActionTypes;

    /**
    * 子产品编码
    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
    * 地域ID
    */
    @SerializedName("RegionIds")
    @Expose
    private String [] RegionIds;

    /**
    * 可用区ID
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 实例类型编码
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * 标签
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * 组件类型编码
    */
    @SerializedName("ComponentCodes")
    @Expose
    private String [] ComponentCodes;

    /**
    * 组件名称编码
    */
    @SerializedName("ItemCodes")
    @Expose
    private String [] ItemCodes;

    /**
    * 模糊搜索条件
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 项目id
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 费用归集类型
    */
    @SerializedName("AllocationType")
    @Expose
    private Long [] AllocationType;

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
     * Get 日期 
     * @return BillDates 日期
     */
    public String [] getBillDates() {
        return this.BillDates;
    }

    /**
     * Set 日期
     * @param BillDates 日期
     */
    public void setBillDates(String [] BillDates) {
        this.BillDates = BillDates;
    }

    /**
     * Get 产品编码 
     * @return BusinessCodes 产品编码
     */
    public String [] getBusinessCodes() {
        return this.BusinessCodes;
    }

    /**
     * Set 产品编码
     * @param BusinessCodes 产品编码
     */
    public void setBusinessCodes(String [] BusinessCodes) {
        this.BusinessCodes = BusinessCodes;
    }

    /**
     * Get 使用者UIN 
     * @return OwnerUins 使用者UIN
     */
    public String [] getOwnerUins() {
        return this.OwnerUins;
    }

    /**
     * Set 使用者UIN
     * @param OwnerUins 使用者UIN
     */
    public void setOwnerUins(String [] OwnerUins) {
        this.OwnerUins = OwnerUins;
    }

    /**
     * Get 操作者UIN 
     * @return OperateUins 操作者UIN
     */
    public String [] getOperateUins() {
        return this.OperateUins;
    }

    /**
     * Set 操作者UIN
     * @param OperateUins 操作者UIN
     */
    public void setOperateUins(String [] OperateUins) {
        this.OperateUins = OperateUins;
    }

    /**
     * Get 计费模式编码 
     * @return PayModes 计费模式编码
     */
    public String [] getPayModes() {
        return this.PayModes;
    }

    /**
     * Set 计费模式编码
     * @param PayModes 计费模式编码
     */
    public void setPayModes(String [] PayModes) {
        this.PayModes = PayModes;
    }

    /**
     * Get 交易类型编码 
     * @return ActionTypes 交易类型编码
     */
    public String [] getActionTypes() {
        return this.ActionTypes;
    }

    /**
     * Set 交易类型编码
     * @param ActionTypes 交易类型编码
     */
    public void setActionTypes(String [] ActionTypes) {
        this.ActionTypes = ActionTypes;
    }

    /**
     * Get 子产品编码 
     * @return ProductCodes 子产品编码
     */
    public String [] getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set 子产品编码
     * @param ProductCodes 子产品编码
     */
    public void setProductCodes(String [] ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    /**
     * Get 地域ID 
     * @return RegionIds 地域ID
     */
    public String [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set 地域ID
     * @param RegionIds 地域ID
     */
    public void setRegionIds(String [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get 可用区ID 
     * @return ZoneIds 可用区ID
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 可用区ID
     * @param ZoneIds 可用区ID
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 实例类型编码 
     * @return InstanceTypes 实例类型编码
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set 实例类型编码
     * @param InstanceTypes 实例类型编码
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get 标签 
     * @return Tag 标签
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set 标签
     * @param Tag 标签
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 组件类型编码 
     * @return ComponentCodes 组件类型编码
     */
    public String [] getComponentCodes() {
        return this.ComponentCodes;
    }

    /**
     * Set 组件类型编码
     * @param ComponentCodes 组件类型编码
     */
    public void setComponentCodes(String [] ComponentCodes) {
        this.ComponentCodes = ComponentCodes;
    }

    /**
     * Get 组件名称编码 
     * @return ItemCodes 组件名称编码
     */
    public String [] getItemCodes() {
        return this.ItemCodes;
    }

    /**
     * Set 组件名称编码
     * @param ItemCodes 组件名称编码
     */
    public void setItemCodes(String [] ItemCodes) {
        this.ItemCodes = ItemCodes;
    }

    /**
     * Get 模糊搜索条件 
     * @return SearchKey 模糊搜索条件
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 模糊搜索条件
     * @param SearchKey 模糊搜索条件
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 项目id 
     * @return ProjectIds 项目id
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目id
     * @param ProjectIds 项目id
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 费用归集类型 
     * @return AllocationType 费用归集类型
     */
    public Long [] getAllocationType() {
        return this.AllocationType;
    }

    /**
     * Set 费用归集类型
     * @param AllocationType 费用归集类型
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

