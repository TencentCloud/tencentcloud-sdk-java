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

public class CreateTopicRequest extends AbstractModel{

    /**
    * 日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 日志主题名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 日志主题分区个数。默认创建1个，最大支持创建10个分区。
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 是否开启自动分裂，默认值为true
    */
    @SerializedName("AutoSplit")
    @Expose
    private Boolean AutoSplit;

    /**
    * 开启自动分裂后，每个主题能够允许的最大分区数，默认值为50
    */
    @SerializedName("MaxSplitPartitions")
    @Expose
    private Long MaxSplitPartitions;

    /**
    * 日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

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
     * Get 日志主题分区个数。默认创建1个，最大支持创建10个分区。 
     * @return PartitionCount 日志主题分区个数。默认创建1个，最大支持创建10个分区。
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set 日志主题分区个数。默认创建1个，最大支持创建10个分区。
     * @param PartitionCount 日志主题分区个数。默认创建1个，最大支持创建10个分区。
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。 
     * @return Tags 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
     * @param Tags 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否开启自动分裂，默认值为true 
     * @return AutoSplit 是否开启自动分裂，默认值为true
     */
    public Boolean getAutoSplit() {
        return this.AutoSplit;
    }

    /**
     * Set 是否开启自动分裂，默认值为true
     * @param AutoSplit 是否开启自动分裂，默认值为true
     */
    public void setAutoSplit(Boolean AutoSplit) {
        this.AutoSplit = AutoSplit;
    }

    /**
     * Get 开启自动分裂后，每个主题能够允许的最大分区数，默认值为50 
     * @return MaxSplitPartitions 开启自动分裂后，每个主题能够允许的最大分区数，默认值为50
     */
    public Long getMaxSplitPartitions() {
        return this.MaxSplitPartitions;
    }

    /**
     * Set 开启自动分裂后，每个主题能够允许的最大分区数，默认值为50
     * @param MaxSplitPartitions 开启自动分裂后，每个主题能够允许的最大分区数，默认值为50
     */
    public void setMaxSplitPartitions(Long MaxSplitPartitions) {
        this.MaxSplitPartitions = MaxSplitPartitions;
    }

    /**
     * Get 日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。 
     * @return StorageType 日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。
     * @param StorageType 日志主题的存储类型，可选值 hot（标准存储），cold（低频存储）；默认为hot。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存 
     * @return Period 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存
     * @param Period 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public CreateTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicRequest(CreateTopicRequest source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AutoSplit != null) {
            this.AutoSplit = new Boolean(source.AutoSplit);
        }
        if (source.MaxSplitPartitions != null) {
            this.MaxSplitPartitions = new Long(source.MaxSplitPartitions);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoSplit", this.AutoSplit);
        this.setParamSimple(map, prefix + "MaxSplitPartitions", this.MaxSplitPartitions);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

