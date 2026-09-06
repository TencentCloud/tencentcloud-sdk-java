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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBCustomDisasterRecoverGroupTagsRequest extends AbstractModel {

    /**
    * <p>置放群组ID</p>
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * <p>为 DB Custom 置放群组绑定的标签信息</p><p>入参限制：参考标签侧的限制</p><p>如果置放群组未关联输入的标签键，则增加关联；若已关联，则将该置放群组关联的键对应的标签值修改为输入值。本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
    */
    @SerializedName("AddTags")
    @Expose
    private Tag [] AddTags;

    /**
    * <p>需要解关联的标签Key</p><p>本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
    */
    @SerializedName("DeleteTagKeys")
    @Expose
    private String [] DeleteTagKeys;

    /**
     * Get <p>置放群组ID</p> 
     * @return DisasterRecoverGroupId <p>置放群组ID</p>
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set <p>置放群组ID</p>
     * @param DisasterRecoverGroupId <p>置放群组ID</p>
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get <p>为 DB Custom 置放群组绑定的标签信息</p><p>入参限制：参考标签侧的限制</p><p>如果置放群组未关联输入的标签键，则增加关联；若已关联，则将该置放群组关联的键对应的标签值修改为输入值。本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p> 
     * @return AddTags <p>为 DB Custom 置放群组绑定的标签信息</p><p>入参限制：参考标签侧的限制</p><p>如果置放群组未关联输入的标签键，则增加关联；若已关联，则将该置放群组关联的键对应的标签值修改为输入值。本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
     */
    public Tag [] getAddTags() {
        return this.AddTags;
    }

    /**
     * Set <p>为 DB Custom 置放群组绑定的标签信息</p><p>入参限制：参考标签侧的限制</p><p>如果置放群组未关联输入的标签键，则增加关联；若已关联，则将该置放群组关联的键对应的标签值修改为输入值。本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
     * @param AddTags <p>为 DB Custom 置放群组绑定的标签信息</p><p>入参限制：参考标签侧的限制</p><p>如果置放群组未关联输入的标签键，则增加关联；若已关联，则将该置放群组关联的键对应的标签值修改为输入值。本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
     */
    public void setAddTags(Tag [] AddTags) {
        this.AddTags = AddTags;
    }

    /**
     * Get <p>需要解关联的标签Key</p><p>本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p> 
     * @return DeleteTagKeys <p>需要解关联的标签Key</p><p>本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
     */
    public String [] getDeleteTagKeys() {
        return this.DeleteTagKeys;
    }

    /**
     * Set <p>需要解关联的标签Key</p><p>本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
     * @param DeleteTagKeys <p>需要解关联的标签Key</p><p>本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
     */
    public void setDeleteTagKeys(String [] DeleteTagKeys) {
        this.DeleteTagKeys = DeleteTagKeys;
    }

    public ModifyDBCustomDisasterRecoverGroupTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBCustomDisasterRecoverGroupTagsRequest(ModifyDBCustomDisasterRecoverGroupTagsRequest source) {
        if (source.DisasterRecoverGroupId != null) {
            this.DisasterRecoverGroupId = new String(source.DisasterRecoverGroupId);
        }
        if (source.AddTags != null) {
            this.AddTags = new Tag[source.AddTags.length];
            for (int i = 0; i < source.AddTags.length; i++) {
                this.AddTags[i] = new Tag(source.AddTags[i]);
            }
        }
        if (source.DeleteTagKeys != null) {
            this.DeleteTagKeys = new String[source.DeleteTagKeys.length];
            for (int i = 0; i < source.DeleteTagKeys.length; i++) {
                this.DeleteTagKeys[i] = new String(source.DeleteTagKeys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamArrayObj(map, prefix + "AddTags.", this.AddTags);
        this.setParamArraySimple(map, prefix + "DeleteTagKeys.", this.DeleteTagKeys);

    }
}

