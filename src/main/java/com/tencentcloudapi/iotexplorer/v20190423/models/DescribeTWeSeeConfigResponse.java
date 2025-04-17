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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTWeSeeConfigResponse extends AbstractModel {

    /**
    * 是否开启视频摘要
    */
    @SerializedName("EnableSummary")
    @Expose
    private Boolean EnableSummary;

    /**
    * 是否开启视频搜索
    */
    @SerializedName("EnableSearch")
    @Expose
    private Boolean EnableSearch;

    /**
    * 配置参数
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否开启视频摘要 
     * @return EnableSummary 是否开启视频摘要
     */
    public Boolean getEnableSummary() {
        return this.EnableSummary;
    }

    /**
     * Set 是否开启视频摘要
     * @param EnableSummary 是否开启视频摘要
     */
    public void setEnableSummary(Boolean EnableSummary) {
        this.EnableSummary = EnableSummary;
    }

    /**
     * Get 是否开启视频搜索 
     * @return EnableSearch 是否开启视频搜索
     */
    public Boolean getEnableSearch() {
        return this.EnableSearch;
    }

    /**
     * Set 是否开启视频搜索
     * @param EnableSearch 是否开启视频搜索
     */
    public void setEnableSearch(Boolean EnableSearch) {
        this.EnableSearch = EnableSearch;
    }

    /**
     * Get 配置参数 
     * @return Config 配置参数
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 配置参数
     * @param Config 配置参数
     */
    public void setConfig(String Config) {
        this.Config = Config;
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

    public DescribeTWeSeeConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTWeSeeConfigResponse(DescribeTWeSeeConfigResponse source) {
        if (source.EnableSummary != null) {
            this.EnableSummary = new Boolean(source.EnableSummary);
        }
        if (source.EnableSearch != null) {
            this.EnableSearch = new Boolean(source.EnableSearch);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableSummary", this.EnableSummary);
        this.setParamSimple(map, prefix + "EnableSearch", this.EnableSearch);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

