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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamTaskNotifyConfig extends AbstractModel {

    /**
    * 通知类型：
"CMQ"：回调消息写入cmq队列； 
"URL"： 指定URL时HTTP回调推送到 NotifyUrl 指定的地址，回调协议http+json，包体内容同[解析直播事件通知接口](https://cloud.tencent.com/document/product/862/39229) 的输出参数

<font color="red"> 注：不填或为空时默认 CMQ，如需采用其他类型需填写对应类型值。 </font>
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * HTTP回调地址，NotifyType为URL时必填。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * CMQ 的模型，有 Queue 和 Topic 两种，目前仅支持 Queue。
    */
    @SerializedName("CmqModel")
    @Expose
    private String CmqModel;

    /**
    * CMQ 的园区，如 sh，bj 等。
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * 当模型为 Queue 时有效，表示接收事件通知的 CMQ 的队列名。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 当模型为 Topic 时有效，表示接收事件通知的 CMQ 的主题名。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 用于生成回调签名的 Key。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyKey")
    @Expose
    private String NotifyKey;

    /**
     * Get 通知类型：
"CMQ"：回调消息写入cmq队列； 
"URL"： 指定URL时HTTP回调推送到 NotifyUrl 指定的地址，回调协议http+json，包体内容同[解析直播事件通知接口](https://cloud.tencent.com/document/product/862/39229) 的输出参数

<font color="red"> 注：不填或为空时默认 CMQ，如需采用其他类型需填写对应类型值。 </font> 
     * @return NotifyType 通知类型：
"CMQ"：回调消息写入cmq队列； 
"URL"： 指定URL时HTTP回调推送到 NotifyUrl 指定的地址，回调协议http+json，包体内容同[解析直播事件通知接口](https://cloud.tencent.com/document/product/862/39229) 的输出参数

<font color="red"> 注：不填或为空时默认 CMQ，如需采用其他类型需填写对应类型值。 </font>
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set 通知类型：
"CMQ"：回调消息写入cmq队列； 
"URL"： 指定URL时HTTP回调推送到 NotifyUrl 指定的地址，回调协议http+json，包体内容同[解析直播事件通知接口](https://cloud.tencent.com/document/product/862/39229) 的输出参数

<font color="red"> 注：不填或为空时默认 CMQ，如需采用其他类型需填写对应类型值。 </font>
     * @param NotifyType 通知类型：
"CMQ"：回调消息写入cmq队列； 
"URL"： 指定URL时HTTP回调推送到 NotifyUrl 指定的地址，回调协议http+json，包体内容同[解析直播事件通知接口](https://cloud.tencent.com/document/product/862/39229) 的输出参数

<font color="red"> 注：不填或为空时默认 CMQ，如需采用其他类型需填写对应类型值。 </font>
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get HTTP回调地址，NotifyType为URL时必填。 
     * @return NotifyUrl HTTP回调地址，NotifyType为URL时必填。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set HTTP回调地址，NotifyType为URL时必填。
     * @param NotifyUrl HTTP回调地址，NotifyType为URL时必填。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get CMQ 的模型，有 Queue 和 Topic 两种，目前仅支持 Queue。 
     * @return CmqModel CMQ 的模型，有 Queue 和 Topic 两种，目前仅支持 Queue。
     */
    public String getCmqModel() {
        return this.CmqModel;
    }

    /**
     * Set CMQ 的模型，有 Queue 和 Topic 两种，目前仅支持 Queue。
     * @param CmqModel CMQ 的模型，有 Queue 和 Topic 两种，目前仅支持 Queue。
     */
    public void setCmqModel(String CmqModel) {
        this.CmqModel = CmqModel;
    }

    /**
     * Get CMQ 的园区，如 sh，bj 等。 
     * @return CmqRegion CMQ 的园区，如 sh，bj 等。
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set CMQ 的园区，如 sh，bj 等。
     * @param CmqRegion CMQ 的园区，如 sh，bj 等。
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    /**
     * Get 当模型为 Queue 时有效，表示接收事件通知的 CMQ 的队列名。 
     * @return QueueName 当模型为 Queue 时有效，表示接收事件通知的 CMQ 的队列名。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 当模型为 Queue 时有效，表示接收事件通知的 CMQ 的队列名。
     * @param QueueName 当模型为 Queue 时有效，表示接收事件通知的 CMQ 的队列名。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 当模型为 Topic 时有效，表示接收事件通知的 CMQ 的主题名。 
     * @return TopicName 当模型为 Topic 时有效，表示接收事件通知的 CMQ 的主题名。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 当模型为 Topic 时有效，表示接收事件通知的 CMQ 的主题名。
     * @param TopicName 当模型为 Topic 时有效，表示接收事件通知的 CMQ 的主题名。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 用于生成回调签名的 Key。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyKey 用于生成回调签名的 Key。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotifyKey() {
        return this.NotifyKey;
    }

    /**
     * Set 用于生成回调签名的 Key。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyKey 用于生成回调签名的 Key。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyKey(String NotifyKey) {
        this.NotifyKey = NotifyKey;
    }

    public LiveStreamTaskNotifyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamTaskNotifyConfig(LiveStreamTaskNotifyConfig source) {
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.CmqModel != null) {
            this.CmqModel = new String(source.CmqModel);
        }
        if (source.CmqRegion != null) {
            this.CmqRegion = new String(source.CmqRegion);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.NotifyKey != null) {
            this.NotifyKey = new String(source.NotifyKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "CmqModel", this.CmqModel);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "NotifyKey", this.NotifyKey);

    }
}

