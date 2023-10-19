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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchCosRechargeInfoRequest extends AbstractModel {

    /**
    * 日志主题 ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 投递任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 存储桶
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 存储桶所在地域
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * cos文件所在文件夹的前缀
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * 压缩模式:   "", "gzip", "lzop", "snappy”;   默认""
    */
    @SerializedName("Compress")
    @Expose
    private String Compress;

    /**
     * Get 日志主题 ID 
     * @return TopicId 日志主题 ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题 ID
     * @param TopicId 日志主题 ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志集ID 
     * @return LogsetId 日志集ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集ID
     * @param LogsetId 日志集ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 投递任务名称 
     * @return Name 投递任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 投递任务名称
     * @param Name 投递任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 存储桶 
     * @return Bucket 存储桶
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 存储桶
     * @param Bucket 存储桶
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 存储桶所在地域 
     * @return BucketRegion 存储桶所在地域
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set 存储桶所在地域
     * @param BucketRegion 存储桶所在地域
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get cos文件所在文件夹的前缀 
     * @return Prefix cos文件所在文件夹的前缀
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set cos文件所在文件夹的前缀
     * @param Prefix cos文件所在文件夹的前缀
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get 压缩模式:   "", "gzip", "lzop", "snappy”;   默认"" 
     * @return Compress 压缩模式:   "", "gzip", "lzop", "snappy”;   默认""
     */
    public String getCompress() {
        return this.Compress;
    }

    /**
     * Set 压缩模式:   "", "gzip", "lzop", "snappy”;   默认""
     * @param Compress 压缩模式:   "", "gzip", "lzop", "snappy”;   默认""
     */
    public void setCompress(String Compress) {
        this.Compress = Compress;
    }

    public SearchCosRechargeInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchCosRechargeInfoRequest(SearchCosRechargeInfoRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.Compress != null) {
            this.Compress = new String(source.Compress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Compress", this.Compress);

    }
}

