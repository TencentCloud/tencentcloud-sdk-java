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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddTimeWindowRequest extends AbstractModel{

    /**
    * 实例ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 星期一的可维护时间段，其中每一个时间段的格式形如：10:00-12:00；起始时间按半个小时对齐；最短半个小时，最长三个小时；可设置多个时间段。 一周中应至少设置一天的时间窗。下同。
    */
    @SerializedName("Monday")
    @Expose
    private String [] Monday;

    /**
    * 星期二的可维护时间窗口。 一周中应至少设置一天的时间窗。
    */
    @SerializedName("Tuesday")
    @Expose
    private String [] Tuesday;

    /**
    * 星期三的可维护时间窗口。 一周中应至少设置一天的时间窗。
    */
    @SerializedName("Wednesday")
    @Expose
    private String [] Wednesday;

    /**
    * 星期四的可维护时间窗口。 一周中应至少设置一天的时间窗。
    */
    @SerializedName("Thursday")
    @Expose
    private String [] Thursday;

    /**
    * 星期五的可维护时间窗口。 一周中应至少设置一天的时间窗。
    */
    @SerializedName("Friday")
    @Expose
    private String [] Friday;

    /**
    * 星期六的可维护时间窗口。 一周中应至少设置一天的时间窗。
    */
    @SerializedName("Saturday")
    @Expose
    private String [] Saturday;

    /**
    * 星期日的可维护时间窗口。 一周中应至少设置一天的时间窗。
    */
    @SerializedName("Sunday")
    @Expose
    private String [] Sunday;

    /**
    * 最大延迟阈值，仅对主实例和灾备实例有效
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private Long MaxDelayTime;

    /**
     * Get 实例ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 星期一的可维护时间段，其中每一个时间段的格式形如：10:00-12:00；起始时间按半个小时对齐；最短半个小时，最长三个小时；可设置多个时间段。 一周中应至少设置一天的时间窗。下同。 
     * @return Monday 星期一的可维护时间段，其中每一个时间段的格式形如：10:00-12:00；起始时间按半个小时对齐；最短半个小时，最长三个小时；可设置多个时间段。 一周中应至少设置一天的时间窗。下同。
     */
    public String [] getMonday() {
        return this.Monday;
    }

    /**
     * Set 星期一的可维护时间段，其中每一个时间段的格式形如：10:00-12:00；起始时间按半个小时对齐；最短半个小时，最长三个小时；可设置多个时间段。 一周中应至少设置一天的时间窗。下同。
     * @param Monday 星期一的可维护时间段，其中每一个时间段的格式形如：10:00-12:00；起始时间按半个小时对齐；最短半个小时，最长三个小时；可设置多个时间段。 一周中应至少设置一天的时间窗。下同。
     */
    public void setMonday(String [] Monday) {
        this.Monday = Monday;
    }

    /**
     * Get 星期二的可维护时间窗口。 一周中应至少设置一天的时间窗。 
     * @return Tuesday 星期二的可维护时间窗口。 一周中应至少设置一天的时间窗。
     */
    public String [] getTuesday() {
        return this.Tuesday;
    }

    /**
     * Set 星期二的可维护时间窗口。 一周中应至少设置一天的时间窗。
     * @param Tuesday 星期二的可维护时间窗口。 一周中应至少设置一天的时间窗。
     */
    public void setTuesday(String [] Tuesday) {
        this.Tuesday = Tuesday;
    }

    /**
     * Get 星期三的可维护时间窗口。 一周中应至少设置一天的时间窗。 
     * @return Wednesday 星期三的可维护时间窗口。 一周中应至少设置一天的时间窗。
     */
    public String [] getWednesday() {
        return this.Wednesday;
    }

    /**
     * Set 星期三的可维护时间窗口。 一周中应至少设置一天的时间窗。
     * @param Wednesday 星期三的可维护时间窗口。 一周中应至少设置一天的时间窗。
     */
    public void setWednesday(String [] Wednesday) {
        this.Wednesday = Wednesday;
    }

    /**
     * Get 星期四的可维护时间窗口。 一周中应至少设置一天的时间窗。 
     * @return Thursday 星期四的可维护时间窗口。 一周中应至少设置一天的时间窗。
     */
    public String [] getThursday() {
        return this.Thursday;
    }

    /**
     * Set 星期四的可维护时间窗口。 一周中应至少设置一天的时间窗。
     * @param Thursday 星期四的可维护时间窗口。 一周中应至少设置一天的时间窗。
     */
    public void setThursday(String [] Thursday) {
        this.Thursday = Thursday;
    }

    /**
     * Get 星期五的可维护时间窗口。 一周中应至少设置一天的时间窗。 
     * @return Friday 星期五的可维护时间窗口。 一周中应至少设置一天的时间窗。
     */
    public String [] getFriday() {
        return this.Friday;
    }

    /**
     * Set 星期五的可维护时间窗口。 一周中应至少设置一天的时间窗。
     * @param Friday 星期五的可维护时间窗口。 一周中应至少设置一天的时间窗。
     */
    public void setFriday(String [] Friday) {
        this.Friday = Friday;
    }

    /**
     * Get 星期六的可维护时间窗口。 一周中应至少设置一天的时间窗。 
     * @return Saturday 星期六的可维护时间窗口。 一周中应至少设置一天的时间窗。
     */
    public String [] getSaturday() {
        return this.Saturday;
    }

    /**
     * Set 星期六的可维护时间窗口。 一周中应至少设置一天的时间窗。
     * @param Saturday 星期六的可维护时间窗口。 一周中应至少设置一天的时间窗。
     */
    public void setSaturday(String [] Saturday) {
        this.Saturday = Saturday;
    }

    /**
     * Get 星期日的可维护时间窗口。 一周中应至少设置一天的时间窗。 
     * @return Sunday 星期日的可维护时间窗口。 一周中应至少设置一天的时间窗。
     */
    public String [] getSunday() {
        return this.Sunday;
    }

    /**
     * Set 星期日的可维护时间窗口。 一周中应至少设置一天的时间窗。
     * @param Sunday 星期日的可维护时间窗口。 一周中应至少设置一天的时间窗。
     */
    public void setSunday(String [] Sunday) {
        this.Sunday = Sunday;
    }

    /**
     * Get 最大延迟阈值，仅对主实例和灾备实例有效 
     * @return MaxDelayTime 最大延迟阈值，仅对主实例和灾备实例有效
     */
    public Long getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set 最大延迟阈值，仅对主实例和灾备实例有效
     * @param MaxDelayTime 最大延迟阈值，仅对主实例和灾备实例有效
     */
    public void setMaxDelayTime(Long MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
    }

    public AddTimeWindowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddTimeWindowRequest(AddTimeWindowRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Monday != null) {
            this.Monday = new String[source.Monday.length];
            for (int i = 0; i < source.Monday.length; i++) {
                this.Monday[i] = new String(source.Monday[i]);
            }
        }
        if (source.Tuesday != null) {
            this.Tuesday = new String[source.Tuesday.length];
            for (int i = 0; i < source.Tuesday.length; i++) {
                this.Tuesday[i] = new String(source.Tuesday[i]);
            }
        }
        if (source.Wednesday != null) {
            this.Wednesday = new String[source.Wednesday.length];
            for (int i = 0; i < source.Wednesday.length; i++) {
                this.Wednesday[i] = new String(source.Wednesday[i]);
            }
        }
        if (source.Thursday != null) {
            this.Thursday = new String[source.Thursday.length];
            for (int i = 0; i < source.Thursday.length; i++) {
                this.Thursday[i] = new String(source.Thursday[i]);
            }
        }
        if (source.Friday != null) {
            this.Friday = new String[source.Friday.length];
            for (int i = 0; i < source.Friday.length; i++) {
                this.Friday[i] = new String(source.Friday[i]);
            }
        }
        if (source.Saturday != null) {
            this.Saturday = new String[source.Saturday.length];
            for (int i = 0; i < source.Saturday.length; i++) {
                this.Saturday[i] = new String(source.Saturday[i]);
            }
        }
        if (source.Sunday != null) {
            this.Sunday = new String[source.Sunday.length];
            for (int i = 0; i < source.Sunday.length; i++) {
                this.Sunday[i] = new String(source.Sunday[i]);
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
        this.setParamArraySimple(map, prefix + "Monday.", this.Monday);
        this.setParamArraySimple(map, prefix + "Tuesday.", this.Tuesday);
        this.setParamArraySimple(map, prefix + "Wednesday.", this.Wednesday);
        this.setParamArraySimple(map, prefix + "Thursday.", this.Thursday);
        this.setParamArraySimple(map, prefix + "Friday.", this.Friday);
        this.setParamArraySimple(map, prefix + "Saturday.", this.Saturday);
        this.setParamArraySimple(map, prefix + "Sunday.", this.Sunday);
        this.setParamSimple(map, prefix + "MaxDelayTime", this.MaxDelayTime);

    }
}

