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

public class Hardware extends AbstractModel {

    /**
    * 硬件序列号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * license计费模式：
1，租户付费
2，厂商月付费
3，厂商永久授权
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LicenseChargingMode")
    @Expose
    private Long LicenseChargingMode;

    /**
    * 设备描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 硬件ID，入参无需传递
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HardwareId")
    @Expose
    private String HardwareId;

    /**
     * Get 硬件序列号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SN 硬件序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set 硬件序列号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SN 硬件序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * Get license计费模式：
1，租户付费
2，厂商月付费
3，厂商永久授权
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LicenseChargingMode license计费模式：
1，租户付费
2，厂商月付费
3，厂商永久授权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLicenseChargingMode() {
        return this.LicenseChargingMode;
    }

    /**
     * Set license计费模式：
1，租户付费
2，厂商月付费
3，厂商永久授权
注意：此字段可能返回 null，表示取不到有效值。
     * @param LicenseChargingMode license计费模式：
1，租户付费
2，厂商月付费
3，厂商永久授权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLicenseChargingMode(Long LicenseChargingMode) {
        this.LicenseChargingMode = LicenseChargingMode;
    }

    /**
     * Get 设备描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 设备描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 设备描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 设备描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 硬件ID，入参无需传递
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HardwareId 硬件ID，入参无需传递
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHardwareId() {
        return this.HardwareId;
    }

    /**
     * Set 硬件ID，入参无需传递
注意：此字段可能返回 null，表示取不到有效值。
     * @param HardwareId 硬件ID，入参无需传递
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHardwareId(String HardwareId) {
        this.HardwareId = HardwareId;
    }

    public Hardware() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Hardware(Hardware source) {
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.LicenseChargingMode != null) {
            this.LicenseChargingMode = new Long(source.LicenseChargingMode);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.HardwareId != null) {
            this.HardwareId = new String(source.HardwareId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamSimple(map, prefix + "LicenseChargingMode", this.LicenseChargingMode);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "HardwareId", this.HardwareId);

    }
}

