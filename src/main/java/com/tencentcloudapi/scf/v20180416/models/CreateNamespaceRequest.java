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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNamespaceRequest extends AbstractModel {

    /**
    * 命名空间名称
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 命名空间描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 资源池配置
    */
    @SerializedName("ResourceEnv")
    @Expose
    private NamespaceResourceEnv ResourceEnv;

    /**
     * Get 命名空间名称 
     * @return Namespace 命名空间名称
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名称
     * @param Namespace 命名空间名称
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 命名空间描述 
     * @return Description 命名空间描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 命名空间描述
     * @param Description 命名空间描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 资源池配置 
     * @return ResourceEnv 资源池配置
     */
    public NamespaceResourceEnv getResourceEnv() {
        return this.ResourceEnv;
    }

    /**
     * Set 资源池配置
     * @param ResourceEnv 资源池配置
     */
    public void setResourceEnv(NamespaceResourceEnv ResourceEnv) {
        this.ResourceEnv = ResourceEnv;
    }

    public CreateNamespaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNamespaceRequest(CreateNamespaceRequest source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ResourceEnv != null) {
            this.ResourceEnv = new NamespaceResourceEnv(source.ResourceEnv);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "ResourceEnv.", this.ResourceEnv);

    }
}

