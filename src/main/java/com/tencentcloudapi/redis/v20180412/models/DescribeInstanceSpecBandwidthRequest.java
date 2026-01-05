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
    * <p>指定实例 ID。请登录 <a href="https://console.cloud.tencent.com/redis">Redis控制台</a> 在实例列表复制实例 ID。同时，InstanceId 与规格参数不能同时为空，至少提供一种。</p><ul><li>若仅指定 InstanceId：查询该实例当前规格的带宽。</li><li>若指定 InstanceId + 至少一个规格参数（ShardSize、ShardNum 或 ReplicateNum）：计算变更规格后的带宽。</li><li>若指定部分或所有规格参数（ShardSize、ShardNum、ReplicateNum 与 Type），而不指定 InstanceId：根据规格组合查询理论带宽。</li></ul>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>分片大小。单位：MB。</p>
    */
    @SerializedName("ShardSize")
    @Expose
    private Long ShardSize;

    /**
    * <p>分片数量。</p>
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * <p>复制组数量。</p>
    */
    @SerializedName("ReplicateNum")
    @Expose
    private Long ReplicateNum;

    /**
    * <p>只读权重。- 100：开启从只读。- 0：关闭从只读。</p>
    */
    @SerializedName("ReadOnlyWeight")
    @Expose
    private Long ReadOnlyWeight;

    /**
    * <p>实例类型，同 <a href="https://cloud.tencent.com/document/api/239/20026">CreateInstances</a> 的Type。</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>指定实例 ID。请登录 <a href="https://console.cloud.tencent.com/redis">Redis控制台</a> 在实例列表复制实例 ID。同时，InstanceId 与规格参数不能同时为空，至少提供一种。</p><ul><li>若仅指定 InstanceId：查询该实例当前规格的带宽。</li><li>若指定 InstanceId + 至少一个规格参数（ShardSize、ShardNum 或 ReplicateNum）：计算变更规格后的带宽。</li><li>若指定部分或所有规格参数（ShardSize、ShardNum、ReplicateNum 与 Type），而不指定 InstanceId：根据规格组合查询理论带宽。</li></ul> 
     * @return InstanceId <p>指定实例 ID。请登录 <a href="https://console.cloud.tencent.com/redis">Redis控制台</a> 在实例列表复制实例 ID。同时，InstanceId 与规格参数不能同时为空，至少提供一种。</p><ul><li>若仅指定 InstanceId：查询该实例当前规格的带宽。</li><li>若指定 InstanceId + 至少一个规格参数（ShardSize、ShardNum 或 ReplicateNum）：计算变更规格后的带宽。</li><li>若指定部分或所有规格参数（ShardSize、ShardNum、ReplicateNum 与 Type），而不指定 InstanceId：根据规格组合查询理论带宽。</li></ul>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定实例 ID。请登录 <a href="https://console.cloud.tencent.com/redis">Redis控制台</a> 在实例列表复制实例 ID。同时，InstanceId 与规格参数不能同时为空，至少提供一种。</p><ul><li>若仅指定 InstanceId：查询该实例当前规格的带宽。</li><li>若指定 InstanceId + 至少一个规格参数（ShardSize、ShardNum 或 ReplicateNum）：计算变更规格后的带宽。</li><li>若指定部分或所有规格参数（ShardSize、ShardNum、ReplicateNum 与 Type），而不指定 InstanceId：根据规格组合查询理论带宽。</li></ul>
     * @param InstanceId <p>指定实例 ID。请登录 <a href="https://console.cloud.tencent.com/redis">Redis控制台</a> 在实例列表复制实例 ID。同时，InstanceId 与规格参数不能同时为空，至少提供一种。</p><ul><li>若仅指定 InstanceId：查询该实例当前规格的带宽。</li><li>若指定 InstanceId + 至少一个规格参数（ShardSize、ShardNum 或 ReplicateNum）：计算变更规格后的带宽。</li><li>若指定部分或所有规格参数（ShardSize、ShardNum、ReplicateNum 与 Type），而不指定 InstanceId：根据规格组合查询理论带宽。</li></ul>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>分片大小。单位：MB。</p> 
     * @return ShardSize <p>分片大小。单位：MB。</p>
     */
    public Long getShardSize() {
        return this.ShardSize;
    }

    /**
     * Set <p>分片大小。单位：MB。</p>
     * @param ShardSize <p>分片大小。单位：MB。</p>
     */
    public void setShardSize(Long ShardSize) {
        this.ShardSize = ShardSize;
    }

    /**
     * Get <p>分片数量。</p> 
     * @return ShardNum <p>分片数量。</p>
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set <p>分片数量。</p>
     * @param ShardNum <p>分片数量。</p>
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get <p>复制组数量。</p> 
     * @return ReplicateNum <p>复制组数量。</p>
     */
    public Long getReplicateNum() {
        return this.ReplicateNum;
    }

    /**
     * Set <p>复制组数量。</p>
     * @param ReplicateNum <p>复制组数量。</p>
     */
    public void setReplicateNum(Long ReplicateNum) {
        this.ReplicateNum = ReplicateNum;
    }

    /**
     * Get <p>只读权重。- 100：开启从只读。- 0：关闭从只读。</p> 
     * @return ReadOnlyWeight <p>只读权重。- 100：开启从只读。- 0：关闭从只读。</p>
     */
    public Long getReadOnlyWeight() {
        return this.ReadOnlyWeight;
    }

    /**
     * Set <p>只读权重。- 100：开启从只读。- 0：关闭从只读。</p>
     * @param ReadOnlyWeight <p>只读权重。- 100：开启从只读。- 0：关闭从只读。</p>
     */
    public void setReadOnlyWeight(Long ReadOnlyWeight) {
        this.ReadOnlyWeight = ReadOnlyWeight;
    }

    /**
     * Get <p>实例类型，同 <a href="https://cloud.tencent.com/document/api/239/20026">CreateInstances</a> 的Type。</p> 
     * @return Type <p>实例类型，同 <a href="https://cloud.tencent.com/document/api/239/20026">CreateInstances</a> 的Type。</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>实例类型，同 <a href="https://cloud.tencent.com/document/api/239/20026">CreateInstances</a> 的Type。</p>
     * @param Type <p>实例类型，同 <a href="https://cloud.tencent.com/document/api/239/20026">CreateInstances</a> 的Type。</p>
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

