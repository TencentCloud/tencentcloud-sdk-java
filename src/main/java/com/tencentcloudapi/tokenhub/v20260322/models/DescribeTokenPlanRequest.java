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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTokenPlanRequest extends AbstractModel {

    /**
    * 套餐 ID。可通过 DescribeTokenPlanList 接口获取。
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
     * Get 套餐 ID。可通过 DescribeTokenPlanList 接口获取。 
     * @return TeamId 套餐 ID。可通过 DescribeTokenPlanList 接口获取。
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set 套餐 ID。可通过 DescribeTokenPlanList 接口获取。
     * @param TeamId 套餐 ID。可通过 DescribeTokenPlanList 接口获取。
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    public DescribeTokenPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTokenPlanRequest(DescribeTokenPlanRequest source) {
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);

    }
}

