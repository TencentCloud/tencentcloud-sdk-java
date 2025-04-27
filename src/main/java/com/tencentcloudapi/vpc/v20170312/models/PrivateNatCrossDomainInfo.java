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

public class PrivateNatCrossDomainInfo extends AbstractModel {

    /**
    * 跨域私网NAT关联的云联网ID
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 跨域私网NAT本端Vpc
    */
    @SerializedName("LocalVpcId")
    @Expose
    private String LocalVpcId;

    /**
    * 跨域私网NAT对端Vpc
    */
    @SerializedName("PeerVpcId")
    @Expose
    private String PeerVpcId;

    /**
     * Get 跨域私网NAT关联的云联网ID 
     * @return CcnId 跨域私网NAT关联的云联网ID
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 跨域私网NAT关联的云联网ID
     * @param CcnId 跨域私网NAT关联的云联网ID
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 跨域私网NAT本端Vpc 
     * @return LocalVpcId 跨域私网NAT本端Vpc
     */
    public String getLocalVpcId() {
        return this.LocalVpcId;
    }

    /**
     * Set 跨域私网NAT本端Vpc
     * @param LocalVpcId 跨域私网NAT本端Vpc
     */
    public void setLocalVpcId(String LocalVpcId) {
        this.LocalVpcId = LocalVpcId;
    }

    /**
     * Get 跨域私网NAT对端Vpc 
     * @return PeerVpcId 跨域私网NAT对端Vpc
     */
    public String getPeerVpcId() {
        return this.PeerVpcId;
    }

    /**
     * Set 跨域私网NAT对端Vpc
     * @param PeerVpcId 跨域私网NAT对端Vpc
     */
    public void setPeerVpcId(String PeerVpcId) {
        this.PeerVpcId = PeerVpcId;
    }

    public PrivateNatCrossDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateNatCrossDomainInfo(PrivateNatCrossDomainInfo source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.LocalVpcId != null) {
            this.LocalVpcId = new String(source.LocalVpcId);
        }
        if (source.PeerVpcId != null) {
            this.PeerVpcId = new String(source.PeerVpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "LocalVpcId", this.LocalVpcId);
        this.setParamSimple(map, prefix + "PeerVpcId", this.PeerVpcId);

    }
}

