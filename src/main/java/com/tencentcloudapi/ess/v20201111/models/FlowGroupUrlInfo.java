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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowGroupUrlInfo extends AbstractModel {

    /**
    * 合同组子合同和签署方的信息，用于补充动态签署人。
    */
    @SerializedName("FlowGroupApproverInfos")
    @Expose
    private FlowGroupApproverInfo [] FlowGroupApproverInfos;

    /**
     * Get 合同组子合同和签署方的信息，用于补充动态签署人。 
     * @return FlowGroupApproverInfos 合同组子合同和签署方的信息，用于补充动态签署人。
     */
    public FlowGroupApproverInfo [] getFlowGroupApproverInfos() {
        return this.FlowGroupApproverInfos;
    }

    /**
     * Set 合同组子合同和签署方的信息，用于补充动态签署人。
     * @param FlowGroupApproverInfos 合同组子合同和签署方的信息，用于补充动态签署人。
     */
    public void setFlowGroupApproverInfos(FlowGroupApproverInfo [] FlowGroupApproverInfos) {
        this.FlowGroupApproverInfos = FlowGroupApproverInfos;
    }

    public FlowGroupUrlInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowGroupUrlInfo(FlowGroupUrlInfo source) {
        if (source.FlowGroupApproverInfos != null) {
            this.FlowGroupApproverInfos = new FlowGroupApproverInfo[source.FlowGroupApproverInfos.length];
            for (int i = 0; i < source.FlowGroupApproverInfos.length; i++) {
                this.FlowGroupApproverInfos[i] = new FlowGroupApproverInfo(source.FlowGroupApproverInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FlowGroupApproverInfos.", this.FlowGroupApproverInfos);

    }
}

