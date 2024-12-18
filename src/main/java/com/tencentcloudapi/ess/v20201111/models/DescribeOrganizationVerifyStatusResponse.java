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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationVerifyStatusResponse extends AbstractModel {

    /**
    * 当前企业认证状态
<ul>
<li> <b>0 </b>:未认证</li>
<li> <b>1 </b> : 认证中</li>
<li> <b>2 </b> : 已认证</li>
</ul>
    */
    @SerializedName("VerifyStatus")
    @Expose
    private Long VerifyStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前企业认证状态
<ul>
<li> <b>0 </b>:未认证</li>
<li> <b>1 </b> : 认证中</li>
<li> <b>2 </b> : 已认证</li>
</ul> 
     * @return VerifyStatus 当前企业认证状态
<ul>
<li> <b>0 </b>:未认证</li>
<li> <b>1 </b> : 认证中</li>
<li> <b>2 </b> : 已认证</li>
</ul>
     */
    public Long getVerifyStatus() {
        return this.VerifyStatus;
    }

    /**
     * Set 当前企业认证状态
<ul>
<li> <b>0 </b>:未认证</li>
<li> <b>1 </b> : 认证中</li>
<li> <b>2 </b> : 已认证</li>
</ul>
     * @param VerifyStatus 当前企业认证状态
<ul>
<li> <b>0 </b>:未认证</li>
<li> <b>1 </b> : 认证中</li>
<li> <b>2 </b> : 已认证</li>
</ul>
     */
    public void setVerifyStatus(Long VerifyStatus) {
        this.VerifyStatus = VerifyStatus;
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

    public DescribeOrganizationVerifyStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationVerifyStatusResponse(DescribeOrganizationVerifyStatusResponse source) {
        if (source.VerifyStatus != null) {
            this.VerifyStatus = new Long(source.VerifyStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerifyStatus", this.VerifyStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

