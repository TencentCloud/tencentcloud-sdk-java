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

public class DescribeVersionDetailRequest extends AbstractModel {

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
    * <p>版本名</p>
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * <p>channel</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

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
     * Get <p>版本名</p> 
     * @return VersionName <p>版本名</p>
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set <p>版本名</p>
     * @param VersionName <p>版本名</p>
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get <p>channel</p> 
     * @return Channel <p>channel</p>
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>channel</p>
     * @param Channel <p>channel</p>
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    public DescribeVersionDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVersionDetailRequest(DescribeVersionDetailRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

