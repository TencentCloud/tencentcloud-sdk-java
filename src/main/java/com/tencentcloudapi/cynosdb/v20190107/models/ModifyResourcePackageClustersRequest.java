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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourcePackageClustersRequest extends AbstractModel{

    /**
    * 资源包唯一ID
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 需要建立绑定关系的集群ID
    */
    @SerializedName("BindClusterIds")
    @Expose
    private String [] BindClusterIds;

    /**
    * 需要解除绑定关系的集群ID
    */
    @SerializedName("UnbindClusterIds")
    @Expose
    private String [] UnbindClusterIds;

    /**
     * Get 资源包唯一ID 
     * @return PackageId 资源包唯一ID
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 资源包唯一ID
     * @param PackageId 资源包唯一ID
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 需要建立绑定关系的集群ID 
     * @return BindClusterIds 需要建立绑定关系的集群ID
     */
    public String [] getBindClusterIds() {
        return this.BindClusterIds;
    }

    /**
     * Set 需要建立绑定关系的集群ID
     * @param BindClusterIds 需要建立绑定关系的集群ID
     */
    public void setBindClusterIds(String [] BindClusterIds) {
        this.BindClusterIds = BindClusterIds;
    }

    /**
     * Get 需要解除绑定关系的集群ID 
     * @return UnbindClusterIds 需要解除绑定关系的集群ID
     */
    public String [] getUnbindClusterIds() {
        return this.UnbindClusterIds;
    }

    /**
     * Set 需要解除绑定关系的集群ID
     * @param UnbindClusterIds 需要解除绑定关系的集群ID
     */
    public void setUnbindClusterIds(String [] UnbindClusterIds) {
        this.UnbindClusterIds = UnbindClusterIds;
    }

    public ModifyResourcePackageClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourcePackageClustersRequest(ModifyResourcePackageClustersRequest source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.BindClusterIds != null) {
            this.BindClusterIds = new String[source.BindClusterIds.length];
            for (int i = 0; i < source.BindClusterIds.length; i++) {
                this.BindClusterIds[i] = new String(source.BindClusterIds[i]);
            }
        }
        if (source.UnbindClusterIds != null) {
            this.UnbindClusterIds = new String[source.UnbindClusterIds.length];
            for (int i = 0; i < source.UnbindClusterIds.length; i++) {
                this.UnbindClusterIds[i] = new String(source.UnbindClusterIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamArraySimple(map, prefix + "BindClusterIds.", this.BindClusterIds);
        this.setParamArraySimple(map, prefix + "UnbindClusterIds.", this.UnbindClusterIds);

    }
}

