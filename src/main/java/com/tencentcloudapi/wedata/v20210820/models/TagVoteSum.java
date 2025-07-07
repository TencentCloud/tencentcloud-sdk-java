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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagVoteSum extends AbstractModel {

    /**
    * 标签id
    */
    @SerializedName("TagId")
    @Expose
    private Long TagId;

    /**
    * 该表该标签投票次数
    */
    @SerializedName("VoteSum")
    @Expose
    private Long VoteSum;

    /**
    * 当前用户对这张表是否加了该标签 true 已添加 false 未添加
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 标签名
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
     * Get 标签id 
     * @return TagId 标签id
     */
    public Long getTagId() {
        return this.TagId;
    }

    /**
     * Set 标签id
     * @param TagId 标签id
     */
    public void setTagId(Long TagId) {
        this.TagId = TagId;
    }

    /**
     * Get 该表该标签投票次数 
     * @return VoteSum 该表该标签投票次数
     */
    public Long getVoteSum() {
        return this.VoteSum;
    }

    /**
     * Set 该表该标签投票次数
     * @param VoteSum 该表该标签投票次数
     */
    public void setVoteSum(Long VoteSum) {
        this.VoteSum = VoteSum;
    }

    /**
     * Get 当前用户对这张表是否加了该标签 true 已添加 false 未添加 
     * @return Status 当前用户对这张表是否加了该标签 true 已添加 false 未添加
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 当前用户对这张表是否加了该标签 true 已添加 false 未添加
     * @param Status 当前用户对这张表是否加了该标签 true 已添加 false 未添加
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 标签名 
     * @return TagName 标签名
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 标签名
     * @param TagName 标签名
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    public TagVoteSum() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagVoteSum(TagVoteSum source) {
        if (source.TagId != null) {
            this.TagId = new Long(source.TagId);
        }
        if (source.VoteSum != null) {
            this.VoteSum = new Long(source.VoteSum);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "VoteSum", this.VoteSum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TagName", this.TagName);

    }
}

