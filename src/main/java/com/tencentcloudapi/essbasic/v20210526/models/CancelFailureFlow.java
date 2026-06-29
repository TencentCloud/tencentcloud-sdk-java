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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CancelFailureFlow extends AbstractModel {

    /**
    * <p>签署流程编号，为32位字符串</p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>撤销失败原因</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>合同流程名称</p>
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
     * Get <p>签署流程编号，为32位字符串</p> 
     * @return FlowId <p>签署流程编号，为32位字符串</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>签署流程编号，为32位字符串</p>
     * @param FlowId <p>签署流程编号，为32位字符串</p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>撤销失败原因</p> 
     * @return Reason <p>撤销失败原因</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>撤销失败原因</p>
     * @param Reason <p>撤销失败原因</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>合同流程名称</p> 
     * @return FlowName <p>合同流程名称</p>
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set <p>合同流程名称</p>
     * @param FlowName <p>合同流程名称</p>
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    public CancelFailureFlow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelFailureFlow(CancelFailureFlow source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);

    }
}

