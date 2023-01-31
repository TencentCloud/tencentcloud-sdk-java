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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBEncryptAttributesResponse extends AbstractModel{

    /**
    * 是否启用加密，1-已开启；0-未开启。
    */
    @SerializedName("EncryptStatus")
    @Expose
    private Long EncryptStatus;

    /**
    * DEK密钥
    */
    @SerializedName("CipherText")
    @Expose
    private String CipherText;

    /**
    * DEK密钥过期日期。
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否启用加密，1-已开启；0-未开启。 
     * @return EncryptStatus 是否启用加密，1-已开启；0-未开启。
     */
    public Long getEncryptStatus() {
        return this.EncryptStatus;
    }

    /**
     * Set 是否启用加密，1-已开启；0-未开启。
     * @param EncryptStatus 是否启用加密，1-已开启；0-未开启。
     */
    public void setEncryptStatus(Long EncryptStatus) {
        this.EncryptStatus = EncryptStatus;
    }

    /**
     * Get DEK密钥 
     * @return CipherText DEK密钥
     */
    public String getCipherText() {
        return this.CipherText;
    }

    /**
     * Set DEK密钥
     * @param CipherText DEK密钥
     */
    public void setCipherText(String CipherText) {
        this.CipherText = CipherText;
    }

    /**
     * Get DEK密钥过期日期。 
     * @return ExpireDate DEK密钥过期日期。
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set DEK密钥过期日期。
     * @param ExpireDate DEK密钥过期日期。
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBEncryptAttributesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBEncryptAttributesResponse(DescribeDBEncryptAttributesResponse source) {
        if (source.EncryptStatus != null) {
            this.EncryptStatus = new Long(source.EncryptStatus);
        }
        if (source.CipherText != null) {
            this.CipherText = new String(source.CipherText);
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptStatus", this.EncryptStatus);
        this.setParamSimple(map, prefix + "CipherText", this.CipherText);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

