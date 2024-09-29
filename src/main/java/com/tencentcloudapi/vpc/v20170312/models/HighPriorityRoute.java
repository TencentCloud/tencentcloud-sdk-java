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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HighPriorityRoute extends AbstractModel {

    /**
    * 高优路由表唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighPriorityRouteTableId")
    @Expose
    private String HighPriorityRouteTableId;

    /**
    * 高优路由表条目唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighPriorityRouteId")
    @Expose
    private String HighPriorityRouteId;

    /**
    * 目标网段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * 网关类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * 网关唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 高优路由条目描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * ECMP算法，支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetRouteAlgorithm")
    @Expose
    private String SubnetRouteAlgorithm;

    /**
    * 出参展示，是否为CDC属性高优路由
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCdc")
    @Expose
    private Boolean IsCdc;

    /**
    * 出参展示，CDC 唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 高优路由表唯一 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighPriorityRouteTableId 高优路由表唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHighPriorityRouteTableId() {
        return this.HighPriorityRouteTableId;
    }

    /**
     * Set 高优路由表唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighPriorityRouteTableId 高优路由表唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighPriorityRouteTableId(String HighPriorityRouteTableId) {
        this.HighPriorityRouteTableId = HighPriorityRouteTableId;
    }

    /**
     * Get 高优路由表条目唯一 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighPriorityRouteId 高优路由表条目唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHighPriorityRouteId() {
        return this.HighPriorityRouteId;
    }

    /**
     * Set 高优路由表条目唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighPriorityRouteId 高优路由表条目唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighPriorityRouteId(String HighPriorityRouteId) {
        this.HighPriorityRouteId = HighPriorityRouteId;
    }

    /**
     * Get 目标网段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestinationCidrBlock 目标网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set 目标网段
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestinationCidrBlock 目标网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get 网关类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayType 网关类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set 网关类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayType 网关类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get 网关唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayId 网关唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayId 网关唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 高优路由条目描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 高优路由条目描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 高优路由条目描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 高优路由条目描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get ECMP算法，支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetRouteAlgorithm ECMP算法，支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetRouteAlgorithm() {
        return this.SubnetRouteAlgorithm;
    }

    /**
     * Set ECMP算法，支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetRouteAlgorithm ECMP算法，支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetRouteAlgorithm(String SubnetRouteAlgorithm) {
        this.SubnetRouteAlgorithm = SubnetRouteAlgorithm;
    }

    /**
     * Get 出参展示，是否为CDC属性高优路由
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCdc 出参展示，是否为CDC属性高优路由
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsCdc() {
        return this.IsCdc;
    }

    /**
     * Set 出参展示，是否为CDC属性高优路由
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCdc 出参展示，是否为CDC属性高优路由
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCdc(Boolean IsCdc) {
        this.IsCdc = IsCdc;
    }

    /**
     * Get 出参展示，CDC 唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdcId 出参展示，CDC 唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set 出参展示，CDC 唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdcId 出参展示，CDC 唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public HighPriorityRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HighPriorityRoute(HighPriorityRoute source) {
        if (source.HighPriorityRouteTableId != null) {
            this.HighPriorityRouteTableId = new String(source.HighPriorityRouteTableId);
        }
        if (source.HighPriorityRouteId != null) {
            this.HighPriorityRouteId = new String(source.HighPriorityRouteId);
        }
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SubnetRouteAlgorithm != null) {
            this.SubnetRouteAlgorithm = new String(source.SubnetRouteAlgorithm);
        }
        if (source.IsCdc != null) {
            this.IsCdc = new Boolean(source.IsCdc);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighPriorityRouteTableId", this.HighPriorityRouteTableId);
        this.setParamSimple(map, prefix + "HighPriorityRouteId", this.HighPriorityRouteId);
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SubnetRouteAlgorithm", this.SubnetRouteAlgorithm);
        this.setParamSimple(map, prefix + "IsCdc", this.IsCdc);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

