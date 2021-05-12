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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsagePlanRequest extends AbstractModel{

    /**
    * 待查询的使用计划唯一 ID。
    */
    @SerializedName("UsagePlanId")
    @Expose
    private String UsagePlanId;

    /**
     * Get 待查询的使用计划唯一 ID。 
     * @return UsagePlanId 待查询的使用计划唯一 ID。
     */
    public String getUsagePlanId() {
        return this.UsagePlanId;
    }

    /**
     * Set 待查询的使用计划唯一 ID。
     * @param UsagePlanId 待查询的使用计划唯一 ID。
     */
    public void setUsagePlanId(String UsagePlanId) {
        this.UsagePlanId = UsagePlanId;
    }

    public DescribeUsagePlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsagePlanRequest(DescribeUsagePlanRequest source) {
        if (source.UsagePlanId != null) {
            this.UsagePlanId = new String(source.UsagePlanId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsagePlanId", this.UsagePlanId);

    }
}

