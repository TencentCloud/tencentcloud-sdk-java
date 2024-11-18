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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupExDescriptionInfo extends AbstractModel {

    /**
    * 人员库自定义描述字段Index，从0开始。
    */
    @SerializedName("GroupExDescriptionIndex")
    @Expose
    private Long GroupExDescriptionIndex;

    /**
    * 需要更新的人员库自定义描述字段内容。
    */
    @SerializedName("GroupExDescription")
    @Expose
    private String GroupExDescription;

    /**
     * Get 人员库自定义描述字段Index，从0开始。 
     * @return GroupExDescriptionIndex 人员库自定义描述字段Index，从0开始。
     */
    public Long getGroupExDescriptionIndex() {
        return this.GroupExDescriptionIndex;
    }

    /**
     * Set 人员库自定义描述字段Index，从0开始。
     * @param GroupExDescriptionIndex 人员库自定义描述字段Index，从0开始。
     */
    public void setGroupExDescriptionIndex(Long GroupExDescriptionIndex) {
        this.GroupExDescriptionIndex = GroupExDescriptionIndex;
    }

    /**
     * Get 需要更新的人员库自定义描述字段内容。 
     * @return GroupExDescription 需要更新的人员库自定义描述字段内容。
     */
    public String getGroupExDescription() {
        return this.GroupExDescription;
    }

    /**
     * Set 需要更新的人员库自定义描述字段内容。
     * @param GroupExDescription 需要更新的人员库自定义描述字段内容。
     */
    public void setGroupExDescription(String GroupExDescription) {
        this.GroupExDescription = GroupExDescription;
    }

    public GroupExDescriptionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupExDescriptionInfo(GroupExDescriptionInfo source) {
        if (source.GroupExDescriptionIndex != null) {
            this.GroupExDescriptionIndex = new Long(source.GroupExDescriptionIndex);
        }
        if (source.GroupExDescription != null) {
            this.GroupExDescription = new String(source.GroupExDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupExDescriptionIndex", this.GroupExDescriptionIndex);
        this.setParamSimple(map, prefix + "GroupExDescription", this.GroupExDescription);

    }
}

