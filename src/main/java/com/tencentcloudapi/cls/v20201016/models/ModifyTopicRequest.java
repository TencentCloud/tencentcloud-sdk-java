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

public class ModifyTopicRequest extends AbstractModel {

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志主题名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，并且不能有重复的键值对。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 主题是否开启采集，true：开启采集；false：关闭采集。
控制台目前不支持修改此参数。
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 是否开启自动分裂
    */
    @SerializedName("AutoSplit")
    @Expose
    private Boolean AutoSplit;

    /**
    * 若开启最大分裂，该主题能够能够允许的最大分区数
    */
    @SerializedName("MaxSplitPartitions")
    @Expose
    private Long MaxSplitPartitions;

    /**
    * 生命周期，单位天，标准存储取值范围1\~3600，低频存储取值范围7\~3600。取值为3640时代表永久保存
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 日志主题描述
    */
    @SerializedName("Describes")
    @Expose
    private String Describes;

    /**
    * 0：关闭日志沉降。
非0：开启日志沉降后标准存储的天数。HotPeriod需要大于等于7，且小于Period。仅在StorageType为 hot 时生效
    */
    @SerializedName("HotPeriod")
    @Expose
    private Long HotPeriod;

    /**
    * 免鉴权开关。 false：关闭； true：开启。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。
    */
    @SerializedName("IsWebTracking")
    @Expose
    private Boolean IsWebTracking;

    /**
    * 日志主题扩展信息
    */
    @SerializedName("Extends")
    @Expose
    private TopicExtendInfo Extends;

    /**
    * 日志主题分区数量
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * 取消切换存储任务的id
    */
    @SerializedName("CancelTopicAsyncTaskID")
    @Expose
    private String CancelTopicAsyncTaskID;

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
     * Get 日志主题名称 
     * @return TopicName 日志主题名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志主题名称
     * @param TopicName 日志主题名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，并且不能有重复的键值对。 
     * @return Tags 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，并且不能有重复的键值对。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，并且不能有重复的键值对。
     * @param Tags 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，并且不能有重复的键值对。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 主题是否开启采集，true：开启采集；false：关闭采集。
控制台目前不支持修改此参数。 
     * @return Status 主题是否开启采集，true：开启采集；false：关闭采集。
控制台目前不支持修改此参数。
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 主题是否开启采集，true：开启采集；false：关闭采集。
控制台目前不支持修改此参数。
     * @param Status 主题是否开启采集，true：开启采集；false：关闭采集。
控制台目前不支持修改此参数。
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 是否开启自动分裂 
     * @return AutoSplit 是否开启自动分裂
     */
    public Boolean getAutoSplit() {
        return this.AutoSplit;
    }

    /**
     * Set 是否开启自动分裂
     * @param AutoSplit 是否开启自动分裂
     */
    public void setAutoSplit(Boolean AutoSplit) {
        this.AutoSplit = AutoSplit;
    }

    /**
     * Get 若开启最大分裂，该主题能够能够允许的最大分区数 
     * @return MaxSplitPartitions 若开启最大分裂，该主题能够能够允许的最大分区数
     */
    public Long getMaxSplitPartitions() {
        return this.MaxSplitPartitions;
    }

    /**
     * Set 若开启最大分裂，该主题能够能够允许的最大分区数
     * @param MaxSplitPartitions 若开启最大分裂，该主题能够能够允许的最大分区数
     */
    public void setMaxSplitPartitions(Long MaxSplitPartitions) {
        this.MaxSplitPartitions = MaxSplitPartitions;
    }

    /**
     * Get 生命周期，单位天，标准存储取值范围1\~3600，低频存储取值范围7\~3600。取值为3640时代表永久保存 
     * @return Period 生命周期，单位天，标准存储取值范围1\~3600，低频存储取值范围7\~3600。取值为3640时代表永久保存
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 生命周期，单位天，标准存储取值范围1\~3600，低频存储取值范围7\~3600。取值为3640时代表永久保存
     * @param Period 生命周期，单位天，标准存储取值范围1\~3600，低频存储取值范围7\~3600。取值为3640时代表永久保存
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 日志主题描述 
     * @return Describes 日志主题描述
     */
    public String getDescribes() {
        return this.Describes;
    }

    /**
     * Set 日志主题描述
     * @param Describes 日志主题描述
     */
    public void setDescribes(String Describes) {
        this.Describes = Describes;
    }

    /**
     * Get 0：关闭日志沉降。
非0：开启日志沉降后标准存储的天数。HotPeriod需要大于等于7，且小于Period。仅在StorageType为 hot 时生效 
     * @return HotPeriod 0：关闭日志沉降。
非0：开启日志沉降后标准存储的天数。HotPeriod需要大于等于7，且小于Period。仅在StorageType为 hot 时生效
     */
    public Long getHotPeriod() {
        return this.HotPeriod;
    }

    /**
     * Set 0：关闭日志沉降。
非0：开启日志沉降后标准存储的天数。HotPeriod需要大于等于7，且小于Period。仅在StorageType为 hot 时生效
     * @param HotPeriod 0：关闭日志沉降。
非0：开启日志沉降后标准存储的天数。HotPeriod需要大于等于7，且小于Period。仅在StorageType为 hot 时生效
     */
    public void setHotPeriod(Long HotPeriod) {
        this.HotPeriod = HotPeriod;
    }

    /**
     * Get 免鉴权开关。 false：关闭； true：开启。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。 
     * @return IsWebTracking 免鉴权开关。 false：关闭； true：开启。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。
     */
    public Boolean getIsWebTracking() {
        return this.IsWebTracking;
    }

    /**
     * Set 免鉴权开关。 false：关闭； true：开启。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。
     * @param IsWebTracking 免鉴权开关。 false：关闭； true：开启。
开启后将支持指定操作匿名访问该日志主题。详情请参见[日志主题](https://cloud.tencent.com/document/product/614/41035)。
     */
    public void setIsWebTracking(Boolean IsWebTracking) {
        this.IsWebTracking = IsWebTracking;
    }

    /**
     * Get 日志主题扩展信息 
     * @return Extends 日志主题扩展信息
     */
    public TopicExtendInfo getExtends() {
        return this.Extends;
    }

    /**
     * Set 日志主题扩展信息
     * @param Extends 日志主题扩展信息
     */
    public void setExtends(TopicExtendInfo Extends) {
        this.Extends = Extends;
    }

    /**
     * Get 日志主题分区数量 
     * @return PartitionCount 日志主题分区数量
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set 日志主题分区数量
     * @param PartitionCount 日志主题分区数量
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get 取消切换存储任务的id 
     * @return CancelTopicAsyncTaskID 取消切换存储任务的id
     */
    public String getCancelTopicAsyncTaskID() {
        return this.CancelTopicAsyncTaskID;
    }

    /**
     * Set 取消切换存储任务的id
     * @param CancelTopicAsyncTaskID 取消切换存储任务的id
     */
    public void setCancelTopicAsyncTaskID(String CancelTopicAsyncTaskID) {
        this.CancelTopicAsyncTaskID = CancelTopicAsyncTaskID;
    }

    public ModifyTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTopicRequest(ModifyTopicRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.AutoSplit != null) {
            this.AutoSplit = new Boolean(source.AutoSplit);
        }
        if (source.MaxSplitPartitions != null) {
            this.MaxSplitPartitions = new Long(source.MaxSplitPartitions);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Describes != null) {
            this.Describes = new String(source.Describes);
        }
        if (source.HotPeriod != null) {
            this.HotPeriod = new Long(source.HotPeriod);
        }
        if (source.IsWebTracking != null) {
            this.IsWebTracking = new Boolean(source.IsWebTracking);
        }
        if (source.Extends != null) {
            this.Extends = new TopicExtendInfo(source.Extends);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.CancelTopicAsyncTaskID != null) {
            this.CancelTopicAsyncTaskID = new String(source.CancelTopicAsyncTaskID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AutoSplit", this.AutoSplit);
        this.setParamSimple(map, prefix + "MaxSplitPartitions", this.MaxSplitPartitions);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Describes", this.Describes);
        this.setParamSimple(map, prefix + "HotPeriod", this.HotPeriod);
        this.setParamSimple(map, prefix + "IsWebTracking", this.IsWebTracking);
        this.setParamObj(map, prefix + "Extends.", this.Extends);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "CancelTopicAsyncTaskID", this.CancelTopicAsyncTaskID);

    }
}

