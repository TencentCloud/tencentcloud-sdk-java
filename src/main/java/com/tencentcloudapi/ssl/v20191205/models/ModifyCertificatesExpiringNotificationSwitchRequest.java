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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCertificatesExpiringNotificationSwitchRequest extends AbstractModel{

    /**
    * 证书ID列表。最多50个
    */
    @SerializedName("CertificateIds")
    @Expose
    private String [] CertificateIds;

    /**
    * 0:不忽略通知。1:忽略通知
    */
    @SerializedName("SwitchStatus")
    @Expose
    private Long SwitchStatus;

    /**
     * Get 证书ID列表。最多50个 
     * @return CertificateIds 证书ID列表。最多50个
     */
    public String [] getCertificateIds() {
        return this.CertificateIds;
    }

    /**
     * Set 证书ID列表。最多50个
     * @param CertificateIds 证书ID列表。最多50个
     */
    public void setCertificateIds(String [] CertificateIds) {
        this.CertificateIds = CertificateIds;
    }

    /**
     * Get 0:不忽略通知。1:忽略通知 
     * @return SwitchStatus 0:不忽略通知。1:忽略通知
     */
    public Long getSwitchStatus() {
        return this.SwitchStatus;
    }

    /**
     * Set 0:不忽略通知。1:忽略通知
     * @param SwitchStatus 0:不忽略通知。1:忽略通知
     */
    public void setSwitchStatus(Long SwitchStatus) {
        this.SwitchStatus = SwitchStatus;
    }

    public ModifyCertificatesExpiringNotificationSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCertificatesExpiringNotificationSwitchRequest(ModifyCertificatesExpiringNotificationSwitchRequest source) {
        if (source.CertificateIds != null) {
            this.CertificateIds = new String[source.CertificateIds.length];
            for (int i = 0; i < source.CertificateIds.length; i++) {
                this.CertificateIds[i] = new String(source.CertificateIds[i]);
            }
        }
        if (source.SwitchStatus != null) {
            this.SwitchStatus = new Long(source.SwitchStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CertificateIds.", this.CertificateIds);
        this.setParamSimple(map, prefix + "SwitchStatus", this.SwitchStatus);

    }
}

