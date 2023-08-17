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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateClientStateRequest extends AbstractModel{

    /**
    * Client Id
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Ip addr
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 内部分组
    */
    @SerializedName("Internal")
    @Expose
    private Long Internal;

    /**
    * Client  Version
    */
    @SerializedName("ServerVersion")
    @Expose
    private String ServerVersion;

    /**
    * 主机
    */
    @SerializedName("Hostname")
    @Expose
    private String Hostname;

    /**
    * 系统
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
     * Get Client Id 
     * @return ClientId Client Id
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client Id
     * @param ClientId Client Id
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Ip addr 
     * @return Ip Ip addr
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Ip addr
     * @param Ip Ip addr
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 内部分组 
     * @return Internal 内部分组
     */
    public Long getInternal() {
        return this.Internal;
    }

    /**
     * Set 内部分组
     * @param Internal 内部分组
     */
    public void setInternal(Long Internal) {
        this.Internal = Internal;
    }

    /**
     * Get Client  Version 
     * @return ServerVersion Client  Version
     */
    public String getServerVersion() {
        return this.ServerVersion;
    }

    /**
     * Set Client  Version
     * @param ServerVersion Client  Version
     */
    public void setServerVersion(String ServerVersion) {
        this.ServerVersion = ServerVersion;
    }

    /**
     * Get 主机 
     * @return Hostname 主机
     */
    public String getHostname() {
        return this.Hostname;
    }

    /**
     * Set 主机
     * @param Hostname 主机
     */
    public void setHostname(String Hostname) {
        this.Hostname = Hostname;
    }

    /**
     * Get 系统 
     * @return Os 系统
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set 系统
     * @param Os 系统
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    public UpdateClientStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateClientStateRequest(UpdateClientStateRequest source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Internal != null) {
            this.Internal = new Long(source.Internal);
        }
        if (source.ServerVersion != null) {
            this.ServerVersion = new String(source.ServerVersion);
        }
        if (source.Hostname != null) {
            this.Hostname = new String(source.Hostname);
        }
        if (source.Os != null) {
            this.Os = new String(source.Os);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Internal", this.Internal);
        this.setParamSimple(map, prefix + "ServerVersion", this.ServerVersion);
        this.setParamSimple(map, prefix + "Hostname", this.Hostname);
        this.setParamSimple(map, prefix + "Os", this.Os);

    }
}

