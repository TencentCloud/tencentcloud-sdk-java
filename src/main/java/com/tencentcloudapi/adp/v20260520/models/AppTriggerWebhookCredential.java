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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppTriggerWebhookCredential extends AbstractModel {

    /**
    * <p>凭证ID</p>
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

    /**
    * <p>凭证名称；凭证不存在时为空</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>授权状态；0：未指定，凭证不存在或状态未知；1：未授权；2：已授权；3：已失效</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>凭证ID</p> 
     * @return CredentialId <p>凭证ID</p>
     */
    public String getCredentialId() {
        return this.CredentialId;
    }

    /**
     * Set <p>凭证ID</p>
     * @param CredentialId <p>凭证ID</p>
     */
    public void setCredentialId(String CredentialId) {
        this.CredentialId = CredentialId;
    }

    /**
     * Get <p>凭证名称；凭证不存在时为空</p> 
     * @return Name <p>凭证名称；凭证不存在时为空</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>凭证名称；凭证不存在时为空</p>
     * @param Name <p>凭证名称；凭证不存在时为空</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>授权状态；0：未指定，凭证不存在或状态未知；1：未授权；2：已授权；3：已失效</p> 
     * @return Status <p>授权状态；0：未指定，凭证不存在或状态未知；1：未授权；2：已授权；3：已失效</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>授权状态；0：未指定，凭证不存在或状态未知；1：未授权；2：已授权；3：已失效</p>
     * @param Status <p>授权状态；0：未指定，凭证不存在或状态未知；1：未授权；2：已授权；3：已失效</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public AppTriggerWebhookCredential() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerWebhookCredential(AppTriggerWebhookCredential source) {
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

