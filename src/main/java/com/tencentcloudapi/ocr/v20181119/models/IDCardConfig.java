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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IDCardConfig extends AbstractModel {

    /**
    * 复印件告警，默认为false
    */
    @SerializedName("CopyWarn")
    @Expose
    private Boolean CopyWarn;

    /**
    * 边框和框内遮挡告警，默认为false
    */
    @SerializedName("BorderCheckWarn")
    @Expose
    private Boolean BorderCheckWarn;

    /**
    * 翻拍告警，默认为false
    */
    @SerializedName("ReshootWarn")
    @Expose
    private Boolean ReshootWarn;

    /**
    * 疑似存在PS痕迹告警，默认为false
    */
    @SerializedName("DetectPsWarn")
    @Expose
    private Boolean DetectPsWarn;

    /**
    * 临时身份证告警，默认为false
    */
    @SerializedName("TempIdWarn")
    @Expose
    private Boolean TempIdWarn;

    /**
    * 身份证有效日期不合法告警，默认为false
    */
    @SerializedName("InvalidDateWarn")
    @Expose
    private Boolean InvalidDateWarn;

    /**
    * 是否开启反光检测，默认为false
    */
    @SerializedName("ReflectWarn")
    @Expose
    private Boolean ReflectWarn;

    /**
    * 是否开启头像剪切
    */
    @SerializedName("CropPortrait")
    @Expose
    private Boolean CropPortrait;

    /**
     * Get 复印件告警，默认为false 
     * @return CopyWarn 复印件告警，默认为false
     */
    public Boolean getCopyWarn() {
        return this.CopyWarn;
    }

    /**
     * Set 复印件告警，默认为false
     * @param CopyWarn 复印件告警，默认为false
     */
    public void setCopyWarn(Boolean CopyWarn) {
        this.CopyWarn = CopyWarn;
    }

    /**
     * Get 边框和框内遮挡告警，默认为false 
     * @return BorderCheckWarn 边框和框内遮挡告警，默认为false
     */
    public Boolean getBorderCheckWarn() {
        return this.BorderCheckWarn;
    }

    /**
     * Set 边框和框内遮挡告警，默认为false
     * @param BorderCheckWarn 边框和框内遮挡告警，默认为false
     */
    public void setBorderCheckWarn(Boolean BorderCheckWarn) {
        this.BorderCheckWarn = BorderCheckWarn;
    }

    /**
     * Get 翻拍告警，默认为false 
     * @return ReshootWarn 翻拍告警，默认为false
     */
    public Boolean getReshootWarn() {
        return this.ReshootWarn;
    }

    /**
     * Set 翻拍告警，默认为false
     * @param ReshootWarn 翻拍告警，默认为false
     */
    public void setReshootWarn(Boolean ReshootWarn) {
        this.ReshootWarn = ReshootWarn;
    }

    /**
     * Get 疑似存在PS痕迹告警，默认为false 
     * @return DetectPsWarn 疑似存在PS痕迹告警，默认为false
     */
    public Boolean getDetectPsWarn() {
        return this.DetectPsWarn;
    }

    /**
     * Set 疑似存在PS痕迹告警，默认为false
     * @param DetectPsWarn 疑似存在PS痕迹告警，默认为false
     */
    public void setDetectPsWarn(Boolean DetectPsWarn) {
        this.DetectPsWarn = DetectPsWarn;
    }

    /**
     * Get 临时身份证告警，默认为false 
     * @return TempIdWarn 临时身份证告警，默认为false
     */
    public Boolean getTempIdWarn() {
        return this.TempIdWarn;
    }

    /**
     * Set 临时身份证告警，默认为false
     * @param TempIdWarn 临时身份证告警，默认为false
     */
    public void setTempIdWarn(Boolean TempIdWarn) {
        this.TempIdWarn = TempIdWarn;
    }

    /**
     * Get 身份证有效日期不合法告警，默认为false 
     * @return InvalidDateWarn 身份证有效日期不合法告警，默认为false
     */
    public Boolean getInvalidDateWarn() {
        return this.InvalidDateWarn;
    }

    /**
     * Set 身份证有效日期不合法告警，默认为false
     * @param InvalidDateWarn 身份证有效日期不合法告警，默认为false
     */
    public void setInvalidDateWarn(Boolean InvalidDateWarn) {
        this.InvalidDateWarn = InvalidDateWarn;
    }

    /**
     * Get 是否开启反光检测，默认为false 
     * @return ReflectWarn 是否开启反光检测，默认为false
     */
    public Boolean getReflectWarn() {
        return this.ReflectWarn;
    }

    /**
     * Set 是否开启反光检测，默认为false
     * @param ReflectWarn 是否开启反光检测，默认为false
     */
    public void setReflectWarn(Boolean ReflectWarn) {
        this.ReflectWarn = ReflectWarn;
    }

    /**
     * Get 是否开启头像剪切 
     * @return CropPortrait 是否开启头像剪切
     */
    public Boolean getCropPortrait() {
        return this.CropPortrait;
    }

    /**
     * Set 是否开启头像剪切
     * @param CropPortrait 是否开启头像剪切
     */
    public void setCropPortrait(Boolean CropPortrait) {
        this.CropPortrait = CropPortrait;
    }

    public IDCardConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IDCardConfig(IDCardConfig source) {
        if (source.CopyWarn != null) {
            this.CopyWarn = new Boolean(source.CopyWarn);
        }
        if (source.BorderCheckWarn != null) {
            this.BorderCheckWarn = new Boolean(source.BorderCheckWarn);
        }
        if (source.ReshootWarn != null) {
            this.ReshootWarn = new Boolean(source.ReshootWarn);
        }
        if (source.DetectPsWarn != null) {
            this.DetectPsWarn = new Boolean(source.DetectPsWarn);
        }
        if (source.TempIdWarn != null) {
            this.TempIdWarn = new Boolean(source.TempIdWarn);
        }
        if (source.InvalidDateWarn != null) {
            this.InvalidDateWarn = new Boolean(source.InvalidDateWarn);
        }
        if (source.ReflectWarn != null) {
            this.ReflectWarn = new Boolean(source.ReflectWarn);
        }
        if (source.CropPortrait != null) {
            this.CropPortrait = new Boolean(source.CropPortrait);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CopyWarn", this.CopyWarn);
        this.setParamSimple(map, prefix + "BorderCheckWarn", this.BorderCheckWarn);
        this.setParamSimple(map, prefix + "ReshootWarn", this.ReshootWarn);
        this.setParamSimple(map, prefix + "DetectPsWarn", this.DetectPsWarn);
        this.setParamSimple(map, prefix + "TempIdWarn", this.TempIdWarn);
        this.setParamSimple(map, prefix + "InvalidDateWarn", this.InvalidDateWarn);
        this.setParamSimple(map, prefix + "ReflectWarn", this.ReflectWarn);
        this.setParamSimple(map, prefix + "CropPortrait", this.CropPortrait);

    }
}

