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

public class DeleteUsersFromWorkGroupRequest extends AbstractModel{

    /**
    * 要删除的用户信息
    */
    @SerializedName("AddInfo")
    @Expose
    private UserIdSetOfWorkGroupId AddInfo;

    /**
     * Get 要删除的用户信息 
     * @return AddInfo 要删除的用户信息
     */
    public UserIdSetOfWorkGroupId getAddInfo() {
        return this.AddInfo;
    }

    /**
     * Set 要删除的用户信息
     * @param AddInfo 要删除的用户信息
     */
    public void setAddInfo(UserIdSetOfWorkGroupId AddInfo) {
        this.AddInfo = AddInfo;
    }

    public DeleteUsersFromWorkGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUsersFromWorkGroupRequest(DeleteUsersFromWorkGroupRequest source) {
        if (source.AddInfo != null) {
            this.AddInfo = new UserIdSetOfWorkGroupId(source.AddInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AddInfo.", this.AddInfo);

    }
}

