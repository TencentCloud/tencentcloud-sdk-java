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

public class CreatePartitionRequest extends AbstractModel {

    /**
    * ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主题名称，可通过[DescribeTopic](https://cloud.tencent.com/document/product/597/40847)接口获取
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 主题分区个数，传入参数为修改后的分区数，而不是增加的分区数，因此传入参数需要大于当前主题分区个数。
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
     * Get ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取 
     * @return InstanceId ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     * @param InstanceId ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主题名称，可通过[DescribeTopic](https://cloud.tencent.com/document/product/597/40847)接口获取 
     * @return TopicName 主题名称，可通过[DescribeTopic](https://cloud.tencent.com/document/product/597/40847)接口获取
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称，可通过[DescribeTopic](https://cloud.tencent.com/document/product/597/40847)接口获取
     * @param TopicName 主题名称，可通过[DescribeTopic](https://cloud.tencent.com/document/product/597/40847)接口获取
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 主题分区个数，传入参数为修改后的分区数，而不是增加的分区数，因此传入参数需要大于当前主题分区个数。 
     * @return PartitionNum 主题分区个数，传入参数为修改后的分区数，而不是增加的分区数，因此传入参数需要大于当前主题分区个数。
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set 主题分区个数，传入参数为修改后的分区数，而不是增加的分区数，因此传入参数需要大于当前主题分区个数。
     * @param PartitionNum 主题分区个数，传入参数为修改后的分区数，而不是增加的分区数，因此传入参数需要大于当前主题分区个数。
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    public CreatePartitionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePartitionRequest(CreatePartitionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);

    }
}

