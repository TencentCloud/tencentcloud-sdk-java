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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupCandidate extends AbstractModel {

    /**
    * 人员库ID 。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 识别出的最相似候选人。
    */
    @SerializedName("Candidates")
    @Expose
    private Candidate [] Candidates;

    /**
     * Get 人员库ID 。 
     * @return GroupId 人员库ID 。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 人员库ID 。
     * @param GroupId 人员库ID 。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 识别出的最相似候选人。 
     * @return Candidates 识别出的最相似候选人。
     */
    public Candidate [] getCandidates() {
        return this.Candidates;
    }

    /**
     * Set 识别出的最相似候选人。
     * @param Candidates 识别出的最相似候选人。
     */
    public void setCandidates(Candidate [] Candidates) {
        this.Candidates = Candidates;
    }

    public GroupCandidate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupCandidate(GroupCandidate source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Candidates != null) {
            this.Candidates = new Candidate[source.Candidates.length];
            for (int i = 0; i < source.Candidates.length; i++) {
                this.Candidates[i] = new Candidate(source.Candidates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "Candidates.", this.Candidates);

    }
}

