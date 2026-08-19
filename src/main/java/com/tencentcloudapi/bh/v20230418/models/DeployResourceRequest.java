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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployResourceRequest extends AbstractModel {

    /**
    * <p>需要开通服务的资源ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>需要开通服务的地域</p>
    */
    @SerializedName("ApCode")
    @Expose
    private String ApCode;

    /**
    * <p>子网所在可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>需要开通服务的VPC</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>需要开通服务的子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>需要开通服务的子网网段</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>需要开通服务的VPC名称</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>需要开通服务的VPC对应的网段</p>
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * <p>需要开通服务的子网名称</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>需要开通实例所属的CDC集群ID</p>
    */
    @SerializedName("CdcClusterId")
    @Expose
    private String CdcClusterId;

    /**
    * <p>开通堡垒机指定共享的clbId</p>
    */
    @SerializedName("ShareClbId")
    @Expose
    private String ShareClbId;

    /**
    * <p>0-关闭web访问堡垒机，1-开启web访问堡垒机</p>
    */
    @SerializedName("WebAccess")
    @Expose
    private Long WebAccess;

    /**
    * <p>0-关闭客户端访问堡垒机，1-开启客户端访问堡垒机</p>
    */
    @SerializedName("ClientAccess")
    @Expose
    private Long ClientAccess;

    /**
    * <p>0-关闭内网访问堡垒机，1-开启内网访问堡垒机</p>
    */
    @SerializedName("IntranetAccess")
    @Expose
    private Long IntranetAccess;

    /**
    * <p>0-关闭公网访问堡垒机，1-开启公网访问堡垒机</p>
    */
    @SerializedName("ExternalAccess")
    @Expose
    private Long ExternalAccess;

    /**
    * <p>开通堡垒机的子网信息</p>
    */
    @SerializedName("DeploySubnets")
    @Expose
    private ParamInitResourceSubnet [] DeploySubnets;

    /**
    * <p>开通内网访问的VPC ID</p>
    */
    @SerializedName("IntranetVpcId")
    @Expose
    private String IntranetVpcId;

    /**
    * <p>开通内网访问的VPC 网段</p>
    */
    @SerializedName("IntranetVpcCidrBlock")
    @Expose
    private String IntranetVpcCidrBlock;

    /**
    * <p>开通内网访问的VPC名称</p>
    */
    @SerializedName("IntranetVpcName")
    @Expose
    private String IntranetVpcName;

    /**
    * <p>开通内网访问的子网信息</p>
    */
    @SerializedName("IntranetSubnets")
    @Expose
    private ParamInitResourceSubnet [] IntranetSubnets;

    /**
     * Get <p>需要开通服务的资源ID</p> 
     * @return ResourceId <p>需要开通服务的资源ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>需要开通服务的资源ID</p>
     * @param ResourceId <p>需要开通服务的资源ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>需要开通服务的地域</p> 
     * @return ApCode <p>需要开通服务的地域</p>
     */
    public String getApCode() {
        return this.ApCode;
    }

    /**
     * Set <p>需要开通服务的地域</p>
     * @param ApCode <p>需要开通服务的地域</p>
     */
    public void setApCode(String ApCode) {
        this.ApCode = ApCode;
    }

    /**
     * Get <p>子网所在可用区</p> 
     * @return Zone <p>子网所在可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>子网所在可用区</p>
     * @param Zone <p>子网所在可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>需要开通服务的VPC</p> 
     * @return VpcId <p>需要开通服务的VPC</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>需要开通服务的VPC</p>
     * @param VpcId <p>需要开通服务的VPC</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>需要开通服务的子网ID</p> 
     * @return SubnetId <p>需要开通服务的子网ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>需要开通服务的子网ID</p>
     * @param SubnetId <p>需要开通服务的子网ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>需要开通服务的子网网段</p> 
     * @return CidrBlock <p>需要开通服务的子网网段</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>需要开通服务的子网网段</p>
     * @param CidrBlock <p>需要开通服务的子网网段</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>需要开通服务的VPC名称</p> 
     * @return VpcName <p>需要开通服务的VPC名称</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>需要开通服务的VPC名称</p>
     * @param VpcName <p>需要开通服务的VPC名称</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>需要开通服务的VPC对应的网段</p> 
     * @return VpcCidrBlock <p>需要开通服务的VPC对应的网段</p>
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set <p>需要开通服务的VPC对应的网段</p>
     * @param VpcCidrBlock <p>需要开通服务的VPC对应的网段</p>
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get <p>需要开通服务的子网名称</p> 
     * @return SubnetName <p>需要开通服务的子网名称</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>需要开通服务的子网名称</p>
     * @param SubnetName <p>需要开通服务的子网名称</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get <p>需要开通实例所属的CDC集群ID</p> 
     * @return CdcClusterId <p>需要开通实例所属的CDC集群ID</p>
     */
    public String getCdcClusterId() {
        return this.CdcClusterId;
    }

    /**
     * Set <p>需要开通实例所属的CDC集群ID</p>
     * @param CdcClusterId <p>需要开通实例所属的CDC集群ID</p>
     */
    public void setCdcClusterId(String CdcClusterId) {
        this.CdcClusterId = CdcClusterId;
    }

    /**
     * Get <p>开通堡垒机指定共享的clbId</p> 
     * @return ShareClbId <p>开通堡垒机指定共享的clbId</p>
     */
    public String getShareClbId() {
        return this.ShareClbId;
    }

    /**
     * Set <p>开通堡垒机指定共享的clbId</p>
     * @param ShareClbId <p>开通堡垒机指定共享的clbId</p>
     */
    public void setShareClbId(String ShareClbId) {
        this.ShareClbId = ShareClbId;
    }

    /**
     * Get <p>0-关闭web访问堡垒机，1-开启web访问堡垒机</p> 
     * @return WebAccess <p>0-关闭web访问堡垒机，1-开启web访问堡垒机</p>
     */
    public Long getWebAccess() {
        return this.WebAccess;
    }

    /**
     * Set <p>0-关闭web访问堡垒机，1-开启web访问堡垒机</p>
     * @param WebAccess <p>0-关闭web访问堡垒机，1-开启web访问堡垒机</p>
     */
    public void setWebAccess(Long WebAccess) {
        this.WebAccess = WebAccess;
    }

    /**
     * Get <p>0-关闭客户端访问堡垒机，1-开启客户端访问堡垒机</p> 
     * @return ClientAccess <p>0-关闭客户端访问堡垒机，1-开启客户端访问堡垒机</p>
     */
    public Long getClientAccess() {
        return this.ClientAccess;
    }

    /**
     * Set <p>0-关闭客户端访问堡垒机，1-开启客户端访问堡垒机</p>
     * @param ClientAccess <p>0-关闭客户端访问堡垒机，1-开启客户端访问堡垒机</p>
     */
    public void setClientAccess(Long ClientAccess) {
        this.ClientAccess = ClientAccess;
    }

    /**
     * Get <p>0-关闭内网访问堡垒机，1-开启内网访问堡垒机</p> 
     * @return IntranetAccess <p>0-关闭内网访问堡垒机，1-开启内网访问堡垒机</p>
     */
    public Long getIntranetAccess() {
        return this.IntranetAccess;
    }

    /**
     * Set <p>0-关闭内网访问堡垒机，1-开启内网访问堡垒机</p>
     * @param IntranetAccess <p>0-关闭内网访问堡垒机，1-开启内网访问堡垒机</p>
     */
    public void setIntranetAccess(Long IntranetAccess) {
        this.IntranetAccess = IntranetAccess;
    }

    /**
     * Get <p>0-关闭公网访问堡垒机，1-开启公网访问堡垒机</p> 
     * @return ExternalAccess <p>0-关闭公网访问堡垒机，1-开启公网访问堡垒机</p>
     */
    public Long getExternalAccess() {
        return this.ExternalAccess;
    }

    /**
     * Set <p>0-关闭公网访问堡垒机，1-开启公网访问堡垒机</p>
     * @param ExternalAccess <p>0-关闭公网访问堡垒机，1-开启公网访问堡垒机</p>
     */
    public void setExternalAccess(Long ExternalAccess) {
        this.ExternalAccess = ExternalAccess;
    }

    /**
     * Get <p>开通堡垒机的子网信息</p> 
     * @return DeploySubnets <p>开通堡垒机的子网信息</p>
     */
    public ParamInitResourceSubnet [] getDeploySubnets() {
        return this.DeploySubnets;
    }

    /**
     * Set <p>开通堡垒机的子网信息</p>
     * @param DeploySubnets <p>开通堡垒机的子网信息</p>
     */
    public void setDeploySubnets(ParamInitResourceSubnet [] DeploySubnets) {
        this.DeploySubnets = DeploySubnets;
    }

    /**
     * Get <p>开通内网访问的VPC ID</p> 
     * @return IntranetVpcId <p>开通内网访问的VPC ID</p>
     */
    public String getIntranetVpcId() {
        return this.IntranetVpcId;
    }

    /**
     * Set <p>开通内网访问的VPC ID</p>
     * @param IntranetVpcId <p>开通内网访问的VPC ID</p>
     */
    public void setIntranetVpcId(String IntranetVpcId) {
        this.IntranetVpcId = IntranetVpcId;
    }

    /**
     * Get <p>开通内网访问的VPC 网段</p> 
     * @return IntranetVpcCidrBlock <p>开通内网访问的VPC 网段</p>
     */
    public String getIntranetVpcCidrBlock() {
        return this.IntranetVpcCidrBlock;
    }

    /**
     * Set <p>开通内网访问的VPC 网段</p>
     * @param IntranetVpcCidrBlock <p>开通内网访问的VPC 网段</p>
     */
    public void setIntranetVpcCidrBlock(String IntranetVpcCidrBlock) {
        this.IntranetVpcCidrBlock = IntranetVpcCidrBlock;
    }

    /**
     * Get <p>开通内网访问的VPC名称</p> 
     * @return IntranetVpcName <p>开通内网访问的VPC名称</p>
     */
    public String getIntranetVpcName() {
        return this.IntranetVpcName;
    }

    /**
     * Set <p>开通内网访问的VPC名称</p>
     * @param IntranetVpcName <p>开通内网访问的VPC名称</p>
     */
    public void setIntranetVpcName(String IntranetVpcName) {
        this.IntranetVpcName = IntranetVpcName;
    }

    /**
     * Get <p>开通内网访问的子网信息</p> 
     * @return IntranetSubnets <p>开通内网访问的子网信息</p>
     */
    public ParamInitResourceSubnet [] getIntranetSubnets() {
        return this.IntranetSubnets;
    }

    /**
     * Set <p>开通内网访问的子网信息</p>
     * @param IntranetSubnets <p>开通内网访问的子网信息</p>
     */
    public void setIntranetSubnets(ParamInitResourceSubnet [] IntranetSubnets) {
        this.IntranetSubnets = IntranetSubnets;
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
        if (source.DeploySubnets != null) {
            this.DeploySubnets = new ParamInitResourceSubnet[source.DeploySubnets.length];
            for (int i = 0; i < source.DeploySubnets.length; i++) {
                this.DeploySubnets[i] = new ParamInitResourceSubnet(source.DeploySubnets[i]);
            }
        }
        if (source.IntranetVpcId != null) {
            this.IntranetVpcId = new String(source.IntranetVpcId);
        }
        if (source.IntranetVpcCidrBlock != null) {
            this.IntranetVpcCidrBlock = new String(source.IntranetVpcCidrBlock);
        }
        if (source.IntranetVpcName != null) {
            this.IntranetVpcName = new String(source.IntranetVpcName);
        }
        if (source.IntranetSubnets != null) {
            this.IntranetSubnets = new ParamInitResourceSubnet[source.IntranetSubnets.length];
            for (int i = 0; i < source.IntranetSubnets.length; i++) {
                this.IntranetSubnets[i] = new ParamInitResourceSubnet(source.IntranetSubnets[i]);
            }
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
        this.setParamArrayObj(map, prefix + "DeploySubnets.", this.DeploySubnets);
        this.setParamSimple(map, prefix + "IntranetVpcId", this.IntranetVpcId);
        this.setParamSimple(map, prefix + "IntranetVpcCidrBlock", this.IntranetVpcCidrBlock);
        this.setParamSimple(map, prefix + "IntranetVpcName", this.IntranetVpcName);
        this.setParamArrayObj(map, prefix + "IntranetSubnets.", this.IntranetSubnets);

    }
}

