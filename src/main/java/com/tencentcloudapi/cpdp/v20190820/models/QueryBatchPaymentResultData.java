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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryBatchPaymentResultData extends AbstractModel{

    /**
    * 批次号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 批次总额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalAmount")
    @Expose
    private Long TotalAmount;

    /**
    * 批次总量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 批次预留字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReqReserved")
    @Expose
    private String ReqReserved;

    /**
    * 批次备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 渠道类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransferType")
    @Expose
    private Long TransferType;

    /**
    * 转账明细
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransferInfoList")
    @Expose
    private QueryBatchPaymentResultDataInfo [] TransferInfoList;

    /**
     * Get 批次号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchId 批次号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批次号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchId 批次号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 批次总额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalAmount 批次总额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 批次总额
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalAmount 批次总额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalAmount(Long TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get 批次总量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 批次总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 批次总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 批次总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 批次预留字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReqReserved 批次预留字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReqReserved() {
        return this.ReqReserved;
    }

    /**
     * Set 批次预留字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReqReserved 批次预留字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReqReserved(String ReqReserved) {
        this.ReqReserved = ReqReserved;
    }

    /**
     * Get 批次备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 批次备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 批次备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 批次备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 渠道类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransferType 渠道类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTransferType() {
        return this.TransferType;
    }

    /**
     * Set 渠道类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransferType 渠道类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransferType(Long TransferType) {
        this.TransferType = TransferType;
    }

    /**
     * Get 转账明细
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransferInfoList 转账明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QueryBatchPaymentResultDataInfo [] getTransferInfoList() {
        return this.TransferInfoList;
    }

    /**
     * Set 转账明细
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransferInfoList 转账明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransferInfoList(QueryBatchPaymentResultDataInfo [] TransferInfoList) {
        this.TransferInfoList = TransferInfoList;
    }

    public QueryBatchPaymentResultData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryBatchPaymentResultData(QueryBatchPaymentResultData source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new Long(source.TotalAmount);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ReqReserved != null) {
            this.ReqReserved = new String(source.ReqReserved);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TransferType != null) {
            this.TransferType = new Long(source.TransferType);
        }
        if (source.TransferInfoList != null) {
            this.TransferInfoList = new QueryBatchPaymentResultDataInfo[source.TransferInfoList.length];
            for (int i = 0; i < source.TransferInfoList.length; i++) {
                this.TransferInfoList[i] = new QueryBatchPaymentResultDataInfo(source.TransferInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "ReqReserved", this.ReqReserved);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TransferType", this.TransferType);
        this.setParamArrayObj(map, prefix + "TransferInfoList.", this.TransferInfoList);

    }
}

