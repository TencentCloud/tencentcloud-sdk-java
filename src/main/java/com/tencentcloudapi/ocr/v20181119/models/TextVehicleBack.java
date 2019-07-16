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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextVehicleBack  extends AbstractModel{

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
     * 获取号牌号码
注意：此字段可能返回 null，表示取不到有效值。
     * @return PlateNo 号牌号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlateNo() {
        return this.PlateNo;
    }

    /**
     * 设置号牌号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlateNo 号牌号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlateNo(String PlateNo) {
        this.PlateNo = PlateNo;
    }

    /**
     * 获取档案编号
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileNo 档案编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileNo() {
        return this.FileNo;
    }

    /**
     * 设置档案编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileNo 档案编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileNo(String FileNo) {
        this.FileNo = FileNo;
    }

    /**
     * 获取核定人数
注意：此字段可能返回 null，表示取不到有效值。
     * @return AllowNum 核定人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAllowNum() {
        return this.AllowNum;
    }

    /**
     * 设置核定人数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowNum 核定人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowNum(String AllowNum) {
        this.AllowNum = AllowNum;
    }

    /**
     * 获取总质量
注意：此字段可能返回 null，表示取不到有效值。
     * @return TotalMass 总质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalMass() {
        return this.TotalMass;
    }

    /**
     * 设置总质量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalMass 总质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalMass(String TotalMass) {
        this.TotalMass = TotalMass;
    }

    /**
     * 获取整备质量
注意：此字段可能返回 null，表示取不到有效值。
     * @return CurbWeight 整备质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurbWeight() {
        return this.CurbWeight;
    }

    /**
     * 设置整备质量
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurbWeight 整备质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurbWeight(String CurbWeight) {
        this.CurbWeight = CurbWeight;
    }

    /**
     * 获取核定载质量
注意：此字段可能返回 null，表示取不到有效值。
     * @return LoadQuality 核定载质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadQuality() {
        return this.LoadQuality;
    }

    /**
     * 设置核定载质量
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadQuality 核定载质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadQuality(String LoadQuality) {
        this.LoadQuality = LoadQuality;
    }

    /**
     * 获取外廓尺寸
注意：此字段可能返回 null，表示取不到有效值。
     * @return ExternalSize 外廓尺寸
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalSize() {
        return this.ExternalSize;
    }

    /**
     * 设置外廓尺寸
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalSize 外廓尺寸
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalSize(String ExternalSize) {
        this.ExternalSize = ExternalSize;
    }

    /**
     * 获取备注
注意：此字段可能返回 null，表示取不到有效值。
     * @return Marks 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMarks() {
        return this.Marks;
    }

    /**
     * 设置备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Marks 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarks(String Marks) {
        this.Marks = Marks;
    }

    /**
     * 获取检验记录
注意：此字段可能返回 null，表示取不到有效值。
     * @return Record 检验记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * 设置检验记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param Record 检验记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * 获取准牵引总质量
注意：此字段可能返回 null，表示取不到有效值。
     * @return TotalQuasiMass 准牵引总质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalQuasiMass() {
        return this.TotalQuasiMass;
    }

    /**
     * 设置准牵引总质量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalQuasiMass 准牵引总质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalQuasiMass(String TotalQuasiMass) {
        this.TotalQuasiMass = TotalQuasiMass;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

