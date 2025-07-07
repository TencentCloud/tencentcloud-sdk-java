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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAppUsrResponse extends AbstractModel {

    /**
    * 厂商云标识用户的唯一ID
    */
    @SerializedName("CunionId")
    @Expose
    private String CunionId;

    /**
    * 客户的终端用户在IoT Video上的唯一标识ID
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * 用户是否为新创建
    */
    @SerializedName("NewRegist")
    @Expose
    private Boolean NewRegist;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 厂商云标识用户的唯一ID 
     * @return CunionId 厂商云标识用户的唯一ID
     */
    public String getCunionId() {
        return this.CunionId;
    }

    /**
     * Set 厂商云标识用户的唯一ID
     * @param CunionId 厂商云标识用户的唯一ID
     */
    public void setCunionId(String CunionId) {
        this.CunionId = CunionId;
    }

    /**
     * Get 客户的终端用户在IoT Video上的唯一标识ID 
     * @return AccessId 客户的终端用户在IoT Video上的唯一标识ID
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set 客户的终端用户在IoT Video上的唯一标识ID
     * @param AccessId 客户的终端用户在IoT Video上的唯一标识ID
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get 用户是否为新创建 
     * @return NewRegist 用户是否为新创建
     */
    public Boolean getNewRegist() {
        return this.NewRegist;
    }

    /**
     * Set 用户是否为新创建
     * @param NewRegist 用户是否为新创建
     */
    public void setNewRegist(Boolean NewRegist) {
        this.NewRegist = NewRegist;
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

    public CreateAppUsrResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAppUsrResponse(CreateAppUsrResponse source) {
        if (source.CunionId != null) {
            this.CunionId = new String(source.CunionId);
        }
        if (source.AccessId != null) {
            this.AccessId = new String(source.AccessId);
        }
        if (source.NewRegist != null) {
            this.NewRegist = new Boolean(source.NewRegist);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CunionId", this.CunionId);
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "NewRegist", this.NewRegist);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

