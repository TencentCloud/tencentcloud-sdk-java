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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ElementProperty extends AbstractModel {

    /**
    * 属性名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 属性描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 属性内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 属性名称 
     * @return Name 属性名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 属性名称
     * @param Name 属性名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 属性描述 
     * @return Description 属性描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 属性描述
     * @param Description 属性描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 属性内容 
     * @return Content 属性内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 属性内容
     * @param Content 属性内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public ElementProperty() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElementProperty(ElementProperty source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

