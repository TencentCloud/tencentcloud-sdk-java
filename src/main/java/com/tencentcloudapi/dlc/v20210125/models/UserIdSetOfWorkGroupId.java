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

public class UserIdSetOfWorkGroupId extends AbstractModel{

    /**
    * 工作组Id
    */
    @SerializedName("WorkGroupId")
    @Expose
    private Long WorkGroupId;

    /**
    * 用户Id集合，和CAM侧Uin匹配
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
     * Get 工作组Id 
     * @return WorkGroupId 工作组Id
     */
    public Long getWorkGroupId() {
        return this.WorkGroupId;
    }

    /**
     * Set 工作组Id
     * @param WorkGroupId 工作组Id
     */
    public void setWorkGroupId(Long WorkGroupId) {
        this.WorkGroupId = WorkGroupId;
    }

    /**
     * Get 用户Id集合，和CAM侧Uin匹配 
     * @return UserIds 用户Id集合，和CAM侧Uin匹配
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 用户Id集合，和CAM侧Uin匹配
     * @param UserIds 用户Id集合，和CAM侧Uin匹配
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    public UserIdSetOfWorkGroupId() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserIdSetOfWorkGroupId(UserIdSetOfWorkGroupId source) {
        if (source.WorkGroupId != null) {
            this.WorkGroupId = new Long(source.WorkGroupId);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkGroupId", this.WorkGroupId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);

    }
}

