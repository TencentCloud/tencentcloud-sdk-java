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

public class AddShardConfig extends AbstractModel {

    /**
    * <p>新增分片的数量</p>
    */
    @SerializedName("ShardCount")
    @Expose
    private Long ShardCount;

    /**
    * <p>分片内存大小，单位 GB</p>
    */
    @SerializedName("ShardMemory")
    @Expose
    private Long ShardMemory;

    /**
    * <p>分片存储大小，单位 GB</p>
    */
    @SerializedName("ShardStorage")
    @Expose
    private Long ShardStorage;

    /**
    * <p>DCN实例的规格</p>
    */
    @SerializedName("DcnInsShardConfigs")
    @Expose
    private DcnInsShardConfig [] DcnInsShardConfigs;

    /**
     * Get <p>新增分片的数量</p> 
     * @return ShardCount <p>新增分片的数量</p>
     */
    public Long getShardCount() {
        return this.ShardCount;
    }

    /**
     * Set <p>新增分片的数量</p>
     * @param ShardCount <p>新增分片的数量</p>
     */
    public void setShardCount(Long ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * Get <p>分片内存大小，单位 GB</p> 
     * @return ShardMemory <p>分片内存大小，单位 GB</p>
     */
    public Long getShardMemory() {
        return this.ShardMemory;
    }

    /**
     * Set <p>分片内存大小，单位 GB</p>
     * @param ShardMemory <p>分片内存大小，单位 GB</p>
     */
    public void setShardMemory(Long ShardMemory) {
        this.ShardMemory = ShardMemory;
    }

    /**
     * Get <p>分片存储大小，单位 GB</p> 
     * @return ShardStorage <p>分片存储大小，单位 GB</p>
     */
    public Long getShardStorage() {
        return this.ShardStorage;
    }

    /**
     * Set <p>分片存储大小，单位 GB</p>
     * @param ShardStorage <p>分片存储大小，单位 GB</p>
     */
    public void setShardStorage(Long ShardStorage) {
        this.ShardStorage = ShardStorage;
    }

    /**
     * Get <p>DCN实例的规格</p> 
     * @return DcnInsShardConfigs <p>DCN实例的规格</p>
     */
    public DcnInsShardConfig [] getDcnInsShardConfigs() {
        return this.DcnInsShardConfigs;
    }

    /**
     * Set <p>DCN实例的规格</p>
     * @param DcnInsShardConfigs <p>DCN实例的规格</p>
     */
    public void setDcnInsShardConfigs(DcnInsShardConfig [] DcnInsShardConfigs) {
        this.DcnInsShardConfigs = DcnInsShardConfigs;
    }

    public AddShardConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddShardConfig(AddShardConfig source) {
        if (source.ShardCount != null) {
            this.ShardCount = new Long(source.ShardCount);
        }
        if (source.ShardMemory != null) {
            this.ShardMemory = new Long(source.ShardMemory);
        }
        if (source.ShardStorage != null) {
            this.ShardStorage = new Long(source.ShardStorage);
        }
        if (source.DcnInsShardConfigs != null) {
            this.DcnInsShardConfigs = new DcnInsShardConfig[source.DcnInsShardConfigs.length];
            for (int i = 0; i < source.DcnInsShardConfigs.length; i++) {
                this.DcnInsShardConfigs[i] = new DcnInsShardConfig(source.DcnInsShardConfigs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamSimple(map, prefix + "ShardMemory", this.ShardMemory);
        this.setParamSimple(map, prefix + "ShardStorage", this.ShardStorage);
        this.setParamArrayObj(map, prefix + "DcnInsShardConfigs.", this.DcnInsShardConfigs);

    }
}

