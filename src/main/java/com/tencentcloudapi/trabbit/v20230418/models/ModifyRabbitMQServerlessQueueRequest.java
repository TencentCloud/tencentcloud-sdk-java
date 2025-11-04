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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRabbitMQServerlessQueueRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Vhost参数
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * 队列名称
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 新修改的备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * MessageTTL参数单位ms,classic类型专用	
    */
    @SerializedName("MessageTTL")
    @Expose
    private Long MessageTTL;

    /**
    * DeadLetterExchange参数。可将过期或被拒绝的消息投往指定的死信 exchange。
    */
    @SerializedName("DeadLetterExchange")
    @Expose
    private String DeadLetterExchange;

    /**
    * DeadLetterRoutingKey参数。只能包含字母、数字、"."、"-"，"@"，"_"
    */
    @SerializedName("DeadLetterRoutingKey")
    @Expose
    private String DeadLetterRoutingKey;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Vhost参数 
     * @return VirtualHost Vhost参数
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Vhost参数
     * @param VirtualHost Vhost参数
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get 队列名称 
     * @return QueueName 队列名称
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名称
     * @param QueueName 队列名称
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 新修改的备注 
     * @return Remark 新修改的备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 新修改的备注
     * @param Remark 新修改的备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get MessageTTL参数单位ms,classic类型专用	 
     * @return MessageTTL MessageTTL参数单位ms,classic类型专用	
     */
    public Long getMessageTTL() {
        return this.MessageTTL;
    }

    /**
     * Set MessageTTL参数单位ms,classic类型专用	
     * @param MessageTTL MessageTTL参数单位ms,classic类型专用	
     */
    public void setMessageTTL(Long MessageTTL) {
        this.MessageTTL = MessageTTL;
    }

    /**
     * Get DeadLetterExchange参数。可将过期或被拒绝的消息投往指定的死信 exchange。 
     * @return DeadLetterExchange DeadLetterExchange参数。可将过期或被拒绝的消息投往指定的死信 exchange。
     */
    public String getDeadLetterExchange() {
        return this.DeadLetterExchange;
    }

    /**
     * Set DeadLetterExchange参数。可将过期或被拒绝的消息投往指定的死信 exchange。
     * @param DeadLetterExchange DeadLetterExchange参数。可将过期或被拒绝的消息投往指定的死信 exchange。
     */
    public void setDeadLetterExchange(String DeadLetterExchange) {
        this.DeadLetterExchange = DeadLetterExchange;
    }

    /**
     * Get DeadLetterRoutingKey参数。只能包含字母、数字、"."、"-"，"@"，"_" 
     * @return DeadLetterRoutingKey DeadLetterRoutingKey参数。只能包含字母、数字、"."、"-"，"@"，"_"
     */
    public String getDeadLetterRoutingKey() {
        return this.DeadLetterRoutingKey;
    }

    /**
     * Set DeadLetterRoutingKey参数。只能包含字母、数字、"."、"-"，"@"，"_"
     * @param DeadLetterRoutingKey DeadLetterRoutingKey参数。只能包含字母、数字、"."、"-"，"@"，"_"
     */
    public void setDeadLetterRoutingKey(String DeadLetterRoutingKey) {
        this.DeadLetterRoutingKey = DeadLetterRoutingKey;
    }

    public ModifyRabbitMQServerlessQueueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRabbitMQServerlessQueueRequest(ModifyRabbitMQServerlessQueueRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MessageTTL != null) {
            this.MessageTTL = new Long(source.MessageTTL);
        }
        if (source.DeadLetterExchange != null) {
            this.DeadLetterExchange = new String(source.DeadLetterExchange);
        }
        if (source.DeadLetterRoutingKey != null) {
            this.DeadLetterRoutingKey = new String(source.DeadLetterRoutingKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MessageTTL", this.MessageTTL);
        this.setParamSimple(map, prefix + "DeadLetterExchange", this.DeadLetterExchange);
        this.setParamSimple(map, prefix + "DeadLetterRoutingKey", this.DeadLetterRoutingKey);

    }
}

