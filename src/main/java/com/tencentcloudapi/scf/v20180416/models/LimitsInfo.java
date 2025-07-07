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

public class LimitsInfo extends AbstractModel {

    /**
    * 命名空间个数限制
    */
    @SerializedName("NamespacesCount")
    @Expose
    private Long NamespacesCount;

    /**
    * 命名空间限制信息
    */
    @SerializedName("Namespace")
    @Expose
    private NamespaceLimit [] Namespace;

    /**
     * Get 命名空间个数限制 
     * @return NamespacesCount 命名空间个数限制
     */
    public Long getNamespacesCount() {
        return this.NamespacesCount;
    }

    /**
     * Set 命名空间个数限制
     * @param NamespacesCount 命名空间个数限制
     */
    public void setNamespacesCount(Long NamespacesCount) {
        this.NamespacesCount = NamespacesCount;
    }

    /**
     * Get 命名空间限制信息 
     * @return Namespace 命名空间限制信息
     */
    public NamespaceLimit [] getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间限制信息
     * @param Namespace 命名空间限制信息
     */
    public void setNamespace(NamespaceLimit [] Namespace) {
        this.Namespace = Namespace;
    }

    public LimitsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LimitsInfo(LimitsInfo source) {
        if (source.NamespacesCount != null) {
            this.NamespacesCount = new Long(source.NamespacesCount);
        }
        if (source.Namespace != null) {
            this.Namespace = new NamespaceLimit[source.Namespace.length];
            for (int i = 0; i < source.Namespace.length; i++) {
                this.Namespace[i] = new NamespaceLimit(source.Namespace[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespacesCount", this.NamespacesCount);
        this.setParamArrayObj(map, prefix + "Namespace.", this.Namespace);

    }
}

