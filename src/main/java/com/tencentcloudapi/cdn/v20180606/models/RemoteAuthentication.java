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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoteAuthentication extends AbstractModel{

    /**
    * 远程鉴权开关；
on : 开启;
off: 关闭；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 远程鉴权规则配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteAuthenticationRules")
    @Expose
    private RemoteAuthenticationRule [] RemoteAuthenticationRules;

    /**
    * 远程鉴权Server
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
     * Get 远程鉴权开关；
on : 开启;
off: 关闭；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 远程鉴权开关；
on : 开启;
off: 关闭；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 远程鉴权开关；
on : 开启;
off: 关闭；
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 远程鉴权开关；
on : 开启;
off: 关闭；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 远程鉴权规则配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteAuthenticationRules 远程鉴权规则配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RemoteAuthenticationRule [] getRemoteAuthenticationRules() {
        return this.RemoteAuthenticationRules;
    }

    /**
     * Set 远程鉴权规则配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteAuthenticationRules 远程鉴权规则配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteAuthenticationRules(RemoteAuthenticationRule [] RemoteAuthenticationRules) {
        this.RemoteAuthenticationRules = RemoteAuthenticationRules;
    }

    /**
     * Get 远程鉴权Server
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Server 远程鉴权Server
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set 远程鉴权Server
注意：此字段可能返回 null，表示取不到有效值。
     * @param Server 远程鉴权Server
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    public RemoteAuthentication() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoteAuthentication(RemoteAuthentication source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.RemoteAuthenticationRules != null) {
            this.RemoteAuthenticationRules = new RemoteAuthenticationRule[source.RemoteAuthenticationRules.length];
            for (int i = 0; i < source.RemoteAuthenticationRules.length; i++) {
                this.RemoteAuthenticationRules[i] = new RemoteAuthenticationRule(source.RemoteAuthenticationRules[i]);
            }
        }
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "RemoteAuthenticationRules.", this.RemoteAuthenticationRules);
        this.setParamSimple(map, prefix + "Server", this.Server);

    }
}

