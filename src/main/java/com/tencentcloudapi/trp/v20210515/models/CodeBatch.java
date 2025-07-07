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

public class CodeBatch extends AbstractModel {

    /**
    * 批次号
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
    * 批次编码(未使用)
    */
    @SerializedName("BatchCode")
    @Expose
    private String BatchCode;

    /**
    * 码数量
    */
    @SerializedName("CodeCnt")
    @Expose
    private Long CodeCnt;

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
    * 批次类型
    */
    @SerializedName("BatchType")
    @Expose
    private Long BatchType;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 微信模板
    */
    @SerializedName("MpTpl")
    @Expose
    private String MpTpl;

    /**
    * 批次状态 0: 未激活 1: 已激活 -1: 已冻结
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
    * 所属商户名称
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
    * 未使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ext")
    @Expose
    private Ext Ext;

    /**
    * 模板名称
    */
    @SerializedName("TplName")
    @Expose
    private String TplName;

    /**
    * 调度任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Job")
    @Expose
    private Job Job;

    /**
    * 生产日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductionDate")
    @Expose
    private String ProductionDate;

    /**
    * 有效期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * 扩展属性
    */
    @SerializedName("Attrs")
    @Expose
    private AttrItem [] Attrs;

    /**
     * Get 批次号 
     * @return BatchId 批次号
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批次号
     * @param BatchId 批次号
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
     * Get 批次编码(未使用) 
     * @return BatchCode 批次编码(未使用)
     */
    public String getBatchCode() {
        return this.BatchCode;
    }

    /**
     * Set 批次编码(未使用)
     * @param BatchCode 批次编码(未使用)
     */
    public void setBatchCode(String BatchCode) {
        this.BatchCode = BatchCode;
    }

    /**
     * Get 码数量 
     * @return CodeCnt 码数量
     */
    public Long getCodeCnt() {
        return this.CodeCnt;
    }

    /**
     * Set 码数量
     * @param CodeCnt 码数量
     */
    public void setCodeCnt(Long CodeCnt) {
        this.CodeCnt = CodeCnt;
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
     * Get 批次类型 
     * @return BatchType 批次类型
     */
    public Long getBatchType() {
        return this.BatchType;
    }

    /**
     * Set 批次类型
     * @param BatchType 批次类型
     */
    public void setBatchType(Long BatchType) {
        this.BatchType = BatchType;
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
     * Get 微信模板 
     * @return MpTpl 微信模板
     */
    public String getMpTpl() {
        return this.MpTpl;
    }

    /**
     * Set 微信模板
     * @param MpTpl 微信模板
     */
    public void setMpTpl(String MpTpl) {
        this.MpTpl = MpTpl;
    }

    /**
     * Get 批次状态 0: 未激活 1: 已激活 -1: 已冻结 
     * @return Status 批次状态 0: 未激活 1: 已激活 -1: 已冻结
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 批次状态 0: 未激活 1: 已激活 -1: 已冻结
     * @param Status 批次状态 0: 未激活 1: 已激活 -1: 已冻结
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
     * Get 所属商户名称 
     * @return MerchantName 所属商户名称
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 所属商户名称
     * @param MerchantName 所属商户名称
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

    /**
     * Get 未使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ext 未使用
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Ext getExt() {
        return this.Ext;
    }

    /**
     * Set 未使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ext 未使用
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setExt(Ext Ext) {
        this.Ext = Ext;
    }

    /**
     * Get 模板名称 
     * @return TplName 模板名称
     */
    public String getTplName() {
        return this.TplName;
    }

    /**
     * Set 模板名称
     * @param TplName 模板名称
     */
    public void setTplName(String TplName) {
        this.TplName = TplName;
    }

    /**
     * Get 调度任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Job 调度任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Job getJob() {
        return this.Job;
    }

    /**
     * Set 调度任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param Job 调度任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJob(Job Job) {
        this.Job = Job;
    }

    /**
     * Get 生产日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductionDate 生产日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductionDate() {
        return this.ProductionDate;
    }

    /**
     * Set 生产日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductionDate 生产日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductionDate(String ProductionDate) {
        this.ProductionDate = ProductionDate;
    }

    /**
     * Get 有效期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidDate 有效期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set 有效期
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidDate 有效期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get 扩展属性 
     * @return Attrs 扩展属性
     */
    public AttrItem [] getAttrs() {
        return this.Attrs;
    }

    /**
     * Set 扩展属性
     * @param Attrs 扩展属性
     */
    public void setAttrs(AttrItem [] Attrs) {
        this.Attrs = Attrs;
    }

    public CodeBatch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeBatch(CodeBatch source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.BatchCode != null) {
            this.BatchCode = new String(source.BatchCode);
        }
        if (source.CodeCnt != null) {
            this.CodeCnt = new Long(source.CodeCnt);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.BatchType != null) {
            this.BatchType = new Long(source.BatchType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MpTpl != null) {
            this.MpTpl = new String(source.MpTpl);
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
        if (source.Ext != null) {
            this.Ext = new Ext(source.Ext);
        }
        if (source.TplName != null) {
            this.TplName = new String(source.TplName);
        }
        if (source.Job != null) {
            this.Job = new Job(source.Job);
        }
        if (source.ProductionDate != null) {
            this.ProductionDate = new String(source.ProductionDate);
        }
        if (source.ValidDate != null) {
            this.ValidDate = new String(source.ValidDate);
        }
        if (source.Attrs != null) {
            this.Attrs = new AttrItem[source.Attrs.length];
            for (int i = 0; i < source.Attrs.length; i++) {
                this.Attrs[i] = new AttrItem(source.Attrs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "BatchCode", this.BatchCode);
        this.setParamSimple(map, prefix + "CodeCnt", this.CodeCnt);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "BatchType", this.BatchType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MpTpl", this.MpTpl);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamObj(map, prefix + "Ext.", this.Ext);
        this.setParamSimple(map, prefix + "TplName", this.TplName);
        this.setParamObj(map, prefix + "Job.", this.Job);
        this.setParamSimple(map, prefix + "ProductionDate", this.ProductionDate);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamArrayObj(map, prefix + "Attrs.", this.Attrs);

    }
}

