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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleTemplateHistory extends AbstractModel{

    /**
    * 模版ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 版本
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 用户Id
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * 用户昵称
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 变更类型1.新增2.修改3.删除
    */
    @SerializedName("AlterType")
    @Expose
    private Long AlterType;

    /**
    * 变更内容
    */
    @SerializedName("AlterContent")
    @Expose
    private String AlterContent;

    /**
     * Get 模版ID 
     * @return TemplateId 模版ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模版ID
     * @param TemplateId 模版ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 版本 
     * @return Version 版本
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 版本
     * @param Version 版本
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get 用户Id 
     * @return UserId 用户Id
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户Id
     * @param UserId 用户Id
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户昵称 
     * @return UserName 用户昵称
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户昵称
     * @param UserName 用户昵称
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 变更类型1.新增2.修改3.删除 
     * @return AlterType 变更类型1.新增2.修改3.删除
     */
    public Long getAlterType() {
        return this.AlterType;
    }

    /**
     * Set 变更类型1.新增2.修改3.删除
     * @param AlterType 变更类型1.新增2.修改3.删除
     */
    public void setAlterType(Long AlterType) {
        this.AlterType = AlterType;
    }

    /**
     * Get 变更内容 
     * @return AlterContent 变更内容
     */
    public String getAlterContent() {
        return this.AlterContent;
    }

    /**
     * Set 变更内容
     * @param AlterContent 变更内容
     */
    public void setAlterContent(String AlterContent) {
        this.AlterContent = AlterContent;
    }

    public RuleTemplateHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleTemplateHistory(RuleTemplateHistory source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.AlterType != null) {
            this.AlterType = new Long(source.AlterType);
        }
        if (source.AlterContent != null) {
            this.AlterContent = new String(source.AlterContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "AlterType", this.AlterType);
        this.setParamSimple(map, prefix + "AlterContent", this.AlterContent);

    }
}

