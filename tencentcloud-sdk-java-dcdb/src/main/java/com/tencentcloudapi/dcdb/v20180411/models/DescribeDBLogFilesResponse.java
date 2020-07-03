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

public class DescribeDBLogFilesResponse extends AbstractModel{

    /**
    * 实例 ID，形如：dcdbt-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 请求日志类型。1-binlog，2-冷备，3-errlog，4-slowlog。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 请求日志总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 日志文件列表
    */
    @SerializedName("Files")
    @Expose
    private LogFileInfo [] Files;

    /**
    * 如果是VPC网络的实例，做用本前缀加上URI为下载地址
    */
    @SerializedName("VpcPrefix")
    @Expose
    private String VpcPrefix;

    /**
    * 如果是普通网络的实例，做用本前缀加上URI为下载地址
    */
    @SerializedName("NormalPrefix")
    @Expose
    private String NormalPrefix;

    /**
    * 分片 ID，形如：shard-7noic7tv
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例 ID，形如：dcdbt-ow728lmc。 
     * @return InstanceId 实例 ID，形如：dcdbt-ow728lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，形如：dcdbt-ow728lmc。
     * @param InstanceId 实例 ID，形如：dcdbt-ow728lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 请求日志类型。1-binlog，2-冷备，3-errlog，4-slowlog。 
     * @return Type 请求日志类型。1-binlog，2-冷备，3-errlog，4-slowlog。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 请求日志类型。1-binlog，2-冷备，3-errlog，4-slowlog。
     * @param Type 请求日志类型。1-binlog，2-冷备，3-errlog，4-slowlog。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 请求日志总数 
     * @return Total 请求日志总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 请求日志总数
     * @param Total 请求日志总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 日志文件列表 
     * @return Files 日志文件列表
     */
    public LogFileInfo [] getFiles() {
        return this.Files;
    }

    /**
     * Set 日志文件列表
     * @param Files 日志文件列表
     */
    public void setFiles(LogFileInfo [] Files) {
        this.Files = Files;
    }

    /**
     * Get 如果是VPC网络的实例，做用本前缀加上URI为下载地址 
     * @return VpcPrefix 如果是VPC网络的实例，做用本前缀加上URI为下载地址
     */
    public String getVpcPrefix() {
        return this.VpcPrefix;
    }

    /**
     * Set 如果是VPC网络的实例，做用本前缀加上URI为下载地址
     * @param VpcPrefix 如果是VPC网络的实例，做用本前缀加上URI为下载地址
     */
    public void setVpcPrefix(String VpcPrefix) {
        this.VpcPrefix = VpcPrefix;
    }

    /**
     * Get 如果是普通网络的实例，做用本前缀加上URI为下载地址 
     * @return NormalPrefix 如果是普通网络的实例，做用本前缀加上URI为下载地址
     */
    public String getNormalPrefix() {
        return this.NormalPrefix;
    }

    /**
     * Set 如果是普通网络的实例，做用本前缀加上URI为下载地址
     * @param NormalPrefix 如果是普通网络的实例，做用本前缀加上URI为下载地址
     */
    public void setNormalPrefix(String NormalPrefix) {
        this.NormalPrefix = NormalPrefix;
    }

    /**
     * Get 分片 ID，形如：shard-7noic7tv 
     * @return ShardId 分片 ID，形如：shard-7noic7tv
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * Set 分片 ID，形如：shard-7noic7tv
     * @param ShardId 分片 ID，形如：shard-7noic7tv
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Files.", this.Files);
        this.setParamSimple(map, prefix + "VpcPrefix", this.VpcPrefix);
        this.setParamSimple(map, prefix + "NormalPrefix", this.NormalPrefix);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

