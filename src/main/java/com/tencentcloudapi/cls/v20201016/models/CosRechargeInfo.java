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

public class CosRechargeInfo extends AbstractModel {

    /**
    * COS导入配置ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 日志主题ID
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
    * COS导入任务名称
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
    * COS存储桶所在地域。

- 通过[地域和访问域名](https://cloud.tencent.com/document/product/436/6224)获取地域信息。
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
    * 状态   status 0: 已创建, 1: 运行中, 2: 已停止, 3: 已完成, 4: 运行失败。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否启用:   0： 未启用  ， 1：启用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 创建时间。时间格式：YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间。时间格式：YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 进度条百分值
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 压缩方式supported: "", "gzip", "lzop", "snappy”;  默认空不压缩
    */
    @SerializedName("Compress")
    @Expose
    private String Compress;

    /**
    * 见： ExtractRuleInfo 结构描述
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
     * Get COS导入配置ID 
     * @return Id COS导入配置ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set COS导入配置ID
     * @param Id COS导入配置ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 日志主题ID 
     * @return TopicId 日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
     * @param TopicId 日志主题ID
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
     * Get COS存储桶所在地域。

- 通过[地域和访问域名](https://cloud.tencent.com/document/product/436/6224)获取地域信息。 
     * @return BucketRegion COS存储桶所在地域。

- 通过[地域和访问域名](https://cloud.tencent.com/document/product/436/6224)获取地域信息。
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set COS存储桶所在地域。

- 通过[地域和访问域名](https://cloud.tencent.com/document/product/436/6224)获取地域信息。
     * @param BucketRegion COS存储桶所在地域。

- 通过[地域和访问域名](https://cloud.tencent.com/document/product/436/6224)获取地域信息。
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
     * Get 状态   status 0: 已创建, 1: 运行中, 2: 已停止, 3: 已完成, 4: 运行失败。 
     * @return Status 状态   status 0: 已创建, 1: 运行中, 2: 已停止, 3: 已完成, 4: 运行失败。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态   status 0: 已创建, 1: 运行中, 2: 已停止, 3: 已完成, 4: 运行失败。
     * @param Status 状态   status 0: 已创建, 1: 运行中, 2: 已停止, 3: 已完成, 4: 运行失败。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否启用:   0： 未启用  ， 1：启用 
     * @return Enable 是否启用:   0： 未启用  ， 1：启用
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用:   0： 未启用  ， 1：启用
     * @param Enable 是否启用:   0： 未启用  ， 1：启用
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 创建时间。时间格式：YYYY-MM-DD HH:mm:ss 
     * @return CreateTime 创建时间。时间格式：YYYY-MM-DD HH:mm:ss
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。时间格式：YYYY-MM-DD HH:mm:ss
     * @param CreateTime 创建时间。时间格式：YYYY-MM-DD HH:mm:ss
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间。时间格式：YYYY-MM-DD HH:mm:ss 
     * @return UpdateTime 更新时间。时间格式：YYYY-MM-DD HH:mm:ss
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。时间格式：YYYY-MM-DD HH:mm:ss
     * @param UpdateTime 更新时间。时间格式：YYYY-MM-DD HH:mm:ss
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 进度条百分值 
     * @return Progress 进度条百分值
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 进度条百分值
     * @param Progress 进度条百分值
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 压缩方式supported: "", "gzip", "lzop", "snappy”;  默认空不压缩 
     * @return Compress 压缩方式supported: "", "gzip", "lzop", "snappy”;  默认空不压缩
     */
    public String getCompress() {
        return this.Compress;
    }

    /**
     * Set 压缩方式supported: "", "gzip", "lzop", "snappy”;  默认空不压缩
     * @param Compress 压缩方式supported: "", "gzip", "lzop", "snappy”;  默认空不压缩
     */
    public void setCompress(String Compress) {
        this.Compress = Compress;
    }

    /**
     * Get 见： ExtractRuleInfo 结构描述 
     * @return ExtractRuleInfo 见： ExtractRuleInfo 结构描述
     */
    public ExtractRuleInfo getExtractRuleInfo() {
        return this.ExtractRuleInfo;
    }

    /**
     * Set 见： ExtractRuleInfo 结构描述
     * @param ExtractRuleInfo 见： ExtractRuleInfo 结构描述
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

    public CosRechargeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosRechargeInfo(CosRechargeInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
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
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamObj(map, prefix + "ExtractRuleInfo.", this.ExtractRuleInfo);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "Metadata.", this.Metadata);

    }
}

