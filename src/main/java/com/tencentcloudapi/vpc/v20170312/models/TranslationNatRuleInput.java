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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranslationNatRuleInput extends AbstractModel {

    /**
    * 转换规则目标，可选值"LOCAL","PEER"。
    */
    @SerializedName("TranslationDirection")
    @Expose
    private String TranslationDirection;

    /**
    * 转换规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。
    */
    @SerializedName("TranslationType")
    @Expose
    private String TranslationType;

    /**
    * 转换`IP`,当转换规则类型为四层时为`IP`池。
    */
    @SerializedName("TranslationIp")
    @Expose
    private String TranslationIp;

    /**
    * 转换规则描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 源`IP`,当转换规则类型为三层时有效。
    */
    @SerializedName("OriginalIp")
    @Expose
    private String OriginalIp;

    /**
     * Get 转换规则目标，可选值"LOCAL","PEER"。 
     * @return TranslationDirection 转换规则目标，可选值"LOCAL","PEER"。
     */
    public String getTranslationDirection() {
        return this.TranslationDirection;
    }

    /**
     * Set 转换规则目标，可选值"LOCAL","PEER"。
     * @param TranslationDirection 转换规则目标，可选值"LOCAL","PEER"。
     */
    public void setTranslationDirection(String TranslationDirection) {
        this.TranslationDirection = TranslationDirection;
    }

    /**
     * Get 转换规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。 
     * @return TranslationType 转换规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。
     */
    public String getTranslationType() {
        return this.TranslationType;
    }

    /**
     * Set 转换规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。
     * @param TranslationType 转换规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。
     */
    public void setTranslationType(String TranslationType) {
        this.TranslationType = TranslationType;
    }

    /**
     * Get 转换`IP`,当转换规则类型为四层时为`IP`池。 
     * @return TranslationIp 转换`IP`,当转换规则类型为四层时为`IP`池。
     */
    public String getTranslationIp() {
        return this.TranslationIp;
    }

    /**
     * Set 转换`IP`,当转换规则类型为四层时为`IP`池。
     * @param TranslationIp 转换`IP`,当转换规则类型为四层时为`IP`池。
     */
    public void setTranslationIp(String TranslationIp) {
        this.TranslationIp = TranslationIp;
    }

    /**
     * Get 转换规则描述。 
     * @return Description 转换规则描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 转换规则描述。
     * @param Description 转换规则描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 源`IP`,当转换规则类型为三层时有效。 
     * @return OriginalIp 源`IP`,当转换规则类型为三层时有效。
     */
    public String getOriginalIp() {
        return this.OriginalIp;
    }

    /**
     * Set 源`IP`,当转换规则类型为三层时有效。
     * @param OriginalIp 源`IP`,当转换规则类型为三层时有效。
     */
    public void setOriginalIp(String OriginalIp) {
        this.OriginalIp = OriginalIp;
    }

    public TranslationNatRuleInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranslationNatRuleInput(TranslationNatRuleInput source) {
        if (source.TranslationDirection != null) {
            this.TranslationDirection = new String(source.TranslationDirection);
        }
        if (source.TranslationType != null) {
            this.TranslationType = new String(source.TranslationType);
        }
        if (source.TranslationIp != null) {
            this.TranslationIp = new String(source.TranslationIp);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OriginalIp != null) {
            this.OriginalIp = new String(source.OriginalIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TranslationDirection", this.TranslationDirection);
        this.setParamSimple(map, prefix + "TranslationType", this.TranslationType);
        this.setParamSimple(map, prefix + "TranslationIp", this.TranslationIp);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OriginalIp", this.OriginalIp);

    }
}

