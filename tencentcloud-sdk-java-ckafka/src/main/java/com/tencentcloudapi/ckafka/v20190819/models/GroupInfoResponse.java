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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfoResponse extends AbstractModel{

    /**
    * 错误码，正常为0
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * group 状态描述（常见的为 Empty、Stable、Dead 三种状态）：
Dead：消费分组不存在
Empty：消费分组，当前没有任何消费者订阅
PreparingRebalance：消费分组处于 rebalance 状态
CompletingRebalance：消费分组处于 rebalance 状态
Stable：消费分组中各个消费者已经加入，处于稳定状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 消费分组选择的协议类型正常的消费者一般为 consumer 但有些系统采用了自己的协议如 kafka-connect 用的就是 connect。只有标准的 consumer 协议，本接口才知道具体的分配方式的格式，才能解析到具体的 partition 的分配情况
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * 消费者 partition 分配算法常见的有如下几种(Kafka 消费者 SDK 默认的选择项为 range)：range、 roundrobin、 sticky
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 仅当 state 为 Stable 且 protocol_type 为 consumer 时， 该数组才包含信息
    */
    @SerializedName("Members")
    @Expose
    private GroupInfoMember [] Members;

    /**
    * Kafka 消费分组
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
     * Get 错误码，正常为0 
     * @return ErrorCode 错误码，正常为0
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 错误码，正常为0
     * @param ErrorCode 错误码，正常为0
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get group 状态描述（常见的为 Empty、Stable、Dead 三种状态）：
Dead：消费分组不存在
Empty：消费分组，当前没有任何消费者订阅
PreparingRebalance：消费分组处于 rebalance 状态
CompletingRebalance：消费分组处于 rebalance 状态
Stable：消费分组中各个消费者已经加入，处于稳定状态 
     * @return State group 状态描述（常见的为 Empty、Stable、Dead 三种状态）：
Dead：消费分组不存在
Empty：消费分组，当前没有任何消费者订阅
PreparingRebalance：消费分组处于 rebalance 状态
CompletingRebalance：消费分组处于 rebalance 状态
Stable：消费分组中各个消费者已经加入，处于稳定状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set group 状态描述（常见的为 Empty、Stable、Dead 三种状态）：
Dead：消费分组不存在
Empty：消费分组，当前没有任何消费者订阅
PreparingRebalance：消费分组处于 rebalance 状态
CompletingRebalance：消费分组处于 rebalance 状态
Stable：消费分组中各个消费者已经加入，处于稳定状态
     * @param State group 状态描述（常见的为 Empty、Stable、Dead 三种状态）：
Dead：消费分组不存在
Empty：消费分组，当前没有任何消费者订阅
PreparingRebalance：消费分组处于 rebalance 状态
CompletingRebalance：消费分组处于 rebalance 状态
Stable：消费分组中各个消费者已经加入，处于稳定状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 消费分组选择的协议类型正常的消费者一般为 consumer 但有些系统采用了自己的协议如 kafka-connect 用的就是 connect。只有标准的 consumer 协议，本接口才知道具体的分配方式的格式，才能解析到具体的 partition 的分配情况 
     * @return ProtocolType 消费分组选择的协议类型正常的消费者一般为 consumer 但有些系统采用了自己的协议如 kafka-connect 用的就是 connect。只有标准的 consumer 协议，本接口才知道具体的分配方式的格式，才能解析到具体的 partition 的分配情况
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set 消费分组选择的协议类型正常的消费者一般为 consumer 但有些系统采用了自己的协议如 kafka-connect 用的就是 connect。只有标准的 consumer 协议，本接口才知道具体的分配方式的格式，才能解析到具体的 partition 的分配情况
     * @param ProtocolType 消费分组选择的协议类型正常的消费者一般为 consumer 但有些系统采用了自己的协议如 kafka-connect 用的就是 connect。只有标准的 consumer 协议，本接口才知道具体的分配方式的格式，才能解析到具体的 partition 的分配情况
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get 消费者 partition 分配算法常见的有如下几种(Kafka 消费者 SDK 默认的选择项为 range)：range、 roundrobin、 sticky 
     * @return Protocol 消费者 partition 分配算法常见的有如下几种(Kafka 消费者 SDK 默认的选择项为 range)：range、 roundrobin、 sticky
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 消费者 partition 分配算法常见的有如下几种(Kafka 消费者 SDK 默认的选择项为 range)：range、 roundrobin、 sticky
     * @param Protocol 消费者 partition 分配算法常见的有如下几种(Kafka 消费者 SDK 默认的选择项为 range)：range、 roundrobin、 sticky
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 仅当 state 为 Stable 且 protocol_type 为 consumer 时， 该数组才包含信息 
     * @return Members 仅当 state 为 Stable 且 protocol_type 为 consumer 时， 该数组才包含信息
     */
    public GroupInfoMember [] getMembers() {
        return this.Members;
    }

    /**
     * Set 仅当 state 为 Stable 且 protocol_type 为 consumer 时， 该数组才包含信息
     * @param Members 仅当 state 为 Stable 且 protocol_type 为 consumer 时， 该数组才包含信息
     */
    public void setMembers(GroupInfoMember [] Members) {
        this.Members = Members;
    }

    /**
     * Get Kafka 消费分组 
     * @return Group Kafka 消费分组
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Kafka 消费分组
     * @param Group Kafka 消费分组
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "Members.", this.Members);
        this.setParamSimple(map, prefix + "Group", this.Group);

    }
}

