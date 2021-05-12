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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceRoutesResponse extends AbstractModel{

    /**
    * 原路由策略信息。
    */
    @SerializedName("OldRouteSet")
    @Expose
    private Route [] OldRouteSet;

    /**
    * 修改后的路由策略信息。
    */
    @SerializedName("NewRouteSet")
    @Expose
    private Route [] NewRouteSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 原路由策略信息。 
     * @return OldRouteSet 原路由策略信息。
     */
    public Route [] getOldRouteSet() {
        return this.OldRouteSet;
    }

    /**
     * Set 原路由策略信息。
     * @param OldRouteSet 原路由策略信息。
     */
    public void setOldRouteSet(Route [] OldRouteSet) {
        this.OldRouteSet = OldRouteSet;
    }

    /**
     * Get 修改后的路由策略信息。 
     * @return NewRouteSet 修改后的路由策略信息。
     */
    public Route [] getNewRouteSet() {
        return this.NewRouteSet;
    }

    /**
     * Set 修改后的路由策略信息。
     * @param NewRouteSet 修改后的路由策略信息。
     */
    public void setNewRouteSet(Route [] NewRouteSet) {
        this.NewRouteSet = NewRouteSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ReplaceRoutesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceRoutesResponse(ReplaceRoutesResponse source) {
        if (source.OldRouteSet != null) {
            this.OldRouteSet = new Route[source.OldRouteSet.length];
            for (int i = 0; i < source.OldRouteSet.length; i++) {
                this.OldRouteSet[i] = new Route(source.OldRouteSet[i]);
            }
        }
        if (source.NewRouteSet != null) {
            this.NewRouteSet = new Route[source.NewRouteSet.length];
            for (int i = 0; i < source.NewRouteSet.length; i++) {
                this.NewRouteSet[i] = new Route(source.NewRouteSet[i]);
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
        this.setParamArrayObj(map, prefix + "OldRouteSet.", this.OldRouteSet);
        this.setParamArrayObj(map, prefix + "NewRouteSet.", this.NewRouteSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

