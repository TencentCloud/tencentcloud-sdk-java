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

public class DescribeAllocationBillConditionsResponse extends AbstractModel {

    /**
    * 产品筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Business")
    @Expose
    private BillBusiness [] Business;

    /**
    * 子产品筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Product")
    @Expose
    private BillProduct [] Product;

    /**
    * 组件名称筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Item")
    @Expose
    private BillItem [] Item;

    /**
    * 地域筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private BillRegion [] Region;

    /**
    * 实例类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private BillInstanceType [] InstanceType;

    /**
    * 计费模式筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private BillPayMode [] PayMode;

    /**
    * 项目筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Project")
    @Expose
    private BillProject [] Project;

    /**
    * 标签筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private BillTag [] Tag;

    /**
    * 使用者 UIN 筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private BillOwnerUin [] OwnerUin;

    /**
    * 操作者 UIN 筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateUin")
    @Expose
    private BillOperateUin [] OperateUin;

    /**
    * 日期筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillDay")
    @Expose
    private BillDays [] BillDay;

    /**
    * 交易类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionType")
    @Expose
    private BillActionType [] ActionType;

    /**
    * 组件类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Component")
    @Expose
    private BillComponent [] Component;

    /**
    * 可用区筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private BillZoneId [] Zone;

    /**
    * 分账单元筛选列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllocationTreeNode")
    @Expose
    private AllocationTreeNode [] AllocationTreeNode;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 产品筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Business 产品筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillBusiness [] getBusiness() {
        return this.Business;
    }

    /**
     * Set 产品筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Business 产品筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusiness(BillBusiness [] Business) {
        this.Business = Business;
    }

    /**
     * Get 子产品筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Product 子产品筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillProduct [] getProduct() {
        return this.Product;
    }

    /**
     * Set 子产品筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Product 子产品筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProduct(BillProduct [] Product) {
        this.Product = Product;
    }

    /**
     * Get 组件名称筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Item 组件名称筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillItem [] getItem() {
        return this.Item;
    }

    /**
     * Set 组件名称筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Item 组件名称筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItem(BillItem [] Item) {
        this.Item = Item;
    }

    /**
     * Get 地域筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillRegion [] getRegion() {
        return this.Region;
    }

    /**
     * Set 地域筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(BillRegion [] Region) {
        this.Region = Region;
    }

    /**
     * Get 实例类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 实例类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillInstanceType [] getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 实例类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(BillInstanceType [] InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 计费模式筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 计费模式筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillPayMode [] getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 计费模式筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(BillPayMode [] PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 项目筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Project 项目筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillProject [] getProject() {
        return this.Project;
    }

    /**
     * Set 项目筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Project 项目筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProject(BillProject [] Project) {
        this.Project = Project;
    }

    /**
     * Get 标签筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 标签筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 标签筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 标签筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(BillTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 使用者 UIN 筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 使用者 UIN 筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillOwnerUin [] getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 使用者 UIN 筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 使用者 UIN 筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(BillOwnerUin [] OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 操作者 UIN 筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateUin 操作者 UIN 筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillOperateUin [] getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set 操作者 UIN 筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateUin 操作者 UIN 筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateUin(BillOperateUin [] OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get 日期筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillDay 日期筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillDays [] getBillDay() {
        return this.BillDay;
    }

    /**
     * Set 日期筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillDay 日期筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillDay(BillDays [] BillDay) {
        this.BillDay = BillDay;
    }

    /**
     * Get 交易类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionType 交易类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillActionType [] getActionType() {
        return this.ActionType;
    }

    /**
     * Set 交易类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionType 交易类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionType(BillActionType [] ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 组件类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Component 组件类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillComponent [] getComponent() {
        return this.Component;
    }

    /**
     * Set 组件类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Component 组件类型筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponent(BillComponent [] Component) {
        this.Component = Component;
    }

    /**
     * Get 可用区筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillZoneId [] getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(BillZoneId [] Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 分账单元筛选列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllocationTreeNode 分账单元筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AllocationTreeNode [] getAllocationTreeNode() {
        return this.AllocationTreeNode;
    }

    /**
     * Set 分账单元筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllocationTreeNode 分账单元筛选列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllocationTreeNode(AllocationTreeNode [] AllocationTreeNode) {
        this.AllocationTreeNode = AllocationTreeNode;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAllocationBillConditionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationBillConditionsResponse(DescribeAllocationBillConditionsResponse source) {
        if (source.Business != null) {
            this.Business = new BillBusiness[source.Business.length];
            for (int i = 0; i < source.Business.length; i++) {
                this.Business[i] = new BillBusiness(source.Business[i]);
            }
        }
        if (source.Product != null) {
            this.Product = new BillProduct[source.Product.length];
            for (int i = 0; i < source.Product.length; i++) {
                this.Product[i] = new BillProduct(source.Product[i]);
            }
        }
        if (source.Item != null) {
            this.Item = new BillItem[source.Item.length];
            for (int i = 0; i < source.Item.length; i++) {
                this.Item[i] = new BillItem(source.Item[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new BillRegion[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new BillRegion(source.Region[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new BillInstanceType[source.InstanceType.length];
            for (int i = 0; i < source.InstanceType.length; i++) {
                this.InstanceType[i] = new BillInstanceType(source.InstanceType[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new BillPayMode[source.PayMode.length];
            for (int i = 0; i < source.PayMode.length; i++) {
                this.PayMode[i] = new BillPayMode(source.PayMode[i]);
            }
        }
        if (source.Project != null) {
            this.Project = new BillProject[source.Project.length];
            for (int i = 0; i < source.Project.length; i++) {
                this.Project[i] = new BillProject(source.Project[i]);
            }
        }
        if (source.Tag != null) {
            this.Tag = new BillTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new BillTag(source.Tag[i]);
            }
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new BillOwnerUin[source.OwnerUin.length];
            for (int i = 0; i < source.OwnerUin.length; i++) {
                this.OwnerUin[i] = new BillOwnerUin(source.OwnerUin[i]);
            }
        }
        if (source.OperateUin != null) {
            this.OperateUin = new BillOperateUin[source.OperateUin.length];
            for (int i = 0; i < source.OperateUin.length; i++) {
                this.OperateUin[i] = new BillOperateUin(source.OperateUin[i]);
            }
        }
        if (source.BillDay != null) {
            this.BillDay = new BillDays[source.BillDay.length];
            for (int i = 0; i < source.BillDay.length; i++) {
                this.BillDay[i] = new BillDays(source.BillDay[i]);
            }
        }
        if (source.ActionType != null) {
            this.ActionType = new BillActionType[source.ActionType.length];
            for (int i = 0; i < source.ActionType.length; i++) {
                this.ActionType[i] = new BillActionType(source.ActionType[i]);
            }
        }
        if (source.Component != null) {
            this.Component = new BillComponent[source.Component.length];
            for (int i = 0; i < source.Component.length; i++) {
                this.Component[i] = new BillComponent(source.Component[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new BillZoneId[source.Zone.length];
            for (int i = 0; i < source.Zone.length; i++) {
                this.Zone[i] = new BillZoneId(source.Zone[i]);
            }
        }
        if (source.AllocationTreeNode != null) {
            this.AllocationTreeNode = new AllocationTreeNode[source.AllocationTreeNode.length];
            for (int i = 0; i < source.AllocationTreeNode.length; i++) {
                this.AllocationTreeNode[i] = new AllocationTreeNode(source.AllocationTreeNode[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Business.", this.Business);
        this.setParamArrayObj(map, prefix + "Product.", this.Product);
        this.setParamArrayObj(map, prefix + "Item.", this.Item);
        this.setParamArrayObj(map, prefix + "Region.", this.Region);
        this.setParamArrayObj(map, prefix + "InstanceType.", this.InstanceType);
        this.setParamArrayObj(map, prefix + "PayMode.", this.PayMode);
        this.setParamArrayObj(map, prefix + "Project.", this.Project);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamArrayObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamArrayObj(map, prefix + "OperateUin.", this.OperateUin);
        this.setParamArrayObj(map, prefix + "BillDay.", this.BillDay);
        this.setParamArrayObj(map, prefix + "ActionType.", this.ActionType);
        this.setParamArrayObj(map, prefix + "Component.", this.Component);
        this.setParamArrayObj(map, prefix + "Zone.", this.Zone);
        this.setParamArrayObj(map, prefix + "AllocationTreeNode.", this.AllocationTreeNode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

