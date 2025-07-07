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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextType extends AbstractModel {

    /**
    * 类别Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 类别层级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 类别名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 类别Id 
     * @return Id 类别Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 类别Id
     * @param Id 类别Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 类别层级 
     * @return Level 类别层级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 类别层级
     * @param Level 类别层级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 类别名 
     * @return Name 类别名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 类别名
     * @param Name 类别名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public TextType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextType(TextType source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

