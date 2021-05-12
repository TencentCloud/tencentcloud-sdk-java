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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IssueTypeInfo extends AbstractModel{

    /**
    * 指标分类：AVAILABILITY：可用性，MAINTAINABILITY：可维护性，PERFORMANCE，性能，RELIABILITY可靠性。
    */
    @SerializedName("IssueType")
    @Expose
    private String IssueType;

    /**
    * 异常事件。
    */
    @SerializedName("Events")
    @Expose
    private EventInfo [] Events;

    /**
    * 异常事件总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 指标分类：AVAILABILITY：可用性，MAINTAINABILITY：可维护性，PERFORMANCE，性能，RELIABILITY可靠性。 
     * @return IssueType 指标分类：AVAILABILITY：可用性，MAINTAINABILITY：可维护性，PERFORMANCE，性能，RELIABILITY可靠性。
     */
    public String getIssueType() {
        return this.IssueType;
    }

    /**
     * Set 指标分类：AVAILABILITY：可用性，MAINTAINABILITY：可维护性，PERFORMANCE，性能，RELIABILITY可靠性。
     * @param IssueType 指标分类：AVAILABILITY：可用性，MAINTAINABILITY：可维护性，PERFORMANCE，性能，RELIABILITY可靠性。
     */
    public void setIssueType(String IssueType) {
        this.IssueType = IssueType;
    }

    /**
     * Get 异常事件。 
     * @return Events 异常事件。
     */
    public EventInfo [] getEvents() {
        return this.Events;
    }

    /**
     * Set 异常事件。
     * @param Events 异常事件。
     */
    public void setEvents(EventInfo [] Events) {
        this.Events = Events;
    }

    /**
     * Get 异常事件总数。 
     * @return TotalCount 异常事件总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 异常事件总数。
     * @param TotalCount 异常事件总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public IssueTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IssueTypeInfo(IssueTypeInfo source) {
        if (source.IssueType != null) {
            this.IssueType = new String(source.IssueType);
        }
        if (source.Events != null) {
            this.Events = new EventInfo[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new EventInfo(source.Events[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IssueType", this.IssueType);
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

