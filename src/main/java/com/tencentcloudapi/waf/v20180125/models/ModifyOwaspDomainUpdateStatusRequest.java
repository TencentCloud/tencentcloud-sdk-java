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

public class ModifyOwaspDomainUpdateStatusRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 新规则状态，0为关闭，1为开启，2为仅观察
    */
    @SerializedName("UpdateStatus")
    @Expose
    private Long UpdateStatus;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 新规则状态，0为关闭，1为开启，2为仅观察 
     * @return UpdateStatus 新规则状态，0为关闭，1为开启，2为仅观察
     */
    public Long getUpdateStatus() {
        return this.UpdateStatus;
    }

    /**
     * Set 新规则状态，0为关闭，1为开启，2为仅观察
     * @param UpdateStatus 新规则状态，0为关闭，1为开启，2为仅观察
     */
    public void setUpdateStatus(Long UpdateStatus) {
        this.UpdateStatus = UpdateStatus;
    }

    public ModifyOwaspDomainUpdateStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOwaspDomainUpdateStatusRequest(ModifyOwaspDomainUpdateStatusRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.UpdateStatus != null) {
            this.UpdateStatus = new Long(source.UpdateStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "UpdateStatus", this.UpdateStatus);

    }
}

