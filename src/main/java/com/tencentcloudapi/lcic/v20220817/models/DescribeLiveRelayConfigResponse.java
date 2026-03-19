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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveRelayConfigResponse extends AbstractModel {

    /**
    * <p>转推类型</p><p>枚举值：</p><ul><li>0： 单流</li><li>1： 混流</li></ul>
    */
    @SerializedName("RelayType")
    @Expose
    private Long RelayType;

    /**
    * <p>转推URL</p>
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * <p>是否是腾讯云CDN。</p><p>枚举值：</p><ul><li>0： 转推非腾讯云CDN</li><li>1： 转推腾讯CDN</li></ul>
    */
    @SerializedName("IsTencentCdn")
    @Expose
    private Long IsTencentCdn;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>转推类型</p><p>枚举值：</p><ul><li>0： 单流</li><li>1： 混流</li></ul> 
     * @return RelayType <p>转推类型</p><p>枚举值：</p><ul><li>0： 单流</li><li>1： 混流</li></ul>
     */
    public Long getRelayType() {
        return this.RelayType;
    }

    /**
     * Set <p>转推类型</p><p>枚举值：</p><ul><li>0： 单流</li><li>1： 混流</li></ul>
     * @param RelayType <p>转推类型</p><p>枚举值：</p><ul><li>0： 单流</li><li>1： 混流</li></ul>
     */
    public void setRelayType(Long RelayType) {
        this.RelayType = RelayType;
    }

    /**
     * Get <p>转推URL</p> 
     * @return Urls <p>转推URL</p>
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set <p>转推URL</p>
     * @param Urls <p>转推URL</p>
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get <p>是否是腾讯云CDN。</p><p>枚举值：</p><ul><li>0： 转推非腾讯云CDN</li><li>1： 转推腾讯CDN</li></ul> 
     * @return IsTencentCdn <p>是否是腾讯云CDN。</p><p>枚举值：</p><ul><li>0： 转推非腾讯云CDN</li><li>1： 转推腾讯CDN</li></ul>
     */
    public Long getIsTencentCdn() {
        return this.IsTencentCdn;
    }

    /**
     * Set <p>是否是腾讯云CDN。</p><p>枚举值：</p><ul><li>0： 转推非腾讯云CDN</li><li>1： 转推腾讯CDN</li></ul>
     * @param IsTencentCdn <p>是否是腾讯云CDN。</p><p>枚举值：</p><ul><li>0： 转推非腾讯云CDN</li><li>1： 转推腾讯CDN</li></ul>
     */
    public void setIsTencentCdn(Long IsTencentCdn) {
        this.IsTencentCdn = IsTencentCdn;
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

    public DescribeLiveRelayConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveRelayConfigResponse(DescribeLiveRelayConfigResponse source) {
        if (source.RelayType != null) {
            this.RelayType = new Long(source.RelayType);
        }
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
        if (source.IsTencentCdn != null) {
            this.IsTencentCdn = new Long(source.IsTencentCdn);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RelayType", this.RelayType);
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "IsTencentCdn", this.IsTencentCdn);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

