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

public class OwnershipVerificationDnsInfo extends AbstractModel {

    /**
    * <p>归属权校验dns子域名</p>
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
    * <p>归属权校验dns记录类型</p>
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * <p>归属权校验dns记录值</p>
    */
    @SerializedName("RecordValue")
    @Expose
    private String RecordValue;

    /**
     * Get <p>归属权校验dns子域名</p> 
     * @return Subdomain <p>归属权校验dns子域名</p>
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set <p>归属权校验dns子域名</p>
     * @param Subdomain <p>归属权校验dns子域名</p>
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    /**
     * Get <p>归属权校验dns记录类型</p> 
     * @return RecordType <p>归属权校验dns记录类型</p>
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set <p>归属权校验dns记录类型</p>
     * @param RecordType <p>归属权校验dns记录类型</p>
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get <p>归属权校验dns记录值</p> 
     * @return RecordValue <p>归属权校验dns记录值</p>
     */
    public String getRecordValue() {
        return this.RecordValue;
    }

    /**
     * Set <p>归属权校验dns记录值</p>
     * @param RecordValue <p>归属权校验dns记录值</p>
     */
    public void setRecordValue(String RecordValue) {
        this.RecordValue = RecordValue;
    }

    public OwnershipVerificationDnsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwnershipVerificationDnsInfo(OwnershipVerificationDnsInfo source) {
        if (source.Subdomain != null) {
            this.Subdomain = new String(source.Subdomain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordValue != null) {
            this.RecordValue = new String(source.RecordValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Subdomain", this.Subdomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordValue", this.RecordValue);

    }
}

