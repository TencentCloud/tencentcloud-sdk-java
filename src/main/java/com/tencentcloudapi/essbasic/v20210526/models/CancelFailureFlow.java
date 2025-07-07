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
    * 签署流程编号，为32位字符串
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 撤销失败原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 签署流程编号，为32位字符串 
     * @return FlowId 签署流程编号，为32位字符串
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 签署流程编号，为32位字符串
     * @param FlowId 签署流程编号，为32位字符串
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 撤销失败原因 
     * @return Reason 撤销失败原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 撤销失败原因
     * @param Reason 撤销失败原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

