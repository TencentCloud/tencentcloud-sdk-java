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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyServiceAccountPasswordRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 服务级账号名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否随机生成密码
    */
    @SerializedName("Random")
    @Expose
    private Boolean Random;

    /**
    * 服务级账号密码，长度在8到20之间且需包含至少一个大写字符，一个小写字符和一个数字
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 实例Id 
     * @return RegistryId 实例Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例Id
     * @param RegistryId 实例Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 服务级账号名 
     * @return Name 服务级账号名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务级账号名
     * @param Name 服务级账号名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否随机生成密码 
     * @return Random 是否随机生成密码
     */
    public Boolean getRandom() {
        return this.Random;
    }

    /**
     * Set 是否随机生成密码
     * @param Random 是否随机生成密码
     */
    public void setRandom(Boolean Random) {
        this.Random = Random;
    }

    /**
     * Get 服务级账号密码，长度在8到20之间且需包含至少一个大写字符，一个小写字符和一个数字 
     * @return Password 服务级账号密码，长度在8到20之间且需包含至少一个大写字符，一个小写字符和一个数字
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 服务级账号密码，长度在8到20之间且需包含至少一个大写字符，一个小写字符和一个数字
     * @param Password 服务级账号密码，长度在8到20之间且需包含至少一个大写字符，一个小写字符和一个数字
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ModifyServiceAccountPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyServiceAccountPasswordRequest(ModifyServiceAccountPasswordRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Random != null) {
            this.Random = new Boolean(source.Random);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Random", this.Random);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

