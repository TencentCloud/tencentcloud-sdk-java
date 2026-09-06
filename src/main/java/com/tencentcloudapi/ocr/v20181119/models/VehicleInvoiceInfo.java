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

public class VehicleInvoiceInfo extends AbstractModel {

    /**
    * <p>车辆类型</p>
    */
    @SerializedName("CarType")
    @Expose
    private String CarType;

    /**
    * <p>厂牌型号</p>
    */
    @SerializedName("PlateModel")
    @Expose
    private String PlateModel;

    /**
    * <p>产地</p>
    */
    @SerializedName("ProduceAddress")
    @Expose
    private String ProduceAddress;

    /**
    * <p>合格证号</p>
    */
    @SerializedName("CertificateNo")
    @Expose
    private String CertificateNo;

    /**
    * <p>进口证明书号</p>
    */
    @SerializedName("ImportNo")
    @Expose
    private String ImportNo;

    /**
    * <p>LSVCA2NP9HN0xxxxx</p>
    */
    @SerializedName("VinNo")
    @Expose
    private String VinNo;

    /**
    * <p>完税证书号</p>
    */
    @SerializedName("PayTaxesNo")
    @Expose
    private String PayTaxesNo;

    /**
    * <p>吨位</p>
    */
    @SerializedName("Tonnage")
    @Expose
    private String Tonnage;

    /**
    * <p>限乘人数</p>
    */
    @SerializedName("LimitCount")
    @Expose
    private String LimitCount;

    /**
    * <p>发动机号码</p>
    */
    @SerializedName("EngineNo")
    @Expose
    private String EngineNo;

    /**
    * <p>商检单号</p>
    */
    @SerializedName("BizCheckFormNo")
    @Expose
    private String BizCheckFormNo;

    /**
    * <p>主管税务机关代码</p>
    */
    @SerializedName("TaxtationOrgCode")
    @Expose
    private String TaxtationOrgCode;

    /**
    * <p>主管税务机关名称</p>
    */
    @SerializedName("TaxtationOrgName")
    @Expose
    private String TaxtationOrgName;

    /**
    * <p>税率</p>
    */
    @SerializedName("MotorTaxRate")
    @Expose
    private String MotorTaxRate;

    /**
    * <p>银行账号</p>
    */
    @SerializedName("MotorBankName")
    @Expose
    private String MotorBankName;

    /**
    * <p>开户行</p>
    */
    @SerializedName("MotorBankAccount")
    @Expose
    private String MotorBankAccount;

    /**
    * <p>销售地址</p>
    */
    @SerializedName("SellerAddress")
    @Expose
    private String SellerAddress;

    /**
    * <p>销售电话</p>
    */
    @SerializedName("SellerTel")
    @Expose
    private String SellerTel;

    /**
    * <p>购方身份证</p>
    */
    @SerializedName("BuyerNo")
    @Expose
    private String BuyerNo;

    /**
     * Get <p>车辆类型</p> 
     * @return CarType <p>车辆类型</p>
     */
    public String getCarType() {
        return this.CarType;
    }

    /**
     * Set <p>车辆类型</p>
     * @param CarType <p>车辆类型</p>
     */
    public void setCarType(String CarType) {
        this.CarType = CarType;
    }

    /**
     * Get <p>厂牌型号</p> 
     * @return PlateModel <p>厂牌型号</p>
     */
    public String getPlateModel() {
        return this.PlateModel;
    }

    /**
     * Set <p>厂牌型号</p>
     * @param PlateModel <p>厂牌型号</p>
     */
    public void setPlateModel(String PlateModel) {
        this.PlateModel = PlateModel;
    }

    /**
     * Get <p>产地</p> 
     * @return ProduceAddress <p>产地</p>
     */
    public String getProduceAddress() {
        return this.ProduceAddress;
    }

    /**
     * Set <p>产地</p>
     * @param ProduceAddress <p>产地</p>
     */
    public void setProduceAddress(String ProduceAddress) {
        this.ProduceAddress = ProduceAddress;
    }

    /**
     * Get <p>合格证号</p> 
     * @return CertificateNo <p>合格证号</p>
     */
    public String getCertificateNo() {
        return this.CertificateNo;
    }

    /**
     * Set <p>合格证号</p>
     * @param CertificateNo <p>合格证号</p>
     */
    public void setCertificateNo(String CertificateNo) {
        this.CertificateNo = CertificateNo;
    }

    /**
     * Get <p>进口证明书号</p> 
     * @return ImportNo <p>进口证明书号</p>
     */
    public String getImportNo() {
        return this.ImportNo;
    }

    /**
     * Set <p>进口证明书号</p>
     * @param ImportNo <p>进口证明书号</p>
     */
    public void setImportNo(String ImportNo) {
        this.ImportNo = ImportNo;
    }

    /**
     * Get <p>LSVCA2NP9HN0xxxxx</p> 
     * @return VinNo <p>LSVCA2NP9HN0xxxxx</p>
     */
    public String getVinNo() {
        return this.VinNo;
    }

    /**
     * Set <p>LSVCA2NP9HN0xxxxx</p>
     * @param VinNo <p>LSVCA2NP9HN0xxxxx</p>
     */
    public void setVinNo(String VinNo) {
        this.VinNo = VinNo;
    }

    /**
     * Get <p>完税证书号</p> 
     * @return PayTaxesNo <p>完税证书号</p>
     */
    public String getPayTaxesNo() {
        return this.PayTaxesNo;
    }

    /**
     * Set <p>完税证书号</p>
     * @param PayTaxesNo <p>完税证书号</p>
     */
    public void setPayTaxesNo(String PayTaxesNo) {
        this.PayTaxesNo = PayTaxesNo;
    }

    /**
     * Get <p>吨位</p> 
     * @return Tonnage <p>吨位</p>
     */
    public String getTonnage() {
        return this.Tonnage;
    }

    /**
     * Set <p>吨位</p>
     * @param Tonnage <p>吨位</p>
     */
    public void setTonnage(String Tonnage) {
        this.Tonnage = Tonnage;
    }

    /**
     * Get <p>限乘人数</p> 
     * @return LimitCount <p>限乘人数</p>
     */
    public String getLimitCount() {
        return this.LimitCount;
    }

    /**
     * Set <p>限乘人数</p>
     * @param LimitCount <p>限乘人数</p>
     */
    public void setLimitCount(String LimitCount) {
        this.LimitCount = LimitCount;
    }

    /**
     * Get <p>发动机号码</p> 
     * @return EngineNo <p>发动机号码</p>
     */
    public String getEngineNo() {
        return this.EngineNo;
    }

    /**
     * Set <p>发动机号码</p>
     * @param EngineNo <p>发动机号码</p>
     */
    public void setEngineNo(String EngineNo) {
        this.EngineNo = EngineNo;
    }

    /**
     * Get <p>商检单号</p> 
     * @return BizCheckFormNo <p>商检单号</p>
     */
    public String getBizCheckFormNo() {
        return this.BizCheckFormNo;
    }

    /**
     * Set <p>商检单号</p>
     * @param BizCheckFormNo <p>商检单号</p>
     */
    public void setBizCheckFormNo(String BizCheckFormNo) {
        this.BizCheckFormNo = BizCheckFormNo;
    }

    /**
     * Get <p>主管税务机关代码</p> 
     * @return TaxtationOrgCode <p>主管税务机关代码</p>
     */
    public String getTaxtationOrgCode() {
        return this.TaxtationOrgCode;
    }

    /**
     * Set <p>主管税务机关代码</p>
     * @param TaxtationOrgCode <p>主管税务机关代码</p>
     */
    public void setTaxtationOrgCode(String TaxtationOrgCode) {
        this.TaxtationOrgCode = TaxtationOrgCode;
    }

    /**
     * Get <p>主管税务机关名称</p> 
     * @return TaxtationOrgName <p>主管税务机关名称</p>
     */
    public String getTaxtationOrgName() {
        return this.TaxtationOrgName;
    }

    /**
     * Set <p>主管税务机关名称</p>
     * @param TaxtationOrgName <p>主管税务机关名称</p>
     */
    public void setTaxtationOrgName(String TaxtationOrgName) {
        this.TaxtationOrgName = TaxtationOrgName;
    }

    /**
     * Get <p>税率</p> 
     * @return MotorTaxRate <p>税率</p>
     */
    public String getMotorTaxRate() {
        return this.MotorTaxRate;
    }

    /**
     * Set <p>税率</p>
     * @param MotorTaxRate <p>税率</p>
     */
    public void setMotorTaxRate(String MotorTaxRate) {
        this.MotorTaxRate = MotorTaxRate;
    }

    /**
     * Get <p>银行账号</p> 
     * @return MotorBankName <p>银行账号</p>
     */
    public String getMotorBankName() {
        return this.MotorBankName;
    }

    /**
     * Set <p>银行账号</p>
     * @param MotorBankName <p>银行账号</p>
     */
    public void setMotorBankName(String MotorBankName) {
        this.MotorBankName = MotorBankName;
    }

    /**
     * Get <p>开户行</p> 
     * @return MotorBankAccount <p>开户行</p>
     */
    public String getMotorBankAccount() {
        return this.MotorBankAccount;
    }

    /**
     * Set <p>开户行</p>
     * @param MotorBankAccount <p>开户行</p>
     */
    public void setMotorBankAccount(String MotorBankAccount) {
        this.MotorBankAccount = MotorBankAccount;
    }

    /**
     * Get <p>销售地址</p> 
     * @return SellerAddress <p>销售地址</p>
     */
    public String getSellerAddress() {
        return this.SellerAddress;
    }

    /**
     * Set <p>销售地址</p>
     * @param SellerAddress <p>销售地址</p>
     */
    public void setSellerAddress(String SellerAddress) {
        this.SellerAddress = SellerAddress;
    }

    /**
     * Get <p>销售电话</p> 
     * @return SellerTel <p>销售电话</p>
     */
    public String getSellerTel() {
        return this.SellerTel;
    }

    /**
     * Set <p>销售电话</p>
     * @param SellerTel <p>销售电话</p>
     */
    public void setSellerTel(String SellerTel) {
        this.SellerTel = SellerTel;
    }

    /**
     * Get <p>购方身份证</p> 
     * @return BuyerNo <p>购方身份证</p>
     */
    public String getBuyerNo() {
        return this.BuyerNo;
    }

    /**
     * Set <p>购方身份证</p>
     * @param BuyerNo <p>购方身份证</p>
     */
    public void setBuyerNo(String BuyerNo) {
        this.BuyerNo = BuyerNo;
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
        if (source.SellerAddress != null) {
            this.SellerAddress = new String(source.SellerAddress);
        }
        if (source.SellerTel != null) {
            this.SellerTel = new String(source.SellerTel);
        }
        if (source.BuyerNo != null) {
            this.BuyerNo = new String(source.BuyerNo);
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
        this.setParamSimple(map, prefix + "SellerAddress", this.SellerAddress);
        this.setParamSimple(map, prefix + "SellerTel", this.SellerTel);
        this.setParamSimple(map, prefix + "BuyerNo", this.BuyerNo);

    }
}

