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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNamespaceRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 命名空间的名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 是否公开，true为公开，fale为私有
    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
     * Get 实例ID 
     * @return RegistryId 实例ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例ID
     * @param RegistryId 实例ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 命名空间的名称 
     * @return NamespaceName 命名空间的名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间的名称
     * @param NamespaceName 命名空间的名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 是否公开，true为公开，fale为私有 
     * @return IsPublic 是否公开，true为公开，fale为私有
     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 是否公开，true为公开，fale为私有
     * @param IsPublic 是否公开，true为公开，fale为私有
     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);

    }
}

