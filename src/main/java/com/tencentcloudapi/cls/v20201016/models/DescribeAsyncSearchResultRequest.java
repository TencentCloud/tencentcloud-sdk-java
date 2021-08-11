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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsyncSearchResultRequest extends AbstractModel{

    /**
    * 异步检索任务ID
    */
    @SerializedName("AsyncSearchTaskId")
    @Expose
    private String AsyncSearchTaskId;

    /**
    * 日志集ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 单次调用返回的日志条数，默认为20，最大为500
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 异步检索任务ID 
     * @return AsyncSearchTaskId 异步检索任务ID
     */
    public String getAsyncSearchTaskId() {
        return this.AsyncSearchTaskId;
    }

    /**
     * Set 异步检索任务ID
     * @param AsyncSearchTaskId 异步检索任务ID
     */
    public void setAsyncSearchTaskId(String AsyncSearchTaskId) {
        this.AsyncSearchTaskId = AsyncSearchTaskId;
    }

    /**
     * Get 日志集ID 
     * @return TopicId 日志集ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志集ID
     * @param TopicId 日志集ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容 
     * @return Context 加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容
     * @param Context 加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 单次调用返回的日志条数，默认为20，最大为500 
     * @return Limit 单次调用返回的日志条数，默认为20，最大为500
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次调用返回的日志条数，默认为20，最大为500
     * @param Limit 单次调用返回的日志条数，默认为20，最大为500
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAsyncSearchResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsyncSearchResultRequest(DescribeAsyncSearchResultRequest source) {
        if (source.AsyncSearchTaskId != null) {
            this.AsyncSearchTaskId = new String(source.AsyncSearchTaskId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncSearchTaskId", this.AsyncSearchTaskId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

