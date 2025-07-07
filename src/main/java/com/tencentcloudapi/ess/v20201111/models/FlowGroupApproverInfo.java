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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowGroupApproverInfo extends AbstractModel {

    /**
    * 合同流程ID。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 签署节点ID，用于生成动态签署人链接完成领取。注：`生成动态签署人补充链接时必传。`
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
     * Get 合同流程ID。 
     * @return FlowId 合同流程ID。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同流程ID。
     * @param FlowId 合同流程ID。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 签署节点ID，用于生成动态签署人链接完成领取。注：`生成动态签署人补充链接时必传。` 
     * @return RecipientId 签署节点ID，用于生成动态签署人链接完成领取。注：`生成动态签署人补充链接时必传。`
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署节点ID，用于生成动态签署人链接完成领取。注：`生成动态签署人补充链接时必传。`
     * @param RecipientId 签署节点ID，用于生成动态签署人链接完成领取。注：`生成动态签署人补充链接时必传。`
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    public FlowGroupApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowGroupApproverInfo(FlowGroupApproverInfo source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);

    }
}

