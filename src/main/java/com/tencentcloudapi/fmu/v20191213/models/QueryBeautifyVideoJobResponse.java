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
package com.tencentcloudapi.fmu.v20191213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryBeautifyVideoJobResponse extends AbstractModel{

    /**
    * 当前任务状态：排队中、处理中、处理失败或者处理完成
    */
    @SerializedName("JobStatus")
    @Expose
    private String JobStatus;

    /**
    * 视频美颜输出的结果信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeautifyVideoOutput")
    @Expose
    private BeautifyVideoOutput BeautifyVideoOutput;

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
     * Get 视频美颜输出的结果信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeautifyVideoOutput 视频美颜输出的结果信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BeautifyVideoOutput getBeautifyVideoOutput() {
        return this.BeautifyVideoOutput;
    }

    /**
     * Set 视频美颜输出的结果信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeautifyVideoOutput 视频美颜输出的结果信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeautifyVideoOutput(BeautifyVideoOutput BeautifyVideoOutput) {
        this.BeautifyVideoOutput = BeautifyVideoOutput;
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

    public QueryBeautifyVideoJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryBeautifyVideoJobResponse(QueryBeautifyVideoJobResponse source) {
        if (source.JobStatus != null) {
            this.JobStatus = new String(source.JobStatus);
        }
        if (source.BeautifyVideoOutput != null) {
            this.BeautifyVideoOutput = new BeautifyVideoOutput(source.BeautifyVideoOutput);
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
        this.setParamObj(map, prefix + "BeautifyVideoOutput.", this.BeautifyVideoOutput);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

