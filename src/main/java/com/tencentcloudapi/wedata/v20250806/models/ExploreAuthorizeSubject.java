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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExploreAuthorizeSubject extends AbstractModel {

    /**
    * 主体类型（用户：user，角色：role，组：group）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubjectType")
    @Expose
    private String SubjectType;

    /**
    * 主体值列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubjectValues")
    @Expose
    private String [] SubjectValues;

    /**
    * 权限列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
     * Get 主体类型（用户：user，角色：role，组：group）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubjectType 主体类型（用户：user，角色：role，组：group）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubjectType() {
        return this.SubjectType;
    }

    /**
     * Set 主体类型（用户：user，角色：role，组：group）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubjectType 主体类型（用户：user，角色：role，组：group）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubjectType(String SubjectType) {
        this.SubjectType = SubjectType;
    }

    /**
     * Get 主体值列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubjectValues 主体值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubjectValues() {
        return this.SubjectValues;
    }

    /**
     * Set 主体值列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubjectValues 主体值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubjectValues(String [] SubjectValues) {
        this.SubjectValues = SubjectValues;
    }

    /**
     * Get 权限列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Privileges 权限列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set 权限列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Privileges 权限列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    public ExploreAuthorizeSubject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExploreAuthorizeSubject(ExploreAuthorizeSubject source) {
        if (source.SubjectType != null) {
            this.SubjectType = new String(source.SubjectType);
        }
        if (source.SubjectValues != null) {
            this.SubjectValues = new String[source.SubjectValues.length];
            for (int i = 0; i < source.SubjectValues.length; i++) {
                this.SubjectValues[i] = new String(source.SubjectValues[i]);
            }
        }
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubjectType", this.SubjectType);
        this.setParamArraySimple(map, prefix + "SubjectValues.", this.SubjectValues);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);

    }
}

