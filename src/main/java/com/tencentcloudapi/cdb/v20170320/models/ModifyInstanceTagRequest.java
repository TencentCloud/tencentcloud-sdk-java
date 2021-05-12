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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceTagRequest extends AbstractModel{

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 要增加或修改的标签。
    */
    @SerializedName("ReplaceTags")
    @Expose
    private TagInfo [] ReplaceTags;

    /**
    * 要删除的标签。
    */
    @SerializedName("DeleteTags")
    @Expose
    private TagInfo [] DeleteTags;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 要增加或修改的标签。 
     * @return ReplaceTags 要增加或修改的标签。
     */
    public TagInfo [] getReplaceTags() {
        return this.ReplaceTags;
    }

    /**
     * Set 要增加或修改的标签。
     * @param ReplaceTags 要增加或修改的标签。
     */
    public void setReplaceTags(TagInfo [] ReplaceTags) {
        this.ReplaceTags = ReplaceTags;
    }

    /**
     * Get 要删除的标签。 
     * @return DeleteTags 要删除的标签。
     */
    public TagInfo [] getDeleteTags() {
        return this.DeleteTags;
    }

    /**
     * Set 要删除的标签。
     * @param DeleteTags 要删除的标签。
     */
    public void setDeleteTags(TagInfo [] DeleteTags) {
        this.DeleteTags = DeleteTags;
    }

    public ModifyInstanceTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceTagRequest(ModifyInstanceTagRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ReplaceTags != null) {
            this.ReplaceTags = new TagInfo[source.ReplaceTags.length];
            for (int i = 0; i < source.ReplaceTags.length; i++) {
                this.ReplaceTags[i] = new TagInfo(source.ReplaceTags[i]);
            }
        }
        if (source.DeleteTags != null) {
            this.DeleteTags = new TagInfo[source.DeleteTags.length];
            for (int i = 0; i < source.DeleteTags.length; i++) {
                this.DeleteTags[i] = new TagInfo(source.DeleteTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "ReplaceTags.", this.ReplaceTags);
        this.setParamArrayObj(map, prefix + "DeleteTags.", this.DeleteTags);

    }
}

