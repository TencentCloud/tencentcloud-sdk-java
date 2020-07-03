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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExpandShardConfig extends AbstractModel{

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ShardInstanceIds.", this.ShardInstanceIds);
        this.setParamSimple(map, prefix + "ShardMemory", this.ShardMemory);
        this.setParamSimple(map, prefix + "ShardStorage", this.ShardStorage);

    }
}

