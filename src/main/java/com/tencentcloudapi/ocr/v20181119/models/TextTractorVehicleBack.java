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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextTractorVehicleBack extends AbstractModel {

    /**
    * 号牌号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlateNo")
    @Expose
    private String PlateNo;

    /**
    * 准乘人数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowNum")
    @Expose
    private String AllowNum;

    /**
    * 联合收割机质量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CombineHarvesterQuality")
    @Expose
    private String CombineHarvesterQuality;

    /**
    * 拖拉机最小使用质量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TractorMinUsageWeight")
    @Expose
    private String TractorMinUsageWeight;

    /**
    * 拖拉机最大允许载质量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TractorMaxAllowLoadCapacity")
    @Expose
    private String TractorMaxAllowLoadCapacity;

    /**
    * 外廓尺寸
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalSize")
    @Expose
    private String ExternalSize;

    /**
    * 检验记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VehicleType")
    @Expose
    private String VehicleType;

    /**
    * 住址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
     * Get 号牌号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlateNo 号牌号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlateNo() {
        return this.PlateNo;
    }

    /**
     * Set 号牌号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlateNo 号牌号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlateNo(String PlateNo) {
        this.PlateNo = PlateNo;
    }

    /**
     * Get 准乘人数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowNum 准乘人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAllowNum() {
        return this.AllowNum;
    }

    /**
     * Set 准乘人数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowNum 准乘人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowNum(String AllowNum) {
        this.AllowNum = AllowNum;
    }

    /**
     * Get 联合收割机质量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CombineHarvesterQuality 联合收割机质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCombineHarvesterQuality() {
        return this.CombineHarvesterQuality;
    }

    /**
     * Set 联合收割机质量
注意：此字段可能返回 null，表示取不到有效值。
     * @param CombineHarvesterQuality 联合收割机质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCombineHarvesterQuality(String CombineHarvesterQuality) {
        this.CombineHarvesterQuality = CombineHarvesterQuality;
    }

    /**
     * Get 拖拉机最小使用质量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TractorMinUsageWeight 拖拉机最小使用质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTractorMinUsageWeight() {
        return this.TractorMinUsageWeight;
    }

    /**
     * Set 拖拉机最小使用质量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TractorMinUsageWeight 拖拉机最小使用质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTractorMinUsageWeight(String TractorMinUsageWeight) {
        this.TractorMinUsageWeight = TractorMinUsageWeight;
    }

    /**
     * Get 拖拉机最大允许载质量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TractorMaxAllowLoadCapacity 拖拉机最大允许载质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTractorMaxAllowLoadCapacity() {
        return this.TractorMaxAllowLoadCapacity;
    }

    /**
     * Set 拖拉机最大允许载质量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TractorMaxAllowLoadCapacity 拖拉机最大允许载质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTractorMaxAllowLoadCapacity(String TractorMaxAllowLoadCapacity) {
        this.TractorMaxAllowLoadCapacity = TractorMaxAllowLoadCapacity;
    }

    /**
     * Get 外廓尺寸
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalSize 外廓尺寸
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalSize() {
        return this.ExternalSize;
    }

    /**
     * Set 外廓尺寸
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalSize 外廓尺寸
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalSize(String ExternalSize) {
        this.ExternalSize = ExternalSize;
    }

    /**
     * Get 检验记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Record 检验记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * Set 检验记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param Record 检验记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VehicleType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVehicleType() {
        return this.VehicleType;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param VehicleType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    /**
     * Get 住址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 住址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 住址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 住址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    public TextTractorVehicleBack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextTractorVehicleBack(TextTractorVehicleBack source) {
        if (source.PlateNo != null) {
            this.PlateNo = new String(source.PlateNo);
        }
        if (source.AllowNum != null) {
            this.AllowNum = new String(source.AllowNum);
        }
        if (source.CombineHarvesterQuality != null) {
            this.CombineHarvesterQuality = new String(source.CombineHarvesterQuality);
        }
        if (source.TractorMinUsageWeight != null) {
            this.TractorMinUsageWeight = new String(source.TractorMinUsageWeight);
        }
        if (source.TractorMaxAllowLoadCapacity != null) {
            this.TractorMaxAllowLoadCapacity = new String(source.TractorMaxAllowLoadCapacity);
        }
        if (source.ExternalSize != null) {
            this.ExternalSize = new String(source.ExternalSize);
        }
        if (source.Record != null) {
            this.Record = new String(source.Record);
        }
        if (source.VehicleType != null) {
            this.VehicleType = new String(source.VehicleType);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlateNo", this.PlateNo);
        this.setParamSimple(map, prefix + "AllowNum", this.AllowNum);
        this.setParamSimple(map, prefix + "CombineHarvesterQuality", this.CombineHarvesterQuality);
        this.setParamSimple(map, prefix + "TractorMinUsageWeight", this.TractorMinUsageWeight);
        this.setParamSimple(map, prefix + "TractorMaxAllowLoadCapacity", this.TractorMaxAllowLoadCapacity);
        this.setParamSimple(map, prefix + "ExternalSize", this.ExternalSize);
        this.setParamSimple(map, prefix + "Record", this.Record);
        this.setParamSimple(map, prefix + "VehicleType", this.VehicleType);
        this.setParamSimple(map, prefix + "Address", this.Address);

    }
}

