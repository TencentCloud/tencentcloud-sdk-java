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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BgpConfig extends AbstractModel {

    /**
    * BGP隧道网段。
    */
    @SerializedName("TunnelCidr")
    @Expose
    private String TunnelCidr;

    /**
    * 云端BGP地址。必须从BGP隧道网段内分配。
    */
    @SerializedName("LocalBgpIp")
    @Expose
    private String LocalBgpIp;

    /**
    * 用户端BGP地址。必须从BGP隧道网段内分配。
    */
    @SerializedName("RemoteBgpIp")
    @Expose
    private String RemoteBgpIp;

    /**
     * Get BGP隧道网段。 
     * @return TunnelCidr BGP隧道网段。
     */
    public String getTunnelCidr() {
        return this.TunnelCidr;
    }

    /**
     * Set BGP隧道网段。
     * @param TunnelCidr BGP隧道网段。
     */
    public void setTunnelCidr(String TunnelCidr) {
        this.TunnelCidr = TunnelCidr;
    }

    /**
     * Get 云端BGP地址。必须从BGP隧道网段内分配。 
     * @return LocalBgpIp 云端BGP地址。必须从BGP隧道网段内分配。
     */
    public String getLocalBgpIp() {
        return this.LocalBgpIp;
    }

    /**
     * Set 云端BGP地址。必须从BGP隧道网段内分配。
     * @param LocalBgpIp 云端BGP地址。必须从BGP隧道网段内分配。
     */
    public void setLocalBgpIp(String LocalBgpIp) {
        this.LocalBgpIp = LocalBgpIp;
    }

    /**
     * Get 用户端BGP地址。必须从BGP隧道网段内分配。 
     * @return RemoteBgpIp 用户端BGP地址。必须从BGP隧道网段内分配。
     */
    public String getRemoteBgpIp() {
        return this.RemoteBgpIp;
    }

    /**
     * Set 用户端BGP地址。必须从BGP隧道网段内分配。
     * @param RemoteBgpIp 用户端BGP地址。必须从BGP隧道网段内分配。
     */
    public void setRemoteBgpIp(String RemoteBgpIp) {
        this.RemoteBgpIp = RemoteBgpIp;
    }

    public BgpConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BgpConfig(BgpConfig source) {
        if (source.TunnelCidr != null) {
            this.TunnelCidr = new String(source.TunnelCidr);
        }
        if (source.LocalBgpIp != null) {
            this.LocalBgpIp = new String(source.LocalBgpIp);
        }
        if (source.RemoteBgpIp != null) {
            this.RemoteBgpIp = new String(source.RemoteBgpIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TunnelCidr", this.TunnelCidr);
        this.setParamSimple(map, prefix + "LocalBgpIp", this.LocalBgpIp);
        this.setParamSimple(map, prefix + "RemoteBgpIp", this.RemoteBgpIp);

    }
}

