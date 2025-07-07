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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCosRechargeRequest extends AbstractModel {

    /**
    * COS导入配置Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 日志主题Id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * COS导入任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务状态   0： 停用 ， 1：启用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * COS存储桶所在地域，详见产品支持的[地域列表](https://cloud.tencent.com/document/product/436/6224)。
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * COS文件所在文件夹的前缀。为空串时投递存储桶下所有的文件。
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文； 默认为minimalist_log
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 解析格式。supported: "", "gzip", "lzop", "snappy"; 默认空
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
    * COS导入任务类型。1：一次性导入任务；2：持续性导入任务。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 元数据。支持 bucket，object。
    */
    @SerializedName("Metadata")
    @Expose
    private String [] Metadata;

    /**
     * Get COS导入配置Id 
     * @return Id COS导入配置Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set COS导入配置Id
     * @param Id COS导入配置Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 日志主题Id 
     * @return TopicId 日志主题Id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题Id
     * @param TopicId 日志主题Id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get COS导入任务名称 
     * @return Name COS导入任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set COS导入任务名称
     * @param Name COS导入任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务状态   0： 停用 ， 1：启用 
     * @return Enable 任务状态   0： 停用 ， 1：启用
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 任务状态   0： 停用 ， 1：启用
     * @param Enable 任务状态   0： 停用 ， 1：启用
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	 
     * @return Bucket COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	
     * @param Bucket COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get COS存储桶所在地域，详见产品支持的[地域列表](https://cloud.tencent.com/document/product/436/6224)。 
     * @return BucketRegion COS存储桶所在地域，详见产品支持的[地域列表](https://cloud.tencent.com/document/product/436/6224)。
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set COS存储桶所在地域，详见产品支持的[地域列表](https://cloud.tencent.com/document/product/436/6224)。
     * @param BucketRegion COS存储桶所在地域，详见产品支持的[地域列表](https://cloud.tencent.com/document/product/436/6224)。
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get COS文件所在文件夹的前缀。为空串时投递存储桶下所有的文件。 
     * @return Prefix COS文件所在文件夹的前缀。为空串时投递存储桶下所有的文件。
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set COS文件所在文件夹的前缀。为空串时投递存储桶下所有的文件。
     * @param Prefix COS文件所在文件夹的前缀。为空串时投递存储桶下所有的文件。
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文； 默认为minimalist_log 
     * @return LogType 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文； 默认为minimalist_log
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文； 默认为minimalist_log
     * @param LogType 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文； 默认为minimalist_log
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 解析格式。supported: "", "gzip", "lzop", "snappy"; 默认空 
     * @return Compress 解析格式。supported: "", "gzip", "lzop", "snappy"; 默认空
     */
    public String getCompress() {
        return this.Compress;
    }

    /**
     * Set 解析格式。supported: "", "gzip", "lzop", "snappy"; 默认空
     * @param Compress 解析格式。supported: "", "gzip", "lzop", "snappy"; 默认空
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

    /**
     * Get COS导入任务类型。1：一次性导入任务；2：持续性导入任务。 
     * @return TaskType COS导入任务类型。1：一次性导入任务；2：持续性导入任务。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set COS导入任务类型。1：一次性导入任务；2：持续性导入任务。
     * @param TaskType COS导入任务类型。1：一次性导入任务；2：持续性导入任务。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 元数据。支持 bucket，object。 
     * @return Metadata 元数据。支持 bucket，object。
     */
    public String [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 元数据。支持 bucket，object。
     * @param Metadata 元数据。支持 bucket，object。
     */
    public void setMetadata(String [] Metadata) {
        this.Metadata = Metadata;
    }

    public ModifyCosRechargeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCosRechargeRequest(ModifyCosRechargeRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
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
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.Metadata != null) {
            this.Metadata = new String[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new String(source.Metadata[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamObj(map, prefix + "ExtractRuleInfo.", this.ExtractRuleInfo);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "Metadata.", this.Metadata);

    }
}

