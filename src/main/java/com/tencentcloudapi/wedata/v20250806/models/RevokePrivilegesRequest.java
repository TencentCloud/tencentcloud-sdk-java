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

public class RevokePrivilegesRequest extends AbstractModel {

    /**
    * 资源数组，数据来源于ListPermissions接口返回的Resource中的ResourceType和ResourceUri
    */
    @SerializedName("Resources")
    @Expose
    private PrivilegeResource [] Resources;

    /**
    * 授权回收主体数组，参数组装需要注意：
1.SubjectType 和SubjectValues的取值参考ListPermissions接口中返回SubjectDetails中的SubjectType和SubjectValue
2.批量回收时，Subjects数组长度需要与权限点Privileges长度一致，并且数据一一对应
    */
    @SerializedName("Subjects")
    @Expose
    private Subject [] Subjects;

    /**
    * 权限点，Name来源于ListPermissions接口返回的PermissionDetails中的Name，例如：BROWSE 、GRANT_PRIVILEGES
    */
    @SerializedName("Privileges")
    @Expose
    private PrivilegeInfo [] Privileges;

    /**
     * Get 资源数组，数据来源于ListPermissions接口返回的Resource中的ResourceType和ResourceUri 
     * @return Resources 资源数组，数据来源于ListPermissions接口返回的Resource中的ResourceType和ResourceUri
     */
    public PrivilegeResource [] getResources() {
        return this.Resources;
    }

    /**
     * Set 资源数组，数据来源于ListPermissions接口返回的Resource中的ResourceType和ResourceUri
     * @param Resources 资源数组，数据来源于ListPermissions接口返回的Resource中的ResourceType和ResourceUri
     */
    public void setResources(PrivilegeResource [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 授权回收主体数组，参数组装需要注意：
1.SubjectType 和SubjectValues的取值参考ListPermissions接口中返回SubjectDetails中的SubjectType和SubjectValue
2.批量回收时，Subjects数组长度需要与权限点Privileges长度一致，并且数据一一对应 
     * @return Subjects 授权回收主体数组，参数组装需要注意：
1.SubjectType 和SubjectValues的取值参考ListPermissions接口中返回SubjectDetails中的SubjectType和SubjectValue
2.批量回收时，Subjects数组长度需要与权限点Privileges长度一致，并且数据一一对应
     */
    public Subject [] getSubjects() {
        return this.Subjects;
    }

    /**
     * Set 授权回收主体数组，参数组装需要注意：
1.SubjectType 和SubjectValues的取值参考ListPermissions接口中返回SubjectDetails中的SubjectType和SubjectValue
2.批量回收时，Subjects数组长度需要与权限点Privileges长度一致，并且数据一一对应
     * @param Subjects 授权回收主体数组，参数组装需要注意：
1.SubjectType 和SubjectValues的取值参考ListPermissions接口中返回SubjectDetails中的SubjectType和SubjectValue
2.批量回收时，Subjects数组长度需要与权限点Privileges长度一致，并且数据一一对应
     */
    public void setSubjects(Subject [] Subjects) {
        this.Subjects = Subjects;
    }

    /**
     * Get 权限点，Name来源于ListPermissions接口返回的PermissionDetails中的Name，例如：BROWSE 、GRANT_PRIVILEGES 
     * @return Privileges 权限点，Name来源于ListPermissions接口返回的PermissionDetails中的Name，例如：BROWSE 、GRANT_PRIVILEGES
     */
    public PrivilegeInfo [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set 权限点，Name来源于ListPermissions接口返回的PermissionDetails中的Name，例如：BROWSE 、GRANT_PRIVILEGES
     * @param Privileges 权限点，Name来源于ListPermissions接口返回的PermissionDetails中的Name，例如：BROWSE 、GRANT_PRIVILEGES
     */
    public void setPrivileges(PrivilegeInfo [] Privileges) {
        this.Privileges = Privileges;
    }

    public RevokePrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RevokePrivilegesRequest(RevokePrivilegesRequest source) {
        if (source.Resources != null) {
            this.Resources = new PrivilegeResource[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new PrivilegeResource(source.Resources[i]);
            }
        }
        if (source.Subjects != null) {
            this.Subjects = new Subject[source.Subjects.length];
            for (int i = 0; i < source.Subjects.length; i++) {
                this.Subjects[i] = new Subject(source.Subjects[i]);
            }
        }
        if (source.Privileges != null) {
            this.Privileges = new PrivilegeInfo[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new PrivilegeInfo(source.Privileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamArrayObj(map, prefix + "Subjects.", this.Subjects);
        this.setParamArrayObj(map, prefix + "Privileges.", this.Privileges);

    }
}

