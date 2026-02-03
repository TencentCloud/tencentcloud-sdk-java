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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetLibraDBClusterAccountPasswordRequest extends AbstractModel {

    /**
    * 分析集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 密码
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * 账号
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 加密方式
    */
    @SerializedName("EncryptMethod")
    @Expose
    private String EncryptMethod;

    /**
    * 主机
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get 分析集群 ID 
     * @return ClusterId 分析集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 分析集群 ID
     * @param ClusterId 分析集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 密码 
     * @return AccountPassword 密码
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set 密码
     * @param AccountPassword 密码
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get 账号 
     * @return AccountName 账号
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账号
     * @param AccountName 账号
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 加密方式 
     * @return EncryptMethod 加密方式
     */
    public String getEncryptMethod() {
        return this.EncryptMethod;
    }

    /**
     * Set 加密方式
     * @param EncryptMethod 加密方式
     */
    public void setEncryptMethod(String EncryptMethod) {
        this.EncryptMethod = EncryptMethod;
    }

    /**
     * Get 主机 
     * @return Host 主机
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机
     * @param Host 主机
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public ResetLibraDBClusterAccountPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetLibraDBClusterAccountPasswordRequest(ResetLibraDBClusterAccountPasswordRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AccountPassword != null) {
            this.AccountPassword = new String(source.AccountPassword);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.EncryptMethod != null) {
            this.EncryptMethod = new String(source.EncryptMethod);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AccountPassword", this.AccountPassword);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "EncryptMethod", this.EncryptMethod);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

