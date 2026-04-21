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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserResourceDTO extends AbstractModel {

    /**
    * 企业id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorpId")
    @Expose
    private String CorpId;

    /**
    * 用户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 资源列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceList")
    @Expose
    private ResourceItem [] ResourceList;

    /**
     * Get 企业id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorpId 企业id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorpId 企业id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorpId(String CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 用户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 资源列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceList 资源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceItem [] getResourceList() {
        return this.ResourceList;
    }

    /**
     * Set 资源列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceList 资源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceList(ResourceItem [] ResourceList) {
        this.ResourceList = ResourceList;
    }

    public UserResourceDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserResourceDTO(UserResourceDTO source) {
        if (source.CorpId != null) {
            this.CorpId = new String(source.CorpId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ResourceList != null) {
            this.ResourceList = new ResourceItem[source.ResourceList.length];
            for (int i = 0; i < source.ResourceList.length; i++) {
                this.ResourceList[i] = new ResourceItem(source.ResourceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArrayObj(map, prefix + "ResourceList.", this.ResourceList);

    }
}

