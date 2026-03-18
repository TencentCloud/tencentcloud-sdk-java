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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceMaterialInfo extends AbstractModel {

    /**
    * 设备信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 物料信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaterialInfo")
    @Expose
    private MaterialInfo MaterialInfo;

    /**
     * Get 设备信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceType 设备信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceType 设备信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 物料信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaterialInfo 物料信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaterialInfo getMaterialInfo() {
        return this.MaterialInfo;
    }

    /**
     * Set 物料信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaterialInfo 物料信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaterialInfo(MaterialInfo MaterialInfo) {
        this.MaterialInfo = MaterialInfo;
    }

    public DeviceMaterialInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceMaterialInfo(DeviceMaterialInfo source) {
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.MaterialInfo != null) {
            this.MaterialInfo = new MaterialInfo(source.MaterialInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamObj(map, prefix + "MaterialInfo.", this.MaterialInfo);

    }
}

