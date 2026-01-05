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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExploreAuthorizationRecycleObject extends AbstractModel {

    /**
    * 文件资源信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private ExploreFileResource Resource;

    /**
    * 授权详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecycleSubjects")
    @Expose
    private ExploreAuthorizeSubject [] RecycleSubjects;

    /**
     * Get 文件资源信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 文件资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExploreFileResource getResource() {
        return this.Resource;
    }

    /**
     * Set 文件资源信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 文件资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(ExploreFileResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 授权详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecycleSubjects 授权详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExploreAuthorizeSubject [] getRecycleSubjects() {
        return this.RecycleSubjects;
    }

    /**
     * Set 授权详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecycleSubjects 授权详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecycleSubjects(ExploreAuthorizeSubject [] RecycleSubjects) {
        this.RecycleSubjects = RecycleSubjects;
    }

    public ExploreAuthorizationRecycleObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExploreAuthorizationRecycleObject(ExploreAuthorizationRecycleObject source) {
        if (source.Resource != null) {
            this.Resource = new ExploreFileResource(source.Resource);
        }
        if (source.RecycleSubjects != null) {
            this.RecycleSubjects = new ExploreAuthorizeSubject[source.RecycleSubjects.length];
            for (int i = 0; i < source.RecycleSubjects.length; i++) {
                this.RecycleSubjects[i] = new ExploreAuthorizeSubject(source.RecycleSubjects[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamArrayObj(map, prefix + "RecycleSubjects.", this.RecycleSubjects);

    }
}

