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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSessionDetailsResponse extends AbstractModel {

    /**
    * 会话记录详情
    */
    @SerializedName("RecordList")
    @Expose
    private Record [] RecordList;

    /**
    * 记录总数
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * 当前在运行的record信息
    */
    @SerializedName("RunRecord")
    @Expose
    private String RunRecord;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 会话记录详情 
     * @return RecordList 会话记录详情
     */
    public Record [] getRecordList() {
        return this.RecordList;
    }

    /**
     * Set 会话记录详情
     * @param RecordList 会话记录详情
     */
    public void setRecordList(Record [] RecordList) {
        this.RecordList = RecordList;
    }

    /**
     * Get 记录总数 
     * @return RecordCount 记录总数
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set 记录总数
     * @param RecordCount 记录总数
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get 当前在运行的record信息 
     * @return RunRecord 当前在运行的record信息
     */
    public String getRunRecord() {
        return this.RunRecord;
    }

    /**
     * Set 当前在运行的record信息
     * @param RunRecord 当前在运行的record信息
     */
    public void setRunRecord(String RunRecord) {
        this.RunRecord = RunRecord;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetSessionDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSessionDetailsResponse(GetSessionDetailsResponse source) {
        if (source.RecordList != null) {
            this.RecordList = new Record[source.RecordList.length];
            for (int i = 0; i < source.RecordList.length; i++) {
                this.RecordList[i] = new Record(source.RecordList[i]);
            }
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.RunRecord != null) {
            this.RunRecord = new String(source.RunRecord);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RecordList.", this.RecordList);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "RunRecord", this.RunRecord);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

