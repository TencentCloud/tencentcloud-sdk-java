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

public class MigrateOrderRefundResponse extends AbstractModel{

    /**
    * 请求成功状态
    */
    @SerializedName("IsSuccess")
    @Expose
    private Boolean IsSuccess;

    /**
    * 退款流水号
    */
    @SerializedName("TradeSerialNo")
    @Expose
    private String TradeSerialNo;

    /**
    * 交易备注
    */
    @SerializedName("TradeMsg")
    @Expose
    private String TradeMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 请求成功状态 
     * @return IsSuccess 请求成功状态
     */
    public Boolean getIsSuccess() {
        return this.IsSuccess;
    }

    /**
     * Set 请求成功状态
     * @param IsSuccess 请求成功状态
     */
    public void setIsSuccess(Boolean IsSuccess) {
        this.IsSuccess = IsSuccess;
    }

    /**
     * Get 退款流水号 
     * @return TradeSerialNo 退款流水号
     */
    public String getTradeSerialNo() {
        return this.TradeSerialNo;
    }

    /**
     * Set 退款流水号
     * @param TradeSerialNo 退款流水号
     */
    public void setTradeSerialNo(String TradeSerialNo) {
        this.TradeSerialNo = TradeSerialNo;
    }

    /**
     * Get 交易备注 
     * @return TradeMsg 交易备注
     */
    public String getTradeMsg() {
        return this.TradeMsg;
    }

    /**
     * Set 交易备注
     * @param TradeMsg 交易备注
     */
    public void setTradeMsg(String TradeMsg) {
        this.TradeMsg = TradeMsg;
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

    public MigrateOrderRefundResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateOrderRefundResponse(MigrateOrderRefundResponse source) {
        if (source.IsSuccess != null) {
            this.IsSuccess = new Boolean(source.IsSuccess);
        }
        if (source.TradeSerialNo != null) {
            this.TradeSerialNo = new String(source.TradeSerialNo);
        }
        if (source.TradeMsg != null) {
            this.TradeMsg = new String(source.TradeMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSuccess", this.IsSuccess);
        this.setParamSimple(map, prefix + "TradeSerialNo", this.TradeSerialNo);
        this.setParamSimple(map, prefix + "TradeMsg", this.TradeMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

