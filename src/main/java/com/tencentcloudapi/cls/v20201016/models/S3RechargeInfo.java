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

public class S3RechargeInfo extends AbstractModel {

    /**
    * <p>导入任务Id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>日志主题Id。- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>s3存储桶</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>地域</p>
    */
    @SerializedName("S3Region")
    @Expose
    private String S3Region;

    /**
    * <p>访问密钥 ID（Access Key ID）</p>
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * <p>自定义端点</p>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * <p>采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文；默认为minimalist_log</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>s3文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。</p>
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * <p>压缩模式。支持: &quot;&quot;, &quot;gzip&quot;, &quot;lzop&quot;, &quot;snappy&quot;。</p><p>默认值：不压缩</p>
    */
    @SerializedName("Compress")
    @Expose
    private String Compress;

    /**
    * <p>提取规则，如果设置了ExtractRule，则必须设置LogType</p>
    */
    @SerializedName("ExtractRule")
    @Expose
    private ExtractRuleInfo ExtractRule;

    /**
    * <p>s3导入任务类型.</p><p>枚举值：</p><ul><li>1： 一次性导入任务</li><li>2： 持续性导入任务</li></ul>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>元数据。</p><p>枚举值：</p><ul><li>bucket： 桶</li><li>object： 对象</li></ul><p>选中元数据将以 <strong>TAG</strong>.{元数据}:xxx 的形式与日志一起导入。如：<strong>TAG</strong>.object: csv/object.gz</p>
    */
    @SerializedName("Metadata")
    @Expose
    private String [] Metadata;

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>0： 已创建</li><li>1： 运行中</li><li>2： 已停止</li><li>3： 已完成</li><li>4： 运行失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>是否启用</p><p>枚举值：</p><ul><li>0： 暂停</li><li>1： 启用</li></ul>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>进度条百分值</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>创建时间</p><p>单位：秒</p><p>秒级时间戳</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p><p>单位：秒</p><p>秒级时间戳</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get <p>导入任务Id</p> 
     * @return TaskId <p>导入任务Id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>导入任务Id</p>
     * @param TaskId <p>导入任务Id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>日志主题Id。- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</p> 
     * @return TopicId <p>日志主题Id。- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题Id。- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</p>
     * @param TopicId <p>日志主题Id。- 通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p> 
     * @return LogsetId <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p>
     * @param LogsetId <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>任务名称</p> 
     * @return Name <p>任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名称</p>
     * @param Name <p>任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>s3存储桶</p> 
     * @return Bucket <p>s3存储桶</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>s3存储桶</p>
     * @param Bucket <p>s3存储桶</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>地域</p> 
     * @return S3Region <p>地域</p>
     */
    public String getS3Region() {
        return this.S3Region;
    }

    /**
     * Set <p>地域</p>
     * @param S3Region <p>地域</p>
     */
    public void setS3Region(String S3Region) {
        this.S3Region = S3Region;
    }

    /**
     * Get <p>访问密钥 ID（Access Key ID）</p> 
     * @return AccessKeyId <p>访问密钥 ID（Access Key ID）</p>
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set <p>访问密钥 ID（Access Key ID）</p>
     * @param AccessKeyId <p>访问密钥 ID（Access Key ID）</p>
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get <p>自定义端点</p> 
     * @return Endpoint <p>自定义端点</p>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>自定义端点</p>
     * @param Endpoint <p>自定义端点</p>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get <p>采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文；默认为minimalist_log</p> 
     * @return LogType <p>采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文；默认为minimalist_log</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文；默认为minimalist_log</p>
     * @param LogType <p>采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表单行全文；默认为minimalist_log</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>s3文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。</p> 
     * @return Prefix <p>s3文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。</p>
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set <p>s3文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。</p>
     * @param Prefix <p>s3文件所在文件夹的前缀。默认为空，投递存储桶下所有的文件。</p>
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get <p>压缩模式。支持: &quot;&quot;, &quot;gzip&quot;, &quot;lzop&quot;, &quot;snappy&quot;。</p><p>默认值：不压缩</p> 
     * @return Compress <p>压缩模式。支持: &quot;&quot;, &quot;gzip&quot;, &quot;lzop&quot;, &quot;snappy&quot;。</p><p>默认值：不压缩</p>
     */
    public String getCompress() {
        return this.Compress;
    }

    /**
     * Set <p>压缩模式。支持: &quot;&quot;, &quot;gzip&quot;, &quot;lzop&quot;, &quot;snappy&quot;。</p><p>默认值：不压缩</p>
     * @param Compress <p>压缩模式。支持: &quot;&quot;, &quot;gzip&quot;, &quot;lzop&quot;, &quot;snappy&quot;。</p><p>默认值：不压缩</p>
     */
    public void setCompress(String Compress) {
        this.Compress = Compress;
    }

    /**
     * Get <p>提取规则，如果设置了ExtractRule，则必须设置LogType</p> 
     * @return ExtractRule <p>提取规则，如果设置了ExtractRule，则必须设置LogType</p>
     */
    public ExtractRuleInfo getExtractRule() {
        return this.ExtractRule;
    }

    /**
     * Set <p>提取规则，如果设置了ExtractRule，则必须设置LogType</p>
     * @param ExtractRule <p>提取规则，如果设置了ExtractRule，则必须设置LogType</p>
     */
    public void setExtractRule(ExtractRuleInfo ExtractRule) {
        this.ExtractRule = ExtractRule;
    }

    /**
     * Get <p>s3导入任务类型.</p><p>枚举值：</p><ul><li>1： 一次性导入任务</li><li>2： 持续性导入任务</li></ul> 
     * @return TaskType <p>s3导入任务类型.</p><p>枚举值：</p><ul><li>1： 一次性导入任务</li><li>2： 持续性导入任务</li></ul>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>s3导入任务类型.</p><p>枚举值：</p><ul><li>1： 一次性导入任务</li><li>2： 持续性导入任务</li></ul>
     * @param TaskType <p>s3导入任务类型.</p><p>枚举值：</p><ul><li>1： 一次性导入任务</li><li>2： 持续性导入任务</li></ul>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>元数据。</p><p>枚举值：</p><ul><li>bucket： 桶</li><li>object： 对象</li></ul><p>选中元数据将以 <strong>TAG</strong>.{元数据}:xxx 的形式与日志一起导入。如：<strong>TAG</strong>.object: csv/object.gz</p> 
     * @return Metadata <p>元数据。</p><p>枚举值：</p><ul><li>bucket： 桶</li><li>object： 对象</li></ul><p>选中元数据将以 <strong>TAG</strong>.{元数据}:xxx 的形式与日志一起导入。如：<strong>TAG</strong>.object: csv/object.gz</p>
     */
    public String [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>元数据。</p><p>枚举值：</p><ul><li>bucket： 桶</li><li>object： 对象</li></ul><p>选中元数据将以 <strong>TAG</strong>.{元数据}:xxx 的形式与日志一起导入。如：<strong>TAG</strong>.object: csv/object.gz</p>
     * @param Metadata <p>元数据。</p><p>枚举值：</p><ul><li>bucket： 桶</li><li>object： 对象</li></ul><p>选中元数据将以 <strong>TAG</strong>.{元数据}:xxx 的形式与日志一起导入。如：<strong>TAG</strong>.object: csv/object.gz</p>
     */
    public void setMetadata(String [] Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>0： 已创建</li><li>1： 运行中</li><li>2： 已停止</li><li>3： 已完成</li><li>4： 运行失败</li></ul> 
     * @return Status <p>任务状态</p><p>枚举值：</p><ul><li>0： 已创建</li><li>1： 运行中</li><li>2： 已停止</li><li>3： 已完成</li><li>4： 运行失败</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>0： 已创建</li><li>1： 运行中</li><li>2： 已停止</li><li>3： 已完成</li><li>4： 运行失败</li></ul>
     * @param Status <p>任务状态</p><p>枚举值：</p><ul><li>0： 已创建</li><li>1： 运行中</li><li>2： 已停止</li><li>3： 已完成</li><li>4： 运行失败</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否启用</p><p>枚举值：</p><ul><li>0： 暂停</li><li>1： 启用</li></ul> 
     * @return Enable <p>是否启用</p><p>枚举值：</p><ul><li>0： 暂停</li><li>1： 启用</li></ul>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否启用</p><p>枚举值：</p><ul><li>0： 暂停</li><li>1： 启用</li></ul>
     * @param Enable <p>是否启用</p><p>枚举值：</p><ul><li>0： 暂停</li><li>1： 启用</li></ul>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>进度条百分值</p> 
     * @return Progress <p>进度条百分值</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>进度条百分值</p>
     * @param Progress <p>进度条百分值</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>创建时间</p><p>单位：秒</p><p>秒级时间戳</p> 
     * @return CreateTime <p>创建时间</p><p>单位：秒</p><p>秒级时间戳</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p><p>单位：秒</p><p>秒级时间戳</p>
     * @param CreateTime <p>创建时间</p><p>单位：秒</p><p>秒级时间戳</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p><p>单位：秒</p><p>秒级时间戳</p> 
     * @return UpdateTime <p>更新时间</p><p>单位：秒</p><p>秒级时间戳</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p><p>单位：秒</p><p>秒级时间戳</p>
     * @param UpdateTime <p>更新时间</p><p>单位：秒</p><p>秒级时间戳</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public S3RechargeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public S3RechargeInfo(S3RechargeInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        if (source.S3Region != null) {
            this.S3Region = new String(source.S3Region);
        }
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
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
        if (source.ExtractRule != null) {
            this.ExtractRule = new ExtractRuleInfo(source.ExtractRule);
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "S3Region", this.S3Region);
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamObj(map, prefix + "ExtractRule.", this.ExtractRule);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "Metadata.", this.Metadata);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

