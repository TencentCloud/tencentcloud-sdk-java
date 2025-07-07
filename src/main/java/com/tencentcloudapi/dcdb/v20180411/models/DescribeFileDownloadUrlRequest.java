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

public class DescribeFileDownloadUrlRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例分片ID
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
    * 不带签名的文件路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例分片ID 
     * @return ShardId 实例分片ID
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * Set 实例分片ID
     * @param ShardId 实例分片ID
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get 不带签名的文件路径 
     * @return FilePath 不带签名的文件路径
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 不带签名的文件路径
     * @param FilePath 不带签名的文件路径
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    public DescribeFileDownloadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileDownloadUrlRequest(DescribeFileDownloadUrlRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ShardId != null) {
            this.ShardId = new String(source.ShardId);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);

    }
}

