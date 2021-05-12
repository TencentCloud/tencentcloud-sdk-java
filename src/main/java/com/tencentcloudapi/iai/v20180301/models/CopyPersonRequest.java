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

public class CopyPersonRequest extends AbstractModel{

    /**
    * 人员ID
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 待加入的人员库列表
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
     * Get 人员ID 
     * @return PersonId 人员ID
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员ID
     * @param PersonId 人员ID
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 待加入的人员库列表 
     * @return GroupIds 待加入的人员库列表
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 待加入的人员库列表
     * @param GroupIds 待加入的人员库列表
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    public CopyPersonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyPersonRequest(CopyPersonRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);

    }
}

