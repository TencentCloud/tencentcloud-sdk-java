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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectLengthLimitConfig extends AbstractModel {

    /**
    * 检测长度限制的规则列表。
    */
    @SerializedName("DetectLengthLimitRules")
    @Expose
    private DetectLengthLimitRule [] DetectLengthLimitRules;

    /**
     * Get 检测长度限制的规则列表。 
     * @return DetectLengthLimitRules 检测长度限制的规则列表。
     */
    public DetectLengthLimitRule [] getDetectLengthLimitRules() {
        return this.DetectLengthLimitRules;
    }

    /**
     * Set 检测长度限制的规则列表。
     * @param DetectLengthLimitRules 检测长度限制的规则列表。
     */
    public void setDetectLengthLimitRules(DetectLengthLimitRule [] DetectLengthLimitRules) {
        this.DetectLengthLimitRules = DetectLengthLimitRules;
    }

    public DetectLengthLimitConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectLengthLimitConfig(DetectLengthLimitConfig source) {
        if (source.DetectLengthLimitRules != null) {
            this.DetectLengthLimitRules = new DetectLengthLimitRule[source.DetectLengthLimitRules.length];
            for (int i = 0; i < source.DetectLengthLimitRules.length; i++) {
                this.DetectLengthLimitRules[i] = new DetectLengthLimitRule(source.DetectLengthLimitRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DetectLengthLimitRules.", this.DetectLengthLimitRules);

    }
}

