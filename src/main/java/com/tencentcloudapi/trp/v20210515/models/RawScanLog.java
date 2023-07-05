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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RawScanLog extends AbstractModel{

    /**
    * 日志ID
    */
    @SerializedName("LogId")
    @Expose
    private Long LogId;

    /**
    * 微信小程序openid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Openid")
    @Expose
    private String Openid;

    /**
    * 扫码时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 溯源码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 商户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 商品ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 批次ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 省份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 地市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 区/县
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
     * Get 日志ID 
     * @return LogId 日志ID
     */
    public Long getLogId() {
        return this.LogId;
    }

    /**
     * Set 日志ID
     * @param LogId 日志ID
     */
    public void setLogId(Long LogId) {
        this.LogId = LogId;
    }

    /**
     * Get 微信小程序openid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Openid 微信小程序openid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenid() {
        return this.Openid;
    }

    /**
     * Set 微信小程序openid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Openid 微信小程序openid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenid(String Openid) {
        this.Openid = Openid;
    }

    /**
     * Get 扫码时间 
     * @return CreateTime 扫码时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 扫码时间
     * @param CreateTime 扫码时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 溯源码 
     * @return Code 溯源码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 溯源码
     * @param Code 溯源码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 商户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantId 商户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantId 商户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 商品ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId 商品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 商品ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId 商品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 批次ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchId 批次ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批次ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchId 批次ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 省份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Province 省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份
注意：此字段可能返回 null，表示取不到有效值。
     * @param Province 省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 地市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return City 地市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 地市
注意：此字段可能返回 null，表示取不到有效值。
     * @param City 地市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 区/县
注意：此字段可能返回 null，表示取不到有效值。 
     * @return District 区/县
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set 区/县
注意：此字段可能返回 null，表示取不到有效值。
     * @param District 区/县
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    public RawScanLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawScanLog(RawScanLog source) {
        if (source.LogId != null) {
            this.LogId = new Long(source.LogId);
        }
        if (source.Openid != null) {
            this.Openid = new String(source.Openid);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.District != null) {
            this.District = new String(source.District);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "Openid", this.Openid);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "District", this.District);

    }
}

