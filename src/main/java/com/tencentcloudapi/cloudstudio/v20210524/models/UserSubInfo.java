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

public class UserSubInfo extends AbstractModel{

    /**
    * 团队名称
    */
    @SerializedName("Team")
    @Expose
    private String Team;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 是否为管理员
    */
    @SerializedName("IsAdmin")
    @Expose
    private Boolean IsAdmin;

    /**
    * xxx
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsTrial")
    @Expose
    private Boolean IsTrial;

    /**
     * Get 团队名称 
     * @return Team 团队名称
     */
    public String getTeam() {
        return this.Team;
    }

    /**
     * Set 团队名称
     * @param Team 团队名称
     */
    public void setTeam(String Team) {
        this.Team = Team;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 昵称 
     * @return NickName 昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 昵称
     * @param NickName 昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 是否为管理员 
     * @return IsAdmin 是否为管理员
     */
    public Boolean getIsAdmin() {
        return this.IsAdmin;
    }

    /**
     * Set 是否为管理员
     * @param IsAdmin 是否为管理员
     */
    public void setIsAdmin(Boolean IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    /**
     * Get xxx
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsTrial xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsTrial() {
        return this.IsTrial;
    }

    /**
     * Set xxx
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsTrial xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsTrial(Boolean IsTrial) {
        this.IsTrial = IsTrial;
    }

    public UserSubInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserSubInfo(UserSubInfo source) {
        if (source.Team != null) {
            this.Team = new String(source.Team);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.IsAdmin != null) {
            this.IsAdmin = new Boolean(source.IsAdmin);
        }
        if (source.IsTrial != null) {
            this.IsTrial = new Boolean(source.IsTrial);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Team", this.Team);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "IsAdmin", this.IsAdmin);
        this.setParamSimple(map, prefix + "IsTrial", this.IsTrial);

    }
}

