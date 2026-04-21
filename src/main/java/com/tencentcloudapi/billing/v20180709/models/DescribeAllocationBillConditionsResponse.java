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

public class DescribeAllocationBillConditionsResponse extends AbstractModel {

    /**
    * <p>产品筛选列表</p>
    */
    @SerializedName("Business")
    @Expose
    private BillBusiness [] Business;

    /**
    * <p>子产品筛选列表</p>
    */
    @SerializedName("Product")
    @Expose
    private BillProduct [] Product;

    /**
    * <p>组件名称筛选列表</p>
    */
    @SerializedName("Item")
    @Expose
    private BillItem [] Item;

    /**
    * <p>地域筛选列表</p>
    */
    @SerializedName("Region")
    @Expose
    private BillRegion [] Region;

    /**
    * <p>实例类型筛选列表</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private BillInstanceType [] InstanceType;

    /**
    * <p>计费模式筛选列表</p>
    */
    @SerializedName("PayMode")
    @Expose
    private BillPayMode [] PayMode;

    /**
    * <p>项目筛选列表</p>
    */
    @SerializedName("Project")
    @Expose
    private BillProject [] Project;

    /**
    * <p>标签筛选列表</p>
    */
    @SerializedName("Tag")
    @Expose
    private BillTag [] Tag;

    /**
    * <p>使用者 UIN 筛选列表</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private BillOwnerUin [] OwnerUin;

    /**
    * <p>操作者 UIN 筛选列表</p>
    */
    @SerializedName("OperateUin")
    @Expose
    private BillOperateUin [] OperateUin;

    /**
    * <p>日期筛选列表</p>
    */
    @SerializedName("BillDay")
    @Expose
    private BillDays [] BillDay;

    /**
    * <p>交易类型筛选列表</p>
    */
    @SerializedName("ActionType")
    @Expose
    private BillActionType [] ActionType;

    /**
    * <p>组件类型筛选列表</p>
    */
    @SerializedName("Component")
    @Expose
    private BillComponent [] Component;

    /**
    * <p>可用区筛选列表</p>
    */
    @SerializedName("Zone")
    @Expose
    private BillZoneId [] Zone;

    /**
    * <p>分账单元筛选列表</p>
    */
    @SerializedName("AllocationTreeNode")
    @Expose
    private AllocationTreeNode [] AllocationTreeNode;

    /**
    * <p>分账标签键</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String [] TagKey;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>产品筛选列表</p> 
     * @return Business <p>产品筛选列表</p>
     */
    public BillBusiness [] getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>产品筛选列表</p>
     * @param Business <p>产品筛选列表</p>
     */
    public void setBusiness(BillBusiness [] Business) {
        this.Business = Business;
    }

    /**
     * Get <p>子产品筛选列表</p> 
     * @return Product <p>子产品筛选列表</p>
     */
    public BillProduct [] getProduct() {
        return this.Product;
    }

    /**
     * Set <p>子产品筛选列表</p>
     * @param Product <p>子产品筛选列表</p>
     */
    public void setProduct(BillProduct [] Product) {
        this.Product = Product;
    }

    /**
     * Get <p>组件名称筛选列表</p> 
     * @return Item <p>组件名称筛选列表</p>
     */
    public BillItem [] getItem() {
        return this.Item;
    }

    /**
     * Set <p>组件名称筛选列表</p>
     * @param Item <p>组件名称筛选列表</p>
     */
    public void setItem(BillItem [] Item) {
        this.Item = Item;
    }

    /**
     * Get <p>地域筛选列表</p> 
     * @return Region <p>地域筛选列表</p>
     */
    public BillRegion [] getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域筛选列表</p>
     * @param Region <p>地域筛选列表</p>
     */
    public void setRegion(BillRegion [] Region) {
        this.Region = Region;
    }

    /**
     * Get <p>实例类型筛选列表</p> 
     * @return InstanceType <p>实例类型筛选列表</p>
     */
    public BillInstanceType [] getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型筛选列表</p>
     * @param InstanceType <p>实例类型筛选列表</p>
     */
    public void setInstanceType(BillInstanceType [] InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>计费模式筛选列表</p> 
     * @return PayMode <p>计费模式筛选列表</p>
     */
    public BillPayMode [] getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计费模式筛选列表</p>
     * @param PayMode <p>计费模式筛选列表</p>
     */
    public void setPayMode(BillPayMode [] PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>项目筛选列表</p> 
     * @return Project <p>项目筛选列表</p>
     */
    public BillProject [] getProject() {
        return this.Project;
    }

    /**
     * Set <p>项目筛选列表</p>
     * @param Project <p>项目筛选列表</p>
     */
    public void setProject(BillProject [] Project) {
        this.Project = Project;
    }

    /**
     * Get <p>标签筛选列表</p> 
     * @return Tag <p>标签筛选列表</p>
     */
    public BillTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set <p>标签筛选列表</p>
     * @param Tag <p>标签筛选列表</p>
     */
    public void setTag(BillTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>使用者 UIN 筛选列表</p> 
     * @return OwnerUin <p>使用者 UIN 筛选列表</p>
     */
    public BillOwnerUin [] getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>使用者 UIN 筛选列表</p>
     * @param OwnerUin <p>使用者 UIN 筛选列表</p>
     */
    public void setOwnerUin(BillOwnerUin [] OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>操作者 UIN 筛选列表</p> 
     * @return OperateUin <p>操作者 UIN 筛选列表</p>
     */
    public BillOperateUin [] getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set <p>操作者 UIN 筛选列表</p>
     * @param OperateUin <p>操作者 UIN 筛选列表</p>
     */
    public void setOperateUin(BillOperateUin [] OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get <p>日期筛选列表</p> 
     * @return BillDay <p>日期筛选列表</p>
     */
    public BillDays [] getBillDay() {
        return this.BillDay;
    }

    /**
     * Set <p>日期筛选列表</p>
     * @param BillDay <p>日期筛选列表</p>
     */
    public void setBillDay(BillDays [] BillDay) {
        this.BillDay = BillDay;
    }

    /**
     * Get <p>交易类型筛选列表</p> 
     * @return ActionType <p>交易类型筛选列表</p>
     */
    public BillActionType [] getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>交易类型筛选列表</p>
     * @param ActionType <p>交易类型筛选列表</p>
     */
    public void setActionType(BillActionType [] ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>组件类型筛选列表</p> 
     * @return Component <p>组件类型筛选列表</p>
     */
    public BillComponent [] getComponent() {
        return this.Component;
    }

    /**
     * Set <p>组件类型筛选列表</p>
     * @param Component <p>组件类型筛选列表</p>
     */
    public void setComponent(BillComponent [] Component) {
        this.Component = Component;
    }

    /**
     * Get <p>可用区筛选列表</p> 
     * @return Zone <p>可用区筛选列表</p>
     */
    public BillZoneId [] getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区筛选列表</p>
     * @param Zone <p>可用区筛选列表</p>
     */
    public void setZone(BillZoneId [] Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>分账单元筛选列表</p> 
     * @return AllocationTreeNode <p>分账单元筛选列表</p>
     */
    public AllocationTreeNode [] getAllocationTreeNode() {
        return this.AllocationTreeNode;
    }

    /**
     * Set <p>分账单元筛选列表</p>
     * @param AllocationTreeNode <p>分账单元筛选列表</p>
     */
    public void setAllocationTreeNode(AllocationTreeNode [] AllocationTreeNode) {
        this.AllocationTreeNode = AllocationTreeNode;
    }

    /**
     * Get <p>分账标签键</p> 
     * @return TagKey <p>分账标签键</p>
     */
    public String [] getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>分账标签键</p>
     * @param TagKey <p>分账标签键</p>
     */
    public void setTagKey(String [] TagKey) {
        this.TagKey = TagKey;
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
        if (source.TagKey != null) {
            this.TagKey = new String[source.TagKey.length];
            for (int i = 0; i < source.TagKey.length; i++) {
                this.TagKey[i] = new String(source.TagKey[i]);
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
        this.setParamArraySimple(map, prefix + "TagKey.", this.TagKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

