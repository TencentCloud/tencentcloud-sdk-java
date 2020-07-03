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

public class TeamInfo extends AbstractModel{

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
    * 团队创建时间，格式按照 ISO 8601 标准表示。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 团队最后更新时间，格式按照 ISO 8601 标准表示。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get 团队创建时间，格式按照 ISO 8601 标准表示。 
     * @return CreateTime 团队创建时间，格式按照 ISO 8601 标准表示。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 团队创建时间，格式按照 ISO 8601 标准表示。
     * @param CreateTime 团队创建时间，格式按照 ISO 8601 标准表示。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 团队最后更新时间，格式按照 ISO 8601 标准表示。 
     * @return UpdateTime 团队最后更新时间，格式按照 ISO 8601 标准表示。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 团队最后更新时间，格式按照 ISO 8601 标准表示。
     * @param UpdateTime 团队最后更新时间，格式按照 ISO 8601 标准表示。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

