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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAppSummaryResponse extends AbstractModel {

    /**
    * 用户参与应用的统计指标 
    */
    @SerializedName("AppCounter")
    @Expose
    private ResourceCounterData AppCounter;

    /**
    * 用户创建资源的统计指标
    */
    @SerializedName("UserCounter")
    @Expose
    private ResourceCounterData UserCounter;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户参与应用的统计指标  
     * @return AppCounter 用户参与应用的统计指标 
     */
    public ResourceCounterData getAppCounter() {
        return this.AppCounter;
    }

    /**
     * Set 用户参与应用的统计指标 
     * @param AppCounter 用户参与应用的统计指标 
     */
    public void setAppCounter(ResourceCounterData AppCounter) {
        this.AppCounter = AppCounter;
    }

    /**
     * Get 用户创建资源的统计指标 
     * @return UserCounter 用户创建资源的统计指标
     */
    public ResourceCounterData getUserCounter() {
        return this.UserCounter;
    }

    /**
     * Set 用户创建资源的统计指标
     * @param UserCounter 用户创建资源的统计指标
     */
    public void setUserCounter(ResourceCounterData UserCounter) {
        this.UserCounter = UserCounter;
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

    public GetAppSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAppSummaryResponse(GetAppSummaryResponse source) {
        if (source.AppCounter != null) {
            this.AppCounter = new ResourceCounterData(source.AppCounter);
        }
        if (source.UserCounter != null) {
            this.UserCounter = new ResourceCounterData(source.UserCounter);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AppCounter.", this.AppCounter);
        this.setParamObj(map, prefix + "UserCounter.", this.UserCounter);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

