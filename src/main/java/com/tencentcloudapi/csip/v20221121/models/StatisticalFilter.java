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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatisticalFilter extends AbstractModel {

    /**
    * 0:不基于统计检测
1:发生次数高于固定值
2:发生次数高于周期平均值的百分之
3:发生次数高于用户平均值的百分之
    */
    @SerializedName("OperatorType")
    @Expose
    private Long OperatorType;

    /**
    * 统计值
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get 0:不基于统计检测
1:发生次数高于固定值
2:发生次数高于周期平均值的百分之
3:发生次数高于用户平均值的百分之 
     * @return OperatorType 0:不基于统计检测
1:发生次数高于固定值
2:发生次数高于周期平均值的百分之
3:发生次数高于用户平均值的百分之
     */
    public Long getOperatorType() {
        return this.OperatorType;
    }

    /**
     * Set 0:不基于统计检测
1:发生次数高于固定值
2:发生次数高于周期平均值的百分之
3:发生次数高于用户平均值的百分之
     * @param OperatorType 0:不基于统计检测
1:发生次数高于固定值
2:发生次数高于周期平均值的百分之
3:发生次数高于用户平均值的百分之
     */
    public void setOperatorType(Long OperatorType) {
        this.OperatorType = OperatorType;
    }

    /**
     * Get 统计值 
     * @return Value 统计值
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 统计值
     * @param Value 统计值
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public StatisticalFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatisticalFilter(StatisticalFilter source) {
        if (source.OperatorType != null) {
            this.OperatorType = new Long(source.OperatorType);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperatorType", this.OperatorType);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

