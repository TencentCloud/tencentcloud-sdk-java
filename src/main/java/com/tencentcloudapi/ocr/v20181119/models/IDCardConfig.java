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
    * 默认为false
    */
    @SerializedName("CopyWarn")
    @Expose
    private Boolean CopyWarn;

    /**
    * 默认为false
    */
    @SerializedName("BorderCheckWarn")
    @Expose
    private Boolean BorderCheckWarn;

    /**
    * 默认为false
    */
    @SerializedName("ReshootWarn")
    @Expose
    private Boolean ReshootWarn;

    /**
    * 默认为false
    */
    @SerializedName("DetectPsWarn")
    @Expose
    private Boolean DetectPsWarn;

    /**
    * 默认为false
    */
    @SerializedName("TempIdWarn")
    @Expose
    private Boolean TempIdWarn;

    /**
    * 默认为false
    */
    @SerializedName("InvalidDateWarn")
    @Expose
    private Boolean InvalidDateWarn;

    /**
    * 默认为false
    */
    @SerializedName("ReflectWarn")
    @Expose
    private Boolean ReflectWarn;

    /**
     * Get 默认为false 
     * @return CopyWarn 默认为false
     */
    public Boolean getCopyWarn() {
        return this.CopyWarn;
    }

    /**
     * Set 默认为false
     * @param CopyWarn 默认为false
     */
    public void setCopyWarn(Boolean CopyWarn) {
        this.CopyWarn = CopyWarn;
    }

    /**
     * Get 默认为false 
     * @return BorderCheckWarn 默认为false
     */
    public Boolean getBorderCheckWarn() {
        return this.BorderCheckWarn;
    }

    /**
     * Set 默认为false
     * @param BorderCheckWarn 默认为false
     */
    public void setBorderCheckWarn(Boolean BorderCheckWarn) {
        this.BorderCheckWarn = BorderCheckWarn;
    }

    /**
     * Get 默认为false 
     * @return ReshootWarn 默认为false
     */
    public Boolean getReshootWarn() {
        return this.ReshootWarn;
    }

    /**
     * Set 默认为false
     * @param ReshootWarn 默认为false
     */
    public void setReshootWarn(Boolean ReshootWarn) {
        this.ReshootWarn = ReshootWarn;
    }

    /**
     * Get 默认为false 
     * @return DetectPsWarn 默认为false
     */
    public Boolean getDetectPsWarn() {
        return this.DetectPsWarn;
    }

    /**
     * Set 默认为false
     * @param DetectPsWarn 默认为false
     */
    public void setDetectPsWarn(Boolean DetectPsWarn) {
        this.DetectPsWarn = DetectPsWarn;
    }

    /**
     * Get 默认为false 
     * @return TempIdWarn 默认为false
     */
    public Boolean getTempIdWarn() {
        return this.TempIdWarn;
    }

    /**
     * Set 默认为false
     * @param TempIdWarn 默认为false
     */
    public void setTempIdWarn(Boolean TempIdWarn) {
        this.TempIdWarn = TempIdWarn;
    }

    /**
     * Get 默认为false 
     * @return InvalidDateWarn 默认为false
     */
    public Boolean getInvalidDateWarn() {
        return this.InvalidDateWarn;
    }

    /**
     * Set 默认为false
     * @param InvalidDateWarn 默认为false
     */
    public void setInvalidDateWarn(Boolean InvalidDateWarn) {
        this.InvalidDateWarn = InvalidDateWarn;
    }

    /**
     * Get 默认为false 
     * @return ReflectWarn 默认为false
     */
    public Boolean getReflectWarn() {
        return this.ReflectWarn;
    }

    /**
     * Set 默认为false
     * @param ReflectWarn 默认为false
     */
    public void setReflectWarn(Boolean ReflectWarn) {
        this.ReflectWarn = ReflectWarn;
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

    }
}

