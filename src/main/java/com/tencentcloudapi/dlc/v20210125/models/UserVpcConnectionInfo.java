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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserVpcConnectionInfo extends AbstractModel {

    /**
    * 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineNetworkId")
    @Expose
    private String EngineNetworkId;

    /**
    * 用户vpcid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserVpcId")
    @Expose
    private String UserVpcId;

    /**
    * 用户终端节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserVpcEndpointId")
    @Expose
    private String UserVpcEndpointId;

    /**
    * 用户终端节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserVpcEndpointName")
    @Expose
    private String UserVpcEndpointName;

    /**
    * 接入点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessConnectionInfos")
    @Expose
    private String [] AccessConnectionInfos;

    /**
     * Get 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineNetworkId 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineNetworkId() {
        return this.EngineNetworkId;
    }

    /**
     * Set 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineNetworkId 引擎网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineNetworkId(String EngineNetworkId) {
        this.EngineNetworkId = EngineNetworkId;
    }

    /**
     * Get 用户vpcid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserVpcId 用户vpcid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserVpcId() {
        return this.UserVpcId;
    }

    /**
     * Set 用户vpcid
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserVpcId 用户vpcid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserVpcId(String UserVpcId) {
        this.UserVpcId = UserVpcId;
    }

    /**
     * Get 用户终端节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserVpcEndpointId 用户终端节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserVpcEndpointId() {
        return this.UserVpcEndpointId;
    }

    /**
     * Set 用户终端节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserVpcEndpointId 用户终端节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserVpcEndpointId(String UserVpcEndpointId) {
        this.UserVpcEndpointId = UserVpcEndpointId;
    }

    /**
     * Get 用户终端节点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserVpcEndpointName 用户终端节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserVpcEndpointName() {
        return this.UserVpcEndpointName;
    }

    /**
     * Set 用户终端节点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserVpcEndpointName 用户终端节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserVpcEndpointName(String UserVpcEndpointName) {
        this.UserVpcEndpointName = UserVpcEndpointName;
    }

    /**
     * Get 接入点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessConnectionInfos 接入点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAccessConnectionInfos() {
        return this.AccessConnectionInfos;
    }

    /**
     * Set 接入点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessConnectionInfos 接入点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessConnectionInfos(String [] AccessConnectionInfos) {
        this.AccessConnectionInfos = AccessConnectionInfos;
    }

    public UserVpcConnectionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserVpcConnectionInfo(UserVpcConnectionInfo source) {
        if (source.EngineNetworkId != null) {
            this.EngineNetworkId = new String(source.EngineNetworkId);
        }
        if (source.UserVpcId != null) {
            this.UserVpcId = new String(source.UserVpcId);
        }
        if (source.UserVpcEndpointId != null) {
            this.UserVpcEndpointId = new String(source.UserVpcEndpointId);
        }
        if (source.UserVpcEndpointName != null) {
            this.UserVpcEndpointName = new String(source.UserVpcEndpointName);
        }
        if (source.AccessConnectionInfos != null) {
            this.AccessConnectionInfos = new String[source.AccessConnectionInfos.length];
            for (int i = 0; i < source.AccessConnectionInfos.length; i++) {
                this.AccessConnectionInfos[i] = new String(source.AccessConnectionInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineNetworkId", this.EngineNetworkId);
        this.setParamSimple(map, prefix + "UserVpcId", this.UserVpcId);
        this.setParamSimple(map, prefix + "UserVpcEndpointId", this.UserVpcEndpointId);
        this.setParamSimple(map, prefix + "UserVpcEndpointName", this.UserVpcEndpointName);
        this.setParamArraySimple(map, prefix + "AccessConnectionInfos.", this.AccessConnectionInfos);

    }
}

