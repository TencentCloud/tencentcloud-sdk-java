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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AclRuleInfo extends AbstractModel{

    /**
    * Acl操作方式，枚举值(所有操作: All, 读：Read，写：Write)
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 权限类型，(Deny，Allow)
    */
    @SerializedName("PermissionType")
    @Expose
    private String PermissionType;

    /**
    * 默认为*，表示任何host都可以访问，当前ckafka不支持host为*和ip网段
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户。传入格式需要带【User:】前缀。例如用户A，传入为User:A。
    */
    @SerializedName("Principal")
    @Expose
    private String Principal;

    /**
     * Get Acl操作方式，枚举值(所有操作: All, 读：Read，写：Write) 
     * @return Operation Acl操作方式，枚举值(所有操作: All, 读：Read，写：Write)
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Acl操作方式，枚举值(所有操作: All, 读：Read，写：Write)
     * @param Operation Acl操作方式，枚举值(所有操作: All, 读：Read，写：Write)
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 权限类型，(Deny，Allow) 
     * @return PermissionType 权限类型，(Deny，Allow)
     */
    public String getPermissionType() {
        return this.PermissionType;
    }

    /**
     * Set 权限类型，(Deny，Allow)
     * @param PermissionType 权限类型，(Deny，Allow)
     */
    public void setPermissionType(String PermissionType) {
        this.PermissionType = PermissionType;
    }

    /**
     * Get 默认为*，表示任何host都可以访问，当前ckafka不支持host为*和ip网段 
     * @return Host 默认为*，表示任何host都可以访问，当前ckafka不支持host为*和ip网段
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 默认为*，表示任何host都可以访问，当前ckafka不支持host为*和ip网段
     * @param Host 默认为*，表示任何host都可以访问，当前ckafka不支持host为*和ip网段
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户。传入格式需要带【User:】前缀。例如用户A，传入为User:A。 
     * @return Principal 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户。传入格式需要带【User:】前缀。例如用户A，传入为User:A。
     */
    public String getPrincipal() {
        return this.Principal;
    }

    /**
     * Set 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户。传入格式需要带【User:】前缀。例如用户A，传入为User:A。
     * @param Principal 用户列表，默认为User:*，表示任何user都可以访问，当前用户只能是用户列表中包含的用户。传入格式需要带【User:】前缀。例如用户A，传入为User:A。
     */
    public void setPrincipal(String Principal) {
        this.Principal = Principal;
    }

    public AclRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclRuleInfo(AclRuleInfo source) {
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.PermissionType != null) {
            this.PermissionType = new String(source.PermissionType);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Principal != null) {
            this.Principal = new String(source.Principal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "PermissionType", this.PermissionType);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Principal", this.Principal);

    }
}

