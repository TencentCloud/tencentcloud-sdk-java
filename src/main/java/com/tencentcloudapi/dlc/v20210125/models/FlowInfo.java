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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowInfo extends AbstractModel {

    /**
    * <p>流程ID</p>
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * <p>流程编码</p>
    */
    @SerializedName("WorkFlowCode")
    @Expose
    private String WorkFlowCode;

    /**
    * <p>流程状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>流程ID</p> 
     * @return FlowId <p>流程ID</p>
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>流程ID</p>
     * @param FlowId <p>流程ID</p>
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>流程编码</p> 
     * @return WorkFlowCode <p>流程编码</p>
     */
    public String getWorkFlowCode() {
        return this.WorkFlowCode;
    }

    /**
     * Set <p>流程编码</p>
     * @param WorkFlowCode <p>流程编码</p>
     */
    public void setWorkFlowCode(String WorkFlowCode) {
        this.WorkFlowCode = WorkFlowCode;
    }

    /**
     * Get <p>流程状态</p> 
     * @return Status <p>流程状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>流程状态</p>
     * @param Status <p>流程状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public FlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowInfo(FlowInfo source) {
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.WorkFlowCode != null) {
            this.WorkFlowCode = new String(source.WorkFlowCode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "WorkFlowCode", this.WorkFlowCode);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

