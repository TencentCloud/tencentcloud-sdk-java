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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitTaskTestRunResponse extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 无
    */
    @SerializedName("RecordId")
    @Expose
    private Long [] RecordId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 无 
     * @return JobId 无
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 无
     * @param JobId 无
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 无 
     * @return RecordId 无
     */
    public Long [] getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 无
     * @param RecordId 无
     */
    public void setRecordId(Long [] RecordId) {
        this.RecordId = RecordId;
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

    public SubmitTaskTestRunResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTaskTestRunResponse(SubmitTaskTestRunResponse source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long[source.RecordId.length];
            for (int i = 0; i < source.RecordId.length; i++) {
                this.RecordId[i] = new Long(source.RecordId[i]);
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
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamArraySimple(map, prefix + "RecordId.", this.RecordId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

