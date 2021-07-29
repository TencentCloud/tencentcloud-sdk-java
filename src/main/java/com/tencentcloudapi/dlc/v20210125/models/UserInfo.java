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

public class UserInfo extends AbstractModel{

    /**
    * 用户Id，和子用户uin相同
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户描述信息，方便区分不同用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserDescription")
    @Expose
    private String UserDescription;

    /**
    * 单独给用户绑定的权限集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicySet")
    @Expose
    private Policy [] PolicySet;

    /**
    * 当前用户的创建者
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 创建时间，格式如2021-07-28 16:19:32
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 关联的工作组集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkGroupSet")
    @Expose
    private WorkGroupMessage [] WorkGroupSet;

    /**
    * 是否是管理员账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOwner")
    @Expose
    private Boolean IsOwner;

    /**
     * Get 用户Id，和子用户uin相同 
     * @return UserId 用户Id，和子用户uin相同
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户Id，和子用户uin相同
     * @param UserId 用户Id，和子用户uin相同
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户描述信息，方便区分不同用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserDescription 用户描述信息，方便区分不同用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserDescription() {
        return this.UserDescription;
    }

    /**
     * Set 用户描述信息，方便区分不同用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserDescription 用户描述信息，方便区分不同用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserDescription(String UserDescription) {
        this.UserDescription = UserDescription;
    }

    /**
     * Get 单独给用户绑定的权限集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicySet 单独给用户绑定的权限集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Policy [] getPolicySet() {
        return this.PolicySet;
    }

    /**
     * Set 单独给用户绑定的权限集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicySet 单独给用户绑定的权限集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicySet(Policy [] PolicySet) {
        this.PolicySet = PolicySet;
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
     * Get 创建时间，格式如2021-07-28 16:19:32 
     * @return CreateTime 创建时间，格式如2021-07-28 16:19:32
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，格式如2021-07-28 16:19:32
     * @param CreateTime 创建时间，格式如2021-07-28 16:19:32
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 关联的工作组集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkGroupSet 关联的工作组集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkGroupMessage [] getWorkGroupSet() {
        return this.WorkGroupSet;
    }

    /**
     * Set 关联的工作组集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkGroupSet 关联的工作组集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkGroupSet(WorkGroupMessage [] WorkGroupSet) {
        this.WorkGroupSet = WorkGroupSet;
    }

    /**
     * Get 是否是管理员账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOwner 是否是管理员账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsOwner() {
        return this.IsOwner;
    }

    /**
     * Set 是否是管理员账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOwner 是否是管理员账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOwner(Boolean IsOwner) {
        this.IsOwner = IsOwner;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserDescription != null) {
            this.UserDescription = new String(source.UserDescription);
        }
        if (source.PolicySet != null) {
            this.PolicySet = new Policy[source.PolicySet.length];
            for (int i = 0; i < source.PolicySet.length; i++) {
                this.PolicySet[i] = new Policy(source.PolicySet[i]);
            }
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.WorkGroupSet != null) {
            this.WorkGroupSet = new WorkGroupMessage[source.WorkGroupSet.length];
            for (int i = 0; i < source.WorkGroupSet.length; i++) {
                this.WorkGroupSet[i] = new WorkGroupMessage(source.WorkGroupSet[i]);
            }
        }
        if (source.IsOwner != null) {
            this.IsOwner = new Boolean(source.IsOwner);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserDescription", this.UserDescription);
        this.setParamArrayObj(map, prefix + "PolicySet.", this.PolicySet);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "WorkGroupSet.", this.WorkGroupSet);
        this.setParamSimple(map, prefix + "IsOwner", this.IsOwner);

    }
}

