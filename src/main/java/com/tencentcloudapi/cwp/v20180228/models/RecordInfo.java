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

public class RecordInfo extends AbstractModel{

    /**
    * 主机ip
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 主机实例id
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 客户端离线时间
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * 客户端卸载时间
    */
    @SerializedName("UninstallTime")
    @Expose
    private String UninstallTime;

    /**
    * 客户端卸载调用链
    */
    @SerializedName("UninstallCmd")
    @Expose
    private String UninstallCmd;

    /**
    * 客户端uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get 主机ip 
     * @return HostIP 主机ip
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 主机ip
     * @param HostIP 主机ip
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get 主机实例id 
     * @return InstanceID 主机实例id
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 主机实例id
     * @param InstanceID 主机实例id
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 客户端离线时间 
     * @return OfflineTime 客户端离线时间
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set 客户端离线时间
     * @param OfflineTime 客户端离线时间
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get 客户端卸载时间 
     * @return UninstallTime 客户端卸载时间
     */
    public String getUninstallTime() {
        return this.UninstallTime;
    }

    /**
     * Set 客户端卸载时间
     * @param UninstallTime 客户端卸载时间
     */
    public void setUninstallTime(String UninstallTime) {
        this.UninstallTime = UninstallTime;
    }

    /**
     * Get 客户端卸载调用链 
     * @return UninstallCmd 客户端卸载调用链
     */
    public String getUninstallCmd() {
        return this.UninstallCmd;
    }

    /**
     * Set 客户端卸载调用链
     * @param UninstallCmd 客户端卸载调用链
     */
    public void setUninstallCmd(String UninstallCmd) {
        this.UninstallCmd = UninstallCmd;
    }

    /**
     * Get 客户端uuid 
     * @return Uuid 客户端uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 客户端uuid
     * @param Uuid 客户端uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public RecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordInfo(RecordInfo source) {
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.UninstallTime != null) {
            this.UninstallTime = new String(source.UninstallTime);
        }
        if (source.UninstallCmd != null) {
            this.UninstallCmd = new String(source.UninstallCmd);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "UninstallTime", this.UninstallTime);
        this.setParamSimple(map, prefix + "UninstallCmd", this.UninstallCmd);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

