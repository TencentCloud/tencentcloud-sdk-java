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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApmInstanceRequest extends AbstractModel{

    /**
    * 实例名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实例描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Trace数据保存时长
    */
    @SerializedName("TraceDuration")
    @Expose
    private Long TraceDuration;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * 实例上报额度值
    */
    @SerializedName("SpanDailyCounters")
    @Expose
    private Long SpanDailyCounters;

    /**
     * Get 实例名 
     * @return Name 实例名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名
     * @param Name 实例名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实例描述信息 
     * @return Description 实例描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 实例描述信息
     * @param Description 实例描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Trace数据保存时长 
     * @return TraceDuration Trace数据保存时长
     */
    public Long getTraceDuration() {
        return this.TraceDuration;
    }

    /**
     * Set Trace数据保存时长
     * @param TraceDuration Trace数据保存时长
     */
    public void setTraceDuration(Long TraceDuration) {
        this.TraceDuration = TraceDuration;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 实例上报额度值 
     * @return SpanDailyCounters 实例上报额度值
     */
    public Long getSpanDailyCounters() {
        return this.SpanDailyCounters;
    }

    /**
     * Set 实例上报额度值
     * @param SpanDailyCounters 实例上报额度值
     */
    public void setSpanDailyCounters(Long SpanDailyCounters) {
        this.SpanDailyCounters = SpanDailyCounters;
    }

    public CreateApmInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApmInstanceRequest(CreateApmInstanceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TraceDuration != null) {
            this.TraceDuration = new Long(source.TraceDuration);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.SpanDailyCounters != null) {
            this.SpanDailyCounters = new Long(source.SpanDailyCounters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TraceDuration", this.TraceDuration);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "SpanDailyCounters", this.SpanDailyCounters);

    }
}

