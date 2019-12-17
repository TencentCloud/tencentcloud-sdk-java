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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProxyGroupAttributeRequest extends AbstractModel{

    /**
    * 需要修改的通道组ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 修改后的通道组名称：不超过30个字符，超过部分会被截断。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get 需要修改的通道组ID。 
     * @return GroupId 需要修改的通道组ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 需要修改的通道组ID。
     * @param GroupId 需要修改的通道组ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 修改后的通道组名称：不超过30个字符，超过部分会被截断。 
     * @return GroupName 修改后的通道组名称：不超过30个字符，超过部分会被截断。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 修改后的通道组名称：不超过30个字符，超过部分会被截断。
     * @param GroupName 修改后的通道组名称：不超过30个字符，超过部分会被截断。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

