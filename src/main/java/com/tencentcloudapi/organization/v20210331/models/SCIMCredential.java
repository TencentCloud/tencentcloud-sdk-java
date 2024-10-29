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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SCIMCredential extends AbstractModel {

    /**
    * 空间ID。z-前缀开头，后面是12位随机数字/小写字母
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * SCIM密钥状态，Enabled已开启，Disabled已关闭。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * SCIM密钥ID。scimcred-前缀开头，后面是12位随机数字/小写字母。
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

    /**
    * SCIM密钥类型。
    */
    @SerializedName("CredentialType")
    @Expose
    private String CredentialType;

    /**
    * SCIM 密钥的创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * SCIM 密钥的过期时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get 空间ID。z-前缀开头，后面是12位随机数字/小写字母 
     * @return ZoneId 空间ID。z-前缀开头，后面是12位随机数字/小写字母
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间ID。z-前缀开头，后面是12位随机数字/小写字母
     * @param ZoneId 空间ID。z-前缀开头，后面是12位随机数字/小写字母
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get SCIM密钥状态，Enabled已开启，Disabled已关闭。 
     * @return Status SCIM密钥状态，Enabled已开启，Disabled已关闭。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set SCIM密钥状态，Enabled已开启，Disabled已关闭。
     * @param Status SCIM密钥状态，Enabled已开启，Disabled已关闭。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get SCIM密钥ID。scimcred-前缀开头，后面是12位随机数字/小写字母。 
     * @return CredentialId SCIM密钥ID。scimcred-前缀开头，后面是12位随机数字/小写字母。
     */
    public String getCredentialId() {
        return this.CredentialId;
    }

    /**
     * Set SCIM密钥ID。scimcred-前缀开头，后面是12位随机数字/小写字母。
     * @param CredentialId SCIM密钥ID。scimcred-前缀开头，后面是12位随机数字/小写字母。
     */
    public void setCredentialId(String CredentialId) {
        this.CredentialId = CredentialId;
    }

    /**
     * Get SCIM密钥类型。 
     * @return CredentialType SCIM密钥类型。
     */
    public String getCredentialType() {
        return this.CredentialType;
    }

    /**
     * Set SCIM密钥类型。
     * @param CredentialType SCIM密钥类型。
     */
    public void setCredentialType(String CredentialType) {
        this.CredentialType = CredentialType;
    }

    /**
     * Get SCIM 密钥的创建时间。 
     * @return CreateTime SCIM 密钥的创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set SCIM 密钥的创建时间。
     * @param CreateTime SCIM 密钥的创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get SCIM 密钥的过期时间。 
     * @return ExpireTime SCIM 密钥的过期时间。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set SCIM 密钥的过期时间。
     * @param ExpireTime SCIM 密钥的过期时间。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public SCIMCredential() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SCIMCredential(SCIMCredential source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.CredentialType != null) {
            this.CredentialType = new String(source.CredentialType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamSimple(map, prefix + "CredentialType", this.CredentialType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

