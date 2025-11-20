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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserDirectoryRequest extends AbstractModel {

    /**
    * 目录id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * ioa分组信息
    */
    @SerializedName("UserOrgSet")
    @Expose
    private UserOrg [] UserOrgSet;

    /**
     * Get 目录id 
     * @return Id 目录id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 目录id
     * @param Id 目录id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get ioa分组信息 
     * @return UserOrgSet ioa分组信息
     */
    public UserOrg [] getUserOrgSet() {
        return this.UserOrgSet;
    }

    /**
     * Set ioa分组信息
     * @param UserOrgSet ioa分组信息
     */
    public void setUserOrgSet(UserOrg [] UserOrgSet) {
        this.UserOrgSet = UserOrgSet;
    }

    public ModifyUserDirectoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserDirectoryRequest(ModifyUserDirectoryRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.UserOrgSet != null) {
            this.UserOrgSet = new UserOrg[source.UserOrgSet.length];
            for (int i = 0; i < source.UserOrgSet.length; i++) {
                this.UserOrgSet[i] = new UserOrg(source.UserOrgSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "UserOrgSet.", this.UserOrgSet);

    }
}

