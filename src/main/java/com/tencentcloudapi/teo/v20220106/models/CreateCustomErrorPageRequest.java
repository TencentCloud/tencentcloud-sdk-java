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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCustomErrorPageRequest extends AbstractModel{

    /**
    * zone的id
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 具体所属实体
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * 自定义页面的文件名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义页面的内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get zone的id 
     * @return ZoneId zone的id
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set zone的id
     * @param ZoneId zone的id
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 具体所属实体 
     * @return Entity 具体所属实体
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 具体所属实体
     * @param Entity 具体所属实体
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get 自定义页面的文件名 
     * @return Name 自定义页面的文件名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义页面的文件名
     * @param Name 自定义页面的文件名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义页面的内容 
     * @return Content 自定义页面的内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 自定义页面的内容
     * @param Content 自定义页面的内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public CreateCustomErrorPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomErrorPageRequest(CreateCustomErrorPageRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

