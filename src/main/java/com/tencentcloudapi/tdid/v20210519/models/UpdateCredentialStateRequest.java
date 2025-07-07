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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCredentialStateRequest extends AbstractModel {

    /**
    * DID应用Id
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
    * 更新VC状态的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，如设置为1分钟内
    */
    @SerializedName("OperateCredential")
    @Expose
    private String OperateCredential;

    /**
    * 待更新凭证状态的原始凭证内容
    */
    @SerializedName("OriginCredential")
    @Expose
    private String OriginCredential;

    /**
    * 凭证状态信息
    */
    @SerializedName("CredentialStatus")
    @Expose
    private CredentialStatusInfo CredentialStatus;

    /**
     * Get DID应用Id 
     * @return DAPId DID应用Id
     */
    public Long getDAPId() {
        return this.DAPId;
    }

    /**
     * Set DID应用Id
     * @param DAPId DID应用Id
     */
    public void setDAPId(Long DAPId) {
        this.DAPId = DAPId;
    }

    /**
     * Get 更新VC状态的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，如设置为1分钟内 
     * @return OperateCredential 更新VC状态的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，如设置为1分钟内
     */
    public String getOperateCredential() {
        return this.OperateCredential;
    }

    /**
     * Set 更新VC状态的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，如设置为1分钟内
     * @param OperateCredential 更新VC状态的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，如设置为1分钟内
     */
    public void setOperateCredential(String OperateCredential) {
        this.OperateCredential = OperateCredential;
    }

    /**
     * Get 待更新凭证状态的原始凭证内容 
     * @return OriginCredential 待更新凭证状态的原始凭证内容
     */
    public String getOriginCredential() {
        return this.OriginCredential;
    }

    /**
     * Set 待更新凭证状态的原始凭证内容
     * @param OriginCredential 待更新凭证状态的原始凭证内容
     */
    public void setOriginCredential(String OriginCredential) {
        this.OriginCredential = OriginCredential;
    }

    /**
     * Get 凭证状态信息 
     * @return CredentialStatus 凭证状态信息
     */
    public CredentialStatusInfo getCredentialStatus() {
        return this.CredentialStatus;
    }

    /**
     * Set 凭证状态信息
     * @param CredentialStatus 凭证状态信息
     */
    public void setCredentialStatus(CredentialStatusInfo CredentialStatus) {
        this.CredentialStatus = CredentialStatus;
    }

    public UpdateCredentialStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCredentialStateRequest(UpdateCredentialStateRequest source) {
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
        if (source.OperateCredential != null) {
            this.OperateCredential = new String(source.OperateCredential);
        }
        if (source.OriginCredential != null) {
            this.OriginCredential = new String(source.OriginCredential);
        }
        if (source.CredentialStatus != null) {
            this.CredentialStatus = new CredentialStatusInfo(source.CredentialStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);
        this.setParamSimple(map, prefix + "OperateCredential", this.OperateCredential);
        this.setParamSimple(map, prefix + "OriginCredential", this.OriginCredential);
        this.setParamObj(map, prefix + "CredentialStatus.", this.CredentialStatus);

    }
}

