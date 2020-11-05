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

public class CheckCertificateChainResponse extends AbstractModel{

    /**
    * true为通过检查，false为未通过检查。
    */
    @SerializedName("IsValid")
    @Expose
    private Boolean IsValid;

    /**
    * true为可信CA，false为不可信CA。
    */
    @SerializedName("IsTrustedCA")
    @Expose
    private Boolean IsTrustedCA;

    /**
    * 包含证书链中每一段证书的通用名称。
    */
    @SerializedName("Chains")
    @Expose
    private String [] Chains;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get true为通过检查，false为未通过检查。 
     * @return IsValid true为通过检查，false为未通过检查。
     */
    public Boolean getIsValid() {
        return this.IsValid;
    }

    /**
     * Set true为通过检查，false为未通过检查。
     * @param IsValid true为通过检查，false为未通过检查。
     */
    public void setIsValid(Boolean IsValid) {
        this.IsValid = IsValid;
    }

    /**
     * Get true为可信CA，false为不可信CA。 
     * @return IsTrustedCA true为可信CA，false为不可信CA。
     */
    public Boolean getIsTrustedCA() {
        return this.IsTrustedCA;
    }

    /**
     * Set true为可信CA，false为不可信CA。
     * @param IsTrustedCA true为可信CA，false为不可信CA。
     */
    public void setIsTrustedCA(Boolean IsTrustedCA) {
        this.IsTrustedCA = IsTrustedCA;
    }

    /**
     * Get 包含证书链中每一段证书的通用名称。 
     * @return Chains 包含证书链中每一段证书的通用名称。
     */
    public String [] getChains() {
        return this.Chains;
    }

    /**
     * Set 包含证书链中每一段证书的通用名称。
     * @param Chains 包含证书链中每一段证书的通用名称。
     */
    public void setChains(String [] Chains) {
        this.Chains = Chains;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsValid", this.IsValid);
        this.setParamSimple(map, prefix + "IsTrustedCA", this.IsTrustedCA);
        this.setParamArraySimple(map, prefix + "Chains.", this.Chains);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

