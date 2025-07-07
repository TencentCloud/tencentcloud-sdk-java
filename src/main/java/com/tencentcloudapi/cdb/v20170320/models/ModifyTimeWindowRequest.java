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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTimeWindowRequest extends AbstractModel {

    /**
    * 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 修改后的可维护时间段，其中每一个时间段的格式形如：10:00-12:00；起止时间按半个小时对齐；最短半个小时，最长三个小时；最多设置两个时间段；起止时间范围为：[00:00, 24:00]。
说明：设置两个时间段的 json 示例如下。
[
    "01:00-01:30",
    "02:00-02:30"
  ]
    */
    @SerializedName("TimeRanges")
    @Expose
    private String [] TimeRanges;

    /**
    * 指定修改哪一天的可维护时间段，可能的取值为：monday，tuesday，wednesday，thursday，friday，saturday，sunday。如果不指定该值或者为空，则默认一周七天都修改。
说明：指定修改多天的 json 示例如下。
[
    "monday",
    "tuesday"
  ]
    */
    @SerializedName("Weekdays")
    @Expose
    private String [] Weekdays;

    /**
    * 数据延迟阈值（秒），仅对主实例和灾备实例有效。不传默认不修改，保持原来的阈值，取值范围：1-10的整数。
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private Long MaxDelayTime;

    /**
     * Get 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。 
     * @return InstanceId 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     * @param InstanceId 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 修改后的可维护时间段，其中每一个时间段的格式形如：10:00-12:00；起止时间按半个小时对齐；最短半个小时，最长三个小时；最多设置两个时间段；起止时间范围为：[00:00, 24:00]。
说明：设置两个时间段的 json 示例如下。
[
    "01:00-01:30",
    "02:00-02:30"
  ] 
     * @return TimeRanges 修改后的可维护时间段，其中每一个时间段的格式形如：10:00-12:00；起止时间按半个小时对齐；最短半个小时，最长三个小时；最多设置两个时间段；起止时间范围为：[00:00, 24:00]。
说明：设置两个时间段的 json 示例如下。
[
    "01:00-01:30",
    "02:00-02:30"
  ]
     */
    public String [] getTimeRanges() {
        return this.TimeRanges;
    }

    /**
     * Set 修改后的可维护时间段，其中每一个时间段的格式形如：10:00-12:00；起止时间按半个小时对齐；最短半个小时，最长三个小时；最多设置两个时间段；起止时间范围为：[00:00, 24:00]。
说明：设置两个时间段的 json 示例如下。
[
    "01:00-01:30",
    "02:00-02:30"
  ]
     * @param TimeRanges 修改后的可维护时间段，其中每一个时间段的格式形如：10:00-12:00；起止时间按半个小时对齐；最短半个小时，最长三个小时；最多设置两个时间段；起止时间范围为：[00:00, 24:00]。
说明：设置两个时间段的 json 示例如下。
[
    "01:00-01:30",
    "02:00-02:30"
  ]
     */
    public void setTimeRanges(String [] TimeRanges) {
        this.TimeRanges = TimeRanges;
    }

    /**
     * Get 指定修改哪一天的可维护时间段，可能的取值为：monday，tuesday，wednesday，thursday，friday，saturday，sunday。如果不指定该值或者为空，则默认一周七天都修改。
说明：指定修改多天的 json 示例如下。
[
    "monday",
    "tuesday"
  ] 
     * @return Weekdays 指定修改哪一天的可维护时间段，可能的取值为：monday，tuesday，wednesday，thursday，friday，saturday，sunday。如果不指定该值或者为空，则默认一周七天都修改。
说明：指定修改多天的 json 示例如下。
[
    "monday",
    "tuesday"
  ]
     */
    public String [] getWeekdays() {
        return this.Weekdays;
    }

    /**
     * Set 指定修改哪一天的可维护时间段，可能的取值为：monday，tuesday，wednesday，thursday，friday，saturday，sunday。如果不指定该值或者为空，则默认一周七天都修改。
说明：指定修改多天的 json 示例如下。
[
    "monday",
    "tuesday"
  ]
     * @param Weekdays 指定修改哪一天的可维护时间段，可能的取值为：monday，tuesday，wednesday，thursday，friday，saturday，sunday。如果不指定该值或者为空，则默认一周七天都修改。
说明：指定修改多天的 json 示例如下。
[
    "monday",
    "tuesday"
  ]
     */
    public void setWeekdays(String [] Weekdays) {
        this.Weekdays = Weekdays;
    }

    /**
     * Get 数据延迟阈值（秒），仅对主实例和灾备实例有效。不传默认不修改，保持原来的阈值，取值范围：1-10的整数。 
     * @return MaxDelayTime 数据延迟阈值（秒），仅对主实例和灾备实例有效。不传默认不修改，保持原来的阈值，取值范围：1-10的整数。
     */
    public Long getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set 数据延迟阈值（秒），仅对主实例和灾备实例有效。不传默认不修改，保持原来的阈值，取值范围：1-10的整数。
     * @param MaxDelayTime 数据延迟阈值（秒），仅对主实例和灾备实例有效。不传默认不修改，保持原来的阈值，取值范围：1-10的整数。
     */
    public void setMaxDelayTime(Long MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
    }

    public ModifyTimeWindowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTimeWindowRequest(ModifyTimeWindowRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TimeRanges != null) {
            this.TimeRanges = new String[source.TimeRanges.length];
            for (int i = 0; i < source.TimeRanges.length; i++) {
                this.TimeRanges[i] = new String(source.TimeRanges[i]);
            }
        }
        if (source.Weekdays != null) {
            this.Weekdays = new String[source.Weekdays.length];
            for (int i = 0; i < source.Weekdays.length; i++) {
                this.Weekdays[i] = new String(source.Weekdays[i]);
            }
        }
        if (source.MaxDelayTime != null) {
            this.MaxDelayTime = new Long(source.MaxDelayTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "TimeRanges.", this.TimeRanges);
        this.setParamArraySimple(map, prefix + "Weekdays.", this.Weekdays);
        this.setParamSimple(map, prefix + "MaxDelayTime", this.MaxDelayTime);

    }
}

