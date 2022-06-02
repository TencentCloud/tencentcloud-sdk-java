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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTKEEdgeClusterStatusResponse extends AbstractModel{

    /**
    * 集群当前状态
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * 集群过程数组
    */
    @SerializedName("Conditions")
    @Expose
    private ClusterCondition [] Conditions;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群当前状态 
     * @return Phase 集群当前状态
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set 集群当前状态
     * @param Phase 集群当前状态
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get 集群过程数组 
     * @return Conditions 集群过程数组
     */
    public ClusterCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 集群过程数组
     * @param Conditions 集群过程数组
     */
    public void setConditions(ClusterCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTKEEdgeClusterStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTKEEdgeClusterStatusResponse(DescribeTKEEdgeClusterStatusResponse source) {
        if (source.Phase != null) {
            this.Phase = new String(source.Phase);
        }
        if (source.Conditions != null) {
            this.Conditions = new ClusterCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new ClusterCondition(source.Conditions[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

