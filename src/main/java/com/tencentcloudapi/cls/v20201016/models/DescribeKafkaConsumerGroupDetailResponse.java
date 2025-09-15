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

public class DescribeKafkaConsumerGroupDetailResponse extends AbstractModel {

    /**
    * 日志集id
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 消费组名称
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 消费组信息列表
    */
    @SerializedName("PartitionInfos")
    @Expose
    private GroupPartitionInfo [] PartitionInfos;

    /**
    * Empty：组内没有成员，但存在已提交的偏移量。所有消费者都离开但保留了偏移量
Dead：组内没有成员，且没有已提交的偏移量。组被删除或长时间无活动
Stable：组内成员正常消费，分区分配平衡。正常运行状态
PreparingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
CompletingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志集id 
     * @return LogsetId 日志集id
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集id
     * @param LogsetId 日志集id
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

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
     * Get 消费组信息列表 
     * @return PartitionInfos 消费组信息列表
     */
    public GroupPartitionInfo [] getPartitionInfos() {
        return this.PartitionInfos;
    }

    /**
     * Set 消费组信息列表
     * @param PartitionInfos 消费组信息列表
     */
    public void setPartitionInfos(GroupPartitionInfo [] PartitionInfos) {
        this.PartitionInfos = PartitionInfos;
    }

    /**
     * Get Empty：组内没有成员，但存在已提交的偏移量。所有消费者都离开但保留了偏移量
Dead：组内没有成员，且没有已提交的偏移量。组被删除或长时间无活动
Stable：组内成员正常消费，分区分配平衡。正常运行状态
PreparingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
CompletingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开 
     * @return State Empty：组内没有成员，但存在已提交的偏移量。所有消费者都离开但保留了偏移量
Dead：组内没有成员，且没有已提交的偏移量。组被删除或长时间无活动
Stable：组内成员正常消费，分区分配平衡。正常运行状态
PreparingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
CompletingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Empty：组内没有成员，但存在已提交的偏移量。所有消费者都离开但保留了偏移量
Dead：组内没有成员，且没有已提交的偏移量。组被删除或长时间无活动
Stable：组内成员正常消费，分区分配平衡。正常运行状态
PreparingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
CompletingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
     * @param State Empty：组内没有成员，但存在已提交的偏移量。所有消费者都离开但保留了偏移量
Dead：组内没有成员，且没有已提交的偏移量。组被删除或长时间无活动
Stable：组内成员正常消费，分区分配平衡。正常运行状态
PreparingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
CompletingRebalance：组正在准备重新平衡。有新成员加入或现有成员离开
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeKafkaConsumerGroupDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKafkaConsumerGroupDetailResponse(DescribeKafkaConsumerGroupDetailResponse source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.PartitionInfos != null) {
            this.PartitionInfos = new GroupPartitionInfo[source.PartitionInfos.length];
            for (int i = 0; i < source.PartitionInfos.length; i++) {
                this.PartitionInfos[i] = new GroupPartitionInfo(source.PartitionInfos[i]);
            }
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamArrayObj(map, prefix + "PartitionInfos.", this.PartitionInfos);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

