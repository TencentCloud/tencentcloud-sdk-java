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

public class ApplicationAuthorizationInfo extends AbstractModel{

    /**
    * 用户在被授权应用下对应的账号列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationAccounts")
    @Expose
    private String [] ApplicationAccounts;

    /**
    * 应用ID，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 展示用户所在的用户组、机构节点拥有该应用的访问权限的ID信息列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InheritedForm")
    @Expose
    private InheritedForm InheritedForm;

    /**
    * 应用名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 应用创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

    /**
     * Get 用户在被授权应用下对应的账号列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationAccounts 用户在被授权应用下对应的账号列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getApplicationAccounts() {
        return this.ApplicationAccounts;
    }

    /**
     * Set 用户在被授权应用下对应的账号列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationAccounts 用户在被授权应用下对应的账号列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationAccounts(String [] ApplicationAccounts) {
        this.ApplicationAccounts = ApplicationAccounts;
    }

    /**
     * Get 应用ID，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 应用ID，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用ID，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 展示用户所在的用户组、机构节点拥有该应用的访问权限的ID信息列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InheritedForm 展示用户所在的用户组、机构节点拥有该应用的访问权限的ID信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InheritedForm getInheritedForm() {
        return this.InheritedForm;
    }

    /**
     * Set 展示用户所在的用户组、机构节点拥有该应用的访问权限的ID信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InheritedForm 展示用户所在的用户组、机构节点拥有该应用的访问权限的ID信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInheritedForm(InheritedForm InheritedForm) {
        this.InheritedForm = InheritedForm;
    }

    /**
     * Get 应用名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 应用名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 应用名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 应用创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedDate 应用创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set 应用创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedDate 应用创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public ApplicationAuthorizationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationAuthorizationInfo(ApplicationAuthorizationInfo source) {
        if (source.ApplicationAccounts != null) {
            this.ApplicationAccounts = new String[source.ApplicationAccounts.length];
            for (int i = 0; i < source.ApplicationAccounts.length; i++) {
                this.ApplicationAccounts[i] = new String(source.ApplicationAccounts[i]);
            }
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.InheritedForm != null) {
            this.InheritedForm = new InheritedForm(source.InheritedForm);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new String(source.CreatedDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ApplicationAccounts.", this.ApplicationAccounts);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamObj(map, prefix + "InheritedForm.", this.InheritedForm);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);

    }
}

