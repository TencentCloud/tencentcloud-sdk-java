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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemindFlowRecords extends AbstractModel {

    /**
    * 合同流程是否可以催办： true - 可以，false - 不可以。 若无法催办，将返回RemindMessage以解释原因。	
    */
    @SerializedName("CanRemind")
    @Expose
    private Boolean CanRemind;

    /**
    * 合同流程ID，为32位字符串。	
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 在合同流程无法催办的情况下，系统将返回RemindMessage以阐述原因。	
    */
    @SerializedName("RemindMessage")
    @Expose
    private String RemindMessage;

    /**
     * Get 合同流程是否可以催办： true - 可以，false - 不可以。 若无法催办，将返回RemindMessage以解释原因。	 
     * @return CanRemind 合同流程是否可以催办： true - 可以，false - 不可以。 若无法催办，将返回RemindMessage以解释原因。	
     */
    public Boolean getCanRemind() {
        return this.CanRemind;
    }

    /**
     * Set 合同流程是否可以催办： true - 可以，false - 不可以。 若无法催办，将返回RemindMessage以解释原因。	
     * @param CanRemind 合同流程是否可以催办： true - 可以，false - 不可以。 若无法催办，将返回RemindMessage以解释原因。	
     */
    public void setCanRemind(Boolean CanRemind) {
        this.CanRemind = CanRemind;
    }

    /**
     * Get 合同流程ID，为32位字符串。	 
     * @return FlowId 合同流程ID，为32位字符串。	
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同流程ID，为32位字符串。	
     * @param FlowId 合同流程ID，为32位字符串。	
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 在合同流程无法催办的情况下，系统将返回RemindMessage以阐述原因。	 
     * @return RemindMessage 在合同流程无法催办的情况下，系统将返回RemindMessage以阐述原因。	
     */
    public String getRemindMessage() {
        return this.RemindMessage;
    }

    /**
     * Set 在合同流程无法催办的情况下，系统将返回RemindMessage以阐述原因。	
     * @param RemindMessage 在合同流程无法催办的情况下，系统将返回RemindMessage以阐述原因。	
     */
    public void setRemindMessage(String RemindMessage) {
        this.RemindMessage = RemindMessage;
    }

    public RemindFlowRecords() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemindFlowRecords(RemindFlowRecords source) {
        if (source.CanRemind != null) {
            this.CanRemind = new Boolean(source.CanRemind);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.RemindMessage != null) {
            this.RemindMessage = new String(source.RemindMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanRemind", this.CanRemind);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "RemindMessage", this.RemindMessage);

    }
}

