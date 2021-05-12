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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFleetUtilizationRequest extends AbstractModel{

    /**
    * 服务器舰队 Ids
    */
    @SerializedName("FleetIds")
    @Expose
    private String [] FleetIds;

    /**
     * Get 服务器舰队 Ids 
     * @return FleetIds 服务器舰队 Ids
     */
    public String [] getFleetIds() {
        return this.FleetIds;
    }

    /**
     * Set 服务器舰队 Ids
     * @param FleetIds 服务器舰队 Ids
     */
    public void setFleetIds(String [] FleetIds) {
        this.FleetIds = FleetIds;
    }

    public DescribeFleetUtilizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFleetUtilizationRequest(DescribeFleetUtilizationRequest source) {
        if (source.FleetIds != null) {
            this.FleetIds = new String[source.FleetIds.length];
            for (int i = 0; i < source.FleetIds.length; i++) {
                this.FleetIds[i] = new String(source.FleetIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FleetIds.", this.FleetIds);

    }
}

