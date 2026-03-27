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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVmInstanceRequest extends AbstractModel {

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 服务器类型：
LightHouse = 轻量云服务器
CVM = 云服务器
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 轻量云服务器套餐ID。 当Type=LightHouse时必传
    */
    @SerializedName("LightHouseBundleId")
    @Expose
    private String LightHouseBundleId;

    /**
    * 轻量云服务器镜像ID。当Type=LightHouse时必传
    */
    @SerializedName("LightHouseBlueprintId")
    @Expose
    private String LightHouseBlueprintId;

    /**
    * 服务器别名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 登录方式
    */
    @SerializedName("LoginConfiguration")
    @Expose
    private VMLoginConfiguration LoginConfiguration;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 服务器类型：
LightHouse = 轻量云服务器
CVM = 云服务器 
     * @return Type 服务器类型：
LightHouse = 轻量云服务器
CVM = 云服务器
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 服务器类型：
LightHouse = 轻量云服务器
CVM = 云服务器
     * @param Type 服务器类型：
LightHouse = 轻量云服务器
CVM = 云服务器
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 轻量云服务器套餐ID。 当Type=LightHouse时必传 
     * @return LightHouseBundleId 轻量云服务器套餐ID。 当Type=LightHouse时必传
     */
    public String getLightHouseBundleId() {
        return this.LightHouseBundleId;
    }

    /**
     * Set 轻量云服务器套餐ID。 当Type=LightHouse时必传
     * @param LightHouseBundleId 轻量云服务器套餐ID。 当Type=LightHouse时必传
     */
    public void setLightHouseBundleId(String LightHouseBundleId) {
        this.LightHouseBundleId = LightHouseBundleId;
    }

    /**
     * Get 轻量云服务器镜像ID。当Type=LightHouse时必传 
     * @return LightHouseBlueprintId 轻量云服务器镜像ID。当Type=LightHouse时必传
     */
    public String getLightHouseBlueprintId() {
        return this.LightHouseBlueprintId;
    }

    /**
     * Set 轻量云服务器镜像ID。当Type=LightHouse时必传
     * @param LightHouseBlueprintId 轻量云服务器镜像ID。当Type=LightHouse时必传
     */
    public void setLightHouseBlueprintId(String LightHouseBlueprintId) {
        this.LightHouseBlueprintId = LightHouseBlueprintId;
    }

    /**
     * Get 服务器别名 
     * @return InstanceName 服务器别名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 服务器别名
     * @param InstanceName 服务器别名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 登录方式 
     * @return LoginConfiguration 登录方式
     */
    public VMLoginConfiguration getLoginConfiguration() {
        return this.LoginConfiguration;
    }

    /**
     * Set 登录方式
     * @param LoginConfiguration 登录方式
     */
    public void setLoginConfiguration(VMLoginConfiguration LoginConfiguration) {
        this.LoginConfiguration = LoginConfiguration;
    }

    public CreateVmInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVmInstanceRequest(CreateVmInstanceRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.LightHouseBundleId != null) {
            this.LightHouseBundleId = new String(source.LightHouseBundleId);
        }
        if (source.LightHouseBlueprintId != null) {
            this.LightHouseBlueprintId = new String(source.LightHouseBlueprintId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.LoginConfiguration != null) {
            this.LoginConfiguration = new VMLoginConfiguration(source.LoginConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "LightHouseBundleId", this.LightHouseBundleId);
        this.setParamSimple(map, prefix + "LightHouseBlueprintId", this.LightHouseBlueprintId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamObj(map, prefix + "LoginConfiguration.", this.LoginConfiguration);

    }
}

