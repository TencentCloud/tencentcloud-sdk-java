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

public class CreateExternalAccountBookResult extends AbstractModel{

    /**
    * 处理状态。
__SUCCESS__: 成功
__FAILED__: 失败
__PROCESSING__: 进行中。
    */
    @SerializedName("DealStatus")
    @Expose
    private String DealStatus;

    /**
    * 处理返回描述，例如失败原因等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealMessage")
    @Expose
    private String DealMessage;

    /**
    * 渠道电子记账本ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelAccountBookId")
    @Expose
    private String ChannelAccountBookId;

    /**
    * 电子记账本对外收款的账户信息。为JSON格式字符串（成功状态下返回）。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectMoneyAccountInfo")
    @Expose
    private String CollectMoneyAccountInfo;

    /**
     * Get 处理状态。
__SUCCESS__: 成功
__FAILED__: 失败
__PROCESSING__: 进行中。 
     * @return DealStatus 处理状态。
__SUCCESS__: 成功
__FAILED__: 失败
__PROCESSING__: 进行中。
     */
    public String getDealStatus() {
        return this.DealStatus;
    }

    /**
     * Set 处理状态。
__SUCCESS__: 成功
__FAILED__: 失败
__PROCESSING__: 进行中。
     * @param DealStatus 处理状态。
__SUCCESS__: 成功
__FAILED__: 失败
__PROCESSING__: 进行中。
     */
    public void setDealStatus(String DealStatus) {
        this.DealStatus = DealStatus;
    }

    /**
     * Get 处理返回描述，例如失败原因等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealMessage 处理返回描述，例如失败原因等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDealMessage() {
        return this.DealMessage;
    }

    /**
     * Set 处理返回描述，例如失败原因等
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealMessage 处理返回描述，例如失败原因等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealMessage(String DealMessage) {
        this.DealMessage = DealMessage;
    }

    /**
     * Get 渠道电子记账本ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelAccountBookId 渠道电子记账本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelAccountBookId() {
        return this.ChannelAccountBookId;
    }

    /**
     * Set 渠道电子记账本ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelAccountBookId 渠道电子记账本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelAccountBookId(String ChannelAccountBookId) {
        this.ChannelAccountBookId = ChannelAccountBookId;
    }

    /**
     * Get 电子记账本对外收款的账户信息。为JSON格式字符串（成功状态下返回）。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CollectMoneyAccountInfo 电子记账本对外收款的账户信息。为JSON格式字符串（成功状态下返回）。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCollectMoneyAccountInfo() {
        return this.CollectMoneyAccountInfo;
    }

    /**
     * Set 电子记账本对外收款的账户信息。为JSON格式字符串（成功状态下返回）。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CollectMoneyAccountInfo 电子记账本对外收款的账户信息。为JSON格式字符串（成功状态下返回）。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollectMoneyAccountInfo(String CollectMoneyAccountInfo) {
        this.CollectMoneyAccountInfo = CollectMoneyAccountInfo;
    }

    public CreateExternalAccountBookResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExternalAccountBookResult(CreateExternalAccountBookResult source) {
        if (source.DealStatus != null) {
            this.DealStatus = new String(source.DealStatus);
        }
        if (source.DealMessage != null) {
            this.DealMessage = new String(source.DealMessage);
        }
        if (source.ChannelAccountBookId != null) {
            this.ChannelAccountBookId = new String(source.ChannelAccountBookId);
        }
        if (source.CollectMoneyAccountInfo != null) {
            this.CollectMoneyAccountInfo = new String(source.CollectMoneyAccountInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealStatus", this.DealStatus);
        this.setParamSimple(map, prefix + "DealMessage", this.DealMessage);
        this.setParamSimple(map, prefix + "ChannelAccountBookId", this.ChannelAccountBookId);
        this.setParamSimple(map, prefix + "CollectMoneyAccountInfo", this.CollectMoneyAccountInfo);

    }
}

