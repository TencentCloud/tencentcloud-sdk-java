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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyOwnershipResponse extends AbstractModel {

    /**
    * 归属权验证结果。
<li>success：验证成功；</li>
<li>fail：验证失败。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当验证结果为不通过时，该字段会返回原因，协助您排查问题。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 归属权验证结果。
<li>success：验证成功；</li>
<li>fail：验证失败。</li> 
     * @return Status 归属权验证结果。
<li>success：验证成功；</li>
<li>fail：验证失败。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 归属权验证结果。
<li>success：验证成功；</li>
<li>fail：验证失败。</li>
     * @param Status 归属权验证结果。
<li>success：验证成功；</li>
<li>fail：验证失败。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当验证结果为不通过时，该字段会返回原因，协助您排查问题。 
     * @return Result 当验证结果为不通过时，该字段会返回原因，协助您排查问题。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 当验证结果为不通过时，该字段会返回原因，协助您排查问题。
     * @param Result 当验证结果为不通过时，该字段会返回原因，协助您排查问题。
     */
    public void setResult(String Result) {
        this.Result = Result;
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

    public VerifyOwnershipResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyOwnershipResponse(VerifyOwnershipResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

