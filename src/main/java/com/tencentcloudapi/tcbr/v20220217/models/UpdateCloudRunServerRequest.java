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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCloudRunServerRequest extends AbstractModel {

    /**
    * 环境Id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 服务名
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 部署信息
    */
    @SerializedName("DeployInfo")
    @Expose
    private DeployParam DeployInfo;

    /**
    * 服务配置信息(已废弃)
    */
    @SerializedName("ServerConfig")
    @Expose
    private ServerBaseConfig ServerConfig;

    /**
    * 业务类型，默认tcr
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 服务配置信息
    */
    @SerializedName("Items")
    @Expose
    private DiffConfigItem [] Items;

    /**
     * Get 环境Id 
     * @return EnvId 环境Id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境Id
     * @param EnvId 环境Id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 服务名 
     * @return ServerName 服务名
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名
     * @param ServerName 服务名
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 部署信息 
     * @return DeployInfo 部署信息
     */
    public DeployParam getDeployInfo() {
        return this.DeployInfo;
    }

    /**
     * Set 部署信息
     * @param DeployInfo 部署信息
     */
    public void setDeployInfo(DeployParam DeployInfo) {
        this.DeployInfo = DeployInfo;
    }

    /**
     * Get 服务配置信息(已废弃) 
     * @return ServerConfig 服务配置信息(已废弃)
     */
    public ServerBaseConfig getServerConfig() {
        return this.ServerConfig;
    }

    /**
     * Set 服务配置信息(已废弃)
     * @param ServerConfig 服务配置信息(已废弃)
     */
    public void setServerConfig(ServerBaseConfig ServerConfig) {
        this.ServerConfig = ServerConfig;
    }

    /**
     * Get 业务类型，默认tcr 
     * @return Business 业务类型，默认tcr
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 业务类型，默认tcr
     * @param Business 业务类型，默认tcr
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 服务配置信息 
     * @return Items 服务配置信息
     */
    public DiffConfigItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 服务配置信息
     * @param Items 服务配置信息
     */
    public void setItems(DiffConfigItem [] Items) {
        this.Items = Items;
    }

    public UpdateCloudRunServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCloudRunServerRequest(UpdateCloudRunServerRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.DeployInfo != null) {
            this.DeployInfo = new DeployParam(source.DeployInfo);
        }
        if (source.ServerConfig != null) {
            this.ServerConfig = new ServerBaseConfig(source.ServerConfig);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Items != null) {
            this.Items = new DiffConfigItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DiffConfigItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamObj(map, prefix + "DeployInfo.", this.DeployInfo);
        this.setParamObj(map, prefix + "ServerConfig.", this.ServerConfig);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

