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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JoinTeamInfo extends AbstractModel{

    /**
    * 团队 ID。
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * 团队名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 团队成员个数
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * 成员在团队中的角色，取值有：
<li>Owner：团队所有者，添加团队成员及修改团队成员解决时不能填此角色；</li>
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
     * Get 团队 ID。 
     * @return TeamId 团队 ID。
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set 团队 ID。
     * @param TeamId 团队 ID。
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get 团队名称。 
     * @return Name 团队名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 团队名称。
     * @param Name 团队名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 团队成员个数 
     * @return MemberCount 团队成员个数
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set 团队成员个数
     * @param MemberCount 团队成员个数
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * Get 成员在团队中的角色，取值有：
<li>Owner：团队所有者，添加团队成员及修改团队成员解决时不能填此角色；</li>
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li> 
     * @return Role 成员在团队中的角色，取值有：
<li>Owner：团队所有者，添加团队成员及修改团队成员解决时不能填此角色；</li>
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 成员在团队中的角色，取值有：
<li>Owner：团队所有者，添加团队成员及修改团队成员解决时不能填此角色；</li>
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li>
     * @param Role 成员在团队中的角色，取值有：
<li>Owner：团队所有者，添加团队成员及修改团队成员解决时不能填此角色；</li>
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

