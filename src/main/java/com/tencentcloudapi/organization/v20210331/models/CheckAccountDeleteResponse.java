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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckAccountDeleteResponse extends AbstractModel {

    /**
    * 成员是否允许删除。 true-是、false-否
    */
    @SerializedName("AllowDelete")
    @Expose
    private Boolean AllowDelete;

    /**
    * 不允许删除原因。
    */
    @SerializedName("NotAllowReason")
    @Expose
    private NotAllowReason NotAllowReason;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 成员是否允许删除。 true-是、false-否 
     * @return AllowDelete 成员是否允许删除。 true-是、false-否
     */
    public Boolean getAllowDelete() {
        return this.AllowDelete;
    }

    /**
     * Set 成员是否允许删除。 true-是、false-否
     * @param AllowDelete 成员是否允许删除。 true-是、false-否
     */
    public void setAllowDelete(Boolean AllowDelete) {
        this.AllowDelete = AllowDelete;
    }

    /**
     * Get 不允许删除原因。 
     * @return NotAllowReason 不允许删除原因。
     */
    public NotAllowReason getNotAllowReason() {
        return this.NotAllowReason;
    }

    /**
     * Set 不允许删除原因。
     * @param NotAllowReason 不允许删除原因。
     */
    public void setNotAllowReason(NotAllowReason NotAllowReason) {
        this.NotAllowReason = NotAllowReason;
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

    public CheckAccountDeleteResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckAccountDeleteResponse(CheckAccountDeleteResponse source) {
        if (source.AllowDelete != null) {
            this.AllowDelete = new Boolean(source.AllowDelete);
        }
        if (source.NotAllowReason != null) {
            this.NotAllowReason = new NotAllowReason(source.NotAllowReason);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllowDelete", this.AllowDelete);
        this.setParamObj(map, prefix + "NotAllowReason.", this.NotAllowReason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

