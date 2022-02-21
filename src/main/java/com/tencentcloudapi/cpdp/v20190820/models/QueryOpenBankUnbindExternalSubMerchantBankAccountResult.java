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

public class QueryOpenBankUnbindExternalSubMerchantBankAccountResult extends AbstractModel{

    /**
    * 渠道申请编号。
    */
    @SerializedName("ChannelApplyId")
    @Expose
    private String ChannelApplyId;

    /**
    * 解绑状态。
__SUCCESS__: 解绑成功
__FAILED__: 解绑失败
__PROCESSING__: 解绑中
    */
    @SerializedName("UnbindStatus")
    @Expose
    private String UnbindStatus;

    /**
    * 解绑返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnbindMessage")
    @Expose
    private String UnbindMessage;

    /**
     * Get 渠道申请编号。 
     * @return ChannelApplyId 渠道申请编号。
     */
    public String getChannelApplyId() {
        return this.ChannelApplyId;
    }

    /**
     * Set 渠道申请编号。
     * @param ChannelApplyId 渠道申请编号。
     */
    public void setChannelApplyId(String ChannelApplyId) {
        this.ChannelApplyId = ChannelApplyId;
    }

    /**
     * Get 解绑状态。
__SUCCESS__: 解绑成功
__FAILED__: 解绑失败
__PROCESSING__: 解绑中 
     * @return UnbindStatus 解绑状态。
__SUCCESS__: 解绑成功
__FAILED__: 解绑失败
__PROCESSING__: 解绑中
     */
    public String getUnbindStatus() {
        return this.UnbindStatus;
    }

    /**
     * Set 解绑状态。
__SUCCESS__: 解绑成功
__FAILED__: 解绑失败
__PROCESSING__: 解绑中
     * @param UnbindStatus 解绑状态。
__SUCCESS__: 解绑成功
__FAILED__: 解绑失败
__PROCESSING__: 解绑中
     */
    public void setUnbindStatus(String UnbindStatus) {
        this.UnbindStatus = UnbindStatus;
    }

    /**
     * Get 解绑返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnbindMessage 解绑返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnbindMessage() {
        return this.UnbindMessage;
    }

    /**
     * Set 解绑返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnbindMessage 解绑返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnbindMessage(String UnbindMessage) {
        this.UnbindMessage = UnbindMessage;
    }

    public QueryOpenBankUnbindExternalSubMerchantBankAccountResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankUnbindExternalSubMerchantBankAccountResult(QueryOpenBankUnbindExternalSubMerchantBankAccountResult source) {
        if (source.ChannelApplyId != null) {
            this.ChannelApplyId = new String(source.ChannelApplyId);
        }
        if (source.UnbindStatus != null) {
            this.UnbindStatus = new String(source.UnbindStatus);
        }
        if (source.UnbindMessage != null) {
            this.UnbindMessage = new String(source.UnbindMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelApplyId", this.ChannelApplyId);
        this.setParamSimple(map, prefix + "UnbindStatus", this.UnbindStatus);
        this.setParamSimple(map, prefix + "UnbindMessage", this.UnbindMessage);

    }
}

