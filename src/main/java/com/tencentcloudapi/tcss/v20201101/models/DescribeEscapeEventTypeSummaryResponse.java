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

public class DescribeEscapeEventTypeSummaryResponse extends AbstractModel{

    /**
    * 容器逃逸事件数
    */
    @SerializedName("ContainerEscapeEventCount")
    @Expose
    private Long ContainerEscapeEventCount;

    /**
    * 程序提权事件数
    */
    @SerializedName("ProcessPrivilegeEventCount")
    @Expose
    private Long ProcessPrivilegeEventCount;

    /**
    * 风险容器事件数
    */
    @SerializedName("RiskContainerEventCount")
    @Expose
    private Long RiskContainerEventCount;

    /**
    * 逃逸事件待处理数
    */
    @SerializedName("PendingEscapeEventCount")
    @Expose
    private Long PendingEscapeEventCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 容器逃逸事件数 
     * @return ContainerEscapeEventCount 容器逃逸事件数
     */
    public Long getContainerEscapeEventCount() {
        return this.ContainerEscapeEventCount;
    }

    /**
     * Set 容器逃逸事件数
     * @param ContainerEscapeEventCount 容器逃逸事件数
     */
    public void setContainerEscapeEventCount(Long ContainerEscapeEventCount) {
        this.ContainerEscapeEventCount = ContainerEscapeEventCount;
    }

    /**
     * Get 程序提权事件数 
     * @return ProcessPrivilegeEventCount 程序提权事件数
     */
    public Long getProcessPrivilegeEventCount() {
        return this.ProcessPrivilegeEventCount;
    }

    /**
     * Set 程序提权事件数
     * @param ProcessPrivilegeEventCount 程序提权事件数
     */
    public void setProcessPrivilegeEventCount(Long ProcessPrivilegeEventCount) {
        this.ProcessPrivilegeEventCount = ProcessPrivilegeEventCount;
    }

    /**
     * Get 风险容器事件数 
     * @return RiskContainerEventCount 风险容器事件数
     */
    public Long getRiskContainerEventCount() {
        return this.RiskContainerEventCount;
    }

    /**
     * Set 风险容器事件数
     * @param RiskContainerEventCount 风险容器事件数
     */
    public void setRiskContainerEventCount(Long RiskContainerEventCount) {
        this.RiskContainerEventCount = RiskContainerEventCount;
    }

    /**
     * Get 逃逸事件待处理数 
     * @return PendingEscapeEventCount 逃逸事件待处理数
     */
    public Long getPendingEscapeEventCount() {
        return this.PendingEscapeEventCount;
    }

    /**
     * Set 逃逸事件待处理数
     * @param PendingEscapeEventCount 逃逸事件待处理数
     */
    public void setPendingEscapeEventCount(Long PendingEscapeEventCount) {
        this.PendingEscapeEventCount = PendingEscapeEventCount;
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

    public DescribeEscapeEventTypeSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEscapeEventTypeSummaryResponse(DescribeEscapeEventTypeSummaryResponse source) {
        if (source.ContainerEscapeEventCount != null) {
            this.ContainerEscapeEventCount = new Long(source.ContainerEscapeEventCount);
        }
        if (source.ProcessPrivilegeEventCount != null) {
            this.ProcessPrivilegeEventCount = new Long(source.ProcessPrivilegeEventCount);
        }
        if (source.RiskContainerEventCount != null) {
            this.RiskContainerEventCount = new Long(source.RiskContainerEventCount);
        }
        if (source.PendingEscapeEventCount != null) {
            this.PendingEscapeEventCount = new Long(source.PendingEscapeEventCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerEscapeEventCount", this.ContainerEscapeEventCount);
        this.setParamSimple(map, prefix + "ProcessPrivilegeEventCount", this.ProcessPrivilegeEventCount);
        this.setParamSimple(map, prefix + "RiskContainerEventCount", this.RiskContainerEventCount);
        this.setParamSimple(map, prefix + "PendingEscapeEventCount", this.PendingEscapeEventCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

