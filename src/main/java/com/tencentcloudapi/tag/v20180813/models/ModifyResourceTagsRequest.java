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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourceTagsRequest extends AbstractModel {

    /**
    * [ 资源六段式描述 ](https://cloud.tencent.com/document/product/598/10606)
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 需要增加或修改的标签集合。如果Resource描述的资源未关联输入的标签键，则增加关联；若已关联，则将该资源关联的键对应的标签值修改为输入值。本接口中ReplaceTags和DeleteTags二者必须存在其一，且二者不能包含相同的标签键。可以不传该参数，但不能是空数组。标签数量不超过10个。
    */
    @SerializedName("ReplaceTags")
    @Expose
    private Tag [] ReplaceTags;

    /**
    * 需要解关联的标签集合。本接口中ReplaceTags和DeleteTags二者必须存在其一，且二者不能包含相同的标签键。可以不传该参数，但不能是空数组。标签数量不超过10个。
    */
    @SerializedName("DeleteTags")
    @Expose
    private TagKeyObject [] DeleteTags;

    /**
     * Get [ 资源六段式描述 ](https://cloud.tencent.com/document/product/598/10606) 
     * @return Resource [ 资源六段式描述 ](https://cloud.tencent.com/document/product/598/10606)
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set [ 资源六段式描述 ](https://cloud.tencent.com/document/product/598/10606)
     * @param Resource [ 资源六段式描述 ](https://cloud.tencent.com/document/product/598/10606)
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 需要增加或修改的标签集合。如果Resource描述的资源未关联输入的标签键，则增加关联；若已关联，则将该资源关联的键对应的标签值修改为输入值。本接口中ReplaceTags和DeleteTags二者必须存在其一，且二者不能包含相同的标签键。可以不传该参数，但不能是空数组。标签数量不超过10个。 
     * @return ReplaceTags 需要增加或修改的标签集合。如果Resource描述的资源未关联输入的标签键，则增加关联；若已关联，则将该资源关联的键对应的标签值修改为输入值。本接口中ReplaceTags和DeleteTags二者必须存在其一，且二者不能包含相同的标签键。可以不传该参数，但不能是空数组。标签数量不超过10个。
     */
    public Tag [] getReplaceTags() {
        return this.ReplaceTags;
    }

    /**
     * Set 需要增加或修改的标签集合。如果Resource描述的资源未关联输入的标签键，则增加关联；若已关联，则将该资源关联的键对应的标签值修改为输入值。本接口中ReplaceTags和DeleteTags二者必须存在其一，且二者不能包含相同的标签键。可以不传该参数，但不能是空数组。标签数量不超过10个。
     * @param ReplaceTags 需要增加或修改的标签集合。如果Resource描述的资源未关联输入的标签键，则增加关联；若已关联，则将该资源关联的键对应的标签值修改为输入值。本接口中ReplaceTags和DeleteTags二者必须存在其一，且二者不能包含相同的标签键。可以不传该参数，但不能是空数组。标签数量不超过10个。
     */
    public void setReplaceTags(Tag [] ReplaceTags) {
        this.ReplaceTags = ReplaceTags;
    }

    /**
     * Get 需要解关联的标签集合。本接口中ReplaceTags和DeleteTags二者必须存在其一，且二者不能包含相同的标签键。可以不传该参数，但不能是空数组。标签数量不超过10个。 
     * @return DeleteTags 需要解关联的标签集合。本接口中ReplaceTags和DeleteTags二者必须存在其一，且二者不能包含相同的标签键。可以不传该参数，但不能是空数组。标签数量不超过10个。
     */
    public TagKeyObject [] getDeleteTags() {
        return this.DeleteTags;
    }

    /**
     * Set 需要解关联的标签集合。本接口中ReplaceTags和DeleteTags二者必须存在其一，且二者不能包含相同的标签键。可以不传该参数，但不能是空数组。标签数量不超过10个。
     * @param DeleteTags 需要解关联的标签集合。本接口中ReplaceTags和DeleteTags二者必须存在其一，且二者不能包含相同的标签键。可以不传该参数，但不能是空数组。标签数量不超过10个。
     */
    public void setDeleteTags(TagKeyObject [] DeleteTags) {
        this.DeleteTags = DeleteTags;
    }

    public ModifyResourceTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceTagsRequest(ModifyResourceTagsRequest source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.ReplaceTags != null) {
            this.ReplaceTags = new Tag[source.ReplaceTags.length];
            for (int i = 0; i < source.ReplaceTags.length; i++) {
                this.ReplaceTags[i] = new Tag(source.ReplaceTags[i]);
            }
        }
        if (source.DeleteTags != null) {
            this.DeleteTags = new TagKeyObject[source.DeleteTags.length];
            for (int i = 0; i < source.DeleteTags.length; i++) {
                this.DeleteTags[i] = new TagKeyObject(source.DeleteTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamArrayObj(map, prefix + "ReplaceTags.", this.ReplaceTags);
        this.setParamArrayObj(map, prefix + "DeleteTags.", this.DeleteTags);

    }
}

