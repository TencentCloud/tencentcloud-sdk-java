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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Drug extends AbstractModel {

    /**
    * 医院药品id
    */
    @SerializedName("DrugOrgId")
    @Expose
    private String DrugOrgId;

    /**
    * 医院药品通用名
    */
    @SerializedName("DrugName")
    @Expose
    private String DrugName;

    /**
    * 医院药品商品名
    */
    @SerializedName("DrugCommodityName")
    @Expose
    private String DrugCommodityName;

    /**
    * 医院药品规格
    */
    @SerializedName("Specifications")
    @Expose
    private String Specifications;

    /**
    * 医院药品批准文号
    */
    @SerializedName("ApprovalNumber")
    @Expose
    private String ApprovalNumber;

    /**
    * 生产厂商
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * 剂型
    */
    @SerializedName("DosageForm")
    @Expose
    private String DosageForm;

    /**
    * 使用状态 0:启用 1:停用
    */
    @SerializedName("Unuse")
    @Expose
    private Long Unuse;

    /**
    * 剂型编码
    */
    @SerializedName("DosageFormCode")
    @Expose
    private String DosageFormCode;

    /**
    * 抗菌药DDD值
    */
    @SerializedName("DefinedDailyDose")
    @Expose
    private String DefinedDailyDose;

    /**
    * 药品单价
    */
    @SerializedName("Amount")
    @Expose
    private String Amount;

    /**
    * 国家医保编码
    */
    @SerializedName("YbCode")
    @Expose
    private String YbCode;

    /**
    * 药品本位码
    */
    @SerializedName("DrugBasicCode")
    @Expose
    private String DrugBasicCode;

    /**
    * 药品属性
    */
    @SerializedName("PropertyInfo")
    @Expose
    private DurgPropertyInfo PropertyInfo;

    /**
     * Get 医院药品id 
     * @return DrugOrgId 医院药品id
     */
    public String getDrugOrgId() {
        return this.DrugOrgId;
    }

    /**
     * Set 医院药品id
     * @param DrugOrgId 医院药品id
     */
    public void setDrugOrgId(String DrugOrgId) {
        this.DrugOrgId = DrugOrgId;
    }

    /**
     * Get 医院药品通用名 
     * @return DrugName 医院药品通用名
     */
    public String getDrugName() {
        return this.DrugName;
    }

    /**
     * Set 医院药品通用名
     * @param DrugName 医院药品通用名
     */
    public void setDrugName(String DrugName) {
        this.DrugName = DrugName;
    }

    /**
     * Get 医院药品商品名 
     * @return DrugCommodityName 医院药品商品名
     */
    public String getDrugCommodityName() {
        return this.DrugCommodityName;
    }

    /**
     * Set 医院药品商品名
     * @param DrugCommodityName 医院药品商品名
     */
    public void setDrugCommodityName(String DrugCommodityName) {
        this.DrugCommodityName = DrugCommodityName;
    }

    /**
     * Get 医院药品规格 
     * @return Specifications 医院药品规格
     */
    public String getSpecifications() {
        return this.Specifications;
    }

    /**
     * Set 医院药品规格
     * @param Specifications 医院药品规格
     */
    public void setSpecifications(String Specifications) {
        this.Specifications = Specifications;
    }

    /**
     * Get 医院药品批准文号 
     * @return ApprovalNumber 医院药品批准文号
     */
    public String getApprovalNumber() {
        return this.ApprovalNumber;
    }

    /**
     * Set 医院药品批准文号
     * @param ApprovalNumber 医院药品批准文号
     */
    public void setApprovalNumber(String ApprovalNumber) {
        this.ApprovalNumber = ApprovalNumber;
    }

    /**
     * Get 生产厂商 
     * @return Manufacturer 生产厂商
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 生产厂商
     * @param Manufacturer 生产厂商
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get 剂型 
     * @return DosageForm 剂型
     */
    public String getDosageForm() {
        return this.DosageForm;
    }

    /**
     * Set 剂型
     * @param DosageForm 剂型
     */
    public void setDosageForm(String DosageForm) {
        this.DosageForm = DosageForm;
    }

    /**
     * Get 使用状态 0:启用 1:停用 
     * @return Unuse 使用状态 0:启用 1:停用
     */
    public Long getUnuse() {
        return this.Unuse;
    }

    /**
     * Set 使用状态 0:启用 1:停用
     * @param Unuse 使用状态 0:启用 1:停用
     */
    public void setUnuse(Long Unuse) {
        this.Unuse = Unuse;
    }

    /**
     * Get 剂型编码 
     * @return DosageFormCode 剂型编码
     */
    public String getDosageFormCode() {
        return this.DosageFormCode;
    }

    /**
     * Set 剂型编码
     * @param DosageFormCode 剂型编码
     */
    public void setDosageFormCode(String DosageFormCode) {
        this.DosageFormCode = DosageFormCode;
    }

    /**
     * Get 抗菌药DDD值 
     * @return DefinedDailyDose 抗菌药DDD值
     */
    public String getDefinedDailyDose() {
        return this.DefinedDailyDose;
    }

    /**
     * Set 抗菌药DDD值
     * @param DefinedDailyDose 抗菌药DDD值
     */
    public void setDefinedDailyDose(String DefinedDailyDose) {
        this.DefinedDailyDose = DefinedDailyDose;
    }

    /**
     * Get 药品单价 
     * @return Amount 药品单价
     */
    public String getAmount() {
        return this.Amount;
    }

    /**
     * Set 药品单价
     * @param Amount 药品单价
     */
    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 国家医保编码 
     * @return YbCode 国家医保编码
     */
    public String getYbCode() {
        return this.YbCode;
    }

    /**
     * Set 国家医保编码
     * @param YbCode 国家医保编码
     */
    public void setYbCode(String YbCode) {
        this.YbCode = YbCode;
    }

    /**
     * Get 药品本位码 
     * @return DrugBasicCode 药品本位码
     */
    public String getDrugBasicCode() {
        return this.DrugBasicCode;
    }

    /**
     * Set 药品本位码
     * @param DrugBasicCode 药品本位码
     */
    public void setDrugBasicCode(String DrugBasicCode) {
        this.DrugBasicCode = DrugBasicCode;
    }

    /**
     * Get 药品属性 
     * @return PropertyInfo 药品属性
     */
    public DurgPropertyInfo getPropertyInfo() {
        return this.PropertyInfo;
    }

    /**
     * Set 药品属性
     * @param PropertyInfo 药品属性
     */
    public void setPropertyInfo(DurgPropertyInfo PropertyInfo) {
        this.PropertyInfo = PropertyInfo;
    }

    public Drug() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Drug(Drug source) {
        if (source.DrugOrgId != null) {
            this.DrugOrgId = new String(source.DrugOrgId);
        }
        if (source.DrugName != null) {
            this.DrugName = new String(source.DrugName);
        }
        if (source.DrugCommodityName != null) {
            this.DrugCommodityName = new String(source.DrugCommodityName);
        }
        if (source.Specifications != null) {
            this.Specifications = new String(source.Specifications);
        }
        if (source.ApprovalNumber != null) {
            this.ApprovalNumber = new String(source.ApprovalNumber);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.DosageForm != null) {
            this.DosageForm = new String(source.DosageForm);
        }
        if (source.Unuse != null) {
            this.Unuse = new Long(source.Unuse);
        }
        if (source.DosageFormCode != null) {
            this.DosageFormCode = new String(source.DosageFormCode);
        }
        if (source.DefinedDailyDose != null) {
            this.DefinedDailyDose = new String(source.DefinedDailyDose);
        }
        if (source.Amount != null) {
            this.Amount = new String(source.Amount);
        }
        if (source.YbCode != null) {
            this.YbCode = new String(source.YbCode);
        }
        if (source.DrugBasicCode != null) {
            this.DrugBasicCode = new String(source.DrugBasicCode);
        }
        if (source.PropertyInfo != null) {
            this.PropertyInfo = new DurgPropertyInfo(source.PropertyInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrugOrgId", this.DrugOrgId);
        this.setParamSimple(map, prefix + "DrugName", this.DrugName);
        this.setParamSimple(map, prefix + "DrugCommodityName", this.DrugCommodityName);
        this.setParamSimple(map, prefix + "Specifications", this.Specifications);
        this.setParamSimple(map, prefix + "ApprovalNumber", this.ApprovalNumber);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "DosageForm", this.DosageForm);
        this.setParamSimple(map, prefix + "Unuse", this.Unuse);
        this.setParamSimple(map, prefix + "DosageFormCode", this.DosageFormCode);
        this.setParamSimple(map, prefix + "DefinedDailyDose", this.DefinedDailyDose);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "YbCode", this.YbCode);
        this.setParamSimple(map, prefix + "DrugBasicCode", this.DrugBasicCode);
        this.setParamObj(map, prefix + "PropertyInfo.", this.PropertyInfo);

    }
}

