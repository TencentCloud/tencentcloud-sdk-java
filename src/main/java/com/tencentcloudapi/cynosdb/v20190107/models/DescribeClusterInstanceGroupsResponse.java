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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterInstanceGroupsResponse extends AbstractModel {

    /**
    * 实例组个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 实例组列表
    */
    @SerializedName("InstanceGroupInfoList")
    @Expose
    private CynosdbInstanceGroup [] InstanceGroupInfoList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例组个数 
     * @return TotalCount 实例组个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 实例组个数
     * @param TotalCount 实例组个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 实例组列表 
     * @return InstanceGroupInfoList 实例组列表
     */
    public CynosdbInstanceGroup [] getInstanceGroupInfoList() {
        return this.InstanceGroupInfoList;
    }

    /**
     * Set 实例组列表
     * @param InstanceGroupInfoList 实例组列表
     */
    public void setInstanceGroupInfoList(CynosdbInstanceGroup [] InstanceGroupInfoList) {
        this.InstanceGroupInfoList = InstanceGroupInfoList;
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

    public DescribeClusterInstanceGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterInstanceGroupsResponse(DescribeClusterInstanceGroupsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InstanceGroupInfoList != null) {
            this.InstanceGroupInfoList = new CynosdbInstanceGroup[source.InstanceGroupInfoList.length];
            for (int i = 0; i < source.InstanceGroupInfoList.length; i++) {
                this.InstanceGroupInfoList[i] = new CynosdbInstanceGroup(source.InstanceGroupInfoList[i]);
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
        this.setParamArrayObj(map, prefix + "InstanceGroupInfoList.", this.InstanceGroupInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

