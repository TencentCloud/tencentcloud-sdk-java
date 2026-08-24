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
    * <p>规则名称，同一配置内唯一，最长 64</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>RE2 兼容的正则表达式</p>
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * <p>日志场景为掩码格式，转发场景为占位符；最长 64</p>
    */
    @SerializedName("MaskFormat")
    @Expose
    private String MaskFormat;

    /**
    * <p>单条自定义规则是否启用</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>规则名称，同一配置内唯一，最长 64</p> 
     * @return Name <p>规则名称，同一配置内唯一，最长 64</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>规则名称，同一配置内唯一，最长 64</p>
     * @param Name <p>规则名称，同一配置内唯一，最长 64</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>RE2 兼容的正则表达式</p> 
     * @return Pattern <p>RE2 兼容的正则表达式</p>
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set <p>RE2 兼容的正则表达式</p>
     * @param Pattern <p>RE2 兼容的正则表达式</p>
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get <p>日志场景为掩码格式，转发场景为占位符；最长 64</p> 
     * @return MaskFormat <p>日志场景为掩码格式，转发场景为占位符；最长 64</p>
     */
    public String getMaskFormat() {
        return this.MaskFormat;
    }

    /**
     * Set <p>日志场景为掩码格式，转发场景为占位符；最长 64</p>
     * @param MaskFormat <p>日志场景为掩码格式，转发场景为占位符；最长 64</p>
     */
    public void setMaskFormat(String MaskFormat) {
        this.MaskFormat = MaskFormat;
    }

    /**
     * Get <p>单条自定义规则是否启用</p> 
     * @return Enabled <p>单条自定义规则是否启用</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>单条自定义规则是否启用</p>
     * @param Enabled <p>单条自定义规则是否启用</p>
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

