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
package com.tencentcloudapi.ape.v20200513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthInfo extends AbstractModel{

    /**
    * 主键
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 授权人名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 身份证号/社会信用代码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 授权人类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 主键 
     * @return Id 主键
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 主键
     * @param Id 主键
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 授权人名称 
     * @return Name 授权人名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 授权人名称
     * @param Name 授权人名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 身份证号/社会信用代码 
     * @return Code 身份证号/社会信用代码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 身份证号/社会信用代码
     * @param Code 身份证号/社会信用代码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 授权人类型 
     * @return Type 授权人类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 授权人类型
     * @param Type 授权人类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public AuthInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthInfo(AuthInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

