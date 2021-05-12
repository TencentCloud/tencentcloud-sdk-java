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
package com.tencentcloudapi.tic.v20201117.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStackEventsRequest extends AbstractModel{

    /**
    * 按照⼀个或者多个事件ID查询
    */
    @SerializedName("EventIds")
    @Expose
    private String [] EventIds;

    /**
    * <li>**VersionId**</li>
按照【**版本ID**】过滤，VersionId形如 `ver-kg8hn58h`
类型：string

<li>**StackId**</li>
按照【**资源栈ID**】过滤，StackId形如 `stk-hz5vn3te`
类型：string

<li>**Type**</li>
按照【**事件类型**】过滤，Type 形如 plan, apply, destroy
类型：string

<li>**Status**</li>
按照【**事件状态**】过滤，Status形如 queueing, running, success, failed
类型：string
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 按照⼀个或者多个事件ID查询 
     * @return EventIds 按照⼀个或者多个事件ID查询
     */
    public String [] getEventIds() {
        return this.EventIds;
    }

    /**
     * Set 按照⼀个或者多个事件ID查询
     * @param EventIds 按照⼀个或者多个事件ID查询
     */
    public void setEventIds(String [] EventIds) {
        this.EventIds = EventIds;
    }

    /**
     * Get <li>**VersionId**</li>
按照【**版本ID**】过滤，VersionId形如 `ver-kg8hn58h`
类型：string

<li>**StackId**</li>
按照【**资源栈ID**】过滤，StackId形如 `stk-hz5vn3te`
类型：string

<li>**Type**</li>
按照【**事件类型**】过滤，Type 形如 plan, apply, destroy
类型：string

<li>**Status**</li>
按照【**事件状态**】过滤，Status形如 queueing, running, success, failed
类型：string 
     * @return Filters <li>**VersionId**</li>
按照【**版本ID**】过滤，VersionId形如 `ver-kg8hn58h`
类型：string

<li>**StackId**</li>
按照【**资源栈ID**】过滤，StackId形如 `stk-hz5vn3te`
类型：string

<li>**Type**</li>
按照【**事件类型**】过滤，Type 形如 plan, apply, destroy
类型：string

<li>**Status**</li>
按照【**事件状态**】过滤，Status形如 queueing, running, success, failed
类型：string
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>**VersionId**</li>
按照【**版本ID**】过滤，VersionId形如 `ver-kg8hn58h`
类型：string

<li>**StackId**</li>
按照【**资源栈ID**】过滤，StackId形如 `stk-hz5vn3te`
类型：string

<li>**Type**</li>
按照【**事件类型**】过滤，Type 形如 plan, apply, destroy
类型：string

<li>**Status**</li>
按照【**事件状态**】过滤，Status形如 queueing, running, success, failed
类型：string
     * @param Filters <li>**VersionId**</li>
按照【**版本ID**】过滤，VersionId形如 `ver-kg8hn58h`
类型：string

<li>**StackId**</li>
按照【**资源栈ID**】过滤，StackId形如 `stk-hz5vn3te`
类型：string

<li>**Type**</li>
按照【**事件类型**】过滤，Type 形如 plan, apply, destroy
类型：string

<li>**Status**</li>
按照【**事件状态**】过滤，Status形如 queueing, running, success, failed
类型：string
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节 
     * @return Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节
     * @param Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节 
     * @return Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节
     * @param Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeStackEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStackEventsRequest(DescribeStackEventsRequest source) {
        if (source.EventIds != null) {
            this.EventIds = new String[source.EventIds.length];
            for (int i = 0; i < source.EventIds.length; i++) {
                this.EventIds[i] = new String(source.EventIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EventIds.", this.EventIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

