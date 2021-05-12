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
package com.tencentcloudapi.fmu.v20191213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BeautyParam extends AbstractModel{

    /**
    * 美白程度，取值范围[0,100]。0不美白，100代表最高程度。默认值30。
    */
    @SerializedName("WhitenLevel")
    @Expose
    private Long WhitenLevel;

    /**
    * 磨皮程度，取值范围[0,100]。0不磨皮，100代表最高程度。默认值30。
    */
    @SerializedName("SmoothingLevel")
    @Expose
    private Long SmoothingLevel;

    /**
    * 大眼程度，取值范围[0,100]。0不大眼，100代表最高程度。默认值70。
    */
    @SerializedName("EyeEnlargeLevel")
    @Expose
    private Long EyeEnlargeLevel;

    /**
    * 瘦脸程度，取值范围[0,100]。0不瘦脸，100代表最高程度。默认值70。
    */
    @SerializedName("FaceShrinkLevel")
    @Expose
    private Long FaceShrinkLevel;

    /**
     * Get 美白程度，取值范围[0,100]。0不美白，100代表最高程度。默认值30。 
     * @return WhitenLevel 美白程度，取值范围[0,100]。0不美白，100代表最高程度。默认值30。
     */
    public Long getWhitenLevel() {
        return this.WhitenLevel;
    }

    /**
     * Set 美白程度，取值范围[0,100]。0不美白，100代表最高程度。默认值30。
     * @param WhitenLevel 美白程度，取值范围[0,100]。0不美白，100代表最高程度。默认值30。
     */
    public void setWhitenLevel(Long WhitenLevel) {
        this.WhitenLevel = WhitenLevel;
    }

    /**
     * Get 磨皮程度，取值范围[0,100]。0不磨皮，100代表最高程度。默认值30。 
     * @return SmoothingLevel 磨皮程度，取值范围[0,100]。0不磨皮，100代表最高程度。默认值30。
     */
    public Long getSmoothingLevel() {
        return this.SmoothingLevel;
    }

    /**
     * Set 磨皮程度，取值范围[0,100]。0不磨皮，100代表最高程度。默认值30。
     * @param SmoothingLevel 磨皮程度，取值范围[0,100]。0不磨皮，100代表最高程度。默认值30。
     */
    public void setSmoothingLevel(Long SmoothingLevel) {
        this.SmoothingLevel = SmoothingLevel;
    }

    /**
     * Get 大眼程度，取值范围[0,100]。0不大眼，100代表最高程度。默认值70。 
     * @return EyeEnlargeLevel 大眼程度，取值范围[0,100]。0不大眼，100代表最高程度。默认值70。
     */
    public Long getEyeEnlargeLevel() {
        return this.EyeEnlargeLevel;
    }

    /**
     * Set 大眼程度，取值范围[0,100]。0不大眼，100代表最高程度。默认值70。
     * @param EyeEnlargeLevel 大眼程度，取值范围[0,100]。0不大眼，100代表最高程度。默认值70。
     */
    public void setEyeEnlargeLevel(Long EyeEnlargeLevel) {
        this.EyeEnlargeLevel = EyeEnlargeLevel;
    }

    /**
     * Get 瘦脸程度，取值范围[0,100]。0不瘦脸，100代表最高程度。默认值70。 
     * @return FaceShrinkLevel 瘦脸程度，取值范围[0,100]。0不瘦脸，100代表最高程度。默认值70。
     */
    public Long getFaceShrinkLevel() {
        return this.FaceShrinkLevel;
    }

    /**
     * Set 瘦脸程度，取值范围[0,100]。0不瘦脸，100代表最高程度。默认值70。
     * @param FaceShrinkLevel 瘦脸程度，取值范围[0,100]。0不瘦脸，100代表最高程度。默认值70。
     */
    public void setFaceShrinkLevel(Long FaceShrinkLevel) {
        this.FaceShrinkLevel = FaceShrinkLevel;
    }

    public BeautyParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BeautyParam(BeautyParam source) {
        if (source.WhitenLevel != null) {
            this.WhitenLevel = new Long(source.WhitenLevel);
        }
        if (source.SmoothingLevel != null) {
            this.SmoothingLevel = new Long(source.SmoothingLevel);
        }
        if (source.EyeEnlargeLevel != null) {
            this.EyeEnlargeLevel = new Long(source.EyeEnlargeLevel);
        }
        if (source.FaceShrinkLevel != null) {
            this.FaceShrinkLevel = new Long(source.FaceShrinkLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WhitenLevel", this.WhitenLevel);
        this.setParamSimple(map, prefix + "SmoothingLevel", this.SmoothingLevel);
        this.setParamSimple(map, prefix + "EyeEnlargeLevel", this.EyeEnlargeLevel);
        this.setParamSimple(map, prefix + "FaceShrinkLevel", this.FaceShrinkLevel);

    }
}

