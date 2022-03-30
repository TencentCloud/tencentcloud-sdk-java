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

public class EventStat extends AbstractModel{

    /**
    * 事件数
    */
    @SerializedName("EventsNum")
    @Expose
    private Long EventsNum;

    /**
    * 受影响的主机数
    */
    @SerializedName("MachineAffectNum")
    @Expose
    private Long MachineAffectNum;

    /**
     * Get 事件数 
     * @return EventsNum 事件数
     */
    public Long getEventsNum() {
        return this.EventsNum;
    }

    /**
     * Set 事件数
     * @param EventsNum 事件数
     */
    public void setEventsNum(Long EventsNum) {
        this.EventsNum = EventsNum;
    }

    /**
     * Get 受影响的主机数 
     * @return MachineAffectNum 受影响的主机数
     */
    public Long getMachineAffectNum() {
        return this.MachineAffectNum;
    }

    /**
     * Set 受影响的主机数
     * @param MachineAffectNum 受影响的主机数
     */
    public void setMachineAffectNum(Long MachineAffectNum) {
        this.MachineAffectNum = MachineAffectNum;
    }

    public EventStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventStat(EventStat source) {
        if (source.EventsNum != null) {
            this.EventsNum = new Long(source.EventsNum);
        }
        if (source.MachineAffectNum != null) {
            this.MachineAffectNum = new Long(source.MachineAffectNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventsNum", this.EventsNum);
        this.setParamSimple(map, prefix + "MachineAffectNum", this.MachineAffectNum);

    }
}

