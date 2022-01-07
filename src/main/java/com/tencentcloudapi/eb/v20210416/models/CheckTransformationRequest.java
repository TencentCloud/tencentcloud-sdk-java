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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckTransformationRequest extends AbstractModel{

    /**
    * 待处理的json字符串
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * 一个转换规则列表
    */
    @SerializedName("Transformations")
    @Expose
    private Transformation [] Transformations;

    /**
     * Get 待处理的json字符串 
     * @return Input 待处理的json字符串
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set 待处理的json字符串
     * @param Input 待处理的json字符串
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get 一个转换规则列表 
     * @return Transformations 一个转换规则列表
     */
    public Transformation [] getTransformations() {
        return this.Transformations;
    }

    /**
     * Set 一个转换规则列表
     * @param Transformations 一个转换规则列表
     */
    public void setTransformations(Transformation [] Transformations) {
        this.Transformations = Transformations;
    }

    public CheckTransformationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckTransformationRequest(CheckTransformationRequest source) {
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Transformations != null) {
            this.Transformations = new Transformation[source.Transformations.length];
            for (int i = 0; i < source.Transformations.length; i++) {
                this.Transformations[i] = new Transformation(source.Transformations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamArrayObj(map, prefix + "Transformations.", this.Transformations);

    }
}

