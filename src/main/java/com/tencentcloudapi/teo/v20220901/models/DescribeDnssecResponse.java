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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDnssecResponse extends AbstractModel{

    /**
    * DNSSEC状态信息，取值有：
<li>enabled：开启；</li>
<li>disabled：关闭。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * DNSSEC相关信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DnssecInfo")
    @Expose
    private DnssecInfo DnssecInfo;

    /**
    * 站点信息更新时间。
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get DNSSEC状态信息，取值有：
<li>enabled：开启；</li>
<li>disabled：关闭。</li> 
     * @return Status DNSSEC状态信息，取值有：
<li>enabled：开启；</li>
<li>disabled：关闭。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set DNSSEC状态信息，取值有：
<li>enabled：开启；</li>
<li>disabled：关闭。</li>
     * @param Status DNSSEC状态信息，取值有：
<li>enabled：开启；</li>
<li>disabled：关闭。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get DNSSEC相关信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DnssecInfo DNSSEC相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DnssecInfo getDnssecInfo() {
        return this.DnssecInfo;
    }

    /**
     * Set DNSSEC相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DnssecInfo DNSSEC相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDnssecInfo(DnssecInfo DnssecInfo) {
        this.DnssecInfo = DnssecInfo;
    }

    /**
     * Get 站点信息更新时间。 
     * @return ModifiedOn 站点信息更新时间。
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set 站点信息更新时间。
     * @param ModifiedOn 站点信息更新时间。
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDnssecResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDnssecResponse(DescribeDnssecResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DnssecInfo != null) {
            this.DnssecInfo = new DnssecInfo(source.DnssecInfo);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "DnssecInfo.", this.DnssecInfo);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

