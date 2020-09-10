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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FirewallRuleInfo extends AbstractModel{

    /**
    * 应用类型，取值：自定义，HTTP(80)，HTTPS(443)，Linux登录(22)，Windows登录(3389)，MySQL(3306)，SQL Server(1433)，全部TCP，全部UDP，ALL。
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * 协议，取值：TCP，UDP，ALL。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口，取值：ALL，单独的端口，逗号分隔的离散端口，减号分隔的端口范围。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
     * Get 应用类型，取值：自定义，HTTP(80)，HTTPS(443)，Linux登录(22)，Windows登录(3389)，MySQL(3306)，SQL Server(1433)，全部TCP，全部UDP，ALL。 
     * @return AppType 应用类型，取值：自定义，HTTP(80)，HTTPS(443)，Linux登录(22)，Windows登录(3389)，MySQL(3306)，SQL Server(1433)，全部TCP，全部UDP，ALL。
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型，取值：自定义，HTTP(80)，HTTPS(443)，Linux登录(22)，Windows登录(3389)，MySQL(3306)，SQL Server(1433)，全部TCP，全部UDP，ALL。
     * @param AppType 应用类型，取值：自定义，HTTP(80)，HTTPS(443)，Linux登录(22)，Windows登录(3389)，MySQL(3306)，SQL Server(1433)，全部TCP，全部UDP，ALL。
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get 协议，取值：TCP，UDP，ALL。 
     * @return Protocol 协议，取值：TCP，UDP，ALL。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，取值：TCP，UDP，ALL。
     * @param Protocol 协议，取值：TCP，UDP，ALL。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口，取值：ALL，单独的端口，逗号分隔的离散端口，减号分隔的端口范围。 
     * @return Port 端口，取值：ALL，单独的端口，逗号分隔的离散端口，减号分隔的端口范围。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口，取值：ALL，单独的端口，逗号分隔的离散端口，减号分隔的端口范围。
     * @param Port 端口，取值：ALL，单独的端口，逗号分隔的离散端口，减号分隔的端口范围。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

