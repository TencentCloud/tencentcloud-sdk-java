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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBatchAdminChangeInvitationsResponse extends AbstractModel {

    /**
    * <p>批量生成企业认证链接的详细错误信息，顺序与输入参数子企业列表顺序一致。</p><ul><li>如果所有企业认证链接都成功生成，将不返回错误信息</li><li>如果存在任何错误，将返回具体的错误描述。（没有错误的企业返回空字符串）</li></ul>
    */
    @SerializedName("ErrorMessages")
    @Expose
    private String [] ErrorMessages;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>批量生成企业认证链接的详细错误信息，顺序与输入参数子企业列表顺序一致。</p><ul><li>如果所有企业认证链接都成功生成，将不返回错误信息</li><li>如果存在任何错误，将返回具体的错误描述。（没有错误的企业返回空字符串）</li></ul> 
     * @return ErrorMessages <p>批量生成企业认证链接的详细错误信息，顺序与输入参数子企业列表顺序一致。</p><ul><li>如果所有企业认证链接都成功生成，将不返回错误信息</li><li>如果存在任何错误，将返回具体的错误描述。（没有错误的企业返回空字符串）</li></ul>
     */
    public String [] getErrorMessages() {
        return this.ErrorMessages;
    }

    /**
     * Set <p>批量生成企业认证链接的详细错误信息，顺序与输入参数子企业列表顺序一致。</p><ul><li>如果所有企业认证链接都成功生成，将不返回错误信息</li><li>如果存在任何错误，将返回具体的错误描述。（没有错误的企业返回空字符串）</li></ul>
     * @param ErrorMessages <p>批量生成企业认证链接的详细错误信息，顺序与输入参数子企业列表顺序一致。</p><ul><li>如果所有企业认证链接都成功生成，将不返回错误信息</li><li>如果存在任何错误，将返回具体的错误描述。（没有错误的企业返回空字符串）</li></ul>
     */
    public void setErrorMessages(String [] ErrorMessages) {
        this.ErrorMessages = ErrorMessages;
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

    public CreateBatchAdminChangeInvitationsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchAdminChangeInvitationsResponse(CreateBatchAdminChangeInvitationsResponse source) {
        if (source.ErrorMessages != null) {
            this.ErrorMessages = new String[source.ErrorMessages.length];
            for (int i = 0; i < source.ErrorMessages.length; i++) {
                this.ErrorMessages[i] = new String(source.ErrorMessages[i]);
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
        this.setParamArraySimple(map, prefix + "ErrorMessages.", this.ErrorMessages);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

