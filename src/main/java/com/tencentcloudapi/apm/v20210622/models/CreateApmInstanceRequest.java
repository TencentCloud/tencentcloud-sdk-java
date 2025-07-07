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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApmInstanceRequest extends AbstractModel {

    /**
    * 业务系统名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 业务系统描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Trace 数据保存时长（单位：天，默认存储时长为3天）
    */
    @SerializedName("TraceDuration")
    @Expose
    private Long TraceDuration;

    /**
    * 业务系统 Tag 列表
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * 业务系统上报额度值，默认赋值为0表示不限制上报额度，已废弃
    */
    @SerializedName("SpanDailyCounters")
    @Expose
    private Long SpanDailyCounters;

    /**
    * 业务系统的计费模式（0=按量付费，1=预付费）
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 是否为免费版业务系统（0=付费版；1=TSF 受限免费版；2=免费版）
    */
    @SerializedName("Free")
    @Expose
    private Long Free;

    /**
     * Get 业务系统名 
     * @return Name 业务系统名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 业务系统名
     * @param Name 业务系统名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 业务系统描述信息 
     * @return Description 业务系统描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 业务系统描述信息
     * @param Description 业务系统描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Trace 数据保存时长（单位：天，默认存储时长为3天） 
     * @return TraceDuration Trace 数据保存时长（单位：天，默认存储时长为3天）
     */
    public Long getTraceDuration() {
        return this.TraceDuration;
    }

    /**
     * Set Trace 数据保存时长（单位：天，默认存储时长为3天）
     * @param TraceDuration Trace 数据保存时长（单位：天，默认存储时长为3天）
     */
    public void setTraceDuration(Long TraceDuration) {
        this.TraceDuration = TraceDuration;
    }

    /**
     * Get 业务系统 Tag 列表 
     * @return Tags 业务系统 Tag 列表
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 业务系统 Tag 列表
     * @param Tags 业务系统 Tag 列表
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 业务系统上报额度值，默认赋值为0表示不限制上报额度，已废弃 
     * @return SpanDailyCounters 业务系统上报额度值，默认赋值为0表示不限制上报额度，已废弃
     */
    public Long getSpanDailyCounters() {
        return this.SpanDailyCounters;
    }

    /**
     * Set 业务系统上报额度值，默认赋值为0表示不限制上报额度，已废弃
     * @param SpanDailyCounters 业务系统上报额度值，默认赋值为0表示不限制上报额度，已废弃
     */
    public void setSpanDailyCounters(Long SpanDailyCounters) {
        this.SpanDailyCounters = SpanDailyCounters;
    }

    /**
     * Get 业务系统的计费模式（0=按量付费，1=预付费） 
     * @return PayMode 业务系统的计费模式（0=按量付费，1=预付费）
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 业务系统的计费模式（0=按量付费，1=预付费）
     * @param PayMode 业务系统的计费模式（0=按量付费，1=预付费）
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 是否为免费版业务系统（0=付费版；1=TSF 受限免费版；2=免费版） 
     * @return Free 是否为免费版业务系统（0=付费版；1=TSF 受限免费版；2=免费版）
     */
    public Long getFree() {
        return this.Free;
    }

    /**
     * Set 是否为免费版业务系统（0=付费版；1=TSF 受限免费版；2=免费版）
     * @param Free 是否为免费版业务系统（0=付费版；1=TSF 受限免费版；2=免费版）
     */
    public void setFree(Long Free) {
        this.Free = Free;
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
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Free != null) {
            this.Free = new Long(source.Free);
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
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Free", this.Free);

    }
}

