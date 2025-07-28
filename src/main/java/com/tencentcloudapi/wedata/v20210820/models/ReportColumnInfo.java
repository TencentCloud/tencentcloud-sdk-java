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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportColumnInfo extends AbstractModel {

    /**
    * 字段名称,字符长度128内
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字段类型,字符长度128内
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 字段位置,1开始
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * 字段描述,字符长度256内
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间戳,毫秒,为空默认当前时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间戳,毫秒,为空默认当前时间
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
     * Get 字段名称,字符长度128内 
     * @return Name 字段名称,字符长度128内
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字段名称,字符长度128内
     * @param Name 字段名称,字符长度128内
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字段类型,字符长度128内 
     * @return Type 字段类型,字符长度128内
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 字段类型,字符长度128内
     * @param Type 字段类型,字符长度128内
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 字段位置,1开始 
     * @return Position 字段位置,1开始
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 字段位置,1开始
     * @param Position 字段位置,1开始
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get 字段描述,字符长度256内 
     * @return Description 字段描述,字符长度256内
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 字段描述,字符长度256内
     * @param Description 字段描述,字符长度256内
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间戳,毫秒,为空默认当前时间 
     * @return CreateTime 创建时间戳,毫秒,为空默认当前时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间戳,毫秒,为空默认当前时间
     * @param CreateTime 创建时间戳,毫秒,为空默认当前时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间戳,毫秒,为空默认当前时间 
     * @return ModifiedTime 修改时间戳,毫秒,为空默认当前时间
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 修改时间戳,毫秒,为空默认当前时间
     * @param ModifiedTime 修改时间戳,毫秒,为空默认当前时间
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    public ReportColumnInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportColumnInfo(ReportColumnInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);

    }
}

