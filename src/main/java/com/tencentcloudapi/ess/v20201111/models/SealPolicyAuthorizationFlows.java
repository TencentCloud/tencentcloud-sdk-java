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

public class SealPolicyAuthorizationFlows extends AbstractModel {

    /**
    * <p>合同id列表，最大支持50个</p>
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * <p>合同组id列表， 最大支持10个<br>FlowGroupIds(合同组)与FlowIds(合同列表) 两个参数只能选择其中一个，两者同时传会提示参数错误。</p>
    */
    @SerializedName("FlowGroupIds")
    @Expose
    private String [] FlowGroupIds;

    /**
     * Get <p>合同id列表，最大支持50个</p> 
     * @return FlowIds <p>合同id列表，最大支持50个</p>
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set <p>合同id列表，最大支持50个</p>
     * @param FlowIds <p>合同id列表，最大支持50个</p>
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get <p>合同组id列表， 最大支持10个<br>FlowGroupIds(合同组)与FlowIds(合同列表) 两个参数只能选择其中一个，两者同时传会提示参数错误。</p> 
     * @return FlowGroupIds <p>合同组id列表， 最大支持10个<br>FlowGroupIds(合同组)与FlowIds(合同列表) 两个参数只能选择其中一个，两者同时传会提示参数错误。</p>
     */
    public String [] getFlowGroupIds() {
        return this.FlowGroupIds;
    }

    /**
     * Set <p>合同组id列表， 最大支持10个<br>FlowGroupIds(合同组)与FlowIds(合同列表) 两个参数只能选择其中一个，两者同时传会提示参数错误。</p>
     * @param FlowGroupIds <p>合同组id列表， 最大支持10个<br>FlowGroupIds(合同组)与FlowIds(合同列表) 两个参数只能选择其中一个，两者同时传会提示参数错误。</p>
     */
    public void setFlowGroupIds(String [] FlowGroupIds) {
        this.FlowGroupIds = FlowGroupIds;
    }

    public SealPolicyAuthorizationFlows() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SealPolicyAuthorizationFlows(SealPolicyAuthorizationFlows source) {
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.FlowGroupIds != null) {
            this.FlowGroupIds = new String[source.FlowGroupIds.length];
            for (int i = 0; i < source.FlowGroupIds.length; i++) {
                this.FlowGroupIds[i] = new String(source.FlowGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamArraySimple(map, prefix + "FlowGroupIds.", this.FlowGroupIds);

    }
}

