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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDisasterRecoverySitePairsDeniedActionsRequest extends AbstractModel {

    /**
    * 要查询的容灾策略ID列表，单个ID格式为 sitepair-xxxxxxxx
    */
    @SerializedName("SitePairIds")
    @Expose
    private String [] SitePairIds;

    /**
     * Get 要查询的容灾策略ID列表，单个ID格式为 sitepair-xxxxxxxx 
     * @return SitePairIds 要查询的容灾策略ID列表，单个ID格式为 sitepair-xxxxxxxx
     */
    public String [] getSitePairIds() {
        return this.SitePairIds;
    }

    /**
     * Set 要查询的容灾策略ID列表，单个ID格式为 sitepair-xxxxxxxx
     * @param SitePairIds 要查询的容灾策略ID列表，单个ID格式为 sitepair-xxxxxxxx
     */
    public void setSitePairIds(String [] SitePairIds) {
        this.SitePairIds = SitePairIds;
    }

    public DescribeDisasterRecoverySitePairsDeniedActionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDisasterRecoverySitePairsDeniedActionsRequest(DescribeDisasterRecoverySitePairsDeniedActionsRequest source) {
        if (source.SitePairIds != null) {
            this.SitePairIds = new String[source.SitePairIds.length];
            for (int i = 0; i < source.SitePairIds.length; i++) {
                this.SitePairIds[i] = new String(source.SitePairIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SitePairIds.", this.SitePairIds);

    }
}

