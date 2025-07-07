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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeerSet extends AbstractModel {

    /**
    * 节点名称
    */
    @SerializedName("PeerName")
    @Expose
    private String PeerName;

    /**
    * 组织名称
    */
    @SerializedName("OrgName")
    @Expose
    private String OrgName;

    /**
     * Get 节点名称 
     * @return PeerName 节点名称
     */
    public String getPeerName() {
        return this.PeerName;
    }

    /**
     * Set 节点名称
     * @param PeerName 节点名称
     */
    public void setPeerName(String PeerName) {
        this.PeerName = PeerName;
    }

    /**
     * Get 组织名称 
     * @return OrgName 组织名称
     */
    public String getOrgName() {
        return this.OrgName;
    }

    /**
     * Set 组织名称
     * @param OrgName 组织名称
     */
    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }

    public PeerSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeerSet(PeerSet source) {
        if (source.PeerName != null) {
            this.PeerName = new String(source.PeerName);
        }
        if (source.OrgName != null) {
            this.OrgName = new String(source.OrgName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeerName", this.PeerName);
        this.setParamSimple(map, prefix + "OrgName", this.OrgName);

    }
}

