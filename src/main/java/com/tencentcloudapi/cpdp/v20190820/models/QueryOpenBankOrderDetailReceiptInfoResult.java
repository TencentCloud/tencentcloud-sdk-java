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

public class QueryOpenBankOrderDetailReceiptInfoResult extends AbstractModel{

    /**
    * 渠道回单申请ID
    */
    @SerializedName("ChannelApplyId")
    @Expose
    private String ChannelApplyId;

    /**
    * 申请状态。
SUCCESS：申请成功；
FAILED：申请失败；
PROCESSING：申请中。
注意：若返回申请中，需要再次调用回单申请结果查询接口，查询结果。
    */
    @SerializedName("ReceiptStatus")
    @Expose
    private String ReceiptStatus;

    /**
    * 申请返回描述，例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiptMessage")
    @Expose
    private String ReceiptMessage;

    /**
    * 回单下载链接，申请成功时返回。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 过期时间，yyyy-MM-dd HH:mm:ss格式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get 渠道回单申请ID 
     * @return ChannelApplyId 渠道回单申请ID
     */
    public String getChannelApplyId() {
        return this.ChannelApplyId;
    }

    /**
     * Set 渠道回单申请ID
     * @param ChannelApplyId 渠道回单申请ID
     */
    public void setChannelApplyId(String ChannelApplyId) {
        this.ChannelApplyId = ChannelApplyId;
    }

    /**
     * Get 申请状态。
SUCCESS：申请成功；
FAILED：申请失败；
PROCESSING：申请中。
注意：若返回申请中，需要再次调用回单申请结果查询接口，查询结果。 
     * @return ReceiptStatus 申请状态。
SUCCESS：申请成功；
FAILED：申请失败；
PROCESSING：申请中。
注意：若返回申请中，需要再次调用回单申请结果查询接口，查询结果。
     */
    public String getReceiptStatus() {
        return this.ReceiptStatus;
    }

    /**
     * Set 申请状态。
SUCCESS：申请成功；
FAILED：申请失败；
PROCESSING：申请中。
注意：若返回申请中，需要再次调用回单申请结果查询接口，查询结果。
     * @param ReceiptStatus 申请状态。
SUCCESS：申请成功；
FAILED：申请失败；
PROCESSING：申请中。
注意：若返回申请中，需要再次调用回单申请结果查询接口，查询结果。
     */
    public void setReceiptStatus(String ReceiptStatus) {
        this.ReceiptStatus = ReceiptStatus;
    }

    /**
     * Get 申请返回描述，例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiptMessage 申请返回描述，例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReceiptMessage() {
        return this.ReceiptMessage;
    }

    /**
     * Set 申请返回描述，例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiptMessage 申请返回描述，例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiptMessage(String ReceiptMessage) {
        this.ReceiptMessage = ReceiptMessage;
    }

    /**
     * Get 回单下载链接，申请成功时返回。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownloadUrl 回单下载链接，申请成功时返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 回单下载链接，申请成功时返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownloadUrl 回单下载链接，申请成功时返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 过期时间，yyyy-MM-dd HH:mm:ss格式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间，yyyy-MM-dd HH:mm:ss格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，yyyy-MM-dd HH:mm:ss格式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间，yyyy-MM-dd HH:mm:ss格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public QueryOpenBankOrderDetailReceiptInfoResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankOrderDetailReceiptInfoResult(QueryOpenBankOrderDetailReceiptInfoResult source) {
        if (source.ChannelApplyId != null) {
            this.ChannelApplyId = new String(source.ChannelApplyId);
        }
        if (source.ReceiptStatus != null) {
            this.ReceiptStatus = new String(source.ReceiptStatus);
        }
        if (source.ReceiptMessage != null) {
            this.ReceiptMessage = new String(source.ReceiptMessage);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelApplyId", this.ChannelApplyId);
        this.setParamSimple(map, prefix + "ReceiptStatus", this.ReceiptStatus);
        this.setParamSimple(map, prefix + "ReceiptMessage", this.ReceiptMessage);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

