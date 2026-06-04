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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Variable extends AbstractModel {

    /**
    * 默认文件名称
    */
    @SerializedName("DefaultFileName")
    @Expose
    private String DefaultFileName;

    /**
    * 默认值
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 变量描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数
    */
    @SerializedName("ModuleType")
    @Expose
    private Long ModuleType;

    /**
    * 变量名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 变量类型。枚举值: 1:字符串, 2:整数, 3:浮点数, 4:布尔值, 5:对象, 6:字符串数组, 7:整数数组, 8:浮点数数组, 9:布尔值数组, 10:对象数组, 11:文件, 12:文档, 13:图片, 14:音频, 15:视频, 16:文件数组, 17:文档数组, 18:图片数组, 19:音频数组, 20:视频数组, 21:数组的数组, 22:密钥/敏感信息, 99:空值
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 变量ID
    */
    @SerializedName("VariableId")
    @Expose
    private String VariableId;

    /**
     * Get 默认文件名称 
     * @return DefaultFileName 默认文件名称
     */
    public String getDefaultFileName() {
        return this.DefaultFileName;
    }

    /**
     * Set 默认文件名称
     * @param DefaultFileName 默认文件名称
     */
    public void setDefaultFileName(String DefaultFileName) {
        this.DefaultFileName = DefaultFileName;
    }

    /**
     * Get 默认值 
     * @return DefaultValue 默认值
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 默认值
     * @param DefaultValue 默认值
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get 变量描述 
     * @return Description 变量描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 变量描述
     * @param Description 变量描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数 
     * @return ModuleType 模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数
     */
    public Long getModuleType() {
        return this.ModuleType;
    }

    /**
     * Set 模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数
     * @param ModuleType 模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数
     */
    public void setModuleType(Long ModuleType) {
        this.ModuleType = ModuleType;
    }

    /**
     * Get 变量名称 
     * @return Name 变量名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 变量名称
     * @param Name 变量名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 变量类型。枚举值: 1:字符串, 2:整数, 3:浮点数, 4:布尔值, 5:对象, 6:字符串数组, 7:整数数组, 8:浮点数数组, 9:布尔值数组, 10:对象数组, 11:文件, 12:文档, 13:图片, 14:音频, 15:视频, 16:文件数组, 17:文档数组, 18:图片数组, 19:音频数组, 20:视频数组, 21:数组的数组, 22:密钥/敏感信息, 99:空值 
     * @return Type 变量类型。枚举值: 1:字符串, 2:整数, 3:浮点数, 4:布尔值, 5:对象, 6:字符串数组, 7:整数数组, 8:浮点数数组, 9:布尔值数组, 10:对象数组, 11:文件, 12:文档, 13:图片, 14:音频, 15:视频, 16:文件数组, 17:文档数组, 18:图片数组, 19:音频数组, 20:视频数组, 21:数组的数组, 22:密钥/敏感信息, 99:空值
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 变量类型。枚举值: 1:字符串, 2:整数, 3:浮点数, 4:布尔值, 5:对象, 6:字符串数组, 7:整数数组, 8:浮点数数组, 9:布尔值数组, 10:对象数组, 11:文件, 12:文档, 13:图片, 14:音频, 15:视频, 16:文件数组, 17:文档数组, 18:图片数组, 19:音频数组, 20:视频数组, 21:数组的数组, 22:密钥/敏感信息, 99:空值
     * @param Type 变量类型。枚举值: 1:字符串, 2:整数, 3:浮点数, 4:布尔值, 5:对象, 6:字符串数组, 7:整数数组, 8:浮点数数组, 9:布尔值数组, 10:对象数组, 11:文件, 12:文档, 13:图片, 14:音频, 15:视频, 16:文件数组, 17:文档数组, 18:图片数组, 19:音频数组, 20:视频数组, 21:数组的数组, 22:密钥/敏感信息, 99:空值
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 变量ID 
     * @return VariableId 变量ID
     */
    public String getVariableId() {
        return this.VariableId;
    }

    /**
     * Set 变量ID
     * @param VariableId 变量ID
     */
    public void setVariableId(String VariableId) {
        this.VariableId = VariableId;
    }

    public Variable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Variable(Variable source) {
        if (source.DefaultFileName != null) {
            this.DefaultFileName = new String(source.DefaultFileName);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ModuleType != null) {
            this.ModuleType = new Long(source.ModuleType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.VariableId != null) {
            this.VariableId = new String(source.VariableId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DefaultFileName", this.DefaultFileName);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VariableId", this.VariableId);

    }
}

