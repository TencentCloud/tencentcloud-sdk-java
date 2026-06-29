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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PluginParam extends AbstractModel {

    /**
    * 参数配置是否隐藏不可见
    */
    @SerializedName("IsGlobalHidden")
    @Expose
    private Boolean IsGlobalHidden;

    /**
    * 参数是否必填
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * 参数名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 参数配置是否隐藏不可见 
     * @return IsGlobalHidden 参数配置是否隐藏不可见
     */
    public Boolean getIsGlobalHidden() {
        return this.IsGlobalHidden;
    }

    /**
     * Set 参数配置是否隐藏不可见
     * @param IsGlobalHidden 参数配置是否隐藏不可见
     */
    public void setIsGlobalHidden(Boolean IsGlobalHidden) {
        this.IsGlobalHidden = IsGlobalHidden;
    }

    /**
     * Get 参数是否必填 
     * @return IsRequired 参数是否必填
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set 参数是否必填
     * @param IsRequired 参数是否必填
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

    /**
     * Get 参数名称 
     * @return Name 参数名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数名称
     * @param Name 参数名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参数值 
     * @return Value 参数值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 参数值
     * @param Value 参数值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public PluginParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginParam(PluginParam source) {
        if (source.IsGlobalHidden != null) {
            this.IsGlobalHidden = new Boolean(source.IsGlobalHidden);
        }
        if (source.IsRequired != null) {
            this.IsRequired = new Boolean(source.IsRequired);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsGlobalHidden", this.IsGlobalHidden);
        this.setParamSimple(map, prefix + "IsRequired", this.IsRequired);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

