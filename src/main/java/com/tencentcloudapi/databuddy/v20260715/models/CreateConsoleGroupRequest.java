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

public class CreateConsoleGroupRequest extends AbstractModel {

    /**
    * <p>用户组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>用户组别名</p>
    */
    @SerializedName("GroupNickname")
    @Expose
    private String GroupNickname;

    /**
    * <p>用户组描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>用户组名称</p> 
     * @return GroupName <p>用户组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>用户组名称</p>
     * @param GroupName <p>用户组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>用户组别名</p> 
     * @return GroupNickname <p>用户组别名</p>
     */
    public String getGroupNickname() {
        return this.GroupNickname;
    }

    /**
     * Set <p>用户组别名</p>
     * @param GroupNickname <p>用户组别名</p>
     */
    public void setGroupNickname(String GroupNickname) {
        this.GroupNickname = GroupNickname;
    }

    /**
     * Get <p>用户组描述</p> 
     * @return Description <p>用户组描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>用户组描述</p>
     * @param Description <p>用户组描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateConsoleGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConsoleGroupRequest(CreateConsoleGroupRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupNickname != null) {
            this.GroupNickname = new String(source.GroupNickname);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupNickname", this.GroupNickname);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

