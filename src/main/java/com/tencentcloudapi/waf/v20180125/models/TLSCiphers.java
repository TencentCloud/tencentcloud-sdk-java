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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TLSCiphers extends AbstractModel {

    /**
    * TLS版本ID
    */
    @SerializedName("VersionId")
    @Expose
    private Long VersionId;

    /**
    * 加密套件ID
    */
    @SerializedName("CipherId")
    @Expose
    private Long CipherId;

    /**
    * 加密套件
    */
    @SerializedName("CipherName")
    @Expose
    private String CipherName;

    /**
     * Get TLS版本ID 
     * @return VersionId TLS版本ID
     */
    public Long getVersionId() {
        return this.VersionId;
    }

    /**
     * Set TLS版本ID
     * @param VersionId TLS版本ID
     */
    public void setVersionId(Long VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 加密套件ID 
     * @return CipherId 加密套件ID
     */
    public Long getCipherId() {
        return this.CipherId;
    }

    /**
     * Set 加密套件ID
     * @param CipherId 加密套件ID
     */
    public void setCipherId(Long CipherId) {
        this.CipherId = CipherId;
    }

    /**
     * Get 加密套件 
     * @return CipherName 加密套件
     */
    public String getCipherName() {
        return this.CipherName;
    }

    /**
     * Set 加密套件
     * @param CipherName 加密套件
     */
    public void setCipherName(String CipherName) {
        this.CipherName = CipherName;
    }

    public TLSCiphers() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TLSCiphers(TLSCiphers source) {
        if (source.VersionId != null) {
            this.VersionId = new Long(source.VersionId);
        }
        if (source.CipherId != null) {
            this.CipherId = new Long(source.CipherId);
        }
        if (source.CipherName != null) {
            this.CipherName = new String(source.CipherName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "CipherId", this.CipherId);
        this.setParamSimple(map, prefix + "CipherName", this.CipherName);

    }
}

