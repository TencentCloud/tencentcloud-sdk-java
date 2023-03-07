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

public class BaselineHost extends AbstractModel{

    /**
    * 主机Id
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 主机名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostTag")
    @Expose
    private String HostTag;

    /**
    * 内网Ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 外网Ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get 主机Id 
     * @return HostId 主机Id
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 主机Id
     * @param HostId 主机Id
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 主机名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostTag 主机标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostTag() {
        return this.HostTag;
    }

    /**
     * Set 主机标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostTag 主机标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostTag(String HostTag) {
        this.HostTag = HostTag;
    }

    /**
     * Get 内网Ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostIp 内网Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 内网Ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostIp 内网Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 外网Ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanIp 外网Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set 外网Ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanIp 外网Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineExtraInfo 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineExtraInfo 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public BaselineHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineHost(BaselineHost source) {
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostTag != null) {
            this.HostTag = new String(source.HostTag);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostTag", this.HostTag);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

