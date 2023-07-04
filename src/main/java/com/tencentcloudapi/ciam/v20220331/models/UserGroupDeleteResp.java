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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserGroupDeleteResp extends AbstractModel{

    /**
    * 错误详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 用户组关联的应用信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppAssociatedUserGroupIds")
    @Expose
    private AppAssociatedUserGroupIds [] AppAssociatedUserGroupIds;

    /**
     * Get 错误详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 错误详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 错误详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 用户组关联的应用信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppAssociatedUserGroupIds 用户组关联的应用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppAssociatedUserGroupIds [] getAppAssociatedUserGroupIds() {
        return this.AppAssociatedUserGroupIds;
    }

    /**
     * Set 用户组关联的应用信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppAssociatedUserGroupIds 用户组关联的应用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppAssociatedUserGroupIds(AppAssociatedUserGroupIds [] AppAssociatedUserGroupIds) {
        this.AppAssociatedUserGroupIds = AppAssociatedUserGroupIds;
    }

    public UserGroupDeleteResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserGroupDeleteResp(UserGroupDeleteResp source) {
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.AppAssociatedUserGroupIds != null) {
            this.AppAssociatedUserGroupIds = new AppAssociatedUserGroupIds[source.AppAssociatedUserGroupIds.length];
            for (int i = 0; i < source.AppAssociatedUserGroupIds.length; i++) {
                this.AppAssociatedUserGroupIds[i] = new AppAssociatedUserGroupIds(source.AppAssociatedUserGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamArrayObj(map, prefix + "AppAssociatedUserGroupIds.", this.AppAssociatedUserGroupIds);

    }
}

