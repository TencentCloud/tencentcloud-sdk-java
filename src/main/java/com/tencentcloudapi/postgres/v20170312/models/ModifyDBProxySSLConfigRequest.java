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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBProxySSLConfigRequest extends AbstractModel {

    /**
    * 实例 ID，指定要修改 SSL 配置的数据库代理所属的目标实例
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 代理组 ID，指定要修改 SSL 配置的代理组
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 代理地址 ID，指定要修改 SSL 配置的代理连接地址
    */
    @SerializedName("ProxyAddressId")
    @Expose
    private String ProxyAddressId;

    /**
    * SSL 开关。true：开启 SSL；false：关闭 SSL
    */
    @SerializedName("SSLEnabled")
    @Expose
    private Boolean SSLEnabled;

    /**
    * 连接地址。SSLEnabled 为 true 时必填，需与代理地址的 Vip 保持一致，用于 SSL 证书校验
    */
    @SerializedName("ConnectAddress")
    @Expose
    private String ConnectAddress;

    /**
     * Get 实例 ID，指定要修改 SSL 配置的数据库代理所属的目标实例 
     * @return DBInstanceId 实例 ID，指定要修改 SSL 配置的数据库代理所属的目标实例
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例 ID，指定要修改 SSL 配置的数据库代理所属的目标实例
     * @param DBInstanceId 实例 ID，指定要修改 SSL 配置的数据库代理所属的目标实例
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 代理组 ID，指定要修改 SSL 配置的代理组 
     * @return ProxyGroupId 代理组 ID，指定要修改 SSL 配置的代理组
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 代理组 ID，指定要修改 SSL 配置的代理组
     * @param ProxyGroupId 代理组 ID，指定要修改 SSL 配置的代理组
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 代理地址 ID，指定要修改 SSL 配置的代理连接地址 
     * @return ProxyAddressId 代理地址 ID，指定要修改 SSL 配置的代理连接地址
     */
    public String getProxyAddressId() {
        return this.ProxyAddressId;
    }

    /**
     * Set 代理地址 ID，指定要修改 SSL 配置的代理连接地址
     * @param ProxyAddressId 代理地址 ID，指定要修改 SSL 配置的代理连接地址
     */
    public void setProxyAddressId(String ProxyAddressId) {
        this.ProxyAddressId = ProxyAddressId;
    }

    /**
     * Get SSL 开关。true：开启 SSL；false：关闭 SSL 
     * @return SSLEnabled SSL 开关。true：开启 SSL；false：关闭 SSL
     */
    public Boolean getSSLEnabled() {
        return this.SSLEnabled;
    }

    /**
     * Set SSL 开关。true：开启 SSL；false：关闭 SSL
     * @param SSLEnabled SSL 开关。true：开启 SSL；false：关闭 SSL
     */
    public void setSSLEnabled(Boolean SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
    }

    /**
     * Get 连接地址。SSLEnabled 为 true 时必填，需与代理地址的 Vip 保持一致，用于 SSL 证书校验 
     * @return ConnectAddress 连接地址。SSLEnabled 为 true 时必填，需与代理地址的 Vip 保持一致，用于 SSL 证书校验
     */
    public String getConnectAddress() {
        return this.ConnectAddress;
    }

    /**
     * Set 连接地址。SSLEnabled 为 true 时必填，需与代理地址的 Vip 保持一致，用于 SSL 证书校验
     * @param ConnectAddress 连接地址。SSLEnabled 为 true 时必填，需与代理地址的 Vip 保持一致，用于 SSL 证书校验
     */
    public void setConnectAddress(String ConnectAddress) {
        this.ConnectAddress = ConnectAddress;
    }

    public ModifyDBProxySSLConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBProxySSLConfigRequest(ModifyDBProxySSLConfigRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ProxyAddressId != null) {
            this.ProxyAddressId = new String(source.ProxyAddressId);
        }
        if (source.SSLEnabled != null) {
            this.SSLEnabled = new Boolean(source.SSLEnabled);
        }
        if (source.ConnectAddress != null) {
            this.ConnectAddress = new String(source.ConnectAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ProxyAddressId", this.ProxyAddressId);
        this.setParamSimple(map, prefix + "SSLEnabled", this.SSLEnabled);
        this.setParamSimple(map, prefix + "ConnectAddress", this.ConnectAddress);

    }
}

