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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBinlogConfigResponse extends AbstractModel {

    /**
    * Binlog跨地域配置更新时间
    */
    @SerializedName("BinlogCrossRegionsConfigUpdateTime")
    @Expose
    private String BinlogCrossRegionsConfigUpdateTime;

    /**
    * Binlog配置信息
    */
    @SerializedName("BinlogConfig")
    @Expose
    private BinlogConfigInfo BinlogConfig;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Binlog跨地域配置更新时间 
     * @return BinlogCrossRegionsConfigUpdateTime Binlog跨地域配置更新时间
     */
    public String getBinlogCrossRegionsConfigUpdateTime() {
        return this.BinlogCrossRegionsConfigUpdateTime;
    }

    /**
     * Set Binlog跨地域配置更新时间
     * @param BinlogCrossRegionsConfigUpdateTime Binlog跨地域配置更新时间
     */
    public void setBinlogCrossRegionsConfigUpdateTime(String BinlogCrossRegionsConfigUpdateTime) {
        this.BinlogCrossRegionsConfigUpdateTime = BinlogCrossRegionsConfigUpdateTime;
    }

    /**
     * Get Binlog配置信息 
     * @return BinlogConfig Binlog配置信息
     */
    public BinlogConfigInfo getBinlogConfig() {
        return this.BinlogConfig;
    }

    /**
     * Set Binlog配置信息
     * @param BinlogConfig Binlog配置信息
     */
    public void setBinlogConfig(BinlogConfigInfo BinlogConfig) {
        this.BinlogConfig = BinlogConfig;
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

    public DescribeBinlogConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBinlogConfigResponse(DescribeBinlogConfigResponse source) {
        if (source.BinlogCrossRegionsConfigUpdateTime != null) {
            this.BinlogCrossRegionsConfigUpdateTime = new String(source.BinlogCrossRegionsConfigUpdateTime);
        }
        if (source.BinlogConfig != null) {
            this.BinlogConfig = new BinlogConfigInfo(source.BinlogConfig);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BinlogCrossRegionsConfigUpdateTime", this.BinlogCrossRegionsConfigUpdateTime);
        this.setParamObj(map, prefix + "BinlogConfig.", this.BinlogConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

