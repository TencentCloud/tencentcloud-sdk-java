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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDBAccount extends AbstractModel {

    /**
    * <p>用户名</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>主机名</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>凭据名称</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>保留时间，0表示立即删除(最大30天)</p>
    */
    @SerializedName("RecoveryWindowInDays")
    @Expose
    private Long RecoveryWindowInDays;

    /**
    * <p>删除模式</p><p>枚举值：</p><ul><li>0： 仅删除凭据</li><li>1： 删除凭据+账号</li></ul>
    */
    @SerializedName("DeleteMode")
    @Expose
    private Long DeleteMode;

    /**
     * Get <p>用户名</p> 
     * @return User <p>用户名</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>用户名</p>
     * @param User <p>用户名</p>
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>主机名</p> 
     * @return Host <p>主机名</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>主机名</p>
     * @param Host <p>主机名</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>凭据名称</p> 
     * @return SecretName <p>凭据名称</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>凭据名称</p>
     * @param SecretName <p>凭据名称</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>保留时间，0表示立即删除(最大30天)</p> 
     * @return RecoveryWindowInDays <p>保留时间，0表示立即删除(最大30天)</p>
     */
    public Long getRecoveryWindowInDays() {
        return this.RecoveryWindowInDays;
    }

    /**
     * Set <p>保留时间，0表示立即删除(最大30天)</p>
     * @param RecoveryWindowInDays <p>保留时间，0表示立即删除(最大30天)</p>
     */
    public void setRecoveryWindowInDays(Long RecoveryWindowInDays) {
        this.RecoveryWindowInDays = RecoveryWindowInDays;
    }

    /**
     * Get <p>删除模式</p><p>枚举值：</p><ul><li>0： 仅删除凭据</li><li>1： 删除凭据+账号</li></ul> 
     * @return DeleteMode <p>删除模式</p><p>枚举值：</p><ul><li>0： 仅删除凭据</li><li>1： 删除凭据+账号</li></ul>
     */
    public Long getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set <p>删除模式</p><p>枚举值：</p><ul><li>0： 仅删除凭据</li><li>1： 删除凭据+账号</li></ul>
     * @param DeleteMode <p>删除模式</p><p>枚举值：</p><ul><li>0： 仅删除凭据</li><li>1： 删除凭据+账号</li></ul>
     */
    public void setDeleteMode(Long DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    public DeleteDBAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDBAccount(DeleteDBAccount source) {
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.RecoveryWindowInDays != null) {
            this.RecoveryWindowInDays = new Long(source.RecoveryWindowInDays);
        }
        if (source.DeleteMode != null) {
            this.DeleteMode = new Long(source.DeleteMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "RecoveryWindowInDays", this.RecoveryWindowInDays);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);

    }
}

