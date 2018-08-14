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

public class SplitShardConfig  extends AbstractModel{

    /**
    * 分片ID数组
    */
    @SerializedName("ShardInstanceIds")
    @Expose
    private String [] ShardInstanceIds;

    /**
    * 数据切分比例
    */
    @SerializedName("SplitRate")
    @Expose
    private Integer SplitRate;

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
     * 获取分片ID数组
     * @return ShardInstanceIds 分片ID数组
     */
    public String [] getShardInstanceIds() {
        return this.ShardInstanceIds;
    }

    /**
     * 设置分片ID数组
     * @param ShardInstanceIds 分片ID数组
     */
    public void setShardInstanceIds(String [] ShardInstanceIds) {
        this.ShardInstanceIds = ShardInstanceIds;
    }

    /**
     * 获取数据切分比例
     * @return SplitRate 数据切分比例
     */
    public Integer getSplitRate() {
        return this.SplitRate;
    }

    /**
     * 设置数据切分比例
     * @param SplitRate 数据切分比例
     */
    public void setSplitRate(Integer SplitRate) {
        this.SplitRate = SplitRate;
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
        this.setParamArraySimple(map, prefix + "ShardInstanceIds.", this.ShardInstanceIds);
        this.setParamSimple(map, prefix + "SplitRate", this.SplitRate);
        this.setParamSimple(map, prefix + "ShardMemory", this.ShardMemory);
        this.setParamSimple(map, prefix + "ShardStorage", this.ShardStorage);

    }
}

