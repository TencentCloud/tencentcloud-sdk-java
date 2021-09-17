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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEKSContainerInstanceEventResponse extends AbstractModel{

    /**
    * 事件集合
    */
    @SerializedName("Events")
    @Expose
    private Event [] Events;

    /**
    * 容器实例id
    */
    @SerializedName("EksCiId")
    @Expose
    private String EksCiId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 事件集合 
     * @return Events 事件集合
     */
    public Event [] getEvents() {
        return this.Events;
    }

    /**
     * Set 事件集合
     * @param Events 事件集合
     */
    public void setEvents(Event [] Events) {
        this.Events = Events;
    }

    /**
     * Get 容器实例id 
     * @return EksCiId 容器实例id
     */
    public String getEksCiId() {
        return this.EksCiId;
    }

    /**
     * Set 容器实例id
     * @param EksCiId 容器实例id
     */
    public void setEksCiId(String EksCiId) {
        this.EksCiId = EksCiId;
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

    public DescribeEKSContainerInstanceEventResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEKSContainerInstanceEventResponse(DescribeEKSContainerInstanceEventResponse source) {
        if (source.Events != null) {
            this.Events = new Event[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new Event(source.Events[i]);
            }
        }
        if (source.EksCiId != null) {
            this.EksCiId = new String(source.EksCiId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamSimple(map, prefix + "EksCiId", this.EksCiId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

