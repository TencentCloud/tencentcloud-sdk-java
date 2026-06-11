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

public class DeleteModelItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * 
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
     * Get  
     * @return NamespaceName 
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 
     * @param NamespaceName 
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get  
     * @return RepositoryName 
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set 
     * @param RepositoryName 
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get  
     * @return Reference 
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set 
     * @param Reference 
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public DeleteModelItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteModelItem(DeleteModelItem source) {
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
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "Reference", this.Reference);

    }
}

