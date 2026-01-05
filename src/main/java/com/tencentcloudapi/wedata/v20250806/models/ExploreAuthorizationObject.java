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

public class ExploreAuthorizationObject extends AbstractModel {

    /**
    * 授权资源信息，包含resourceId和resourceType
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private ExploreFileResource Resource;

    /**
    * 授权详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizeSubjects")
    @Expose
    private ExploreAuthorizeSubject [] AuthorizeSubjects;

    /**
     * Get 授权资源信息，包含resourceId和resourceType
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 授权资源信息，包含resourceId和resourceType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExploreFileResource getResource() {
        return this.Resource;
    }

    /**
     * Set 授权资源信息，包含resourceId和resourceType
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 授权资源信息，包含resourceId和resourceType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(ExploreFileResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 授权详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizeSubjects 授权详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExploreAuthorizeSubject [] getAuthorizeSubjects() {
        return this.AuthorizeSubjects;
    }

    /**
     * Set 授权详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizeSubjects 授权详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorizeSubjects(ExploreAuthorizeSubject [] AuthorizeSubjects) {
        this.AuthorizeSubjects = AuthorizeSubjects;
    }

    public ExploreAuthorizationObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExploreAuthorizationObject(ExploreAuthorizationObject source) {
        if (source.Resource != null) {
            this.Resource = new ExploreFileResource(source.Resource);
        }
        if (source.AuthorizeSubjects != null) {
            this.AuthorizeSubjects = new ExploreAuthorizeSubject[source.AuthorizeSubjects.length];
            for (int i = 0; i < source.AuthorizeSubjects.length; i++) {
                this.AuthorizeSubjects[i] = new ExploreAuthorizeSubject(source.AuthorizeSubjects[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamArrayObj(map, prefix + "AuthorizeSubjects.", this.AuthorizeSubjects);

    }
}

