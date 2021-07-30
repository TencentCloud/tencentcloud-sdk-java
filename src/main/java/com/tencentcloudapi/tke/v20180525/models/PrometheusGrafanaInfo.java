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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusGrafanaInfo extends AbstractModel{

    /**
    * 是否启用
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 域名，只有开启外网访问才有效果
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 内网地址，或者外网地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 是否开启了外网访问
close = 未开启外网访问
opening = 正在开启外网访问
open  = 已开启外网访问
    */
    @SerializedName("Internet")
    @Expose
    private String Internet;

    /**
    * grafana管理员用户名
    */
    @SerializedName("AdminUser")
    @Expose
    private String AdminUser;

    /**
     * Get 是否启用 
     * @return Enabled 是否启用
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用
     * @param Enabled 是否启用
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 域名，只有开启外网访问才有效果 
     * @return Domain 域名，只有开启外网访问才有效果
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名，只有开启外网访问才有效果
     * @param Domain 域名，只有开启外网访问才有效果
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 内网地址，或者外网地址 
     * @return Address 内网地址，或者外网地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 内网地址，或者外网地址
     * @param Address 内网地址，或者外网地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 是否开启了外网访问
close = 未开启外网访问
opening = 正在开启外网访问
open  = 已开启外网访问 
     * @return Internet 是否开启了外网访问
close = 未开启外网访问
opening = 正在开启外网访问
open  = 已开启外网访问
     */
    public String getInternet() {
        return this.Internet;
    }

    /**
     * Set 是否开启了外网访问
close = 未开启外网访问
opening = 正在开启外网访问
open  = 已开启外网访问
     * @param Internet 是否开启了外网访问
close = 未开启外网访问
opening = 正在开启外网访问
open  = 已开启外网访问
     */
    public void setInternet(String Internet) {
        this.Internet = Internet;
    }

    /**
     * Get grafana管理员用户名 
     * @return AdminUser grafana管理员用户名
     */
    public String getAdminUser() {
        return this.AdminUser;
    }

    /**
     * Set grafana管理员用户名
     * @param AdminUser grafana管理员用户名
     */
    public void setAdminUser(String AdminUser) {
        this.AdminUser = AdminUser;
    }

    public PrometheusGrafanaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusGrafanaInfo(PrometheusGrafanaInfo source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Internet != null) {
            this.Internet = new String(source.Internet);
        }
        if (source.AdminUser != null) {
            this.AdminUser = new String(source.AdminUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Internet", this.Internet);
        this.setParamSimple(map, prefix + "AdminUser", this.AdminUser);

    }
}

