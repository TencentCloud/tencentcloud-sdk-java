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
package com.tencentcloudapi.cloudstudio.v20210524.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfoRsp extends AbstractModel{

    /**
    * 用户ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 用户验证信息
    */
    @SerializedName("AuthenticationUserInfo")
    @Expose
    private UserSubInfo AuthenticationUserInfo;

    /**
    * 头像地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * 介绍
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Features")
    @Expose
    private String Features;

    /**
    * 状况
    */
    @SerializedName("PreviewStatus")
    @Expose
    private Long PreviewStatus;

    /**
     * Get 用户ID 
     * @return Id 用户ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 用户ID
     * @param Id 用户ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 用户验证信息 
     * @return AuthenticationUserInfo 用户验证信息
     */
    public UserSubInfo getAuthenticationUserInfo() {
        return this.AuthenticationUserInfo;
    }

    /**
     * Set 用户验证信息
     * @param AuthenticationUserInfo 用户验证信息
     */
    public void setAuthenticationUserInfo(UserSubInfo AuthenticationUserInfo) {
        this.AuthenticationUserInfo = AuthenticationUserInfo;
    }

    /**
     * Get 头像地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Avatar 头像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 头像地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Avatar 头像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get 介绍
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Features 介绍
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFeatures() {
        return this.Features;
    }

    /**
     * Set 介绍
注意：此字段可能返回 null，表示取不到有效值。
     * @param Features 介绍
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeatures(String Features) {
        this.Features = Features;
    }

    /**
     * Get 状况 
     * @return PreviewStatus 状况
     */
    public Long getPreviewStatus() {
        return this.PreviewStatus;
    }

    /**
     * Set 状况
     * @param PreviewStatus 状况
     */
    public void setPreviewStatus(Long PreviewStatus) {
        this.PreviewStatus = PreviewStatus;
    }

    public UserInfoRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfoRsp(UserInfoRsp source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AuthenticationUserInfo != null) {
            this.AuthenticationUserInfo = new UserSubInfo(source.AuthenticationUserInfo);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.Features != null) {
            this.Features = new String(source.Features);
        }
        if (source.PreviewStatus != null) {
            this.PreviewStatus = new Long(source.PreviewStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "AuthenticationUserInfo.", this.AuthenticationUserInfo);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "Features", this.Features);
        this.setParamSimple(map, prefix + "PreviewStatus", this.PreviewStatus);

    }
}

