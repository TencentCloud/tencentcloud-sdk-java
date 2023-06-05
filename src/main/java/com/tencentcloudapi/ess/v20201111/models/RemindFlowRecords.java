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

public class RemindFlowRecords extends AbstractModel{

    /**
    * 是否能够催办，true-是，false-否
    */
    @SerializedName("CanRemind")
    @Expose
    private Boolean CanRemind;

    /**
    * 合同id
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 催办详情信息
    */
    @SerializedName("RemindMessage")
    @Expose
    private String RemindMessage;

    /**
     * Get 是否能够催办，true-是，false-否 
     * @return CanRemind 是否能够催办，true-是，false-否
     */
    public Boolean getCanRemind() {
        return this.CanRemind;
    }

    /**
     * Set 是否能够催办，true-是，false-否
     * @param CanRemind 是否能够催办，true-是，false-否
     */
    public void setCanRemind(Boolean CanRemind) {
        this.CanRemind = CanRemind;
    }

    /**
     * Get 合同id 
     * @return FlowId 合同id
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同id
     * @param FlowId 合同id
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 催办详情信息 
     * @return RemindMessage 催办详情信息
     */
    public String getRemindMessage() {
        return this.RemindMessage;
    }

    /**
     * Set 催办详情信息
     * @param RemindMessage 催办详情信息
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

