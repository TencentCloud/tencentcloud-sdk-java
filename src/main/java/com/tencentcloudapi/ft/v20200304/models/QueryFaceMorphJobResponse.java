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
package com.tencentcloudapi.ft.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFaceMorphJobResponse extends AbstractModel{

    /**
    * 当前任务状态：排队中、处理中、处理失败或者处理完成
    */
    @SerializedName("JobStatus")
    @Expose
    private String JobStatus;

    /**
    * 人像渐变输出的结果信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaceMorphOutput")
    @Expose
    private FaceMorphOutput FaceMorphOutput;

    /**
    * 当前任务状态码：1：排队中、3: 处理中、5: 处理失败、7:处理完成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobStatusCode")
    @Expose
    private Long JobStatusCode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前任务状态：排队中、处理中、处理失败或者处理完成 
     * @return JobStatus 当前任务状态：排队中、处理中、处理失败或者处理完成
     */
    public String getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set 当前任务状态：排队中、处理中、处理失败或者处理完成
     * @param JobStatus 当前任务状态：排队中、处理中、处理失败或者处理完成
     */
    public void setJobStatus(String JobStatus) {
        this.JobStatus = JobStatus;
    }

    /**
     * Get 人像渐变输出的结果信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaceMorphOutput 人像渐变输出的结果信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FaceMorphOutput getFaceMorphOutput() {
        return this.FaceMorphOutput;
    }

    /**
     * Set 人像渐变输出的结果信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceMorphOutput 人像渐变输出的结果信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceMorphOutput(FaceMorphOutput FaceMorphOutput) {
        this.FaceMorphOutput = FaceMorphOutput;
    }

    /**
     * Get 当前任务状态码：1：排队中、3: 处理中、5: 处理失败、7:处理完成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobStatusCode 当前任务状态码：1：排队中、3: 处理中、5: 处理失败、7:处理完成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobStatusCode() {
        return this.JobStatusCode;
    }

    /**
     * Set 当前任务状态码：1：排队中、3: 处理中、5: 处理失败、7:处理完成
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobStatusCode 当前任务状态码：1：排队中、3: 处理中、5: 处理失败、7:处理完成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobStatusCode(Long JobStatusCode) {
        this.JobStatusCode = JobStatusCode;
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

    public QueryFaceMorphJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFaceMorphJobResponse(QueryFaceMorphJobResponse source) {
        if (source.JobStatus != null) {
            this.JobStatus = new String(source.JobStatus);
        }
        if (source.FaceMorphOutput != null) {
            this.FaceMorphOutput = new FaceMorphOutput(source.FaceMorphOutput);
        }
        if (source.JobStatusCode != null) {
            this.JobStatusCode = new Long(source.JobStatusCode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);
        this.setParamObj(map, prefix + "FaceMorphOutput.", this.FaceMorphOutput);
        this.setParamSimple(map, prefix + "JobStatusCode", this.JobStatusCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

