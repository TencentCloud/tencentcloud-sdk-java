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

public class LicenseBindDetail extends AbstractModel{

    /**
    * 机器别名
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 机器公网IP
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 机器内网IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 云服务器UUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 云镜客户端UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 标签信息
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 云镜客户端状态,OFFLINE 离线,ONLINE 在线,UNINSTALL 未安装
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * 是否允许解绑,false 不允许解绑
    */
    @SerializedName("IsUnBind")
    @Expose
    private Boolean IsUnBind;

    /**
    * 是否允许换绑,false 不允许换绑
    */
    @SerializedName("IsSwitchBind")
    @Expose
    private Boolean IsSwitchBind;

    /**
     * Get 机器别名 
     * @return MachineName 机器别名
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 机器别名
     * @param MachineName 机器别名
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 机器公网IP 
     * @return MachineWanIp 机器公网IP
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 机器公网IP
     * @param MachineWanIp 机器公网IP
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get 机器内网IP 
     * @return MachineIp 机器内网IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 机器内网IP
     * @param MachineIp 机器内网IP
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 云服务器UUID 
     * @return Quuid 云服务器UUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 云服务器UUID
     * @param Quuid 云服务器UUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 云镜客户端UUID 
     * @return Uuid 云镜客户端UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 云镜客户端UUID
     * @param Uuid 云镜客户端UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 标签信息 
     * @return Tags 标签信息
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息
     * @param Tags 标签信息
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 云镜客户端状态,OFFLINE 离线,ONLINE 在线,UNINSTALL 未安装 
     * @return AgentStatus 云镜客户端状态,OFFLINE 离线,ONLINE 在线,UNINSTALL 未安装
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set 云镜客户端状态,OFFLINE 离线,ONLINE 在线,UNINSTALL 未安装
     * @param AgentStatus 云镜客户端状态,OFFLINE 离线,ONLINE 在线,UNINSTALL 未安装
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get 是否允许解绑,false 不允许解绑 
     * @return IsUnBind 是否允许解绑,false 不允许解绑
     */
    public Boolean getIsUnBind() {
        return this.IsUnBind;
    }

    /**
     * Set 是否允许解绑,false 不允许解绑
     * @param IsUnBind 是否允许解绑,false 不允许解绑
     */
    public void setIsUnBind(Boolean IsUnBind) {
        this.IsUnBind = IsUnBind;
    }

    /**
     * Get 是否允许换绑,false 不允许换绑 
     * @return IsSwitchBind 是否允许换绑,false 不允许换绑
     */
    public Boolean getIsSwitchBind() {
        return this.IsSwitchBind;
    }

    /**
     * Set 是否允许换绑,false 不允许换绑
     * @param IsSwitchBind 是否允许换绑,false 不允许换绑
     */
    public void setIsSwitchBind(Boolean IsSwitchBind) {
        this.IsSwitchBind = IsSwitchBind;
    }

    public LicenseBindDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseBindDetail(LicenseBindDetail source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.IsUnBind != null) {
            this.IsUnBind = new Boolean(source.IsUnBind);
        }
        if (source.IsSwitchBind != null) {
            this.IsSwitchBind = new Boolean(source.IsSwitchBind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "IsUnBind", this.IsUnBind);
        this.setParamSimple(map, prefix + "IsSwitchBind", this.IsSwitchBind);

    }
}

