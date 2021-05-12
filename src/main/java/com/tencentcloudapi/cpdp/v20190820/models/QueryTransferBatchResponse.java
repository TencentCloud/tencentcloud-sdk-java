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

public class QueryTransferBatchResponse extends AbstractModel{

    /**
    * 商户号。
示例值：19300009329
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013
    */
    @SerializedName("MerchantBatchNo")
    @Expose
    private String MerchantBatchNo;

    /**
    * 微信批次单号。
微信商家转账系统返回的唯一标识。
示例值：1030000071100999991182020050700019480001
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 直连商户appId。
商户号绑定的appid。
示例值：wxf636efh567hg4356
    */
    @SerializedName("MerchantAppId")
    @Expose
    private String MerchantAppId;

    /**
    * 批次状态。
ACCEPTED:已受理，批次已受理成功，若发起批量转账的30分钟后，转账批次单仍处于该状态，可能原因是商户账户余额不足等。商户可查询账户资金流水，若该笔转账批次单的扣款已经发生，则表示批次已经进入转账中，请再次查单确认；
PROCESSING:转账中，已开始处理批次内的转账明细单；
FINISHED:已完成，批次内的所有转账明细单都已处理完成；
CLOSED:已关闭，可查询具体的批次关闭原因确认；
示例值：ACCEPTED
    */
    @SerializedName("BatchStatus")
    @Expose
    private String BatchStatus;

    /**
    * 批次关闭原因。
如果批次单状态为“CLOSED”（已关闭），则有关闭原因；
MERCHANT_REVOCATION：商户主动撤销；
OVERDUE_CLOSE：系统超时关闭。
示例值：OVERDUE_CLOSE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloseReason")
    @Expose
    private String CloseReason;

    /**
    * 转账总金额。
转账金额，单位为分。
示例值：4000000
    */
    @SerializedName("TotalAmount")
    @Expose
    private Long TotalAmount;

    /**
    * 转账总笔数。
一个转账批次最多允许发起三千笔转账。
示例值：200
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 批次受理成功时返回，遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 批次最近一次更新时间，遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 转账成功金额。
转账成功的金额，单位为分，可能随时变化。
示例值：4000000
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessAmount")
    @Expose
    private Long SuccessAmount;

    /**
    * 转账成功的笔数。
可能随时变化。
示例值：200
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessNum")
    @Expose
    private Long SuccessNum;

    /**
    * 转账失败金额。
转账失败的金额，单位为分，可能随时变化。
示例值：4000000
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailAmount")
    @Expose
    private Long FailAmount;

    /**
    * 转账失败笔数。
可能随时变化。
示例值：200
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailNum")
    @Expose
    private Long FailNum;

    /**
    * 转账明细列表。
返回明细详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransferDetails")
    @Expose
    private TransferDetailResponse [] TransferDetails;

    /**
    * 批次类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchType")
    @Expose
    private String BatchType;

    /**
    * 批次名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchName")
    @Expose
    private String BatchName;

    /**
    * 批次标注。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchRemark")
    @Expose
    private String BatchRemark;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 商户号。
示例值：19300009329 
     * @return MerchantId 商户号。
示例值：19300009329
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户号。
示例值：19300009329
     * @param MerchantId 商户号。
示例值：19300009329
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013 
     * @return MerchantBatchNo 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013
     */
    public String getMerchantBatchNo() {
        return this.MerchantBatchNo;
    }

    /**
     * Set 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013
     * @param MerchantBatchNo 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013
     */
    public void setMerchantBatchNo(String MerchantBatchNo) {
        this.MerchantBatchNo = MerchantBatchNo;
    }

    /**
     * Get 微信批次单号。
微信商家转账系统返回的唯一标识。
示例值：1030000071100999991182020050700019480001 
     * @return BatchId 微信批次单号。
微信商家转账系统返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 微信批次单号。
微信商家转账系统返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     * @param BatchId 微信批次单号。
微信商家转账系统返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 直连商户appId。
商户号绑定的appid。
示例值：wxf636efh567hg4356 
     * @return MerchantAppId 直连商户appId。
商户号绑定的appid。
示例值：wxf636efh567hg4356
     */
    public String getMerchantAppId() {
        return this.MerchantAppId;
    }

    /**
     * Set 直连商户appId。
商户号绑定的appid。
示例值：wxf636efh567hg4356
     * @param MerchantAppId 直连商户appId。
商户号绑定的appid。
示例值：wxf636efh567hg4356
     */
    public void setMerchantAppId(String MerchantAppId) {
        this.MerchantAppId = MerchantAppId;
    }

    /**
     * Get 批次状态。
ACCEPTED:已受理，批次已受理成功，若发起批量转账的30分钟后，转账批次单仍处于该状态，可能原因是商户账户余额不足等。商户可查询账户资金流水，若该笔转账批次单的扣款已经发生，则表示批次已经进入转账中，请再次查单确认；
PROCESSING:转账中，已开始处理批次内的转账明细单；
FINISHED:已完成，批次内的所有转账明细单都已处理完成；
CLOSED:已关闭，可查询具体的批次关闭原因确认；
示例值：ACCEPTED 
     * @return BatchStatus 批次状态。
ACCEPTED:已受理，批次已受理成功，若发起批量转账的30分钟后，转账批次单仍处于该状态，可能原因是商户账户余额不足等。商户可查询账户资金流水，若该笔转账批次单的扣款已经发生，则表示批次已经进入转账中，请再次查单确认；
PROCESSING:转账中，已开始处理批次内的转账明细单；
FINISHED:已完成，批次内的所有转账明细单都已处理完成；
CLOSED:已关闭，可查询具体的批次关闭原因确认；
示例值：ACCEPTED
     */
    public String getBatchStatus() {
        return this.BatchStatus;
    }

    /**
     * Set 批次状态。
ACCEPTED:已受理，批次已受理成功，若发起批量转账的30分钟后，转账批次单仍处于该状态，可能原因是商户账户余额不足等。商户可查询账户资金流水，若该笔转账批次单的扣款已经发生，则表示批次已经进入转账中，请再次查单确认；
PROCESSING:转账中，已开始处理批次内的转账明细单；
FINISHED:已完成，批次内的所有转账明细单都已处理完成；
CLOSED:已关闭，可查询具体的批次关闭原因确认；
示例值：ACCEPTED
     * @param BatchStatus 批次状态。
ACCEPTED:已受理，批次已受理成功，若发起批量转账的30分钟后，转账批次单仍处于该状态，可能原因是商户账户余额不足等。商户可查询账户资金流水，若该笔转账批次单的扣款已经发生，则表示批次已经进入转账中，请再次查单确认；
PROCESSING:转账中，已开始处理批次内的转账明细单；
FINISHED:已完成，批次内的所有转账明细单都已处理完成；
CLOSED:已关闭，可查询具体的批次关闭原因确认；
示例值：ACCEPTED
     */
    public void setBatchStatus(String BatchStatus) {
        this.BatchStatus = BatchStatus;
    }

    /**
     * Get 批次关闭原因。
如果批次单状态为“CLOSED”（已关闭），则有关闭原因；
MERCHANT_REVOCATION：商户主动撤销；
OVERDUE_CLOSE：系统超时关闭。
示例值：OVERDUE_CLOSE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloseReason 批次关闭原因。
如果批次单状态为“CLOSED”（已关闭），则有关闭原因；
MERCHANT_REVOCATION：商户主动撤销；
OVERDUE_CLOSE：系统超时关闭。
示例值：OVERDUE_CLOSE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCloseReason() {
        return this.CloseReason;
    }

    /**
     * Set 批次关闭原因。
如果批次单状态为“CLOSED”（已关闭），则有关闭原因；
MERCHANT_REVOCATION：商户主动撤销；
OVERDUE_CLOSE：系统超时关闭。
示例值：OVERDUE_CLOSE
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloseReason 批次关闭原因。
如果批次单状态为“CLOSED”（已关闭），则有关闭原因；
MERCHANT_REVOCATION：商户主动撤销；
OVERDUE_CLOSE：系统超时关闭。
示例值：OVERDUE_CLOSE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloseReason(String CloseReason) {
        this.CloseReason = CloseReason;
    }

    /**
     * Get 转账总金额。
转账金额，单位为分。
示例值：4000000 
     * @return TotalAmount 转账总金额。
转账金额，单位为分。
示例值：4000000
     */
    public Long getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 转账总金额。
转账金额，单位为分。
示例值：4000000
     * @param TotalAmount 转账总金额。
转账金额，单位为分。
示例值：4000000
     */
    public void setTotalAmount(Long TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get 转账总笔数。
一个转账批次最多允许发起三千笔转账。
示例值：200 
     * @return TotalNum 转账总笔数。
一个转账批次最多允许发起三千笔转账。
示例值：200
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 转账总笔数。
一个转账批次最多允许发起三千笔转账。
示例值：200
     * @param TotalNum 转账总笔数。
一个转账批次最多允许发起三千笔转账。
示例值：200
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 批次受理成功时返回，遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 批次受理成功时返回，遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 批次受理成功时返回，遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 批次受理成功时返回，遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 批次最近一次更新时间，遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 批次最近一次更新时间，遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 批次最近一次更新时间，遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 批次最近一次更新时间，遵循rfc3339标准格式。格式为YYYY-MM-DDTHH:mm:ss.sss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示北京时间2015年05月20日13点29分35秒。
示例值：2015-05-20T13:29:35.120+08:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 转账成功金额。
转账成功的金额，单位为分，可能随时变化。
示例值：4000000
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessAmount 转账成功金额。
转账成功的金额，单位为分，可能随时变化。
示例值：4000000
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessAmount() {
        return this.SuccessAmount;
    }

    /**
     * Set 转账成功金额。
转账成功的金额，单位为分，可能随时变化。
示例值：4000000
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessAmount 转账成功金额。
转账成功的金额，单位为分，可能随时变化。
示例值：4000000
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessAmount(Long SuccessAmount) {
        this.SuccessAmount = SuccessAmount;
    }

    /**
     * Get 转账成功的笔数。
可能随时变化。
示例值：200
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessNum 转账成功的笔数。
可能随时变化。
示例值：200
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessNum() {
        return this.SuccessNum;
    }

    /**
     * Set 转账成功的笔数。
可能随时变化。
示例值：200
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessNum 转账成功的笔数。
可能随时变化。
示例值：200
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessNum(Long SuccessNum) {
        this.SuccessNum = SuccessNum;
    }

    /**
     * Get 转账失败金额。
转账失败的金额，单位为分，可能随时变化。
示例值：4000000
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailAmount 转账失败金额。
转账失败的金额，单位为分，可能随时变化。
示例值：4000000
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailAmount() {
        return this.FailAmount;
    }

    /**
     * Set 转账失败金额。
转账失败的金额，单位为分，可能随时变化。
示例值：4000000
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailAmount 转账失败金额。
转账失败的金额，单位为分，可能随时变化。
示例值：4000000
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailAmount(Long FailAmount) {
        this.FailAmount = FailAmount;
    }

    /**
     * Get 转账失败笔数。
可能随时变化。
示例值：200
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailNum 转账失败笔数。
可能随时变化。
示例值：200
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailNum() {
        return this.FailNum;
    }

    /**
     * Set 转账失败笔数。
可能随时变化。
示例值：200
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailNum 转账失败笔数。
可能随时变化。
示例值：200
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailNum(Long FailNum) {
        this.FailNum = FailNum;
    }

    /**
     * Get 转账明细列表。
返回明细详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransferDetails 转账明细列表。
返回明细详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TransferDetailResponse [] getTransferDetails() {
        return this.TransferDetails;
    }

    /**
     * Set 转账明细列表。
返回明细详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransferDetails 转账明细列表。
返回明细详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransferDetails(TransferDetailResponse [] TransferDetails) {
        this.TransferDetails = TransferDetails;
    }

    /**
     * Get 批次类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchType 批次类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBatchType() {
        return this.BatchType;
    }

    /**
     * Set 批次类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchType 批次类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchType(String BatchType) {
        this.BatchType = BatchType;
    }

    /**
     * Get 批次名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchName 批次名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBatchName() {
        return this.BatchName;
    }

    /**
     * Set 批次名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchName 批次名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchName(String BatchName) {
        this.BatchName = BatchName;
    }

    /**
     * Get 批次标注。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchRemark 批次标注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBatchRemark() {
        return this.BatchRemark;
    }

    /**
     * Set 批次标注。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchRemark 批次标注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchRemark(String BatchRemark) {
        this.BatchRemark = BatchRemark;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public QueryTransferBatchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryTransferBatchResponse(QueryTransferBatchResponse source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.MerchantBatchNo != null) {
            this.MerchantBatchNo = new String(source.MerchantBatchNo);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.MerchantAppId != null) {
            this.MerchantAppId = new String(source.MerchantAppId);
        }
        if (source.BatchStatus != null) {
            this.BatchStatus = new String(source.BatchStatus);
        }
        if (source.CloseReason != null) {
            this.CloseReason = new String(source.CloseReason);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new Long(source.TotalAmount);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.SuccessAmount != null) {
            this.SuccessAmount = new Long(source.SuccessAmount);
        }
        if (source.SuccessNum != null) {
            this.SuccessNum = new Long(source.SuccessNum);
        }
        if (source.FailAmount != null) {
            this.FailAmount = new Long(source.FailAmount);
        }
        if (source.FailNum != null) {
            this.FailNum = new Long(source.FailNum);
        }
        if (source.TransferDetails != null) {
            this.TransferDetails = new TransferDetailResponse[source.TransferDetails.length];
            for (int i = 0; i < source.TransferDetails.length; i++) {
                this.TransferDetails[i] = new TransferDetailResponse(source.TransferDetails[i]);
            }
        }
        if (source.BatchType != null) {
            this.BatchType = new String(source.BatchType);
        }
        if (source.BatchName != null) {
            this.BatchName = new String(source.BatchName);
        }
        if (source.BatchRemark != null) {
            this.BatchRemark = new String(source.BatchRemark);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "MerchantBatchNo", this.MerchantBatchNo);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "MerchantAppId", this.MerchantAppId);
        this.setParamSimple(map, prefix + "BatchStatus", this.BatchStatus);
        this.setParamSimple(map, prefix + "CloseReason", this.CloseReason);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SuccessAmount", this.SuccessAmount);
        this.setParamSimple(map, prefix + "SuccessNum", this.SuccessNum);
        this.setParamSimple(map, prefix + "FailAmount", this.FailAmount);
        this.setParamSimple(map, prefix + "FailNum", this.FailNum);
        this.setParamArrayObj(map, prefix + "TransferDetails.", this.TransferDetails);
        this.setParamSimple(map, prefix + "BatchType", this.BatchType);
        this.setParamSimple(map, prefix + "BatchName", this.BatchName);
        this.setParamSimple(map, prefix + "BatchRemark", this.BatchRemark);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

