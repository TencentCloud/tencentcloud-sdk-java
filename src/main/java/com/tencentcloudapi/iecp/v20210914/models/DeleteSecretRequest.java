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

public class DeleteSecretRequest extends AbstractModel{

    /**
    * 单元ID
    */
    @SerializedName("EdgeUnitID")
    @Expose
    private Long EdgeUnitID;

    /**
    * secret名称
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * secret命名空间（默认:default）
    */
    @SerializedName("SecretNamespace")
    @Expose
    private String SecretNamespace;

    /**
     * Get 单元ID 
     * @return EdgeUnitID 单元ID
     */
    public Long getEdgeUnitID() {
        return this.EdgeUnitID;
    }

    /**
     * Set 单元ID
     * @param EdgeUnitID 单元ID
     */
    public void setEdgeUnitID(Long EdgeUnitID) {
        this.EdgeUnitID = EdgeUnitID;
    }

    /**
     * Get secret名称 
     * @return SecretName secret名称
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set secret名称
     * @param SecretName secret名称
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get secret命名空间（默认:default） 
     * @return SecretNamespace secret命名空间（默认:default）
     */
    public String getSecretNamespace() {
        return this.SecretNamespace;
    }

    /**
     * Set secret命名空间（默认:default）
     * @param SecretNamespace secret命名空间（默认:default）
     */
    public void setSecretNamespace(String SecretNamespace) {
        this.SecretNamespace = SecretNamespace;
    }

    public DeleteSecretRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSecretRequest(DeleteSecretRequest source) {
        if (source.EdgeUnitID != null) {
            this.EdgeUnitID = new Long(source.EdgeUnitID);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
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
        this.setParamSimple(map, prefix + "SecretNamespace", this.SecretNamespace);

    }
}

