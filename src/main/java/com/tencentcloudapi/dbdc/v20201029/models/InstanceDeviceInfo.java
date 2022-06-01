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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceDeviceInfo extends AbstractModel{

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 读写设备组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadWriteDevice")
    @Expose
    private DeviceInfo [] ReadWriteDevice;

    /**
    * 只读设备组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadOnlyDevice")
    @Expose
    private DeviceInfo [] ReadOnlyDevice;

    /**
    * 空闲设备组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FreeDevice")
    @Expose
    private DeviceInfo [] FreeDevice;

    /**
     * Get 集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 读写设备组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadWriteDevice 读写设备组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeviceInfo [] getReadWriteDevice() {
        return this.ReadWriteDevice;
    }

    /**
     * Set 读写设备组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadWriteDevice 读写设备组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadWriteDevice(DeviceInfo [] ReadWriteDevice) {
        this.ReadWriteDevice = ReadWriteDevice;
    }

    /**
     * Get 只读设备组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadOnlyDevice 只读设备组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeviceInfo [] getReadOnlyDevice() {
        return this.ReadOnlyDevice;
    }

    /**
     * Set 只读设备组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadOnlyDevice 只读设备组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadOnlyDevice(DeviceInfo [] ReadOnlyDevice) {
        this.ReadOnlyDevice = ReadOnlyDevice;
    }

    /**
     * Get 空闲设备组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FreeDevice 空闲设备组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeviceInfo [] getFreeDevice() {
        return this.FreeDevice;
    }

    /**
     * Set 空闲设备组
注意：此字段可能返回 null，表示取不到有效值。
     * @param FreeDevice 空闲设备组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFreeDevice(DeviceInfo [] FreeDevice) {
        this.FreeDevice = FreeDevice;
    }

    public InstanceDeviceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceDeviceInfo(InstanceDeviceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ReadWriteDevice != null) {
            this.ReadWriteDevice = new DeviceInfo[source.ReadWriteDevice.length];
            for (int i = 0; i < source.ReadWriteDevice.length; i++) {
                this.ReadWriteDevice[i] = new DeviceInfo(source.ReadWriteDevice[i]);
            }
        }
        if (source.ReadOnlyDevice != null) {
            this.ReadOnlyDevice = new DeviceInfo[source.ReadOnlyDevice.length];
            for (int i = 0; i < source.ReadOnlyDevice.length; i++) {
                this.ReadOnlyDevice[i] = new DeviceInfo(source.ReadOnlyDevice[i]);
            }
        }
        if (source.FreeDevice != null) {
            this.FreeDevice = new DeviceInfo[source.FreeDevice.length];
            for (int i = 0; i < source.FreeDevice.length; i++) {
                this.FreeDevice[i] = new DeviceInfo(source.FreeDevice[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "ReadWriteDevice.", this.ReadWriteDevice);
        this.setParamArrayObj(map, prefix + "ReadOnlyDevice.", this.ReadOnlyDevice);
        this.setParamArrayObj(map, prefix + "FreeDevice.", this.FreeDevice);

    }
}

