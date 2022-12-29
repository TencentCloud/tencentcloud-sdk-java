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

public class FunctionTarget extends AbstractModel{

    /**
    * 云函数相关信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Function")
    @Expose
    private FunctionInfo Function;

    /**
    * 权重
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get 云函数相关信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Function 云函数相关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FunctionInfo getFunction() {
        return this.Function;
    }

    /**
     * Set 云函数相关信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Function 云函数相关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunction(FunctionInfo Function) {
        this.Function = Function;
    }

    /**
     * Get 权重 
     * @return Weight 权重
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重
     * @param Weight 权重
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public FunctionTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionTarget(FunctionTarget source) {
        if (source.Function != null) {
            this.Function = new FunctionInfo(source.Function);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Function.", this.Function);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

