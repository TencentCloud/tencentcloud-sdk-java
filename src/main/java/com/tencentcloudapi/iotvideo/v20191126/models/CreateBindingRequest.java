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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBindingRequest extends AbstractModel{

    /**
    * 终端用户在IoT Video上的唯一标识ID
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 用户角色，owner：主人，guest：访客
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 是否踢掉之前的主人，true：踢掉；false：不踢掉。当role为guest时，可以不填
    */
    @SerializedName("ForceBind")
    @Expose
    private Boolean ForceBind;

    /**
    * 设备昵称，最多不超过64个字符
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 绑定过程中的会话token，由设备通过SDK接口确认是否允许绑定的token，用于增加设备被绑定的安全性
    */
    @SerializedName("BindToken")
    @Expose
    private String BindToken;

    /**
     * Get 终端用户在IoT Video上的唯一标识ID 
     * @return AccessId 终端用户在IoT Video上的唯一标识ID
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set 终端用户在IoT Video上的唯一标识ID
     * @param AccessId 终端用户在IoT Video上的唯一标识ID
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get 设备TID 
     * @return Tid 设备TID
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备TID
     * @param Tid 设备TID
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 用户角色，owner：主人，guest：访客 
     * @return Role 用户角色，owner：主人，guest：访客
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 用户角色，owner：主人，guest：访客
     * @param Role 用户角色，owner：主人，guest：访客
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 是否踢掉之前的主人，true：踢掉；false：不踢掉。当role为guest时，可以不填 
     * @return ForceBind 是否踢掉之前的主人，true：踢掉；false：不踢掉。当role为guest时，可以不填
     */
    public Boolean getForceBind() {
        return this.ForceBind;
    }

    /**
     * Set 是否踢掉之前的主人，true：踢掉；false：不踢掉。当role为guest时，可以不填
     * @param ForceBind 是否踢掉之前的主人，true：踢掉；false：不踢掉。当role为guest时，可以不填
     */
    public void setForceBind(Boolean ForceBind) {
        this.ForceBind = ForceBind;
    }

    /**
     * Get 设备昵称，最多不超过64个字符 
     * @return Nick 设备昵称，最多不超过64个字符
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 设备昵称，最多不超过64个字符
     * @param Nick 设备昵称，最多不超过64个字符
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get 绑定过程中的会话token，由设备通过SDK接口确认是否允许绑定的token，用于增加设备被绑定的安全性 
     * @return BindToken 绑定过程中的会话token，由设备通过SDK接口确认是否允许绑定的token，用于增加设备被绑定的安全性
     */
    public String getBindToken() {
        return this.BindToken;
    }

    /**
     * Set 绑定过程中的会话token，由设备通过SDK接口确认是否允许绑定的token，用于增加设备被绑定的安全性
     * @param BindToken 绑定过程中的会话token，由设备通过SDK接口确认是否允许绑定的token，用于增加设备被绑定的安全性
     */
    public void setBindToken(String BindToken) {
        this.BindToken = BindToken;
    }

    public CreateBindingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBindingRequest(CreateBindingRequest source) {
        if (source.AccessId != null) {
            this.AccessId = new String(source.AccessId);
        }
        if (source.Tid != null) {
            this.Tid = new String(source.Tid);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.ForceBind != null) {
            this.ForceBind = new Boolean(source.ForceBind);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.BindToken != null) {
            this.BindToken = new String(source.BindToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "ForceBind", this.ForceBind);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "BindToken", this.BindToken);

    }
}

