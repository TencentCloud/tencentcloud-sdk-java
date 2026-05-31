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

public class RenewTokenPlanTeamOrderRequest extends AbstractModel {

    /**
    * 套餐 ID。可通过 DescribeTokenPlanList 接口获取。
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * 续费时长。单位：月。必须大于 0。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

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

    /**
     * Get 续费时长。单位：月。必须大于 0。 
     * @return TimeSpan 续费时长。单位：月。必须大于 0。
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 续费时长。单位：月。必须大于 0。
     * @param TimeSpan 续费时长。单位：月。必须大于 0。
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    public RenewTokenPlanTeamOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewTokenPlanTeamOrderRequest(RenewTokenPlanTeamOrderRequest source) {
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);

    }
}

