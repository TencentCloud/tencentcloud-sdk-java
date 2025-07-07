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

public class DescribeVpcLimitsRequest extends AbstractModel {

    /**
    * 配额名称。每次最大查询100个配额类型。
    */
    @SerializedName("LimitTypes")
    @Expose
    private String [] LimitTypes;

    /**
     * Get 配额名称。每次最大查询100个配额类型。 
     * @return LimitTypes 配额名称。每次最大查询100个配额类型。
     */
    public String [] getLimitTypes() {
        return this.LimitTypes;
    }

    /**
     * Set 配额名称。每次最大查询100个配额类型。
     * @param LimitTypes 配额名称。每次最大查询100个配额类型。
     */
    public void setLimitTypes(String [] LimitTypes) {
        this.LimitTypes = LimitTypes;
    }

    public DescribeVpcLimitsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcLimitsRequest(DescribeVpcLimitsRequest source) {
        if (source.LimitTypes != null) {
            this.LimitTypes = new String[source.LimitTypes.length];
            for (int i = 0; i < source.LimitTypes.length; i++) {
                this.LimitTypes[i] = new String(source.LimitTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LimitTypes.", this.LimitTypes);

    }
}

