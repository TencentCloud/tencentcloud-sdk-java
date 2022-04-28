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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePurgeTaskResponse extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 失败的任务列表及原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedList")
    @Expose
    private FailReason [] FailedList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务ID 
     * @return JobId 任务ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务ID
     * @param JobId 任务ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 失败的任务列表及原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedList 失败的任务列表及原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FailReason [] getFailedList() {
        return this.FailedList;
    }

    /**
     * Set 失败的任务列表及原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedList 失败的任务列表及原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedList(FailReason [] FailedList) {
        this.FailedList = FailedList;
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

    public CreatePurgeTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePurgeTaskResponse(CreatePurgeTaskResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.FailedList != null) {
            this.FailedList = new FailReason[source.FailedList.length];
            for (int i = 0; i < source.FailedList.length; i++) {
                this.FailedList[i] = new FailReason(source.FailedList[i]);
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
        this.setParamArrayObj(map, prefix + "FailedList.", this.FailedList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

