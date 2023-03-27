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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyPdfRequest extends AbstractModel{

    /**
    * 流程ID
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 调用方用户信息，userId 必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 流程ID 
     * @return FlowId 流程ID
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流程ID
     * @param FlowId 流程ID
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 调用方用户信息，userId 必填 
     * @return Operator 调用方用户信息，userId 必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填
     * @param Operator 调用方用户信息，userId 必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public VerifyPdfRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyPdfRequest(VerifyPdfRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

