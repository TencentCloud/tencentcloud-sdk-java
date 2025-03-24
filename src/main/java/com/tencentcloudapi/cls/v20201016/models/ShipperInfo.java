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

public class ShipperInfo extends AbstractModel {

    /**
    * 投递规则ID
    */
    @SerializedName("ShipperId")
    @Expose
    private String ShipperId;

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 投递的bucket地址
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 投递的前缀目录
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * 投递规则的名字
    */
    @SerializedName("ShipperName")
    @Expose
    private String ShipperName;

    /**
    * 投递的时间间隔，单位 秒
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 投递的文件的最大值，单位 MB
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 是否生效
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 投递日志的过滤规则
    */
    @SerializedName("FilterRules")
    @Expose
    private FilterRuleInfo [] FilterRules;

    /**
    * 投递日志的分区规则，支持strftime的时间格式表示
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * 投递日志的压缩配置
    */
    @SerializedName("Compress")
    @Expose
    private CompressInfo Compress;

    /**
    * 投递日志的内容格式配置
    */
    @SerializedName("Content")
    @Expose
    private ContentInfo Content;

    /**
    * 投递日志的创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名）
    */
    @SerializedName("FilenameMode")
    @Expose
    private Long FilenameMode;

    /**
    * 投递数据范围的开始时间点
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 投递数据范围的结束时间点
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 历史数据投递的进度（仅当用户选择的数据内中历史数据时才有效）
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 历史数据全部投递完成剩余的时间（仅当用户选择的数据中有历史数据时才有效）
    */
    @SerializedName("RemainTime")
    @Expose
    private Long RemainTime;

    /**
    * 历史任务状态：
0：实时任务
1：任务准备中
2：任务运行中
3：任务运行异常
4：任务运行结束
    */
    @SerializedName("HistoryStatus")
    @Expose
    private Long HistoryStatus;

    /**
    * cos桶类型
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get 投递规则ID 
     * @return ShipperId 投递规则ID
     */
    public String getShipperId() {
        return this.ShipperId;
    }

    /**
     * Set 投递规则ID
     * @param ShipperId 投递规则ID
     */
    public void setShipperId(String ShipperId) {
        this.ShipperId = ShipperId;
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
     * Get 投递的bucket地址 
     * @return Bucket 投递的bucket地址
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 投递的bucket地址
     * @param Bucket 投递的bucket地址
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 投递的前缀目录 
     * @return Prefix 投递的前缀目录
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set 投递的前缀目录
     * @param Prefix 投递的前缀目录
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get 投递规则的名字 
     * @return ShipperName 投递规则的名字
     */
    public String getShipperName() {
        return this.ShipperName;
    }

    /**
     * Set 投递规则的名字
     * @param ShipperName 投递规则的名字
     */
    public void setShipperName(String ShipperName) {
        this.ShipperName = ShipperName;
    }

    /**
     * Get 投递的时间间隔，单位 秒 
     * @return Interval 投递的时间间隔，单位 秒
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 投递的时间间隔，单位 秒
     * @param Interval 投递的时间间隔，单位 秒
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 投递的文件的最大值，单位 MB 
     * @return MaxSize 投递的文件的最大值，单位 MB
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 投递的文件的最大值，单位 MB
     * @param MaxSize 投递的文件的最大值，单位 MB
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 是否生效 
     * @return Status 是否生效
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 是否生效
     * @param Status 是否生效
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 投递日志的过滤规则 
     * @return FilterRules 投递日志的过滤规则
     */
    public FilterRuleInfo [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set 投递日志的过滤规则
     * @param FilterRules 投递日志的过滤规则
     */
    public void setFilterRules(FilterRuleInfo [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    /**
     * Get 投递日志的分区规则，支持strftime的时间格式表示 
     * @return Partition 投递日志的分区规则，支持strftime的时间格式表示
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set 投递日志的分区规则，支持strftime的时间格式表示
     * @param Partition 投递日志的分区规则，支持strftime的时间格式表示
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get 投递日志的压缩配置 
     * @return Compress 投递日志的压缩配置
     */
    public CompressInfo getCompress() {
        return this.Compress;
    }

    /**
     * Set 投递日志的压缩配置
     * @param Compress 投递日志的压缩配置
     */
    public void setCompress(CompressInfo Compress) {
        this.Compress = Compress;
    }

    /**
     * Get 投递日志的内容格式配置 
     * @return Content 投递日志的内容格式配置
     */
    public ContentInfo getContent() {
        return this.Content;
    }

    /**
     * Set 投递日志的内容格式配置
     * @param Content 投递日志的内容格式配置
     */
    public void setContent(ContentInfo Content) {
        this.Content = Content;
    }

    /**
     * Get 投递日志的创建时间 
     * @return CreateTime 投递日志的创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 投递日志的创建时间
     * @param CreateTime 投递日志的创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名） 
     * @return FilenameMode 投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名）
     */
    public Long getFilenameMode() {
        return this.FilenameMode;
    }

    /**
     * Set 投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名）
     * @param FilenameMode 投递文件命名配置，0：随机数命名，1：投递时间命名，默认0（随机数命名）
     */
    public void setFilenameMode(Long FilenameMode) {
        this.FilenameMode = FilenameMode;
    }

    /**
     * Get 投递数据范围的开始时间点 
     * @return StartTime 投递数据范围的开始时间点
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 投递数据范围的开始时间点
     * @param StartTime 投递数据范围的开始时间点
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 投递数据范围的结束时间点 
     * @return EndTime 投递数据范围的结束时间点
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 投递数据范围的结束时间点
     * @param EndTime 投递数据范围的结束时间点
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 历史数据投递的进度（仅当用户选择的数据内中历史数据时才有效） 
     * @return Progress 历史数据投递的进度（仅当用户选择的数据内中历史数据时才有效）
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 历史数据投递的进度（仅当用户选择的数据内中历史数据时才有效）
     * @param Progress 历史数据投递的进度（仅当用户选择的数据内中历史数据时才有效）
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 历史数据全部投递完成剩余的时间（仅当用户选择的数据中有历史数据时才有效） 
     * @return RemainTime 历史数据全部投递完成剩余的时间（仅当用户选择的数据中有历史数据时才有效）
     */
    public Long getRemainTime() {
        return this.RemainTime;
    }

    /**
     * Set 历史数据全部投递完成剩余的时间（仅当用户选择的数据中有历史数据时才有效）
     * @param RemainTime 历史数据全部投递完成剩余的时间（仅当用户选择的数据中有历史数据时才有效）
     */
    public void setRemainTime(Long RemainTime) {
        this.RemainTime = RemainTime;
    }

    /**
     * Get 历史任务状态：
0：实时任务
1：任务准备中
2：任务运行中
3：任务运行异常
4：任务运行结束 
     * @return HistoryStatus 历史任务状态：
0：实时任务
1：任务准备中
2：任务运行中
3：任务运行异常
4：任务运行结束
     */
    public Long getHistoryStatus() {
        return this.HistoryStatus;
    }

    /**
     * Set 历史任务状态：
0：实时任务
1：任务准备中
2：任务运行中
3：任务运行异常
4：任务运行结束
     * @param HistoryStatus 历史任务状态：
0：实时任务
1：任务准备中
2：任务运行中
3：任务运行异常
4：任务运行结束
     */
    public void setHistoryStatus(Long HistoryStatus) {
        this.HistoryStatus = HistoryStatus;
    }

    /**
     * Get cos桶类型 
     * @return StorageType cos桶类型
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set cos桶类型
     * @param StorageType cos桶类型
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
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

    }
}

