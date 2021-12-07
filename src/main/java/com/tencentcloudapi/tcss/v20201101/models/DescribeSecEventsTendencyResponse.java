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

public class DescribeSecEventsTendencyResponse extends AbstractModel{

    /**
    * 运行时安全事件趋势信息列表
    */
    @SerializedName("EventTendencySet")
    @Expose
    private SecTendencyEventInfo [] EventTendencySet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 运行时安全事件趋势信息列表 
     * @return EventTendencySet 运行时安全事件趋势信息列表
     */
    public SecTendencyEventInfo [] getEventTendencySet() {
        return this.EventTendencySet;
    }

    /**
     * Set 运行时安全事件趋势信息列表
     * @param EventTendencySet 运行时安全事件趋势信息列表
     */
    public void setEventTendencySet(SecTendencyEventInfo [] EventTendencySet) {
        this.EventTendencySet = EventTendencySet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSecEventsTendencyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecEventsTendencyResponse(DescribeSecEventsTendencyResponse source) {
        if (source.EventTendencySet != null) {
            this.EventTendencySet = new SecTendencyEventInfo[source.EventTendencySet.length];
            for (int i = 0; i < source.EventTendencySet.length; i++) {
                this.EventTendencySet[i] = new SecTendencyEventInfo(source.EventTendencySet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EventTendencySet.", this.EventTendencySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

