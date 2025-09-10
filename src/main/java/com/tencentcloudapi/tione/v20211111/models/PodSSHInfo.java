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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodSSHInfo extends AbstractModel {

    /**
    * pod访问ip
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * pod ssh访问端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * ssh访问命令
    */
    @SerializedName("LoginCommand")
    @Expose
    private String LoginCommand;

    /**
     * Get pod访问ip 
     * @return Host pod访问ip
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set pod访问ip
     * @param Host pod访问ip
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get pod ssh访问端口 
     * @return Port pod ssh访问端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set pod ssh访问端口
     * @param Port pod ssh访问端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get ssh访问命令 
     * @return LoginCommand ssh访问命令
     */
    public String getLoginCommand() {
        return this.LoginCommand;
    }

    /**
     * Set ssh访问命令
     * @param LoginCommand ssh访问命令
     */
    public void setLoginCommand(String LoginCommand) {
        this.LoginCommand = LoginCommand;
    }

    public PodSSHInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodSSHInfo(PodSSHInfo source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.LoginCommand != null) {
            this.LoginCommand = new String(source.LoginCommand);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "LoginCommand", this.LoginCommand);

    }
}

