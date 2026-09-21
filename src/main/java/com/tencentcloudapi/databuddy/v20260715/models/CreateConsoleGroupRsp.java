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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConsoleGroupRsp extends AbstractModel {

    /**
    * 创建成功的用户组 ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 创建成功的用户组 ID 
     * @return GroupId 创建成功的用户组 ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 创建成功的用户组 ID
     * @param GroupId 创建成功的用户组 ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public CreateConsoleGroupRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConsoleGroupRsp(CreateConsoleGroupRsp source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

