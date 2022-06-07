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

public class TraceCode extends AbstractModel{

    /**
    * 码
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
    * 包ID
    */
    @SerializedName("PackId")
    @Expose
    private String PackId;

    /**
    * 批次ID
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 所属商户ID
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 商户名称
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
     * Get 码 
     * @return Code 码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 码
     * @param Code 码
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
     * Get 包ID 
     * @return PackId 包ID
     */
    public String getPackId() {
        return this.PackId;
    }

    /**
     * Set 包ID
     * @param PackId 包ID
     */
    public void setPackId(String PackId) {
        this.PackId = PackId;
    }

    /**
     * Get 批次ID 
     * @return BatchId 批次ID
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批次ID
     * @param BatchId 批次ID
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 所属商户ID 
     * @return MerchantId 所属商户ID
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 所属商户ID
     * @param MerchantId 所属商户ID
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return UpdateTime 修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
     * @param UpdateTime 修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 商户名称 
     * @return MerchantName 商户名称
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 商户名称
     * @param MerchantName 商户名称
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public TraceCode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TraceCode(TraceCode source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.PackId != null) {
            this.PackId = new String(source.PackId);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "PackId", this.PackId);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);

    }
}

