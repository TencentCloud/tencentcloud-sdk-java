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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Guild extends AbstractModel {

    /**
    * <p>公会唯一ID</p>
    */
    @SerializedName("GuildId")
    @Expose
    private String GuildId;

    /**
    * <p>公会名称，允许空串</p>
    */
    @SerializedName("GuildName")
    @Expose
    private String GuildName;

    /**
    * <p>公会签名，允许空串</p>
    */
    @SerializedName("GuildSignature")
    @Expose
    private String GuildSignature;

    /**
    * <p>公会会长账号ID</p>
    */
    @SerializedName("PresidentUserId")
    @Expose
    private String PresidentUserId;

    /**
    * <p>公会会长角色ID</p>
    */
    @SerializedName("PresidentRoleId")
    @Expose
    private String PresidentRoleId;

    /**
     * Get <p>公会唯一ID</p> 
     * @return GuildId <p>公会唯一ID</p>
     */
    public String getGuildId() {
        return this.GuildId;
    }

    /**
     * Set <p>公会唯一ID</p>
     * @param GuildId <p>公会唯一ID</p>
     */
    public void setGuildId(String GuildId) {
        this.GuildId = GuildId;
    }

    /**
     * Get <p>公会名称，允许空串</p> 
     * @return GuildName <p>公会名称，允许空串</p>
     */
    public String getGuildName() {
        return this.GuildName;
    }

    /**
     * Set <p>公会名称，允许空串</p>
     * @param GuildName <p>公会名称，允许空串</p>
     */
    public void setGuildName(String GuildName) {
        this.GuildName = GuildName;
    }

    /**
     * Get <p>公会签名，允许空串</p> 
     * @return GuildSignature <p>公会签名，允许空串</p>
     */
    public String getGuildSignature() {
        return this.GuildSignature;
    }

    /**
     * Set <p>公会签名，允许空串</p>
     * @param GuildSignature <p>公会签名，允许空串</p>
     */
    public void setGuildSignature(String GuildSignature) {
        this.GuildSignature = GuildSignature;
    }

    /**
     * Get <p>公会会长账号ID</p> 
     * @return PresidentUserId <p>公会会长账号ID</p>
     */
    public String getPresidentUserId() {
        return this.PresidentUserId;
    }

    /**
     * Set <p>公会会长账号ID</p>
     * @param PresidentUserId <p>公会会长账号ID</p>
     */
    public void setPresidentUserId(String PresidentUserId) {
        this.PresidentUserId = PresidentUserId;
    }

    /**
     * Get <p>公会会长角色ID</p> 
     * @return PresidentRoleId <p>公会会长角色ID</p>
     */
    public String getPresidentRoleId() {
        return this.PresidentRoleId;
    }

    /**
     * Set <p>公会会长角色ID</p>
     * @param PresidentRoleId <p>公会会长角色ID</p>
     */
    public void setPresidentRoleId(String PresidentRoleId) {
        this.PresidentRoleId = PresidentRoleId;
    }

    public Guild() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Guild(Guild source) {
        if (source.GuildId != null) {
            this.GuildId = new String(source.GuildId);
        }
        if (source.GuildName != null) {
            this.GuildName = new String(source.GuildName);
        }
        if (source.GuildSignature != null) {
            this.GuildSignature = new String(source.GuildSignature);
        }
        if (source.PresidentUserId != null) {
            this.PresidentUserId = new String(source.PresidentUserId);
        }
        if (source.PresidentRoleId != null) {
            this.PresidentRoleId = new String(source.PresidentRoleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GuildId", this.GuildId);
        this.setParamSimple(map, prefix + "GuildName", this.GuildName);
        this.setParamSimple(map, prefix + "GuildSignature", this.GuildSignature);
        this.setParamSimple(map, prefix + "PresidentUserId", this.PresidentUserId);
        this.setParamSimple(map, prefix + "PresidentRoleId", this.PresidentRoleId);

    }
}

