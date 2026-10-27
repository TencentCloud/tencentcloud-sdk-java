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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociateSecurityGroupResponse extends AbstractModel {

    /**
    * 关联成功的桌面列表
    */
    @SerializedName("SuccessSet")
    @Expose
    private String [] SuccessSet;

    /**
    * 关联失败的桌面列表
    */
    @SerializedName("FailureSet")
    @Expose
    private String [] FailureSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 关联成功的桌面列表 
     * @return SuccessSet 关联成功的桌面列表
     */
    public String [] getSuccessSet() {
        return this.SuccessSet;
    }

    /**
     * Set 关联成功的桌面列表
     * @param SuccessSet 关联成功的桌面列表
     */
    public void setSuccessSet(String [] SuccessSet) {
        this.SuccessSet = SuccessSet;
    }

    /**
     * Get 关联失败的桌面列表 
     * @return FailureSet 关联失败的桌面列表
     */
    public String [] getFailureSet() {
        return this.FailureSet;
    }

    /**
     * Set 关联失败的桌面列表
     * @param FailureSet 关联失败的桌面列表
     */
    public void setFailureSet(String [] FailureSet) {
        this.FailureSet = FailureSet;
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

    public AssociateSecurityGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateSecurityGroupResponse(AssociateSecurityGroupResponse source) {
        if (source.SuccessSet != null) {
            this.SuccessSet = new String[source.SuccessSet.length];
            for (int i = 0; i < source.SuccessSet.length; i++) {
                this.SuccessSet[i] = new String(source.SuccessSet[i]);
            }
        }
        if (source.FailureSet != null) {
            this.FailureSet = new String[source.FailureSet.length];
            for (int i = 0; i < source.FailureSet.length; i++) {
                this.FailureSet[i] = new String(source.FailureSet[i]);
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
        this.setParamArraySimple(map, prefix + "SuccessSet.", this.SuccessSet);
        this.setParamArraySimple(map, prefix + "FailureSet.", this.FailureSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

