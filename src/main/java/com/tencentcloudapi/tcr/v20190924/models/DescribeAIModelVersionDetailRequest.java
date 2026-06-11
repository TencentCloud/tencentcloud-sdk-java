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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAIModelVersionDetailRequest extends AbstractModel {

    /**
    * <p>TCR实例ID</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>命名空间</p>
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * <p>仓库名</p>
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * <p>版本</p>
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
     * Get <p>TCR实例ID</p> 
     * @return RegistryId <p>TCR实例ID</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>TCR实例ID</p>
     * @param RegistryId <p>TCR实例ID</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>命名空间</p> 
     * @return NamespaceName <p>命名空间</p>
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set <p>命名空间</p>
     * @param NamespaceName <p>命名空间</p>
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get <p>仓库名</p> 
     * @return RepositoryName <p>仓库名</p>
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set <p>仓库名</p>
     * @param RepositoryName <p>仓库名</p>
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get <p>版本</p> 
     * @return Reference <p>版本</p>
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set <p>版本</p>
     * @param Reference <p>版本</p>
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public DescribeAIModelVersionDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIModelVersionDetailRequest(DescribeAIModelVersionDetailRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.RepositoryName != null) {
            this.RepositoryName = new String(source.RepositoryName);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "Reference", this.Reference);

    }
}

