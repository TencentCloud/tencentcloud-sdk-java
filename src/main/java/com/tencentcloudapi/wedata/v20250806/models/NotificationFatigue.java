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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotificationFatigue extends AbstractModel {

    /**
    * 告警次数
    */
    @SerializedName("NotifyCount")
    @Expose
    private Long NotifyCount;

    /**
    * 告警间隔，分钟
    */
    @SerializedName("NotifyInterval")
    @Expose
    private Long NotifyInterval;

    /**
    * 免打扰时间，例如示例值
[{DaysOfWeek: [1, 2], StartTime: "00:00:00", EndTime: "09:00:00"}]	
每周一、周二的00:00到09:00免打扰
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuietIntervals")
    @Expose
    private AlarmQuietInterval [] QuietIntervals;

    /**
     * Get 告警次数 
     * @return NotifyCount 告警次数
     */
    public Long getNotifyCount() {
        return this.NotifyCount;
    }

    /**
     * Set 告警次数
     * @param NotifyCount 告警次数
     */
    public void setNotifyCount(Long NotifyCount) {
        this.NotifyCount = NotifyCount;
    }

    /**
     * Get 告警间隔，分钟 
     * @return NotifyInterval 告警间隔，分钟
     */
    public Long getNotifyInterval() {
        return this.NotifyInterval;
    }

    /**
     * Set 告警间隔，分钟
     * @param NotifyInterval 告警间隔，分钟
     */
    public void setNotifyInterval(Long NotifyInterval) {
        this.NotifyInterval = NotifyInterval;
    }

    /**
     * Get 免打扰时间，例如示例值
[{DaysOfWeek: [1, 2], StartTime: "00:00:00", EndTime: "09:00:00"}]	
每周一、周二的00:00到09:00免打扰
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuietIntervals 免打扰时间，例如示例值
[{DaysOfWeek: [1, 2], StartTime: "00:00:00", EndTime: "09:00:00"}]	
每周一、周二的00:00到09:00免打扰
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmQuietInterval [] getQuietIntervals() {
        return this.QuietIntervals;
    }

    /**
     * Set 免打扰时间，例如示例值
[{DaysOfWeek: [1, 2], StartTime: "00:00:00", EndTime: "09:00:00"}]	
每周一、周二的00:00到09:00免打扰
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuietIntervals 免打扰时间，例如示例值
[{DaysOfWeek: [1, 2], StartTime: "00:00:00", EndTime: "09:00:00"}]	
每周一、周二的00:00到09:00免打扰
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuietIntervals(AlarmQuietInterval [] QuietIntervals) {
        this.QuietIntervals = QuietIntervals;
    }

    public NotificationFatigue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotificationFatigue(NotificationFatigue source) {
        if (source.NotifyCount != null) {
            this.NotifyCount = new Long(source.NotifyCount);
        }
        if (source.NotifyInterval != null) {
            this.NotifyInterval = new Long(source.NotifyInterval);
        }
        if (source.QuietIntervals != null) {
            this.QuietIntervals = new AlarmQuietInterval[source.QuietIntervals.length];
            for (int i = 0; i < source.QuietIntervals.length; i++) {
                this.QuietIntervals[i] = new AlarmQuietInterval(source.QuietIntervals[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotifyCount", this.NotifyCount);
        this.setParamSimple(map, prefix + "NotifyInterval", this.NotifyInterval);
        this.setParamArrayObj(map, prefix + "QuietIntervals.", this.QuietIntervals);

    }
}

