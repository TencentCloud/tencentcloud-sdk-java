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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupInfo extends AbstractModel {

    /**
    * 安全组 ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 安全组名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 白名单列表。
    */
    @SerializedName("Whitelist")
    @Expose
    private String [] Whitelist;

    /**
    * 绑定的输入流列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OccupiedInputs")
    @Expose
    private String [] OccupiedInputs;

    /**
    * 安全组地址。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 绑定的输出流列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OccupiedOutputs")
    @Expose
    private String [] OccupiedOutputs;

    /**
     * Get 安全组 ID。 
     * @return Id 安全组 ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 安全组 ID。
     * @param Id 安全组 ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 安全组名称。 
     * @return Name 安全组名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 安全组名称。
     * @param Name 安全组名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 白名单列表。 
     * @return Whitelist 白名单列表。
     */
    public String [] getWhitelist() {
        return this.Whitelist;
    }

    /**
     * Set 白名单列表。
     * @param Whitelist 白名单列表。
     */
    public void setWhitelist(String [] Whitelist) {
        this.Whitelist = Whitelist;
    }

    /**
     * Get 绑定的输入流列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OccupiedInputs 绑定的输入流列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOccupiedInputs() {
        return this.OccupiedInputs;
    }

    /**
     * Set 绑定的输入流列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OccupiedInputs 绑定的输入流列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOccupiedInputs(String [] OccupiedInputs) {
        this.OccupiedInputs = OccupiedInputs;
    }

    /**
     * Get 安全组地址。 
     * @return Region 安全组地址。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 安全组地址。
     * @param Region 安全组地址。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 绑定的输出流列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OccupiedOutputs 绑定的输出流列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOccupiedOutputs() {
        return this.OccupiedOutputs;
    }

    /**
     * Set 绑定的输出流列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OccupiedOutputs 绑定的输出流列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOccupiedOutputs(String [] OccupiedOutputs) {
        this.OccupiedOutputs = OccupiedOutputs;
    }

    public SecurityGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupInfo(SecurityGroupInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Whitelist != null) {
            this.Whitelist = new String[source.Whitelist.length];
            for (int i = 0; i < source.Whitelist.length; i++) {
                this.Whitelist[i] = new String(source.Whitelist[i]);
            }
        }
        if (source.OccupiedInputs != null) {
            this.OccupiedInputs = new String[source.OccupiedInputs.length];
            for (int i = 0; i < source.OccupiedInputs.length; i++) {
                this.OccupiedInputs[i] = new String(source.OccupiedInputs[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.OccupiedOutputs != null) {
            this.OccupiedOutputs = new String[source.OccupiedOutputs.length];
            for (int i = 0; i < source.OccupiedOutputs.length; i++) {
                this.OccupiedOutputs[i] = new String(source.OccupiedOutputs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Whitelist.", this.Whitelist);
        this.setParamArraySimple(map, prefix + "OccupiedInputs.", this.OccupiedInputs);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArraySimple(map, prefix + "OccupiedOutputs.", this.OccupiedOutputs);

    }
}

