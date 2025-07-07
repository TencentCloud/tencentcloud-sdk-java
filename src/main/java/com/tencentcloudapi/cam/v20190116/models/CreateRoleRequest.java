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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRoleRequest extends AbstractModel {

    /**
    * 角色名称。长度为1~128个字符，可包含英文字母、数字和+=,.@-_。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * 角色描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否允许登录 1 为允许 0 为不允许
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * 申请角色临时密钥的最长有效期限制(范围：0~43200)
    */
    @SerializedName("SessionDuration")
    @Expose
    private Long SessionDuration;

    /**
    * 角色绑定标签
    */
    @SerializedName("Tags")
    @Expose
    private RoleTags [] Tags;

    /**
     * Get 角色名称。长度为1~128个字符，可包含英文字母、数字和+=,.@-_。 
     * @return RoleName 角色名称。长度为1~128个字符，可包含英文字母、数字和+=,.@-_。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称。长度为1~128个字符，可包含英文字母、数字和+=,.@-_。
     * @param RoleName 角色名称。长度为1~128个字符，可包含英文字母、数字和+=,.@-_。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo 
     * @return PolicyDocument 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Set 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo
     * @param PolicyDocument 策略文档，示例：{"version":"2.0","statement":[{"action":"name/sts:AssumeRole","effect":"allow","principal":{"service":["cloudaudit.cloud.tencent.com","cls.cloud.tencent.com"]}}]}，principal用于指定角色的授权对象。获取该参数可参阅 获取角色详情（https://cloud.tencent.com/document/product/598/36221） 输出参数RoleInfo
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * Get 角色描述 
     * @return Description 角色描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 角色描述
     * @param Description 角色描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否允许登录 1 为允许 0 为不允许 
     * @return ConsoleLogin 是否允许登录 1 为允许 0 为不允许
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set 是否允许登录 1 为允许 0 为不允许
     * @param ConsoleLogin 是否允许登录 1 为允许 0 为不允许
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Get 申请角色临时密钥的最长有效期限制(范围：0~43200) 
     * @return SessionDuration 申请角色临时密钥的最长有效期限制(范围：0~43200)
     */
    public Long getSessionDuration() {
        return this.SessionDuration;
    }

    /**
     * Set 申请角色临时密钥的最长有效期限制(范围：0~43200)
     * @param SessionDuration 申请角色临时密钥的最长有效期限制(范围：0~43200)
     */
    public void setSessionDuration(Long SessionDuration) {
        this.SessionDuration = SessionDuration;
    }

    /**
     * Get 角色绑定标签 
     * @return Tags 角色绑定标签
     */
    public RoleTags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 角色绑定标签
     * @param Tags 角色绑定标签
     */
    public void setTags(RoleTags [] Tags) {
        this.Tags = Tags;
    }

    public CreateRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoleRequest(CreateRoleRequest source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.PolicyDocument != null) {
            this.PolicyDocument = new String(source.PolicyDocument);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConsoleLogin != null) {
            this.ConsoleLogin = new Long(source.ConsoleLogin);
        }
        if (source.SessionDuration != null) {
            this.SessionDuration = new Long(source.SessionDuration);
        }
        if (source.Tags != null) {
            this.Tags = new RoleTags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new RoleTags(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);
        this.setParamSimple(map, prefix + "SessionDuration", this.SessionDuration);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

