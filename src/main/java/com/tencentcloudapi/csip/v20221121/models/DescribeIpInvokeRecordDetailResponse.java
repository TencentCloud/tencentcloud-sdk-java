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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpInvokeRecordDetailResponse extends AbstractModel {

    /**
    * 调用详情信息
    */
    @SerializedName("InvokeDetailInfo")
    @Expose
    private CosInvokeDetailInfo [] InvokeDetailInfo;

    /**
    * 调用权限相关
    */
    @SerializedName("InvokePermission")
    @Expose
    private CosPermissionInfo [] InvokePermission;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 调用详情信息 
     * @return InvokeDetailInfo 调用详情信息
     */
    public CosInvokeDetailInfo [] getInvokeDetailInfo() {
        return this.InvokeDetailInfo;
    }

    /**
     * Set 调用详情信息
     * @param InvokeDetailInfo 调用详情信息
     */
    public void setInvokeDetailInfo(CosInvokeDetailInfo [] InvokeDetailInfo) {
        this.InvokeDetailInfo = InvokeDetailInfo;
    }

    /**
     * Get 调用权限相关 
     * @return InvokePermission 调用权限相关
     */
    public CosPermissionInfo [] getInvokePermission() {
        return this.InvokePermission;
    }

    /**
     * Set 调用权限相关
     * @param InvokePermission 调用权限相关
     */
    public void setInvokePermission(CosPermissionInfo [] InvokePermission) {
        this.InvokePermission = InvokePermission;
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

    public DescribeIpInvokeRecordDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIpInvokeRecordDetailResponse(DescribeIpInvokeRecordDetailResponse source) {
        if (source.InvokeDetailInfo != null) {
            this.InvokeDetailInfo = new CosInvokeDetailInfo[source.InvokeDetailInfo.length];
            for (int i = 0; i < source.InvokeDetailInfo.length; i++) {
                this.InvokeDetailInfo[i] = new CosInvokeDetailInfo(source.InvokeDetailInfo[i]);
            }
        }
        if (source.InvokePermission != null) {
            this.InvokePermission = new CosPermissionInfo[source.InvokePermission.length];
            for (int i = 0; i < source.InvokePermission.length; i++) {
                this.InvokePermission[i] = new CosPermissionInfo(source.InvokePermission[i]);
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
        this.setParamArrayObj(map, prefix + "InvokeDetailInfo.", this.InvokeDetailInfo);
        this.setParamArrayObj(map, prefix + "InvokePermission.", this.InvokePermission);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

