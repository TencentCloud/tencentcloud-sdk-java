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

public class DescribeZoneDDoSPolicyResponse extends AbstractModel{

    /**
    * DDoS防护分区。
    */
    @SerializedName("ShieldAreas")
    @Expose
    private ShieldArea [] ShieldAreas;

    /**
    * 所有开启代理的子域名信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DDoSHosts")
    @Expose
    private DDoSHost [] DDoSHosts;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get DDoS防护分区。 
     * @return ShieldAreas DDoS防护分区。
     */
    public ShieldArea [] getShieldAreas() {
        return this.ShieldAreas;
    }

    /**
     * Set DDoS防护分区。
     * @param ShieldAreas DDoS防护分区。
     */
    public void setShieldAreas(ShieldArea [] ShieldAreas) {
        this.ShieldAreas = ShieldAreas;
    }

    /**
     * Get 所有开启代理的子域名信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DDoSHosts 所有开启代理的子域名信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSHost [] getDDoSHosts() {
        return this.DDoSHosts;
    }

    /**
     * Set 所有开启代理的子域名信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DDoSHosts 所有开启代理的子域名信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDDoSHosts(DDoSHost [] DDoSHosts) {
        this.DDoSHosts = DDoSHosts;
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

    public DescribeZoneDDoSPolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZoneDDoSPolicyResponse(DescribeZoneDDoSPolicyResponse source) {
        if (source.ShieldAreas != null) {
            this.ShieldAreas = new ShieldArea[source.ShieldAreas.length];
            for (int i = 0; i < source.ShieldAreas.length; i++) {
                this.ShieldAreas[i] = new ShieldArea(source.ShieldAreas[i]);
            }
        }
        if (source.DDoSHosts != null) {
            this.DDoSHosts = new DDoSHost[source.DDoSHosts.length];
            for (int i = 0; i < source.DDoSHosts.length; i++) {
                this.DDoSHosts[i] = new DDoSHost(source.DDoSHosts[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ShieldAreas.", this.ShieldAreas);
        this.setParamArrayObj(map, prefix + "DDoSHosts.", this.DDoSHosts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

