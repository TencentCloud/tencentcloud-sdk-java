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
package com.tencentcloudapi.msp.v20180319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SrcInfo extends AbstractModel{

    /**
    * 迁移源地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 迁移源Ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 迁移源端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 迁移源实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 迁移源地域 
     * @return Region 迁移源地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 迁移源地域
     * @param Region 迁移源地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 迁移源Ip 
     * @return Ip 迁移源Ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 迁移源Ip
     * @param Ip 迁移源Ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 迁移源端口 
     * @return Port 迁移源端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 迁移源端口
     * @param Port 迁移源端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 迁移源实例Id 
     * @return InstanceId 迁移源实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 迁移源实例Id
     * @param InstanceId 迁移源实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

