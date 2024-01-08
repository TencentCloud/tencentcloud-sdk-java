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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDosageDetail extends AbstractModel {

    /**
    * 日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 用量统计类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DosageType")
    @Expose
    private String DosageType;

    /**
    * 产品编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 组件类型编码

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingItemCode")
    @Expose
    private String BillingItemCode;

    /**
    * 组件编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubBillingItemCode")
    @Expose
    private String SubBillingItemCode;

    /**
    * 产品名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * 子产品名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubProductCodeName")
    @Expose
    private String SubProductCodeName;

    /**
    * 组件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingItemCodeName")
    @Expose
    private String BillingItemCodeName;

    /**
    * 组件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubBillingItemCodeName")
    @Expose
    private String SubBillingItemCodeName;

    /**
    * 用量单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DosageUnit")
    @Expose
    private String DosageUnit;

    /**
    * 用量起始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DosageBeginTime")
    @Expose
    private String DosageBeginTime;

    /**
    * 用量截止时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DosageEndTime")
    @Expose
    private String DosageEndTime;

    /**
    * 标准用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DosageValue")
    @Expose
    private Float DosageValue;

    /**
    * 抵扣用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeductValue")
    @Expose
    private Float DeductValue;

    /**
    * 抵扣余量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemainValue")
    @Expose
    private Float RemainValue;

    /**
    * sdkAppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * 其他信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttrStr")
    @Expose
    private JsonObject [] AttrStr;

    /**
    * 用量模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SheetName")
    @Expose
    private String [] SheetName;

    /**
     * Get 日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date 日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date 日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 用量统计类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DosageType 用量统计类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDosageType() {
        return this.DosageType;
    }

    /**
     * Set 用量统计类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DosageType 用量统计类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDosageType(String DosageType) {
        this.DosageType = DosageType;
    }

    /**
     * Get 产品编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCode 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCode 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 子产品编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubProductCode 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubProductCode 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get 组件类型编码

注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingItemCode 组件类型编码

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingItemCode() {
        return this.BillingItemCode;
    }

    /**
     * Set 组件类型编码

注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingItemCode 组件类型编码

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingItemCode(String BillingItemCode) {
        this.BillingItemCode = BillingItemCode;
    }

    /**
     * Get 组件编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubBillingItemCode 组件编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubBillingItemCode() {
        return this.SubBillingItemCode;
    }

    /**
     * Set 组件编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubBillingItemCode 组件编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubBillingItemCode(String SubBillingItemCode) {
        this.SubBillingItemCode = SubBillingItemCode;
    }

    /**
     * Get 产品名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCodeName 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCodeName 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get 子产品名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubProductCodeName 子产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubProductCodeName() {
        return this.SubProductCodeName;
    }

    /**
     * Set 子产品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubProductCodeName 子产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubProductCodeName(String SubProductCodeName) {
        this.SubProductCodeName = SubProductCodeName;
    }

    /**
     * Get 组件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingItemCodeName 组件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingItemCodeName() {
        return this.BillingItemCodeName;
    }

    /**
     * Set 组件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingItemCodeName 组件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingItemCodeName(String BillingItemCodeName) {
        this.BillingItemCodeName = BillingItemCodeName;
    }

    /**
     * Get 组件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubBillingItemCodeName 组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubBillingItemCodeName() {
        return this.SubBillingItemCodeName;
    }

    /**
     * Set 组件
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubBillingItemCodeName 组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubBillingItemCodeName(String SubBillingItemCodeName) {
        this.SubBillingItemCodeName = SubBillingItemCodeName;
    }

    /**
     * Get 用量单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DosageUnit 用量单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDosageUnit() {
        return this.DosageUnit;
    }

    /**
     * Set 用量单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param DosageUnit 用量单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDosageUnit(String DosageUnit) {
        this.DosageUnit = DosageUnit;
    }

    /**
     * Get 用量起始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DosageBeginTime 用量起始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDosageBeginTime() {
        return this.DosageBeginTime;
    }

    /**
     * Set 用量起始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DosageBeginTime 用量起始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDosageBeginTime(String DosageBeginTime) {
        this.DosageBeginTime = DosageBeginTime;
    }

    /**
     * Get 用量截止时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DosageEndTime 用量截止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDosageEndTime() {
        return this.DosageEndTime;
    }

    /**
     * Set 用量截止时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DosageEndTime 用量截止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDosageEndTime(String DosageEndTime) {
        this.DosageEndTime = DosageEndTime;
    }

    /**
     * Get 标准用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DosageValue 标准用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDosageValue() {
        return this.DosageValue;
    }

    /**
     * Set 标准用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DosageValue 标准用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDosageValue(Float DosageValue) {
        this.DosageValue = DosageValue;
    }

    /**
     * Get 抵扣用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeductValue 抵扣用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDeductValue() {
        return this.DeductValue;
    }

    /**
     * Set 抵扣用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeductValue 抵扣用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeductValue(Float DeductValue) {
        this.DeductValue = DeductValue;
    }

    /**
     * Get 抵扣余量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemainValue 抵扣余量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRemainValue() {
        return this.RemainValue;
    }

    /**
     * Set 抵扣余量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemainValue 抵扣余量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemainValue(Float RemainValue) {
        this.RemainValue = RemainValue;
    }

    /**
     * Get sdkAppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SdkAppId sdkAppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set sdkAppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param SdkAppId sdkAppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 其他信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttrStr 其他信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JsonObject [] getAttrStr() {
        return this.AttrStr;
    }

    /**
     * Set 其他信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttrStr 其他信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttrStr(JsonObject [] AttrStr) {
        this.AttrStr = AttrStr;
    }

    /**
     * Get 用量模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SheetName 用量模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSheetName() {
        return this.SheetName;
    }

    /**
     * Set 用量模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SheetName 用量模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSheetName(String [] SheetName) {
        this.SheetName = SheetName;
    }

    public DescribeDosageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDosageDetail(DescribeDosageDetail source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.DosageType != null) {
            this.DosageType = new String(source.DosageType);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.BillingItemCode != null) {
            this.BillingItemCode = new String(source.BillingItemCode);
        }
        if (source.SubBillingItemCode != null) {
            this.SubBillingItemCode = new String(source.SubBillingItemCode);
        }
        if (source.ProductCodeName != null) {
            this.ProductCodeName = new String(source.ProductCodeName);
        }
        if (source.SubProductCodeName != null) {
            this.SubProductCodeName = new String(source.SubProductCodeName);
        }
        if (source.BillingItemCodeName != null) {
            this.BillingItemCodeName = new String(source.BillingItemCodeName);
        }
        if (source.SubBillingItemCodeName != null) {
            this.SubBillingItemCodeName = new String(source.SubBillingItemCodeName);
        }
        if (source.DosageUnit != null) {
            this.DosageUnit = new String(source.DosageUnit);
        }
        if (source.DosageBeginTime != null) {
            this.DosageBeginTime = new String(source.DosageBeginTime);
        }
        if (source.DosageEndTime != null) {
            this.DosageEndTime = new String(source.DosageEndTime);
        }
        if (source.DosageValue != null) {
            this.DosageValue = new Float(source.DosageValue);
        }
        if (source.DeductValue != null) {
            this.DeductValue = new Float(source.DeductValue);
        }
        if (source.RemainValue != null) {
            this.RemainValue = new Float(source.RemainValue);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.AttrStr != null) {
            this.AttrStr = new JsonObject[source.AttrStr.length];
            for (int i = 0; i < source.AttrStr.length; i++) {
                this.AttrStr[i] = new JsonObject(source.AttrStr[i]);
            }
        }
        if (source.SheetName != null) {
            this.SheetName = new String[source.SheetName.length];
            for (int i = 0; i < source.SheetName.length; i++) {
                this.SheetName[i] = new String(source.SheetName[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "DosageType", this.DosageType);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "BillingItemCode", this.BillingItemCode);
        this.setParamSimple(map, prefix + "SubBillingItemCode", this.SubBillingItemCode);
        this.setParamSimple(map, prefix + "ProductCodeName", this.ProductCodeName);
        this.setParamSimple(map, prefix + "SubProductCodeName", this.SubProductCodeName);
        this.setParamSimple(map, prefix + "BillingItemCodeName", this.BillingItemCodeName);
        this.setParamSimple(map, prefix + "SubBillingItemCodeName", this.SubBillingItemCodeName);
        this.setParamSimple(map, prefix + "DosageUnit", this.DosageUnit);
        this.setParamSimple(map, prefix + "DosageBeginTime", this.DosageBeginTime);
        this.setParamSimple(map, prefix + "DosageEndTime", this.DosageEndTime);
        this.setParamSimple(map, prefix + "DosageValue", this.DosageValue);
        this.setParamSimple(map, prefix + "DeductValue", this.DeductValue);
        this.setParamSimple(map, prefix + "RemainValue", this.RemainValue);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArrayObj(map, prefix + "AttrStr.", this.AttrStr);
        this.setParamArraySimple(map, prefix + "SheetName.", this.SheetName);

    }
}

