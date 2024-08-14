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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUserSyncProvisioningRequest extends AbstractModel {

    /**
    * 空间ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 用户同步的iD
    */
    @SerializedName("UserProvisioningId")
    @Expose
    private String UserProvisioningId;

    /**
    * 用户同步描述。
    */
    @SerializedName("NewDescription")
    @Expose
    private String NewDescription;

    /**
    * 冲突策略。当CIC 用户同步到 CAM 时，如果 CAM 中存在同名用户时的处理策略。取值： KeepBoth：两者都保留。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则对CIC 用户的用户名添加后缀_cic后尝试创建该用户名的 CAM 用户。 TakeOver：替换。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则直接将已经存在的 CAM 用户替换为CIC 同步用户。 
    */
    @SerializedName("NewDuplicationStateful")
    @Expose
    private String NewDuplicationStateful;

    /**
    * 删除策略。删除 CAM 用户同步时，对已同步的 CAM 用户的处理策略。取值： Delete：删除。删除 CAM 用户同步时，会删除从CIC 已经同步到 CAM 中的 CAM 用户。 Keep：保留。删除 RAM 用户同步时，会保留从CIC 已经同步到 CAM 中的 CAM 用户。 
    */
    @SerializedName("NewDeletionStrategy")
    @Expose
    private String NewDeletionStrategy;

    /**
     * Get 空间ID。 
     * @return ZoneId 空间ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间ID。
     * @param ZoneId 空间ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 用户同步的iD 
     * @return UserProvisioningId 用户同步的iD
     */
    public String getUserProvisioningId() {
        return this.UserProvisioningId;
    }

    /**
     * Set 用户同步的iD
     * @param UserProvisioningId 用户同步的iD
     */
    public void setUserProvisioningId(String UserProvisioningId) {
        this.UserProvisioningId = UserProvisioningId;
    }

    /**
     * Get 用户同步描述。 
     * @return NewDescription 用户同步描述。
     */
    public String getNewDescription() {
        return this.NewDescription;
    }

    /**
     * Set 用户同步描述。
     * @param NewDescription 用户同步描述。
     */
    public void setNewDescription(String NewDescription) {
        this.NewDescription = NewDescription;
    }

    /**
     * Get 冲突策略。当CIC 用户同步到 CAM 时，如果 CAM 中存在同名用户时的处理策略。取值： KeepBoth：两者都保留。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则对CIC 用户的用户名添加后缀_cic后尝试创建该用户名的 CAM 用户。 TakeOver：替换。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则直接将已经存在的 CAM 用户替换为CIC 同步用户。  
     * @return NewDuplicationStateful 冲突策略。当CIC 用户同步到 CAM 时，如果 CAM 中存在同名用户时的处理策略。取值： KeepBoth：两者都保留。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则对CIC 用户的用户名添加后缀_cic后尝试创建该用户名的 CAM 用户。 TakeOver：替换。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则直接将已经存在的 CAM 用户替换为CIC 同步用户。 
     */
    public String getNewDuplicationStateful() {
        return this.NewDuplicationStateful;
    }

    /**
     * Set 冲突策略。当CIC 用户同步到 CAM 时，如果 CAM 中存在同名用户时的处理策略。取值： KeepBoth：两者都保留。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则对CIC 用户的用户名添加后缀_cic后尝试创建该用户名的 CAM 用户。 TakeOver：替换。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则直接将已经存在的 CAM 用户替换为CIC 同步用户。 
     * @param NewDuplicationStateful 冲突策略。当CIC 用户同步到 CAM 时，如果 CAM 中存在同名用户时的处理策略。取值： KeepBoth：两者都保留。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则对CIC 用户的用户名添加后缀_cic后尝试创建该用户名的 CAM 用户。 TakeOver：替换。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则直接将已经存在的 CAM 用户替换为CIC 同步用户。 
     */
    public void setNewDuplicationStateful(String NewDuplicationStateful) {
        this.NewDuplicationStateful = NewDuplicationStateful;
    }

    /**
     * Get 删除策略。删除 CAM 用户同步时，对已同步的 CAM 用户的处理策略。取值： Delete：删除。删除 CAM 用户同步时，会删除从CIC 已经同步到 CAM 中的 CAM 用户。 Keep：保留。删除 RAM 用户同步时，会保留从CIC 已经同步到 CAM 中的 CAM 用户。  
     * @return NewDeletionStrategy 删除策略。删除 CAM 用户同步时，对已同步的 CAM 用户的处理策略。取值： Delete：删除。删除 CAM 用户同步时，会删除从CIC 已经同步到 CAM 中的 CAM 用户。 Keep：保留。删除 RAM 用户同步时，会保留从CIC 已经同步到 CAM 中的 CAM 用户。 
     */
    public String getNewDeletionStrategy() {
        return this.NewDeletionStrategy;
    }

    /**
     * Set 删除策略。删除 CAM 用户同步时，对已同步的 CAM 用户的处理策略。取值： Delete：删除。删除 CAM 用户同步时，会删除从CIC 已经同步到 CAM 中的 CAM 用户。 Keep：保留。删除 RAM 用户同步时，会保留从CIC 已经同步到 CAM 中的 CAM 用户。 
     * @param NewDeletionStrategy 删除策略。删除 CAM 用户同步时，对已同步的 CAM 用户的处理策略。取值： Delete：删除。删除 CAM 用户同步时，会删除从CIC 已经同步到 CAM 中的 CAM 用户。 Keep：保留。删除 RAM 用户同步时，会保留从CIC 已经同步到 CAM 中的 CAM 用户。 
     */
    public void setNewDeletionStrategy(String NewDeletionStrategy) {
        this.NewDeletionStrategy = NewDeletionStrategy;
    }

    public UpdateUserSyncProvisioningRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserSyncProvisioningRequest(UpdateUserSyncProvisioningRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.UserProvisioningId != null) {
            this.UserProvisioningId = new String(source.UserProvisioningId);
        }
        if (source.NewDescription != null) {
            this.NewDescription = new String(source.NewDescription);
        }
        if (source.NewDuplicationStateful != null) {
            this.NewDuplicationStateful = new String(source.NewDuplicationStateful);
        }
        if (source.NewDeletionStrategy != null) {
            this.NewDeletionStrategy = new String(source.NewDeletionStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "UserProvisioningId", this.UserProvisioningId);
        this.setParamSimple(map, prefix + "NewDescription", this.NewDescription);
        this.setParamSimple(map, prefix + "NewDuplicationStateful", this.NewDuplicationStateful);
        this.setParamSimple(map, prefix + "NewDeletionStrategy", this.NewDeletionStrategy);

    }
}

