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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProVersionInfoResponse extends AbstractModel {

    /**
    * 昨日【专业版-按量付费】扣费明细,(实际已账单为准)
    */
    @SerializedName("PostPayCost")
    @Expose
    private Long PostPayCost;

    /**
    * 新增主机是否自动开通专业版
    */
    @SerializedName("IsAutoOpenProVersion")
    @Expose
    private Boolean IsAutoOpenProVersion;

    /**
    * 专业版主机数
    */
    @SerializedName("ProVersionNum")
    @Expose
    private Long ProVersionNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 昨日【专业版-按量付费】扣费明细,(实际已账单为准) 
     * @return PostPayCost 昨日【专业版-按量付费】扣费明细,(实际已账单为准)
     */
    public Long getPostPayCost() {
        return this.PostPayCost;
    }

    /**
     * Set 昨日【专业版-按量付费】扣费明细,(实际已账单为准)
     * @param PostPayCost 昨日【专业版-按量付费】扣费明细,(实际已账单为准)
     */
    public void setPostPayCost(Long PostPayCost) {
        this.PostPayCost = PostPayCost;
    }

    /**
     * Get 新增主机是否自动开通专业版 
     * @return IsAutoOpenProVersion 新增主机是否自动开通专业版
     */
    public Boolean getIsAutoOpenProVersion() {
        return this.IsAutoOpenProVersion;
    }

    /**
     * Set 新增主机是否自动开通专业版
     * @param IsAutoOpenProVersion 新增主机是否自动开通专业版
     */
    public void setIsAutoOpenProVersion(Boolean IsAutoOpenProVersion) {
        this.IsAutoOpenProVersion = IsAutoOpenProVersion;
    }

    /**
     * Get 专业版主机数 
     * @return ProVersionNum 专业版主机数
     */
    public Long getProVersionNum() {
        return this.ProVersionNum;
    }

    /**
     * Set 专业版主机数
     * @param ProVersionNum 专业版主机数
     */
    public void setProVersionNum(Long ProVersionNum) {
        this.ProVersionNum = ProVersionNum;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeProVersionInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProVersionInfoResponse(DescribeProVersionInfoResponse source) {
        if (source.PostPayCost != null) {
            this.PostPayCost = new Long(source.PostPayCost);
        }
        if (source.IsAutoOpenProVersion != null) {
            this.IsAutoOpenProVersion = new Boolean(source.IsAutoOpenProVersion);
        }
        if (source.ProVersionNum != null) {
            this.ProVersionNum = new Long(source.ProVersionNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PostPayCost", this.PostPayCost);
        this.setParamSimple(map, prefix + "IsAutoOpenProVersion", this.IsAutoOpenProVersion);
        this.setParamSimple(map, prefix + "ProVersionNum", this.ProVersionNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

