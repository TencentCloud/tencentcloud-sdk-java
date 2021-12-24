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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdgeUnitMonitorStatusResponse extends AbstractModel{

    /**
    * 监控状态描述：
"running" 单元监控正常运行
"deploying" 单元监控部署中
"norsc" 单元需要可用节点以部署监控
"abnormal" 单元监控异常
"none" 单元监控不可用
    */
    @SerializedName("MonitorStatus")
    @Expose
    private String MonitorStatus;

    /**
    * 监控是否就绪
    */
    @SerializedName("IsAvailable")
    @Expose
    private Boolean IsAvailable;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 监控状态描述：
"running" 单元监控正常运行
"deploying" 单元监控部署中
"norsc" 单元需要可用节点以部署监控
"abnormal" 单元监控异常
"none" 单元监控不可用 
     * @return MonitorStatus 监控状态描述：
"running" 单元监控正常运行
"deploying" 单元监控部署中
"norsc" 单元需要可用节点以部署监控
"abnormal" 单元监控异常
"none" 单元监控不可用
     */
    public String getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 监控状态描述：
"running" 单元监控正常运行
"deploying" 单元监控部署中
"norsc" 单元需要可用节点以部署监控
"abnormal" 单元监控异常
"none" 单元监控不可用
     * @param MonitorStatus 监控状态描述：
"running" 单元监控正常运行
"deploying" 单元监控部署中
"norsc" 单元需要可用节点以部署监控
"abnormal" 单元监控异常
"none" 单元监控不可用
     */
    public void setMonitorStatus(String MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get 监控是否就绪 
     * @return IsAvailable 监控是否就绪
     */
    public Boolean getIsAvailable() {
        return this.IsAvailable;
    }

    /**
     * Set 监控是否就绪
     * @param IsAvailable 监控是否就绪
     */
    public void setIsAvailable(Boolean IsAvailable) {
        this.IsAvailable = IsAvailable;
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

    public DescribeEdgeUnitMonitorStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeUnitMonitorStatusResponse(DescribeEdgeUnitMonitorStatusResponse source) {
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new String(source.MonitorStatus);
        }
        if (source.IsAvailable != null) {
            this.IsAvailable = new Boolean(source.IsAvailable);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "IsAvailable", this.IsAvailable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

