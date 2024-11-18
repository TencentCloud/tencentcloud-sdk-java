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

public class CreateGroupRequest extends AbstractModel {

    /**
    * 空间 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 用户组的名称。  格式：允许英文字母、数字和特殊字符-。 长度：最大 128 个字符。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 用户组的描述。  长度：最大 1024 个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户组类型  Manual：手动创建，Synchronized：外部导入
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
     * Get 空间 ID。 
     * @return ZoneId 空间 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间 ID。
     * @param ZoneId 空间 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 用户组的名称。  格式：允许英文字母、数字和特殊字符-。 长度：最大 128 个字符。 
     * @return GroupName 用户组的名称。  格式：允许英文字母、数字和特殊字符-。 长度：最大 128 个字符。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 用户组的名称。  格式：允许英文字母、数字和特殊字符-。 长度：最大 128 个字符。
     * @param GroupName 用户组的名称。  格式：允许英文字母、数字和特殊字符-。 长度：最大 128 个字符。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 用户组的描述。  长度：最大 1024 个字符。 
     * @return Description 用户组的描述。  长度：最大 1024 个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户组的描述。  长度：最大 1024 个字符。
     * @param Description 用户组的描述。  长度：最大 1024 个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用户组类型  Manual：手动创建，Synchronized：外部导入 
     * @return GroupType 用户组类型  Manual：手动创建，Synchronized：外部导入
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 用户组类型  Manual：手动创建，Synchronized：外部导入
     * @param GroupType 用户组类型  Manual：手动创建，Synchronized：外部导入
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    public CreateGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGroupRequest(CreateGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);

    }
}

