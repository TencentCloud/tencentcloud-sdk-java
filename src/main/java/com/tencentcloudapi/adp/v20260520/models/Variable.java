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
    * <p>默认文件名称</p>
    */
    @SerializedName("DefaultFileName")
    @Expose
    private String DefaultFileName;

    /**
    * <p>默认值</p>
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * <p>变量描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数</p>
    */
    @SerializedName("ModuleType")
    @Expose
    private Long ModuleType;

    /**
    * <p>变量名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>变量类型</p><p>枚举值：</p><ul><li>0： 字符串</li><li>1： 整数</li><li>2： 浮点数</li><li>3： 布尔值</li><li>4： 对象</li><li>5： 字符串数组</li><li>6： 整数数组</li><li>7： 浮点数数组</li><li>8： 布尔值数组</li><li>9： 对象数组</li><li>10： 文件</li><li>11： 文档</li><li>12： 图片</li><li>13： 音频</li><li>14： 视频</li><li>15： 文件数组</li><li>16： 文档数组</li><li>17： 图片数组</li><li>18： 音频数组</li><li>19： 视频数组</li><li>20： 数组的数组</li><li>21： 密钥</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>变量ID</p>
    */
    @SerializedName("VariableId")
    @Expose
    private String VariableId;

    /**
    * <p>是否启用网络策略(仅环境变量生效)</p>
    */
    @SerializedName("EnableEndpoints")
    @Expose
    private Boolean EnableEndpoints;

    /**
    * <p>网络策略列表(支持: 精确域名、*.通配子域名、可带协议/端口/路径前缀)</p>
    */
    @SerializedName("EndpointList")
    @Expose
    private String [] EndpointList;

    /**
     * Get <p>默认文件名称</p> 
     * @return DefaultFileName <p>默认文件名称</p>
     */
    public String getDefaultFileName() {
        return this.DefaultFileName;
    }

    /**
     * Set <p>默认文件名称</p>
     * @param DefaultFileName <p>默认文件名称</p>
     */
    public void setDefaultFileName(String DefaultFileName) {
        this.DefaultFileName = DefaultFileName;
    }

    /**
     * Get <p>默认值</p> 
     * @return DefaultValue <p>默认值</p>
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set <p>默认值</p>
     * @param DefaultValue <p>默认值</p>
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get <p>变量描述</p> 
     * @return Description <p>变量描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>变量描述</p>
     * @param Description <p>变量描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数</p> 
     * @return ModuleType <p>模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数</p>
     */
    public Long getModuleType() {
        return this.ModuleType;
    }

    /**
     * Set <p>模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数</p>
     * @param ModuleType <p>模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数</p>
     */
    public void setModuleType(Long ModuleType) {
        this.ModuleType = ModuleType;
    }

    /**
     * Get <p>变量名称</p> 
     * @return Name <p>变量名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>变量名称</p>
     * @param Name <p>变量名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>变量类型</p><p>枚举值：</p><ul><li>0： 字符串</li><li>1： 整数</li><li>2： 浮点数</li><li>3： 布尔值</li><li>4： 对象</li><li>5： 字符串数组</li><li>6： 整数数组</li><li>7： 浮点数数组</li><li>8： 布尔值数组</li><li>9： 对象数组</li><li>10： 文件</li><li>11： 文档</li><li>12： 图片</li><li>13： 音频</li><li>14： 视频</li><li>15： 文件数组</li><li>16： 文档数组</li><li>17： 图片数组</li><li>18： 音频数组</li><li>19： 视频数组</li><li>20： 数组的数组</li><li>21： 密钥</li></ul> 
     * @return Type <p>变量类型</p><p>枚举值：</p><ul><li>0： 字符串</li><li>1： 整数</li><li>2： 浮点数</li><li>3： 布尔值</li><li>4： 对象</li><li>5： 字符串数组</li><li>6： 整数数组</li><li>7： 浮点数数组</li><li>8： 布尔值数组</li><li>9： 对象数组</li><li>10： 文件</li><li>11： 文档</li><li>12： 图片</li><li>13： 音频</li><li>14： 视频</li><li>15： 文件数组</li><li>16： 文档数组</li><li>17： 图片数组</li><li>18： 音频数组</li><li>19： 视频数组</li><li>20： 数组的数组</li><li>21： 密钥</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>变量类型</p><p>枚举值：</p><ul><li>0： 字符串</li><li>1： 整数</li><li>2： 浮点数</li><li>3： 布尔值</li><li>4： 对象</li><li>5： 字符串数组</li><li>6： 整数数组</li><li>7： 浮点数数组</li><li>8： 布尔值数组</li><li>9： 对象数组</li><li>10： 文件</li><li>11： 文档</li><li>12： 图片</li><li>13： 音频</li><li>14： 视频</li><li>15： 文件数组</li><li>16： 文档数组</li><li>17： 图片数组</li><li>18： 音频数组</li><li>19： 视频数组</li><li>20： 数组的数组</li><li>21： 密钥</li></ul>
     * @param Type <p>变量类型</p><p>枚举值：</p><ul><li>0： 字符串</li><li>1： 整数</li><li>2： 浮点数</li><li>3： 布尔值</li><li>4： 对象</li><li>5： 字符串数组</li><li>6： 整数数组</li><li>7： 浮点数数组</li><li>8： 布尔值数组</li><li>9： 对象数组</li><li>10： 文件</li><li>11： 文档</li><li>12： 图片</li><li>13： 音频</li><li>14： 视频</li><li>15： 文件数组</li><li>16： 文档数组</li><li>17： 图片数组</li><li>18： 音频数组</li><li>19： 视频数组</li><li>20： 数组的数组</li><li>21： 密钥</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>变量ID</p> 
     * @return VariableId <p>变量ID</p>
     */
    public String getVariableId() {
        return this.VariableId;
    }

    /**
     * Set <p>变量ID</p>
     * @param VariableId <p>变量ID</p>
     */
    public void setVariableId(String VariableId) {
        this.VariableId = VariableId;
    }

    /**
     * Get <p>是否启用网络策略(仅环境变量生效)</p> 
     * @return EnableEndpoints <p>是否启用网络策略(仅环境变量生效)</p>
     */
    public Boolean getEnableEndpoints() {
        return this.EnableEndpoints;
    }

    /**
     * Set <p>是否启用网络策略(仅环境变量生效)</p>
     * @param EnableEndpoints <p>是否启用网络策略(仅环境变量生效)</p>
     */
    public void setEnableEndpoints(Boolean EnableEndpoints) {
        this.EnableEndpoints = EnableEndpoints;
    }

    /**
     * Get <p>网络策略列表(支持: 精确域名、*.通配子域名、可带协议/端口/路径前缀)</p> 
     * @return EndpointList <p>网络策略列表(支持: 精确域名、*.通配子域名、可带协议/端口/路径前缀)</p>
     */
    public String [] getEndpointList() {
        return this.EndpointList;
    }

    /**
     * Set <p>网络策略列表(支持: 精确域名、*.通配子域名、可带协议/端口/路径前缀)</p>
     * @param EndpointList <p>网络策略列表(支持: 精确域名、*.通配子域名、可带协议/端口/路径前缀)</p>
     */
    public void setEndpointList(String [] EndpointList) {
        this.EndpointList = EndpointList;
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
        if (source.EnableEndpoints != null) {
            this.EnableEndpoints = new Boolean(source.EnableEndpoints);
        }
        if (source.EndpointList != null) {
            this.EndpointList = new String[source.EndpointList.length];
            for (int i = 0; i < source.EndpointList.length; i++) {
                this.EndpointList[i] = new String(source.EndpointList[i]);
            }
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
        this.setParamSimple(map, prefix + "EnableEndpoints", this.EnableEndpoints);
        this.setParamArraySimple(map, prefix + "EndpointList.", this.EndpointList);

    }
}

