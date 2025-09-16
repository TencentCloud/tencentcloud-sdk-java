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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBatchIpAccessControlResponse extends AbstractModel {

    /**
    * 编辑失败的域名列表，如果非空则表示有域名编辑失败，整个批量规则编辑失败，否则则表示批量规则编辑成功。
    */
    @SerializedName("Failed")
    @Expose
    private BatchDomainResult [] Failed;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 编辑失败的域名列表，如果非空则表示有域名编辑失败，整个批量规则编辑失败，否则则表示批量规则编辑成功。 
     * @return Failed 编辑失败的域名列表，如果非空则表示有域名编辑失败，整个批量规则编辑失败，否则则表示批量规则编辑成功。
     */
    public BatchDomainResult [] getFailed() {
        return this.Failed;
    }

    /**
     * Set 编辑失败的域名列表，如果非空则表示有域名编辑失败，整个批量规则编辑失败，否则则表示批量规则编辑成功。
     * @param Failed 编辑失败的域名列表，如果非空则表示有域名编辑失败，整个批量规则编辑失败，否则则表示批量规则编辑成功。
     */
    public void setFailed(BatchDomainResult [] Failed) {
        this.Failed = Failed;
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

    public ModifyBatchIpAccessControlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBatchIpAccessControlResponse(ModifyBatchIpAccessControlResponse source) {
        if (source.Failed != null) {
            this.Failed = new BatchDomainResult[source.Failed.length];
            for (int i = 0; i < source.Failed.length; i++) {
                this.Failed[i] = new BatchDomainResult(source.Failed[i]);
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
        this.setParamArrayObj(map, prefix + "Failed.", this.Failed);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

