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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSecretRequest extends AbstractModel {

    /**
    * <p>指定需要删除的凭据名称。</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>指定计划删除日期，单位（天），0（默认）表示立即删除， 1-30 表示预留的天数，超出该日期之后彻底删除。<br>当凭据类型为SSH密钥对凭据时，此字段只能取值只能为0。</p>
    */
    @SerializedName("RecoveryWindowInDays")
    @Expose
    private Long RecoveryWindowInDays;

    /**
    * <p>当凭据类型为SSH密钥对凭据时，此字段有效，取值：<br>True -- 表示不仅仅清理此凭据中存储的SSH密钥信息，还会将SSH密钥对从CVM侧进行清理。注意，如果SSH密钥此时绑定了CVM实例，那么会清理失败。<br>False --  表示仅仅清理此凭据中存储的SSH密钥信息，不在CVM进侧进行清理。</p>
    */
    @SerializedName("CleanSSHKey")
    @Expose
    private Boolean CleanSSHKey;

    /**
    * <p>删除模式</p><p>枚举值：</p><ul><li>0： 仅删除凭据</li><li>1： 删除凭据和账号</li></ul>
    */
    @SerializedName("DeleteMode")
    @Expose
    private Long DeleteMode;

    /**
     * Get <p>指定需要删除的凭据名称。</p> 
     * @return SecretName <p>指定需要删除的凭据名称。</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>指定需要删除的凭据名称。</p>
     * @param SecretName <p>指定需要删除的凭据名称。</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>指定计划删除日期，单位（天），0（默认）表示立即删除， 1-30 表示预留的天数，超出该日期之后彻底删除。<br>当凭据类型为SSH密钥对凭据时，此字段只能取值只能为0。</p> 
     * @return RecoveryWindowInDays <p>指定计划删除日期，单位（天），0（默认）表示立即删除， 1-30 表示预留的天数，超出该日期之后彻底删除。<br>当凭据类型为SSH密钥对凭据时，此字段只能取值只能为0。</p>
     */
    public Long getRecoveryWindowInDays() {
        return this.RecoveryWindowInDays;
    }

    /**
     * Set <p>指定计划删除日期，单位（天），0（默认）表示立即删除， 1-30 表示预留的天数，超出该日期之后彻底删除。<br>当凭据类型为SSH密钥对凭据时，此字段只能取值只能为0。</p>
     * @param RecoveryWindowInDays <p>指定计划删除日期，单位（天），0（默认）表示立即删除， 1-30 表示预留的天数，超出该日期之后彻底删除。<br>当凭据类型为SSH密钥对凭据时，此字段只能取值只能为0。</p>
     */
    public void setRecoveryWindowInDays(Long RecoveryWindowInDays) {
        this.RecoveryWindowInDays = RecoveryWindowInDays;
    }

    /**
     * Get <p>当凭据类型为SSH密钥对凭据时，此字段有效，取值：<br>True -- 表示不仅仅清理此凭据中存储的SSH密钥信息，还会将SSH密钥对从CVM侧进行清理。注意，如果SSH密钥此时绑定了CVM实例，那么会清理失败。<br>False --  表示仅仅清理此凭据中存储的SSH密钥信息，不在CVM进侧进行清理。</p> 
     * @return CleanSSHKey <p>当凭据类型为SSH密钥对凭据时，此字段有效，取值：<br>True -- 表示不仅仅清理此凭据中存储的SSH密钥信息，还会将SSH密钥对从CVM侧进行清理。注意，如果SSH密钥此时绑定了CVM实例，那么会清理失败。<br>False --  表示仅仅清理此凭据中存储的SSH密钥信息，不在CVM进侧进行清理。</p>
     */
    public Boolean getCleanSSHKey() {
        return this.CleanSSHKey;
    }

    /**
     * Set <p>当凭据类型为SSH密钥对凭据时，此字段有效，取值：<br>True -- 表示不仅仅清理此凭据中存储的SSH密钥信息，还会将SSH密钥对从CVM侧进行清理。注意，如果SSH密钥此时绑定了CVM实例，那么会清理失败。<br>False --  表示仅仅清理此凭据中存储的SSH密钥信息，不在CVM进侧进行清理。</p>
     * @param CleanSSHKey <p>当凭据类型为SSH密钥对凭据时，此字段有效，取值：<br>True -- 表示不仅仅清理此凭据中存储的SSH密钥信息，还会将SSH密钥对从CVM侧进行清理。注意，如果SSH密钥此时绑定了CVM实例，那么会清理失败。<br>False --  表示仅仅清理此凭据中存储的SSH密钥信息，不在CVM进侧进行清理。</p>
     */
    public void setCleanSSHKey(Boolean CleanSSHKey) {
        this.CleanSSHKey = CleanSSHKey;
    }

    /**
     * Get <p>删除模式</p><p>枚举值：</p><ul><li>0： 仅删除凭据</li><li>1： 删除凭据和账号</li></ul> 
     * @return DeleteMode <p>删除模式</p><p>枚举值：</p><ul><li>0： 仅删除凭据</li><li>1： 删除凭据和账号</li></ul>
     */
    public Long getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set <p>删除模式</p><p>枚举值：</p><ul><li>0： 仅删除凭据</li><li>1： 删除凭据和账号</li></ul>
     * @param DeleteMode <p>删除模式</p><p>枚举值：</p><ul><li>0： 仅删除凭据</li><li>1： 删除凭据和账号</li></ul>
     */
    public void setDeleteMode(Long DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    public DeleteSecretRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSecretRequest(DeleteSecretRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.RecoveryWindowInDays != null) {
            this.RecoveryWindowInDays = new Long(source.RecoveryWindowInDays);
        }
        if (source.CleanSSHKey != null) {
            this.CleanSSHKey = new Boolean(source.CleanSSHKey);
        }
        if (source.DeleteMode != null) {
            this.DeleteMode = new Long(source.DeleteMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "RecoveryWindowInDays", this.RecoveryWindowInDays);
        this.setParamSimple(map, prefix + "CleanSSHKey", this.CleanSSHKey);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);

    }
}

