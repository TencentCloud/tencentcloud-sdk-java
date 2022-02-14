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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPortAclConfigRequest extends AbstractModel{

    /**
    * 资源实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 旧端口acl策略
    */
    @SerializedName("OldAclConfig")
    @Expose
    private AclConfig OldAclConfig;

    /**
    * 新端口acl策略
    */
    @SerializedName("NewAclConfig")
    @Expose
    private AclConfig NewAclConfig;

    /**
     * Get 资源实例ID 
     * @return InstanceId 资源实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源实例ID
     * @param InstanceId 资源实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 旧端口acl策略 
     * @return OldAclConfig 旧端口acl策略
     */
    public AclConfig getOldAclConfig() {
        return this.OldAclConfig;
    }

    /**
     * Set 旧端口acl策略
     * @param OldAclConfig 旧端口acl策略
     */
    public void setOldAclConfig(AclConfig OldAclConfig) {
        this.OldAclConfig = OldAclConfig;
    }

    /**
     * Get 新端口acl策略 
     * @return NewAclConfig 新端口acl策略
     */
    public AclConfig getNewAclConfig() {
        return this.NewAclConfig;
    }

    /**
     * Set 新端口acl策略
     * @param NewAclConfig 新端口acl策略
     */
    public void setNewAclConfig(AclConfig NewAclConfig) {
        this.NewAclConfig = NewAclConfig;
    }

    public ModifyPortAclConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPortAclConfigRequest(ModifyPortAclConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OldAclConfig != null) {
            this.OldAclConfig = new AclConfig(source.OldAclConfig);
        }
        if (source.NewAclConfig != null) {
            this.NewAclConfig = new AclConfig(source.NewAclConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "OldAclConfig.", this.OldAclConfig);
        this.setParamObj(map, prefix + "NewAclConfig.", this.NewAclConfig);

    }
}

