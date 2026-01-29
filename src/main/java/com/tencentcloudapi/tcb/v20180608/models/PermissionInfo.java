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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PermissionInfo extends AbstractModel {

    /**
    * "READONLY",   //公有读，私有写。所有用户可读，仅创建者及管理员可写  
"PRIVATE",    //私有读写，仅创建者及管理员可读写  
"ADMINWRITE", //所有用户可读，仅管理员可写  
"ADMINONLY",  //仅管理员可操作  
"CUSTOM",     // 安全规则
    */
    @SerializedName("AclTag")
    @Expose
    private String AclTag;

    /**
    * 云开发环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 自定义规则
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
     * Get "READONLY",   //公有读，私有写。所有用户可读，仅创建者及管理员可写  
"PRIVATE",    //私有读写，仅创建者及管理员可读写  
"ADMINWRITE", //所有用户可读，仅管理员可写  
"ADMINONLY",  //仅管理员可操作  
"CUSTOM",     // 安全规则 
     * @return AclTag "READONLY",   //公有读，私有写。所有用户可读，仅创建者及管理员可写  
"PRIVATE",    //私有读写，仅创建者及管理员可读写  
"ADMINWRITE", //所有用户可读，仅管理员可写  
"ADMINONLY",  //仅管理员可操作  
"CUSTOM",     // 安全规则
     */
    public String getAclTag() {
        return this.AclTag;
    }

    /**
     * Set "READONLY",   //公有读，私有写。所有用户可读，仅创建者及管理员可写  
"PRIVATE",    //私有读写，仅创建者及管理员可读写  
"ADMINWRITE", //所有用户可读，仅管理员可写  
"ADMINONLY",  //仅管理员可操作  
"CUSTOM",     // 安全规则
     * @param AclTag "READONLY",   //公有读，私有写。所有用户可读，仅创建者及管理员可写  
"PRIVATE",    //私有读写，仅创建者及管理员可读写  
"ADMINWRITE", //所有用户可读，仅管理员可写  
"ADMINONLY",  //仅管理员可操作  
"CUSTOM",     // 安全规则
     */
    public void setAclTag(String AclTag) {
        this.AclTag = AclTag;
    }

    /**
     * Get 云开发环境ID 
     * @return EnvId 云开发环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 云开发环境ID
     * @param EnvId 云开发环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 自定义规则 
     * @return Rule 自定义规则
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set 自定义规则
     * @param Rule 自定义规则
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    public PermissionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PermissionInfo(PermissionInfo source) {
        if (source.AclTag != null) {
            this.AclTag = new String(source.AclTag);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AclTag", this.AclTag);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Rule", this.Rule);

    }
}

