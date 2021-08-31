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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectMachine extends AbstractModel{

    /**
    * 机器名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 机器IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 防护目录数
    */
    @SerializedName("SafeguardDirNum")
    @Expose
    private Long SafeguardDirNum;

    /**
     * Get 机器名称 
     * @return HostName 机器名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 机器名称
     * @param HostName 机器名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 机器IP 
     * @return HostIp 机器IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 机器IP
     * @param HostIp 机器IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 防护目录数 
     * @return SafeguardDirNum 防护目录数
     */
    public Long getSafeguardDirNum() {
        return this.SafeguardDirNum;
    }

    /**
     * Set 防护目录数
     * @param SafeguardDirNum 防护目录数
     */
    public void setSafeguardDirNum(Long SafeguardDirNum) {
        this.SafeguardDirNum = SafeguardDirNum;
    }

    public ProtectMachine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectMachine(ProtectMachine source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.SafeguardDirNum != null) {
            this.SafeguardDirNum = new Long(source.SafeguardDirNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "SafeguardDirNum", this.SafeguardDirNum);

    }
}

