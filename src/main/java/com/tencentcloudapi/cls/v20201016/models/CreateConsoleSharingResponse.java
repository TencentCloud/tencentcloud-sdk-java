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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConsoleSharingResponse extends AbstractModel {

    /**
    * 免密分享链接
    */
    @SerializedName("SharingUrl")
    @Expose
    private String SharingUrl;

    /**
    * 免密分享链接ID
    */
    @SerializedName("SharingId")
    @Expose
    private String SharingId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 免密分享链接 
     * @return SharingUrl 免密分享链接
     */
    public String getSharingUrl() {
        return this.SharingUrl;
    }

    /**
     * Set 免密分享链接
     * @param SharingUrl 免密分享链接
     */
    public void setSharingUrl(String SharingUrl) {
        this.SharingUrl = SharingUrl;
    }

    /**
     * Get 免密分享链接ID 
     * @return SharingId 免密分享链接ID
     */
    public String getSharingId() {
        return this.SharingId;
    }

    /**
     * Set 免密分享链接ID
     * @param SharingId 免密分享链接ID
     */
    public void setSharingId(String SharingId) {
        this.SharingId = SharingId;
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

    public CreateConsoleSharingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConsoleSharingResponse(CreateConsoleSharingResponse source) {
        if (source.SharingUrl != null) {
            this.SharingUrl = new String(source.SharingUrl);
        }
        if (source.SharingId != null) {
            this.SharingId = new String(source.SharingId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SharingUrl", this.SharingUrl);
        this.setParamSimple(map, prefix + "SharingId", this.SharingId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

