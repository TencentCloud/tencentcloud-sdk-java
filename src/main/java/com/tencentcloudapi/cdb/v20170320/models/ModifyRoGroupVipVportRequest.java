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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoGroupVipVportRequest extends AbstractModel {

    /**
    * RO组的ID。
    */
    @SerializedName("UGroupId")
    @Expose
    private String UGroupId;

    /**
    * 目标IP。
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 目标Port。
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
     * Get RO组的ID。 
     * @return UGroupId RO组的ID。
     */
    public String getUGroupId() {
        return this.UGroupId;
    }

    /**
     * Set RO组的ID。
     * @param UGroupId RO组的ID。
     */
    public void setUGroupId(String UGroupId) {
        this.UGroupId = UGroupId;
    }

    /**
     * Get 目标IP。 
     * @return DstIp 目标IP。
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 目标IP。
     * @param DstIp 目标IP。
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get 目标Port。 
     * @return DstPort 目标Port。
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 目标Port。
     * @param DstPort 目标Port。
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    public ModifyRoGroupVipVportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoGroupVipVportRequest(ModifyRoGroupVipVportRequest source) {
        if (source.UGroupId != null) {
            this.UGroupId = new String(source.UGroupId);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UGroupId", this.UGroupId);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);

    }
}

