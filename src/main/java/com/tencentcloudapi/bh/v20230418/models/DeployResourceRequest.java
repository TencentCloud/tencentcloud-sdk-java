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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployResourceRequest extends AbstractModel {

    /**
    * 需要开通服务的资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 需要开通服务的地域
    */
    @SerializedName("ApCode")
    @Expose
    private String ApCode;

    /**
    * 子网所在可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 需要开通服务的VPC
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 需要开通服务的子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 需要开通服务的子网网段
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 需要开通服务的VPC名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 需要开通服务的VPC对应的网段
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 需要开通服务的子网名称
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 需要开通实例所属的CDC集群ID
    */
    @SerializedName("CdcClusterId")
    @Expose
    private String CdcClusterId;

    /**
    * 开通堡垒机指定共享的clbId
    */
    @SerializedName("ShareClbId")
    @Expose
    private String ShareClbId;

    /**
    * 0-关闭web访问堡垒机，1-开启web访问堡垒机
    */
    @SerializedName("WebAccess")
    @Expose
    private Long WebAccess;

    /**
    * 0-关闭客户端访问堡垒机，1-开启客户端访问堡垒机
    */
    @SerializedName("ClientAccess")
    @Expose
    private Long ClientAccess;

    /**
    * 0-关闭内网访问堡垒机，1-开启内网访问堡垒机
    */
    @SerializedName("IntranetAccess")
    @Expose
    private Long IntranetAccess;

    /**
    * 0-关闭公网访问堡垒机，1-开启公网访问堡垒机
    */
    @SerializedName("ExternalAccess")
    @Expose
    private Long ExternalAccess;

    /**
     * Get 需要开通服务的资源ID 
     * @return ResourceId 需要开通服务的资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 需要开通服务的资源ID
     * @param ResourceId 需要开通服务的资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 需要开通服务的地域 
     * @return ApCode 需要开通服务的地域
     */
    public String getApCode() {
        return this.ApCode;
    }

    /**
     * Set 需要开通服务的地域
     * @param ApCode 需要开通服务的地域
     */
    public void setApCode(String ApCode) {
        this.ApCode = ApCode;
    }

    /**
     * Get 子网所在可用区 
     * @return Zone 子网所在可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 子网所在可用区
     * @param Zone 子网所在可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 需要开通服务的VPC 
     * @return VpcId 需要开通服务的VPC
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 需要开通服务的VPC
     * @param VpcId 需要开通服务的VPC
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 需要开通服务的子网ID 
     * @return SubnetId 需要开通服务的子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 需要开通服务的子网ID
     * @param SubnetId 需要开通服务的子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 需要开通服务的子网网段 
     * @return CidrBlock 需要开通服务的子网网段
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 需要开通服务的子网网段
     * @param CidrBlock 需要开通服务的子网网段
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 需要开通服务的VPC名称 
     * @return VpcName 需要开通服务的VPC名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 需要开通服务的VPC名称
     * @param VpcName 需要开通服务的VPC名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 需要开通服务的VPC对应的网段 
     * @return VpcCidrBlock 需要开通服务的VPC对应的网段
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set 需要开通服务的VPC对应的网段
     * @param VpcCidrBlock 需要开通服务的VPC对应的网段
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get 需要开通服务的子网名称 
     * @return SubnetName 需要开通服务的子网名称
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 需要开通服务的子网名称
     * @param SubnetName 需要开通服务的子网名称
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 需要开通实例所属的CDC集群ID 
     * @return CdcClusterId 需要开通实例所属的CDC集群ID
     */
    public String getCdcClusterId() {
        return this.CdcClusterId;
    }

    /**
     * Set 需要开通实例所属的CDC集群ID
     * @param CdcClusterId 需要开通实例所属的CDC集群ID
     */
    public void setCdcClusterId(String CdcClusterId) {
        this.CdcClusterId = CdcClusterId;
    }

    /**
     * Get 开通堡垒机指定共享的clbId 
     * @return ShareClbId 开通堡垒机指定共享的clbId
     */
    public String getShareClbId() {
        return this.ShareClbId;
    }

    /**
     * Set 开通堡垒机指定共享的clbId
     * @param ShareClbId 开通堡垒机指定共享的clbId
     */
    public void setShareClbId(String ShareClbId) {
        this.ShareClbId = ShareClbId;
    }

    /**
     * Get 0-关闭web访问堡垒机，1-开启web访问堡垒机 
     * @return WebAccess 0-关闭web访问堡垒机，1-开启web访问堡垒机
     */
    public Long getWebAccess() {
        return this.WebAccess;
    }

    /**
     * Set 0-关闭web访问堡垒机，1-开启web访问堡垒机
     * @param WebAccess 0-关闭web访问堡垒机，1-开启web访问堡垒机
     */
    public void setWebAccess(Long WebAccess) {
        this.WebAccess = WebAccess;
    }

    /**
     * Get 0-关闭客户端访问堡垒机，1-开启客户端访问堡垒机 
     * @return ClientAccess 0-关闭客户端访问堡垒机，1-开启客户端访问堡垒机
     */
    public Long getClientAccess() {
        return this.ClientAccess;
    }

    /**
     * Set 0-关闭客户端访问堡垒机，1-开启客户端访问堡垒机
     * @param ClientAccess 0-关闭客户端访问堡垒机，1-开启客户端访问堡垒机
     */
    public void setClientAccess(Long ClientAccess) {
        this.ClientAccess = ClientAccess;
    }

    /**
     * Get 0-关闭内网访问堡垒机，1-开启内网访问堡垒机 
     * @return IntranetAccess 0-关闭内网访问堡垒机，1-开启内网访问堡垒机
     */
    public Long getIntranetAccess() {
        return this.IntranetAccess;
    }

    /**
     * Set 0-关闭内网访问堡垒机，1-开启内网访问堡垒机
     * @param IntranetAccess 0-关闭内网访问堡垒机，1-开启内网访问堡垒机
     */
    public void setIntranetAccess(Long IntranetAccess) {
        this.IntranetAccess = IntranetAccess;
    }

    /**
     * Get 0-关闭公网访问堡垒机，1-开启公网访问堡垒机 
     * @return ExternalAccess 0-关闭公网访问堡垒机，1-开启公网访问堡垒机
     */
    public Long getExternalAccess() {
        return this.ExternalAccess;
    }

    /**
     * Set 0-关闭公网访问堡垒机，1-开启公网访问堡垒机
     * @param ExternalAccess 0-关闭公网访问堡垒机，1-开启公网访问堡垒机
     */
    public void setExternalAccess(Long ExternalAccess) {
        this.ExternalAccess = ExternalAccess;
    }

    public DeployResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployResourceRequest(DeployResourceRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ApCode != null) {
            this.ApCode = new String(source.ApCode);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.CdcClusterId != null) {
            this.CdcClusterId = new String(source.CdcClusterId);
        }
        if (source.ShareClbId != null) {
            this.ShareClbId = new String(source.ShareClbId);
        }
        if (source.WebAccess != null) {
            this.WebAccess = new Long(source.WebAccess);
        }
        if (source.ClientAccess != null) {
            this.ClientAccess = new Long(source.ClientAccess);
        }
        if (source.IntranetAccess != null) {
            this.IntranetAccess = new Long(source.IntranetAccess);
        }
        if (source.ExternalAccess != null) {
            this.ExternalAccess = new Long(source.ExternalAccess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ApCode", this.ApCode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "CdcClusterId", this.CdcClusterId);
        this.setParamSimple(map, prefix + "ShareClbId", this.ShareClbId);
        this.setParamSimple(map, prefix + "WebAccess", this.WebAccess);
        this.setParamSimple(map, prefix + "ClientAccess", this.ClientAccess);
        this.setParamSimple(map, prefix + "IntranetAccess", this.IntranetAccess);
        this.setParamSimple(map, prefix + "ExternalAccess", this.ExternalAccess);

    }
}

