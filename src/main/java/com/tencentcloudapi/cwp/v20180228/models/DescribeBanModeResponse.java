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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBanModeResponse extends AbstractModel {

    /**
    * <p>阻断模式，STANDARD_MODE：标准阻断，DEEP_MODE：深度阻断</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>标准阻断模式的配置</p>
    */
    @SerializedName("StandardModeConfig")
    @Expose
    private StandardModeConfig StandardModeConfig;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>阻断模式，STANDARD_MODE：标准阻断，DEEP_MODE：深度阻断</p> 
     * @return Mode <p>阻断模式，STANDARD_MODE：标准阻断，DEEP_MODE：深度阻断</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>阻断模式，STANDARD_MODE：标准阻断，DEEP_MODE：深度阻断</p>
     * @param Mode <p>阻断模式，STANDARD_MODE：标准阻断，DEEP_MODE：深度阻断</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>标准阻断模式的配置</p> 
     * @return StandardModeConfig <p>标准阻断模式的配置</p>
     */
    public StandardModeConfig getStandardModeConfig() {
        return this.StandardModeConfig;
    }

    /**
     * Set <p>标准阻断模式的配置</p>
     * @param StandardModeConfig <p>标准阻断模式的配置</p>
     */
    public void setStandardModeConfig(StandardModeConfig StandardModeConfig) {
        this.StandardModeConfig = StandardModeConfig;
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

    public DescribeBanModeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBanModeResponse(DescribeBanModeResponse source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.StandardModeConfig != null) {
            this.StandardModeConfig = new StandardModeConfig(source.StandardModeConfig);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "StandardModeConfig.", this.StandardModeConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

