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

public class ServerBaseInfo extends AbstractModel {

    /**
    * 服务名
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 默认服务域名
    */
    @SerializedName("DefaultDomainName")
    @Expose
    private String DefaultDomainName;

    /**
    * 自定义域名
    */
    @SerializedName("CustomDomainName")
    @Expose
    private String CustomDomainName;

    /**
    * 服务状态：running/deploying/deploy_failed
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 公网访问类型
    */
    @SerializedName("AccessTypes")
    @Expose
    private String [] AccessTypes;

    /**
    * 展示自定义域名
    */
    @SerializedName("CustomDomainNames")
    @Expose
    private String [] CustomDomainNames;

    /**
    * 服务类型: function 云函数2.0；container 容器服务
    */
    @SerializedName("ServerType")
    @Expose
    private String ServerType;

    /**
    * 流量类型，目前只有 FLOW
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
     * Get 默认服务域名 
     * @return DefaultDomainName 默认服务域名
     */
    public String getDefaultDomainName() {
        return this.DefaultDomainName;
    }

    /**
     * Set 默认服务域名
     * @param DefaultDomainName 默认服务域名
     */
    public void setDefaultDomainName(String DefaultDomainName) {
        this.DefaultDomainName = DefaultDomainName;
    }

    /**
     * Get 自定义域名 
     * @return CustomDomainName 自定义域名
     */
    public String getCustomDomainName() {
        return this.CustomDomainName;
    }

    /**
     * Set 自定义域名
     * @param CustomDomainName 自定义域名
     */
    public void setCustomDomainName(String CustomDomainName) {
        this.CustomDomainName = CustomDomainName;
    }

    /**
     * Get 服务状态：running/deploying/deploy_failed 
     * @return Status 服务状态：running/deploying/deploy_failed
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 服务状态：running/deploying/deploy_failed
     * @param Status 服务状态：running/deploying/deploy_failed
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 公网访问类型 
     * @return AccessTypes 公网访问类型
     */
    public String [] getAccessTypes() {
        return this.AccessTypes;
    }

    /**
     * Set 公网访问类型
     * @param AccessTypes 公网访问类型
     */
    public void setAccessTypes(String [] AccessTypes) {
        this.AccessTypes = AccessTypes;
    }

    /**
     * Get 展示自定义域名 
     * @return CustomDomainNames 展示自定义域名
     */
    public String [] getCustomDomainNames() {
        return this.CustomDomainNames;
    }

    /**
     * Set 展示自定义域名
     * @param CustomDomainNames 展示自定义域名
     */
    public void setCustomDomainNames(String [] CustomDomainNames) {
        this.CustomDomainNames = CustomDomainNames;
    }

    /**
     * Get 服务类型: function 云函数2.0；container 容器服务 
     * @return ServerType 服务类型: function 云函数2.0；container 容器服务
     */
    public String getServerType() {
        return this.ServerType;
    }

    /**
     * Set 服务类型: function 云函数2.0；container 容器服务
     * @param ServerType 服务类型: function 云函数2.0；container 容器服务
     */
    public void setServerType(String ServerType) {
        this.ServerType = ServerType;
    }

    /**
     * Get 流量类型，目前只有 FLOW 
     * @return TrafficType 流量类型，目前只有 FLOW
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * Set 流量类型，目前只有 FLOW
     * @param TrafficType 流量类型，目前只有 FLOW
     */
    public void setTrafficType(String TrafficType) {
        this.TrafficType = TrafficType;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ServerBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerBaseInfo(ServerBaseInfo source) {
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.DefaultDomainName != null) {
            this.DefaultDomainName = new String(source.DefaultDomainName);
        }
        if (source.CustomDomainName != null) {
            this.CustomDomainName = new String(source.CustomDomainName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AccessTypes != null) {
            this.AccessTypes = new String[source.AccessTypes.length];
            for (int i = 0; i < source.AccessTypes.length; i++) {
                this.AccessTypes[i] = new String(source.AccessTypes[i]);
            }
        }
        if (source.CustomDomainNames != null) {
            this.CustomDomainNames = new String[source.CustomDomainNames.length];
            for (int i = 0; i < source.CustomDomainNames.length; i++) {
                this.CustomDomainNames[i] = new String(source.CustomDomainNames[i]);
            }
        }
        if (source.ServerType != null) {
            this.ServerType = new String(source.ServerType);
        }
        if (source.TrafficType != null) {
            this.TrafficType = new String(source.TrafficType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "DefaultDomainName", this.DefaultDomainName);
        this.setParamSimple(map, prefix + "CustomDomainName", this.CustomDomainName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "AccessTypes.", this.AccessTypes);
        this.setParamArraySimple(map, prefix + "CustomDomainNames.", this.CustomDomainNames);
        this.setParamSimple(map, prefix + "ServerType", this.ServerType);
        this.setParamSimple(map, prefix + "TrafficType", this.TrafficType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

