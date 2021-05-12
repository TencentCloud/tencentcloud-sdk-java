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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserProfile extends AbstractModel{

    /**
    * 配置的id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProfileId")
    @Expose
    private String ProfileId;

    /**
    * 配置类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProfileType")
    @Expose
    private String ProfileType;

    /**
    * 配置级别，"User"或"Instance"。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProfileLevel")
    @Expose
    private String ProfileLevel;

    /**
    * 配置名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProfileName")
    @Expose
    private String ProfileName;

    /**
    * 配置详情。
    */
    @SerializedName("ProfileInfo")
    @Expose
    private ProfileInfo ProfileInfo;

    /**
     * Get 配置的id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProfileId 配置的id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProfileId() {
        return this.ProfileId;
    }

    /**
     * Set 配置的id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProfileId 配置的id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProfileId(String ProfileId) {
        this.ProfileId = ProfileId;
    }

    /**
     * Get 配置类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProfileType 配置类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProfileType() {
        return this.ProfileType;
    }

    /**
     * Set 配置类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProfileType 配置类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProfileType(String ProfileType) {
        this.ProfileType = ProfileType;
    }

    /**
     * Get 配置级别，"User"或"Instance"。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProfileLevel 配置级别，"User"或"Instance"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProfileLevel() {
        return this.ProfileLevel;
    }

    /**
     * Set 配置级别，"User"或"Instance"。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProfileLevel 配置级别，"User"或"Instance"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProfileLevel(String ProfileLevel) {
        this.ProfileLevel = ProfileLevel;
    }

    /**
     * Get 配置名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProfileName 配置名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProfileName() {
        return this.ProfileName;
    }

    /**
     * Set 配置名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProfileName 配置名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProfileName(String ProfileName) {
        this.ProfileName = ProfileName;
    }

    /**
     * Get 配置详情。 
     * @return ProfileInfo 配置详情。
     */
    public ProfileInfo getProfileInfo() {
        return this.ProfileInfo;
    }

    /**
     * Set 配置详情。
     * @param ProfileInfo 配置详情。
     */
    public void setProfileInfo(ProfileInfo ProfileInfo) {
        this.ProfileInfo = ProfileInfo;
    }

    public UserProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserProfile(UserProfile source) {
        if (source.ProfileId != null) {
            this.ProfileId = new String(source.ProfileId);
        }
        if (source.ProfileType != null) {
            this.ProfileType = new String(source.ProfileType);
        }
        if (source.ProfileLevel != null) {
            this.ProfileLevel = new String(source.ProfileLevel);
        }
        if (source.ProfileName != null) {
            this.ProfileName = new String(source.ProfileName);
        }
        if (source.ProfileInfo != null) {
            this.ProfileInfo = new ProfileInfo(source.ProfileInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProfileId", this.ProfileId);
        this.setParamSimple(map, prefix + "ProfileType", this.ProfileType);
        this.setParamSimple(map, prefix + "ProfileLevel", this.ProfileLevel);
        this.setParamSimple(map, prefix + "ProfileName", this.ProfileName);
        this.setParamObj(map, prefix + "ProfileInfo.", this.ProfileInfo);

    }
}

