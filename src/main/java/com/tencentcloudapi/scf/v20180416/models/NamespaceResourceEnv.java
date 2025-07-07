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

public class NamespaceResourceEnv extends AbstractModel {

    /**
    * 基于TKE集群的资源池
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TKE")
    @Expose
    private NamespaceResourceEnvTKE TKE;

    /**
    * 近离线计算类型的命名空间
    */
    @SerializedName("OFFLINE")
    @Expose
    private Boolean OFFLINE;

    /**
     * Get 基于TKE集群的资源池
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TKE 基于TKE集群的资源池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NamespaceResourceEnvTKE getTKE() {
        return this.TKE;
    }

    /**
     * Set 基于TKE集群的资源池
注意：此字段可能返回 null，表示取不到有效值。
     * @param TKE 基于TKE集群的资源池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTKE(NamespaceResourceEnvTKE TKE) {
        this.TKE = TKE;
    }

    /**
     * Get 近离线计算类型的命名空间 
     * @return OFFLINE 近离线计算类型的命名空间
     */
    public Boolean getOFFLINE() {
        return this.OFFLINE;
    }

    /**
     * Set 近离线计算类型的命名空间
     * @param OFFLINE 近离线计算类型的命名空间
     */
    public void setOFFLINE(Boolean OFFLINE) {
        this.OFFLINE = OFFLINE;
    }

    public NamespaceResourceEnv() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespaceResourceEnv(NamespaceResourceEnv source) {
        if (source.TKE != null) {
            this.TKE = new NamespaceResourceEnvTKE(source.TKE);
        }
        if (source.OFFLINE != null) {
            this.OFFLINE = new Boolean(source.OFFLINE);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TKE.", this.TKE);
        this.setParamSimple(map, prefix + "OFFLINE", this.OFFLINE);

    }
}

