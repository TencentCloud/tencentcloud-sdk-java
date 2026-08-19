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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayInfo extends AbstractModel {

    /**
    * <p>网关ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>网关名称</p>
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * <p>创建时间，单位：秒</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>网关状态。0：正常，1：异常</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>网关实例数</p>
    */
    @SerializedName("InstanceSize")
    @Expose
    private Long InstanceSize;

    /**
    * <p>网关内网IP。</p>
    */
    @SerializedName("GatewayIp")
    @Expose
    private String GatewayIp;

    /**
    * <p>用户名。</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>网关接入token。</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * <p>网关注册URL。</p>
    */
    @SerializedName("RegisterCenterUrl")
    @Expose
    private String RegisterCenterUrl;

    /**
    * <p>网关上报URL。</p>
    */
    @SerializedName("TelemetryUrl")
    @Expose
    private String TelemetryUrl;

    /**
     * Get <p>网关ID</p> 
     * @return GatewayId <p>网关ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关ID</p>
     * @param GatewayId <p>网关ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>网关名称</p> 
     * @return GatewayName <p>网关名称</p>
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set <p>网关名称</p>
     * @param GatewayName <p>网关名称</p>
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get <p>创建时间，单位：秒</p> 
     * @return CreateTime <p>创建时间，单位：秒</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，单位：秒</p>
     * @param CreateTime <p>创建时间，单位：秒</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>网关状态。0：正常，1：异常</p> 
     * @return Status <p>网关状态。0：正常，1：异常</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>网关状态。0：正常，1：异常</p>
     * @param Status <p>网关状态。0：正常，1：异常</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>网关实例数</p> 
     * @return InstanceSize <p>网关实例数</p>
     */
    public Long getInstanceSize() {
        return this.InstanceSize;
    }

    /**
     * Set <p>网关实例数</p>
     * @param InstanceSize <p>网关实例数</p>
     */
    public void setInstanceSize(Long InstanceSize) {
        this.InstanceSize = InstanceSize;
    }

    /**
     * Get <p>网关内网IP。</p> 
     * @return GatewayIp <p>网关内网IP。</p>
     */
    public String getGatewayIp() {
        return this.GatewayIp;
    }

    /**
     * Set <p>网关内网IP。</p>
     * @param GatewayIp <p>网关内网IP。</p>
     */
    public void setGatewayIp(String GatewayIp) {
        this.GatewayIp = GatewayIp;
    }

    /**
     * Get <p>用户名。</p> 
     * @return Username <p>用户名。</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>用户名。</p>
     * @param Username <p>用户名。</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>网关接入token。</p> 
     * @return Token <p>网关接入token。</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>网关接入token。</p>
     * @param Token <p>网关接入token。</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get <p>网关注册URL。</p> 
     * @return RegisterCenterUrl <p>网关注册URL。</p>
     */
    public String getRegisterCenterUrl() {
        return this.RegisterCenterUrl;
    }

    /**
     * Set <p>网关注册URL。</p>
     * @param RegisterCenterUrl <p>网关注册URL。</p>
     */
    public void setRegisterCenterUrl(String RegisterCenterUrl) {
        this.RegisterCenterUrl = RegisterCenterUrl;
    }

    /**
     * Get <p>网关上报URL。</p> 
     * @return TelemetryUrl <p>网关上报URL。</p>
     */
    public String getTelemetryUrl() {
        return this.TelemetryUrl;
    }

    /**
     * Set <p>网关上报URL。</p>
     * @param TelemetryUrl <p>网关上报URL。</p>
     */
    public void setTelemetryUrl(String TelemetryUrl) {
        this.TelemetryUrl = TelemetryUrl;
    }

    public GatewayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayInfo(GatewayInfo source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceSize != null) {
            this.InstanceSize = new Long(source.InstanceSize);
        }
        if (source.GatewayIp != null) {
            this.GatewayIp = new String(source.GatewayIp);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.RegisterCenterUrl != null) {
            this.RegisterCenterUrl = new String(source.RegisterCenterUrl);
        }
        if (source.TelemetryUrl != null) {
            this.TelemetryUrl = new String(source.TelemetryUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceSize", this.InstanceSize);
        this.setParamSimple(map, prefix + "GatewayIp", this.GatewayIp);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "RegisterCenterUrl", this.RegisterCenterUrl);
        this.setParamSimple(map, prefix + "TelemetryUrl", this.TelemetryUrl);

    }
}

