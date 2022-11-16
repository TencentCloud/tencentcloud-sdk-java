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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MoveOrganizationNodeMembersRequest extends AbstractModel{

    /**
    * 组织节点ID。
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * 成员UIN列表。
    */
    @SerializedName("MemberUin")
    @Expose
    private Long [] MemberUin;

    /**
     * Get 组织节点ID。 
     * @return NodeId 组织节点ID。
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 组织节点ID。
     * @param NodeId 组织节点ID。
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 成员UIN列表。 
     * @return MemberUin 成员UIN列表。
     */
    public Long [] getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 成员UIN列表。
     * @param MemberUin 成员UIN列表。
     */
    public void setMemberUin(Long [] MemberUin) {
        this.MemberUin = MemberUin;
    }

    public MoveOrganizationNodeMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MoveOrganizationNodeMembersRequest(MoveOrganizationNodeMembersRequest source) {
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long[source.MemberUin.length];
            for (int i = 0; i < source.MemberUin.length; i++) {
                this.MemberUin[i] = new Long(source.MemberUin[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamArraySimple(map, prefix + "MemberUin.", this.MemberUin);

    }
}

