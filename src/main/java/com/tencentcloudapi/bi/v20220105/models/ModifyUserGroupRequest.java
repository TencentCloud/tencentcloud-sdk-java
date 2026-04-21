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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserGroupRequest extends AbstractModel {

    /**
    * 用户组更新list
    */
    @SerializedName("UpdateList")
    @Expose
    private UserGroupUpdateDTO [] UpdateList;

    /**
     * Get 用户组更新list 
     * @return UpdateList 用户组更新list
     */
    public UserGroupUpdateDTO [] getUpdateList() {
        return this.UpdateList;
    }

    /**
     * Set 用户组更新list
     * @param UpdateList 用户组更新list
     */
    public void setUpdateList(UserGroupUpdateDTO [] UpdateList) {
        this.UpdateList = UpdateList;
    }

    public ModifyUserGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserGroupRequest(ModifyUserGroupRequest source) {
        if (source.UpdateList != null) {
            this.UpdateList = new UserGroupUpdateDTO[source.UpdateList.length];
            for (int i = 0; i < source.UpdateList.length; i++) {
                this.UpdateList[i] = new UserGroupUpdateDTO(source.UpdateList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "UpdateList.", this.UpdateList);

    }
}

