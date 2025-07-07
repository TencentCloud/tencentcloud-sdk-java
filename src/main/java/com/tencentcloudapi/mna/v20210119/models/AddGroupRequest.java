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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddGroupRequest extends AbstractModel {

    /**
    * 分组的名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 分组的描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 分组的名称 
     * @return GroupName 分组的名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组的名称
     * @param GroupName 分组的名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 分组的描述 
     * @return Description 分组的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 分组的描述
     * @param Description 分组的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AddGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddGroupRequest(AddGroupRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
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
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

