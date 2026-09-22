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

public class ExternalAgentInfo extends AbstractModel {

    /**
    * 外部 A2A agent ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("A2AAgentId")
    @Expose
    private String A2AAgentId;

    /**
    * 外部 Agent 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 外部 A2A Server URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 绑定记录 ID（已绑定时返回）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindingId")
    @Expose
    private String BindingId;

    /**
    * 是否已绑定到当前 Agent
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bound")
    @Expose
    private Boolean Bound;

    /**
    * 头像地址（取自 provider card 的 iconUrl）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * 外部 agent card 声明的版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("A2AVersion")
    @Expose
    private String A2AVersion;

    /**
    * A2A card skills 集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("A2ASkillSet")
    @Expose
    private A2ASkillItem [] A2ASkillSet;

    /**
     * Get 外部 A2A agent ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return A2AAgentId 外部 A2A agent ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getA2AAgentId() {
        return this.A2AAgentId;
    }

    /**
     * Set 外部 A2A agent ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param A2AAgentId 外部 A2A agent ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setA2AAgentId(String A2AAgentId) {
        this.A2AAgentId = A2AAgentId;
    }

    /**
     * Get 外部 Agent 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 外部 Agent 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 外部 Agent 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 外部 Agent 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 外部 A2A Server URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endpoint 外部 A2A Server URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 外部 A2A Server URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endpoint 外部 A2A Server URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 绑定记录 ID（已绑定时返回）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindingId 绑定记录 ID（已绑定时返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBindingId() {
        return this.BindingId;
    }

    /**
     * Set 绑定记录 ID（已绑定时返回）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindingId 绑定记录 ID（已绑定时返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindingId(String BindingId) {
        this.BindingId = BindingId;
    }

    /**
     * Get 是否已绑定到当前 Agent
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bound 是否已绑定到当前 Agent
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getBound() {
        return this.Bound;
    }

    /**
     * Set 是否已绑定到当前 Agent
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bound 是否已绑定到当前 Agent
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBound(Boolean Bound) {
        this.Bound = Bound;
    }

    /**
     * Get 头像地址（取自 provider card 的 iconUrl）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IconUrl 头像地址（取自 provider card 的 iconUrl）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set 头像地址（取自 provider card 的 iconUrl）
注意：此字段可能返回 null，表示取不到有效值。
     * @param IconUrl 头像地址（取自 provider card 的 iconUrl）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get 外部 agent card 声明的版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return A2AVersion 外部 agent card 声明的版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getA2AVersion() {
        return this.A2AVersion;
    }

    /**
     * Set 外部 agent card 声明的版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param A2AVersion 外部 agent card 声明的版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setA2AVersion(String A2AVersion) {
        this.A2AVersion = A2AVersion;
    }

    /**
     * Get A2A card skills 集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return A2ASkillSet A2A card skills 集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public A2ASkillItem [] getA2ASkillSet() {
        return this.A2ASkillSet;
    }

    /**
     * Set A2A card skills 集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param A2ASkillSet A2A card skills 集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setA2ASkillSet(A2ASkillItem [] A2ASkillSet) {
        this.A2ASkillSet = A2ASkillSet;
    }

    public ExternalAgentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalAgentInfo(ExternalAgentInfo source) {
        if (source.A2AAgentId != null) {
            this.A2AAgentId = new String(source.A2AAgentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.BindingId != null) {
            this.BindingId = new String(source.BindingId);
        }
        if (source.Bound != null) {
            this.Bound = new Boolean(source.Bound);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.A2AVersion != null) {
            this.A2AVersion = new String(source.A2AVersion);
        }
        if (source.A2ASkillSet != null) {
            this.A2ASkillSet = new A2ASkillItem[source.A2ASkillSet.length];
            for (int i = 0; i < source.A2ASkillSet.length; i++) {
                this.A2ASkillSet[i] = new A2ASkillItem(source.A2ASkillSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "A2AAgentId", this.A2AAgentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "BindingId", this.BindingId);
        this.setParamSimple(map, prefix + "Bound", this.Bound);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "A2AVersion", this.A2AVersion);
        this.setParamArrayObj(map, prefix + "A2ASkillSet.", this.A2ASkillSet);

    }
}

