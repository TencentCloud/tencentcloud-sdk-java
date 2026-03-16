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

public class ShipperInfo extends AbstractModel {

    /**
    * <p>投递规则ID</p>
    */
    @SerializedName("ShipperId")
    @Expose
    private String ShipperId;

    /**
    * <p>日志主题ID</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>投递的bucket地址</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>投递的前缀目录</p>
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * <p>投递规则的名字</p>
    */
    @SerializedName("ShipperName")
    @Expose
    private String ShipperName;

    /**
    * <p>投递的时间间隔，单位 秒</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>投递的文件的最大值，单位 MB</p>
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * <p>是否生效</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>投递日志的过滤规则</p>
    */
    @SerializedName("FilterRules")
    @Expose
    private FilterRuleInfo [] FilterRules;

    /**
    * <p>投递日志的分区规则，支持strftime的时间格式表示</p>
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * <p>投递日志的压缩配置</p>
    */
    @SerializedName("Compress")
    @Expose
    private CompressInfo Compress;

    /**
    * <p>投递日志的内容格式配置</p>
    */
    @SerializedName("Content")
    @Expose
    private ContentInfo Content;

    /**
    * <p>投递日志的创建时间。格式：YYYY-MM-DD HH:MM:SS</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名）</p>
    */
    @SerializedName("FilenameMode")
    @Expose
    private Long FilenameMode;

    /**
    * <p>投递数据范围的开始时间点</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>投递数据范围的结束时间点</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>历史数据投递的进度（仅当用户选择的数据内中历史数据时才有效）</p>
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * <p>历史数据全部投递完成剩余的时间（仅当用户选择的数据中有历史数据时才有效）</p><p>单位：秒</p>
    */
    @SerializedName("RemainTime")
    @Expose
    private Long RemainTime;

    /**
    * <p>历史任务状态：<br>0：实时任务<br>1：任务准备中<br>2：任务运行中<br>3：任务运行异常<br>4：任务运行结束</p>
    */
    @SerializedName("HistoryStatus")
    @Expose
    private Long HistoryStatus;

    /**
    * <p>对象存储类型，默认值为 STANDARD。枚举值请参见<a href="https://cloud.tencent.com/document/product/436/33417"> 存储类型概述</a> 文档。<br>参考值有：<br>STANDARD：标准存储<br>STANDARD_IA：低频存储<br>ARCHIVE：归档存储<br>DEEP_ARCHIVE：深度归档存储<br>MAZ_STANDARD：标准存储（多 AZ）<br>MAZ_STANDARD_IA：低频存储（多 AZ）<br>INTELLIGENT_TIERING：智能分层存储<br>MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ）</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * <p>外部ID</p>
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
    * <p>任务运行状态。支持<code>0</code>,<code>1</code>,<code>2</code></p><ul><li><code>0</code>: 停止</li><li><code>1</code>: 运行中</li><li><code>2</code>: 异常</li></ul>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
     * Get <p>投递规则ID</p> 
     * @return ShipperId <p>投递规则ID</p>
     */
    public String getShipperId() {
        return this.ShipperId;
    }

    /**
     * Set <p>投递规则ID</p>
     * @param ShipperId <p>投递规则ID</p>
     */
    public void setShipperId(String ShipperId) {
        this.ShipperId = ShipperId;
    }

    /**
     * Get <p>日志主题ID</p> 
     * @return TopicId <p>日志主题ID</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题ID</p>
     * @param TopicId <p>日志主题ID</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>投递的bucket地址</p> 
     * @return Bucket <p>投递的bucket地址</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>投递的bucket地址</p>
     * @param Bucket <p>投递的bucket地址</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>投递的前缀目录</p> 
     * @return Prefix <p>投递的前缀目录</p>
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set <p>投递的前缀目录</p>
     * @param Prefix <p>投递的前缀目录</p>
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get <p>投递规则的名字</p> 
     * @return ShipperName <p>投递规则的名字</p>
     */
    public String getShipperName() {
        return this.ShipperName;
    }

    /**
     * Set <p>投递规则的名字</p>
     * @param ShipperName <p>投递规则的名字</p>
     */
    public void setShipperName(String ShipperName) {
        this.ShipperName = ShipperName;
    }

    /**
     * Get <p>投递的时间间隔，单位 秒</p> 
     * @return Interval <p>投递的时间间隔，单位 秒</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>投递的时间间隔，单位 秒</p>
     * @param Interval <p>投递的时间间隔，单位 秒</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>投递的文件的最大值，单位 MB</p> 
     * @return MaxSize <p>投递的文件的最大值，单位 MB</p>
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set <p>投递的文件的最大值，单位 MB</p>
     * @param MaxSize <p>投递的文件的最大值，单位 MB</p>
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get <p>是否生效</p> 
     * @return Status <p>是否生效</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>是否生效</p>
     * @param Status <p>是否生效</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>投递日志的过滤规则</p> 
     * @return FilterRules <p>投递日志的过滤规则</p>
     */
    public FilterRuleInfo [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set <p>投递日志的过滤规则</p>
     * @param FilterRules <p>投递日志的过滤规则</p>
     */
    public void setFilterRules(FilterRuleInfo [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    /**
     * Get <p>投递日志的分区规则，支持strftime的时间格式表示</p> 
     * @return Partition <p>投递日志的分区规则，支持strftime的时间格式表示</p>
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set <p>投递日志的分区规则，支持strftime的时间格式表示</p>
     * @param Partition <p>投递日志的分区规则，支持strftime的时间格式表示</p>
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get <p>投递日志的压缩配置</p> 
     * @return Compress <p>投递日志的压缩配置</p>
     */
    public CompressInfo getCompress() {
        return this.Compress;
    }

    /**
     * Set <p>投递日志的压缩配置</p>
     * @param Compress <p>投递日志的压缩配置</p>
     */
    public void setCompress(CompressInfo Compress) {
        this.Compress = Compress;
    }

    /**
     * Get <p>投递日志的内容格式配置</p> 
     * @return Content <p>投递日志的内容格式配置</p>
     */
    public ContentInfo getContent() {
        return this.Content;
    }

    /**
     * Set <p>投递日志的内容格式配置</p>
     * @param Content <p>投递日志的内容格式配置</p>
     */
    public void setContent(ContentInfo Content) {
        this.Content = Content;
    }

    /**
     * Get <p>投递日志的创建时间。格式：YYYY-MM-DD HH:MM:SS</p> 
     * @return CreateTime <p>投递日志的创建时间。格式：YYYY-MM-DD HH:MM:SS</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>投递日志的创建时间。格式：YYYY-MM-DD HH:MM:SS</p>
     * @param CreateTime <p>投递日志的创建时间。格式：YYYY-MM-DD HH:MM:SS</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名）</p> 
     * @return FilenameMode <p>投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名）</p>
     */
    public Long getFilenameMode() {
        return this.FilenameMode;
    }

    /**
     * Set <p>投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名）</p>
     * @param FilenameMode <p>投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名）</p>
     */
    public void setFilenameMode(Long FilenameMode) {
        this.FilenameMode = FilenameMode;
    }

    /**
     * Get <p>投递数据范围的开始时间点</p> 
     * @return StartTime <p>投递数据范围的开始时间点</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>投递数据范围的开始时间点</p>
     * @param StartTime <p>投递数据范围的开始时间点</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>投递数据范围的结束时间点</p> 
     * @return EndTime <p>投递数据范围的结束时间点</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>投递数据范围的结束时间点</p>
     * @param EndTime <p>投递数据范围的结束时间点</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>历史数据投递的进度（仅当用户选择的数据内中历史数据时才有效）</p> 
     * @return Progress <p>历史数据投递的进度（仅当用户选择的数据内中历史数据时才有效）</p>
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>历史数据投递的进度（仅当用户选择的数据内中历史数据时才有效）</p>
     * @param Progress <p>历史数据投递的进度（仅当用户选择的数据内中历史数据时才有效）</p>
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>历史数据全部投递完成剩余的时间（仅当用户选择的数据中有历史数据时才有效）</p><p>单位：秒</p> 
     * @return RemainTime <p>历史数据全部投递完成剩余的时间（仅当用户选择的数据中有历史数据时才有效）</p><p>单位：秒</p>
     */
    public Long getRemainTime() {
        return this.RemainTime;
    }

    /**
     * Set <p>历史数据全部投递完成剩余的时间（仅当用户选择的数据中有历史数据时才有效）</p><p>单位：秒</p>
     * @param RemainTime <p>历史数据全部投递完成剩余的时间（仅当用户选择的数据中有历史数据时才有效）</p><p>单位：秒</p>
     */
    public void setRemainTime(Long RemainTime) {
        this.RemainTime = RemainTime;
    }

    /**
     * Get <p>历史任务状态：<br>0：实时任务<br>1：任务准备中<br>2：任务运行中<br>3：任务运行异常<br>4：任务运行结束</p> 
     * @return HistoryStatus <p>历史任务状态：<br>0：实时任务<br>1：任务准备中<br>2：任务运行中<br>3：任务运行异常<br>4：任务运行结束</p>
     */
    public Long getHistoryStatus() {
        return this.HistoryStatus;
    }

    /**
     * Set <p>历史任务状态：<br>0：实时任务<br>1：任务准备中<br>2：任务运行中<br>3：任务运行异常<br>4：任务运行结束</p>
     * @param HistoryStatus <p>历史任务状态：<br>0：实时任务<br>1：任务准备中<br>2：任务运行中<br>3：任务运行异常<br>4：任务运行结束</p>
     */
    public void setHistoryStatus(Long HistoryStatus) {
        this.HistoryStatus = HistoryStatus;
    }

    /**
     * Get <p>对象存储类型，默认值为 STANDARD。枚举值请参见<a href="https://cloud.tencent.com/document/product/436/33417"> 存储类型概述</a> 文档。<br>参考值有：<br>STANDARD：标准存储<br>STANDARD_IA：低频存储<br>ARCHIVE：归档存储<br>DEEP_ARCHIVE：深度归档存储<br>MAZ_STANDARD：标准存储（多 AZ）<br>MAZ_STANDARD_IA：低频存储（多 AZ）<br>INTELLIGENT_TIERING：智能分层存储<br>MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ）</p> 
     * @return StorageType <p>对象存储类型，默认值为 STANDARD。枚举值请参见<a href="https://cloud.tencent.com/document/product/436/33417"> 存储类型概述</a> 文档。<br>参考值有：<br>STANDARD：标准存储<br>STANDARD_IA：低频存储<br>ARCHIVE：归档存储<br>DEEP_ARCHIVE：深度归档存储<br>MAZ_STANDARD：标准存储（多 AZ）<br>MAZ_STANDARD_IA：低频存储（多 AZ）<br>INTELLIGENT_TIERING：智能分层存储<br>MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ）</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>对象存储类型，默认值为 STANDARD。枚举值请参见<a href="https://cloud.tencent.com/document/product/436/33417"> 存储类型概述</a> 文档。<br>参考值有：<br>STANDARD：标准存储<br>STANDARD_IA：低频存储<br>ARCHIVE：归档存储<br>DEEP_ARCHIVE：深度归档存储<br>MAZ_STANDARD：标准存储（多 AZ）<br>MAZ_STANDARD_IA：低频存储（多 AZ）<br>INTELLIGENT_TIERING：智能分层存储<br>MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ）</p>
     * @param StorageType <p>对象存储类型，默认值为 STANDARD。枚举值请参见<a href="https://cloud.tencent.com/document/product/436/33417"> 存储类型概述</a> 文档。<br>参考值有：<br>STANDARD：标准存储<br>STANDARD_IA：低频存储<br>ARCHIVE：归档存储<br>DEEP_ARCHIVE：深度归档存储<br>MAZ_STANDARD：标准存储（多 AZ）<br>MAZ_STANDARD_IA：低频存储（多 AZ）<br>INTELLIGENT_TIERING：智能分层存储<br>MAZ_INTELLIGENT_TIERING：智能分层存储（多 AZ）</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p> 
     * @return RoleArn <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
     * @param RoleArn <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get <p>外部ID</p> 
     * @return ExternalId <p>外部ID</p>
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set <p>外部ID</p>
     * @param ExternalId <p>外部ID</p>
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    /**
     * Get <p>任务运行状态。支持<code>0</code>,<code>1</code>,<code>2</code></p><ul><li><code>0</code>: 停止</li><li><code>1</code>: 运行中</li><li><code>2</code>: 异常</li></ul> 
     * @return TaskStatus <p>任务运行状态。支持<code>0</code>,<code>1</code>,<code>2</code></p><ul><li><code>0</code>: 停止</li><li><code>1</code>: 运行中</li><li><code>2</code>: 异常</li></ul>
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>任务运行状态。支持<code>0</code>,<code>1</code>,<code>2</code></p><ul><li><code>0</code>: 停止</li><li><code>1</code>: 运行中</li><li><code>2</code>: 异常</li></ul>
     * @param TaskStatus <p>任务运行状态。支持<code>0</code>,<code>1</code>,<code>2</code></p><ul><li><code>0</code>: 停止</li><li><code>1</code>: 运行中</li><li><code>2</code>: 异常</li></ul>
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public ShipperInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShipperInfo(ShipperInfo source) {
        if (source.ShipperId != null) {
            this.ShipperId = new String(source.ShipperId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.ShipperName != null) {
            this.ShipperName = new String(source.ShipperName);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.FilterRules != null) {
            this.FilterRules = new FilterRuleInfo[source.FilterRules.length];
            for (int i = 0; i < source.FilterRules.length; i++) {
                this.FilterRules[i] = new FilterRuleInfo(source.FilterRules[i]);
            }
        }
        if (source.Partition != null) {
            this.Partition = new String(source.Partition);
        }
        if (source.Compress != null) {
            this.Compress = new CompressInfo(source.Compress);
        }
        if (source.Content != null) {
            this.Content = new ContentInfo(source.Content);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.FilenameMode != null) {
            this.FilenameMode = new Long(source.FilenameMode);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.RemainTime != null) {
            this.RemainTime = new Long(source.RemainTime);
        }
        if (source.HistoryStatus != null) {
            this.HistoryStatus = new Long(source.HistoryStatus);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShipperId", this.ShipperId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "ShipperName", this.ShipperName);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "FilterRules.", this.FilterRules);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamObj(map, prefix + "Compress.", this.Compress);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "FilenameMode", this.FilenameMode);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "RemainTime", this.RemainTime);
        this.setParamSimple(map, prefix + "HistoryStatus", this.HistoryStatus);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);

    }
}

