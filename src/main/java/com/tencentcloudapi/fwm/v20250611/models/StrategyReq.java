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

public class StrategyReq extends AbstractModel {

    /**
    * 规则组Id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 优先级
    */
    @SerializedName("Sequence")
    @Expose
    private Long Sequence;

    /**
     * Get 规则组Id 
     * @return GroupId 规则组Id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 规则组Id
     * @param GroupId 规则组Id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 优先级 
     * @return Sequence 优先级
     */
    public Long getSequence() {
        return this.Sequence;
    }

    /**
     * Set 优先级
     * @param Sequence 优先级
     */
    public void setSequence(Long Sequence) {
        this.Sequence = Sequence;
    }

    public StrategyReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StrategyReq(StrategyReq source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Sequence != null) {
            this.Sequence = new Long(source.Sequence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);

    }
}

