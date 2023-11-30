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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActivateHardware extends AbstractModel {

    /**
    * 厂商名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * 设备SN序列号
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * 设备名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 设备密钥
    */
    @SerializedName("DataKey")
    @Expose
    private String DataKey;

    /**
     * Get 厂商名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vendor 厂商名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set 厂商名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vendor 厂商名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get 设备SN序列号 
     * @return SN 设备SN序列号
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set 设备SN序列号
     * @param SN 设备SN序列号
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * Get 设备名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceName 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceName 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 设备密钥 
     * @return DataKey 设备密钥
     */
    public String getDataKey() {
        return this.DataKey;
    }

    /**
     * Set 设备密钥
     * @param DataKey 设备密钥
     */
    public void setDataKey(String DataKey) {
        this.DataKey = DataKey;
    }

    public ActivateHardware() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivateHardware(ActivateHardware source) {
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DataKey != null) {
            this.DataKey = new String(source.DataKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DataKey", this.DataKey);

    }
}

