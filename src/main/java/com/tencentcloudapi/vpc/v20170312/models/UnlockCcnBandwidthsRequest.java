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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnlockCcnBandwidthsRequest extends AbstractModel{

    /**
    * 带宽实例对象数组。
    */
    @SerializedName("Instances")
    @Expose
    private CcnFlowLock [] Instances;

    /**
     * Get 带宽实例对象数组。 
     * @return Instances 带宽实例对象数组。
     */
    public CcnFlowLock [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 带宽实例对象数组。
     * @param Instances 带宽实例对象数组。
     */
    public void setInstances(CcnFlowLock [] Instances) {
        this.Instances = Instances;
    }

    public UnlockCcnBandwidthsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnlockCcnBandwidthsRequest(UnlockCcnBandwidthsRequest source) {
        if (source.Instances != null) {
            this.Instances = new CcnFlowLock[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new CcnFlowLock(source.Instances[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);

    }
}

