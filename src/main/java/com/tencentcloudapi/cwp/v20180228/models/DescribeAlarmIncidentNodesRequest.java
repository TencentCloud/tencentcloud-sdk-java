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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmIncidentNodesRequest extends AbstractModel{

    /**
    * 机器uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 告警vid
    */
    @SerializedName("AlarmVid")
    @Expose
    private String AlarmVid;

    /**
    * 告警时间
    */
    @SerializedName("AlarmTime")
    @Expose
    private Long AlarmTime;

    /**
     * Get 机器uuid 
     * @return Uuid 机器uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 机器uuid
     * @param Uuid 机器uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 告警vid 
     * @return AlarmVid 告警vid
     */
    public String getAlarmVid() {
        return this.AlarmVid;
    }

    /**
     * Set 告警vid
     * @param AlarmVid 告警vid
     */
    public void setAlarmVid(String AlarmVid) {
        this.AlarmVid = AlarmVid;
    }

    /**
     * Get 告警时间 
     * @return AlarmTime 告警时间
     */
    public Long getAlarmTime() {
        return this.AlarmTime;
    }

    /**
     * Set 告警时间
     * @param AlarmTime 告警时间
     */
    public void setAlarmTime(Long AlarmTime) {
        this.AlarmTime = AlarmTime;
    }

    public DescribeAlarmIncidentNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmIncidentNodesRequest(DescribeAlarmIncidentNodesRequest source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.AlarmVid != null) {
            this.AlarmVid = new String(source.AlarmVid);
        }
        if (source.AlarmTime != null) {
            this.AlarmTime = new Long(source.AlarmTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "AlarmVid", this.AlarmVid);
        this.setParamSimple(map, prefix + "AlarmTime", this.AlarmTime);

    }
}

