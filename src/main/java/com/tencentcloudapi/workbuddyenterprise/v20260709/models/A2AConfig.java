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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class A2AConfig extends AbstractModel {

    /**
    * Agent 级唯一 A2A 开关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("A2AEnabled")
    @Expose
    private Boolean A2AEnabled;

    /**
    * 对外 A2A handle（已注册时；仅 DescribeAgent / ModifyAgentA2AConfig 填充）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("A2APublicRef")
    @Expose
    private String A2APublicRef;

    /**
    * 对外 A2A card 发现地址（已注册时）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("A2AEndpoint")
    @Expose
    private String A2AEndpoint;

    /**
    * 注册状态：DRAFT / REGISTERED / DISABLED / NONE / UNKNOWN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("A2AStatus")
    @Expose
    private String A2AStatus;

    /**
     * Get Agent 级唯一 A2A 开关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return A2AEnabled Agent 级唯一 A2A 开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getA2AEnabled() {
        return this.A2AEnabled;
    }

    /**
     * Set Agent 级唯一 A2A 开关
注意：此字段可能返回 null，表示取不到有效值。
     * @param A2AEnabled Agent 级唯一 A2A 开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setA2AEnabled(Boolean A2AEnabled) {
        this.A2AEnabled = A2AEnabled;
    }

    /**
     * Get 对外 A2A handle（已注册时；仅 DescribeAgent / ModifyAgentA2AConfig 填充）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return A2APublicRef 对外 A2A handle（已注册时；仅 DescribeAgent / ModifyAgentA2AConfig 填充）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getA2APublicRef() {
        return this.A2APublicRef;
    }

    /**
     * Set 对外 A2A handle（已注册时；仅 DescribeAgent / ModifyAgentA2AConfig 填充）
注意：此字段可能返回 null，表示取不到有效值。
     * @param A2APublicRef 对外 A2A handle（已注册时；仅 DescribeAgent / ModifyAgentA2AConfig 填充）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setA2APublicRef(String A2APublicRef) {
        this.A2APublicRef = A2APublicRef;
    }

    /**
     * Get 对外 A2A card 发现地址（已注册时）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return A2AEndpoint 对外 A2A card 发现地址（已注册时）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getA2AEndpoint() {
        return this.A2AEndpoint;
    }

    /**
     * Set 对外 A2A card 发现地址（已注册时）
注意：此字段可能返回 null，表示取不到有效值。
     * @param A2AEndpoint 对外 A2A card 发现地址（已注册时）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setA2AEndpoint(String A2AEndpoint) {
        this.A2AEndpoint = A2AEndpoint;
    }

    /**
     * Get 注册状态：DRAFT / REGISTERED / DISABLED / NONE / UNKNOWN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return A2AStatus 注册状态：DRAFT / REGISTERED / DISABLED / NONE / UNKNOWN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getA2AStatus() {
        return this.A2AStatus;
    }

    /**
     * Set 注册状态：DRAFT / REGISTERED / DISABLED / NONE / UNKNOWN
注意：此字段可能返回 null，表示取不到有效值。
     * @param A2AStatus 注册状态：DRAFT / REGISTERED / DISABLED / NONE / UNKNOWN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setA2AStatus(String A2AStatus) {
        this.A2AStatus = A2AStatus;
    }

    public A2AConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public A2AConfig(A2AConfig source) {
        if (source.A2AEnabled != null) {
            this.A2AEnabled = new Boolean(source.A2AEnabled);
        }
        if (source.A2APublicRef != null) {
            this.A2APublicRef = new String(source.A2APublicRef);
        }
        if (source.A2AEndpoint != null) {
            this.A2AEndpoint = new String(source.A2AEndpoint);
        }
        if (source.A2AStatus != null) {
            this.A2AStatus = new String(source.A2AStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "A2AEnabled", this.A2AEnabled);
        this.setParamSimple(map, prefix + "A2APublicRef", this.A2APublicRef);
        this.setParamSimple(map, prefix + "A2AEndpoint", this.A2AEndpoint);
        this.setParamSimple(map, prefix + "A2AStatus", this.A2AStatus);

    }
}

