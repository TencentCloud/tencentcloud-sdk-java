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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BgpConfigAndAsn extends AbstractModel {

    /**
    * BGP通道CIDR
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TunnelCidr")
    @Expose
    private String TunnelCidr;

    /**
    * 本端BGP IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalBgpIp")
    @Expose
    private String LocalBgpIp;

    /**
    * 对端BGP IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteBgpIp")
    @Expose
    private String RemoteBgpIp;

    /**
    * 本端BGP ASN号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalBgpAsn")
    @Expose
    private String LocalBgpAsn;

    /**
    * 对端BGP ASN号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteBgpAsn")
    @Expose
    private String RemoteBgpAsn;

    /**
     * Get BGP通道CIDR
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TunnelCidr BGP通道CIDR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTunnelCidr() {
        return this.TunnelCidr;
    }

    /**
     * Set BGP通道CIDR
注意：此字段可能返回 null，表示取不到有效值。
     * @param TunnelCidr BGP通道CIDR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTunnelCidr(String TunnelCidr) {
        this.TunnelCidr = TunnelCidr;
    }

    /**
     * Get 本端BGP IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalBgpIp 本端BGP IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocalBgpIp() {
        return this.LocalBgpIp;
    }

    /**
     * Set 本端BGP IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalBgpIp 本端BGP IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalBgpIp(String LocalBgpIp) {
        this.LocalBgpIp = LocalBgpIp;
    }

    /**
     * Get 对端BGP IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteBgpIp 对端BGP IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemoteBgpIp() {
        return this.RemoteBgpIp;
    }

    /**
     * Set 对端BGP IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteBgpIp 对端BGP IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteBgpIp(String RemoteBgpIp) {
        this.RemoteBgpIp = RemoteBgpIp;
    }

    /**
     * Get 本端BGP ASN号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalBgpAsn 本端BGP ASN号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocalBgpAsn() {
        return this.LocalBgpAsn;
    }

    /**
     * Set 本端BGP ASN号
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalBgpAsn 本端BGP ASN号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalBgpAsn(String LocalBgpAsn) {
        this.LocalBgpAsn = LocalBgpAsn;
    }

    /**
     * Get 对端BGP ASN号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteBgpAsn 对端BGP ASN号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemoteBgpAsn() {
        return this.RemoteBgpAsn;
    }

    /**
     * Set 对端BGP ASN号
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteBgpAsn 对端BGP ASN号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteBgpAsn(String RemoteBgpAsn) {
        this.RemoteBgpAsn = RemoteBgpAsn;
    }

    public BgpConfigAndAsn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BgpConfigAndAsn(BgpConfigAndAsn source) {
        if (source.TunnelCidr != null) {
            this.TunnelCidr = new String(source.TunnelCidr);
        }
        if (source.LocalBgpIp != null) {
            this.LocalBgpIp = new String(source.LocalBgpIp);
        }
        if (source.RemoteBgpIp != null) {
            this.RemoteBgpIp = new String(source.RemoteBgpIp);
        }
        if (source.LocalBgpAsn != null) {
            this.LocalBgpAsn = new String(source.LocalBgpAsn);
        }
        if (source.RemoteBgpAsn != null) {
            this.RemoteBgpAsn = new String(source.RemoteBgpAsn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TunnelCidr", this.TunnelCidr);
        this.setParamSimple(map, prefix + "LocalBgpIp", this.LocalBgpIp);
        this.setParamSimple(map, prefix + "RemoteBgpIp", this.RemoteBgpIp);
        this.setParamSimple(map, prefix + "LocalBgpAsn", this.LocalBgpAsn);
        this.setParamSimple(map, prefix + "RemoteBgpAsn", this.RemoteBgpAsn);

    }
}

