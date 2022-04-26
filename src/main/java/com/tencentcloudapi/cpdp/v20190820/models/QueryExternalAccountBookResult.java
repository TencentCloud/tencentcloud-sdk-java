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

public class QueryExternalAccountBookResult extends AbstractModel{

    /**
    * 渠道记账本ID
    */
    @SerializedName("ChannelAccountBookId")
    @Expose
    private String ChannelAccountBookId;

    /**
    * 可用余额。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableBalance")
    @Expose
    private String AvailableBalance;

    /**
    * 电子记账本对外收款的账户信息。为JSON格式字符串（成功状态下返回）。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectMoneyAccountInfo")
    @Expose
    private String CollectMoneyAccountInfo;

    /**
     * Get 渠道记账本ID 
     * @return ChannelAccountBookId 渠道记账本ID
     */
    public String getChannelAccountBookId() {
        return this.ChannelAccountBookId;
    }

    /**
     * Set 渠道记账本ID
     * @param ChannelAccountBookId 渠道记账本ID
     */
    public void setChannelAccountBookId(String ChannelAccountBookId) {
        this.ChannelAccountBookId = ChannelAccountBookId;
    }

    /**
     * Get 可用余额。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableBalance 可用余额。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvailableBalance() {
        return this.AvailableBalance;
    }

    /**
     * Set 可用余额。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableBalance 可用余额。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableBalance(String AvailableBalance) {
        this.AvailableBalance = AvailableBalance;
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

    public QueryExternalAccountBookResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryExternalAccountBookResult(QueryExternalAccountBookResult source) {
        if (source.ChannelAccountBookId != null) {
            this.ChannelAccountBookId = new String(source.ChannelAccountBookId);
        }
        if (source.AvailableBalance != null) {
            this.AvailableBalance = new String(source.AvailableBalance);
        }
        if (source.CollectMoneyAccountInfo != null) {
            this.CollectMoneyAccountInfo = new String(source.CollectMoneyAccountInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelAccountBookId", this.ChannelAccountBookId);
        this.setParamSimple(map, prefix + "AvailableBalance", this.AvailableBalance);
        this.setParamSimple(map, prefix + "CollectMoneyAccountInfo", this.CollectMoneyAccountInfo);

    }
}

