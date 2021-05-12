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

public class TransferProhibitionBatchRequest extends AbstractModel{

    /**
    * 批量操作的域名。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 是否开启禁止域名转移。
True: 开启禁止域名转移状态。
False：关闭禁止域名转移状态。
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
     * Get 批量操作的域名。 
     * @return Domains 批量操作的域名。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 批量操作的域名。
     * @param Domains 批量操作的域名。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 是否开启禁止域名转移。
True: 开启禁止域名转移状态。
False：关闭禁止域名转移状态。 
     * @return Status 是否开启禁止域名转移。
True: 开启禁止域名转移状态。
False：关闭禁止域名转移状态。
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 是否开启禁止域名转移。
True: 开启禁止域名转移状态。
False：关闭禁止域名转移状态。
     * @param Status 是否开启禁止域名转移。
True: 开启禁止域名转移状态。
False：关闭禁止域名转移状态。
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public TransferProhibitionBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransferProhibitionBatchRequest(TransferProhibitionBatchRequest source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

