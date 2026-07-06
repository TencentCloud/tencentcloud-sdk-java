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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEdgeAclRuleSequenceRequest extends AbstractModel {

    /**
    * 出入站方向 0=出向，1=入向
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 规则组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 规则序号调整列表，必须包含所有受影响的规则
    */
    @SerializedName("Sequences")
    @Expose
    private SequenceIndex [] Sequences;

    /**
     * Get 出入站方向 0=出向，1=入向 
     * @return Direction 出入站方向 0=出向，1=入向
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 出入站方向 0=出向，1=入向
     * @param Direction 出入站方向 0=出向，1=入向
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 规则组ID 
     * @return GroupId 规则组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 规则组ID
     * @param GroupId 规则组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 规则序号调整列表，必须包含所有受影响的规则 
     * @return Sequences 规则序号调整列表，必须包含所有受影响的规则
     */
    public SequenceIndex [] getSequences() {
        return this.Sequences;
    }

    /**
     * Set 规则序号调整列表，必须包含所有受影响的规则
     * @param Sequences 规则序号调整列表，必须包含所有受影响的规则
     */
    public void setSequences(SequenceIndex [] Sequences) {
        this.Sequences = Sequences;
    }

    public ModifyEdgeAclRuleSequenceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEdgeAclRuleSequenceRequest(ModifyEdgeAclRuleSequenceRequest source) {
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Sequences != null) {
            this.Sequences = new SequenceIndex[source.Sequences.length];
            for (int i = 0; i < source.Sequences.length; i++) {
                this.Sequences[i] = new SequenceIndex(source.Sequences[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "Sequences.", this.Sequences);

    }
}

