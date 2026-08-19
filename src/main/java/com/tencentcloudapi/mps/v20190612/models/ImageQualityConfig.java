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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageQualityConfig extends AbstractModel {

    /**
    * <p>图片质量评估维度</p><p>枚举值：</p><ul><li>Brightness： 亮度评估</li><li>Contrast： 对比度评估</li><li>Sharpness： 清晰度评估</li><li>IQA： 综合质量评估</li></ul>
    */
    @SerializedName("Attributes")
    @Expose
    private String [] Attributes;

    /**
     * Get <p>图片质量评估维度</p><p>枚举值：</p><ul><li>Brightness： 亮度评估</li><li>Contrast： 对比度评估</li><li>Sharpness： 清晰度评估</li><li>IQA： 综合质量评估</li></ul> 
     * @return Attributes <p>图片质量评估维度</p><p>枚举值：</p><ul><li>Brightness： 亮度评估</li><li>Contrast： 对比度评估</li><li>Sharpness： 清晰度评估</li><li>IQA： 综合质量评估</li></ul>
     */
    public String [] getAttributes() {
        return this.Attributes;
    }

    /**
     * Set <p>图片质量评估维度</p><p>枚举值：</p><ul><li>Brightness： 亮度评估</li><li>Contrast： 对比度评估</li><li>Sharpness： 清晰度评估</li><li>IQA： 综合质量评估</li></ul>
     * @param Attributes <p>图片质量评估维度</p><p>枚举值：</p><ul><li>Brightness： 亮度评估</li><li>Contrast： 对比度评估</li><li>Sharpness： 清晰度评估</li><li>IQA： 综合质量评估</li></ul>
     */
    public void setAttributes(String [] Attributes) {
        this.Attributes = Attributes;
    }

    public ImageQualityConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageQualityConfig(ImageQualityConfig source) {
        if (source.Attributes != null) {
            this.Attributes = new String[source.Attributes.length];
            for (int i = 0; i < source.Attributes.length; i++) {
                this.Attributes[i] = new String(source.Attributes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Attributes.", this.Attributes);

    }
}

