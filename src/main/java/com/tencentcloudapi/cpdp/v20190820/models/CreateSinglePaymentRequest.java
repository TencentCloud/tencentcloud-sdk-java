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

public class CreateSinglePaymentRequest extends AbstractModel{

    /**
    * 转账类型
    */
    @SerializedName("TransferType")
    @Expose
    private Long TransferType;

    /**
    * 订单流水号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 转账金额
    */
    @SerializedName("TransferAmount")
    @Expose
    private Long TransferAmount;

    /**
    * 主播ID（与主播业务ID不能同时为空，两者都填取主播ID）
    */
    @SerializedName("AnchorId")
    @Expose
    private String AnchorId;

    /**
    * 请求预留字段，原样透传返回
    */
    @SerializedName("ReqReserved")
    @Expose
    private String ReqReserved;

    /**
    * 业务备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 主播名称。如果该字段填入，则会对AnchorName和AnchorId/Uid进行校验。
    */
    @SerializedName("AnchorName")
    @Expose
    private String AnchorName;

    /**
    * 主播业务ID（与主播ID不能同时为空，两者都填取主播ID）
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 转账结果回调通知URL。若不填，则不进行回调。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
     * Get 转账类型 
     * @return TransferType 转账类型
     */
    public Long getTransferType() {
        return this.TransferType;
    }

    /**
     * Set 转账类型
     * @param TransferType 转账类型
     */
    public void setTransferType(Long TransferType) {
        this.TransferType = TransferType;
    }

    /**
     * Get 订单流水号 
     * @return OrderId 订单流水号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单流水号
     * @param OrderId 订单流水号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 转账金额 
     * @return TransferAmount 转账金额
     */
    public Long getTransferAmount() {
        return this.TransferAmount;
    }

    /**
     * Set 转账金额
     * @param TransferAmount 转账金额
     */
    public void setTransferAmount(Long TransferAmount) {
        this.TransferAmount = TransferAmount;
    }

    /**
     * Get 主播ID（与主播业务ID不能同时为空，两者都填取主播ID） 
     * @return AnchorId 主播ID（与主播业务ID不能同时为空，两者都填取主播ID）
     */
    public String getAnchorId() {
        return this.AnchorId;
    }

    /**
     * Set 主播ID（与主播业务ID不能同时为空，两者都填取主播ID）
     * @param AnchorId 主播ID（与主播业务ID不能同时为空，两者都填取主播ID）
     */
    public void setAnchorId(String AnchorId) {
        this.AnchorId = AnchorId;
    }

    /**
     * Get 请求预留字段，原样透传返回 
     * @return ReqReserved 请求预留字段，原样透传返回
     */
    public String getReqReserved() {
        return this.ReqReserved;
    }

    /**
     * Set 请求预留字段，原样透传返回
     * @param ReqReserved 请求预留字段，原样透传返回
     */
    public void setReqReserved(String ReqReserved) {
        this.ReqReserved = ReqReserved;
    }

    /**
     * Get 业务备注 
     * @return Remark 业务备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 业务备注
     * @param Remark 业务备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 主播名称。如果该字段填入，则会对AnchorName和AnchorId/Uid进行校验。 
     * @return AnchorName 主播名称。如果该字段填入，则会对AnchorName和AnchorId/Uid进行校验。
     */
    public String getAnchorName() {
        return this.AnchorName;
    }

    /**
     * Set 主播名称。如果该字段填入，则会对AnchorName和AnchorId/Uid进行校验。
     * @param AnchorName 主播名称。如果该字段填入，则会对AnchorName和AnchorId/Uid进行校验。
     */
    public void setAnchorName(String AnchorName) {
        this.AnchorName = AnchorName;
    }

    /**
     * Get 主播业务ID（与主播ID不能同时为空，两者都填取主播ID） 
     * @return Uid 主播业务ID（与主播ID不能同时为空，两者都填取主播ID）
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 主播业务ID（与主播ID不能同时为空，两者都填取主播ID）
     * @param Uid 主播业务ID（与主播ID不能同时为空，两者都填取主播ID）
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 转账结果回调通知URL。若不填，则不进行回调。 
     * @return NotifyUrl 转账结果回调通知URL。若不填，则不进行回调。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 转账结果回调通知URL。若不填，则不进行回调。
     * @param NotifyUrl 转账结果回调通知URL。若不填，则不进行回调。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    public CreateSinglePaymentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSinglePaymentRequest(CreateSinglePaymentRequest source) {
        if (source.TransferType != null) {
            this.TransferType = new Long(source.TransferType);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.TransferAmount != null) {
            this.TransferAmount = new Long(source.TransferAmount);
        }
        if (source.AnchorId != null) {
            this.AnchorId = new String(source.AnchorId);
        }
        if (source.ReqReserved != null) {
            this.ReqReserved = new String(source.ReqReserved);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AnchorName != null) {
            this.AnchorName = new String(source.AnchorName);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransferType", this.TransferType);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "TransferAmount", this.TransferAmount);
        this.setParamSimple(map, prefix + "AnchorId", this.AnchorId);
        this.setParamSimple(map, prefix + "ReqReserved", this.ReqReserved);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AnchorName", this.AnchorName);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);

    }
}

