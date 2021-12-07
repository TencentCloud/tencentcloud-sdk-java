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

public class DescribeRiskSyscallDetailRequest extends AbstractModel{

    /**
    * 事件唯一id
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
     * Get 事件唯一id 
     * @return EventId 事件唯一id
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件唯一id
     * @param EventId 事件唯一id
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    public DescribeRiskSyscallDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskSyscallDetailRequest(DescribeRiskSyscallDetailRequest source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

