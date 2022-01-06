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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDeviceResponse extends AbstractModel{

    /**
    * 设备编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceCode")
    @Expose
    private String DeviceCode;

    /**
    * 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备虚拟组信息，仅在创建NVR时返回该值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualGroupId")
    @Expose
    private String VirtualGroupId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 设备编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceCode 设备编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceCode() {
        return this.DeviceCode;
    }

    /**
     * Set 设备编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceCode 设备编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceCode(String DeviceCode) {
        this.DeviceCode = DeviceCode;
    }

    /**
     * Get 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceId 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceId 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备虚拟组信息，仅在创建NVR时返回该值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualGroupId 设备虚拟组信息，仅在创建NVR时返回该值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualGroupId() {
        return this.VirtualGroupId;
    }

    /**
     * Set 设备虚拟组信息，仅在创建NVR时返回该值
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualGroupId 设备虚拟组信息，仅在创建NVR时返回该值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualGroupId(String VirtualGroupId) {
        this.VirtualGroupId = VirtualGroupId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateDeviceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeviceResponse(CreateDeviceResponse source) {
        if (source.DeviceCode != null) {
            this.DeviceCode = new String(source.DeviceCode);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.VirtualGroupId != null) {
            this.VirtualGroupId = new String(source.VirtualGroupId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceCode", this.DeviceCode);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "VirtualGroupId", this.VirtualGroupId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

