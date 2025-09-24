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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenValidation extends AbstractModel {

    /**
    * 是否开启token有效性校验
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * token有效性的校验方式，可选值为：jws、jwe、contains、len、regex
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * 有效性校验配置和规则
    */
    @SerializedName("VerifyRule")
    @Expose
    private TokenVerifyRule VerifyRule;

    /**
    * Token显示设置（只有当校验方式为jws/jwe的时候才会有该配置信息）
    */
    @SerializedName("DisplaySetting")
    @Expose
    private TokenDisplaySetting DisplaySetting;

    /**
     * Get 是否开启token有效性校验 
     * @return Enable 是否开启token有效性校验
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启token有效性校验
     * @param Enable 是否开启token有效性校验
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get token有效性的校验方式，可选值为：jws、jwe、contains、len、regex 
     * @return VerifyType token有效性的校验方式，可选值为：jws、jwe、contains、len、regex
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set token有效性的校验方式，可选值为：jws、jwe、contains、len、regex
     * @param VerifyType token有效性的校验方式，可选值为：jws、jwe、contains、len、regex
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get 有效性校验配置和规则 
     * @return VerifyRule 有效性校验配置和规则
     */
    public TokenVerifyRule getVerifyRule() {
        return this.VerifyRule;
    }

    /**
     * Set 有效性校验配置和规则
     * @param VerifyRule 有效性校验配置和规则
     */
    public void setVerifyRule(TokenVerifyRule VerifyRule) {
        this.VerifyRule = VerifyRule;
    }

    /**
     * Get Token显示设置（只有当校验方式为jws/jwe的时候才会有该配置信息） 
     * @return DisplaySetting Token显示设置（只有当校验方式为jws/jwe的时候才会有该配置信息）
     */
    public TokenDisplaySetting getDisplaySetting() {
        return this.DisplaySetting;
    }

    /**
     * Set Token显示设置（只有当校验方式为jws/jwe的时候才会有该配置信息）
     * @param DisplaySetting Token显示设置（只有当校验方式为jws/jwe的时候才会有该配置信息）
     */
    public void setDisplaySetting(TokenDisplaySetting DisplaySetting) {
        this.DisplaySetting = DisplaySetting;
    }

    public TokenValidation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenValidation(TokenValidation source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
        if (source.VerifyRule != null) {
            this.VerifyRule = new TokenVerifyRule(source.VerifyRule);
        }
        if (source.DisplaySetting != null) {
            this.DisplaySetting = new TokenDisplaySetting(source.DisplaySetting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamObj(map, prefix + "VerifyRule.", this.VerifyRule);
        this.setParamObj(map, prefix + "DisplaySetting.", this.DisplaySetting);

    }
}

