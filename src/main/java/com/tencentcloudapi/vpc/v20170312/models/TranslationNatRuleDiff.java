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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranslationNatRuleDiff extends AbstractModel {

    /**
    * 转发规则目标，可选值"LOCAL","PEER"。
    */
    @SerializedName("TranslationDirection")
    @Expose
    private String TranslationDirection;

    /**
    * 转发规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。
    */
    @SerializedName("TranslationType")
    @Expose
    private String TranslationType;

    /**
    * 转发规则映射`IP`,当转发规则类型为四层时为`IP`池
    */
    @SerializedName("TranslationIp")
    @Expose
    private String TranslationIp;

    /**
    * 转发规则描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 旧转发规则映射`IP`,当转发规则类型为四层时为`IP`池
    */
    @SerializedName("OldTranslationIp")
    @Expose
    private String OldTranslationIp;

    /**
    * 新转发规则源`IP`,当转发规则类型为三层时有效
    */
    @SerializedName("OriginalIp")
    @Expose
    private String OriginalIp;

    /**
    * 旧转发规则源`IP`,当转发规则类型为三层时有效
    */
    @SerializedName("OldOriginalIp")
    @Expose
    private String OldOriginalIp;

    /**
     * Get 转发规则目标，可选值"LOCAL","PEER"。 
     * @return TranslationDirection 转发规则目标，可选值"LOCAL","PEER"。
     */
    public String getTranslationDirection() {
        return this.TranslationDirection;
    }

    /**
     * Set 转发规则目标，可选值"LOCAL","PEER"。
     * @param TranslationDirection 转发规则目标，可选值"LOCAL","PEER"。
     */
    public void setTranslationDirection(String TranslationDirection) {
        this.TranslationDirection = TranslationDirection;
    }

    /**
     * Get 转发规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。 
     * @return TranslationType 转发规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。
     */
    public String getTranslationType() {
        return this.TranslationType;
    }

    /**
     * Set 转发规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。
     * @param TranslationType 转发规则类型，可选值"NETWORK_LAYER","TRANSPORT_LAYER"。
     */
    public void setTranslationType(String TranslationType) {
        this.TranslationType = TranslationType;
    }

    /**
     * Get 转发规则映射`IP`,当转发规则类型为四层时为`IP`池 
     * @return TranslationIp 转发规则映射`IP`,当转发规则类型为四层时为`IP`池
     */
    public String getTranslationIp() {
        return this.TranslationIp;
    }

    /**
     * Set 转发规则映射`IP`,当转发规则类型为四层时为`IP`池
     * @param TranslationIp 转发规则映射`IP`,当转发规则类型为四层时为`IP`池
     */
    public void setTranslationIp(String TranslationIp) {
        this.TranslationIp = TranslationIp;
    }

    /**
     * Get 转发规则描述。 
     * @return Description 转发规则描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 转发规则描述。
     * @param Description 转发规则描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 旧转发规则映射`IP`,当转发规则类型为四层时为`IP`池 
     * @return OldTranslationIp 旧转发规则映射`IP`,当转发规则类型为四层时为`IP`池
     */
    public String getOldTranslationIp() {
        return this.OldTranslationIp;
    }

    /**
     * Set 旧转发规则映射`IP`,当转发规则类型为四层时为`IP`池
     * @param OldTranslationIp 旧转发规则映射`IP`,当转发规则类型为四层时为`IP`池
     */
    public void setOldTranslationIp(String OldTranslationIp) {
        this.OldTranslationIp = OldTranslationIp;
    }

    /**
     * Get 新转发规则源`IP`,当转发规则类型为三层时有效 
     * @return OriginalIp 新转发规则源`IP`,当转发规则类型为三层时有效
     */
    public String getOriginalIp() {
        return this.OriginalIp;
    }

    /**
     * Set 新转发规则源`IP`,当转发规则类型为三层时有效
     * @param OriginalIp 新转发规则源`IP`,当转发规则类型为三层时有效
     */
    public void setOriginalIp(String OriginalIp) {
        this.OriginalIp = OriginalIp;
    }

    /**
     * Get 旧转发规则源`IP`,当转发规则类型为三层时有效 
     * @return OldOriginalIp 旧转发规则源`IP`,当转发规则类型为三层时有效
     */
    public String getOldOriginalIp() {
        return this.OldOriginalIp;
    }

    /**
     * Set 旧转发规则源`IP`,当转发规则类型为三层时有效
     * @param OldOriginalIp 旧转发规则源`IP`,当转发规则类型为三层时有效
     */
    public void setOldOriginalIp(String OldOriginalIp) {
        this.OldOriginalIp = OldOriginalIp;
    }

    public TranslationNatRuleDiff() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranslationNatRuleDiff(TranslationNatRuleDiff source) {
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
        if (source.OldTranslationIp != null) {
            this.OldTranslationIp = new String(source.OldTranslationIp);
        }
        if (source.OriginalIp != null) {
            this.OriginalIp = new String(source.OriginalIp);
        }
        if (source.OldOriginalIp != null) {
            this.OldOriginalIp = new String(source.OldOriginalIp);
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
        this.setParamSimple(map, prefix + "OldTranslationIp", this.OldTranslationIp);
        this.setParamSimple(map, prefix + "OriginalIp", this.OriginalIp);
        this.setParamSimple(map, prefix + "OldOriginalIp", this.OldOriginalIp);

    }
}

