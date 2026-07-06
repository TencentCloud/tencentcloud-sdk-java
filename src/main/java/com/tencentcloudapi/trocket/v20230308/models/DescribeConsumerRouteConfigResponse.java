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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConsumerRouteConfigResponse extends AbstractModel {

    /**
    * <p>版本号</p>
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * <p>路由规格</p>
    */
    @SerializedName("Rules")
    @Expose
    private RouteRule [] Rules;

    /**
    * <p>切流时间戳</p>
    */
    @SerializedName("CutTimestamp")
    @Expose
    private Long CutTimestamp;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>版本号</p> 
     * @return Version <p>版本号</p>
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set <p>版本号</p>
     * @param Version <p>版本号</p>
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get <p>路由规格</p> 
     * @return Rules <p>路由规格</p>
     */
    public RouteRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>路由规格</p>
     * @param Rules <p>路由规格</p>
     */
    public void setRules(RouteRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>切流时间戳</p> 
     * @return CutTimestamp <p>切流时间戳</p>
     */
    public Long getCutTimestamp() {
        return this.CutTimestamp;
    }

    /**
     * Set <p>切流时间戳</p>
     * @param CutTimestamp <p>切流时间戳</p>
     */
    public void setCutTimestamp(Long CutTimestamp) {
        this.CutTimestamp = CutTimestamp;
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

    public DescribeConsumerRouteConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerRouteConfigResponse(DescribeConsumerRouteConfigResponse source) {
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.Rules != null) {
            this.Rules = new RouteRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RouteRule(source.Rules[i]);
            }
        }
        if (source.CutTimestamp != null) {
            this.CutTimestamp = new Long(source.CutTimestamp);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "CutTimestamp", this.CutTimestamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

