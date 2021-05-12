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
package com.tencentcloudapi.cii.v20201210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResultObject extends AbstractModel{

    /**
    * 图片质量分
    */
    @SerializedName("Quality")
    @Expose
    private Float Quality;

    /**
    * 由结构化算法结构化json转换的字符串，具体协议参见算法结构化结果协议
    */
    @SerializedName("StructureResult")
    @Expose
    private String StructureResult;

    /**
     * Get 图片质量分 
     * @return Quality 图片质量分
     */
    public Float getQuality() {
        return this.Quality;
    }

    /**
     * Set 图片质量分
     * @param Quality 图片质量分
     */
    public void setQuality(Float Quality) {
        this.Quality = Quality;
    }

    /**
     * Get 由结构化算法结构化json转换的字符串，具体协议参见算法结构化结果协议 
     * @return StructureResult 由结构化算法结构化json转换的字符串，具体协议参见算法结构化结果协议
     */
    public String getStructureResult() {
        return this.StructureResult;
    }

    /**
     * Set 由结构化算法结构化json转换的字符串，具体协议参见算法结构化结果协议
     * @param StructureResult 由结构化算法结构化json转换的字符串，具体协议参见算法结构化结果协议
     */
    public void setStructureResult(String StructureResult) {
        this.StructureResult = StructureResult;
    }

    public ResultObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResultObject(ResultObject source) {
        if (source.Quality != null) {
            this.Quality = new Float(source.Quality);
        }
        if (source.StructureResult != null) {
            this.StructureResult = new String(source.StructureResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quality", this.Quality);
        this.setParamSimple(map, prefix + "StructureResult", this.StructureResult);

    }
}

