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

public class DescribeImageConfigResponse extends AbstractModel {

    /**
    * WebpAdapter配置
    */
    @SerializedName("WebpAdapter")
    @Expose
    private WebpAdapter WebpAdapter;

    /**
    * TpgAdapter配置
    */
    @SerializedName("TpgAdapter")
    @Expose
    private TpgAdapter TpgAdapter;

    /**
    * GuetzliAdapter配置
    */
    @SerializedName("GuetzliAdapter")
    @Expose
    private GuetzliAdapter GuetzliAdapter;

    /**
    * AvifAdapter配置项
    */
    @SerializedName("AvifAdapter")
    @Expose
    private AvifAdapter AvifAdapter;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get WebpAdapter配置 
     * @return WebpAdapter WebpAdapter配置
     */
    public WebpAdapter getWebpAdapter() {
        return this.WebpAdapter;
    }

    /**
     * Set WebpAdapter配置
     * @param WebpAdapter WebpAdapter配置
     */
    public void setWebpAdapter(WebpAdapter WebpAdapter) {
        this.WebpAdapter = WebpAdapter;
    }

    /**
     * Get TpgAdapter配置 
     * @return TpgAdapter TpgAdapter配置
     */
    public TpgAdapter getTpgAdapter() {
        return this.TpgAdapter;
    }

    /**
     * Set TpgAdapter配置
     * @param TpgAdapter TpgAdapter配置
     */
    public void setTpgAdapter(TpgAdapter TpgAdapter) {
        this.TpgAdapter = TpgAdapter;
    }

    /**
     * Get GuetzliAdapter配置 
     * @return GuetzliAdapter GuetzliAdapter配置
     */
    public GuetzliAdapter getGuetzliAdapter() {
        return this.GuetzliAdapter;
    }

    /**
     * Set GuetzliAdapter配置
     * @param GuetzliAdapter GuetzliAdapter配置
     */
    public void setGuetzliAdapter(GuetzliAdapter GuetzliAdapter) {
        this.GuetzliAdapter = GuetzliAdapter;
    }

    /**
     * Get AvifAdapter配置项 
     * @return AvifAdapter AvifAdapter配置项
     */
    public AvifAdapter getAvifAdapter() {
        return this.AvifAdapter;
    }

    /**
     * Set AvifAdapter配置项
     * @param AvifAdapter AvifAdapter配置项
     */
    public void setAvifAdapter(AvifAdapter AvifAdapter) {
        this.AvifAdapter = AvifAdapter;
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

    public DescribeImageConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageConfigResponse(DescribeImageConfigResponse source) {
        if (source.WebpAdapter != null) {
            this.WebpAdapter = new WebpAdapter(source.WebpAdapter);
        }
        if (source.TpgAdapter != null) {
            this.TpgAdapter = new TpgAdapter(source.TpgAdapter);
        }
        if (source.GuetzliAdapter != null) {
            this.GuetzliAdapter = new GuetzliAdapter(source.GuetzliAdapter);
        }
        if (source.AvifAdapter != null) {
            this.AvifAdapter = new AvifAdapter(source.AvifAdapter);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WebpAdapter.", this.WebpAdapter);
        this.setParamObj(map, prefix + "TpgAdapter.", this.TpgAdapter);
        this.setParamObj(map, prefix + "GuetzliAdapter.", this.GuetzliAdapter);
        this.setParamObj(map, prefix + "AvifAdapter.", this.AvifAdapter);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

