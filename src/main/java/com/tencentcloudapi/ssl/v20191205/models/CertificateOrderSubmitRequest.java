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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateOrderSubmitRequest extends AbstractModel {

    /**
    * 证书 ID。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 是否删除自动DNS验证值：0，不删除； 1，删除； 默认不删除
    */
    @SerializedName("DeleteDnsAutoRecord")
    @Expose
    private Long DeleteDnsAutoRecord;

    /**
    * 域名验证方式：DNS_AUTO 自动DNS验证， DNS DNS验证， FILE 文件验证
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
     * Get 证书 ID。 
     * @return CertId 证书 ID。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书 ID。
     * @param CertId 证书 ID。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 是否删除自动DNS验证值：0，不删除； 1，删除； 默认不删除 
     * @return DeleteDnsAutoRecord 是否删除自动DNS验证值：0，不删除； 1，删除； 默认不删除
     */
    public Long getDeleteDnsAutoRecord() {
        return this.DeleteDnsAutoRecord;
    }

    /**
     * Set 是否删除自动DNS验证值：0，不删除； 1，删除； 默认不删除
     * @param DeleteDnsAutoRecord 是否删除自动DNS验证值：0，不删除； 1，删除； 默认不删除
     */
    public void setDeleteDnsAutoRecord(Long DeleteDnsAutoRecord) {
        this.DeleteDnsAutoRecord = DeleteDnsAutoRecord;
    }

    /**
     * Get 域名验证方式：DNS_AUTO 自动DNS验证， DNS DNS验证， FILE 文件验证 
     * @return VerifyType 域名验证方式：DNS_AUTO 自动DNS验证， DNS DNS验证， FILE 文件验证
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 域名验证方式：DNS_AUTO 自动DNS验证， DNS DNS验证， FILE 文件验证
     * @param VerifyType 域名验证方式：DNS_AUTO 自动DNS验证， DNS DNS验证， FILE 文件验证
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    public CertificateOrderSubmitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateOrderSubmitRequest(CertificateOrderSubmitRequest source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.DeleteDnsAutoRecord != null) {
            this.DeleteDnsAutoRecord = new Long(source.DeleteDnsAutoRecord);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "DeleteDnsAutoRecord", this.DeleteDnsAutoRecord);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);

    }
}

