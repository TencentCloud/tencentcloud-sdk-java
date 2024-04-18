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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerlessIndexNetworkField extends AbstractModel {

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * vpc唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcUid")
    @Expose
    private String VpcUid;

    /**
    * 子网唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetUid")
    @Expose
    private String SubnetUid;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get vpc唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcUid vpc唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcUid() {
        return this.VpcUid;
    }

    /**
     * Set vpc唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcUid vpc唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcUid(String VpcUid) {
        this.VpcUid = VpcUid;
    }

    /**
     * Get 子网唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetUid 子网唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetUid() {
        return this.SubnetUid;
    }

    /**
     * Set 子网唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetUid 子网唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetUid(String SubnetUid) {
        this.SubnetUid = SubnetUid;
    }

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Username 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Username 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password 密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password 密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ServerlessIndexNetworkField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerlessIndexNetworkField(ServerlessIndexNetworkField source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcUid != null) {
            this.VpcUid = new String(source.VpcUid);
        }
        if (source.SubnetUid != null) {
            this.SubnetUid = new String(source.SubnetUid);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcUid", this.VpcUid);
        this.setParamSimple(map, prefix + "SubnetUid", this.SubnetUid);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

