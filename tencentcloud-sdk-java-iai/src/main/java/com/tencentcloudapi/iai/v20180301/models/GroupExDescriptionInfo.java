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

public class GroupExDescriptionInfo extends AbstractModel{

    /**
    * 人员库自定义描述字段Index，从0开始
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupExDescriptionIndex")
    @Expose
    private Long GroupExDescriptionIndex;

    /**
    * 需要更新的人员库自定义描述字段内容
    */
    @SerializedName("GroupExDescription")
    @Expose
    private String GroupExDescription;

    /**
     * Get 人员库自定义描述字段Index，从0开始
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupExDescriptionIndex 人员库自定义描述字段Index，从0开始
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupExDescriptionIndex() {
        return this.GroupExDescriptionIndex;
    }

    /**
     * Set 人员库自定义描述字段Index，从0开始
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupExDescriptionIndex 人员库自定义描述字段Index，从0开始
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupExDescriptionIndex(Long GroupExDescriptionIndex) {
        this.GroupExDescriptionIndex = GroupExDescriptionIndex;
    }

    /**
     * Get 需要更新的人员库自定义描述字段内容 
     * @return GroupExDescription 需要更新的人员库自定义描述字段内容
     */
    public String getGroupExDescription() {
        return this.GroupExDescription;
    }

    /**
     * Set 需要更新的人员库自定义描述字段内容
     * @param GroupExDescription 需要更新的人员库自定义描述字段内容
     */
    public void setGroupExDescription(String GroupExDescription) {
        this.GroupExDescription = GroupExDescription;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupExDescriptionIndex", this.GroupExDescriptionIndex);
        this.setParamSimple(map, prefix + "GroupExDescription", this.GroupExDescription);

    }
}

