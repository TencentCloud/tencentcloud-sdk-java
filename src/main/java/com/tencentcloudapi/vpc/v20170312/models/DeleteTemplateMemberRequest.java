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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTemplateMemberRequest extends AbstractModel{

    /**
    * 参数模板实例ID，支持IP地址、协议端口、IP地址组、协议端口组四种参数模板的实例ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 需要添加的参数模板成员信息，支持IP地址、协议端口、IP地址组、协议端口组四种类型，类型需要与TemplateId参数类型一致。
    */
    @SerializedName("TemplateMember")
    @Expose
    private MemberInfo [] TemplateMember;

    /**
     * Get 参数模板实例ID，支持IP地址、协议端口、IP地址组、协议端口组四种参数模板的实例ID。 
     * @return TemplateId 参数模板实例ID，支持IP地址、协议端口、IP地址组、协议端口组四种参数模板的实例ID。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 参数模板实例ID，支持IP地址、协议端口、IP地址组、协议端口组四种参数模板的实例ID。
     * @param TemplateId 参数模板实例ID，支持IP地址、协议端口、IP地址组、协议端口组四种参数模板的实例ID。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 需要添加的参数模板成员信息，支持IP地址、协议端口、IP地址组、协议端口组四种类型，类型需要与TemplateId参数类型一致。 
     * @return TemplateMember 需要添加的参数模板成员信息，支持IP地址、协议端口、IP地址组、协议端口组四种类型，类型需要与TemplateId参数类型一致。
     */
    public MemberInfo [] getTemplateMember() {
        return this.TemplateMember;
    }

    /**
     * Set 需要添加的参数模板成员信息，支持IP地址、协议端口、IP地址组、协议端口组四种类型，类型需要与TemplateId参数类型一致。
     * @param TemplateMember 需要添加的参数模板成员信息，支持IP地址、协议端口、IP地址组、协议端口组四种类型，类型需要与TemplateId参数类型一致。
     */
    public void setTemplateMember(MemberInfo [] TemplateMember) {
        this.TemplateMember = TemplateMember;
    }

    public DeleteTemplateMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTemplateMemberRequest(DeleteTemplateMemberRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateMember != null) {
            this.TemplateMember = new MemberInfo[source.TemplateMember.length];
            for (int i = 0; i < source.TemplateMember.length; i++) {
                this.TemplateMember[i] = new MemberInfo(source.TemplateMember[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArrayObj(map, prefix + "TemplateMember.", this.TemplateMember);

    }
}

