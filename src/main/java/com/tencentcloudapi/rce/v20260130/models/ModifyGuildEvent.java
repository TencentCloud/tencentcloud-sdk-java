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

public class ModifyGuildEvent extends AbstractModel {

    /**
    * <p>修改后的公会名，允许空串</p>
    */
    @SerializedName("GuildNameAfter")
    @Expose
    private String GuildNameAfter;

    /**
    * <p>修改后的公会签名，允许空串</p>
    */
    @SerializedName("GuildSignatureAfter")
    @Expose
    private String GuildSignatureAfter;

    /**
    * <p>所属服务器ID，允许空串</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
    * <p>编辑者账号信息</p>
    */
    @SerializedName("UserInfo")
    @Expose
    private User UserInfo;

    /**
    * <p>公会信息</p>
    */
    @SerializedName("Guild")
    @Expose
    private Guild Guild;

    /**
     * Get <p>修改后的公会名，允许空串</p> 
     * @return GuildNameAfter <p>修改后的公会名，允许空串</p>
     */
    public String getGuildNameAfter() {
        return this.GuildNameAfter;
    }

    /**
     * Set <p>修改后的公会名，允许空串</p>
     * @param GuildNameAfter <p>修改后的公会名，允许空串</p>
     */
    public void setGuildNameAfter(String GuildNameAfter) {
        this.GuildNameAfter = GuildNameAfter;
    }

    /**
     * Get <p>修改后的公会签名，允许空串</p> 
     * @return GuildSignatureAfter <p>修改后的公会签名，允许空串</p>
     */
    public String getGuildSignatureAfter() {
        return this.GuildSignatureAfter;
    }

    /**
     * Set <p>修改后的公会签名，允许空串</p>
     * @param GuildSignatureAfter <p>修改后的公会签名，允许空串</p>
     */
    public void setGuildSignatureAfter(String GuildSignatureAfter) {
        this.GuildSignatureAfter = GuildSignatureAfter;
    }

    /**
     * Get <p>所属服务器ID，允许空串</p> 
     * @return ServerId <p>所属服务器ID，允许空串</p>
     */
    public String getServerId() {
        return this.ServerId;
    }

    /**
     * Set <p>所属服务器ID，允许空串</p>
     * @param ServerId <p>所属服务器ID，允许空串</p>
     */
    public void setServerId(String ServerId) {
        this.ServerId = ServerId;
    }

    /**
     * Get <p>编辑者账号信息</p> 
     * @return UserInfo <p>编辑者账号信息</p>
     */
    public User getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set <p>编辑者账号信息</p>
     * @param UserInfo <p>编辑者账号信息</p>
     */
    public void setUserInfo(User UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get <p>公会信息</p> 
     * @return Guild <p>公会信息</p>
     */
    public Guild getGuild() {
        return this.Guild;
    }

    /**
     * Set <p>公会信息</p>
     * @param Guild <p>公会信息</p>
     */
    public void setGuild(Guild Guild) {
        this.Guild = Guild;
    }

    public ModifyGuildEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGuildEvent(ModifyGuildEvent source) {
        if (source.GuildNameAfter != null) {
            this.GuildNameAfter = new String(source.GuildNameAfter);
        }
        if (source.GuildSignatureAfter != null) {
            this.GuildSignatureAfter = new String(source.GuildSignatureAfter);
        }
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new User(source.UserInfo);
        }
        if (source.Guild != null) {
            this.Guild = new Guild(source.Guild);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GuildNameAfter", this.GuildNameAfter);
        this.setParamSimple(map, prefix + "GuildSignatureAfter", this.GuildSignatureAfter);
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamObj(map, prefix + "Guild.", this.Guild);

    }
}

