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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageRegistryNamespaceListResponse extends AbstractModel {

    /**
    * 可返回的命令空间的总量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 返回的命令空间列表
    */
    @SerializedName("NamespaceList")
    @Expose
    private String [] NamespaceList;

    /**
    * 返回的命令空间详细信息列表
    */
    @SerializedName("NamespaceDetail")
    @Expose
    private NamespaceInfo [] NamespaceDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 可返回的命令空间的总量。 
     * @return TotalCount 可返回的命令空间的总量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 可返回的命令空间的总量。
     * @param TotalCount 可返回的命令空间的总量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 返回的命令空间列表 
     * @return NamespaceList 返回的命令空间列表
     */
    public String [] getNamespaceList() {
        return this.NamespaceList;
    }

    /**
     * Set 返回的命令空间列表
     * @param NamespaceList 返回的命令空间列表
     */
    public void setNamespaceList(String [] NamespaceList) {
        this.NamespaceList = NamespaceList;
    }

    /**
     * Get 返回的命令空间详细信息列表 
     * @return NamespaceDetail 返回的命令空间详细信息列表
     */
    public NamespaceInfo [] getNamespaceDetail() {
        return this.NamespaceDetail;
    }

    /**
     * Set 返回的命令空间详细信息列表
     * @param NamespaceDetail 返回的命令空间详细信息列表
     */
    public void setNamespaceDetail(NamespaceInfo [] NamespaceDetail) {
        this.NamespaceDetail = NamespaceDetail;
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

    public DescribeImageRegistryNamespaceListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageRegistryNamespaceListResponse(DescribeImageRegistryNamespaceListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.NamespaceList != null) {
            this.NamespaceList = new String[source.NamespaceList.length];
            for (int i = 0; i < source.NamespaceList.length; i++) {
                this.NamespaceList[i] = new String(source.NamespaceList[i]);
            }
        }
        if (source.NamespaceDetail != null) {
            this.NamespaceDetail = new NamespaceInfo[source.NamespaceDetail.length];
            for (int i = 0; i < source.NamespaceDetail.length; i++) {
                this.NamespaceDetail[i] = new NamespaceInfo(source.NamespaceDetail[i]);
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
        this.setParamArraySimple(map, prefix + "NamespaceList.", this.NamespaceList);
        this.setParamArrayObj(map, prefix + "NamespaceDetail.", this.NamespaceDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

