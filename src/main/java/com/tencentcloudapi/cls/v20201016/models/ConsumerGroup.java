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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumerGroup extends AbstractModel {

    /**
    * 消费组名称
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 状态。

- Empty：组内没有成员，但存在已提交的偏移量。所有消费者都离开但保留了偏移量
- Dead：组内没有成员，且没有已提交的偏移量。组被删除或长时间无活动
- Stable：组内成员正常消费，分区分配平衡。正常运行状态
- PreparingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
- CompletingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开

    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 分区分配策略均衡算法名称。

- 常见均衡算法如下：
    - range:按分区范围分配
    - roundrobin:轮询式分配
    - sticky:粘性分配（避免不必要的重平衡）
    */
    @SerializedName("ProtocolName")
    @Expose
    private String ProtocolName;

    /**
     * Get 消费组名称 
     * @return Group 消费组名称
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 消费组名称
     * @param Group 消费组名称
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 状态。

- Empty：组内没有成员，但存在已提交的偏移量。所有消费者都离开但保留了偏移量
- Dead：组内没有成员，且没有已提交的偏移量。组被删除或长时间无活动
- Stable：组内成员正常消费，分区分配平衡。正常运行状态
- PreparingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
- CompletingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
 
     * @return State 状态。

- Empty：组内没有成员，但存在已提交的偏移量。所有消费者都离开但保留了偏移量
- Dead：组内没有成员，且没有已提交的偏移量。组被删除或长时间无活动
- Stable：组内成员正常消费，分区分配平衡。正常运行状态
- PreparingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
- CompletingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开

     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态。

- Empty：组内没有成员，但存在已提交的偏移量。所有消费者都离开但保留了偏移量
- Dead：组内没有成员，且没有已提交的偏移量。组被删除或长时间无活动
- Stable：组内成员正常消费，分区分配平衡。正常运行状态
- PreparingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
- CompletingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开

     * @param State 状态。

- Empty：组内没有成员，但存在已提交的偏移量。所有消费者都离开但保留了偏移量
- Dead：组内没有成员，且没有已提交的偏移量。组被删除或长时间无活动
- Stable：组内成员正常消费，分区分配平衡。正常运行状态
- PreparingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
- CompletingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开

     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 分区分配策略均衡算法名称。

- 常见均衡算法如下：
    - range:按分区范围分配
    - roundrobin:轮询式分配
    - sticky:粘性分配（避免不必要的重平衡） 
     * @return ProtocolName 分区分配策略均衡算法名称。

- 常见均衡算法如下：
    - range:按分区范围分配
    - roundrobin:轮询式分配
    - sticky:粘性分配（避免不必要的重平衡）
     */
    public String getProtocolName() {
        return this.ProtocolName;
    }

    /**
     * Set 分区分配策略均衡算法名称。

- 常见均衡算法如下：
    - range:按分区范围分配
    - roundrobin:轮询式分配
    - sticky:粘性分配（避免不必要的重平衡）
     * @param ProtocolName 分区分配策略均衡算法名称。

- 常见均衡算法如下：
    - range:按分区范围分配
    - roundrobin:轮询式分配
    - sticky:粘性分配（避免不必要的重平衡）
     */
    public void setProtocolName(String ProtocolName) {
        this.ProtocolName = ProtocolName;
    }

    public ConsumerGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerGroup(ConsumerGroup source) {
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.ProtocolName != null) {
            this.ProtocolName = new String(source.ProtocolName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "ProtocolName", this.ProtocolName);

    }
}

