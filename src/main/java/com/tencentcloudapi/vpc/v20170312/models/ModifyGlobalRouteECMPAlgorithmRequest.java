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

public class ModifyGlobalRouteECMPAlgorithmRequest extends AbstractModel {

    /**
    * VPC唯一Id。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Ipv4目标网段。
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * 支持的 ECMP算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
    */
    @SerializedName("SubnetRouteAlgorithm")
    @Expose
    private String SubnetRouteAlgorithm;

    /**
    * CDC 集群唯一 ID。
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get VPC唯一Id。 
     * @return VpcId VPC唯一Id。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC唯一Id。
     * @param VpcId VPC唯一Id。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
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
     * Get 支持的 ECMP算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。 
     * @return SubnetRouteAlgorithm 支持的 ECMP算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
     */
    public String getSubnetRouteAlgorithm() {
        return this.SubnetRouteAlgorithm;
    }

    /**
     * Set 支持的 ECMP算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
     * @param SubnetRouteAlgorithm 支持的 ECMP算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
     */
    public void setSubnetRouteAlgorithm(String SubnetRouteAlgorithm) {
        this.SubnetRouteAlgorithm = SubnetRouteAlgorithm;
    }

    /**
     * Get CDC 集群唯一 ID。 
     * @return CdcId CDC 集群唯一 ID。
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set CDC 集群唯一 ID。
     * @param CdcId CDC 集群唯一 ID。
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    public ModifyGlobalRouteECMPAlgorithmRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGlobalRouteECMPAlgorithmRequest(ModifyGlobalRouteECMPAlgorithmRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.SubnetRouteAlgorithm != null) {
            this.SubnetRouteAlgorithm = new String(source.SubnetRouteAlgorithm);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "SubnetRouteAlgorithm", this.SubnetRouteAlgorithm);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

