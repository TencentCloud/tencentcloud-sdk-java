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

public class VehicleInvoiceInfo extends AbstractModel{

    /**
    * 车辆类型
    */
    @SerializedName("CarType")
    @Expose
    private String CarType;

    /**
    * 厂牌型号
    */
    @SerializedName("PlateModel")
    @Expose
    private String PlateModel;

    /**
    * 产地
    */
    @SerializedName("ProduceAddress")
    @Expose
    private String ProduceAddress;

    /**
    * 合格证号
    */
    @SerializedName("CertificateNo")
    @Expose
    private String CertificateNo;

    /**
    * 进口证明书号
    */
    @SerializedName("ImportNo")
    @Expose
    private String ImportNo;

    /**
    * LSVCA2NP9HN0xxxxx
    */
    @SerializedName("VinNo")
    @Expose
    private String VinNo;

    /**
    * 完税证书号
    */
    @SerializedName("PayTaxesNo")
    @Expose
    private String PayTaxesNo;

    /**
    * 吨位
    */
    @SerializedName("Tonnage")
    @Expose
    private String Tonnage;

    /**
    * 限乘人数
    */
    @SerializedName("LimitCount")
    @Expose
    private String LimitCount;

    /**
    * 发动机号码
    */
    @SerializedName("EngineNo")
    @Expose
    private String EngineNo;

    /**
    * 商检单号
    */
    @SerializedName("BizCheckFormNo")
    @Expose
    private String BizCheckFormNo;

    /**
    * 主管税务机关代码
    */
    @SerializedName("TaxtationOrgCode")
    @Expose
    private String TaxtationOrgCode;

    /**
    * 主管税务机关名称
    */
    @SerializedName("TaxtationOrgName")
    @Expose
    private String TaxtationOrgName;

    /**
    * 税率
    */
    @SerializedName("MotorTaxRate")
    @Expose
    private String MotorTaxRate;

    /**
    * 开户行
    */
    @SerializedName("MotorBankName")
    @Expose
    private String MotorBankName;

    /**
    * 账号
    */
    @SerializedName("MotorBankAccount")
    @Expose
    private String MotorBankAccount;

    /**
     * Get 车辆类型 
     * @return CarType 车辆类型
     */
    public String getCarType() {
        return this.CarType;
    }

    /**
     * Set 车辆类型
     * @param CarType 车辆类型
     */
    public void setCarType(String CarType) {
        this.CarType = CarType;
    }

    /**
     * Get 厂牌型号 
     * @return PlateModel 厂牌型号
     */
    public String getPlateModel() {
        return this.PlateModel;
    }

    /**
     * Set 厂牌型号
     * @param PlateModel 厂牌型号
     */
    public void setPlateModel(String PlateModel) {
        this.PlateModel = PlateModel;
    }

    /**
     * Get 产地 
     * @return ProduceAddress 产地
     */
    public String getProduceAddress() {
        return this.ProduceAddress;
    }

    /**
     * Set 产地
     * @param ProduceAddress 产地
     */
    public void setProduceAddress(String ProduceAddress) {
        this.ProduceAddress = ProduceAddress;
    }

    /**
     * Get 合格证号 
     * @return CertificateNo 合格证号
     */
    public String getCertificateNo() {
        return this.CertificateNo;
    }

    /**
     * Set 合格证号
     * @param CertificateNo 合格证号
     */
    public void setCertificateNo(String CertificateNo) {
        this.CertificateNo = CertificateNo;
    }

    /**
     * Get 进口证明书号 
     * @return ImportNo 进口证明书号
     */
    public String getImportNo() {
        return this.ImportNo;
    }

    /**
     * Set 进口证明书号
     * @param ImportNo 进口证明书号
     */
    public void setImportNo(String ImportNo) {
        this.ImportNo = ImportNo;
    }

    /**
     * Get LSVCA2NP9HN0xxxxx 
     * @return VinNo LSVCA2NP9HN0xxxxx
     */
    public String getVinNo() {
        return this.VinNo;
    }

    /**
     * Set LSVCA2NP9HN0xxxxx
     * @param VinNo LSVCA2NP9HN0xxxxx
     */
    public void setVinNo(String VinNo) {
        this.VinNo = VinNo;
    }

    /**
     * Get 完税证书号 
     * @return PayTaxesNo 完税证书号
     */
    public String getPayTaxesNo() {
        return this.PayTaxesNo;
    }

    /**
     * Set 完税证书号
     * @param PayTaxesNo 完税证书号
     */
    public void setPayTaxesNo(String PayTaxesNo) {
        this.PayTaxesNo = PayTaxesNo;
    }

    /**
     * Get 吨位 
     * @return Tonnage 吨位
     */
    public String getTonnage() {
        return this.Tonnage;
    }

    /**
     * Set 吨位
     * @param Tonnage 吨位
     */
    public void setTonnage(String Tonnage) {
        this.Tonnage = Tonnage;
    }

    /**
     * Get 限乘人数 
     * @return LimitCount 限乘人数
     */
    public String getLimitCount() {
        return this.LimitCount;
    }

    /**
     * Set 限乘人数
     * @param LimitCount 限乘人数
     */
    public void setLimitCount(String LimitCount) {
        this.LimitCount = LimitCount;
    }

    /**
     * Get 发动机号码 
     * @return EngineNo 发动机号码
     */
    public String getEngineNo() {
        return this.EngineNo;
    }

    /**
     * Set 发动机号码
     * @param EngineNo 发动机号码
     */
    public void setEngineNo(String EngineNo) {
        this.EngineNo = EngineNo;
    }

    /**
     * Get 商检单号 
     * @return BizCheckFormNo 商检单号
     */
    public String getBizCheckFormNo() {
        return this.BizCheckFormNo;
    }

    /**
     * Set 商检单号
     * @param BizCheckFormNo 商检单号
     */
    public void setBizCheckFormNo(String BizCheckFormNo) {
        this.BizCheckFormNo = BizCheckFormNo;
    }

    /**
     * Get 主管税务机关代码 
     * @return TaxtationOrgCode 主管税务机关代码
     */
    public String getTaxtationOrgCode() {
        return this.TaxtationOrgCode;
    }

    /**
     * Set 主管税务机关代码
     * @param TaxtationOrgCode 主管税务机关代码
     */
    public void setTaxtationOrgCode(String TaxtationOrgCode) {
        this.TaxtationOrgCode = TaxtationOrgCode;
    }

    /**
     * Get 主管税务机关名称 
     * @return TaxtationOrgName 主管税务机关名称
     */
    public String getTaxtationOrgName() {
        return this.TaxtationOrgName;
    }

    /**
     * Set 主管税务机关名称
     * @param TaxtationOrgName 主管税务机关名称
     */
    public void setTaxtationOrgName(String TaxtationOrgName) {
        this.TaxtationOrgName = TaxtationOrgName;
    }

    /**
     * Get 税率 
     * @return MotorTaxRate 税率
     */
    public String getMotorTaxRate() {
        return this.MotorTaxRate;
    }

    /**
     * Set 税率
     * @param MotorTaxRate 税率
     */
    public void setMotorTaxRate(String MotorTaxRate) {
        this.MotorTaxRate = MotorTaxRate;
    }

    /**
     * Get 开户行 
     * @return MotorBankName 开户行
     */
    public String getMotorBankName() {
        return this.MotorBankName;
    }

    /**
     * Set 开户行
     * @param MotorBankName 开户行
     */
    public void setMotorBankName(String MotorBankName) {
        this.MotorBankName = MotorBankName;
    }

    /**
     * Get 账号 
     * @return MotorBankAccount 账号
     */
    public String getMotorBankAccount() {
        return this.MotorBankAccount;
    }

    /**
     * Set 账号
     * @param MotorBankAccount 账号
     */
    public void setMotorBankAccount(String MotorBankAccount) {
        this.MotorBankAccount = MotorBankAccount;
    }

    public VehicleInvoiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VehicleInvoiceInfo(VehicleInvoiceInfo source) {
        if (source.CarType != null) {
            this.CarType = new String(source.CarType);
        }
        if (source.PlateModel != null) {
            this.PlateModel = new String(source.PlateModel);
        }
        if (source.ProduceAddress != null) {
            this.ProduceAddress = new String(source.ProduceAddress);
        }
        if (source.CertificateNo != null) {
            this.CertificateNo = new String(source.CertificateNo);
        }
        if (source.ImportNo != null) {
            this.ImportNo = new String(source.ImportNo);
        }
        if (source.VinNo != null) {
            this.VinNo = new String(source.VinNo);
        }
        if (source.PayTaxesNo != null) {
            this.PayTaxesNo = new String(source.PayTaxesNo);
        }
        if (source.Tonnage != null) {
            this.Tonnage = new String(source.Tonnage);
        }
        if (source.LimitCount != null) {
            this.LimitCount = new String(source.LimitCount);
        }
        if (source.EngineNo != null) {
            this.EngineNo = new String(source.EngineNo);
        }
        if (source.BizCheckFormNo != null) {
            this.BizCheckFormNo = new String(source.BizCheckFormNo);
        }
        if (source.TaxtationOrgCode != null) {
            this.TaxtationOrgCode = new String(source.TaxtationOrgCode);
        }
        if (source.TaxtationOrgName != null) {
            this.TaxtationOrgName = new String(source.TaxtationOrgName);
        }
        if (source.MotorTaxRate != null) {
            this.MotorTaxRate = new String(source.MotorTaxRate);
        }
        if (source.MotorBankName != null) {
            this.MotorBankName = new String(source.MotorBankName);
        }
        if (source.MotorBankAccount != null) {
            this.MotorBankAccount = new String(source.MotorBankAccount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CarType", this.CarType);
        this.setParamSimple(map, prefix + "PlateModel", this.PlateModel);
        this.setParamSimple(map, prefix + "ProduceAddress", this.ProduceAddress);
        this.setParamSimple(map, prefix + "CertificateNo", this.CertificateNo);
        this.setParamSimple(map, prefix + "ImportNo", this.ImportNo);
        this.setParamSimple(map, prefix + "VinNo", this.VinNo);
        this.setParamSimple(map, prefix + "PayTaxesNo", this.PayTaxesNo);
        this.setParamSimple(map, prefix + "Tonnage", this.Tonnage);
        this.setParamSimple(map, prefix + "LimitCount", this.LimitCount);
        this.setParamSimple(map, prefix + "EngineNo", this.EngineNo);
        this.setParamSimple(map, prefix + "BizCheckFormNo", this.BizCheckFormNo);
        this.setParamSimple(map, prefix + "TaxtationOrgCode", this.TaxtationOrgCode);
        this.setParamSimple(map, prefix + "TaxtationOrgName", this.TaxtationOrgName);
        this.setParamSimple(map, prefix + "MotorTaxRate", this.MotorTaxRate);
        this.setParamSimple(map, prefix + "MotorBankName", this.MotorBankName);
        this.setParamSimple(map, prefix + "MotorBankAccount", this.MotorBankAccount);

    }
}

