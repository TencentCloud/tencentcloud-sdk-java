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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CoefficientTier extends AbstractModel {

    /**
    * <p>积分分级条件</p>
    */
    @SerializedName("Condition")
    @Expose
    private CoefficientTierCondition Condition;

    /**
    * <p>积分系数</p>
    */
    @SerializedName("Coefficient")
    @Expose
    private Coefficient Coefficient;

    /**
     * Get <p>积分分级条件</p> 
     * @return Condition <p>积分分级条件</p>
     */
    public CoefficientTierCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>积分分级条件</p>
     * @param Condition <p>积分分级条件</p>
     */
    public void setCondition(CoefficientTierCondition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>积分系数</p> 
     * @return Coefficient <p>积分系数</p>
     */
    public Coefficient getCoefficient() {
        return this.Coefficient;
    }

    /**
     * Set <p>积分系数</p>
     * @param Coefficient <p>积分系数</p>
     */
    public void setCoefficient(Coefficient Coefficient) {
        this.Coefficient = Coefficient;
    }

    public CoefficientTier() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoefficientTier(CoefficientTier source) {
        if (source.Condition != null) {
            this.Condition = new CoefficientTierCondition(source.Condition);
        }
        if (source.Coefficient != null) {
            this.Coefficient = new Coefficient(source.Coefficient);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamObj(map, prefix + "Coefficient.", this.Coefficient);

    }
}

