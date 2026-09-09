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

public class QueryUserSessionDetailResponse extends AbstractModel {

    /**
    * <p>用户 Id</p>
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>会话id</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>会话详情数组</p>
    */
    @SerializedName("RecordList")
    @Expose
    private RecordList [] RecordList;

    /**
    * <p>记录总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>运行中的聊天请求, 返回为json字符串</p>
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
     * Get <p>用户 Id</p> 
     * @return SubAccountUin <p>用户 Id</p>
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>用户 Id</p>
     * @param SubAccountUin <p>用户 Id</p>
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get <p>会话id</p> 
     * @return SessionId <p>会话id</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话id</p>
     * @param SessionId <p>会话id</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>会话详情数组</p> 
     * @return RecordList <p>会话详情数组</p>
     */
    public RecordList [] getRecordList() {
        return this.RecordList;
    }

    /**
     * Set <p>会话详情数组</p>
     * @param RecordList <p>会话详情数组</p>
     */
    public void setRecordList(RecordList [] RecordList) {
        this.RecordList = RecordList;
    }

    /**
     * Get <p>记录总数</p> 
     * @return TotalCount <p>记录总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>记录总数</p>
     * @param TotalCount <p>记录总数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>运行中的聊天请求, 返回为json字符串</p> 
     * @return RunRecord <p>运行中的聊天请求, 返回为json字符串</p>
     */
    public String getRunRecord() {
        return this.RunRecord;
    }

    /**
     * Set <p>运行中的聊天请求, 返回为json字符串</p>
     * @param RunRecord <p>运行中的聊天请求, 返回为json字符串</p>
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

    public QueryUserSessionDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryUserSessionDetailResponse(QueryUserSessionDetailResponse source) {
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RecordList != null) {
            this.RecordList = new RecordList[source.RecordList.length];
            for (int i = 0; i < source.RecordList.length; i++) {
                this.RecordList[i] = new RecordList(source.RecordList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
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
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamArrayObj(map, prefix + "RecordList.", this.RecordList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RunRecord", this.RunRecord);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

