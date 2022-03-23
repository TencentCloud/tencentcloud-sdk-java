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

public class ModifyTopicRequest extends AbstractModel{

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
    * 该日志主题是否开始采集
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
    * 生命周期，单位天，可取值范围1~3600。取值为3640时代表永久保存
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

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
     * Get 该日志主题是否开始采集 
     * @return Status 该日志主题是否开始采集
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 该日志主题是否开始采集
     * @param Status 该日志主题是否开始采集
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

    }
}

