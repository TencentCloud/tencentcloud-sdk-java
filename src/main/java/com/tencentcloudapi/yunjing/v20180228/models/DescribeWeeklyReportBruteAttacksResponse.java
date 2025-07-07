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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWeeklyReportBruteAttacksResponse extends AbstractModel {

    /**
    * 专业周报密码破解数组。
    */
    @SerializedName("WeeklyReportBruteAttacks")
    @Expose
    private WeeklyReportBruteAttack [] WeeklyReportBruteAttacks;

    /**
    * 记录总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 专业周报密码破解数组。 
     * @return WeeklyReportBruteAttacks 专业周报密码破解数组。
     */
    public WeeklyReportBruteAttack [] getWeeklyReportBruteAttacks() {
        return this.WeeklyReportBruteAttacks;
    }

    /**
     * Set 专业周报密码破解数组。
     * @param WeeklyReportBruteAttacks 专业周报密码破解数组。
     */
    public void setWeeklyReportBruteAttacks(WeeklyReportBruteAttack [] WeeklyReportBruteAttacks) {
        this.WeeklyReportBruteAttacks = WeeklyReportBruteAttacks;
    }

    /**
     * Get 记录总数。 
     * @return TotalCount 记录总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 记录总数。
     * @param TotalCount 记录总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeWeeklyReportBruteAttacksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWeeklyReportBruteAttacksResponse(DescribeWeeklyReportBruteAttacksResponse source) {
        if (source.WeeklyReportBruteAttacks != null) {
            this.WeeklyReportBruteAttacks = new WeeklyReportBruteAttack[source.WeeklyReportBruteAttacks.length];
            for (int i = 0; i < source.WeeklyReportBruteAttacks.length; i++) {
                this.WeeklyReportBruteAttacks[i] = new WeeklyReportBruteAttack(source.WeeklyReportBruteAttacks[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "WeeklyReportBruteAttacks.", this.WeeklyReportBruteAttacks);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

