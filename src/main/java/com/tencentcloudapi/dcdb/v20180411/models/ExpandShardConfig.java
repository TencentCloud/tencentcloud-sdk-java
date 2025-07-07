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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExpandShardConfig extends AbstractModel {

    /**
    * 分片ID数组
    */
    @SerializedName("ShardInstanceIds")
    @Expose
    private String [] ShardInstanceIds;

    /**
    * 分片内存大小，单位 GB
    */
    @SerializedName("ShardMemory")
    @Expose
    private Long ShardMemory;

    /**
    * 分片存储大小，单位 GB
    */
    @SerializedName("ShardStorage")
    @Expose
    private Long ShardStorage;

    /**
    * 分片节点数
    */
    @SerializedName("ShardNodeCount")
    @Expose
    private Long ShardNodeCount;

    /**
     * Get 分片ID数组 
     * @return ShardInstanceIds 分片ID数组
     */
    public String [] getShardInstanceIds() {
        return this.ShardInstanceIds;
    }

    /**
     * Set 分片ID数组
     * @param ShardInstanceIds 分片ID数组
     */
    public void setShardInstanceIds(String [] ShardInstanceIds) {
        this.ShardInstanceIds = ShardInstanceIds;
    }

    /**
     * Get 分片内存大小，单位 GB 
     * @return ShardMemory 分片内存大小，单位 GB
     */
    public Long getShardMemory() {
        return this.ShardMemory;
    }

    /**
     * Set 分片内存大小，单位 GB
     * @param ShardMemory 分片内存大小，单位 GB
     */
    public void setShardMemory(Long ShardMemory) {
        this.ShardMemory = ShardMemory;
    }

    /**
     * Get 分片存储大小，单位 GB 
     * @return ShardStorage 分片存储大小，单位 GB
     */
    public Long getShardStorage() {
        return this.ShardStorage;
    }

    /**
     * Set 分片存储大小，单位 GB
     * @param ShardStorage 分片存储大小，单位 GB
     */
    public void setShardStorage(Long ShardStorage) {
        this.ShardStorage = ShardStorage;
    }

    /**
     * Get 分片节点数 
     * @return ShardNodeCount 分片节点数
     */
    public Long getShardNodeCount() {
        return this.ShardNodeCount;
    }

    /**
     * Set 分片节点数
     * @param ShardNodeCount 分片节点数
     */
    public void setShardNodeCount(Long ShardNodeCount) {
        this.ShardNodeCount = ShardNodeCount;
    }

    public ExpandShardConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpandShardConfig(ExpandShardConfig source) {
        if (source.ShardInstanceIds != null) {
            this.ShardInstanceIds = new String[source.ShardInstanceIds.length];
            for (int i = 0; i < source.ShardInstanceIds.length; i++) {
                this.ShardInstanceIds[i] = new String(source.ShardInstanceIds[i]);
            }
        }
        if (source.ShardMemory != null) {
            this.ShardMemory = new Long(source.ShardMemory);
        }
        if (source.ShardStorage != null) {
            this.ShardStorage = new Long(source.ShardStorage);
        }
        if (source.ShardNodeCount != null) {
            this.ShardNodeCount = new Long(source.ShardNodeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ShardInstanceIds.", this.ShardInstanceIds);
        this.setParamSimple(map, prefix + "ShardMemory", this.ShardMemory);
        this.setParamSimple(map, prefix + "ShardStorage", this.ShardStorage);
        this.setParamSimple(map, prefix + "ShardNodeCount", this.ShardNodeCount);

    }
}

