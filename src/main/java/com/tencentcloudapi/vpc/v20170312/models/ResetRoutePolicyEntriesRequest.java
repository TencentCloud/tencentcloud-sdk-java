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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetRoutePolicyEntriesRequest extends AbstractModel {

    /**
    * 路由接收策略实例ID，例如：rrp-azd4dt1c。
    */
    @SerializedName("RoutePolicyId")
    @Expose
    private String RoutePolicyId;

    /**
    * 路由接收策略条目列表。需要指定路由策略条目ID（RoutePolicyEntryId）。
    */
    @SerializedName("RoutePolicyEntrySet")
    @Expose
    private RoutePolicyEntry [] RoutePolicyEntrySet;

    /**
    * 路由接收策略描述。
    */
    @SerializedName("RoutePolicyDescription")
    @Expose
    private String RoutePolicyDescription;

    /**
    * 路由接收策略名字。
    */
    @SerializedName("RoutePolicyName")
    @Expose
    private String RoutePolicyName;

    /**
     * Get 路由接收策略实例ID，例如：rrp-azd4dt1c。 
     * @return RoutePolicyId 路由接收策略实例ID，例如：rrp-azd4dt1c。
     */
    public String getRoutePolicyId() {
        return this.RoutePolicyId;
    }

    /**
     * Set 路由接收策略实例ID，例如：rrp-azd4dt1c。
     * @param RoutePolicyId 路由接收策略实例ID，例如：rrp-azd4dt1c。
     */
    public void setRoutePolicyId(String RoutePolicyId) {
        this.RoutePolicyId = RoutePolicyId;
    }

    /**
     * Get 路由接收策略条目列表。需要指定路由策略条目ID（RoutePolicyEntryId）。 
     * @return RoutePolicyEntrySet 路由接收策略条目列表。需要指定路由策略条目ID（RoutePolicyEntryId）。
     */
    public RoutePolicyEntry [] getRoutePolicyEntrySet() {
        return this.RoutePolicyEntrySet;
    }

    /**
     * Set 路由接收策略条目列表。需要指定路由策略条目ID（RoutePolicyEntryId）。
     * @param RoutePolicyEntrySet 路由接收策略条目列表。需要指定路由策略条目ID（RoutePolicyEntryId）。
     */
    public void setRoutePolicyEntrySet(RoutePolicyEntry [] RoutePolicyEntrySet) {
        this.RoutePolicyEntrySet = RoutePolicyEntrySet;
    }

    /**
     * Get 路由接收策略描述。 
     * @return RoutePolicyDescription 路由接收策略描述。
     */
    public String getRoutePolicyDescription() {
        return this.RoutePolicyDescription;
    }

    /**
     * Set 路由接收策略描述。
     * @param RoutePolicyDescription 路由接收策略描述。
     */
    public void setRoutePolicyDescription(String RoutePolicyDescription) {
        this.RoutePolicyDescription = RoutePolicyDescription;
    }

    /**
     * Get 路由接收策略名字。 
     * @return RoutePolicyName 路由接收策略名字。
     */
    public String getRoutePolicyName() {
        return this.RoutePolicyName;
    }

    /**
     * Set 路由接收策略名字。
     * @param RoutePolicyName 路由接收策略名字。
     */
    public void setRoutePolicyName(String RoutePolicyName) {
        this.RoutePolicyName = RoutePolicyName;
    }

    public ResetRoutePolicyEntriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetRoutePolicyEntriesRequest(ResetRoutePolicyEntriesRequest source) {
        if (source.RoutePolicyId != null) {
            this.RoutePolicyId = new String(source.RoutePolicyId);
        }
        if (source.RoutePolicyEntrySet != null) {
            this.RoutePolicyEntrySet = new RoutePolicyEntry[source.RoutePolicyEntrySet.length];
            for (int i = 0; i < source.RoutePolicyEntrySet.length; i++) {
                this.RoutePolicyEntrySet[i] = new RoutePolicyEntry(source.RoutePolicyEntrySet[i]);
            }
        }
        if (source.RoutePolicyDescription != null) {
            this.RoutePolicyDescription = new String(source.RoutePolicyDescription);
        }
        if (source.RoutePolicyName != null) {
            this.RoutePolicyName = new String(source.RoutePolicyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoutePolicyId", this.RoutePolicyId);
        this.setParamArrayObj(map, prefix + "RoutePolicyEntrySet.", this.RoutePolicyEntrySet);
        this.setParamSimple(map, prefix + "RoutePolicyDescription", this.RoutePolicyDescription);
        this.setParamSimple(map, prefix + "RoutePolicyName", this.RoutePolicyName);

    }
}

