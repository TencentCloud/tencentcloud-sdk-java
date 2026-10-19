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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopWorkflowRunListResponse extends AbstractModel {

    /**
    * <p>停止成功的运行实例ID列表</p>
    */
    @SerializedName("SuccessIdList")
    @Expose
    private String [] SuccessIdList;

    /**
    * <p>停止失败的运行实例ID列表</p>
    */
    @SerializedName("FailedIdList")
    @Expose
    private String [] FailedIdList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>停止成功的运行实例ID列表</p> 
     * @return SuccessIdList <p>停止成功的运行实例ID列表</p>
     */
    public String [] getSuccessIdList() {
        return this.SuccessIdList;
    }

    /**
     * Set <p>停止成功的运行实例ID列表</p>
     * @param SuccessIdList <p>停止成功的运行实例ID列表</p>
     */
    public void setSuccessIdList(String [] SuccessIdList) {
        this.SuccessIdList = SuccessIdList;
    }

    /**
     * Get <p>停止失败的运行实例ID列表</p> 
     * @return FailedIdList <p>停止失败的运行实例ID列表</p>
     */
    public String [] getFailedIdList() {
        return this.FailedIdList;
    }

    /**
     * Set <p>停止失败的运行实例ID列表</p>
     * @param FailedIdList <p>停止失败的运行实例ID列表</p>
     */
    public void setFailedIdList(String [] FailedIdList) {
        this.FailedIdList = FailedIdList;
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

    public StopWorkflowRunListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopWorkflowRunListResponse(StopWorkflowRunListResponse source) {
        if (source.SuccessIdList != null) {
            this.SuccessIdList = new String[source.SuccessIdList.length];
            for (int i = 0; i < source.SuccessIdList.length; i++) {
                this.SuccessIdList[i] = new String(source.SuccessIdList[i]);
            }
        }
        if (source.FailedIdList != null) {
            this.FailedIdList = new String[source.FailedIdList.length];
            for (int i = 0; i < source.FailedIdList.length; i++) {
                this.FailedIdList[i] = new String(source.FailedIdList[i]);
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
        this.setParamArraySimple(map, prefix + "SuccessIdList.", this.SuccessIdList);
        this.setParamArraySimple(map, prefix + "FailedIdList.", this.FailedIdList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

