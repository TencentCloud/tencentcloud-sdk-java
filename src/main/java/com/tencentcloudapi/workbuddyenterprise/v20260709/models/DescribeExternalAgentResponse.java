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

public class DescribeExternalAgentResponse extends AbstractModel {

    /**
    * <p>外部 A2A agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("A2AAgentId")
    @Expose
    private String A2AAgentId;

    /**
    * <p>外部 Agent 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>外部 A2A Server URL</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * <p>绑定记录 ID（已绑定时返回）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindingId")
    @Expose
    private String BindingId;

    /**
    * <p>是否已绑定到当前 Agent</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bound")
    @Expose
    private Boolean Bound;

    /**
    * <p>头像地址（取自 provider card 的 iconUrl；为空时前端回落首字母头像）</p>
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * <p>外部 agent card 声明的版本号</p>
    */
    @SerializedName("A2AVersion")
    @Expose
    private String A2AVersion;

    /**
    * <p>A2A card skills 集合</p>
    */
    @SerializedName("A2ASkillSet")
    @Expose
    private A2ASkillItem [] A2ASkillSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>外部 A2A agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return A2AAgentId <p>外部 A2A agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getA2AAgentId() {
        return this.A2AAgentId;
    }

    /**
     * Set <p>外部 A2A agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param A2AAgentId <p>外部 A2A agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setA2AAgentId(String A2AAgentId) {
        this.A2AAgentId = A2AAgentId;
    }

    /**
     * Get <p>外部 Agent 名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>外部 Agent 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>外部 Agent 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>外部 Agent 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>外部 A2A Server URL</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endpoint <p>外部 A2A Server URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>外部 A2A Server URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endpoint <p>外部 A2A Server URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get <p>绑定记录 ID（已绑定时返回）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindingId <p>绑定记录 ID（已绑定时返回）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBindingId() {
        return this.BindingId;
    }

    /**
     * Set <p>绑定记录 ID（已绑定时返回）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindingId <p>绑定记录 ID（已绑定时返回）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindingId(String BindingId) {
        this.BindingId = BindingId;
    }

    /**
     * Get <p>是否已绑定到当前 Agent</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bound <p>是否已绑定到当前 Agent</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getBound() {
        return this.Bound;
    }

    /**
     * Set <p>是否已绑定到当前 Agent</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bound <p>是否已绑定到当前 Agent</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBound(Boolean Bound) {
        this.Bound = Bound;
    }

    /**
     * Get <p>头像地址（取自 provider card 的 iconUrl；为空时前端回落首字母头像）</p> 
     * @return IconUrl <p>头像地址（取自 provider card 的 iconUrl；为空时前端回落首字母头像）</p>
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set <p>头像地址（取自 provider card 的 iconUrl；为空时前端回落首字母头像）</p>
     * @param IconUrl <p>头像地址（取自 provider card 的 iconUrl；为空时前端回落首字母头像）</p>
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get <p>外部 agent card 声明的版本号</p> 
     * @return A2AVersion <p>外部 agent card 声明的版本号</p>
     */
    public String getA2AVersion() {
        return this.A2AVersion;
    }

    /**
     * Set <p>外部 agent card 声明的版本号</p>
     * @param A2AVersion <p>外部 agent card 声明的版本号</p>
     */
    public void setA2AVersion(String A2AVersion) {
        this.A2AVersion = A2AVersion;
    }

    /**
     * Get <p>A2A card skills 集合</p> 
     * @return A2ASkillSet <p>A2A card skills 集合</p>
     */
    public A2ASkillItem [] getA2ASkillSet() {
        return this.A2ASkillSet;
    }

    /**
     * Set <p>A2A card skills 集合</p>
     * @param A2ASkillSet <p>A2A card skills 集合</p>
     */
    public void setA2ASkillSet(A2ASkillItem [] A2ASkillSet) {
        this.A2ASkillSet = A2ASkillSet;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeExternalAgentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExternalAgentResponse(DescribeExternalAgentResponse source) {
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

