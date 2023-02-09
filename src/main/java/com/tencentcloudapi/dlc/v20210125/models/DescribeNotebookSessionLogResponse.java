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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNotebookSessionLogResponse extends AbstractModel{

    /**
    * 日志信息，默认获取最新的200条
    */
    @SerializedName("Logs")
    @Expose
    private String [] Logs;

    /**
    * 分页参数，默认200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志信息，默认获取最新的200条 
     * @return Logs 日志信息，默认获取最新的200条
     */
    public String [] getLogs() {
        return this.Logs;
    }

    /**
     * Set 日志信息，默认获取最新的200条
     * @param Logs 日志信息，默认获取最新的200条
     */
    public void setLogs(String [] Logs) {
        this.Logs = Logs;
    }

    /**
     * Get 分页参数，默认200 
     * @return Limit 分页参数，默认200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，默认200
     * @param Limit 分页参数，默认200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数，默认0 
     * @return Offset 分页参数，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，默认0
     * @param Offset 分页参数，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
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

    public DescribeNotebookSessionLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNotebookSessionLogResponse(DescribeNotebookSessionLogResponse source) {
        if (source.Logs != null) {
            this.Logs = new String[source.Logs.length];
            for (int i = 0; i < source.Logs.length; i++) {
                this.Logs[i] = new String(source.Logs[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Logs.", this.Logs);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

