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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationSealsResponse extends AbstractModel{

    /**
    * 在设置了SealId时返回0或1，没有设置时返回公司的总印章数量，可能比返回的印章数组数量多
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 查询到的印章结果数组
    */
    @SerializedName("Seals")
    @Expose
    private OccupiedSeal [] Seals;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 在设置了SealId时返回0或1，没有设置时返回公司的总印章数量，可能比返回的印章数组数量多 
     * @return TotalCount 在设置了SealId时返回0或1，没有设置时返回公司的总印章数量，可能比返回的印章数组数量多
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 在设置了SealId时返回0或1，没有设置时返回公司的总印章数量，可能比返回的印章数组数量多
     * @param TotalCount 在设置了SealId时返回0或1，没有设置时返回公司的总印章数量，可能比返回的印章数组数量多
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 查询到的印章结果数组 
     * @return Seals 查询到的印章结果数组
     */
    public OccupiedSeal [] getSeals() {
        return this.Seals;
    }

    /**
     * Set 查询到的印章结果数组
     * @param Seals 查询到的印章结果数组
     */
    public void setSeals(OccupiedSeal [] Seals) {
        this.Seals = Seals;
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

    public DescribeOrganizationSealsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationSealsResponse(DescribeOrganizationSealsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Seals != null) {
            this.Seals = new OccupiedSeal[source.Seals.length];
            for (int i = 0; i < source.Seals.length; i++) {
                this.Seals[i] = new OccupiedSeal(source.Seals[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Seals.", this.Seals);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

