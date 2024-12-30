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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebCallbackInfo extends AbstractModel {

    /**
    * 告警渠道回调配置id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebCallbackId")
    @Expose
    private String WebCallbackId;

    /**
    * 告警渠道回调配置名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 渠道类型

WeCom:企业微信;DingTalk:钉钉;Lark:飞书;Http:自定义回调;
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 回调地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Webhook")
    @Expose
    private String Webhook;

    /**
    * 请求方式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 秘钥信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 主账号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 子账号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
    * 创建时间。秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间。秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 告警渠道回调配置id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebCallbackId 告警渠道回调配置id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebCallbackId() {
        return this.WebCallbackId;
    }

    /**
     * Set 告警渠道回调配置id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebCallbackId 告警渠道回调配置id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebCallbackId(String WebCallbackId) {
        this.WebCallbackId = WebCallbackId;
    }

    /**
     * Get 告警渠道回调配置名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 告警渠道回调配置名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警渠道回调配置名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 告警渠道回调配置名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 渠道类型

WeCom:企业微信;DingTalk:钉钉;Lark:飞书;Http:自定义回调;
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 渠道类型

WeCom:企业微信;DingTalk:钉钉;Lark:飞书;Http:自定义回调;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 渠道类型

WeCom:企业微信;DingTalk:钉钉;Lark:飞书;Http:自定义回调;
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 渠道类型

WeCom:企业微信;DingTalk:钉钉;Lark:飞书;Http:自定义回调;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 回调地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Webhook 回调地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebhook() {
        return this.Webhook;
    }

    /**
     * Set 回调地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Webhook 回调地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebhook(String Webhook) {
        this.Webhook = Webhook;
    }

    /**
     * Get 请求方式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method 请求方式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求方式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method 请求方式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 秘钥信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 秘钥信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 秘钥信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 秘钥信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 主账号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 主账号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 主账号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子账号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubUin 子账号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 子账号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubUin 子账号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 创建时间。秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间。秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间。秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间。秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间。秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间。秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public WebCallbackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebCallbackInfo(WebCallbackInfo source) {
        if (source.WebCallbackId != null) {
            this.WebCallbackId = new String(source.WebCallbackId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Webhook != null) {
            this.Webhook = new String(source.Webhook);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new Long(source.SubUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebCallbackId", this.WebCallbackId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Webhook", this.Webhook);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

