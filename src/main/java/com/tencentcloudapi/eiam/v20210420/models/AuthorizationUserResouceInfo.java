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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthorizationUserResouceInfo extends AbstractModel{

    /**
    * 资源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 授权资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 继承关系
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InheritedForm")
    @Expose
    private InheritedForm InheritedForm;

    /**
    * 应用账户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationAccounts")
    @Expose
    private String [] ApplicationAccounts;

    /**
    * 资源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
     * Get 资源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 授权资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 授权资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 授权资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 授权资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 继承关系
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InheritedForm 继承关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InheritedForm getInheritedForm() {
        return this.InheritedForm;
    }

    /**
     * Set 继承关系
注意：此字段可能返回 null，表示取不到有效值。
     * @param InheritedForm 继承关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInheritedForm(InheritedForm InheritedForm) {
        this.InheritedForm = InheritedForm;
    }

    /**
     * Get 应用账户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationAccounts 应用账户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getApplicationAccounts() {
        return this.ApplicationAccounts;
    }

    /**
     * Set 应用账户
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationAccounts 应用账户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationAccounts(String [] ApplicationAccounts) {
        this.ApplicationAccounts = ApplicationAccounts;
    }

    /**
     * Get 资源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    public AuthorizationUserResouceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthorizationUserResouceInfo(AuthorizationUserResouceInfo source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.InheritedForm != null) {
            this.InheritedForm = new InheritedForm(source.InheritedForm);
        }
        if (source.ApplicationAccounts != null) {
            this.ApplicationAccounts = new String[source.ApplicationAccounts.length];
            for (int i = 0; i < source.ApplicationAccounts.length; i++) {
                this.ApplicationAccounts[i] = new String(source.ApplicationAccounts[i]);
            }
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamObj(map, prefix + "InheritedForm.", this.InheritedForm);
        this.setParamArraySimple(map, prefix + "ApplicationAccounts.", this.ApplicationAccounts);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);

    }
}

