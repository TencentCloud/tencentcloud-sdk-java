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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelUserAuthority extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 模块，分为知识库knowledge、数据源datasource、自定义场景scene
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 对象创建者
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 对象id,分为知识库id、数据源id、场景id
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * 作用范围：1仅自己使用，2指定用户，0全员
    */
    @SerializedName("UseScope")
    @Expose
    private Long UseScope;

    /**
    * 可使用的用户列表
    */
    @SerializedName("AuthorityUins")
    @Expose
    private String [] AuthorityUins;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 模块，分为知识库knowledge、数据源datasource、自定义场景scene 
     * @return Module 模块，分为知识库knowledge、数据源datasource、自定义场景scene
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块，分为知识库knowledge、数据源datasource、自定义场景scene
     * @param Module 模块，分为知识库knowledge、数据源datasource、自定义场景scene
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 对象创建者 
     * @return CreatorUin 对象创建者
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 对象创建者
     * @param CreatorUin 对象创建者
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 对象id,分为知识库id、数据源id、场景id 
     * @return ObjectId 对象id,分为知识库id、数据源id、场景id
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 对象id,分为知识库id、数据源id、场景id
     * @param ObjectId 对象id,分为知识库id、数据源id、场景id
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get 作用范围：1仅自己使用，2指定用户，0全员 
     * @return UseScope 作用范围：1仅自己使用，2指定用户，0全员
     */
    public Long getUseScope() {
        return this.UseScope;
    }

    /**
     * Set 作用范围：1仅自己使用，2指定用户，0全员
     * @param UseScope 作用范围：1仅自己使用，2指定用户，0全员
     */
    public void setUseScope(Long UseScope) {
        this.UseScope = UseScope;
    }

    /**
     * Get 可使用的用户列表 
     * @return AuthorityUins 可使用的用户列表
     */
    public String [] getAuthorityUins() {
        return this.AuthorityUins;
    }

    /**
     * Set 可使用的用户列表
     * @param AuthorityUins 可使用的用户列表
     */
    public void setAuthorityUins(String [] AuthorityUins) {
        this.AuthorityUins = AuthorityUins;
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

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ModelUserAuthority() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelUserAuthority(ModelUserAuthority source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.UseScope != null) {
            this.UseScope = new Long(source.UseScope);
        }
        if (source.AuthorityUins != null) {
            this.AuthorityUins = new String[source.AuthorityUins.length];
            for (int i = 0; i < source.AuthorityUins.length; i++) {
                this.AuthorityUins[i] = new String(source.AuthorityUins[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "UseScope", this.UseScope);
        this.setParamArraySimple(map, prefix + "AuthorityUins.", this.AuthorityUins);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

