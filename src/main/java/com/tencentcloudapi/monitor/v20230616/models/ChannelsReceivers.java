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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelsReceivers extends AbstractModel {

    /**
    * 通知渠道名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 接收者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * 发送结果,0-无效,1-成功,2-失败,3-无需发送
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendStatus")
    @Expose
    private String SendStatus;

    /**
     * Get 通知渠道名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelName 通知渠道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 通知渠道名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelName 通知渠道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 接收者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Receivers 接收者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set 接收者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Receivers 接收者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get 发送结果,0-无效,1-成功,2-失败,3-无需发送
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendStatus 发送结果,0-无效,1-成功,2-失败,3-无需发送
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSendStatus() {
        return this.SendStatus;
    }

    /**
     * Set 发送结果,0-无效,1-成功,2-失败,3-无需发送
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendStatus 发送结果,0-无效,1-成功,2-失败,3-无需发送
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendStatus(String SendStatus) {
        this.SendStatus = SendStatus;
    }

    public ChannelsReceivers() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelsReceivers(ChannelsReceivers source) {
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.Receivers != null) {
            this.Receivers = new String[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new String(source.Receivers[i]);
            }
        }
        if (source.SendStatus != null) {
            this.SendStatus = new String(source.SendStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamSimple(map, prefix + "SendStatus", this.SendStatus);

    }
}

