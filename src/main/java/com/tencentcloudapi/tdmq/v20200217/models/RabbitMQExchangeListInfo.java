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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQExchangeListInfo extends AbstractModel {

    /**
    * exchange 名
    */
    @SerializedName("ExchangeName")
    @Expose
    private String ExchangeName;

    /**
    * 备注说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * exchange 类型, 支持 "fanout","direct","topic","headers"
    */
    @SerializedName("ExchangeType")
    @Expose
    private String ExchangeType;

    /**
    * VHost参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * exchange 创建者, "system":"系统创建", "user":"用户创建"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExchangeCreator")
    @Expose
    private String ExchangeCreator;

    /**
    * exchange 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTimeStamp")
    @Expose
    private String CreateTimeStamp;

    /**
    * exchange 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModTimeStamp")
    @Expose
    private String ModTimeStamp;

    /**
    * 输入消息速率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageRateIn")
    @Expose
    private Float MessageRateIn;

    /**
    * 输出消息速率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageRateOut")
    @Expose
    private Float MessageRateOut;

    /**
    * 是否为持久化交换机，true 为持久化，false 为非持久化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Durable")
    @Expose
    private Boolean Durable;

    /**
    * 是否为自动删除交换机，true 为自动删除，false 为非自动删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoDelete")
    @Expose
    private Boolean AutoDelete;

    /**
    * 是否为内部交换机，true 为内部交换机
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Internal")
    @Expose
    private Boolean Internal;

    /**
    * 交换机所属实例 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 生效的策略名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * 扩展参数 key-value 对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Arguments")
    @Expose
    private String Arguments;

    /**
    * 未调度的延时消息数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessagesDelayed")
    @Expose
    private Long MessagesDelayed;

    /**
     * Get exchange 名 
     * @return ExchangeName exchange 名
     */
    public String getExchangeName() {
        return this.ExchangeName;
    }

    /**
     * Set exchange 名
     * @param ExchangeName exchange 名
     */
    public void setExchangeName(String ExchangeName) {
        this.ExchangeName = ExchangeName;
    }

    /**
     * Get 备注说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get exchange 类型, 支持 "fanout","direct","topic","headers" 
     * @return ExchangeType exchange 类型, 支持 "fanout","direct","topic","headers"
     */
    public String getExchangeType() {
        return this.ExchangeType;
    }

    /**
     * Set exchange 类型, 支持 "fanout","direct","topic","headers"
     * @param ExchangeType exchange 类型, 支持 "fanout","direct","topic","headers"
     */
    public void setExchangeType(String ExchangeType) {
        this.ExchangeType = ExchangeType;
    }

    /**
     * Get VHost参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualHost VHost参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set VHost参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualHost VHost参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get exchange 创建者, "system":"系统创建", "user":"用户创建"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExchangeCreator exchange 创建者, "system":"系统创建", "user":"用户创建"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExchangeCreator() {
        return this.ExchangeCreator;
    }

    /**
     * Set exchange 创建者, "system":"系统创建", "user":"用户创建"
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExchangeCreator exchange 创建者, "system":"系统创建", "user":"用户创建"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExchangeCreator(String ExchangeCreator) {
        this.ExchangeCreator = ExchangeCreator;
    }

    /**
     * Get exchange 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTimeStamp exchange 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTimeStamp() {
        return this.CreateTimeStamp;
    }

    /**
     * Set exchange 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTimeStamp exchange 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTimeStamp(String CreateTimeStamp) {
        this.CreateTimeStamp = CreateTimeStamp;
    }

    /**
     * Get exchange 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModTimeStamp exchange 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModTimeStamp() {
        return this.ModTimeStamp;
    }

    /**
     * Set exchange 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModTimeStamp exchange 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModTimeStamp(String ModTimeStamp) {
        this.ModTimeStamp = ModTimeStamp;
    }

    /**
     * Get 输入消息速率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageRateIn 输入消息速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMessageRateIn() {
        return this.MessageRateIn;
    }

    /**
     * Set 输入消息速率
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageRateIn 输入消息速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageRateIn(Float MessageRateIn) {
        this.MessageRateIn = MessageRateIn;
    }

    /**
     * Get 输出消息速率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageRateOut 输出消息速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMessageRateOut() {
        return this.MessageRateOut;
    }

    /**
     * Set 输出消息速率
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageRateOut 输出消息速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageRateOut(Float MessageRateOut) {
        this.MessageRateOut = MessageRateOut;
    }

    /**
     * Get 是否为持久化交换机，true 为持久化，false 为非持久化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Durable 是否为持久化交换机，true 为持久化，false 为非持久化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDurable() {
        return this.Durable;
    }

    /**
     * Set 是否为持久化交换机，true 为持久化，false 为非持久化
注意：此字段可能返回 null，表示取不到有效值。
     * @param Durable 是否为持久化交换机，true 为持久化，false 为非持久化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurable(Boolean Durable) {
        this.Durable = Durable;
    }

    /**
     * Get 是否为自动删除交换机，true 为自动删除，false 为非自动删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoDelete 是否为自动删除交换机，true 为自动删除，false 为非自动删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set 是否为自动删除交换机，true 为自动删除，false 为非自动删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoDelete 是否为自动删除交换机，true 为自动删除，false 为非自动删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoDelete(Boolean AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

    /**
     * Get 是否为内部交换机，true 为内部交换机
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Internal 是否为内部交换机，true 为内部交换机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInternal() {
        return this.Internal;
    }

    /**
     * Set 是否为内部交换机，true 为内部交换机
注意：此字段可能返回 null，表示取不到有效值。
     * @param Internal 是否为内部交换机，true 为内部交换机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternal(Boolean Internal) {
        this.Internal = Internal;
    }

    /**
     * Get 交换机所属实例 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 交换机所属实例 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 交换机所属实例 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 交换机所属实例 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 生效的策略名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Policy 生效的策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set 生效的策略名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Policy 生效的策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 扩展参数 key-value 对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Arguments 扩展参数 key-value 对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArguments() {
        return this.Arguments;
    }

    /**
     * Set 扩展参数 key-value 对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param Arguments 扩展参数 key-value 对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArguments(String Arguments) {
        this.Arguments = Arguments;
    }

    /**
     * Get 未调度的延时消息数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessagesDelayed 未调度的延时消息数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMessagesDelayed() {
        return this.MessagesDelayed;
    }

    /**
     * Set 未调度的延时消息数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessagesDelayed 未调度的延时消息数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessagesDelayed(Long MessagesDelayed) {
        this.MessagesDelayed = MessagesDelayed;
    }

    public RabbitMQExchangeListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQExchangeListInfo(RabbitMQExchangeListInfo source) {
        if (source.ExchangeName != null) {
            this.ExchangeName = new String(source.ExchangeName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ExchangeType != null) {
            this.ExchangeType = new String(source.ExchangeType);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.ExchangeCreator != null) {
            this.ExchangeCreator = new String(source.ExchangeCreator);
        }
        if (source.CreateTimeStamp != null) {
            this.CreateTimeStamp = new String(source.CreateTimeStamp);
        }
        if (source.ModTimeStamp != null) {
            this.ModTimeStamp = new String(source.ModTimeStamp);
        }
        if (source.MessageRateIn != null) {
            this.MessageRateIn = new Float(source.MessageRateIn);
        }
        if (source.MessageRateOut != null) {
            this.MessageRateOut = new Float(source.MessageRateOut);
        }
        if (source.Durable != null) {
            this.Durable = new Boolean(source.Durable);
        }
        if (source.AutoDelete != null) {
            this.AutoDelete = new Boolean(source.AutoDelete);
        }
        if (source.Internal != null) {
            this.Internal = new Boolean(source.Internal);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.Arguments != null) {
            this.Arguments = new String(source.Arguments);
        }
        if (source.MessagesDelayed != null) {
            this.MessagesDelayed = new Long(source.MessagesDelayed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExchangeName", this.ExchangeName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ExchangeType", this.ExchangeType);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "ExchangeCreator", this.ExchangeCreator);
        this.setParamSimple(map, prefix + "CreateTimeStamp", this.CreateTimeStamp);
        this.setParamSimple(map, prefix + "ModTimeStamp", this.ModTimeStamp);
        this.setParamSimple(map, prefix + "MessageRateIn", this.MessageRateIn);
        this.setParamSimple(map, prefix + "MessageRateOut", this.MessageRateOut);
        this.setParamSimple(map, prefix + "Durable", this.Durable);
        this.setParamSimple(map, prefix + "AutoDelete", this.AutoDelete);
        this.setParamSimple(map, prefix + "Internal", this.Internal);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Arguments", this.Arguments);
        this.setParamSimple(map, prefix + "MessagesDelayed", this.MessagesDelayed);

    }
}

