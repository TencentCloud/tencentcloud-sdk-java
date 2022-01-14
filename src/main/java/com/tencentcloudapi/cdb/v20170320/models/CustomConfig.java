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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomConfig extends AbstractModel{

    /**
    * 设备
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Device")
    @Expose
    private String Device;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 设备类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 内存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get 设备
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Device 设备
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * Set 设备
注意：此字段可能返回 null，表示取不到有效值。
     * @param Device 设备
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 设备类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceType 设备类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceType 设备类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 内存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu 核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu 核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    public CustomConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomConfig(CustomConfig source) {
        if (source.Device != null) {
            this.Device = new String(source.Device);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

