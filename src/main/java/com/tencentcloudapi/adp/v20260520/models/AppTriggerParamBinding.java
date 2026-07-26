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

public class AppTriggerParamBinding extends AbstractModel {

    /**
    * <p>参数名字</p>
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * <p>参数类型</p><p>枚举值：</p><ul><li>0： 字符串</li><li>1： 整数</li><li>2： 浮点数</li><li>4： 对象</li><li>5： 字符串数组</li><li>6： 整数数组</li><li>7： 浮点数数组</li><li>8： 布尔值数组</li><li>3： 布尔值</li><li>9： 对象数组</li><li>10： 文件</li><li>11： 文档</li><li>12： 图片</li><li>13： 音频</li><li>14： 视频</li><li>15： 文件数组</li><li>16： 文档数组</li><li>17： 图片数组</li><li>18： 音频数组</li><li>19： 视频数组</li><li>20： 数组嵌套</li><li>22： 密钥</li><li>99： 空值</li><li>100： 未指定类型，用于OneOf和AnyOf场景</li></ul>
    */
    @SerializedName("ParamType")
    @Expose
    private Long ParamType;

    /**
    * <p>参数值</p>
    */
    @SerializedName("Value")
    @Expose
    private AppTriggerParamBindingValue Value;

    /**
     * Get <p>参数名字</p> 
     * @return ParamName <p>参数名字</p>
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set <p>参数名字</p>
     * @param ParamName <p>参数名字</p>
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get <p>参数类型</p><p>枚举值：</p><ul><li>0： 字符串</li><li>1： 整数</li><li>2： 浮点数</li><li>4： 对象</li><li>5： 字符串数组</li><li>6： 整数数组</li><li>7： 浮点数数组</li><li>8： 布尔值数组</li><li>3： 布尔值</li><li>9： 对象数组</li><li>10： 文件</li><li>11： 文档</li><li>12： 图片</li><li>13： 音频</li><li>14： 视频</li><li>15： 文件数组</li><li>16： 文档数组</li><li>17： 图片数组</li><li>18： 音频数组</li><li>19： 视频数组</li><li>20： 数组嵌套</li><li>22： 密钥</li><li>99： 空值</li><li>100： 未指定类型，用于OneOf和AnyOf场景</li></ul> 
     * @return ParamType <p>参数类型</p><p>枚举值：</p><ul><li>0： 字符串</li><li>1： 整数</li><li>2： 浮点数</li><li>4： 对象</li><li>5： 字符串数组</li><li>6： 整数数组</li><li>7： 浮点数数组</li><li>8： 布尔值数组</li><li>3： 布尔值</li><li>9： 对象数组</li><li>10： 文件</li><li>11： 文档</li><li>12： 图片</li><li>13： 音频</li><li>14： 视频</li><li>15： 文件数组</li><li>16： 文档数组</li><li>17： 图片数组</li><li>18： 音频数组</li><li>19： 视频数组</li><li>20： 数组嵌套</li><li>22： 密钥</li><li>99： 空值</li><li>100： 未指定类型，用于OneOf和AnyOf场景</li></ul>
     */
    public Long getParamType() {
        return this.ParamType;
    }

    /**
     * Set <p>参数类型</p><p>枚举值：</p><ul><li>0： 字符串</li><li>1： 整数</li><li>2： 浮点数</li><li>4： 对象</li><li>5： 字符串数组</li><li>6： 整数数组</li><li>7： 浮点数数组</li><li>8： 布尔值数组</li><li>3： 布尔值</li><li>9： 对象数组</li><li>10： 文件</li><li>11： 文档</li><li>12： 图片</li><li>13： 音频</li><li>14： 视频</li><li>15： 文件数组</li><li>16： 文档数组</li><li>17： 图片数组</li><li>18： 音频数组</li><li>19： 视频数组</li><li>20： 数组嵌套</li><li>22： 密钥</li><li>99： 空值</li><li>100： 未指定类型，用于OneOf和AnyOf场景</li></ul>
     * @param ParamType <p>参数类型</p><p>枚举值：</p><ul><li>0： 字符串</li><li>1： 整数</li><li>2： 浮点数</li><li>4： 对象</li><li>5： 字符串数组</li><li>6： 整数数组</li><li>7： 浮点数数组</li><li>8： 布尔值数组</li><li>3： 布尔值</li><li>9： 对象数组</li><li>10： 文件</li><li>11： 文档</li><li>12： 图片</li><li>13： 音频</li><li>14： 视频</li><li>15： 文件数组</li><li>16： 文档数组</li><li>17： 图片数组</li><li>18： 音频数组</li><li>19： 视频数组</li><li>20： 数组嵌套</li><li>22： 密钥</li><li>99： 空值</li><li>100： 未指定类型，用于OneOf和AnyOf场景</li></ul>
     */
    public void setParamType(Long ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get <p>参数值</p> 
     * @return Value <p>参数值</p>
     */
    public AppTriggerParamBindingValue getValue() {
        return this.Value;
    }

    /**
     * Set <p>参数值</p>
     * @param Value <p>参数值</p>
     */
    public void setValue(AppTriggerParamBindingValue Value) {
        this.Value = Value;
    }

    public AppTriggerParamBinding() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerParamBinding(AppTriggerParamBinding source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.ParamType != null) {
            this.ParamType = new Long(source.ParamType);
        }
        if (source.Value != null) {
            this.Value = new AppTriggerParamBindingValue(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamObj(map, prefix + "Value.", this.Value);

    }
}

