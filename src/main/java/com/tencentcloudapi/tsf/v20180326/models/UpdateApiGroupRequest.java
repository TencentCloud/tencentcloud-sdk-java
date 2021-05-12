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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateApiGroupRequest extends AbstractModel{

    /**
    * Api 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Api 分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Api 分组描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 鉴权类型
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * 分组上下文
    */
    @SerializedName("GroupContext")
    @Expose
    private String GroupContext;

    /**
     * Get Api 分组ID 
     * @return GroupId Api 分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Api 分组ID
     * @param GroupId Api 分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Api 分组名称 
     * @return GroupName Api 分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Api 分组名称
     * @param GroupName Api 分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Api 分组描述 
     * @return Description Api 分组描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Api 分组描述
     * @param Description Api 分组描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 鉴权类型 
     * @return AuthType 鉴权类型
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 鉴权类型
     * @param AuthType 鉴权类型
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 分组上下文 
     * @return GroupContext 分组上下文
     */
    public String getGroupContext() {
        return this.GroupContext;
    }

    /**
     * Set 分组上下文
     * @param GroupContext 分组上下文
     */
    public void setGroupContext(String GroupContext) {
        this.GroupContext = GroupContext;
    }

    public UpdateApiGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateApiGroupRequest(UpdateApiGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.GroupContext != null) {
            this.GroupContext = new String(source.GroupContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "GroupContext", this.GroupContext);

    }
}

