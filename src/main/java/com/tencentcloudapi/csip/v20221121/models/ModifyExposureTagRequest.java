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

public class ModifyExposureTagRequest extends AbstractModel {

    /**
    * 云边界分析ID集合
    */
    @SerializedName("ExposureIDs")
    @Expose
    private Long [] ExposureIDs;

    /**
    * 标签
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 备注
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 云边界分析ID集合 
     * @return ExposureIDs 云边界分析ID集合
     */
    public Long [] getExposureIDs() {
        return this.ExposureIDs;
    }

    /**
     * Set 云边界分析ID集合
     * @param ExposureIDs 云边界分析ID集合
     */
    public void setExposureIDs(Long [] ExposureIDs) {
        this.ExposureIDs = ExposureIDs;
    }

    /**
     * Get 标签 
     * @return Tag 标签
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 标签
     * @param Tag 标签
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 备注 
     * @return Comment 备注
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 备注
     * @param Comment 备注
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public ModifyExposureTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyExposureTagRequest(ModifyExposureTagRequest source) {
        if (source.ExposureIDs != null) {
            this.ExposureIDs = new Long[source.ExposureIDs.length];
            for (int i = 0; i < source.ExposureIDs.length; i++) {
                this.ExposureIDs[i] = new Long(source.ExposureIDs[i]);
            }
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ExposureIDs.", this.ExposureIDs);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

