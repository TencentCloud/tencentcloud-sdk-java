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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRiskSyscallEventsRequest extends AbstractModel{

    /**
    * 事件ids
    */
    @SerializedName("EventIdSet")
    @Expose
    private String [] EventIdSet;

    /**
     * Get 事件ids 
     * @return EventIdSet 事件ids
     */
    public String [] getEventIdSet() {
        return this.EventIdSet;
    }

    /**
     * Set 事件ids
     * @param EventIdSet 事件ids
     */
    public void setEventIdSet(String [] EventIdSet) {
        this.EventIdSet = EventIdSet;
    }

    public DeleteRiskSyscallEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRiskSyscallEventsRequest(DeleteRiskSyscallEventsRequest source) {
        if (source.EventIdSet != null) {
            this.EventIdSet = new String[source.EventIdSet.length];
            for (int i = 0; i < source.EventIdSet.length; i++) {
                this.EventIdSet[i] = new String(source.EventIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EventIdSet.", this.EventIdSet);

    }
}

