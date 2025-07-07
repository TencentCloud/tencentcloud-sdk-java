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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainsCLSStatusRequest extends AbstractModel {

    /**
    * 需要修改的域名列表
    */
    @SerializedName("Domains")
    @Expose
    private DomainURI [] Domains;

    /**
    * 修改域名的访问日志开关为Status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 需要修改的域名列表 
     * @return Domains 需要修改的域名列表
     */
    public DomainURI [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 需要修改的域名列表
     * @param Domains 需要修改的域名列表
     */
    public void setDomains(DomainURI [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 修改域名的访问日志开关为Status 
     * @return Status 修改域名的访问日志开关为Status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 修改域名的访问日志开关为Status
     * @param Status 修改域名的访问日志开关为Status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyDomainsCLSStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainsCLSStatusRequest(ModifyDomainsCLSStatusRequest source) {
        if (source.Domains != null) {
            this.Domains = new DomainURI[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new DomainURI(source.Domains[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

