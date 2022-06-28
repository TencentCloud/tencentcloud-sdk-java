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

public class CreateOpenBankSubMerchantRateConfigureResult extends AbstractModel{

    /**
    * 处理状态 
SUCCESS: 开通成功 
FAILED: 开通失败
PROCESSING: 开通中 
注意：若返回开通中，需要再次调用费率配置结果查询接口，查询结果。
    */
    @SerializedName("DealStatus")
    @Expose
    private String DealStatus;

    /**
    * 处理描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealMessage")
    @Expose
    private String DealMessage;

    /**
    * 渠道产品费率序列号
    */
    @SerializedName("ChannelProductFeeNo")
    @Expose
    private String ChannelProductFeeNo;

    /**
     * Get 处理状态 
SUCCESS: 开通成功 
FAILED: 开通失败
PROCESSING: 开通中 
注意：若返回开通中，需要再次调用费率配置结果查询接口，查询结果。 
     * @return DealStatus 处理状态 
SUCCESS: 开通成功 
FAILED: 开通失败
PROCESSING: 开通中 
注意：若返回开通中，需要再次调用费率配置结果查询接口，查询结果。
     */
    public String getDealStatus() {
        return this.DealStatus;
    }

    /**
     * Set 处理状态 
SUCCESS: 开通成功 
FAILED: 开通失败
PROCESSING: 开通中 
注意：若返回开通中，需要再次调用费率配置结果查询接口，查询结果。
     * @param DealStatus 处理状态 
SUCCESS: 开通成功 
FAILED: 开通失败
PROCESSING: 开通中 
注意：若返回开通中，需要再次调用费率配置结果查询接口，查询结果。
     */
    public void setDealStatus(String DealStatus) {
        this.DealStatus = DealStatus;
    }

    /**
     * Get 处理描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealMessage 处理描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDealMessage() {
        return this.DealMessage;
    }

    /**
     * Set 处理描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealMessage 处理描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealMessage(String DealMessage) {
        this.DealMessage = DealMessage;
    }

    /**
     * Get 渠道产品费率序列号 
     * @return ChannelProductFeeNo 渠道产品费率序列号
     */
    public String getChannelProductFeeNo() {
        return this.ChannelProductFeeNo;
    }

    /**
     * Set 渠道产品费率序列号
     * @param ChannelProductFeeNo 渠道产品费率序列号
     */
    public void setChannelProductFeeNo(String ChannelProductFeeNo) {
        this.ChannelProductFeeNo = ChannelProductFeeNo;
    }

    public CreateOpenBankSubMerchantRateConfigureResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpenBankSubMerchantRateConfigureResult(CreateOpenBankSubMerchantRateConfigureResult source) {
        if (source.DealStatus != null) {
            this.DealStatus = new String(source.DealStatus);
        }
        if (source.DealMessage != null) {
            this.DealMessage = new String(source.DealMessage);
        }
        if (source.ChannelProductFeeNo != null) {
            this.ChannelProductFeeNo = new String(source.ChannelProductFeeNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealStatus", this.DealStatus);
        this.setParamSimple(map, prefix + "DealMessage", this.DealMessage);
        this.setParamSimple(map, prefix + "ChannelProductFeeNo", this.ChannelProductFeeNo);

    }
}

