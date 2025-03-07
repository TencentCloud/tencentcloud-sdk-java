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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConvertOperatingSystemsResponse extends AbstractModel {

    /**
    * 转换的目标操系统信息，仅在入参 DryRun 为 true 时返回。
    */
    @SerializedName("SupportTargetOSList")
    @Expose
    private TargetOS [] SupportTargetOSList;

    /**
    * 操作系统转换的任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 转换的目标操系统信息，仅在入参 DryRun 为 true 时返回。 
     * @return SupportTargetOSList 转换的目标操系统信息，仅在入参 DryRun 为 true 时返回。
     */
    public TargetOS [] getSupportTargetOSList() {
        return this.SupportTargetOSList;
    }

    /**
     * Set 转换的目标操系统信息，仅在入参 DryRun 为 true 时返回。
     * @param SupportTargetOSList 转换的目标操系统信息，仅在入参 DryRun 为 true 时返回。
     */
    public void setSupportTargetOSList(TargetOS [] SupportTargetOSList) {
        this.SupportTargetOSList = SupportTargetOSList;
    }

    /**
     * Get 操作系统转换的任务 ID 
     * @return TaskId 操作系统转换的任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 操作系统转换的任务 ID
     * @param TaskId 操作系统转换的任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    public ConvertOperatingSystemsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConvertOperatingSystemsResponse(ConvertOperatingSystemsResponse source) {
        if (source.SupportTargetOSList != null) {
            this.SupportTargetOSList = new TargetOS[source.SupportTargetOSList.length];
            for (int i = 0; i < source.SupportTargetOSList.length; i++) {
                this.SupportTargetOSList[i] = new TargetOS(source.SupportTargetOSList[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SupportTargetOSList.", this.SupportTargetOSList);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

