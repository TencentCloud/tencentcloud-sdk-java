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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCodeBatchRequest extends AbstractModel {

    /**
    * 批次ID
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 状态 0: 未激活 1: 已激活 -1: 已冻结
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 模板ID，或者活动ID
    */
    @SerializedName("MpTpl")
    @Expose
    private String MpTpl;

    /**
    * 商户ID
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 商品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 批次编码，业务字段不判断唯一性
    */
    @SerializedName("BatchCode")
    @Expose
    private String BatchCode;

    /**
    * 有效期
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * 生产日期
    */
    @SerializedName("ProductionDate")
    @Expose
    private String ProductionDate;

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
     * Get 状态 0: 未激活 1: 已激活 -1: 已冻结 
     * @return Status 状态 0: 未激活 1: 已激活 -1: 已冻结
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 0: 未激活 1: 已激活 -1: 已冻结
     * @param Status 状态 0: 未激活 1: 已激活 -1: 已冻结
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 模板ID，或者活动ID 
     * @return MpTpl 模板ID，或者活动ID
     */
    public String getMpTpl() {
        return this.MpTpl;
    }

    /**
     * Set 模板ID，或者活动ID
     * @param MpTpl 模板ID，或者活动ID
     */
    public void setMpTpl(String MpTpl) {
        this.MpTpl = MpTpl;
    }

    /**
     * Get 商户ID 
     * @return MerchantId 商户ID
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户ID
     * @param MerchantId 商户ID
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 商品ID 
     * @return ProductId 商品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 商品ID
     * @param ProductId 商品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 批次编码，业务字段不判断唯一性 
     * @return BatchCode 批次编码，业务字段不判断唯一性
     */
    public String getBatchCode() {
        return this.BatchCode;
    }

    /**
     * Set 批次编码，业务字段不判断唯一性
     * @param BatchCode 批次编码，业务字段不判断唯一性
     */
    public void setBatchCode(String BatchCode) {
        this.BatchCode = BatchCode;
    }

    /**
     * Get 有效期 
     * @return ValidDate 有效期
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set 有效期
     * @param ValidDate 有效期
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get 生产日期 
     * @return ProductionDate 生产日期
     */
    public String getProductionDate() {
        return this.ProductionDate;
    }

    /**
     * Set 生产日期
     * @param ProductionDate 生产日期
     */
    public void setProductionDate(String ProductionDate) {
        this.ProductionDate = ProductionDate;
    }

    public ModifyCodeBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCodeBatchRequest(ModifyCodeBatchRequest source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MpTpl != null) {
            this.MpTpl = new String(source.MpTpl);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.BatchCode != null) {
            this.BatchCode = new String(source.BatchCode);
        }
        if (source.ValidDate != null) {
            this.ValidDate = new String(source.ValidDate);
        }
        if (source.ProductionDate != null) {
            this.ProductionDate = new String(source.ProductionDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MpTpl", this.MpTpl);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "BatchCode", this.BatchCode);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "ProductionDate", this.ProductionDate);

    }
}

