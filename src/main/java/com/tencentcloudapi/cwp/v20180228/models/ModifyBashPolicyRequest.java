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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBashPolicyRequest extends AbstractModel{

    /**
    * 具体的策略配置
    */
    @SerializedName("Policy")
    @Expose
    private BashPolicy Policy;

    /**
     * Get 具体的策略配置 
     * @return Policy 具体的策略配置
     */
    public BashPolicy getPolicy() {
        return this.Policy;
    }

    /**
     * Set 具体的策略配置
     * @param Policy 具体的策略配置
     */
    public void setPolicy(BashPolicy Policy) {
        this.Policy = Policy;
    }

    public ModifyBashPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBashPolicyRequest(ModifyBashPolicyRequest source) {
        if (source.Policy != null) {
            this.Policy = new BashPolicy(source.Policy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Policy.", this.Policy);

    }
}

