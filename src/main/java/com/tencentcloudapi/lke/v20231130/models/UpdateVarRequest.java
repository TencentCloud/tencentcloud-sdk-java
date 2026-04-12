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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateVarRequest extends AbstractModel {

    /**
    * <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * <p>变量 ID。由 CreateVar 接口生成，通过 CreateVar / DescribeVar 返回结果获取。</p>
    */
    @SerializedName("VarId")
    @Expose
    private String VarId;

    /**
    * <p>变量名称，最大支持50个字符，英文字母开头，支持英文数字与下划线”_” 。</p>
    */
    @SerializedName("VarName")
    @Expose
    private String VarName;

    /**
    * <p>参数描述</p>
    */
    @SerializedName("VarDesc")
    @Expose
    private String VarDesc;

    /**
    * <p>变量类型</p><p>枚举值：</p><ul><li>STRING： 字符串</li><li>INT： 整形</li><li>BOOL： 布尔型</li><li>OBJECT： 对象</li><li>ARRAY_STRING： 字符串数组</li><li>ARRAY_INT： 整型数组</li><li>ARRAY_FLOAT： 浮点型数组</li><li>ARRAY_BOOL： 布尔型数组</li><li>ARRAY_OBJECT： 对象数组</li><li>FILE： 文件类型</li><li>DOCUMENT： 文档类型</li><li>IMAGE： 图片类型</li><li>AUDIO： 音频</li><li>VIDEO： 视频</li><li>ARRAY_FILE： 文件数组</li><li>ARRAY_DOCUMENT： 文档数组</li><li>ARRAY_IMAGE： 图片数组</li><li>ARRAY_AUDIO： 音频数组</li><li>ARRAY_VIDEO： 视频数组</li><li>SECRET： 秘钥</li><li>ARRAY_ARRAY： 多维数组</li></ul><p>默认值：STRING</p>
    */
    @SerializedName("VarType")
    @Expose
    private String VarType;

    /**
    * <p>自定义变量默认值，<code>VarDefaultValue</code>&nbsp;默认为空</p>
    */
    @SerializedName("VarDefaultValue")
    @Expose
    private String VarDefaultValue;

    /**
    * <p>自定义变量文件默认名称，<code>VarDefaultFileName</code> 默认为空</p>
    */
    @SerializedName("VarDefaultFileName")
    @Expose
    private String VarDefaultFileName;

    /**
    * <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul>
    */
    @SerializedName("VarModuleType")
    @Expose
    private Long VarModuleType;

    /**
     * Get <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p> 
     * @return AppBizId <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
     * @param AppBizId <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get <p>变量 ID。由 CreateVar 接口生成，通过 CreateVar / DescribeVar 返回结果获取。</p> 
     * @return VarId <p>变量 ID。由 CreateVar 接口生成，通过 CreateVar / DescribeVar 返回结果获取。</p>
     */
    public String getVarId() {
        return this.VarId;
    }

    /**
     * Set <p>变量 ID。由 CreateVar 接口生成，通过 CreateVar / DescribeVar 返回结果获取。</p>
     * @param VarId <p>变量 ID。由 CreateVar 接口生成，通过 CreateVar / DescribeVar 返回结果获取。</p>
     */
    public void setVarId(String VarId) {
        this.VarId = VarId;
    }

    /**
     * Get <p>变量名称，最大支持50个字符，英文字母开头，支持英文数字与下划线”_” 。</p> 
     * @return VarName <p>变量名称，最大支持50个字符，英文字母开头，支持英文数字与下划线”_” 。</p>
     */
    public String getVarName() {
        return this.VarName;
    }

    /**
     * Set <p>变量名称，最大支持50个字符，英文字母开头，支持英文数字与下划线”_” 。</p>
     * @param VarName <p>变量名称，最大支持50个字符，英文字母开头，支持英文数字与下划线”_” 。</p>
     */
    public void setVarName(String VarName) {
        this.VarName = VarName;
    }

    /**
     * Get <p>参数描述</p> 
     * @return VarDesc <p>参数描述</p>
     */
    public String getVarDesc() {
        return this.VarDesc;
    }

    /**
     * Set <p>参数描述</p>
     * @param VarDesc <p>参数描述</p>
     */
    public void setVarDesc(String VarDesc) {
        this.VarDesc = VarDesc;
    }

    /**
     * Get <p>变量类型</p><p>枚举值：</p><ul><li>STRING： 字符串</li><li>INT： 整形</li><li>BOOL： 布尔型</li><li>OBJECT： 对象</li><li>ARRAY_STRING： 字符串数组</li><li>ARRAY_INT： 整型数组</li><li>ARRAY_FLOAT： 浮点型数组</li><li>ARRAY_BOOL： 布尔型数组</li><li>ARRAY_OBJECT： 对象数组</li><li>FILE： 文件类型</li><li>DOCUMENT： 文档类型</li><li>IMAGE： 图片类型</li><li>AUDIO： 音频</li><li>VIDEO： 视频</li><li>ARRAY_FILE： 文件数组</li><li>ARRAY_DOCUMENT： 文档数组</li><li>ARRAY_IMAGE： 图片数组</li><li>ARRAY_AUDIO： 音频数组</li><li>ARRAY_VIDEO： 视频数组</li><li>SECRET： 秘钥</li><li>ARRAY_ARRAY： 多维数组</li></ul><p>默认值：STRING</p> 
     * @return VarType <p>变量类型</p><p>枚举值：</p><ul><li>STRING： 字符串</li><li>INT： 整形</li><li>BOOL： 布尔型</li><li>OBJECT： 对象</li><li>ARRAY_STRING： 字符串数组</li><li>ARRAY_INT： 整型数组</li><li>ARRAY_FLOAT： 浮点型数组</li><li>ARRAY_BOOL： 布尔型数组</li><li>ARRAY_OBJECT： 对象数组</li><li>FILE： 文件类型</li><li>DOCUMENT： 文档类型</li><li>IMAGE： 图片类型</li><li>AUDIO： 音频</li><li>VIDEO： 视频</li><li>ARRAY_FILE： 文件数组</li><li>ARRAY_DOCUMENT： 文档数组</li><li>ARRAY_IMAGE： 图片数组</li><li>ARRAY_AUDIO： 音频数组</li><li>ARRAY_VIDEO： 视频数组</li><li>SECRET： 秘钥</li><li>ARRAY_ARRAY： 多维数组</li></ul><p>默认值：STRING</p>
     */
    public String getVarType() {
        return this.VarType;
    }

    /**
     * Set <p>变量类型</p><p>枚举值：</p><ul><li>STRING： 字符串</li><li>INT： 整形</li><li>BOOL： 布尔型</li><li>OBJECT： 对象</li><li>ARRAY_STRING： 字符串数组</li><li>ARRAY_INT： 整型数组</li><li>ARRAY_FLOAT： 浮点型数组</li><li>ARRAY_BOOL： 布尔型数组</li><li>ARRAY_OBJECT： 对象数组</li><li>FILE： 文件类型</li><li>DOCUMENT： 文档类型</li><li>IMAGE： 图片类型</li><li>AUDIO： 音频</li><li>VIDEO： 视频</li><li>ARRAY_FILE： 文件数组</li><li>ARRAY_DOCUMENT： 文档数组</li><li>ARRAY_IMAGE： 图片数组</li><li>ARRAY_AUDIO： 音频数组</li><li>ARRAY_VIDEO： 视频数组</li><li>SECRET： 秘钥</li><li>ARRAY_ARRAY： 多维数组</li></ul><p>默认值：STRING</p>
     * @param VarType <p>变量类型</p><p>枚举值：</p><ul><li>STRING： 字符串</li><li>INT： 整形</li><li>BOOL： 布尔型</li><li>OBJECT： 对象</li><li>ARRAY_STRING： 字符串数组</li><li>ARRAY_INT： 整型数组</li><li>ARRAY_FLOAT： 浮点型数组</li><li>ARRAY_BOOL： 布尔型数组</li><li>ARRAY_OBJECT： 对象数组</li><li>FILE： 文件类型</li><li>DOCUMENT： 文档类型</li><li>IMAGE： 图片类型</li><li>AUDIO： 音频</li><li>VIDEO： 视频</li><li>ARRAY_FILE： 文件数组</li><li>ARRAY_DOCUMENT： 文档数组</li><li>ARRAY_IMAGE： 图片数组</li><li>ARRAY_AUDIO： 音频数组</li><li>ARRAY_VIDEO： 视频数组</li><li>SECRET： 秘钥</li><li>ARRAY_ARRAY： 多维数组</li></ul><p>默认值：STRING</p>
     */
    public void setVarType(String VarType) {
        this.VarType = VarType;
    }

    /**
     * Get <p>自定义变量默认值，<code>VarDefaultValue</code>&nbsp;默认为空</p> 
     * @return VarDefaultValue <p>自定义变量默认值，<code>VarDefaultValue</code>&nbsp;默认为空</p>
     */
    public String getVarDefaultValue() {
        return this.VarDefaultValue;
    }

    /**
     * Set <p>自定义变量默认值，<code>VarDefaultValue</code>&nbsp;默认为空</p>
     * @param VarDefaultValue <p>自定义变量默认值，<code>VarDefaultValue</code>&nbsp;默认为空</p>
     */
    public void setVarDefaultValue(String VarDefaultValue) {
        this.VarDefaultValue = VarDefaultValue;
    }

    /**
     * Get <p>自定义变量文件默认名称，<code>VarDefaultFileName</code> 默认为空</p> 
     * @return VarDefaultFileName <p>自定义变量文件默认名称，<code>VarDefaultFileName</code> 默认为空</p>
     */
    public String getVarDefaultFileName() {
        return this.VarDefaultFileName;
    }

    /**
     * Set <p>自定义变量文件默认名称，<code>VarDefaultFileName</code> 默认为空</p>
     * @param VarDefaultFileName <p>自定义变量文件默认名称，<code>VarDefaultFileName</code> 默认为空</p>
     */
    public void setVarDefaultFileName(String VarDefaultFileName) {
        this.VarDefaultFileName = VarDefaultFileName;
    }

    /**
     * Get <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul> 
     * @return VarModuleType <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul>
     */
    public Long getVarModuleType() {
        return this.VarModuleType;
    }

    /**
     * Set <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul>
     * @param VarModuleType <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul>
     */
    public void setVarModuleType(Long VarModuleType) {
        this.VarModuleType = VarModuleType;
    }

    public UpdateVarRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateVarRequest(UpdateVarRequest source) {
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.VarId != null) {
            this.VarId = new String(source.VarId);
        }
        if (source.VarName != null) {
            this.VarName = new String(source.VarName);
        }
        if (source.VarDesc != null) {
            this.VarDesc = new String(source.VarDesc);
        }
        if (source.VarType != null) {
            this.VarType = new String(source.VarType);
        }
        if (source.VarDefaultValue != null) {
            this.VarDefaultValue = new String(source.VarDefaultValue);
        }
        if (source.VarDefaultFileName != null) {
            this.VarDefaultFileName = new String(source.VarDefaultFileName);
        }
        if (source.VarModuleType != null) {
            this.VarModuleType = new Long(source.VarModuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "VarId", this.VarId);
        this.setParamSimple(map, prefix + "VarName", this.VarName);
        this.setParamSimple(map, prefix + "VarDesc", this.VarDesc);
        this.setParamSimple(map, prefix + "VarType", this.VarType);
        this.setParamSimple(map, prefix + "VarDefaultValue", this.VarDefaultValue);
        this.setParamSimple(map, prefix + "VarDefaultFileName", this.VarDefaultFileName);
        this.setParamSimple(map, prefix + "VarModuleType", this.VarModuleType);

    }
}

