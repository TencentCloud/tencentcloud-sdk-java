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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTagRequest extends AbstractModel {

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 标签ID
    */
    @SerializedName("TagID")
    @Expose
    private Long TagID;

    /**
    * 备注
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 标签ID 
     * @return TagID 标签ID
     */
    public Long getTagID() {
        return this.TagID;
    }

    /**
     * Set 标签ID
     * @param TagID 标签ID
     */
    public void setTagID(Long TagID) {
        this.TagID = TagID;
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

    public ModifyTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTagRequest(ModifyTagRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TagID != null) {
            this.TagID = new Long(source.TagID);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TagID", this.TagID);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

