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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWCustomDesensitizeRule extends AbstractModel {

    /**
    * <p>自定义脱敏规则名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>自定义脱敏规则匹配正则</p>
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * <p>自定义脱敏规则掩码</p>
    */
    @SerializedName("MaskFormat")
    @Expose
    private String MaskFormat;

    /**
    * <p>自定义脱敏规则开关</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>自定义脱敏规则名称</p> 
     * @return Name <p>自定义脱敏规则名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>自定义脱敏规则名称</p>
     * @param Name <p>自定义脱敏规则名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>自定义脱敏规则匹配正则</p> 
     * @return Pattern <p>自定义脱敏规则匹配正则</p>
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set <p>自定义脱敏规则匹配正则</p>
     * @param Pattern <p>自定义脱敏规则匹配正则</p>
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get <p>自定义脱敏规则掩码</p> 
     * @return MaskFormat <p>自定义脱敏规则掩码</p>
     */
    public String getMaskFormat() {
        return this.MaskFormat;
    }

    /**
     * Set <p>自定义脱敏规则掩码</p>
     * @param MaskFormat <p>自定义脱敏规则掩码</p>
     */
    public void setMaskFormat(String MaskFormat) {
        this.MaskFormat = MaskFormat;
    }

    /**
     * Get <p>自定义脱敏规则开关</p> 
     * @return Enabled <p>自定义脱敏规则开关</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>自定义脱敏规则开关</p>
     * @param Enabled <p>自定义脱敏规则开关</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public AIGWCustomDesensitizeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWCustomDesensitizeRule(AIGWCustomDesensitizeRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.MaskFormat != null) {
            this.MaskFormat = new String(source.MaskFormat);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "MaskFormat", this.MaskFormat);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

