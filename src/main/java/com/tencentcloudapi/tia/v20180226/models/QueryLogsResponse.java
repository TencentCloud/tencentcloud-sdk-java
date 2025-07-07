/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tia.v20180226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryLogsResponse extends AbstractModel {

    /**
    * 日志查询上下文，用于加载更多日志
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 日志内容列表
    */
    @SerializedName("Logs")
    @Expose
    private Log [] Logs;

    /**
    * 是否已经返回所有符合条件的日志
    */
    @SerializedName("Listover")
    @Expose
    private Boolean Listover;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志查询上下文，用于加载更多日志 
     * @return Context 日志查询上下文，用于加载更多日志
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 日志查询上下文，用于加载更多日志
     * @param Context 日志查询上下文，用于加载更多日志
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 日志内容列表 
     * @return Logs 日志内容列表
     */
    public Log [] getLogs() {
        return this.Logs;
    }

    /**
     * Set 日志内容列表
     * @param Logs 日志内容列表
     */
    public void setLogs(Log [] Logs) {
        this.Logs = Logs;
    }

    /**
     * Get 是否已经返回所有符合条件的日志 
     * @return Listover 是否已经返回所有符合条件的日志
     */
    public Boolean getListover() {
        return this.Listover;
    }

    /**
     * Set 是否已经返回所有符合条件的日志
     * @param Listover 是否已经返回所有符合条件的日志
     */
    public void setListover(Boolean Listover) {
        this.Listover = Listover;
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

    public QueryLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryLogsResponse(QueryLogsResponse source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Logs != null) {
            this.Logs = new Log[source.Logs.length];
            for (int i = 0; i < source.Logs.length; i++) {
                this.Logs[i] = new Log(source.Logs[i]);
            }
        }
        if (source.Listover != null) {
            this.Listover = new Boolean(source.Listover);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamArrayObj(map, prefix + "Logs.", this.Logs);
        this.setParamSimple(map, prefix + "Listover", this.Listover);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

