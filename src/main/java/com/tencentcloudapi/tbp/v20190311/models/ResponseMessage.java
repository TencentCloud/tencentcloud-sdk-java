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
package com.tencentcloudapi.tbp.v20190311.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResponseMessage extends AbstractModel {

    /**
    * 消息组列表。	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupList")
    @Expose
    private Group [] GroupList;

    /**
     * Get 消息组列表。	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupList 消息组列表。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Group [] getGroupList() {
        return this.GroupList;
    }

    /**
     * Set 消息组列表。	
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupList 消息组列表。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupList(Group [] GroupList) {
        this.GroupList = GroupList;
    }

    public ResponseMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResponseMessage(ResponseMessage source) {
        if (source.GroupList != null) {
            this.GroupList = new Group[source.GroupList.length];
            for (int i = 0; i < source.GroupList.length; i++) {
                this.GroupList[i] = new Group(source.GroupList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "GroupList.", this.GroupList);

    }
}

