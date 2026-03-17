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

public class DescribeReverseShellSystemPolicyConfigResponse extends AbstractModel {

    /**
    * 内网告警展示
    */
    @SerializedName("InnerNetAlarmShow")
    @Expose
    private Boolean InnerNetAlarmShow;

    /**
    * 内网ip展示
    */
    @SerializedName("InnerIPShow")
    @Expose
    private Boolean InnerIPShow;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 内网告警展示 
     * @return InnerNetAlarmShow 内网告警展示
     */
    public Boolean getInnerNetAlarmShow() {
        return this.InnerNetAlarmShow;
    }

    /**
     * Set 内网告警展示
     * @param InnerNetAlarmShow 内网告警展示
     */
    public void setInnerNetAlarmShow(Boolean InnerNetAlarmShow) {
        this.InnerNetAlarmShow = InnerNetAlarmShow;
    }

    /**
     * Get 内网ip展示 
     * @return InnerIPShow 内网ip展示
     */
    public Boolean getInnerIPShow() {
        return this.InnerIPShow;
    }

    /**
     * Set 内网ip展示
     * @param InnerIPShow 内网ip展示
     */
    public void setInnerIPShow(Boolean InnerIPShow) {
        this.InnerIPShow = InnerIPShow;
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

    public DescribeReverseShellSystemPolicyConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReverseShellSystemPolicyConfigResponse(DescribeReverseShellSystemPolicyConfigResponse source) {
        if (source.InnerNetAlarmShow != null) {
            this.InnerNetAlarmShow = new Boolean(source.InnerNetAlarmShow);
        }
        if (source.InnerIPShow != null) {
            this.InnerIPShow = new Boolean(source.InnerIPShow);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InnerNetAlarmShow", this.InnerNetAlarmShow);
        this.setParamSimple(map, prefix + "InnerIPShow", this.InnerIPShow);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

