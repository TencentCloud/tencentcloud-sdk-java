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

public class InquiryPriceUpgradeInstanceRequest extends AbstractModel {

    /**
    * <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>分片大小，单位：MB。</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>分片数量。- 实例为标准架构，RedisShardNum 默认为1。- Redis 2.8主从版、CKV主从版和 Redis 2.8单机版不需要填写。</p>
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * <p>副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写。</p>
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
     * Get <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>分片大小，单位：MB。</p> 
     * @return MemSize <p>分片大小，单位：MB。</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>分片大小，单位：MB。</p>
     * @param MemSize <p>分片大小，单位：MB。</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>分片数量。- 实例为标准架构，RedisShardNum 默认为1。- Redis 2.8主从版、CKV主从版和 Redis 2.8单机版不需要填写。</p> 
     * @return RedisShardNum <p>分片数量。- 实例为标准架构，RedisShardNum 默认为1。- Redis 2.8主从版、CKV主从版和 Redis 2.8单机版不需要填写。</p>
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set <p>分片数量。- 实例为标准架构，RedisShardNum 默认为1。- Redis 2.8主从版、CKV主从版和 Redis 2.8单机版不需要填写。</p>
     * @param RedisShardNum <p>分片数量。- 实例为标准架构，RedisShardNum 默认为1。- Redis 2.8主从版、CKV主从版和 Redis 2.8单机版不需要填写。</p>
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get <p>副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写。</p> 
     * @return RedisReplicasNum <p>副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写。</p>
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set <p>副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写。</p>
     * @param RedisReplicasNum <p>副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写。</p>
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    public InquiryPriceUpgradeInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceUpgradeInstanceRequest(InquiryPriceUpgradeInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.RedisShardNum != null) {
            this.RedisShardNum = new Long(source.RedisShardNum);
        }
        if (source.RedisReplicasNum != null) {
            this.RedisReplicasNum = new Long(source.RedisReplicasNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);

    }
}

