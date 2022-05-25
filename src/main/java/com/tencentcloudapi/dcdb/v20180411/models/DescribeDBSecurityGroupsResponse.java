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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSecurityGroupsResponse extends AbstractModel{

    /**
    * 安全组详情。
    */
    @SerializedName("Groups")
    @Expose
    private SecurityGroup [] Groups;

    /**
    * 实例VIP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VIP")
    @Expose
    private String VIP;

    /**
    * 实例端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VPort")
    @Expose
    private String VPort;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 安全组详情。 
     * @return Groups 安全组详情。
     */
    public SecurityGroup [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 安全组详情。
     * @param Groups 安全组详情。
     */
    public void setGroups(SecurityGroup [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get 实例VIP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VIP 实例VIP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVIP() {
        return this.VIP;
    }

    /**
     * Set 实例VIP
注意：此字段可能返回 null，表示取不到有效值。
     * @param VIP 实例VIP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVIP(String VIP) {
        this.VIP = VIP;
    }

    /**
     * Get 实例端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VPort 实例端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVPort() {
        return this.VPort;
    }

    /**
     * Set 实例端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param VPort 实例端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVPort(String VPort) {
        this.VPort = VPort;
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

    public DescribeDBSecurityGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSecurityGroupsResponse(DescribeDBSecurityGroupsResponse source) {
        if (source.Groups != null) {
            this.Groups = new SecurityGroup[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new SecurityGroup(source.Groups[i]);
            }
        }
        if (source.VIP != null) {
            this.VIP = new String(source.VIP);
        }
        if (source.VPort != null) {
            this.VPort = new String(source.VPort);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "VIP", this.VIP);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

