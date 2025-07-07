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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDataModelRegistryInfoRequest extends AbstractModel {

    /**
    * 云应用的实例id
    */
    @SerializedName("CloudappId")
    @Expose
    private String CloudappId;

    /**
    * 数语的CAM角色
    */
    @SerializedName("AppCamRole")
    @Expose
    private String AppCamRole;

    /**
    * 数语的公网访问ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 数语的公网访问端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 数语的CAM角色id
    */
    @SerializedName("AppCamRoleId")
    @Expose
    private String AppCamRoleId;

    /**
    * 服务提供方
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * 租户id
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 主账号id
    */
    @SerializedName("OwnId")
    @Expose
    private String OwnId;

    /**
    * VpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Vpc地域
    */
    @SerializedName("VpcRegion")
    @Expose
    private String VpcRegion;

    /**
    * 数语的内网访问ip
    */
    @SerializedName("Pip")
    @Expose
    private String Pip;

    /**
    * 数语的内网访问端口
    */
    @SerializedName("Pport")
    @Expose
    private Long Pport;

    /**
    * 是否开放公网访问数语, 1:是，0:否，默认1开放
    */
    @SerializedName("IsPublic")
    @Expose
    private Long IsPublic;

    /**
     * Get 云应用的实例id 
     * @return CloudappId 云应用的实例id
     */
    public String getCloudappId() {
        return this.CloudappId;
    }

    /**
     * Set 云应用的实例id
     * @param CloudappId 云应用的实例id
     */
    public void setCloudappId(String CloudappId) {
        this.CloudappId = CloudappId;
    }

    /**
     * Get 数语的CAM角色 
     * @return AppCamRole 数语的CAM角色
     */
    public String getAppCamRole() {
        return this.AppCamRole;
    }

    /**
     * Set 数语的CAM角色
     * @param AppCamRole 数语的CAM角色
     */
    public void setAppCamRole(String AppCamRole) {
        this.AppCamRole = AppCamRole;
    }

    /**
     * Get 数语的公网访问ip 
     * @return Ip 数语的公网访问ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 数语的公网访问ip
     * @param Ip 数语的公网访问ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 数语的公网访问端口 
     * @return Port 数语的公网访问端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 数语的公网访问端口
     * @param Port 数语的公网访问端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 数语的CAM角色id 
     * @return AppCamRoleId 数语的CAM角色id
     */
    public String getAppCamRoleId() {
        return this.AppCamRoleId;
    }

    /**
     * Set 数语的CAM角色id
     * @param AppCamRoleId 数语的CAM角色id
     */
    public void setAppCamRoleId(String AppCamRoleId) {
        this.AppCamRoleId = AppCamRoleId;
    }

    /**
     * Get 服务提供方 
     * @return Provider 服务提供方
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set 服务提供方
     * @param Provider 服务提供方
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get 租户id 
     * @return TenantId 租户id
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户id
     * @param TenantId 租户id
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 主账号id 
     * @return OwnId 主账号id
     */
    public String getOwnId() {
        return this.OwnId;
    }

    /**
     * Set 主账号id
     * @param OwnId 主账号id
     */
    public void setOwnId(String OwnId) {
        this.OwnId = OwnId;
    }

    /**
     * Get VpcId 
     * @return VpcId VpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VpcId
     * @param VpcId VpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Vpc地域 
     * @return VpcRegion Vpc地域
     */
    public String getVpcRegion() {
        return this.VpcRegion;
    }

    /**
     * Set Vpc地域
     * @param VpcRegion Vpc地域
     */
    public void setVpcRegion(String VpcRegion) {
        this.VpcRegion = VpcRegion;
    }

    /**
     * Get 数语的内网访问ip 
     * @return Pip 数语的内网访问ip
     */
    public String getPip() {
        return this.Pip;
    }

    /**
     * Set 数语的内网访问ip
     * @param Pip 数语的内网访问ip
     */
    public void setPip(String Pip) {
        this.Pip = Pip;
    }

    /**
     * Get 数语的内网访问端口 
     * @return Pport 数语的内网访问端口
     */
    public Long getPport() {
        return this.Pport;
    }

    /**
     * Set 数语的内网访问端口
     * @param Pport 数语的内网访问端口
     */
    public void setPport(Long Pport) {
        this.Pport = Pport;
    }

    /**
     * Get 是否开放公网访问数语, 1:是，0:否，默认1开放 
     * @return IsPublic 是否开放公网访问数语, 1:是，0:否，默认1开放
     */
    public Long getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 是否开放公网访问数语, 1:是，0:否，默认1开放
     * @param IsPublic 是否开放公网访问数语, 1:是，0:否，默认1开放
     */
    public void setIsPublic(Long IsPublic) {
        this.IsPublic = IsPublic;
    }

    public UpdateDataModelRegistryInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDataModelRegistryInfoRequest(UpdateDataModelRegistryInfoRequest source) {
        if (source.CloudappId != null) {
            this.CloudappId = new String(source.CloudappId);
        }
        if (source.AppCamRole != null) {
            this.AppCamRole = new String(source.AppCamRole);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.AppCamRoleId != null) {
            this.AppCamRoleId = new String(source.AppCamRoleId);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.OwnId != null) {
            this.OwnId = new String(source.OwnId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcRegion != null) {
            this.VpcRegion = new String(source.VpcRegion);
        }
        if (source.Pip != null) {
            this.Pip = new String(source.Pip);
        }
        if (source.Pport != null) {
            this.Pport = new Long(source.Pport);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Long(source.IsPublic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudappId", this.CloudappId);
        this.setParamSimple(map, prefix + "AppCamRole", this.AppCamRole);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "AppCamRoleId", this.AppCamRoleId);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "OwnId", this.OwnId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcRegion", this.VpcRegion);
        this.setParamSimple(map, prefix + "Pip", this.Pip);
        this.setParamSimple(map, prefix + "Pport", this.Pport);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);

    }
}

