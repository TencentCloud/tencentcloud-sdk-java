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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateSCIMCredentialStatusRequest extends AbstractModel {

    /**
    * 空间ID。z-前缀开头，后面是12位随机数字/小写字母
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * SCIM密钥ID。scimcred-前缀开头，后面是12位随机数字/小写字母。
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

    /**
    * SCIM密钥状态。Enabled：启用。 Disabled：禁用。
    */
    @SerializedName("NewStatus")
    @Expose
    private String NewStatus;

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
     * Get SCIM密钥状态。Enabled：启用。 Disabled：禁用。 
     * @return NewStatus SCIM密钥状态。Enabled：启用。 Disabled：禁用。
     */
    public String getNewStatus() {
        return this.NewStatus;
    }

    /**
     * Set SCIM密钥状态。Enabled：启用。 Disabled：禁用。
     * @param NewStatus SCIM密钥状态。Enabled：启用。 Disabled：禁用。
     */
    public void setNewStatus(String NewStatus) {
        this.NewStatus = NewStatus;
    }

    public UpdateSCIMCredentialStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSCIMCredentialStatusRequest(UpdateSCIMCredentialStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.NewStatus != null) {
            this.NewStatus = new String(source.NewStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamSimple(map, prefix + "NewStatus", this.NewStatus);

    }
}

