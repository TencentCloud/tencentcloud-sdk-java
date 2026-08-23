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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageScanRegistryFilter extends AbstractModel {

    /**
    * <p>仓库类型</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String [] RegistryType;

    /**
    * <p>仓库命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String [] Namespace;

    /**
     * Get <p>仓库类型</p> 
     * @return RegistryType <p>仓库类型</p>
     */
    public String [] getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>仓库类型</p>
     * @param RegistryType <p>仓库类型</p>
     */
    public void setRegistryType(String [] RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get <p>仓库命名空间</p> 
     * @return Namespace <p>仓库命名空间</p>
     */
    public String [] getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>仓库命名空间</p>
     * @param Namespace <p>仓库命名空间</p>
     */
    public void setNamespace(String [] Namespace) {
        this.Namespace = Namespace;
    }

    public ImageScanRegistryFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageScanRegistryFilter(ImageScanRegistryFilter source) {
        if (source.RegistryType != null) {
            this.RegistryType = new String[source.RegistryType.length];
            for (int i = 0; i < source.RegistryType.length; i++) {
                this.RegistryType[i] = new String(source.RegistryType[i]);
            }
        }
        if (source.Namespace != null) {
            this.Namespace = new String[source.Namespace.length];
            for (int i = 0; i < source.Namespace.length; i++) {
                this.Namespace[i] = new String(source.Namespace[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RegistryType.", this.RegistryType);
        this.setParamArraySimple(map, prefix + "Namespace.", this.Namespace);

    }
}

