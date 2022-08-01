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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostAlias extends AbstractModel{

    /**
    * 需绑定的域名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostNames")
    @Expose
    private String [] HostNames;

    /**
    * 需绑定的 IP 地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
     * Get 需绑定的域名列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostNames 需绑定的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHostNames() {
        return this.HostNames;
    }

    /**
     * Set 需绑定的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostNames 需绑定的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostNames(String [] HostNames) {
        this.HostNames = HostNames;
    }

    /**
     * Get 需绑定的 IP 地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IP 需绑定的 IP 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 需绑定的 IP 地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param IP 需绑定的 IP 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    public HostAlias() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostAlias(HostAlias source) {
        if (source.HostNames != null) {
            this.HostNames = new String[source.HostNames.length];
            for (int i = 0; i < source.HostNames.length; i++) {
                this.HostNames[i] = new String(source.HostNames[i]);
            }
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HostNames.", this.HostNames);
        this.setParamSimple(map, prefix + "IP", this.IP);

    }
}

