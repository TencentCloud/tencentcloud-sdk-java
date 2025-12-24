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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessGroupsResponse extends AbstractModel {

    /**
    * 权限组列表
    */
    @SerializedName("AccessGroups")
    @Expose
    private AccessGroup [] AccessGroups;

    /**
    * 标识是否已获取全量
    */
    @SerializedName("IsOver")
    @Expose
    private Boolean IsOver;

    /**
    * 下一次请求起始权限组ID标记
    */
    @SerializedName("NextAccessGroupIdMarker")
    @Expose
    private String NextAccessGroupIdMarker;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 权限组列表 
     * @return AccessGroups 权限组列表
     */
    public AccessGroup [] getAccessGroups() {
        return this.AccessGroups;
    }

    /**
     * Set 权限组列表
     * @param AccessGroups 权限组列表
     */
    public void setAccessGroups(AccessGroup [] AccessGroups) {
        this.AccessGroups = AccessGroups;
    }

    /**
     * Get 标识是否已获取全量 
     * @return IsOver 标识是否已获取全量
     */
    public Boolean getIsOver() {
        return this.IsOver;
    }

    /**
     * Set 标识是否已获取全量
     * @param IsOver 标识是否已获取全量
     */
    public void setIsOver(Boolean IsOver) {
        this.IsOver = IsOver;
    }

    /**
     * Get 下一次请求起始权限组ID标记 
     * @return NextAccessGroupIdMarker 下一次请求起始权限组ID标记
     */
    public String getNextAccessGroupIdMarker() {
        return this.NextAccessGroupIdMarker;
    }

    /**
     * Set 下一次请求起始权限组ID标记
     * @param NextAccessGroupIdMarker 下一次请求起始权限组ID标记
     */
    public void setNextAccessGroupIdMarker(String NextAccessGroupIdMarker) {
        this.NextAccessGroupIdMarker = NextAccessGroupIdMarker;
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

    public DescribeAccessGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessGroupsResponse(DescribeAccessGroupsResponse source) {
        if (source.AccessGroups != null) {
            this.AccessGroups = new AccessGroup[source.AccessGroups.length];
            for (int i = 0; i < source.AccessGroups.length; i++) {
                this.AccessGroups[i] = new AccessGroup(source.AccessGroups[i]);
            }
        }
        if (source.IsOver != null) {
            this.IsOver = new Boolean(source.IsOver);
        }
        if (source.NextAccessGroupIdMarker != null) {
            this.NextAccessGroupIdMarker = new String(source.NextAccessGroupIdMarker);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AccessGroups.", this.AccessGroups);
        this.setParamSimple(map, prefix + "IsOver", this.IsOver);
        this.setParamSimple(map, prefix + "NextAccessGroupIdMarker", this.NextAccessGroupIdMarker);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

