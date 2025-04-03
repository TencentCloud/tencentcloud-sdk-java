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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GovernanceAlias extends AbstractModel {

    /**
    * 服务别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 服务别名命名空间
    */
    @SerializedName("AliasNamespace")
    @Expose
    private String AliasNamespace;

    /**
    * 服务别名指向的服务名
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 服务别名指向的服务命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 服务别名的描述信息
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 服务别名创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 服务别名修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 服务别名ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 该服务别名是否可以编辑
    */
    @SerializedName("Editable")
    @Expose
    private Boolean Editable;

    /**
     * Get 服务别名 
     * @return Alias 服务别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 服务别名
     * @param Alias 服务别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 服务别名命名空间 
     * @return AliasNamespace 服务别名命名空间
     */
    public String getAliasNamespace() {
        return this.AliasNamespace;
    }

    /**
     * Set 服务别名命名空间
     * @param AliasNamespace 服务别名命名空间
     */
    public void setAliasNamespace(String AliasNamespace) {
        this.AliasNamespace = AliasNamespace;
    }

    /**
     * Get 服务别名指向的服务名 
     * @return Service 服务别名指向的服务名
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 服务别名指向的服务名
     * @param Service 服务别名指向的服务名
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 服务别名指向的服务命名空间 
     * @return Namespace 服务别名指向的服务命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 服务别名指向的服务命名空间
     * @param Namespace 服务别名指向的服务命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 服务别名的描述信息 
     * @return Comment 服务别名的描述信息
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 服务别名的描述信息
     * @param Comment 服务别名的描述信息
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 服务别名创建时间 
     * @return CreateTime 服务别名创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 服务别名创建时间
     * @param CreateTime 服务别名创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 服务别名修改时间 
     * @return ModifyTime 服务别名修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 服务别名修改时间
     * @param ModifyTime 服务别名修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 服务别名ID 
     * @return Id 服务别名ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 服务别名ID
     * @param Id 服务别名ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 该服务别名是否可以编辑 
     * @return Editable 该服务别名是否可以编辑
     */
    public Boolean getEditable() {
        return this.Editable;
    }

    /**
     * Set 该服务别名是否可以编辑
     * @param Editable 该服务别名是否可以编辑
     */
    public void setEditable(Boolean Editable) {
        this.Editable = Editable;
    }

    public GovernanceAlias() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GovernanceAlias(GovernanceAlias source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.AliasNamespace != null) {
            this.AliasNamespace = new String(source.AliasNamespace);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Editable != null) {
            this.Editable = new Boolean(source.Editable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "AliasNamespace", this.AliasNamespace);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Editable", this.Editable);

    }
}

