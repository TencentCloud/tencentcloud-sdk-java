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

public class DeleteRoutePolicyAssociationsRequest extends AbstractModel {

    /**
    * 路由策略绑定对象列表，删除路由策略绑定时，仅需使用RoutePolicyAssociation的RouteTableId字段和RoutePolicyId字段（不需要填写Priority字段）。
    */
    @SerializedName("RoutePolicyAssociationSet")
    @Expose
    private RoutePolicyAssociation [] RoutePolicyAssociationSet;

    /**
     * Get 路由策略绑定对象列表，删除路由策略绑定时，仅需使用RoutePolicyAssociation的RouteTableId字段和RoutePolicyId字段（不需要填写Priority字段）。 
     * @return RoutePolicyAssociationSet 路由策略绑定对象列表，删除路由策略绑定时，仅需使用RoutePolicyAssociation的RouteTableId字段和RoutePolicyId字段（不需要填写Priority字段）。
     */
    public RoutePolicyAssociation [] getRoutePolicyAssociationSet() {
        return this.RoutePolicyAssociationSet;
    }

    /**
     * Set 路由策略绑定对象列表，删除路由策略绑定时，仅需使用RoutePolicyAssociation的RouteTableId字段和RoutePolicyId字段（不需要填写Priority字段）。
     * @param RoutePolicyAssociationSet 路由策略绑定对象列表，删除路由策略绑定时，仅需使用RoutePolicyAssociation的RouteTableId字段和RoutePolicyId字段（不需要填写Priority字段）。
     */
    public void setRoutePolicyAssociationSet(RoutePolicyAssociation [] RoutePolicyAssociationSet) {
        this.RoutePolicyAssociationSet = RoutePolicyAssociationSet;
    }

    public DeleteRoutePolicyAssociationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRoutePolicyAssociationsRequest(DeleteRoutePolicyAssociationsRequest source) {
        if (source.RoutePolicyAssociationSet != null) {
            this.RoutePolicyAssociationSet = new RoutePolicyAssociation[source.RoutePolicyAssociationSet.length];
            for (int i = 0; i < source.RoutePolicyAssociationSet.length; i++) {
                this.RoutePolicyAssociationSet[i] = new RoutePolicyAssociation(source.RoutePolicyAssociationSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RoutePolicyAssociationSet.", this.RoutePolicyAssociationSet);

    }
}

