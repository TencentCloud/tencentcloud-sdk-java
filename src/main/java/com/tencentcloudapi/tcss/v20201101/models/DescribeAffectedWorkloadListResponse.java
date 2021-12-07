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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAffectedWorkloadListResponse extends AbstractModel{

    /**
    * 受影响的workload列表数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 受影响的workload列表
    */
    @SerializedName("AffectedWorkloadList")
    @Expose
    private AffectedWorkloadItem [] AffectedWorkloadList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 受影响的workload列表数量 
     * @return TotalCount 受影响的workload列表数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 受影响的workload列表数量
     * @param TotalCount 受影响的workload列表数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 受影响的workload列表 
     * @return AffectedWorkloadList 受影响的workload列表
     */
    public AffectedWorkloadItem [] getAffectedWorkloadList() {
        return this.AffectedWorkloadList;
    }

    /**
     * Set 受影响的workload列表
     * @param AffectedWorkloadList 受影响的workload列表
     */
    public void setAffectedWorkloadList(AffectedWorkloadItem [] AffectedWorkloadList) {
        this.AffectedWorkloadList = AffectedWorkloadList;
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

    public DescribeAffectedWorkloadListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAffectedWorkloadListResponse(DescribeAffectedWorkloadListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AffectedWorkloadList != null) {
            this.AffectedWorkloadList = new AffectedWorkloadItem[source.AffectedWorkloadList.length];
            for (int i = 0; i < source.AffectedWorkloadList.length; i++) {
                this.AffectedWorkloadList[i] = new AffectedWorkloadItem(source.AffectedWorkloadList[i]);
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
        this.setParamArrayObj(map, prefix + "AffectedWorkloadList.", this.AffectedWorkloadList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

