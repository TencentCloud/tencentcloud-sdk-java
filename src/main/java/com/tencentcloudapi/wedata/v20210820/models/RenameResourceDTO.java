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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenameResourceDTO extends AbstractModel {

    /**
    * 是否重命名成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenameSuccess")
    @Expose
    private Boolean RenameSuccess;

    /**
    * 更新用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * 更新用户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserId")
    @Expose
    private String UpdateUserId;

    /**
    * 更新日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullPath")
    @Expose
    private String FullPath;

    /**
     * Get 是否重命名成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenameSuccess 是否重命名成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRenameSuccess() {
        return this.RenameSuccess;
    }

    /**
     * Set 是否重命名成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenameSuccess 是否重命名成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenameSuccess(Boolean RenameSuccess) {
        this.RenameSuccess = RenameSuccess;
    }

    /**
     * Get 更新用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUser 更新用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set 更新用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUser 更新用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get 更新用户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserId 更新用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserId() {
        return this.UpdateUserId;
    }

    /**
     * Set 更新用户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserId 更新用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserId(String UpdateUserId) {
        this.UpdateUserId = UpdateUserId;
    }

    /**
     * Get 更新日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullPath 路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullPath() {
        return this.FullPath;
    }

    /**
     * Set 路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullPath 路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullPath(String FullPath) {
        this.FullPath = FullPath;
    }

    public RenameResourceDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenameResourceDTO(RenameResourceDTO source) {
        if (source.RenameSuccess != null) {
            this.RenameSuccess = new Boolean(source.RenameSuccess);
        }
        if (source.UpdateUser != null) {
            this.UpdateUser = new String(source.UpdateUser);
        }
        if (source.UpdateUserId != null) {
            this.UpdateUserId = new String(source.UpdateUserId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.FullPath != null) {
            this.FullPath = new String(source.FullPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RenameSuccess", this.RenameSuccess);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateUserId", this.UpdateUserId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FullPath", this.FullPath);

    }
}

