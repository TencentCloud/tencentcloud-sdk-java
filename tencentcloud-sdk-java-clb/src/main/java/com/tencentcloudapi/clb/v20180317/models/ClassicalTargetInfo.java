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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassicalTargetInfo extends AbstractModel{

    /**
    * 后端实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 权重，取值范围 [0, 100]
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get 后端实例ID 
     * @return InstanceId 后端实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 后端实例ID
     * @param InstanceId 后端实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 权重，取值范围 [0, 100] 
     * @return Weight 权重，取值范围 [0, 100]
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重，取值范围 [0, 100]
     * @param Weight 权重，取值范围 [0, 100]
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

