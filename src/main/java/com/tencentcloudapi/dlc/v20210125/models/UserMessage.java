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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserMessage extends AbstractModel{

    /**
    * 用户Id，和CAM侧子用户Uin匹配
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserDescription")
    @Expose
    private String UserDescription;

    /**
    * 当前用户的创建者
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 当前用户的创建时间，形如2021-07-28 16:19:32
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 用户别名
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
     * Get 用户Id，和CAM侧子用户Uin匹配 
     * @return UserId 用户Id，和CAM侧子用户Uin匹配
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户Id，和CAM侧子用户Uin匹配
     * @param UserId 用户Id，和CAM侧子用户Uin匹配
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserDescription 用户描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserDescription() {
        return this.UserDescription;
    }

    /**
     * Set 用户描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserDescription 用户描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserDescription(String UserDescription) {
        this.UserDescription = UserDescription;
    }

    /**
     * Get 当前用户的创建者 
     * @return Creator 当前用户的创建者
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 当前用户的创建者
     * @param Creator 当前用户的创建者
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 当前用户的创建时间，形如2021-07-28 16:19:32 
     * @return CreateTime 当前用户的创建时间，形如2021-07-28 16:19:32
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 当前用户的创建时间，形如2021-07-28 16:19:32
     * @param CreateTime 当前用户的创建时间，形如2021-07-28 16:19:32
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 用户别名 
     * @return UserAlias 用户别名
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set 用户别名
     * @param UserAlias 用户别名
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    public UserMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserMessage(UserMessage source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserDescription != null) {
            this.UserDescription = new String(source.UserDescription);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserDescription", this.UserDescription);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);

    }
}

