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

public class FlowBatchUrlInfo extends AbstractModel {

    /**
    * 批量签署合同和签署方的信息，用于补充动态签署人。
    */
    @SerializedName("FlowBatchApproverInfos")
    @Expose
    private FlowBatchApproverInfo [] FlowBatchApproverInfos;

    /**
     * Get 批量签署合同和签署方的信息，用于补充动态签署人。 
     * @return FlowBatchApproverInfos 批量签署合同和签署方的信息，用于补充动态签署人。
     */
    public FlowBatchApproverInfo [] getFlowBatchApproverInfos() {
        return this.FlowBatchApproverInfos;
    }

    /**
     * Set 批量签署合同和签署方的信息，用于补充动态签署人。
     * @param FlowBatchApproverInfos 批量签署合同和签署方的信息，用于补充动态签署人。
     */
    public void setFlowBatchApproverInfos(FlowBatchApproverInfo [] FlowBatchApproverInfos) {
        this.FlowBatchApproverInfos = FlowBatchApproverInfos;
    }

    public FlowBatchUrlInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowBatchUrlInfo(FlowBatchUrlInfo source) {
        if (source.FlowBatchApproverInfos != null) {
            this.FlowBatchApproverInfos = new FlowBatchApproverInfo[source.FlowBatchApproverInfos.length];
            for (int i = 0; i < source.FlowBatchApproverInfos.length; i++) {
                this.FlowBatchApproverInfos[i] = new FlowBatchApproverInfo(source.FlowBatchApproverInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FlowBatchApproverInfos.", this.FlowBatchApproverInfos);

    }
}

