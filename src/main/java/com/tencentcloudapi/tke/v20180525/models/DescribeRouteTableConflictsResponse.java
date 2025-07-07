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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRouteTableConflictsResponse extends AbstractModel {

    /**
    * 路由表是否冲突。
    */
    @SerializedName("HasConflict")
    @Expose
    private Boolean HasConflict;

    /**
    * 路由表冲突列表。
    */
    @SerializedName("RouteTableConflictSet")
    @Expose
    private RouteTableConflict [] RouteTableConflictSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 路由表是否冲突。 
     * @return HasConflict 路由表是否冲突。
     */
    public Boolean getHasConflict() {
        return this.HasConflict;
    }

    /**
     * Set 路由表是否冲突。
     * @param HasConflict 路由表是否冲突。
     */
    public void setHasConflict(Boolean HasConflict) {
        this.HasConflict = HasConflict;
    }

    /**
     * Get 路由表冲突列表。 
     * @return RouteTableConflictSet 路由表冲突列表。
     */
    public RouteTableConflict [] getRouteTableConflictSet() {
        return this.RouteTableConflictSet;
    }

    /**
     * Set 路由表冲突列表。
     * @param RouteTableConflictSet 路由表冲突列表。
     */
    public void setRouteTableConflictSet(RouteTableConflict [] RouteTableConflictSet) {
        this.RouteTableConflictSet = RouteTableConflictSet;
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

    public DescribeRouteTableConflictsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRouteTableConflictsResponse(DescribeRouteTableConflictsResponse source) {
        if (source.HasConflict != null) {
            this.HasConflict = new Boolean(source.HasConflict);
        }
        if (source.RouteTableConflictSet != null) {
            this.RouteTableConflictSet = new RouteTableConflict[source.RouteTableConflictSet.length];
            for (int i = 0; i < source.RouteTableConflictSet.length; i++) {
                this.RouteTableConflictSet[i] = new RouteTableConflict(source.RouteTableConflictSet[i]);
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
        this.setParamSimple(map, prefix + "HasConflict", this.HasConflict);
        this.setParamArrayObj(map, prefix + "RouteTableConflictSet.", this.RouteTableConflictSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

