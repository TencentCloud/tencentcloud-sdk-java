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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCosRechargeRequest extends AbstractModel{

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
    * COS存储桶
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * COS存储桶所在地域
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * COS文件所在文件夹的前缀
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文；
默认为minimalist_log
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * supported: "", "gzip", "lzop", "snappy”; 默认空
    */
    @SerializedName("Compress")
    @Expose
    private String Compress;

    /**
    * 提取规则，如果设置了ExtractRule，则必须设置LogType
    */
    @SerializedName("ExtractRuleInfo")
    @Expose
    private ExtractRuleInfo ExtractRuleInfo;

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
     * Get COS存储桶 
     * @return Bucket COS存储桶
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS存储桶
     * @param Bucket COS存储桶
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get COS存储桶所在地域 
     * @return BucketRegion COS存储桶所在地域
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set COS存储桶所在地域
     * @param BucketRegion COS存储桶所在地域
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get COS文件所在文件夹的前缀 
     * @return Prefix COS文件所在文件夹的前缀
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set COS文件所在文件夹的前缀
     * @param Prefix COS文件所在文件夹的前缀
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文；
默认为minimalist_log 
     * @return LogType 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文；
默认为minimalist_log
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文；
默认为minimalist_log
     * @param LogType 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文；
默认为minimalist_log
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get supported: "", "gzip", "lzop", "snappy”; 默认空 
     * @return Compress supported: "", "gzip", "lzop", "snappy”; 默认空
     */
    public String getCompress() {
        return this.Compress;
    }

    /**
     * Set supported: "", "gzip", "lzop", "snappy”; 默认空
     * @param Compress supported: "", "gzip", "lzop", "snappy”; 默认空
     */
    public void setCompress(String Compress) {
        this.Compress = Compress;
    }

    /**
     * Get 提取规则，如果设置了ExtractRule，则必须设置LogType 
     * @return ExtractRuleInfo 提取规则，如果设置了ExtractRule，则必须设置LogType
     */
    public ExtractRuleInfo getExtractRuleInfo() {
        return this.ExtractRuleInfo;
    }

    /**
     * Set 提取规则，如果设置了ExtractRule，则必须设置LogType
     * @param ExtractRuleInfo 提取规则，如果设置了ExtractRule，则必须设置LogType
     */
    public void setExtractRuleInfo(ExtractRuleInfo ExtractRuleInfo) {
        this.ExtractRuleInfo = ExtractRuleInfo;
    }

    public CreateCosRechargeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCosRechargeRequest(CreateCosRechargeRequest source) {
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
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Compress != null) {
            this.Compress = new String(source.Compress);
        }
        if (source.ExtractRuleInfo != null) {
            this.ExtractRuleInfo = new ExtractRuleInfo(source.ExtractRuleInfo);
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
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamObj(map, prefix + "ExtractRuleInfo.", this.ExtractRuleInfo);

    }
}

