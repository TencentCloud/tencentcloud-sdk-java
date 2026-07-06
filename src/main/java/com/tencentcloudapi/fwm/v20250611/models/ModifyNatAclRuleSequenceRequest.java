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

public class ModifyNatAclRuleSequenceRequest extends AbstractModel {

    /**
    * 规则组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 序号调整列表
    */
    @SerializedName("Sequences")
    @Expose
    private SequenceIndex [] Sequences;

    /**
    * 规则方向：1-入站规则，0-出站规则
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

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
     * Get 序号调整列表 
     * @return Sequences 序号调整列表
     */
    public SequenceIndex [] getSequences() {
        return this.Sequences;
    }

    /**
     * Set 序号调整列表
     * @param Sequences 序号调整列表
     */
    public void setSequences(SequenceIndex [] Sequences) {
        this.Sequences = Sequences;
    }

    /**
     * Get 规则方向：1-入站规则，0-出站规则 
     * @return Direction 规则方向：1-入站规则，0-出站规则
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 规则方向：1-入站规则，0-出站规则
     * @param Direction 规则方向：1-入站规则，0-出站规则
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public ModifyNatAclRuleSequenceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatAclRuleSequenceRequest(ModifyNatAclRuleSequenceRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Sequences != null) {
            this.Sequences = new SequenceIndex[source.Sequences.length];
            for (int i = 0; i < source.Sequences.length; i++) {
                this.Sequences[i] = new SequenceIndex(source.Sequences[i]);
            }
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "Sequences.", this.Sequences);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

