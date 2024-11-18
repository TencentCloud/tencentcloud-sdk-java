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
    * 数语的ip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 数语的端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

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
     * Get 数语的ip 
     * @return Vip 数语的ip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 数语的ip
     * @param Vip 数语的ip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 数语的端口 
     * @return Vport 数语的端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 数语的端口
     * @param Vport 数语的端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
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
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudappId", this.CloudappId);
        this.setParamSimple(map, prefix + "AppCamRole", this.AppCamRole);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "AppCamRoleId", this.AppCamRoleId);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "OwnId", this.OwnId);

    }
}

