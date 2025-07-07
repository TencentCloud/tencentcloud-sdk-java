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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SSHConfig extends AbstractModel {

    /**
    * 是否开启ssh
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 公钥信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * 端口号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 登录命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoginCommand")
    @Expose
    private String LoginCommand;

    /**
    * 登录地址是否改变
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAddressChanged")
    @Expose
    private Boolean IsAddressChanged;

    /**
     * Get 是否开启ssh
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 是否开启ssh
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启ssh
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 是否开启ssh
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 公钥信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicKey 公钥信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 公钥信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicKey 公钥信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get 端口号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 登录命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoginCommand 登录命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoginCommand() {
        return this.LoginCommand;
    }

    /**
     * Set 登录命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoginCommand 登录命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoginCommand(String LoginCommand) {
        this.LoginCommand = LoginCommand;
    }

    /**
     * Get 登录地址是否改变
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAddressChanged 登录地址是否改变
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAddressChanged() {
        return this.IsAddressChanged;
    }

    /**
     * Set 登录地址是否改变
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAddressChanged 登录地址是否改变
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAddressChanged(Boolean IsAddressChanged) {
        this.IsAddressChanged = IsAddressChanged;
    }

    public SSHConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SSHConfig(SSHConfig source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.LoginCommand != null) {
            this.LoginCommand = new String(source.LoginCommand);
        }
        if (source.IsAddressChanged != null) {
            this.IsAddressChanged = new Boolean(source.IsAddressChanged);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "LoginCommand", this.LoginCommand);
        this.setParamSimple(map, prefix + "IsAddressChanged", this.IsAddressChanged);

    }
}

