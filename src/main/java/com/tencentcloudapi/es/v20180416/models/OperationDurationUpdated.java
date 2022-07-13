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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationDurationUpdated extends AbstractModel{

    /**
    * 维护周期，表示周一到周日，可取值[0, 6]
    */
    @SerializedName("Periods")
    @Expose
    private Long [] Periods;

    /**
    * 维护开始时间
    */
    @SerializedName("TimeStart")
    @Expose
    private String TimeStart;

    /**
    * 维护结束时间
    */
    @SerializedName("TimeEnd")
    @Expose
    private String TimeEnd;

    /**
    * 时区，以UTC形式表示
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * ES集群ID数组
    */
    @SerializedName("MoreInstances")
    @Expose
    private String [] MoreInstances;

    /**
     * Get 维护周期，表示周一到周日，可取值[0, 6] 
     * @return Periods 维护周期，表示周一到周日，可取值[0, 6]
     */
    public Long [] getPeriods() {
        return this.Periods;
    }

    /**
     * Set 维护周期，表示周一到周日，可取值[0, 6]
     * @param Periods 维护周期，表示周一到周日，可取值[0, 6]
     */
    public void setPeriods(Long [] Periods) {
        this.Periods = Periods;
    }

    /**
     * Get 维护开始时间 
     * @return TimeStart 维护开始时间
     */
    public String getTimeStart() {
        return this.TimeStart;
    }

    /**
     * Set 维护开始时间
     * @param TimeStart 维护开始时间
     */
    public void setTimeStart(String TimeStart) {
        this.TimeStart = TimeStart;
    }

    /**
     * Get 维护结束时间 
     * @return TimeEnd 维护结束时间
     */
    public String getTimeEnd() {
        return this.TimeEnd;
    }

    /**
     * Set 维护结束时间
     * @param TimeEnd 维护结束时间
     */
    public void setTimeEnd(String TimeEnd) {
        this.TimeEnd = TimeEnd;
    }

    /**
     * Get 时区，以UTC形式表示 
     * @return TimeZone 时区，以UTC形式表示
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时区，以UTC形式表示
     * @param TimeZone 时区，以UTC形式表示
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get ES集群ID数组 
     * @return MoreInstances ES集群ID数组
     */
    public String [] getMoreInstances() {
        return this.MoreInstances;
    }

    /**
     * Set ES集群ID数组
     * @param MoreInstances ES集群ID数组
     */
    public void setMoreInstances(String [] MoreInstances) {
        this.MoreInstances = MoreInstances;
    }

    public OperationDurationUpdated() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationDurationUpdated(OperationDurationUpdated source) {
        if (source.Periods != null) {
            this.Periods = new Long[source.Periods.length];
            for (int i = 0; i < source.Periods.length; i++) {
                this.Periods[i] = new Long(source.Periods[i]);
            }
        }
        if (source.TimeStart != null) {
            this.TimeStart = new String(source.TimeStart);
        }
        if (source.TimeEnd != null) {
            this.TimeEnd = new String(source.TimeEnd);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.MoreInstances != null) {
            this.MoreInstances = new String[source.MoreInstances.length];
            for (int i = 0; i < source.MoreInstances.length; i++) {
                this.MoreInstances[i] = new String(source.MoreInstances[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Periods.", this.Periods);
        this.setParamSimple(map, prefix + "TimeStart", this.TimeStart);
        this.setParamSimple(map, prefix + "TimeEnd", this.TimeEnd);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamArraySimple(map, prefix + "MoreInstances.", this.MoreInstances);

    }
}

