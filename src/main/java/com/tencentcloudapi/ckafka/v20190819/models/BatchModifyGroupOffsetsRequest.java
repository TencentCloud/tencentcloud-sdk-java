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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchModifyGroupOffsetsRequest extends AbstractModel {

    /**
    * <p>消费分组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>partition信息</p>
    */
    @SerializedName("Partitions")
    @Expose
    private Partitions [] Partitions;

    /**
    * <p>指定topic，默认所有topic</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String [] TopicName;

    /**
     * Get <p>消费分组名称</p> 
     * @return GroupName <p>消费分组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>消费分组名称</p>
     * @param GroupName <p>消费分组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p> 
     * @return InstanceId <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     * @param InstanceId <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>partition信息</p> 
     * @return Partitions <p>partition信息</p>
     */
    public Partitions [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set <p>partition信息</p>
     * @param Partitions <p>partition信息</p>
     */
    public void setPartitions(Partitions [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get <p>指定topic，默认所有topic</p> 
     * @return TopicName <p>指定topic，默认所有topic</p>
     */
    public String [] getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>指定topic，默认所有topic</p>
     * @param TopicName <p>指定topic，默认所有topic</p>
     */
    public void setTopicName(String [] TopicName) {
        this.TopicName = TopicName;
    }

    public BatchModifyGroupOffsetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyGroupOffsetsRequest(BatchModifyGroupOffsetsRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Partitions != null) {
            this.Partitions = new Partitions[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new Partitions(source.Partitions[i]);
            }
        }
        if (source.TopicName != null) {
            this.TopicName = new String[source.TopicName.length];
            for (int i = 0; i < source.TopicName.length; i++) {
                this.TopicName[i] = new String(source.TopicName[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);
        this.setParamArraySimple(map, prefix + "TopicName.", this.TopicName);

    }
}

