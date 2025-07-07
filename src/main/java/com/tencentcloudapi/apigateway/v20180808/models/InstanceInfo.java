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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * 独享实例唯一id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 独享实例name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 独享实例描述
    */
    @SerializedName("InstanceDescription")
    @Expose
    private String InstanceDescription;

    /**
    * 独享实例计费类型
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 独享实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 独享实例状态
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 独享实例创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 资源ID同唯一id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 公网IP列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OuterIpList")
    @Expose
    private String [] OuterIpList;

    /**
    * 内网IP列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerIpList")
    @Expose
    private String [] InnerIpList;

    /**
    * 专享实例计费信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * 所属vpc
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
     * Get 独享实例唯一id 
     * @return InstanceId 独享实例唯一id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 独享实例唯一id
     * @param InstanceId 独享实例唯一id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 独享实例name 
     * @return InstanceName 独享实例name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 独享实例name
     * @param InstanceName 独享实例name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 独享实例描述 
     * @return InstanceDescription 独享实例描述
     */
    public String getInstanceDescription() {
        return this.InstanceDescription;
    }

    /**
     * Set 独享实例描述
     * @param InstanceDescription 独享实例描述
     */
    public void setInstanceDescription(String InstanceDescription) {
        this.InstanceDescription = InstanceDescription;
    }

    /**
     * Get 独享实例计费类型 
     * @return InstanceChargeType 独享实例计费类型
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 独享实例计费类型
     * @param InstanceChargeType 独享实例计费类型
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 独享实例类型 
     * @return InstanceType 独享实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 独享实例类型
     * @param InstanceType 独享实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 独享实例状态 
     * @return InstanceState 独享实例状态
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 独享实例状态
     * @param InstanceState 独享实例状态
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 独享实例创建时间 
     * @return CreatedTime 独享实例创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 独享实例创建时间
     * @param CreatedTime 独享实例创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealName 订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealName 订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 资源ID同唯一id 
     * @return ResourceId 资源ID同唯一id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID同唯一id
     * @param ResourceId 资源ID同唯一id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 公网IP列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OuterIpList 公网IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOuterIpList() {
        return this.OuterIpList;
    }

    /**
     * Set 公网IP列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OuterIpList 公网IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOuterIpList(String [] OuterIpList) {
        this.OuterIpList = OuterIpList;
    }

    /**
     * Get 内网IP列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerIpList 内网IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInnerIpList() {
        return this.InnerIpList;
    }

    /**
     * Set 内网IP列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerIpList 内网IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerIpList(String [] InnerIpList) {
        this.InnerIpList = InnerIpList;
    }

    /**
     * Get 专享实例计费信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceChargePrepaid 专享实例计费信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 专享实例计费信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceChargePrepaid 专享实例计费信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get 所属vpc
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqVpcId 所属vpc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 所属vpc
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqVpcId 所属vpc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceDescription != null) {
            this.InstanceDescription = new String(source.InstanceDescription);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.OuterIpList != null) {
            this.OuterIpList = new String[source.OuterIpList.length];
            for (int i = 0; i < source.OuterIpList.length; i++) {
                this.OuterIpList[i] = new String(source.OuterIpList[i]);
            }
        }
        if (source.InnerIpList != null) {
            this.InnerIpList = new String[source.InnerIpList.length];
            for (int i = 0; i < source.InnerIpList.length; i++) {
                this.InnerIpList[i] = new String(source.InnerIpList[i]);
            }
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceDescription", this.InstanceDescription);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArraySimple(map, prefix + "OuterIpList.", this.OuterIpList);
        this.setParamArraySimple(map, prefix + "InnerIpList.", this.InnerIpList);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);

    }
}

