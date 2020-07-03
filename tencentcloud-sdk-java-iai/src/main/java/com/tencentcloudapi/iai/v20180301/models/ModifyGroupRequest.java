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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGroupRequest extends AbstractModel{

    /**
    * 人员库ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 人员库名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 需要修改的人员库自定义描述字段，key-value
    */
    @SerializedName("GroupExDescriptionInfos")
    @Expose
    private GroupExDescriptionInfo [] GroupExDescriptionInfos;

    /**
    * 人员库信息备注
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get 人员库ID 
     * @return GroupId 人员库ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 人员库ID
     * @param GroupId 人员库ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 人员库名称 
     * @return GroupName 人员库名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 人员库名称
     * @param GroupName 人员库名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 需要修改的人员库自定义描述字段，key-value 
     * @return GroupExDescriptionInfos 需要修改的人员库自定义描述字段，key-value
     */
    public GroupExDescriptionInfo [] getGroupExDescriptionInfos() {
        return this.GroupExDescriptionInfos;
    }

    /**
     * Set 需要修改的人员库自定义描述字段，key-value
     * @param GroupExDescriptionInfos 需要修改的人员库自定义描述字段，key-value
     */
    public void setGroupExDescriptionInfos(GroupExDescriptionInfo [] GroupExDescriptionInfos) {
        this.GroupExDescriptionInfos = GroupExDescriptionInfos;
    }

    /**
     * Get 人员库信息备注 
     * @return Tag 人员库信息备注
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 人员库信息备注
     * @param Tag 人员库信息备注
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "GroupExDescriptionInfos.", this.GroupExDescriptionInfos);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

