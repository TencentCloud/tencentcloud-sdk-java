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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceSpecBandwidthRequest extends AbstractModel {

    /**
    * 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。填写实例id或者规格，两者必选其一。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分片大小，单位：MB
    */
    @SerializedName("ShardSize")
    @Expose
    private Long ShardSize;

    /**
    * 分片数量。
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * 复制组数量。
    */
    @SerializedName("ReplicateNum")
    @Expose
    private Long ReplicateNum;

    /**
    * 只读权重。
- 100：开启从只读。
- 0：关闭从只读。
    */
    @SerializedName("ReadOnlyWeight")
    @Expose
    private Long ReadOnlyWeight;

    /**
    * 实例类型，同 [CreateInstances](https://cloud.tencent.com/document/api/239/20026) 的Type。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。填写实例id或者规格，两者必选其一。 
     * @return InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。填写实例id或者规格，两者必选其一。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。填写实例id或者规格，两者必选其一。
     * @param InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。填写实例id或者规格，两者必选其一。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分片大小，单位：MB 
     * @return ShardSize 分片大小，单位：MB
     */
    public Long getShardSize() {
        return this.ShardSize;
    }

    /**
     * Set 分片大小，单位：MB
     * @param ShardSize 分片大小，单位：MB
     */
    public void setShardSize(Long ShardSize) {
        this.ShardSize = ShardSize;
    }

    /**
     * Get 分片数量。 
     * @return ShardNum 分片数量。
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set 分片数量。
     * @param ShardNum 分片数量。
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get 复制组数量。 
     * @return ReplicateNum 复制组数量。
     */
    public Long getReplicateNum() {
        return this.ReplicateNum;
    }

    /**
     * Set 复制组数量。
     * @param ReplicateNum 复制组数量。
     */
    public void setReplicateNum(Long ReplicateNum) {
        this.ReplicateNum = ReplicateNum;
    }

    /**
     * Get 只读权重。
- 100：开启从只读。
- 0：关闭从只读。 
     * @return ReadOnlyWeight 只读权重。
- 100：开启从只读。
- 0：关闭从只读。
     */
    public Long getReadOnlyWeight() {
        return this.ReadOnlyWeight;
    }

    /**
     * Set 只读权重。
- 100：开启从只读。
- 0：关闭从只读。
     * @param ReadOnlyWeight 只读权重。
- 100：开启从只读。
- 0：关闭从只读。
     */
    public void setReadOnlyWeight(Long ReadOnlyWeight) {
        this.ReadOnlyWeight = ReadOnlyWeight;
    }

    /**
     * Get 实例类型，同 [CreateInstances](https://cloud.tencent.com/document/api/239/20026) 的Type。 
     * @return Type 实例类型，同 [CreateInstances](https://cloud.tencent.com/document/api/239/20026) 的Type。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 实例类型，同 [CreateInstances](https://cloud.tencent.com/document/api/239/20026) 的Type。
     * @param Type 实例类型，同 [CreateInstances](https://cloud.tencent.com/document/api/239/20026) 的Type。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public DescribeInstanceSpecBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceSpecBandwidthRequest(DescribeInstanceSpecBandwidthRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ShardSize != null) {
            this.ShardSize = new Long(source.ShardSize);
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.ReplicateNum != null) {
            this.ReplicateNum = new Long(source.ReplicateNum);
        }
        if (source.ReadOnlyWeight != null) {
            this.ReadOnlyWeight = new Long(source.ReadOnlyWeight);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ShardSize", this.ShardSize);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamSimple(map, prefix + "ReplicateNum", this.ReplicateNum);
        this.setParamSimple(map, prefix + "ReadOnlyWeight", this.ReadOnlyWeight);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

