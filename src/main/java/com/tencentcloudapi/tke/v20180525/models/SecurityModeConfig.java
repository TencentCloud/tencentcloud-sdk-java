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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityModeConfig extends AbstractModel {

    /**
    * <p>安全模式开关（true 开启 / false 关闭）</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>灰度 namespace 列表</p>
    */
    @SerializedName("Namespaces")
    @Expose
    private String [] Namespaces;

    /**
    * <p>灰度 Pod label</p>
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
     * Get <p>安全模式开关（true 开启 / false 关闭）</p> 
     * @return Enabled <p>安全模式开关（true 开启 / false 关闭）</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>安全模式开关（true 开启 / false 关闭）</p>
     * @param Enabled <p>安全模式开关（true 开启 / false 关闭）</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>灰度 namespace 列表</p> 
     * @return Namespaces <p>灰度 namespace 列表</p>
     */
    public String [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set <p>灰度 namespace 列表</p>
     * @param Namespaces <p>灰度 namespace 列表</p>
     */
    public void setNamespaces(String [] Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get <p>灰度 Pod label</p> 
     * @return Labels <p>灰度 Pod label</p>
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>灰度 Pod label</p>
     * @param Labels <p>灰度 Pod label</p>
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    public SecurityModeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityModeConfig(SecurityModeConfig source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Namespaces != null) {
            this.Namespaces = new String[source.Namespaces.length];
            for (int i = 0; i < source.Namespaces.length; i++) {
                this.Namespaces[i] = new String(source.Namespaces[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArraySimple(map, prefix + "Namespaces.", this.Namespaces);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

