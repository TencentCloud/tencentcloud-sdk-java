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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DockerConfig extends AbstractModel{

    /**
    * 镜像仓库地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryDomain")
    @Expose
    private String RegistryDomain;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 镜像仓库地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryDomain 镜像仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryDomain() {
        return this.RegistryDomain;
    }

    /**
     * Set 镜像仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryDomain 镜像仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryDomain(String RegistryDomain) {
        this.RegistryDomain = RegistryDomain;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 密码 
     * @return Password 密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码
     * @param Password 密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public DockerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DockerConfig(DockerConfig source) {
        if (source.RegistryDomain != null) {
            this.RegistryDomain = new String(source.RegistryDomain);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryDomain", this.RegistryDomain);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

