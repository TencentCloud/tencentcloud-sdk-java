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

public class CreateApiGroupRequest extends AbstractModel{

    /**
    * 分组名称, 不能包含中文
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 分组上下文
    */
    @SerializedName("GroupContext")
    @Expose
    private String GroupContext;

    /**
    * 鉴权类型。secret： 密钥鉴权； none:无鉴权
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 分组类型,默认ms。 ms： 微服务分组； external:外部Api分组
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * 网关实体ID
    */
    @SerializedName("GatewayInstanceId")
    @Expose
    private String GatewayInstanceId;

    /**
     * Get 分组名称, 不能包含中文 
     * @return GroupName 分组名称, 不能包含中文
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称, 不能包含中文
     * @param GroupName 分组名称, 不能包含中文
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
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

    /**
     * Get 鉴权类型。secret： 密钥鉴权； none:无鉴权 
     * @return AuthType 鉴权类型。secret： 密钥鉴权； none:无鉴权
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 鉴权类型。secret： 密钥鉴权； none:无鉴权
     * @param AuthType 鉴权类型。secret： 密钥鉴权； none:无鉴权
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 备注 
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 分组类型,默认ms。 ms： 微服务分组； external:外部Api分组 
     * @return GroupType 分组类型,默认ms。 ms： 微服务分组； external:外部Api分组
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 分组类型,默认ms。 ms： 微服务分组； external:外部Api分组
     * @param GroupType 分组类型,默认ms。 ms： 微服务分组； external:外部Api分组
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 网关实体ID 
     * @return GatewayInstanceId 网关实体ID
     */
    public String getGatewayInstanceId() {
        return this.GatewayInstanceId;
    }

    /**
     * Set 网关实体ID
     * @param GatewayInstanceId 网关实体ID
     */
    public void setGatewayInstanceId(String GatewayInstanceId) {
        this.GatewayInstanceId = GatewayInstanceId;
    }

    public CreateApiGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApiGroupRequest(CreateApiGroupRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupContext != null) {
            this.GroupContext = new String(source.GroupContext);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.GatewayInstanceId != null) {
            this.GatewayInstanceId = new String(source.GatewayInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupContext", this.GroupContext);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "GatewayInstanceId", this.GatewayInstanceId);

    }
}

