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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextVehicleBack extends AbstractModel {

    /**
    * 号牌号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlateNo")
    @Expose
    private String PlateNo;

    /**
    * 档案编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileNo")
    @Expose
    private String FileNo;

    /**
    * 核定人数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowNum")
    @Expose
    private String AllowNum;

    /**
    * 总质量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalMass")
    @Expose
    private String TotalMass;

    /**
    * 整备质量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurbWeight")
    @Expose
    private String CurbWeight;

    /**
    * 核定载质量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadQuality")
    @Expose
    private String LoadQuality;

    /**
    * 外廓尺寸
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalSize")
    @Expose
    private String ExternalSize;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Marks")
    @Expose
    private String Marks;

    /**
    * 检验记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * 准牵引总质量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalQuasiMass")
    @Expose
    private String TotalQuasiMass;

    /**
    * 副页编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubPageCode")
    @Expose
    private String SubPageCode;

    /**
    * 燃料种类

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FuelType")
    @Expose
    private String FuelType;

    /**
    * 住址
    */
    @SerializedName("AddressElectronic")
    @Expose
    private String AddressElectronic;

    /**
    * 发证机关
    */
    @SerializedName("IssueAuthorityElectronic")
    @Expose
    private String IssueAuthorityElectronic;

    /**
    * 车身颜色
    */
    @SerializedName("CarBodyColor")
    @Expose
    private String CarBodyColor;

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
     * Get 档案编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileNo 档案编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileNo() {
        return this.FileNo;
    }

    /**
     * Set 档案编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileNo 档案编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileNo(String FileNo) {
        this.FileNo = FileNo;
    }

    /**
     * Get 核定人数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowNum 核定人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAllowNum() {
        return this.AllowNum;
    }

    /**
     * Set 核定人数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowNum 核定人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowNum(String AllowNum) {
        this.AllowNum = AllowNum;
    }

    /**
     * Get 总质量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalMass 总质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalMass() {
        return this.TotalMass;
    }

    /**
     * Set 总质量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalMass 总质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalMass(String TotalMass) {
        this.TotalMass = TotalMass;
    }

    /**
     * Get 整备质量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurbWeight 整备质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurbWeight() {
        return this.CurbWeight;
    }

    /**
     * Set 整备质量
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurbWeight 整备质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurbWeight(String CurbWeight) {
        this.CurbWeight = CurbWeight;
    }

    /**
     * Get 核定载质量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadQuality 核定载质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadQuality() {
        return this.LoadQuality;
    }

    /**
     * Set 核定载质量
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadQuality 核定载质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadQuality(String LoadQuality) {
        this.LoadQuality = LoadQuality;
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
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Marks 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMarks() {
        return this.Marks;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Marks 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarks(String Marks) {
        this.Marks = Marks;
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
     * Get 准牵引总质量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalQuasiMass 准牵引总质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalQuasiMass() {
        return this.TotalQuasiMass;
    }

    /**
     * Set 准牵引总质量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalQuasiMass 准牵引总质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalQuasiMass(String TotalQuasiMass) {
        this.TotalQuasiMass = TotalQuasiMass;
    }

    /**
     * Get 副页编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubPageCode 副页编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubPageCode() {
        return this.SubPageCode;
    }

    /**
     * Set 副页编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubPageCode 副页编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubPageCode(String SubPageCode) {
        this.SubPageCode = SubPageCode;
    }

    /**
     * Get 燃料种类

注意：此字段可能返回 null，表示取不到有效值。 
     * @return FuelType 燃料种类

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFuelType() {
        return this.FuelType;
    }

    /**
     * Set 燃料种类

注意：此字段可能返回 null，表示取不到有效值。
     * @param FuelType 燃料种类

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFuelType(String FuelType) {
        this.FuelType = FuelType;
    }

    /**
     * Get 住址 
     * @return AddressElectronic 住址
     */
    public String getAddressElectronic() {
        return this.AddressElectronic;
    }

    /**
     * Set 住址
     * @param AddressElectronic 住址
     */
    public void setAddressElectronic(String AddressElectronic) {
        this.AddressElectronic = AddressElectronic;
    }

    /**
     * Get 发证机关 
     * @return IssueAuthorityElectronic 发证机关
     */
    public String getIssueAuthorityElectronic() {
        return this.IssueAuthorityElectronic;
    }

    /**
     * Set 发证机关
     * @param IssueAuthorityElectronic 发证机关
     */
    public void setIssueAuthorityElectronic(String IssueAuthorityElectronic) {
        this.IssueAuthorityElectronic = IssueAuthorityElectronic;
    }

    /**
     * Get 车身颜色 
     * @return CarBodyColor 车身颜色
     */
    public String getCarBodyColor() {
        return this.CarBodyColor;
    }

    /**
     * Set 车身颜色
     * @param CarBodyColor 车身颜色
     */
    public void setCarBodyColor(String CarBodyColor) {
        this.CarBodyColor = CarBodyColor;
    }

    public TextVehicleBack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextVehicleBack(TextVehicleBack source) {
        if (source.PlateNo != null) {
            this.PlateNo = new String(source.PlateNo);
        }
        if (source.FileNo != null) {
            this.FileNo = new String(source.FileNo);
        }
        if (source.AllowNum != null) {
            this.AllowNum = new String(source.AllowNum);
        }
        if (source.TotalMass != null) {
            this.TotalMass = new String(source.TotalMass);
        }
        if (source.CurbWeight != null) {
            this.CurbWeight = new String(source.CurbWeight);
        }
        if (source.LoadQuality != null) {
            this.LoadQuality = new String(source.LoadQuality);
        }
        if (source.ExternalSize != null) {
            this.ExternalSize = new String(source.ExternalSize);
        }
        if (source.Marks != null) {
            this.Marks = new String(source.Marks);
        }
        if (source.Record != null) {
            this.Record = new String(source.Record);
        }
        if (source.TotalQuasiMass != null) {
            this.TotalQuasiMass = new String(source.TotalQuasiMass);
        }
        if (source.SubPageCode != null) {
            this.SubPageCode = new String(source.SubPageCode);
        }
        if (source.FuelType != null) {
            this.FuelType = new String(source.FuelType);
        }
        if (source.AddressElectronic != null) {
            this.AddressElectronic = new String(source.AddressElectronic);
        }
        if (source.IssueAuthorityElectronic != null) {
            this.IssueAuthorityElectronic = new String(source.IssueAuthorityElectronic);
        }
        if (source.CarBodyColor != null) {
            this.CarBodyColor = new String(source.CarBodyColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlateNo", this.PlateNo);
        this.setParamSimple(map, prefix + "FileNo", this.FileNo);
        this.setParamSimple(map, prefix + "AllowNum", this.AllowNum);
        this.setParamSimple(map, prefix + "TotalMass", this.TotalMass);
        this.setParamSimple(map, prefix + "CurbWeight", this.CurbWeight);
        this.setParamSimple(map, prefix + "LoadQuality", this.LoadQuality);
        this.setParamSimple(map, prefix + "ExternalSize", this.ExternalSize);
        this.setParamSimple(map, prefix + "Marks", this.Marks);
        this.setParamSimple(map, prefix + "Record", this.Record);
        this.setParamSimple(map, prefix + "TotalQuasiMass", this.TotalQuasiMass);
        this.setParamSimple(map, prefix + "SubPageCode", this.SubPageCode);
        this.setParamSimple(map, prefix + "FuelType", this.FuelType);
        this.setParamSimple(map, prefix + "AddressElectronic", this.AddressElectronic);
        this.setParamSimple(map, prefix + "IssueAuthorityElectronic", this.IssueAuthorityElectronic);
        this.setParamSimple(map, prefix + "CarBodyColor", this.CarBodyColor);

    }
}

