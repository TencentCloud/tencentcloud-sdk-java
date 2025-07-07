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

public class GlobalRoute extends AbstractModel {

    /**
    * 作为出参展示，表示VPC唯一Id，。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 全局路由唯一Id。
    */
    @SerializedName("GlobalRouteId")
    @Expose
    private String GlobalRouteId;

    /**
    * Ipv4目标网段。
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * 下一跳类型，支持 NORMAL_CVM。
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * 下一跳对象，如果GatewayType类型是NORMAL_CVM填写子机IP。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 备注。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 支持的 ECMP算法有：

- ECMP_QUINTUPLE_HASH：五元组hash
- ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash
- ECMP_DESTINATION_IP_HASH：目的IP hash
- ECMP_SOURCE_IP_HASH：源IP hash。
    */
    @SerializedName("SubnetRouteAlgorithm")
    @Expose
    private String SubnetRouteAlgorithm;

    /**
     * Get 作为出参展示，表示VPC唯一Id，。 
     * @return VpcId 作为出参展示，表示VPC唯一Id，。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 作为出参展示，表示VPC唯一Id，。
     * @param VpcId 作为出参展示，表示VPC唯一Id，。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 全局路由唯一Id。 
     * @return GlobalRouteId 全局路由唯一Id。
     */
    public String getGlobalRouteId() {
        return this.GlobalRouteId;
    }

    /**
     * Set 全局路由唯一Id。
     * @param GlobalRouteId 全局路由唯一Id。
     */
    public void setGlobalRouteId(String GlobalRouteId) {
        this.GlobalRouteId = GlobalRouteId;
    }

    /**
     * Get Ipv4目标网段。 
     * @return DestinationCidrBlock Ipv4目标网段。
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set Ipv4目标网段。
     * @param DestinationCidrBlock Ipv4目标网段。
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get 下一跳类型，支持 NORMAL_CVM。 
     * @return GatewayType 下一跳类型，支持 NORMAL_CVM。
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set 下一跳类型，支持 NORMAL_CVM。
     * @param GatewayType 下一跳类型，支持 NORMAL_CVM。
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get 下一跳对象，如果GatewayType类型是NORMAL_CVM填写子机IP。 
     * @return GatewayId 下一跳对象，如果GatewayType类型是NORMAL_CVM填写子机IP。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 下一跳对象，如果GatewayType类型是NORMAL_CVM填写子机IP。
     * @param GatewayId 下一跳对象，如果GatewayType类型是NORMAL_CVM填写子机IP。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 备注。 
     * @return Description 备注。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注。
     * @param Description 备注。
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    /**
     * Get 支持的 ECMP算法有：

- ECMP_QUINTUPLE_HASH：五元组hash
- ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash
- ECMP_DESTINATION_IP_HASH：目的IP hash
- ECMP_SOURCE_IP_HASH：源IP hash。 
     * @return SubnetRouteAlgorithm 支持的 ECMP算法有：

- ECMP_QUINTUPLE_HASH：五元组hash
- ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash
- ECMP_DESTINATION_IP_HASH：目的IP hash
- ECMP_SOURCE_IP_HASH：源IP hash。
     */
    public String getSubnetRouteAlgorithm() {
        return this.SubnetRouteAlgorithm;
    }

    /**
     * Set 支持的 ECMP算法有：

- ECMP_QUINTUPLE_HASH：五元组hash
- ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash
- ECMP_DESTINATION_IP_HASH：目的IP hash
- ECMP_SOURCE_IP_HASH：源IP hash。
     * @param SubnetRouteAlgorithm 支持的 ECMP算法有：

- ECMP_QUINTUPLE_HASH：五元组hash
- ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash
- ECMP_DESTINATION_IP_HASH：目的IP hash
- ECMP_SOURCE_IP_HASH：源IP hash。
     */
    public void setSubnetRouteAlgorithm(String SubnetRouteAlgorithm) {
        this.SubnetRouteAlgorithm = SubnetRouteAlgorithm;
    }

    public GlobalRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlobalRoute(GlobalRoute source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.GlobalRouteId != null) {
            this.GlobalRouteId = new String(source.GlobalRouteId);
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
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.SubnetRouteAlgorithm != null) {
            this.SubnetRouteAlgorithm = new String(source.SubnetRouteAlgorithm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "GlobalRouteId", this.GlobalRouteId);
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "SubnetRouteAlgorithm", this.SubnetRouteAlgorithm);

    }
}

