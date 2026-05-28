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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentPluginConfig extends AbstractModel {

    /**
    * Helm Chart 版本，一般无需指定
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChartVersion")
    @Expose
    private String ChartVersion;

    /**
    * 外部 PostgreSQL 内网地址；配置后跳过内置 PostgreSQL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 外部 PostgreSQL 密码，配置 Host 时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 外部 PostgreSQL 端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * SSL 模式，取值：disable / require / verify-full
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * Agent 实例访问域名，不填则不创建域名路由
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceDomain")
    @Expose
    private String ServiceDomain;

    /**
    * 外部 PostgreSQL 用户名，配置 Host 时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
     * Get Helm Chart 版本，一般无需指定
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChartVersion Helm Chart 版本，一般无需指定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChartVersion() {
        return this.ChartVersion;
    }

    /**
     * Set Helm Chart 版本，一般无需指定
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChartVersion Helm Chart 版本，一般无需指定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChartVersion(String ChartVersion) {
        this.ChartVersion = ChartVersion;
    }

    /**
     * Get 外部 PostgreSQL 内网地址；配置后跳过内置 PostgreSQL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host 外部 PostgreSQL 内网地址；配置后跳过内置 PostgreSQL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 外部 PostgreSQL 内网地址；配置后跳过内置 PostgreSQL
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host 外部 PostgreSQL 内网地址；配置后跳过内置 PostgreSQL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 外部 PostgreSQL 密码，配置 Host 时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password 外部 PostgreSQL 密码，配置 Host 时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 外部 PostgreSQL 密码，配置 Host 时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password 外部 PostgreSQL 密码，配置 Host 时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 外部 PostgreSQL 端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 外部 PostgreSQL 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 外部 PostgreSQL 端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 外部 PostgreSQL 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get SSL 模式，取值：disable / require / verify-full
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SSLMode SSL 模式，取值：disable / require / verify-full
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set SSL 模式，取值：disable / require / verify-full
注意：此字段可能返回 null，表示取不到有效值。
     * @param SSLMode SSL 模式，取值：disable / require / verify-full
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get Agent 实例访问域名，不填则不创建域名路由
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceDomain Agent 实例访问域名，不填则不创建域名路由
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceDomain() {
        return this.ServiceDomain;
    }

    /**
     * Set Agent 实例访问域名，不填则不创建域名路由
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceDomain Agent 实例访问域名，不填则不创建域名路由
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceDomain(String ServiceDomain) {
        this.ServiceDomain = ServiceDomain;
    }

    /**
     * Get 外部 PostgreSQL 用户名，配置 Host 时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Username 外部 PostgreSQL 用户名，配置 Host 时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 外部 PostgreSQL 用户名，配置 Host 时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param Username 外部 PostgreSQL 用户名，配置 Host 时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public AgentPluginConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentPluginConfig(AgentPluginConfig source) {
        if (source.ChartVersion != null) {
            this.ChartVersion = new String(source.ChartVersion);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.SSLMode != null) {
            this.SSLMode = new String(source.SSLMode);
        }
        if (source.ServiceDomain != null) {
            this.ServiceDomain = new String(source.ServiceDomain);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChartVersion", this.ChartVersion);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);
        this.setParamSimple(map, prefix + "ServiceDomain", this.ServiceDomain);
        this.setParamSimple(map, prefix + "Username", this.Username);

    }
}

