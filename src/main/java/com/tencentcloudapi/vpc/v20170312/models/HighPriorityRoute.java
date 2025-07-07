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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HighPriorityRoute extends AbstractModel {

    /**
    * 高优路由表唯一 ID
    */
    @SerializedName("HighPriorityRouteTableId")
    @Expose
    private String HighPriorityRouteTableId;

    /**
    * 高优路由表条目唯一 ID
    */
    @SerializedName("HighPriorityRouteId")
    @Expose
    private String HighPriorityRouteId;

    /**
    * 目标网段
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * 网关类型
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * 网关唯一ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 高优路由条目描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * ECMP算法，支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
    */
    @SerializedName("SubnetRouteAlgorithm")
    @Expose
    private String SubnetRouteAlgorithm;

    /**
    * 出参展示，是否为CDC属性高优路由
    */
    @SerializedName("IsCdc")
    @Expose
    private Boolean IsCdc;

    /**
    * 出参展示，CDC 唯一ID
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 高优路由表唯一 ID 
     * @return HighPriorityRouteTableId 高优路由表唯一 ID
     */
    public String getHighPriorityRouteTableId() {
        return this.HighPriorityRouteTableId;
    }

    /**
     * Set 高优路由表唯一 ID
     * @param HighPriorityRouteTableId 高优路由表唯一 ID
     */
    public void setHighPriorityRouteTableId(String HighPriorityRouteTableId) {
        this.HighPriorityRouteTableId = HighPriorityRouteTableId;
    }

    /**
     * Get 高优路由表条目唯一 ID 
     * @return HighPriorityRouteId 高优路由表条目唯一 ID
     */
    public String getHighPriorityRouteId() {
        return this.HighPriorityRouteId;
    }

    /**
     * Set 高优路由表条目唯一 ID
     * @param HighPriorityRouteId 高优路由表条目唯一 ID
     */
    public void setHighPriorityRouteId(String HighPriorityRouteId) {
        this.HighPriorityRouteId = HighPriorityRouteId;
    }

    /**
     * Get 目标网段 
     * @return DestinationCidrBlock 目标网段
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set 目标网段
     * @param DestinationCidrBlock 目标网段
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get 网关类型 
     * @return GatewayType 网关类型
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set 网关类型
     * @param GatewayType 网关类型
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get 网关唯一ID 
     * @return GatewayId 网关唯一ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关唯一ID
     * @param GatewayId 网关唯一ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 高优路由条目描述 
     * @return Description 高优路由条目描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 高优路由条目描述
     * @param Description 高优路由条目描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get ECMP算法，支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。 
     * @return SubnetRouteAlgorithm ECMP算法，支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
     */
    public String getSubnetRouteAlgorithm() {
        return this.SubnetRouteAlgorithm;
    }

    /**
     * Set ECMP算法，支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
     * @param SubnetRouteAlgorithm ECMP算法，支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
     */
    public void setSubnetRouteAlgorithm(String SubnetRouteAlgorithm) {
        this.SubnetRouteAlgorithm = SubnetRouteAlgorithm;
    }

    /**
     * Get 出参展示，是否为CDC属性高优路由 
     * @return IsCdc 出参展示，是否为CDC属性高优路由
     */
    public Boolean getIsCdc() {
        return this.IsCdc;
    }

    /**
     * Set 出参展示，是否为CDC属性高优路由
     * @param IsCdc 出参展示，是否为CDC属性高优路由
     */
    public void setIsCdc(Boolean IsCdc) {
        this.IsCdc = IsCdc;
    }

    /**
     * Get 出参展示，CDC 唯一ID 
     * @return CdcId 出参展示，CDC 唯一ID
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set 出参展示，CDC 唯一ID
     * @param CdcId 出参展示，CDC 唯一ID
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
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

