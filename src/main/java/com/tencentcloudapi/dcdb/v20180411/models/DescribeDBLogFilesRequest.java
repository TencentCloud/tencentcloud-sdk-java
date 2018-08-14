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

public class DescribeDBLogFilesRequest  extends AbstractModel{

    /**
    * 实例 ID，形如：dcdbt-ow7t8lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分片 ID，形如：shard-7noic7tv
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
    * 请求日志类型，取值只能为1、2、3或者4。1-binlog，2-冷备，3-errlog，4-slowlog。
    */
    @SerializedName("Type")
    @Expose
    private Integer Type;

    /**
     * 获取实例 ID，形如：dcdbt-ow7t8lmc。
     * @return InstanceId 实例 ID，形如：dcdbt-ow7t8lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例 ID，形如：dcdbt-ow7t8lmc。
     * @param InstanceId 实例 ID，形如：dcdbt-ow7t8lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取分片 ID，形如：shard-7noic7tv
     * @return ShardId 分片 ID，形如：shard-7noic7tv
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * 设置分片 ID，形如：shard-7noic7tv
     * @param ShardId 分片 ID，形如：shard-7noic7tv
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * 获取请求日志类型，取值只能为1、2、3或者4。1-binlog，2-冷备，3-errlog，4-slowlog。
     * @return Type 请求日志类型，取值只能为1、2、3或者4。1-binlog，2-冷备，3-errlog，4-slowlog。
     */
    public Integer getType() {
        return this.Type;
    }

    /**
     * 设置请求日志类型，取值只能为1、2、3或者4。1-binlog，2-冷备，3-errlog，4-slowlog。
     * @param Type 请求日志类型，取值只能为1、2、3或者4。1-binlog，2-冷备，3-errlog，4-slowlog。
     */
    public void setType(Integer Type) {
        this.Type = Type;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

