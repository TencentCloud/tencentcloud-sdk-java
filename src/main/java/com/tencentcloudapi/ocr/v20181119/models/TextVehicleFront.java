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

public class TextVehicleFront  extends AbstractModel{

    /**
    * 号牌号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlateNo")
    @Expose
    private String PlateNo;

    /**
    * 车辆类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VehicleType")
    @Expose
    private String VehicleType;

    /**
    * 所有人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 住址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 使用性质
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseCharacter")
    @Expose
    private String UseCharacter;

    /**
    * 品牌型号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 车辆识别代号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vin")
    @Expose
    private String Vin;

    /**
    * 发动机号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineNo")
    @Expose
    private String EngineNo;

    /**
    * 注册日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegisterDate")
    @Expose
    private String RegisterDate;

    /**
    * 发证日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * 印章
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seal")
    @Expose
    private String Seal;

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
     * 获取车辆类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return VehicleType 车辆类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVehicleType() {
        return this.VehicleType;
    }

    /**
     * 设置车辆类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param VehicleType 车辆类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    /**
     * 获取所有人
注意：此字段可能返回 null，表示取不到有效值。
     * @return Owner 所有人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * 设置所有人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 所有人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * 获取住址
注意：此字段可能返回 null，表示取不到有效值。
     * @return Address 住址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * 设置住址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 住址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * 获取使用性质
注意：此字段可能返回 null，表示取不到有效值。
     * @return UseCharacter 使用性质
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUseCharacter() {
        return this.UseCharacter;
    }

    /**
     * 设置使用性质
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseCharacter 使用性质
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseCharacter(String UseCharacter) {
        this.UseCharacter = UseCharacter;
    }

    /**
     * 获取品牌型号
注意：此字段可能返回 null，表示取不到有效值。
     * @return Model 品牌型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * 设置品牌型号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Model 品牌型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * 获取车辆识别代号
注意：此字段可能返回 null，表示取不到有效值。
     * @return Vin 车辆识别代号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVin() {
        return this.Vin;
    }

    /**
     * 设置车辆识别代号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vin 车辆识别代号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVin(String Vin) {
        this.Vin = Vin;
    }

    /**
     * 获取发动机号码
注意：此字段可能返回 null，表示取不到有效值。
     * @return EngineNo 发动机号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineNo() {
        return this.EngineNo;
    }

    /**
     * 设置发动机号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineNo 发动机号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineNo(String EngineNo) {
        this.EngineNo = EngineNo;
    }

    /**
     * 获取注册日期
注意：此字段可能返回 null，表示取不到有效值。
     * @return RegisterDate 注册日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegisterDate() {
        return this.RegisterDate;
    }

    /**
     * 设置注册日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegisterDate 注册日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegisterDate(String RegisterDate) {
        this.RegisterDate = RegisterDate;
    }

    /**
     * 获取发证日期
注意：此字段可能返回 null，表示取不到有效值。
     * @return IssueDate 发证日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * 设置发证日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param IssueDate 发证日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * 获取印章
注意：此字段可能返回 null，表示取不到有效值。
     * @return Seal 印章
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeal() {
        return this.Seal;
    }

    /**
     * 设置印章
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seal 印章
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeal(String Seal) {
        this.Seal = Seal;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlateNo", this.PlateNo);
        this.setParamSimple(map, prefix + "VehicleType", this.VehicleType);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "UseCharacter", this.UseCharacter);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Vin", this.Vin);
        this.setParamSimple(map, prefix + "EngineNo", this.EngineNo);
        this.setParamSimple(map, prefix + "RegisterDate", this.RegisterDate);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);
        this.setParamSimple(map, prefix + "Seal", this.Seal);

    }
}

