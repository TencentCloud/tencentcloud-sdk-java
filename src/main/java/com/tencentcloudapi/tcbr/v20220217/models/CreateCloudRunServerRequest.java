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

public class CreateCloudRunServerRequest extends AbstractModel {

    /**
    * <p>环境Id</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>服务名</p>
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * <p>部署信息</p>
    */
    @SerializedName("DeployInfo")
    @Expose
    private DeployParam DeployInfo;

    /**
    * <p>服务配置信息(已废弃)</p>
    */
    @SerializedName("ServerConfig")
    @Expose
    private ServerBaseConfig ServerConfig;

    /**
    * <p>服务配置信息</p>
    */
    @SerializedName("Items")
    @Expose
    private DiffConfigItem [] Items;

    /**
    * <p>vpc 信息</p>
    */
    @SerializedName("VpcInfo")
    @Expose
    private CreateVpcInfo VpcInfo;

    /**
     * Get <p>环境Id</p> 
     * @return EnvId <p>环境Id</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境Id</p>
     * @param EnvId <p>环境Id</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>服务名</p> 
     * @return ServerName <p>服务名</p>
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set <p>服务名</p>
     * @param ServerName <p>服务名</p>
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get <p>部署信息</p> 
     * @return DeployInfo <p>部署信息</p>
     */
    public DeployParam getDeployInfo() {
        return this.DeployInfo;
    }

    /**
     * Set <p>部署信息</p>
     * @param DeployInfo <p>部署信息</p>
     */
    public void setDeployInfo(DeployParam DeployInfo) {
        this.DeployInfo = DeployInfo;
    }

    /**
     * Get <p>服务配置信息(已废弃)</p> 
     * @return ServerConfig <p>服务配置信息(已废弃)</p>
     */
    public ServerBaseConfig getServerConfig() {
        return this.ServerConfig;
    }

    /**
     * Set <p>服务配置信息(已废弃)</p>
     * @param ServerConfig <p>服务配置信息(已废弃)</p>
     */
    public void setServerConfig(ServerBaseConfig ServerConfig) {
        this.ServerConfig = ServerConfig;
    }

    /**
     * Get <p>服务配置信息</p> 
     * @return Items <p>服务配置信息</p>
     */
    public DiffConfigItem [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>服务配置信息</p>
     * @param Items <p>服务配置信息</p>
     */
    public void setItems(DiffConfigItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get <p>vpc 信息</p> 
     * @return VpcInfo <p>vpc 信息</p>
     */
    public CreateVpcInfo getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set <p>vpc 信息</p>
     * @param VpcInfo <p>vpc 信息</p>
     */
    public void setVpcInfo(CreateVpcInfo VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    public CreateCloudRunServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudRunServerRequest(CreateCloudRunServerRequest source) {
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
        if (source.Items != null) {
            this.Items = new DiffConfigItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DiffConfigItem(source.Items[i]);
            }
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new CreateVpcInfo(source.VpcInfo);
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
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamObj(map, prefix + "VpcInfo.", this.VpcInfo);

    }
}

