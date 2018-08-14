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

public class AddShardConfig  extends AbstractModel{

    /**
    * 新增分片的数量
    */
    @SerializedName("ShardCount")
    @Expose
    private Integer ShardCount;

    /**
    * 分片内存大小，单位 GB
    */
    @SerializedName("ShardMemory")
    @Expose
    private Integer ShardMemory;

    /**
    * 分片存储大小，单位 GB
    */
    @SerializedName("ShardStorage")
    @Expose
    private Integer ShardStorage;

    /**
     * 获取新增分片的数量
     * @return ShardCount 新增分片的数量
     */
    public Integer getShardCount() {
        return this.ShardCount;
    }

    /**
     * 设置新增分片的数量
     * @param ShardCount 新增分片的数量
     */
    public void setShardCount(Integer ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * 获取分片内存大小，单位 GB
     * @return ShardMemory 分片内存大小，单位 GB
     */
    public Integer getShardMemory() {
        return this.ShardMemory;
    }

    /**
     * 设置分片内存大小，单位 GB
     * @param ShardMemory 分片内存大小，单位 GB
     */
    public void setShardMemory(Integer ShardMemory) {
        this.ShardMemory = ShardMemory;
    }

    /**
     * 获取分片存储大小，单位 GB
     * @return ShardStorage 分片存储大小，单位 GB
     */
    public Integer getShardStorage() {
        return this.ShardStorage;
    }

    /**
     * 设置分片存储大小，单位 GB
     * @param ShardStorage 分片存储大小，单位 GB
     */
    public void setShardStorage(Integer ShardStorage) {
        this.ShardStorage = ShardStorage;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamSimple(map, prefix + "ShardMemory", this.ShardMemory);
        this.setParamSimple(map, prefix + "ShardStorage", this.ShardStorage);

    }
}

