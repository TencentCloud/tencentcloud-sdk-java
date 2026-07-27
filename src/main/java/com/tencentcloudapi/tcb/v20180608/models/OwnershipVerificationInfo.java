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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OwnershipVerificationInfo extends AbstractModel {

    /**
    * <p>归属权校验的域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>归属权校验dns校验信息</p>
    */
    @SerializedName("DnsVerification")
    @Expose
    private OwnershipVerificationDnsInfo [] DnsVerification;

    /**
    * <p>归属权校验文件校验信息</p>
    */
    @SerializedName("FileVerification")
    @Expose
    private OwnershipVerificationFileInfo [] FileVerification;

    /**
     * Get <p>归属权校验的域名</p> 
     * @return Domain <p>归属权校验的域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>归属权校验的域名</p>
     * @param Domain <p>归属权校验的域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>归属权校验dns校验信息</p> 
     * @return DnsVerification <p>归属权校验dns校验信息</p>
     */
    public OwnershipVerificationDnsInfo [] getDnsVerification() {
        return this.DnsVerification;
    }

    /**
     * Set <p>归属权校验dns校验信息</p>
     * @param DnsVerification <p>归属权校验dns校验信息</p>
     */
    public void setDnsVerification(OwnershipVerificationDnsInfo [] DnsVerification) {
        this.DnsVerification = DnsVerification;
    }

    /**
     * Get <p>归属权校验文件校验信息</p> 
     * @return FileVerification <p>归属权校验文件校验信息</p>
     */
    public OwnershipVerificationFileInfo [] getFileVerification() {
        return this.FileVerification;
    }

    /**
     * Set <p>归属权校验文件校验信息</p>
     * @param FileVerification <p>归属权校验文件校验信息</p>
     */
    public void setFileVerification(OwnershipVerificationFileInfo [] FileVerification) {
        this.FileVerification = FileVerification;
    }

    public OwnershipVerificationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwnershipVerificationInfo(OwnershipVerificationInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DnsVerification != null) {
            this.DnsVerification = new OwnershipVerificationDnsInfo[source.DnsVerification.length];
            for (int i = 0; i < source.DnsVerification.length; i++) {
                this.DnsVerification[i] = new OwnershipVerificationDnsInfo(source.DnsVerification[i]);
            }
        }
        if (source.FileVerification != null) {
            this.FileVerification = new OwnershipVerificationFileInfo[source.FileVerification.length];
            for (int i = 0; i < source.FileVerification.length; i++) {
                this.FileVerification[i] = new OwnershipVerificationFileInfo(source.FileVerification[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "DnsVerification.", this.DnsVerification);
        this.setParamArrayObj(map, prefix + "FileVerification.", this.FileVerification);

    }
}

