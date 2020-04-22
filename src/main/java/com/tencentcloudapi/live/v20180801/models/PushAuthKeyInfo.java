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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PushAuthKeyInfo extends AbstractModel{

    /**
    * 域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 是否启用，0：关闭，1：启用。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 主鉴权 Key。
    */
    @SerializedName("MasterAuthKey")
    @Expose
    private String MasterAuthKey;

    /**
    * 备鉴权 Key。
    */
    @SerializedName("BackupAuthKey")
    @Expose
    private String BackupAuthKey;

    /**
    * 有效时间，单位：秒。
    */
    @SerializedName("AuthDelta")
    @Expose
    private Long AuthDelta;

    /**
     * Get 域名。 
     * @return DomainName 域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 域名。
     * @param DomainName 域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 是否启用，0：关闭，1：启用。 
     * @return Enable 是否启用，0：关闭，1：启用。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用，0：关闭，1：启用。
     * @param Enable 是否启用，0：关闭，1：启用。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 主鉴权 Key。 
     * @return MasterAuthKey 主鉴权 Key。
     */
    public String getMasterAuthKey() {
        return this.MasterAuthKey;
    }

    /**
     * Set 主鉴权 Key。
     * @param MasterAuthKey 主鉴权 Key。
     */
    public void setMasterAuthKey(String MasterAuthKey) {
        this.MasterAuthKey = MasterAuthKey;
    }

    /**
     * Get 备鉴权 Key。 
     * @return BackupAuthKey 备鉴权 Key。
     */
    public String getBackupAuthKey() {
        return this.BackupAuthKey;
    }

    /**
     * Set 备鉴权 Key。
     * @param BackupAuthKey 备鉴权 Key。
     */
    public void setBackupAuthKey(String BackupAuthKey) {
        this.BackupAuthKey = BackupAuthKey;
    }

    /**
     * Get 有效时间，单位：秒。 
     * @return AuthDelta 有效时间，单位：秒。
     */
    public Long getAuthDelta() {
        return this.AuthDelta;
    }

    /**
     * Set 有效时间，单位：秒。
     * @param AuthDelta 有效时间，单位：秒。
     */
    public void setAuthDelta(Long AuthDelta) {
        this.AuthDelta = AuthDelta;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "MasterAuthKey", this.MasterAuthKey);
        this.setParamSimple(map, prefix + "BackupAuthKey", this.BackupAuthKey);
        this.setParamSimple(map, prefix + "AuthDelta", this.AuthDelta);

    }
}

