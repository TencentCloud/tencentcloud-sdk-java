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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordingRuleTaskResponse extends AbstractModel {

    /**
    * <p>RecordingRule任务列表信息</p>
    */
    @SerializedName("RecordingRuleTaskInfos")
    @Expose
    private RecordingRuleTaskInfo [] RecordingRuleTaskInfos;

    /**
    * <p>任务总条数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>RecordingRule任务列表信息</p> 
     * @return RecordingRuleTaskInfos <p>RecordingRule任务列表信息</p>
     */
    public RecordingRuleTaskInfo [] getRecordingRuleTaskInfos() {
        return this.RecordingRuleTaskInfos;
    }

    /**
     * Set <p>RecordingRule任务列表信息</p>
     * @param RecordingRuleTaskInfos <p>RecordingRule任务列表信息</p>
     */
    public void setRecordingRuleTaskInfos(RecordingRuleTaskInfo [] RecordingRuleTaskInfos) {
        this.RecordingRuleTaskInfos = RecordingRuleTaskInfos;
    }

    /**
     * Get <p>任务总条数</p> 
     * @return TotalCount <p>任务总条数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>任务总条数</p>
     * @param TotalCount <p>任务总条数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeRecordingRuleTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordingRuleTaskResponse(DescribeRecordingRuleTaskResponse source) {
        if (source.RecordingRuleTaskInfos != null) {
            this.RecordingRuleTaskInfos = new RecordingRuleTaskInfo[source.RecordingRuleTaskInfos.length];
            for (int i = 0; i < source.RecordingRuleTaskInfos.length; i++) {
                this.RecordingRuleTaskInfos[i] = new RecordingRuleTaskInfo(source.RecordingRuleTaskInfos[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RecordingRuleTaskInfos.", this.RecordingRuleTaskInfos);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

