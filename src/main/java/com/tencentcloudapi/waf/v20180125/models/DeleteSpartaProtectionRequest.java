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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSpartaProtectionRequest extends AbstractModel {

    /**
    * 域名列表
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 实例类型
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 必填项。域名所属实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
     * Get 域名列表 
     * @return Domains 域名列表
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名列表
     * @param Domains 域名列表
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 实例类型 
     * @return Edition 实例类型
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 实例类型
     * @param Edition 实例类型
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 必填项。域名所属实例ID 
     * @return InstanceID 必填项。域名所属实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 必填项。域名所属实例ID
     * @param InstanceID 必填项。域名所属实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public DeleteSpartaProtectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSpartaProtectionRequest(DeleteSpartaProtectionRequest source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

