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

public class PersonGroupInfo  extends AbstractModel{

    /**
    * 包含此人员的人员库ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 人员描述字段内容
    */
    @SerializedName("PersonExDescriptions")
    @Expose
    private String [] PersonExDescriptions;

    /**
     * 获取包含此人员的人员库ID
     * @return GroupId 包含此人员的人员库ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * 设置包含此人员的人员库ID
     * @param GroupId 包含此人员的人员库ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * 获取人员描述字段内容
     * @return PersonExDescriptions 人员描述字段内容
     */
    public String [] getPersonExDescriptions() {
        return this.PersonExDescriptions;
    }

    /**
     * 设置人员描述字段内容
     * @param PersonExDescriptions 人员描述字段内容
     */
    public void setPersonExDescriptions(String [] PersonExDescriptions) {
        this.PersonExDescriptions = PersonExDescriptions;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "PersonExDescriptions.", this.PersonExDescriptions);

    }
}

