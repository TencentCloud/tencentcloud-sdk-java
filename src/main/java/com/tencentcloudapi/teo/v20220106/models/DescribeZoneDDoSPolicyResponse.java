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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZoneDDoSPolicyResponse extends AbstractModel{

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 防护分区
    */
    @SerializedName("ShieldAreas")
    @Expose
    private ShieldArea [] ShieldAreas;

    /**
    * 所有子域名信息，包含安全加速/内容加速
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domains")
    @Expose
    private DDoSApplication [] Domains;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 防护分区 
     * @return ShieldAreas 防护分区
     */
    public ShieldArea [] getShieldAreas() {
        return this.ShieldAreas;
    }

    /**
     * Set 防护分区
     * @param ShieldAreas 防护分区
     */
    public void setShieldAreas(ShieldArea [] ShieldAreas) {
        this.ShieldAreas = ShieldAreas;
    }

    /**
     * Get 所有子域名信息，包含安全加速/内容加速
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domains 所有子域名信息，包含安全加速/内容加速
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSApplication [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 所有子域名信息，包含安全加速/内容加速
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domains 所有子域名信息，包含安全加速/内容加速
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomains(DDoSApplication [] Domains) {
        this.Domains = Domains;
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
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ShieldAreas != null) {
            this.ShieldAreas = new ShieldArea[source.ShieldAreas.length];
            for (int i = 0; i < source.ShieldAreas.length; i++) {
                this.ShieldAreas[i] = new ShieldArea(source.ShieldAreas[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new DDoSApplication[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new DDoSApplication(source.Domains[i]);
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
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "ShieldAreas.", this.ShieldAreas);
        this.setParamArrayObj(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

