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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchModifyDomainInfoRequest extends AbstractModel{

    /**
    * 批量修改的域名。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 模板ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * true： 开启60天内禁止转移注册商锁定
false：关闭60天内禁止转移注册商锁定
默认 true
    */
    @SerializedName("LockTransfer")
    @Expose
    private Boolean LockTransfer;

    /**
     * Get 批量修改的域名。 
     * @return Domains 批量修改的域名。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 批量修改的域名。
     * @param Domains 批量修改的域名。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 模板ID。 
     * @return TemplateId 模板ID。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID。
     * @param TemplateId 模板ID。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get true： 开启60天内禁止转移注册商锁定
false：关闭60天内禁止转移注册商锁定
默认 true 
     * @return LockTransfer true： 开启60天内禁止转移注册商锁定
false：关闭60天内禁止转移注册商锁定
默认 true
     */
    public Boolean getLockTransfer() {
        return this.LockTransfer;
    }

    /**
     * Set true： 开启60天内禁止转移注册商锁定
false：关闭60天内禁止转移注册商锁定
默认 true
     * @param LockTransfer true： 开启60天内禁止转移注册商锁定
false：关闭60天内禁止转移注册商锁定
默认 true
     */
    public void setLockTransfer(Boolean LockTransfer) {
        this.LockTransfer = LockTransfer;
    }

    public BatchModifyDomainInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyDomainInfoRequest(BatchModifyDomainInfoRequest source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.LockTransfer != null) {
            this.LockTransfer = new Boolean(source.LockTransfer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "LockTransfer", this.LockTransfer);

    }
}

