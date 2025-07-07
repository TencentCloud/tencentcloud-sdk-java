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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DimensionsDesc extends AbstractModel {

    /**
    * 维度名数组
    */
    @SerializedName("Dimensions")
    @Expose
    private String [] Dimensions;

    /**
     * Get 维度名数组 
     * @return Dimensions 维度名数组
     */
    public String [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 维度名数组
     * @param Dimensions 维度名数组
     */
    public void setDimensions(String [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    public DimensionsDesc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DimensionsDesc(DimensionsDesc source) {
        if (source.Dimensions != null) {
            this.Dimensions = new String[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new String(source.Dimensions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Dimensions.", this.Dimensions);

    }
}

