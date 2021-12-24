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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecretRequest extends AbstractModel{

    /**
    * 边缘单元ID
    */
    @SerializedName("EdgeUnitID")
    @Expose
    private Long EdgeUnitID;

    /**
    * Secret名
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * Secret的Yaml格式
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
    * Secret命名空间（默认:default）
    */
    @SerializedName("SecretNamespace")
    @Expose
    private String SecretNamespace;

    /**
     * Get 边缘单元ID 
     * @return EdgeUnitID 边缘单元ID
     */
    public Long getEdgeUnitID() {
        return this.EdgeUnitID;
    }

    /**
     * Set 边缘单元ID
     * @param EdgeUnitID 边缘单元ID
     */
    public void setEdgeUnitID(Long EdgeUnitID) {
        this.EdgeUnitID = EdgeUnitID;
    }

    /**
     * Get Secret名 
     * @return SecretName Secret名
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Secret名
     * @param SecretName Secret名
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get Secret的Yaml格式 
     * @return Yaml Secret的Yaml格式
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set Secret的Yaml格式
     * @param Yaml Secret的Yaml格式
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    /**
     * Get Secret命名空间（默认:default） 
     * @return SecretNamespace Secret命名空间（默认:default）
     */
    public String getSecretNamespace() {
        return this.SecretNamespace;
    }

    /**
     * Set Secret命名空间（默认:default）
     * @param SecretNamespace Secret命名空间（默认:default）
     */
    public void setSecretNamespace(String SecretNamespace) {
        this.SecretNamespace = SecretNamespace;
    }

    public ModifySecretRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecretRequest(ModifySecretRequest source) {
        if (source.EdgeUnitID != null) {
            this.EdgeUnitID = new Long(source.EdgeUnitID);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.Yaml != null) {
            this.Yaml = new String(source.Yaml);
        }
        if (source.SecretNamespace != null) {
            this.SecretNamespace = new String(source.SecretNamespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitID", this.EdgeUnitID);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);
        this.setParamSimple(map, prefix + "SecretNamespace", this.SecretNamespace);

    }
}

