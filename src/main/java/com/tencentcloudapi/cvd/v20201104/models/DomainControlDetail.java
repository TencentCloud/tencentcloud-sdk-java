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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainControlDetail extends AbstractModel {

    /**
    * 配置域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 此参数必填，新版本无异议，请求包和回包强制填写空字符串,做校验
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 规则描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 配置域名 
     * @return Domain 配置域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 配置域名
     * @param Domain 配置域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 此参数必填，新版本无异议，请求包和回包强制填写空字符串,做校验 
     * @return Address 此参数必填，新版本无异议，请求包和回包强制填写空字符串,做校验
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 此参数必填，新版本无异议，请求包和回包强制填写空字符串,做校验
     * @param Address 此参数必填，新版本无异议，请求包和回包强制填写空字符串,做校验
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 规则描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public DomainControlDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainControlDetail(DomainControlDetail source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

