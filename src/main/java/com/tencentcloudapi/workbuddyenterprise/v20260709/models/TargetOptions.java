/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetOptions extends AbstractModel {

    /**
    * <p>渠道类型（BOT_CHANNEL 必填）：FEISHU / DINGTALK / QQ / WECOM_NEW / WECOM_AIBOT / WECHAT_KF</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelType")
    @Expose
    private String ChannelType;

    /**
    * <p>渠道标识（BOT_CHANNEL 必填）：飞书 appId / 钉钉 appKey / QQ appId / 企微 corpId:agentId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>回调 URL（WEBHOOK 必填）：仅允许 http/https，禁止内网地址（SSRF 防护）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>自定义请求头列表，与默认 Content-Type: application/json 合并</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Headers")
    @Expose
    private Header [] Headers;

    /**
    * <p>HMAC-SHA256 签名密钥（WEBHOOK 可选）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Secret")
    @Expose
    private String Secret;

    /**
    * <p>接收目标 ID 集合（群 ID / 用户 ID / 频道 ID），BOT_CHANNEL 模式必填，至少一个</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecipientIdSet")
    @Expose
    private String [] RecipientIdSet;

    /**
     * Get <p>渠道类型（BOT_CHANNEL 必填）：FEISHU / DINGTALK / QQ / WECOM_NEW / WECOM_AIBOT / WECHAT_KF</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelType <p>渠道类型（BOT_CHANNEL 必填）：FEISHU / DINGTALK / QQ / WECOM_NEW / WECOM_AIBOT / WECHAT_KF</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelType() {
        return this.ChannelType;
    }

    /**
     * Set <p>渠道类型（BOT_CHANNEL 必填）：FEISHU / DINGTALK / QQ / WECOM_NEW / WECOM_AIBOT / WECHAT_KF</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelType <p>渠道类型（BOT_CHANNEL 必填）：FEISHU / DINGTALK / QQ / WECOM_NEW / WECOM_AIBOT / WECHAT_KF</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelType(String ChannelType) {
        this.ChannelType = ChannelType;
    }

    /**
     * Get <p>渠道标识（BOT_CHANNEL 必填）：飞书 appId / 钉钉 appKey / QQ appId / 企微 corpId:agentId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelId <p>渠道标识（BOT_CHANNEL 必填）：飞书 appId / 钉钉 appKey / QQ appId / 企微 corpId:agentId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>渠道标识（BOT_CHANNEL 必填）：飞书 appId / 钉钉 appKey / QQ appId / 企微 corpId:agentId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelId <p>渠道标识（BOT_CHANNEL 必填）：飞书 appId / 钉钉 appKey / QQ appId / 企微 corpId:agentId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>回调 URL（WEBHOOK 必填）：仅允许 http/https，禁止内网地址（SSRF 防护）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url <p>回调 URL（WEBHOOK 必填）：仅允许 http/https，禁止内网地址（SSRF 防护）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>回调 URL（WEBHOOK 必填）：仅允许 http/https，禁止内网地址（SSRF 防护）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url <p>回调 URL（WEBHOOK 必填）：仅允许 http/https，禁止内网地址（SSRF 防护）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>自定义请求头列表，与默认 Content-Type: application/json 合并</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Headers <p>自定义请求头列表，与默认 Content-Type: application/json 合并</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Header [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set <p>自定义请求头列表，与默认 Content-Type: application/json 合并</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Headers <p>自定义请求头列表，与默认 Content-Type: application/json 合并</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaders(Header [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get <p>HMAC-SHA256 签名密钥（WEBHOOK 可选）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Secret <p>HMAC-SHA256 签名密钥（WEBHOOK 可选）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecret() {
        return this.Secret;
    }

    /**
     * Set <p>HMAC-SHA256 签名密钥（WEBHOOK 可选）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Secret <p>HMAC-SHA256 签名密钥（WEBHOOK 可选）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecret(String Secret) {
        this.Secret = Secret;
    }

    /**
     * Get <p>接收目标 ID 集合（群 ID / 用户 ID / 频道 ID），BOT_CHANNEL 模式必填，至少一个</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecipientIdSet <p>接收目标 ID 集合（群 ID / 用户 ID / 频道 ID），BOT_CHANNEL 模式必填，至少一个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRecipientIdSet() {
        return this.RecipientIdSet;
    }

    /**
     * Set <p>接收目标 ID 集合（群 ID / 用户 ID / 频道 ID），BOT_CHANNEL 模式必填，至少一个</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecipientIdSet <p>接收目标 ID 集合（群 ID / 用户 ID / 频道 ID），BOT_CHANNEL 模式必填，至少一个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecipientIdSet(String [] RecipientIdSet) {
        this.RecipientIdSet = RecipientIdSet;
    }

    public TargetOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetOptions(TargetOptions source) {
        if (source.ChannelType != null) {
            this.ChannelType = new String(source.ChannelType);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Headers != null) {
            this.Headers = new Header[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new Header(source.Headers[i]);
            }
        }
        if (source.Secret != null) {
            this.Secret = new String(source.Secret);
        }
        if (source.RecipientIdSet != null) {
            this.RecipientIdSet = new String[source.RecipientIdSet.length];
            for (int i = 0; i < source.RecipientIdSet.length; i++) {
                this.RecipientIdSet[i] = new String(source.RecipientIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelType", this.ChannelType);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "Secret", this.Secret);
        this.setParamArraySimple(map, prefix + "RecipientIdSet.", this.RecipientIdSet);

    }
}

