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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupBaseInfo extends AbstractModel{

    /**
    * 待创建群组名
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 群组主讲人ID
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
     * Get 待创建群组名 
     * @return GroupName 待创建群组名
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 待创建群组名
     * @param GroupName 待创建群组名
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 群组主讲人ID 
     * @return TeacherId 群组主讲人ID
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 群组主讲人ID
     * @param TeacherId 群组主讲人ID
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    public GroupBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupBaseInfo(GroupBaseInfo source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);

    }
}

