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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerConfiguration extends AbstractModel{

    /**
    * SIP服务器地址
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * SIP服务器端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * SIP服务器编码
    */
    @SerializedName("Serial")
    @Expose
    private String Serial;

    /**
    * SIP服务器域
    */
    @SerializedName("Realm")
    @Expose
    private String Realm;

    /**
     * Get SIP服务器地址 
     * @return Host SIP服务器地址
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set SIP服务器地址
     * @param Host SIP服务器地址
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get SIP服务器端口 
     * @return Port SIP服务器端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set SIP服务器端口
     * @param Port SIP服务器端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get SIP服务器编码 
     * @return Serial SIP服务器编码
     */
    public String getSerial() {
        return this.Serial;
    }

    /**
     * Set SIP服务器编码
     * @param Serial SIP服务器编码
     */
    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    /**
     * Get SIP服务器域 
     * @return Realm SIP服务器域
     */
    public String getRealm() {
        return this.Realm;
    }

    /**
     * Set SIP服务器域
     * @param Realm SIP服务器域
     */
    public void setRealm(String Realm) {
        this.Realm = Realm;
    }

    public ServerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerConfiguration(ServerConfiguration source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Serial != null) {
            this.Serial = new String(source.Serial);
        }
        if (source.Realm != null) {
            this.Realm = new String(source.Realm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Serial", this.Serial);
        this.setParamSimple(map, prefix + "Realm", this.Realm);

    }
}

