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

public class FetchMessageByOffsetRequest extends AbstractModel {

    /**
    * <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主题名，可通过<a href="https://cloud.tencent.com/document/product/597/40847">DescribeTopic</a>接口获取</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>分区id</p>
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * <p>位点信息</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p> 
     * @return InstanceId <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     * @param InstanceId <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>主题名，可通过<a href="https://cloud.tencent.com/document/product/597/40847">DescribeTopic</a>接口获取</p> 
     * @return Topic <p>主题名，可通过<a href="https://cloud.tencent.com/document/product/597/40847">DescribeTopic</a>接口获取</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>主题名，可通过<a href="https://cloud.tencent.com/document/product/597/40847">DescribeTopic</a>接口获取</p>
     * @param Topic <p>主题名，可通过<a href="https://cloud.tencent.com/document/product/597/40847">DescribeTopic</a>接口获取</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>分区id</p> 
     * @return Partition <p>分区id</p>
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set <p>分区id</p>
     * @param Partition <p>分区id</p>
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get <p>位点信息</p> 
     * @return Offset <p>位点信息</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>位点信息</p>
     * @param Offset <p>位点信息</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public FetchMessageByOffsetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FetchMessageByOffsetRequest(FetchMessageByOffsetRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

