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

public class DeleteRoutePolicyEntriesRequest extends AbstractModel {

    /**
    * 路由接收策略实例ID。
    */
    @SerializedName("RoutePolicyId")
    @Expose
    private String RoutePolicyId;

    /**
    * 路由接收策略条目列表，删除路由策略规则时，仅需使用RoutePolicyEntry的RoutePolicyEntryIdId字段。
    */
    @SerializedName("RoutePolicyEntrySet")
    @Expose
    private RoutePolicyEntry [] RoutePolicyEntrySet;

    /**
     * Get 路由接收策略实例ID。 
     * @return RoutePolicyId 路由接收策略实例ID。
     */
    public String getRoutePolicyId() {
        return this.RoutePolicyId;
    }

    /**
     * Set 路由接收策略实例ID。
     * @param RoutePolicyId 路由接收策略实例ID。
     */
    public void setRoutePolicyId(String RoutePolicyId) {
        this.RoutePolicyId = RoutePolicyId;
    }

    /**
     * Get 路由接收策略条目列表，删除路由策略规则时，仅需使用RoutePolicyEntry的RoutePolicyEntryIdId字段。 
     * @return RoutePolicyEntrySet 路由接收策略条目列表，删除路由策略规则时，仅需使用RoutePolicyEntry的RoutePolicyEntryIdId字段。
     */
    public RoutePolicyEntry [] getRoutePolicyEntrySet() {
        return this.RoutePolicyEntrySet;
    }

    /**
     * Set 路由接收策略条目列表，删除路由策略规则时，仅需使用RoutePolicyEntry的RoutePolicyEntryIdId字段。
     * @param RoutePolicyEntrySet 路由接收策略条目列表，删除路由策略规则时，仅需使用RoutePolicyEntry的RoutePolicyEntryIdId字段。
     */
    public void setRoutePolicyEntrySet(RoutePolicyEntry [] RoutePolicyEntrySet) {
        this.RoutePolicyEntrySet = RoutePolicyEntrySet;
    }

    public DeleteRoutePolicyEntriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRoutePolicyEntriesRequest(DeleteRoutePolicyEntriesRequest source) {
        if (source.RoutePolicyId != null) {
            this.RoutePolicyId = new String(source.RoutePolicyId);
        }
        if (source.RoutePolicyEntrySet != null) {
            this.RoutePolicyEntrySet = new RoutePolicyEntry[source.RoutePolicyEntrySet.length];
            for (int i = 0; i < source.RoutePolicyEntrySet.length; i++) {
                this.RoutePolicyEntrySet[i] = new RoutePolicyEntry(source.RoutePolicyEntrySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoutePolicyId", this.RoutePolicyId);
        this.setParamArrayObj(map, prefix + "RoutePolicyEntrySet.", this.RoutePolicyEntrySet);

    }
}

