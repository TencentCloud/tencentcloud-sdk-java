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

public class CreateCodePermissionsRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 权限操作对象
    */
    @SerializedName("AuthorizePermissionObjects")
    @Expose
    private ExploreAuthorizationObject [] AuthorizePermissionObjects;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 权限操作对象 
     * @return AuthorizePermissionObjects 权限操作对象
     */
    public ExploreAuthorizationObject [] getAuthorizePermissionObjects() {
        return this.AuthorizePermissionObjects;
    }

    /**
     * Set 权限操作对象
     * @param AuthorizePermissionObjects 权限操作对象
     */
    public void setAuthorizePermissionObjects(ExploreAuthorizationObject [] AuthorizePermissionObjects) {
        this.AuthorizePermissionObjects = AuthorizePermissionObjects;
    }

    public CreateCodePermissionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCodePermissionsRequest(CreateCodePermissionsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AuthorizePermissionObjects != null) {
            this.AuthorizePermissionObjects = new ExploreAuthorizationObject[source.AuthorizePermissionObjects.length];
            for (int i = 0; i < source.AuthorizePermissionObjects.length; i++) {
                this.AuthorizePermissionObjects[i] = new ExploreAuthorizationObject(source.AuthorizePermissionObjects[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "AuthorizePermissionObjects.", this.AuthorizePermissionObjects);

    }
}

