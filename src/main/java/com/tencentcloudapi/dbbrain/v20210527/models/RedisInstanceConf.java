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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisInstanceConf extends AbstractModel {

    /**
    * 副本数量
    */
    @SerializedName("ReplicasNum")
    @Expose
    private String ReplicasNum;

    /**
    * 分片数量
    */
    @SerializedName("ShardNum")
    @Expose
    private String ShardNum;

    /**
    * 分片内存大小，单位MB
    */
    @SerializedName("ShardSize")
    @Expose
    private String ShardSize;

    /**
     * Get 副本数量 
     * @return ReplicasNum 副本数量
     */
    public String getReplicasNum() {
        return this.ReplicasNum;
    }

    /**
     * Set 副本数量
     * @param ReplicasNum 副本数量
     */
    public void setReplicasNum(String ReplicasNum) {
        this.ReplicasNum = ReplicasNum;
    }

    /**
     * Get 分片数量 
     * @return ShardNum 分片数量
     */
    public String getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set 分片数量
     * @param ShardNum 分片数量
     */
    public void setShardNum(String ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get 分片内存大小，单位MB 
     * @return ShardSize 分片内存大小，单位MB
     */
    public String getShardSize() {
        return this.ShardSize;
    }

    /**
     * Set 分片内存大小，单位MB
     * @param ShardSize 分片内存大小，单位MB
     */
    public void setShardSize(String ShardSize) {
        this.ShardSize = ShardSize;
    }

    public RedisInstanceConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisInstanceConf(RedisInstanceConf source) {
        if (source.ReplicasNum != null) {
            this.ReplicasNum = new String(source.ReplicasNum);
        }
        if (source.ShardNum != null) {
            this.ShardNum = new String(source.ShardNum);
        }
        if (source.ShardSize != null) {
            this.ShardSize = new String(source.ShardSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicasNum", this.ReplicasNum);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamSimple(map, prefix + "ShardSize", this.ShardSize);

    }
}

