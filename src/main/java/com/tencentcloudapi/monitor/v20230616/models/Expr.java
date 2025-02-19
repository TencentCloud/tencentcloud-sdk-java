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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Expr extends AbstractModel {

    /**
    * 算子名称
    */
    @SerializedName("Function")
    @Expose
    private String Function;

    /**
    * 算子入参值
    */
    @SerializedName("N")
    @Expose
    private Float N;

    /**
     * Get 算子名称 
     * @return Function 算子名称
     */
    public String getFunction() {
        return this.Function;
    }

    /**
     * Set 算子名称
     * @param Function 算子名称
     */
    public void setFunction(String Function) {
        this.Function = Function;
    }

    /**
     * Get 算子入参值 
     * @return N 算子入参值
     */
    public Float getN() {
        return this.N;
    }

    /**
     * Set 算子入参值
     * @param N 算子入参值
     */
    public void setN(Float N) {
        this.N = N;
    }

    public Expr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Expr(Expr source) {
        if (source.Function != null) {
            this.Function = new String(source.Function);
        }
        if (source.N != null) {
            this.N = new Float(source.N);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Function", this.Function);
        this.setParamSimple(map, prefix + "N", this.N);

    }
}

