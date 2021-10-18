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

public class MemberInfo extends AbstractModel{

    /**
    * 模板对象成员
    */
    @SerializedName("Member")
    @Expose
    private String Member;

    /**
    * 模板对象成员描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 模板对象成员 
     * @return Member 模板对象成员
     */
    public String getMember() {
        return this.Member;
    }

    /**
     * Set 模板对象成员
     * @param Member 模板对象成员
     */
    public void setMember(String Member) {
        this.Member = Member;
    }

    /**
     * Get 模板对象成员描述信息 
     * @return Description 模板对象成员描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 模板对象成员描述信息
     * @param Description 模板对象成员描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public MemberInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemberInfo(MemberInfo source) {
        if (source.Member != null) {
            this.Member = new String(source.Member);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Member", this.Member);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

