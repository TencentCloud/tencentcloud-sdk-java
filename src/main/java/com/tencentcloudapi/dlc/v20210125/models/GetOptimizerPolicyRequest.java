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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetOptimizerPolicyRequest extends AbstractModel{

    /**
    * 策略描述
    */
    @SerializedName("SmartPolicy")
    @Expose
    private SmartPolicy SmartPolicy;

    /**
     * Get 策略描述 
     * @return SmartPolicy 策略描述
     */
    public SmartPolicy getSmartPolicy() {
        return this.SmartPolicy;
    }

    /**
     * Set 策略描述
     * @param SmartPolicy 策略描述
     */
    public void setSmartPolicy(SmartPolicy SmartPolicy) {
        this.SmartPolicy = SmartPolicy;
    }

    public GetOptimizerPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetOptimizerPolicyRequest(GetOptimizerPolicyRequest source) {
        if (source.SmartPolicy != null) {
            this.SmartPolicy = new SmartPolicy(source.SmartPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SmartPolicy.", this.SmartPolicy);

    }
}

