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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccessCertRequest extends AbstractModel {

    /**
    * <p>证书描述，不超过64字符</p>
    */
    @SerializedName("CertDesc")
    @Expose
    private String CertDesc;

    /**
    * <p>凭证类型</p><p>枚举值：</p><ul><li>ssh： 通用系列文件系统凭证</li><li>gss： Turbo系列文件系统凭证</li></ul><p>默认值：ssh</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>证书描述，不超过64字符</p> 
     * @return CertDesc <p>证书描述，不超过64字符</p>
     */
    public String getCertDesc() {
        return this.CertDesc;
    }

    /**
     * Set <p>证书描述，不超过64字符</p>
     * @param CertDesc <p>证书描述，不超过64字符</p>
     */
    public void setCertDesc(String CertDesc) {
        this.CertDesc = CertDesc;
    }

    /**
     * Get <p>凭证类型</p><p>枚举值：</p><ul><li>ssh： 通用系列文件系统凭证</li><li>gss： Turbo系列文件系统凭证</li></ul><p>默认值：ssh</p> 
     * @return Type <p>凭证类型</p><p>枚举值：</p><ul><li>ssh： 通用系列文件系统凭证</li><li>gss： Turbo系列文件系统凭证</li></ul><p>默认值：ssh</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>凭证类型</p><p>枚举值：</p><ul><li>ssh： 通用系列文件系统凭证</li><li>gss： Turbo系列文件系统凭证</li></ul><p>默认值：ssh</p>
     * @param Type <p>凭证类型</p><p>枚举值：</p><ul><li>ssh： 通用系列文件系统凭证</li><li>gss： Turbo系列文件系统凭证</li></ul><p>默认值：ssh</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CreateAccessCertRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccessCertRequest(CreateAccessCertRequest source) {
        if (source.CertDesc != null) {
            this.CertDesc = new String(source.CertDesc);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertDesc", this.CertDesc);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

