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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReleaseOrderResponse extends AbstractModel {

    /**
    * 是否存在
    */
    @SerializedName("IsExist")
    @Expose
    private Boolean IsExist;

    /**
    * 发布单信息
    */
    @SerializedName("ReleaseOrderInfo")
    @Expose
    private ReleaseOrderInfo ReleaseOrderInfo;

    /**
    * 上一次成功发布时间
    */
    @SerializedName("LastReleasedSuccessTime")
    @Expose
    private String LastReleasedSuccessTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否存在 
     * @return IsExist 是否存在
     */
    public Boolean getIsExist() {
        return this.IsExist;
    }

    /**
     * Set 是否存在
     * @param IsExist 是否存在
     */
    public void setIsExist(Boolean IsExist) {
        this.IsExist = IsExist;
    }

    /**
     * Get 发布单信息 
     * @return ReleaseOrderInfo 发布单信息
     */
    public ReleaseOrderInfo getReleaseOrderInfo() {
        return this.ReleaseOrderInfo;
    }

    /**
     * Set 发布单信息
     * @param ReleaseOrderInfo 发布单信息
     */
    public void setReleaseOrderInfo(ReleaseOrderInfo ReleaseOrderInfo) {
        this.ReleaseOrderInfo = ReleaseOrderInfo;
    }

    /**
     * Get 上一次成功发布时间 
     * @return LastReleasedSuccessTime 上一次成功发布时间
     */
    public String getLastReleasedSuccessTime() {
        return this.LastReleasedSuccessTime;
    }

    /**
     * Set 上一次成功发布时间
     * @param LastReleasedSuccessTime 上一次成功发布时间
     */
    public void setLastReleasedSuccessTime(String LastReleasedSuccessTime) {
        this.LastReleasedSuccessTime = LastReleasedSuccessTime;
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

    public DescribeReleaseOrderResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReleaseOrderResponse(DescribeReleaseOrderResponse source) {
        if (source.IsExist != null) {
            this.IsExist = new Boolean(source.IsExist);
        }
        if (source.ReleaseOrderInfo != null) {
            this.ReleaseOrderInfo = new ReleaseOrderInfo(source.ReleaseOrderInfo);
        }
        if (source.LastReleasedSuccessTime != null) {
            this.LastReleasedSuccessTime = new String(source.LastReleasedSuccessTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsExist", this.IsExist);
        this.setParamObj(map, prefix + "ReleaseOrderInfo.", this.ReleaseOrderInfo);
        this.setParamSimple(map, prefix + "LastReleasedSuccessTime", this.LastReleasedSuccessTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

