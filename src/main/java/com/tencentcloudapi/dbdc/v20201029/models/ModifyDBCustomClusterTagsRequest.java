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

public class ModifyDBCustomClusterTagsRequest extends AbstractModel {

    /**
    * <p>DB Custom 集群ID</p><p>参数格式：dbcc-xxxxxxxx</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>为 DB Custom 集群绑定的标签信息</p><p>入参限制：参考标签平台的限制策略</p><p>如果集群未关联输入的标签键，则增加关联；若已关联，则将该集群关联的键对应的标签值修改为输入值。本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
    */
    @SerializedName("AddTags")
    @Expose
    private Tag [] AddTags;

    /**
    * <p>为 DB Custom 集群解关联的标签Key</p><p>本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
    */
    @SerializedName("DeleteTagKeys")
    @Expose
    private String [] DeleteTagKeys;

    /**
     * Get <p>DB Custom 集群ID</p><p>参数格式：dbcc-xxxxxxxx</p> 
     * @return ClusterId <p>DB Custom 集群ID</p><p>参数格式：dbcc-xxxxxxxx</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>DB Custom 集群ID</p><p>参数格式：dbcc-xxxxxxxx</p>
     * @param ClusterId <p>DB Custom 集群ID</p><p>参数格式：dbcc-xxxxxxxx</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>为 DB Custom 集群绑定的标签信息</p><p>入参限制：参考标签平台的限制策略</p><p>如果集群未关联输入的标签键，则增加关联；若已关联，则将该集群关联的键对应的标签值修改为输入值。本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p> 
     * @return AddTags <p>为 DB Custom 集群绑定的标签信息</p><p>入参限制：参考标签平台的限制策略</p><p>如果集群未关联输入的标签键，则增加关联；若已关联，则将该集群关联的键对应的标签值修改为输入值。本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
     */
    public Tag [] getAddTags() {
        return this.AddTags;
    }

    /**
     * Set <p>为 DB Custom 集群绑定的标签信息</p><p>入参限制：参考标签平台的限制策略</p><p>如果集群未关联输入的标签键，则增加关联；若已关联，则将该集群关联的键对应的标签值修改为输入值。本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
     * @param AddTags <p>为 DB Custom 集群绑定的标签信息</p><p>入参限制：参考标签平台的限制策略</p><p>如果集群未关联输入的标签键，则增加关联；若已关联，则将该集群关联的键对应的标签值修改为输入值。本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
     */
    public void setAddTags(Tag [] AddTags) {
        this.AddTags = AddTags;
    }

    /**
     * Get <p>为 DB Custom 集群解关联的标签Key</p><p>本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p> 
     * @return DeleteTagKeys <p>为 DB Custom 集群解关联的标签Key</p><p>本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
     */
    public String [] getDeleteTagKeys() {
        return this.DeleteTagKeys;
    }

    /**
     * Set <p>为 DB Custom 集群解关联的标签Key</p><p>本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
     * @param DeleteTagKeys <p>为 DB Custom 集群解关联的标签Key</p><p>本接口中 AddTags 和 DeleteTagKeys 二者必须存在其一，且二者不能包含相同的标签键。</p>
     */
    public void setDeleteTagKeys(String [] DeleteTagKeys) {
        this.DeleteTagKeys = DeleteTagKeys;
    }

    public ModifyDBCustomClusterTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBCustomClusterTagsRequest(ModifyDBCustomClusterTagsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "AddTags.", this.AddTags);
        this.setParamArraySimple(map, prefix + "DeleteTagKeys.", this.DeleteTagKeys);

    }
}

