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

public class DeactivateTDidRequest extends AbstractModel {

    /**
    * DID标识符
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * 设置DID禁用状态的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，建议设置为1分钟内
    */
    @SerializedName("OperateCredential")
    @Expose
    private String OperateCredential;

    /**
    * DID应用Id
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
    * 是否禁用
    */
    @SerializedName("Deactivated")
    @Expose
    private String Deactivated;

    /**
     * Get DID标识符 
     * @return Did DID标识符
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set DID标识符
     * @param Did DID标识符
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get 设置DID禁用状态的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，建议设置为1分钟内 
     * @return OperateCredential 设置DID禁用状态的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，建议设置为1分钟内
     */
    public String getOperateCredential() {
        return this.OperateCredential;
    }

    /**
     * Set 设置DID禁用状态的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，建议设置为1分钟内
     * @param OperateCredential 设置DID禁用状态的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，建议设置为1分钟内
     */
    public void setOperateCredential(String OperateCredential) {
        this.OperateCredential = OperateCredential;
    }

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
     * Get 是否禁用 
     * @return Deactivated 是否禁用
     */
    public String getDeactivated() {
        return this.Deactivated;
    }

    /**
     * Set 是否禁用
     * @param Deactivated 是否禁用
     */
    public void setDeactivated(String Deactivated) {
        this.Deactivated = Deactivated;
    }

    public DeactivateTDidRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeactivateTDidRequest(DeactivateTDidRequest source) {
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.OperateCredential != null) {
            this.OperateCredential = new String(source.OperateCredential);
        }
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
        if (source.Deactivated != null) {
            this.Deactivated = new String(source.Deactivated);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "OperateCredential", this.OperateCredential);
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);
        this.setParamSimple(map, prefix + "Deactivated", this.Deactivated);

    }
}

