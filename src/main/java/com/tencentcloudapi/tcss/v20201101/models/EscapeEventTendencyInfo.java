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

public class EscapeEventTendencyInfo extends AbstractModel{

    /**
    * 待处理风险容器事件总数
    */
    @SerializedName("RiskContainerEventCount")
    @Expose
    private Long RiskContainerEventCount;

    /**
    * 待处理程序特权事件总数
    */
    @SerializedName("ProcessPrivilegeEventCount")
    @Expose
    private Long ProcessPrivilegeEventCount;

    /**
    * 待处理容器逃逸事件总数
    */
    @SerializedName("ContainerEscapeEventCount")
    @Expose
    private Long ContainerEscapeEventCount;

    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get 待处理风险容器事件总数 
     * @return RiskContainerEventCount 待处理风险容器事件总数
     */
    public Long getRiskContainerEventCount() {
        return this.RiskContainerEventCount;
    }

    /**
     * Set 待处理风险容器事件总数
     * @param RiskContainerEventCount 待处理风险容器事件总数
     */
    public void setRiskContainerEventCount(Long RiskContainerEventCount) {
        this.RiskContainerEventCount = RiskContainerEventCount;
    }

    /**
     * Get 待处理程序特权事件总数 
     * @return ProcessPrivilegeEventCount 待处理程序特权事件总数
     */
    public Long getProcessPrivilegeEventCount() {
        return this.ProcessPrivilegeEventCount;
    }

    /**
     * Set 待处理程序特权事件总数
     * @param ProcessPrivilegeEventCount 待处理程序特权事件总数
     */
    public void setProcessPrivilegeEventCount(Long ProcessPrivilegeEventCount) {
        this.ProcessPrivilegeEventCount = ProcessPrivilegeEventCount;
    }

    /**
     * Get 待处理容器逃逸事件总数 
     * @return ContainerEscapeEventCount 待处理容器逃逸事件总数
     */
    public Long getContainerEscapeEventCount() {
        return this.ContainerEscapeEventCount;
    }

    /**
     * Set 待处理容器逃逸事件总数
     * @param ContainerEscapeEventCount 待处理容器逃逸事件总数
     */
    public void setContainerEscapeEventCount(Long ContainerEscapeEventCount) {
        this.ContainerEscapeEventCount = ContainerEscapeEventCount;
    }

    /**
     * Get 日期 
     * @return Date 日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期
     * @param Date 日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public EscapeEventTendencyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EscapeEventTendencyInfo(EscapeEventTendencyInfo source) {
        if (source.RiskContainerEventCount != null) {
            this.RiskContainerEventCount = new Long(source.RiskContainerEventCount);
        }
        if (source.ProcessPrivilegeEventCount != null) {
            this.ProcessPrivilegeEventCount = new Long(source.ProcessPrivilegeEventCount);
        }
        if (source.ContainerEscapeEventCount != null) {
            this.ContainerEscapeEventCount = new Long(source.ContainerEscapeEventCount);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskContainerEventCount", this.RiskContainerEventCount);
        this.setParamSimple(map, prefix + "ProcessPrivilegeEventCount", this.ProcessPrivilegeEventCount);
        this.setParamSimple(map, prefix + "ContainerEscapeEventCount", this.ContainerEscapeEventCount);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

