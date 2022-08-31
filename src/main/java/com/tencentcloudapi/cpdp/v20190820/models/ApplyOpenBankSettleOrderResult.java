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

public class ApplyOpenBankSettleOrderResult extends AbstractModel{

    /**
    * 外部结算流水号
    */
    @SerializedName("OutSettleId")
    @Expose
    private String OutSettleId;

    /**
    * 渠道结算流水号
    */
    @SerializedName("ChannelSettleId")
    @Expose
    private String ChannelSettleId;

    /**
    * 退款状态。
SUCCESS：结算成功；
FAILED：结算失败；
PROCESSING：结算中;
INIT:初始化;
ACCEPT_FAILED:受理失败,底层银行返回订单不存在
ACCEPTED：受理成功
_UNKNOWN：默认未知
    */
    @SerializedName("SettleStatus")
    @Expose
    private String SettleStatus;

    /**
     * Get 外部结算流水号 
     * @return OutSettleId 外部结算流水号
     */
    public String getOutSettleId() {
        return this.OutSettleId;
    }

    /**
     * Set 外部结算流水号
     * @param OutSettleId 外部结算流水号
     */
    public void setOutSettleId(String OutSettleId) {
        this.OutSettleId = OutSettleId;
    }

    /**
     * Get 渠道结算流水号 
     * @return ChannelSettleId 渠道结算流水号
     */
    public String getChannelSettleId() {
        return this.ChannelSettleId;
    }

    /**
     * Set 渠道结算流水号
     * @param ChannelSettleId 渠道结算流水号
     */
    public void setChannelSettleId(String ChannelSettleId) {
        this.ChannelSettleId = ChannelSettleId;
    }

    /**
     * Get 退款状态。
SUCCESS：结算成功；
FAILED：结算失败；
PROCESSING：结算中;
INIT:初始化;
ACCEPT_FAILED:受理失败,底层银行返回订单不存在
ACCEPTED：受理成功
_UNKNOWN：默认未知 
     * @return SettleStatus 退款状态。
SUCCESS：结算成功；
FAILED：结算失败；
PROCESSING：结算中;
INIT:初始化;
ACCEPT_FAILED:受理失败,底层银行返回订单不存在
ACCEPTED：受理成功
_UNKNOWN：默认未知
     */
    public String getSettleStatus() {
        return this.SettleStatus;
    }

    /**
     * Set 退款状态。
SUCCESS：结算成功；
FAILED：结算失败；
PROCESSING：结算中;
INIT:初始化;
ACCEPT_FAILED:受理失败,底层银行返回订单不存在
ACCEPTED：受理成功
_UNKNOWN：默认未知
     * @param SettleStatus 退款状态。
SUCCESS：结算成功；
FAILED：结算失败；
PROCESSING：结算中;
INIT:初始化;
ACCEPT_FAILED:受理失败,底层银行返回订单不存在
ACCEPTED：受理成功
_UNKNOWN：默认未知
     */
    public void setSettleStatus(String SettleStatus) {
        this.SettleStatus = SettleStatus;
    }

    public ApplyOpenBankSettleOrderResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyOpenBankSettleOrderResult(ApplyOpenBankSettleOrderResult source) {
        if (source.OutSettleId != null) {
            this.OutSettleId = new String(source.OutSettleId);
        }
        if (source.ChannelSettleId != null) {
            this.ChannelSettleId = new String(source.ChannelSettleId);
        }
        if (source.SettleStatus != null) {
            this.SettleStatus = new String(source.SettleStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutSettleId", this.OutSettleId);
        this.setParamSimple(map, prefix + "ChannelSettleId", this.ChannelSettleId);
        this.setParamSimple(map, prefix + "SettleStatus", this.SettleStatus);

    }
}

