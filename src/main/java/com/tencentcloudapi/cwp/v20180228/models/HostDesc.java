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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostDesc extends AbstractModel {

    /**
    * 机器uuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机安全uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 机器名
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 机器IP:已销毁的服务器IP为空
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 公网IP:已销毁的服务器IP为空
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 标签信息数组
    */
    @SerializedName("Tags")
    @Expose
    private MachineTag [] Tags;

    /**
     * Get 机器uuid 
     * @return Quuid 机器uuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 机器uuid
     * @param Quuid 机器uuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机安全uuid 
     * @return Uuid 主机安全uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机安全uuid
     * @param Uuid 主机安全uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 机器名 
     * @return MachineName 机器名
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 机器名
     * @param MachineName 机器名
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 机器IP:已销毁的服务器IP为空 
     * @return MachineIp 机器IP:已销毁的服务器IP为空
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 机器IP:已销毁的服务器IP为空
     * @param MachineIp 机器IP:已销毁的服务器IP为空
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 公网IP:已销毁的服务器IP为空 
     * @return MachineWanIp 公网IP:已销毁的服务器IP为空
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 公网IP:已销毁的服务器IP为空
     * @param MachineWanIp 公网IP:已销毁的服务器IP为空
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get 标签信息数组 
     * @return Tags 标签信息数组
     */
    public MachineTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息数组
     * @param Tags 标签信息数组
     */
    public void setTags(MachineTag [] Tags) {
        this.Tags = Tags;
    }

    public HostDesc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostDesc(HostDesc source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.Tags != null) {
            this.Tags = new MachineTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new MachineTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

