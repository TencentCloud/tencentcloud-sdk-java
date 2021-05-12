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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyByAsymmetricKeyResponse extends AbstractModel{

    /**
    * 签名是否有效。true：签名有效，false：签名无效。
    */
    @SerializedName("SignatureValid")
    @Expose
    private Boolean SignatureValid;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 签名是否有效。true：签名有效，false：签名无效。 
     * @return SignatureValid 签名是否有效。true：签名有效，false：签名无效。
     */
    public Boolean getSignatureValid() {
        return this.SignatureValid;
    }

    /**
     * Set 签名是否有效。true：签名有效，false：签名无效。
     * @param SignatureValid 签名是否有效。true：签名有效，false：签名无效。
     */
    public void setSignatureValid(Boolean SignatureValid) {
        this.SignatureValid = SignatureValid;
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

    public VerifyByAsymmetricKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyByAsymmetricKeyResponse(VerifyByAsymmetricKeyResponse source) {
        if (source.SignatureValid != null) {
            this.SignatureValid = new Boolean(source.SignatureValid);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignatureValid", this.SignatureValid);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

