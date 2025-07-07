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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePurgeQuotaResponse extends AbstractModel {

    /**
    * URL刷新用量及配额。
    */
    @SerializedName("UrlPurge")
    @Expose
    private Quota [] UrlPurge;

    /**
    * 目录刷新用量及配额。
    */
    @SerializedName("PathPurge")
    @Expose
    private Quota [] PathPurge;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get URL刷新用量及配额。 
     * @return UrlPurge URL刷新用量及配额。
     */
    public Quota [] getUrlPurge() {
        return this.UrlPurge;
    }

    /**
     * Set URL刷新用量及配额。
     * @param UrlPurge URL刷新用量及配额。
     */
    public void setUrlPurge(Quota [] UrlPurge) {
        this.UrlPurge = UrlPurge;
    }

    /**
     * Get 目录刷新用量及配额。 
     * @return PathPurge 目录刷新用量及配额。
     */
    public Quota [] getPathPurge() {
        return this.PathPurge;
    }

    /**
     * Set 目录刷新用量及配额。
     * @param PathPurge 目录刷新用量及配额。
     */
    public void setPathPurge(Quota [] PathPurge) {
        this.PathPurge = PathPurge;
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

    public DescribePurgeQuotaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePurgeQuotaResponse(DescribePurgeQuotaResponse source) {
        if (source.UrlPurge != null) {
            this.UrlPurge = new Quota[source.UrlPurge.length];
            for (int i = 0; i < source.UrlPurge.length; i++) {
                this.UrlPurge[i] = new Quota(source.UrlPurge[i]);
            }
        }
        if (source.PathPurge != null) {
            this.PathPurge = new Quota[source.PathPurge.length];
            for (int i = 0; i < source.PathPurge.length; i++) {
                this.PathPurge[i] = new Quota(source.PathPurge[i]);
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
        this.setParamArrayObj(map, prefix + "UrlPurge.", this.UrlPurge);
        this.setParamArrayObj(map, prefix + "PathPurge.", this.PathPurge);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

