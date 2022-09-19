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

public class WorkspaceShareInfo extends AbstractModel{

    /**
    * 共享或不共享状态
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 是否与我共享
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WithMe")
    @Expose
    private Boolean WithMe;

    /**
    * 开始共享的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * 停止共享的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 停止共享的时间
    */
    @SerializedName("Users")
    @Expose
    private UserInfoRsp [] Users;

    /**
     * Get 共享或不共享状态 
     * @return Status 共享或不共享状态
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 共享或不共享状态
     * @param Status 共享或不共享状态
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 是否与我共享
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WithMe 是否与我共享
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getWithMe() {
        return this.WithMe;
    }

    /**
     * Set 是否与我共享
注意：此字段可能返回 null，表示取不到有效值。
     * @param WithMe 是否与我共享
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWithMe(Boolean WithMe) {
        this.WithMe = WithMe;
    }

    /**
     * Get 开始共享的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginDate 开始共享的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set 开始共享的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginDate 开始共享的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get 停止共享的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndDate 停止共享的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 停止共享的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndDate 停止共享的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 停止共享的时间 
     * @return Users 停止共享的时间
     */
    public UserInfoRsp [] getUsers() {
        return this.Users;
    }

    /**
     * Set 停止共享的时间
     * @param Users 停止共享的时间
     */
    public void setUsers(UserInfoRsp [] Users) {
        this.Users = Users;
    }

    public WorkspaceShareInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkspaceShareInfo(WorkspaceShareInfo source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.WithMe != null) {
            this.WithMe = new Boolean(source.WithMe);
        }
        if (source.BeginDate != null) {
            this.BeginDate = new String(source.BeginDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.Users != null) {
            this.Users = new UserInfoRsp[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new UserInfoRsp(source.Users[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "WithMe", this.WithMe);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamArrayObj(map, prefix + "Users.", this.Users);

    }
}

