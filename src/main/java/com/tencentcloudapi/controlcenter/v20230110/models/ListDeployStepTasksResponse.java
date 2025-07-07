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
package com.tencentcloudapi.controlcenter.v20230110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDeployStepTasksResponse extends AbstractModel {

    /**
    * 账号工厂基线功能项应用信息列表。
    */
    @SerializedName("BaselineDeployStepTaskList")
    @Expose
    private BaselineStepTaskInfo [] BaselineDeployStepTaskList;

    /**
    * 总数。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 账号工厂基线功能项应用信息列表。 
     * @return BaselineDeployStepTaskList 账号工厂基线功能项应用信息列表。
     */
    public BaselineStepTaskInfo [] getBaselineDeployStepTaskList() {
        return this.BaselineDeployStepTaskList;
    }

    /**
     * Set 账号工厂基线功能项应用信息列表。
     * @param BaselineDeployStepTaskList 账号工厂基线功能项应用信息列表。
     */
    public void setBaselineDeployStepTaskList(BaselineStepTaskInfo [] BaselineDeployStepTaskList) {
        this.BaselineDeployStepTaskList = BaselineDeployStepTaskList;
    }

    /**
     * Get 总数。 
     * @return Total 总数。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数。
     * @param Total 总数。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public ListDeployStepTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDeployStepTasksResponse(ListDeployStepTasksResponse source) {
        if (source.BaselineDeployStepTaskList != null) {
            this.BaselineDeployStepTaskList = new BaselineStepTaskInfo[source.BaselineDeployStepTaskList.length];
            for (int i = 0; i < source.BaselineDeployStepTaskList.length; i++) {
                this.BaselineDeployStepTaskList[i] = new BaselineStepTaskInfo(source.BaselineDeployStepTaskList[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BaselineDeployStepTaskList.", this.BaselineDeployStepTaskList);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

