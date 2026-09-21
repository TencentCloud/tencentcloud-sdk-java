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
    * <p>是否开启ssh</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>公钥信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * <p>端口号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>登录命令</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoginCommand")
    @Expose
    private String LoginCommand;

    /**
    * <p>登录地址是否改变</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAddressChanged")
    @Expose
    private Boolean IsAddressChanged;

    /**
    * <p>POD访问信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodSSHInfo")
    @Expose
    private PodSSHInfo PodSSHInfo;

    /**
     * Get <p>是否开启ssh</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable <p>是否开启ssh</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否开启ssh</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable <p>是否开启ssh</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>公钥信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicKey <p>公钥信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set <p>公钥信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicKey <p>公钥信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get <p>端口号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port <p>端口号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port <p>端口号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>登录命令</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoginCommand <p>登录命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoginCommand() {
        return this.LoginCommand;
    }

    /**
     * Set <p>登录命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoginCommand <p>登录命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoginCommand(String LoginCommand) {
        this.LoginCommand = LoginCommand;
    }

    /**
     * Get <p>登录地址是否改变</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAddressChanged <p>登录地址是否改变</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAddressChanged() {
        return this.IsAddressChanged;
    }

    /**
     * Set <p>登录地址是否改变</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAddressChanged <p>登录地址是否改变</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAddressChanged(Boolean IsAddressChanged) {
        this.IsAddressChanged = IsAddressChanged;
    }

    /**
     * Get <p>POD访问信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodSSHInfo <p>POD访问信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PodSSHInfo getPodSSHInfo() {
        return this.PodSSHInfo;
    }

    /**
     * Set <p>POD访问信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodSSHInfo <p>POD访问信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodSSHInfo(PodSSHInfo PodSSHInfo) {
        this.PodSSHInfo = PodSSHInfo;
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
        if (source.PodSSHInfo != null) {
            this.PodSSHInfo = new PodSSHInfo(source.PodSSHInfo);
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
        this.setParamObj(map, prefix + "PodSSHInfo.", this.PodSSHInfo);

    }
}

