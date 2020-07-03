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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConstraintRange extends AbstractModel{

    /**
    * 约束类型为section时的最小值
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * 约束类型为section时的最大值
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
     * Get 约束类型为section时的最小值 
     * @return Min 约束类型为section时的最小值
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set 约束类型为section时的最小值
     * @param Min 约束类型为section时的最小值
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get 约束类型为section时的最大值 
     * @return Max 约束类型为section时的最大值
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set 约束类型为section时的最大值
     * @param Max 约束类型为section时的最大值
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);

    }
}

