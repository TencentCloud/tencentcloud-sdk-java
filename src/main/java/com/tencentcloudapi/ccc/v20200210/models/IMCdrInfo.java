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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IMCdrInfo extends AbstractModel{

    /**
    * 服务记录ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 服务时长秒数
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 结束状态
0 异常结束
1 正常结束
3 无坐席在线
17 坐席放弃接听
100 黑名单
101 坐席手动转接
102 IVR阶段放弃
108 用户超时自动结束
    */
    @SerializedName("EndStatus")
    @Expose
    private Long EndStatus;

    /**
    * 用户昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 服务类型 1为全媒体，2为文本客服
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 客服ID
    */
    @SerializedName("StaffId")
    @Expose
    private String StaffId;

    /**
    * 服务时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 会话ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 技能组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkillGroupId")
    @Expose
    private String SkillGroupId;

    /**
    * 技能组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkillGroupName")
    @Expose
    private String SkillGroupName;

    /**
     * Get 服务记录ID 
     * @return Id 服务记录ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 服务记录ID
     * @param Id 服务记录ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 服务时长秒数 
     * @return Duration 服务时长秒数
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 服务时长秒数
     * @param Duration 服务时长秒数
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 结束状态
0 异常结束
1 正常结束
3 无坐席在线
17 坐席放弃接听
100 黑名单
101 坐席手动转接
102 IVR阶段放弃
108 用户超时自动结束 
     * @return EndStatus 结束状态
0 异常结束
1 正常结束
3 无坐席在线
17 坐席放弃接听
100 黑名单
101 坐席手动转接
102 IVR阶段放弃
108 用户超时自动结束
     */
    public Long getEndStatus() {
        return this.EndStatus;
    }

    /**
     * Set 结束状态
0 异常结束
1 正常结束
3 无坐席在线
17 坐席放弃接听
100 黑名单
101 坐席手动转接
102 IVR阶段放弃
108 用户超时自动结束
     * @param EndStatus 结束状态
0 异常结束
1 正常结束
3 无坐席在线
17 坐席放弃接听
100 黑名单
101 坐席手动转接
102 IVR阶段放弃
108 用户超时自动结束
     */
    public void setEndStatus(Long EndStatus) {
        this.EndStatus = EndStatus;
    }

    /**
     * Get 用户昵称 
     * @return Nickname 用户昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 用户昵称
     * @param Nickname 用户昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 服务类型 1为全媒体，2为文本客服 
     * @return Type 服务类型 1为全媒体，2为文本客服
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 服务类型 1为全媒体，2为文本客服
     * @param Type 服务类型 1为全媒体，2为文本客服
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 客服ID 
     * @return StaffId 客服ID
     */
    public String getStaffId() {
        return this.StaffId;
    }

    /**
     * Set 客服ID
     * @param StaffId 客服ID
     */
    public void setStaffId(String StaffId) {
        this.StaffId = StaffId;
    }

    /**
     * Get 服务时间戳 
     * @return Timestamp 服务时间戳
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 服务时间戳
     * @param Timestamp 服务时间戳
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 会话ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId 会话ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId 会话ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 技能组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkillGroupId 技能组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set 技能组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkillGroupId 技能组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkillGroupId(String SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get 技能组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkillGroupName 技能组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSkillGroupName() {
        return this.SkillGroupName;
    }

    /**
     * Set 技能组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkillGroupName 技能组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkillGroupName(String SkillGroupName) {
        this.SkillGroupName = SkillGroupName;
    }

    public IMCdrInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IMCdrInfo(IMCdrInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.EndStatus != null) {
            this.EndStatus = new Long(source.EndStatus);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.StaffId != null) {
            this.StaffId = new String(source.StaffId);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new String(source.SkillGroupId);
        }
        if (source.SkillGroupName != null) {
            this.SkillGroupName = new String(source.SkillGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "EndStatus", this.EndStatus);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StaffId", this.StaffId);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "SkillGroupName", this.SkillGroupName);

    }
}

