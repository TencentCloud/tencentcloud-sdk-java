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

public class EffectiveMachineInfo extends AbstractModel{

    /**
    * 机器名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 机器公网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachinePublicIp")
    @Expose
    private String MachinePublicIp;

    /**
    * 机器内网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachinePrivateIp")
    @Expose
    private String MachinePrivateIp;

    /**
    * 机器标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineTag")
    @Expose
    private MachineTag [] MachineTag;

    /**
    * 机器Quuid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 云镜Uuid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 内核版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * 在线状态 OFFLINE，ONLINE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
     * Get 机器名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineName 机器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 机器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineName 机器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 机器公网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachinePublicIp 机器公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachinePublicIp() {
        return this.MachinePublicIp;
    }

    /**
     * Set 机器公网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachinePublicIp 机器公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachinePublicIp(String MachinePublicIp) {
        this.MachinePublicIp = MachinePublicIp;
    }

    /**
     * Get 机器内网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachinePrivateIp 机器内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachinePrivateIp() {
        return this.MachinePrivateIp;
    }

    /**
     * Set 机器内网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachinePrivateIp 机器内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachinePrivateIp(String MachinePrivateIp) {
        this.MachinePrivateIp = MachinePrivateIp;
    }

    /**
     * Get 机器标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineTag 机器标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MachineTag [] getMachineTag() {
        return this.MachineTag;
    }

    /**
     * Set 机器标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineTag 机器标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineTag(MachineTag [] MachineTag) {
        this.MachineTag = MachineTag;
    }

    /**
     * Get 机器Quuid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quuid 机器Quuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 机器Quuid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quuid 机器Quuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 云镜Uuid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uuid 云镜Uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 云镜Uuid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uuid 云镜Uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 内核版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KernelVersion 内核版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set 内核版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param KernelVersion 内核版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get 在线状态 OFFLINE，ONLINE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineStatus 在线状态 OFFLINE，ONLINE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set 在线状态 OFFLINE，ONLINE
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineStatus 在线状态 OFFLINE，ONLINE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    public EffectiveMachineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EffectiveMachineInfo(EffectiveMachineInfo source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachinePublicIp != null) {
            this.MachinePublicIp = new String(source.MachinePublicIp);
        }
        if (source.MachinePrivateIp != null) {
            this.MachinePrivateIp = new String(source.MachinePrivateIp);
        }
        if (source.MachineTag != null) {
            this.MachineTag = new MachineTag[source.MachineTag.length];
            for (int i = 0; i < source.MachineTag.length; i++) {
                this.MachineTag[i] = new MachineTag(source.MachineTag[i]);
            }
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachinePublicIp", this.MachinePublicIp);
        this.setParamSimple(map, prefix + "MachinePrivateIp", this.MachinePrivateIp);
        this.setParamArrayObj(map, prefix + "MachineTag.", this.MachineTag);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);

    }
}

