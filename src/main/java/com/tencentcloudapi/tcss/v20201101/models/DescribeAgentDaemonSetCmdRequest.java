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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentDaemonSetCmdRequest extends AbstractModel {

    /**
    * 是否是腾讯云
    */
    @SerializedName("IsCloud")
    @Expose
    private Boolean IsCloud;

    /**
    * 网络类型：basic-基础网络，private-VPC, public-公网，direct-专线
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 地域标示, NetType=direct时必填
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * VpcId, NetType=direct时必填
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 命令有效期，非腾讯云时必填
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
    * 集群自定义参数
    */
    @SerializedName("ClusterCustomParameters")
    @Expose
    private ClusterCustomParameters [] ClusterCustomParameters;

    /**
     * Get 是否是腾讯云 
     * @return IsCloud 是否是腾讯云
     */
    public Boolean getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set 是否是腾讯云
     * @param IsCloud 是否是腾讯云
     */
    public void setIsCloud(Boolean IsCloud) {
        this.IsCloud = IsCloud;
    }

    /**
     * Get 网络类型：basic-基础网络，private-VPC, public-公网，direct-专线 
     * @return NetType 网络类型：basic-基础网络，private-VPC, public-公网，direct-专线
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型：basic-基础网络，private-VPC, public-公网，direct-专线
     * @param NetType 网络类型：basic-基础网络，private-VPC, public-公网，direct-专线
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 地域标示, NetType=direct时必填 
     * @return RegionCode 地域标示, NetType=direct时必填
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 地域标示, NetType=direct时必填
     * @param RegionCode 地域标示, NetType=direct时必填
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get VpcId, NetType=direct时必填 
     * @return VpcId VpcId, NetType=direct时必填
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VpcId, NetType=direct时必填
     * @param VpcId VpcId, NetType=direct时必填
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 命令有效期，非腾讯云时必填 
     * @return ExpireDate 命令有效期，非腾讯云时必填
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set 命令有效期，非腾讯云时必填
     * @param ExpireDate 命令有效期，非腾讯云时必填
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    /**
     * Get 集群自定义参数 
     * @return ClusterCustomParameters 集群自定义参数
     */
    public ClusterCustomParameters [] getClusterCustomParameters() {
        return this.ClusterCustomParameters;
    }

    /**
     * Set 集群自定义参数
     * @param ClusterCustomParameters 集群自定义参数
     */
    public void setClusterCustomParameters(ClusterCustomParameters [] ClusterCustomParameters) {
        this.ClusterCustomParameters = ClusterCustomParameters;
    }

    public DescribeAgentDaemonSetCmdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentDaemonSetCmdRequest(DescribeAgentDaemonSetCmdRequest source) {
        if (source.IsCloud != null) {
            this.IsCloud = new Boolean(source.IsCloud);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
        if (source.ClusterCustomParameters != null) {
            this.ClusterCustomParameters = new ClusterCustomParameters[source.ClusterCustomParameters.length];
            for (int i = 0; i < source.ClusterCustomParameters.length; i++) {
                this.ClusterCustomParameters[i] = new ClusterCustomParameters(source.ClusterCustomParameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsCloud", this.IsCloud);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);
        this.setParamArrayObj(map, prefix + "ClusterCustomParameters.", this.ClusterCustomParameters);

    }
}

