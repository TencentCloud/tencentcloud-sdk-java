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

public class BudgetConditionsForm extends AbstractModel {

    /**
    * <p>产品</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Business")
    @Expose
    private String [] Business;

    /**
    * <p>计费模式</p><p>枚举值：</p><ul><li>prePay： 包年包月</li><li>postPay： 按量计费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private String [] PayMode;

    /**
    * <p>子产品</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
    * <p>组件编码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentCodes")
    @Expose
    private String [] ComponentCodes;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionIds")
    @Expose
    private String [] RegionIds;

    /**
    * <p>项目</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * <p>交易类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionTypes")
    @Expose
    private String [] ActionTypes;

    /**
    * <p>消耗类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumptionTypes")
    @Expose
    private String [] ConsumptionTypes;

    /**
    * <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagsForm [] Tags;

    /**
    * <p>末级分账单元</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayerUins")
    @Expose
    private String [] PayerUins;

    /**
    * <p>主用户Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUins")
    @Expose
    private String [] OwnerUins;

    /**
    * <p>末级分账单元唯一键</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TreeNodeUniqKeys")
    @Expose
    private String [] TreeNodeUniqKeys;

    /**
     * Get <p>产品</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Business <p>产品</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>产品</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Business <p>产品</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusiness(String [] Business) {
        this.Business = Business;
    }

    /**
     * Get <p>计费模式</p><p>枚举值：</p><ul><li>prePay： 包年包月</li><li>postPay： 按量计费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode <p>计费模式</p><p>枚举值：</p><ul><li>prePay： 包年包月</li><li>postPay： 按量计费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计费模式</p><p>枚举值：</p><ul><li>prePay： 包年包月</li><li>postPay： 按量计费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode <p>计费模式</p><p>枚举值：</p><ul><li>prePay： 包年包月</li><li>postPay： 按量计费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(String [] PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>子产品</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCodes <p>子产品</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set <p>子产品</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCodes <p>子产品</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCodes(String [] ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    /**
     * Get <p>组件编码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentCodes <p>组件编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getComponentCodes() {
        return this.ComponentCodes;
    }

    /**
     * Set <p>组件编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentCodes <p>组件编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentCodes(String [] ComponentCodes) {
        this.ComponentCodes = ComponentCodes;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneIds <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneIds <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionIds <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionIds <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionIds(String [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get <p>项目</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectIds <p>项目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>项目</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectIds <p>项目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>交易类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionTypes <p>交易类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getActionTypes() {
        return this.ActionTypes;
    }

    /**
     * Set <p>交易类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionTypes <p>交易类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionTypes(String [] ActionTypes) {
        this.ActionTypes = ActionTypes;
    }

    /**
     * Get <p>消耗类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumptionTypes <p>消耗类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getConsumptionTypes() {
        return this.ConsumptionTypes;
    }

    /**
     * Set <p>消耗类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumptionTypes <p>消耗类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumptionTypes(String [] ConsumptionTypes) {
        this.ConsumptionTypes = ConsumptionTypes;
    }

    /**
     * Get <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagsForm [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagsForm [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>末级分账单元</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayerUins <p>末级分账单元</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPayerUins() {
        return this.PayerUins;
    }

    /**
     * Set <p>末级分账单元</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayerUins <p>末级分账单元</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayerUins(String [] PayerUins) {
        this.PayerUins = PayerUins;
    }

    /**
     * Get <p>主用户Uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUins <p>主用户Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOwnerUins() {
        return this.OwnerUins;
    }

    /**
     * Set <p>主用户Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUins <p>主用户Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUins(String [] OwnerUins) {
        this.OwnerUins = OwnerUins;
    }

    /**
     * Get <p>末级分账单元唯一键</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TreeNodeUniqKeys <p>末级分账单元唯一键</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTreeNodeUniqKeys() {
        return this.TreeNodeUniqKeys;
    }

    /**
     * Set <p>末级分账单元唯一键</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TreeNodeUniqKeys <p>末级分账单元唯一键</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTreeNodeUniqKeys(String [] TreeNodeUniqKeys) {
        this.TreeNodeUniqKeys = TreeNodeUniqKeys;
    }

    public BudgetConditionsForm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetConditionsForm(BudgetConditionsForm source) {
        if (source.Business != null) {
            this.Business = new String[source.Business.length];
            for (int i = 0; i < source.Business.length; i++) {
                this.Business[i] = new String(source.Business[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new String[source.PayMode.length];
            for (int i = 0; i < source.PayMode.length; i++) {
                this.PayMode[i] = new String(source.PayMode[i]);
            }
        }
        if (source.ProductCodes != null) {
            this.ProductCodes = new String[source.ProductCodes.length];
            for (int i = 0; i < source.ProductCodes.length; i++) {
                this.ProductCodes[i] = new String(source.ProductCodes[i]);
            }
        }
        if (source.ComponentCodes != null) {
            this.ComponentCodes = new String[source.ComponentCodes.length];
            for (int i = 0; i < source.ComponentCodes.length; i++) {
                this.ComponentCodes[i] = new String(source.ComponentCodes[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.RegionIds != null) {
            this.RegionIds = new String[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new String(source.RegionIds[i]);
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
        if (source.ConsumptionTypes != null) {
            this.ConsumptionTypes = new String[source.ConsumptionTypes.length];
            for (int i = 0; i < source.ConsumptionTypes.length; i++) {
                this.ConsumptionTypes[i] = new String(source.ConsumptionTypes[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagsForm[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagsForm(source.Tags[i]);
            }
        }
        if (source.PayerUins != null) {
            this.PayerUins = new String[source.PayerUins.length];
            for (int i = 0; i < source.PayerUins.length; i++) {
                this.PayerUins[i] = new String(source.PayerUins[i]);
            }
        }
        if (source.OwnerUins != null) {
            this.OwnerUins = new String[source.OwnerUins.length];
            for (int i = 0; i < source.OwnerUins.length; i++) {
                this.OwnerUins[i] = new String(source.OwnerUins[i]);
            }
        }
        if (source.TreeNodeUniqKeys != null) {
            this.TreeNodeUniqKeys = new String[source.TreeNodeUniqKeys.length];
            for (int i = 0; i < source.TreeNodeUniqKeys.length; i++) {
                this.TreeNodeUniqKeys[i] = new String(source.TreeNodeUniqKeys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Business.", this.Business);
        this.setParamArraySimple(map, prefix + "PayMode.", this.PayMode);
        this.setParamArraySimple(map, prefix + "ProductCodes.", this.ProductCodes);
        this.setParamArraySimple(map, prefix + "ComponentCodes.", this.ComponentCodes);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "ActionTypes.", this.ActionTypes);
        this.setParamArraySimple(map, prefix + "ConsumptionTypes.", this.ConsumptionTypes);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "PayerUins.", this.PayerUins);
        this.setParamArraySimple(map, prefix + "OwnerUins.", this.OwnerUins);
        this.setParamArraySimple(map, prefix + "TreeNodeUniqKeys.", this.TreeNodeUniqKeys);

    }
}

