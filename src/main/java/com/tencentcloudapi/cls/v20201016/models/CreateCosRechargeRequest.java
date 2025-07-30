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

public class CreateCosRechargeRequest extends AbstractModel {

    /**
    * 日志主题Id。

- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志集Id。

- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * COS导入任务名称,最大支持128个字节。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	

- 通过[GET Service（List Buckets）](https://cloud.tencent.com/document/product/436/8291)获取COS存储桶。
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
    * 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文；
默认为minimalist_log
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * COS文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * supported: "", "gzip", "lzop", "snappy"。默认空，不压缩。
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
    * COS导入任务类型。1：一次性导入任务；2：持续性导入任务。默认为1：一次性导入任务
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 元数据。
    */
    @SerializedName("Metadata")
    @Expose
    private String [] Metadata;

    /**
     * Get 日志主题Id。

- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。 
     * @return TopicId 日志主题Id。

- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题Id。

- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     * @param TopicId 日志主题Id。

- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志集Id。

- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。 
     * @return LogsetId 日志集Id。

- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集Id。

- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。
     * @param LogsetId 日志集Id。

- 通过[获取日志集列表](https://cloud.tencent.com/document/product/614/58624)获取日志集Id。
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get COS导入任务名称,最大支持128个字节。 
     * @return Name COS导入任务名称,最大支持128个字节。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set COS导入任务名称,最大支持128个字节。
     * @param Name COS导入任务名称,最大支持128个字节。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	

- 通过[GET Service（List Buckets）](https://cloud.tencent.com/document/product/436/8291)获取COS存储桶。 
     * @return Bucket COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	

- 通过[GET Service（List Buckets）](https://cloud.tencent.com/document/product/436/8291)获取COS存储桶。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	

- 通过[GET Service（List Buckets）](https://cloud.tencent.com/document/product/436/8291)获取COS存储桶。
     * @param Bucket COS存储桶，详见产品支持的[存储桶命名规范](https://cloud.tencent.com/document/product/436/13312)。	

- 通过[GET Service（List Buckets）](https://cloud.tencent.com/document/product/436/8291)获取COS存储桶。
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
     * Get COS文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。 
     * @return Prefix COS文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set COS文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。
     * @param Prefix COS文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get supported: "", "gzip", "lzop", "snappy"。默认空，不压缩。 
     * @return Compress supported: "", "gzip", "lzop", "snappy"。默认空，不压缩。
     */
    public String getCompress() {
        return this.Compress;
    }

    /**
     * Set supported: "", "gzip", "lzop", "snappy"。默认空，不压缩。
     * @param Compress supported: "", "gzip", "lzop", "snappy"。默认空，不压缩。
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
     * Get COS导入任务类型。1：一次性导入任务；2：持续性导入任务。默认为1：一次性导入任务 
     * @return TaskType COS导入任务类型。1：一次性导入任务；2：持续性导入任务。默认为1：一次性导入任务
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set COS导入任务类型。1：一次性导入任务；2：持续性导入任务。默认为1：一次性导入任务
     * @param TaskType COS导入任务类型。1：一次性导入任务；2：持续性导入任务。默认为1：一次性导入任务
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 元数据。 
     * @return Metadata 元数据。
     */
    public String [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 元数据。
     * @param Metadata 元数据。
     */
    public void setMetadata(String [] Metadata) {
        this.Metadata = Metadata;
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
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
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
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamObj(map, prefix + "ExtractRuleInfo.", this.ExtractRuleInfo);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "Metadata.", this.Metadata);

    }
}

