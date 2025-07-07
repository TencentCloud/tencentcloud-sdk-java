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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CardWarnInfo extends AbstractModel {

    /**
    * 证件边缘是否完整
0：正常
1：边缘不完整
    */
    @SerializedName("BorderCheck")
    @Expose
    private Long BorderCheck;

    /**
    * 证件是否被遮挡
0：正常
1：有遮挡
    */
    @SerializedName("OcclusionCheck")
    @Expose
    private Long OcclusionCheck;

    /**
    * 是否复印
0:正常
1:复印件
    */
    @SerializedName("CopyCheck")
    @Expose
    private Long CopyCheck;

    /**
    * 是否屏幕翻拍
0:正常
1:翻拍
    */
    @SerializedName("ReshootCheck")
    @Expose
    private Long ReshootCheck;

    /**
    * 证件是否有PS
0：正常
1：有PS
    */
    @SerializedName("PSCheck")
    @Expose
    private Long PSCheck;

    /**
    * 是否模糊：
0:正常
1:模糊
    */
    @SerializedName("BlurCheck")
    @Expose
    private Long BlurCheck;

    /**
    * 模糊分数， 范围：0.0-1.0，分数越高越模糊，建议阈值为0.5
    */
    @SerializedName("BlurScore")
    @Expose
    private Float BlurScore;

    /**
     * Get 证件边缘是否完整
0：正常
1：边缘不完整 
     * @return BorderCheck 证件边缘是否完整
0：正常
1：边缘不完整
     */
    public Long getBorderCheck() {
        return this.BorderCheck;
    }

    /**
     * Set 证件边缘是否完整
0：正常
1：边缘不完整
     * @param BorderCheck 证件边缘是否完整
0：正常
1：边缘不完整
     */
    public void setBorderCheck(Long BorderCheck) {
        this.BorderCheck = BorderCheck;
    }

    /**
     * Get 证件是否被遮挡
0：正常
1：有遮挡 
     * @return OcclusionCheck 证件是否被遮挡
0：正常
1：有遮挡
     */
    public Long getOcclusionCheck() {
        return this.OcclusionCheck;
    }

    /**
     * Set 证件是否被遮挡
0：正常
1：有遮挡
     * @param OcclusionCheck 证件是否被遮挡
0：正常
1：有遮挡
     */
    public void setOcclusionCheck(Long OcclusionCheck) {
        this.OcclusionCheck = OcclusionCheck;
    }

    /**
     * Get 是否复印
0:正常
1:复印件 
     * @return CopyCheck 是否复印
0:正常
1:复印件
     */
    public Long getCopyCheck() {
        return this.CopyCheck;
    }

    /**
     * Set 是否复印
0:正常
1:复印件
     * @param CopyCheck 是否复印
0:正常
1:复印件
     */
    public void setCopyCheck(Long CopyCheck) {
        this.CopyCheck = CopyCheck;
    }

    /**
     * Get 是否屏幕翻拍
0:正常
1:翻拍 
     * @return ReshootCheck 是否屏幕翻拍
0:正常
1:翻拍
     */
    public Long getReshootCheck() {
        return this.ReshootCheck;
    }

    /**
     * Set 是否屏幕翻拍
0:正常
1:翻拍
     * @param ReshootCheck 是否屏幕翻拍
0:正常
1:翻拍
     */
    public void setReshootCheck(Long ReshootCheck) {
        this.ReshootCheck = ReshootCheck;
    }

    /**
     * Get 证件是否有PS
0：正常
1：有PS 
     * @return PSCheck 证件是否有PS
0：正常
1：有PS
     */
    public Long getPSCheck() {
        return this.PSCheck;
    }

    /**
     * Set 证件是否有PS
0：正常
1：有PS
     * @param PSCheck 证件是否有PS
0：正常
1：有PS
     */
    public void setPSCheck(Long PSCheck) {
        this.PSCheck = PSCheck;
    }

    /**
     * Get 是否模糊：
0:正常
1:模糊 
     * @return BlurCheck 是否模糊：
0:正常
1:模糊
     */
    public Long getBlurCheck() {
        return this.BlurCheck;
    }

    /**
     * Set 是否模糊：
0:正常
1:模糊
     * @param BlurCheck 是否模糊：
0:正常
1:模糊
     */
    public void setBlurCheck(Long BlurCheck) {
        this.BlurCheck = BlurCheck;
    }

    /**
     * Get 模糊分数， 范围：0.0-1.0，分数越高越模糊，建议阈值为0.5 
     * @return BlurScore 模糊分数， 范围：0.0-1.0，分数越高越模糊，建议阈值为0.5
     */
    public Float getBlurScore() {
        return this.BlurScore;
    }

    /**
     * Set 模糊分数， 范围：0.0-1.0，分数越高越模糊，建议阈值为0.5
     * @param BlurScore 模糊分数， 范围：0.0-1.0，分数越高越模糊，建议阈值为0.5
     */
    public void setBlurScore(Float BlurScore) {
        this.BlurScore = BlurScore;
    }

    public CardWarnInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CardWarnInfo(CardWarnInfo source) {
        if (source.BorderCheck != null) {
            this.BorderCheck = new Long(source.BorderCheck);
        }
        if (source.OcclusionCheck != null) {
            this.OcclusionCheck = new Long(source.OcclusionCheck);
        }
        if (source.CopyCheck != null) {
            this.CopyCheck = new Long(source.CopyCheck);
        }
        if (source.ReshootCheck != null) {
            this.ReshootCheck = new Long(source.ReshootCheck);
        }
        if (source.PSCheck != null) {
            this.PSCheck = new Long(source.PSCheck);
        }
        if (source.BlurCheck != null) {
            this.BlurCheck = new Long(source.BlurCheck);
        }
        if (source.BlurScore != null) {
            this.BlurScore = new Float(source.BlurScore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BorderCheck", this.BorderCheck);
        this.setParamSimple(map, prefix + "OcclusionCheck", this.OcclusionCheck);
        this.setParamSimple(map, prefix + "CopyCheck", this.CopyCheck);
        this.setParamSimple(map, prefix + "ReshootCheck", this.ReshootCheck);
        this.setParamSimple(map, prefix + "PSCheck", this.PSCheck);
        this.setParamSimple(map, prefix + "BlurCheck", this.BlurCheck);
        this.setParamSimple(map, prefix + "BlurScore", this.BlurScore);

    }
}

