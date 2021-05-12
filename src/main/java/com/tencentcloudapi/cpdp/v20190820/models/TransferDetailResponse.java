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

public class TransferDetailResponse extends AbstractModel{

    /**
    * 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013
    */
    @SerializedName("MerchantDetailNo")
    @Expose
    private String MerchantDetailNo;

    /**
    * 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001
    */
    @SerializedName("DetailId")
    @Expose
    private String DetailId;

    /**
    * 明细状态。
PROCESSING：转账中，正在处理，结果未明；
SUCCESS：转账成功；
FAIL：转账失败，需要确认失败原因以后，再决定是否重新发起地该笔明细的转账。
示例值：SUCCESS
    */
    @SerializedName("DetailStatus")
    @Expose
    private String DetailStatus;

    /**
     * Get 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013 
     * @return MerchantDetailNo 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013
     */
    public String getMerchantDetailNo() {
        return this.MerchantDetailNo;
    }

    /**
     * Set 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013
     * @param MerchantDetailNo 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013
     */
    public void setMerchantDetailNo(String MerchantDetailNo) {
        this.MerchantDetailNo = MerchantDetailNo;
    }

    /**
     * Get 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001 
     * @return DetailId 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     */
    public String getDetailId() {
        return this.DetailId;
    }

    /**
     * Set 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     * @param DetailId 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     */
    public void setDetailId(String DetailId) {
        this.DetailId = DetailId;
    }

    /**
     * Get 明细状态。
PROCESSING：转账中，正在处理，结果未明；
SUCCESS：转账成功；
FAIL：转账失败，需要确认失败原因以后，再决定是否重新发起地该笔明细的转账。
示例值：SUCCESS 
     * @return DetailStatus 明细状态。
PROCESSING：转账中，正在处理，结果未明；
SUCCESS：转账成功；
FAIL：转账失败，需要确认失败原因以后，再决定是否重新发起地该笔明细的转账。
示例值：SUCCESS
     */
    public String getDetailStatus() {
        return this.DetailStatus;
    }

    /**
     * Set 明细状态。
PROCESSING：转账中，正在处理，结果未明；
SUCCESS：转账成功；
FAIL：转账失败，需要确认失败原因以后，再决定是否重新发起地该笔明细的转账。
示例值：SUCCESS
     * @param DetailStatus 明细状态。
PROCESSING：转账中，正在处理，结果未明；
SUCCESS：转账成功；
FAIL：转账失败，需要确认失败原因以后，再决定是否重新发起地该笔明细的转账。
示例值：SUCCESS
     */
    public void setDetailStatus(String DetailStatus) {
        this.DetailStatus = DetailStatus;
    }

    public TransferDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransferDetailResponse(TransferDetailResponse source) {
        if (source.MerchantDetailNo != null) {
            this.MerchantDetailNo = new String(source.MerchantDetailNo);
        }
        if (source.DetailId != null) {
            this.DetailId = new String(source.DetailId);
        }
        if (source.DetailStatus != null) {
            this.DetailStatus = new String(source.DetailStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantDetailNo", this.MerchantDetailNo);
        this.setParamSimple(map, prefix + "DetailId", this.DetailId);
        this.setParamSimple(map, prefix + "DetailStatus", this.DetailStatus);

    }
}

