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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatFwClusterRegionStatusRequest extends AbstractModel {

    /**
    * <p>NAT集群防火墙地域状态查询列表</p>
    */
    @SerializedName("NatClusterRegionStatusQueryList")
    @Expose
    private NatClusterRegionStatusQuery [] NatClusterRegionStatusQueryList;

    /**
     * Get <p>NAT集群防火墙地域状态查询列表</p> 
     * @return NatClusterRegionStatusQueryList <p>NAT集群防火墙地域状态查询列表</p>
     */
    public NatClusterRegionStatusQuery [] getNatClusterRegionStatusQueryList() {
        return this.NatClusterRegionStatusQueryList;
    }

    /**
     * Set <p>NAT集群防火墙地域状态查询列表</p>
     * @param NatClusterRegionStatusQueryList <p>NAT集群防火墙地域状态查询列表</p>
     */
    public void setNatClusterRegionStatusQueryList(NatClusterRegionStatusQuery [] NatClusterRegionStatusQueryList) {
        this.NatClusterRegionStatusQueryList = NatClusterRegionStatusQueryList;
    }

    public DescribeNatFwClusterRegionStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatFwClusterRegionStatusRequest(DescribeNatFwClusterRegionStatusRequest source) {
        if (source.NatClusterRegionStatusQueryList != null) {
            this.NatClusterRegionStatusQueryList = new NatClusterRegionStatusQuery[source.NatClusterRegionStatusQueryList.length];
            for (int i = 0; i < source.NatClusterRegionStatusQueryList.length; i++) {
                this.NatClusterRegionStatusQueryList[i] = new NatClusterRegionStatusQuery(source.NatClusterRegionStatusQueryList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NatClusterRegionStatusQueryList.", this.NatClusterRegionStatusQueryList);

    }
}

