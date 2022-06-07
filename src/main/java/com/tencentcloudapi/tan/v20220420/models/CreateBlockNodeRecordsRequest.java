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
package com.tencentcloudapi.tan.v20220420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBlockNodeRecordsRequest extends AbstractModel{

    /**
    * 盘查实例id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 节点id
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 节点记录-json
    */
    @SerializedName("Records")
    @Expose
    private String Records;

    /**
     * Get 盘查实例id 
     * @return GroupId 盘查实例id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 盘查实例id
     * @param GroupId 盘查实例id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 节点id 
     * @return NodeId 节点id
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点id
     * @param NodeId 节点id
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 节点记录-json 
     * @return Records 节点记录-json
     */
    public String getRecords() {
        return this.Records;
    }

    /**
     * Set 节点记录-json
     * @param Records 节点记录-json
     */
    public void setRecords(String Records) {
        this.Records = Records;
    }

    public CreateBlockNodeRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBlockNodeRecordsRequest(CreateBlockNodeRecordsRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Records != null) {
            this.Records = new String(source.Records);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Records", this.Records);

    }
}

