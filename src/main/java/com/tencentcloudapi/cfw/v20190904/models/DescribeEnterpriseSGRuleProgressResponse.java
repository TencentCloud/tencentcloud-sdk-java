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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnterpriseSGRuleProgressResponse extends AbstractModel {

    /**
    * 0-100，代表下发进度百分比
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 是否用户中止 用户中止返回true
    */
    @SerializedName("UserStopped")
    @Expose
    private Boolean UserStopped;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 0-100，代表下发进度百分比 
     * @return Progress 0-100，代表下发进度百分比
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 0-100，代表下发进度百分比
     * @param Progress 0-100，代表下发进度百分比
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 是否用户中止 用户中止返回true 
     * @return UserStopped 是否用户中止 用户中止返回true
     */
    public Boolean getUserStopped() {
        return this.UserStopped;
    }

    /**
     * Set 是否用户中止 用户中止返回true
     * @param UserStopped 是否用户中止 用户中止返回true
     */
    public void setUserStopped(Boolean UserStopped) {
        this.UserStopped = UserStopped;
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

    public DescribeEnterpriseSGRuleProgressResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnterpriseSGRuleProgressResponse(DescribeEnterpriseSGRuleProgressResponse source) {
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.UserStopped != null) {
            this.UserStopped = new Boolean(source.UserStopped);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "UserStopped", this.UserStopped);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

