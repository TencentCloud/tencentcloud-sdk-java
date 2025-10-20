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

public class ResetRoutePolicyAssociationsRequest extends AbstractModel {

    /**
    * 路由表实例ID，例如：rtb-azd4dt1c。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 路由策略绑定对象（RoutePolicyAssociation）列表。注意：路由策略绑定中的路由表实例ID（RouteTableId）需要和该接口的RouteTableId参数保持一致（也就是该接口只支持修改同一个路由表实例下的路有策略绑定关系及优先级）。
    */
    @SerializedName("RoutePolicyAssociationSet")
    @Expose
    private RoutePolicyAssociation [] RoutePolicyAssociationSet;

    /**
     * Get 路由表实例ID，例如：rtb-azd4dt1c。 
     * @return RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set 路由表实例ID，例如：rtb-azd4dt1c。
     * @param RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get 路由策略绑定对象（RoutePolicyAssociation）列表。注意：路由策略绑定中的路由表实例ID（RouteTableId）需要和该接口的RouteTableId参数保持一致（也就是该接口只支持修改同一个路由表实例下的路有策略绑定关系及优先级）。 
     * @return RoutePolicyAssociationSet 路由策略绑定对象（RoutePolicyAssociation）列表。注意：路由策略绑定中的路由表实例ID（RouteTableId）需要和该接口的RouteTableId参数保持一致（也就是该接口只支持修改同一个路由表实例下的路有策略绑定关系及优先级）。
     */
    public RoutePolicyAssociation [] getRoutePolicyAssociationSet() {
        return this.RoutePolicyAssociationSet;
    }

    /**
     * Set 路由策略绑定对象（RoutePolicyAssociation）列表。注意：路由策略绑定中的路由表实例ID（RouteTableId）需要和该接口的RouteTableId参数保持一致（也就是该接口只支持修改同一个路由表实例下的路有策略绑定关系及优先级）。
     * @param RoutePolicyAssociationSet 路由策略绑定对象（RoutePolicyAssociation）列表。注意：路由策略绑定中的路由表实例ID（RouteTableId）需要和该接口的RouteTableId参数保持一致（也就是该接口只支持修改同一个路由表实例下的路有策略绑定关系及优先级）。
     */
    public void setRoutePolicyAssociationSet(RoutePolicyAssociation [] RoutePolicyAssociationSet) {
        this.RoutePolicyAssociationSet = RoutePolicyAssociationSet;
    }

    public ResetRoutePolicyAssociationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetRoutePolicyAssociationsRequest(ResetRoutePolicyAssociationsRequest source) {
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
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
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamArrayObj(map, prefix + "RoutePolicyAssociationSet.", this.RoutePolicyAssociationSet);

    }
}

