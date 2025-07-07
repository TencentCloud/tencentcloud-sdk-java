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
package com.tencentcloudapi.bpaas.v20181217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproveUser extends AbstractModel {

    /**
    * 用户uin
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 用户类型 (1:用户  2:用户组)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 用户描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 动态获取Scf
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scf")
    @Expose
    private Scf Scf;

    /**
    * 审批状态 （取值范围 0:待审批  1:审批通过  2:拒绝  6:其他人已审批）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveStatus")
    @Expose
    private Long ApproveStatus;

    /**
    * 审批意见
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveMsg")
    @Expose
    private String ApproveMsg;

    /**
    * 审批时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveTime")
    @Expose
    private String ApproveTime;

    /**
    * 审批组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveGroup")
    @Expose
    private String ApproveGroup;

    /**
     * Get 用户uin 
     * @return Uin 用户uin
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
     * @param Uin 用户uin
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 用户类型 (1:用户  2:用户组) 
     * @return Type 用户类型 (1:用户  2:用户组)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 用户类型 (1:用户  2:用户组)
     * @param Type 用户类型 (1:用户  2:用户组)
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 用户描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 用户描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 用户描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 用户描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 用户昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nick 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nick 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get 动态获取Scf
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scf 动态获取Scf
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Scf getScf() {
        return this.Scf;
    }

    /**
     * Set 动态获取Scf
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scf 动态获取Scf
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScf(Scf Scf) {
        this.Scf = Scf;
    }

    /**
     * Get 审批状态 （取值范围 0:待审批  1:审批通过  2:拒绝  6:其他人已审批）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveStatus 审批状态 （取值范围 0:待审批  1:审批通过  2:拒绝  6:其他人已审批）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApproveStatus() {
        return this.ApproveStatus;
    }

    /**
     * Set 审批状态 （取值范围 0:待审批  1:审批通过  2:拒绝  6:其他人已审批）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveStatus 审批状态 （取值范围 0:待审批  1:审批通过  2:拒绝  6:其他人已审批）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveStatus(Long ApproveStatus) {
        this.ApproveStatus = ApproveStatus;
    }

    /**
     * Get 审批意见
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveMsg 审批意见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveMsg() {
        return this.ApproveMsg;
    }

    /**
     * Set 审批意见
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveMsg 审批意见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveMsg(String ApproveMsg) {
        this.ApproveMsg = ApproveMsg;
    }

    /**
     * Get 审批时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveTime 审批时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set 审批时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveTime 审批时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveTime(String ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    /**
     * Get 审批组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveGroup 审批组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveGroup() {
        return this.ApproveGroup;
    }

    /**
     * Set 审批组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveGroup 审批组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveGroup(String ApproveGroup) {
        this.ApproveGroup = ApproveGroup;
    }

    public ApproveUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproveUser(ApproveUser source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.Scf != null) {
            this.Scf = new Scf(source.Scf);
        }
        if (source.ApproveStatus != null) {
            this.ApproveStatus = new Long(source.ApproveStatus);
        }
        if (source.ApproveMsg != null) {
            this.ApproveMsg = new String(source.ApproveMsg);
        }
        if (source.ApproveTime != null) {
            this.ApproveTime = new String(source.ApproveTime);
        }
        if (source.ApproveGroup != null) {
            this.ApproveGroup = new String(source.ApproveGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamObj(map, prefix + "Scf.", this.Scf);
        this.setParamSimple(map, prefix + "ApproveStatus", this.ApproveStatus);
        this.setParamSimple(map, prefix + "ApproveMsg", this.ApproveMsg);
        this.setParamSimple(map, prefix + "ApproveTime", this.ApproveTime);
        this.setParamSimple(map, prefix + "ApproveGroup", this.ApproveGroup);

    }
}

