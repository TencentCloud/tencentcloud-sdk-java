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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmApproverStep extends AbstractModel {

    /**
    * 审批人列表
    */
    @SerializedName("ApproverUinSet")
    @Expose
    private DspmUinUser [] ApproverUinSet;

    /**
    * 审批人
    */
    @SerializedName("ApproverUin")
    @Expose
    private String ApproverUin;

    /**
    * 审批状态  0-未审批 1-通过 2-拒绝
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 审批意见
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 审批时间。
    */
    @SerializedName("ApproveTime")
    @Expose
    private String ApproveTime;

    /**
     * Get 审批人列表 
     * @return ApproverUinSet 审批人列表
     */
    public DspmUinUser [] getApproverUinSet() {
        return this.ApproverUinSet;
    }

    /**
     * Set 审批人列表
     * @param ApproverUinSet 审批人列表
     */
    public void setApproverUinSet(DspmUinUser [] ApproverUinSet) {
        this.ApproverUinSet = ApproverUinSet;
    }

    /**
     * Get 审批人 
     * @return ApproverUin 审批人
     */
    public String getApproverUin() {
        return this.ApproverUin;
    }

    /**
     * Set 审批人
     * @param ApproverUin 审批人
     */
    public void setApproverUin(String ApproverUin) {
        this.ApproverUin = ApproverUin;
    }

    /**
     * Get 审批状态  0-未审批 1-通过 2-拒绝 
     * @return Status 审批状态  0-未审批 1-通过 2-拒绝
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 审批状态  0-未审批 1-通过 2-拒绝
     * @param Status 审批状态  0-未审批 1-通过 2-拒绝
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 审批意见 
     * @return Comment 审批意见
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 审批意见
     * @param Comment 审批意见
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 审批时间。 
     * @return ApproveTime 审批时间。
     */
    public String getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set 审批时间。
     * @param ApproveTime 审批时间。
     */
    public void setApproveTime(String ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    public DspmApproverStep() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmApproverStep(DspmApproverStep source) {
        if (source.ApproverUinSet != null) {
            this.ApproverUinSet = new DspmUinUser[source.ApproverUinSet.length];
            for (int i = 0; i < source.ApproverUinSet.length; i++) {
                this.ApproverUinSet[i] = new DspmUinUser(source.ApproverUinSet[i]);
            }
        }
        if (source.ApproverUin != null) {
            this.ApproverUin = new String(source.ApproverUin);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ApproveTime != null) {
            this.ApproveTime = new String(source.ApproveTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ApproverUinSet.", this.ApproverUinSet);
        this.setParamSimple(map, prefix + "ApproverUin", this.ApproverUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "ApproveTime", this.ApproveTime);

    }
}

