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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSummaryInfoResponse extends AbstractModel{

    /**
    * 人体库总数量。
    */
    @SerializedName("GroupCount")
    @Expose
    private Long GroupCount;

    /**
    * 人员总数量
    */
    @SerializedName("PersonCount")
    @Expose
    private Long PersonCount;

    /**
    * 人员轨迹总数量
    */
    @SerializedName("TraceCount")
    @Expose
    private Long TraceCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人体库总数量。 
     * @return GroupCount 人体库总数量。
     */
    public Long getGroupCount() {
        return this.GroupCount;
    }

    /**
     * Set 人体库总数量。
     * @param GroupCount 人体库总数量。
     */
    public void setGroupCount(Long GroupCount) {
        this.GroupCount = GroupCount;
    }

    /**
     * Get 人员总数量 
     * @return PersonCount 人员总数量
     */
    public Long getPersonCount() {
        return this.PersonCount;
    }

    /**
     * Set 人员总数量
     * @param PersonCount 人员总数量
     */
    public void setPersonCount(Long PersonCount) {
        this.PersonCount = PersonCount;
    }

    /**
     * Get 人员轨迹总数量 
     * @return TraceCount 人员轨迹总数量
     */
    public Long getTraceCount() {
        return this.TraceCount;
    }

    /**
     * Set 人员轨迹总数量
     * @param TraceCount 人员轨迹总数量
     */
    public void setTraceCount(Long TraceCount) {
        this.TraceCount = TraceCount;
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

    public GetSummaryInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSummaryInfoResponse(GetSummaryInfoResponse source) {
        if (source.GroupCount != null) {
            this.GroupCount = new Long(source.GroupCount);
        }
        if (source.PersonCount != null) {
            this.PersonCount = new Long(source.PersonCount);
        }
        if (source.TraceCount != null) {
            this.TraceCount = new Long(source.TraceCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupCount", this.GroupCount);
        this.setParamSimple(map, prefix + "PersonCount", this.PersonCount);
        this.setParamSimple(map, prefix + "TraceCount", this.TraceCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

