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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartBatchRollbackRequest extends AbstractModel{

    /**
    * 用于回档的实例详情信息。
    */
    @SerializedName("Instances")
    @Expose
    private RollbackInstancesInfo [] Instances;

    /**
     * Get 用于回档的实例详情信息。 
     * @return Instances 用于回档的实例详情信息。
     */
    public RollbackInstancesInfo [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 用于回档的实例详情信息。
     * @param Instances 用于回档的实例详情信息。
     */
    public void setInstances(RollbackInstancesInfo [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);

    }
}

