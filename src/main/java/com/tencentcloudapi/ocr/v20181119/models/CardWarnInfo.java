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
    * <p>证件边缘是否完整<br>0：正常<br>1：边缘不完整</p>
    */
    @SerializedName("BorderCheck")
    @Expose
    private Long BorderCheck;

    /**
    * <p>证件是否被遮挡<br>0：正常<br>1：有遮挡</p>
    */
    @SerializedName("OcclusionCheck")
    @Expose
    private Long OcclusionCheck;

    /**
    * <p>是否复印<br>0:正常<br>1:复印件</p>
    */
    @SerializedName("CopyCheck")
    @Expose
    private Long CopyCheck;

    /**
    * <p>是否屏幕翻拍<br>0:正常<br>1:翻拍</p>
    */
    @SerializedName("ReshootCheck")
    @Expose
    private Long ReshootCheck;

    /**
    * <p>证件是否有PS<br>0：正常<br>1：有PS</p>
    */
    @SerializedName("PSCheck")
    @Expose
    private Long PSCheck;

    /**
    * <p>是否模糊：<br>0:正常<br>1:模糊</p>
    */
    @SerializedName("BlurCheck")
    @Expose
    private Long BlurCheck;

    /**
    * <p>模糊分数， 范围：0.0-1.0，分数越高越模糊，建议阈值为0.5</p>
    */
    @SerializedName("BlurScore")
    @Expose
    private Float BlurScore;

    /**
    * <p>是否电子身份证<br>0：否<br>1：是电子身份证</p>
    */
    @SerializedName("ElectronCheck")
    @Expose
    private Long ElectronCheck;

    /**
    * <p>是否存在反光</p><p>枚举值：</p><ul><li>0： 正常</li><li>1： 反光</li></ul><p>默认值：0</p>
    */
    @SerializedName("ReflectCheck")
    @Expose
    private Long ReflectCheck;

    /**
     * Get <p>证件边缘是否完整<br>0：正常<br>1：边缘不完整</p> 
     * @return BorderCheck <p>证件边缘是否完整<br>0：正常<br>1：边缘不完整</p>
     */
    public Long getBorderCheck() {
        return this.BorderCheck;
    }

    /**
     * Set <p>证件边缘是否完整<br>0：正常<br>1：边缘不完整</p>
     * @param BorderCheck <p>证件边缘是否完整<br>0：正常<br>1：边缘不完整</p>
     */
    public void setBorderCheck(Long BorderCheck) {
        this.BorderCheck = BorderCheck;
    }

    /**
     * Get <p>证件是否被遮挡<br>0：正常<br>1：有遮挡</p> 
     * @return OcclusionCheck <p>证件是否被遮挡<br>0：正常<br>1：有遮挡</p>
     */
    public Long getOcclusionCheck() {
        return this.OcclusionCheck;
    }

    /**
     * Set <p>证件是否被遮挡<br>0：正常<br>1：有遮挡</p>
     * @param OcclusionCheck <p>证件是否被遮挡<br>0：正常<br>1：有遮挡</p>
     */
    public void setOcclusionCheck(Long OcclusionCheck) {
        this.OcclusionCheck = OcclusionCheck;
    }

    /**
     * Get <p>是否复印<br>0:正常<br>1:复印件</p> 
     * @return CopyCheck <p>是否复印<br>0:正常<br>1:复印件</p>
     */
    public Long getCopyCheck() {
        return this.CopyCheck;
    }

    /**
     * Set <p>是否复印<br>0:正常<br>1:复印件</p>
     * @param CopyCheck <p>是否复印<br>0:正常<br>1:复印件</p>
     */
    public void setCopyCheck(Long CopyCheck) {
        this.CopyCheck = CopyCheck;
    }

    /**
     * Get <p>是否屏幕翻拍<br>0:正常<br>1:翻拍</p> 
     * @return ReshootCheck <p>是否屏幕翻拍<br>0:正常<br>1:翻拍</p>
     */
    public Long getReshootCheck() {
        return this.ReshootCheck;
    }

    /**
     * Set <p>是否屏幕翻拍<br>0:正常<br>1:翻拍</p>
     * @param ReshootCheck <p>是否屏幕翻拍<br>0:正常<br>1:翻拍</p>
     */
    public void setReshootCheck(Long ReshootCheck) {
        this.ReshootCheck = ReshootCheck;
    }

    /**
     * Get <p>证件是否有PS<br>0：正常<br>1：有PS</p> 
     * @return PSCheck <p>证件是否有PS<br>0：正常<br>1：有PS</p>
     */
    public Long getPSCheck() {
        return this.PSCheck;
    }

    /**
     * Set <p>证件是否有PS<br>0：正常<br>1：有PS</p>
     * @param PSCheck <p>证件是否有PS<br>0：正常<br>1：有PS</p>
     */
    public void setPSCheck(Long PSCheck) {
        this.PSCheck = PSCheck;
    }

    /**
     * Get <p>是否模糊：<br>0:正常<br>1:模糊</p> 
     * @return BlurCheck <p>是否模糊：<br>0:正常<br>1:模糊</p>
     */
    public Long getBlurCheck() {
        return this.BlurCheck;
    }

    /**
     * Set <p>是否模糊：<br>0:正常<br>1:模糊</p>
     * @param BlurCheck <p>是否模糊：<br>0:正常<br>1:模糊</p>
     */
    public void setBlurCheck(Long BlurCheck) {
        this.BlurCheck = BlurCheck;
    }

    /**
     * Get <p>模糊分数， 范围：0.0-1.0，分数越高越模糊，建议阈值为0.5</p> 
     * @return BlurScore <p>模糊分数， 范围：0.0-1.0，分数越高越模糊，建议阈值为0.5</p>
     */
    public Float getBlurScore() {
        return this.BlurScore;
    }

    /**
     * Set <p>模糊分数， 范围：0.0-1.0，分数越高越模糊，建议阈值为0.5</p>
     * @param BlurScore <p>模糊分数， 范围：0.0-1.0，分数越高越模糊，建议阈值为0.5</p>
     */
    public void setBlurScore(Float BlurScore) {
        this.BlurScore = BlurScore;
    }

    /**
     * Get <p>是否电子身份证<br>0：否<br>1：是电子身份证</p> 
     * @return ElectronCheck <p>是否电子身份证<br>0：否<br>1：是电子身份证</p>
     */
    public Long getElectronCheck() {
        return this.ElectronCheck;
    }

    /**
     * Set <p>是否电子身份证<br>0：否<br>1：是电子身份证</p>
     * @param ElectronCheck <p>是否电子身份证<br>0：否<br>1：是电子身份证</p>
     */
    public void setElectronCheck(Long ElectronCheck) {
        this.ElectronCheck = ElectronCheck;
    }

    /**
     * Get <p>是否存在反光</p><p>枚举值：</p><ul><li>0： 正常</li><li>1： 反光</li></ul><p>默认值：0</p> 
     * @return ReflectCheck <p>是否存在反光</p><p>枚举值：</p><ul><li>0： 正常</li><li>1： 反光</li></ul><p>默认值：0</p>
     */
    public Long getReflectCheck() {
        return this.ReflectCheck;
    }

    /**
     * Set <p>是否存在反光</p><p>枚举值：</p><ul><li>0： 正常</li><li>1： 反光</li></ul><p>默认值：0</p>
     * @param ReflectCheck <p>是否存在反光</p><p>枚举值：</p><ul><li>0： 正常</li><li>1： 反光</li></ul><p>默认值：0</p>
     */
    public void setReflectCheck(Long ReflectCheck) {
        this.ReflectCheck = ReflectCheck;
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
        if (source.ElectronCheck != null) {
            this.ElectronCheck = new Long(source.ElectronCheck);
        }
        if (source.ReflectCheck != null) {
            this.ReflectCheck = new Long(source.ReflectCheck);
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
        this.setParamSimple(map, prefix + "ElectronCheck", this.ElectronCheck);
        this.setParamSimple(map, prefix + "ReflectCheck", this.ReflectCheck);

    }
}

