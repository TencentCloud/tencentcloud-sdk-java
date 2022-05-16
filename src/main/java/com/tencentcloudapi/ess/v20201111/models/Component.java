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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Component extends AbstractModel{

    /**
    * 如果是 Component 控件类型，则可选类型为：
TEXT - 内容文本控件
DATE - 内容日期控件
SELECT - 勾选框控件
如果是 SignComponent 控件类型，则可选类型为：
SIGN_SEAL - 签署印章控件
SIGN_DATE - 签署日期控件
SIGN_SIGNATURE - 手写签名控件
    */
    @SerializedName("ComponentType")
    @Expose
    private String ComponentType;

    /**
    * 参数控件宽度，单位pt
    */
    @SerializedName("ComponentWidth")
    @Expose
    private Float ComponentWidth;

    /**
    * 参数控件高度，单位pt
    */
    @SerializedName("ComponentHeight")
    @Expose
    private Float ComponentHeight;

    /**
    * 参数控件所在页码，取值为：1-N
    */
    @SerializedName("ComponentPage")
    @Expose
    private Long ComponentPage;

    /**
    * 参数控件X位置，单位pt
    */
    @SerializedName("ComponentPosX")
    @Expose
    private Float ComponentPosX;

    /**
    * 参数控件Y位置，单位pt
    */
    @SerializedName("ComponentPosY")
    @Expose
    private Float ComponentPosY;

    /**
    * 控件所属文件的序号（模板中的resourceId排列序号，取值为：0-N）
    */
    @SerializedName("FileIndex")
    @Expose
    private Long FileIndex;

    /**
    * GenerateMode==KEYWORD 指定关键字
    */
    @SerializedName("ComponentId")
    @Expose
    private String ComponentId;

    /**
    * GenerateMode==FIELD 指定表单域名称
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * 是否必选，默认为false
    */
    @SerializedName("ComponentRequired")
    @Expose
    private Boolean ComponentRequired;

    /**
    * 扩展参数：
ComponentType为SIGN_SIGNATURE类型可以控制签署方式
{“ComponentTypeLimit”: [“xxx”]}
xxx可以为：
HANDWRITE – 手写签名
BORDERLESS_ESIGN – 自动生成无边框腾讯体
OCR_ESIGN -- AI智能识别手写签名
ESIGN -- 个人印章类型
如：{“ComponentTypeLimit”: [“BORDERLESS_ESIGN”]}
    */
    @SerializedName("ComponentExtra")
    @Expose
    private String ComponentExtra;

    /**
    * 控件关联的签署人ID
    */
    @SerializedName("ComponentRecipientId")
    @Expose
    private String ComponentRecipientId;

    /**
    * 控件所填写的内容
    */
    @SerializedName("ComponentValue")
    @Expose
    private String ComponentValue;

    /**
    * 是否是表单域类型，默认不存在
    */
    @SerializedName("IsFormType")
    @Expose
    private Boolean IsFormType;

    /**
    * NORMAL 正常模式，使用坐标制定签署控件位置
FIELD 表单域，需使用ComponentName指定表单域名称
KEYWORD 关键字，使用ComponentId指定关键字
    */
    @SerializedName("GenerateMode")
    @Expose
    private String GenerateMode;

    /**
    * 日期控件类型字号
    */
    @SerializedName("ComponentDateFontSize")
    @Expose
    private Long ComponentDateFontSize;

    /**
    * 指定关键字时横坐标偏移量
    */
    @SerializedName("OffsetX")
    @Expose
    private Float OffsetX;

    /**
    * 指定关键字时纵坐标偏移量
    */
    @SerializedName("OffsetY")
    @Expose
    private Float OffsetY;

    /**
     * Get 如果是 Component 控件类型，则可选类型为：
TEXT - 内容文本控件
DATE - 内容日期控件
SELECT - 勾选框控件
如果是 SignComponent 控件类型，则可选类型为：
SIGN_SEAL - 签署印章控件
SIGN_DATE - 签署日期控件
SIGN_SIGNATURE - 手写签名控件 
     * @return ComponentType 如果是 Component 控件类型，则可选类型为：
TEXT - 内容文本控件
DATE - 内容日期控件
SELECT - 勾选框控件
如果是 SignComponent 控件类型，则可选类型为：
SIGN_SEAL - 签署印章控件
SIGN_DATE - 签署日期控件
SIGN_SIGNATURE - 手写签名控件
     */
    public String getComponentType() {
        return this.ComponentType;
    }

    /**
     * Set 如果是 Component 控件类型，则可选类型为：
TEXT - 内容文本控件
DATE - 内容日期控件
SELECT - 勾选框控件
如果是 SignComponent 控件类型，则可选类型为：
SIGN_SEAL - 签署印章控件
SIGN_DATE - 签署日期控件
SIGN_SIGNATURE - 手写签名控件
     * @param ComponentType 如果是 Component 控件类型，则可选类型为：
TEXT - 内容文本控件
DATE - 内容日期控件
SELECT - 勾选框控件
如果是 SignComponent 控件类型，则可选类型为：
SIGN_SEAL - 签署印章控件
SIGN_DATE - 签署日期控件
SIGN_SIGNATURE - 手写签名控件
     */
    public void setComponentType(String ComponentType) {
        this.ComponentType = ComponentType;
    }

    /**
     * Get 参数控件宽度，单位pt 
     * @return ComponentWidth 参数控件宽度，单位pt
     */
    public Float getComponentWidth() {
        return this.ComponentWidth;
    }

    /**
     * Set 参数控件宽度，单位pt
     * @param ComponentWidth 参数控件宽度，单位pt
     */
    public void setComponentWidth(Float ComponentWidth) {
        this.ComponentWidth = ComponentWidth;
    }

    /**
     * Get 参数控件高度，单位pt 
     * @return ComponentHeight 参数控件高度，单位pt
     */
    public Float getComponentHeight() {
        return this.ComponentHeight;
    }

    /**
     * Set 参数控件高度，单位pt
     * @param ComponentHeight 参数控件高度，单位pt
     */
    public void setComponentHeight(Float ComponentHeight) {
        this.ComponentHeight = ComponentHeight;
    }

    /**
     * Get 参数控件所在页码，取值为：1-N 
     * @return ComponentPage 参数控件所在页码，取值为：1-N
     */
    public Long getComponentPage() {
        return this.ComponentPage;
    }

    /**
     * Set 参数控件所在页码，取值为：1-N
     * @param ComponentPage 参数控件所在页码，取值为：1-N
     */
    public void setComponentPage(Long ComponentPage) {
        this.ComponentPage = ComponentPage;
    }

    /**
     * Get 参数控件X位置，单位pt 
     * @return ComponentPosX 参数控件X位置，单位pt
     */
    public Float getComponentPosX() {
        return this.ComponentPosX;
    }

    /**
     * Set 参数控件X位置，单位pt
     * @param ComponentPosX 参数控件X位置，单位pt
     */
    public void setComponentPosX(Float ComponentPosX) {
        this.ComponentPosX = ComponentPosX;
    }

    /**
     * Get 参数控件Y位置，单位pt 
     * @return ComponentPosY 参数控件Y位置，单位pt
     */
    public Float getComponentPosY() {
        return this.ComponentPosY;
    }

    /**
     * Set 参数控件Y位置，单位pt
     * @param ComponentPosY 参数控件Y位置，单位pt
     */
    public void setComponentPosY(Float ComponentPosY) {
        this.ComponentPosY = ComponentPosY;
    }

    /**
     * Get 控件所属文件的序号（模板中的resourceId排列序号，取值为：0-N） 
     * @return FileIndex 控件所属文件的序号（模板中的resourceId排列序号，取值为：0-N）
     */
    public Long getFileIndex() {
        return this.FileIndex;
    }

    /**
     * Set 控件所属文件的序号（模板中的resourceId排列序号，取值为：0-N）
     * @param FileIndex 控件所属文件的序号（模板中的resourceId排列序号，取值为：0-N）
     */
    public void setFileIndex(Long FileIndex) {
        this.FileIndex = FileIndex;
    }

    /**
     * Get GenerateMode==KEYWORD 指定关键字 
     * @return ComponentId GenerateMode==KEYWORD 指定关键字
     */
    public String getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set GenerateMode==KEYWORD 指定关键字
     * @param ComponentId GenerateMode==KEYWORD 指定关键字
     */
    public void setComponentId(String ComponentId) {
        this.ComponentId = ComponentId;
    }

    /**
     * Get GenerateMode==FIELD 指定表单域名称 
     * @return ComponentName GenerateMode==FIELD 指定表单域名称
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set GenerateMode==FIELD 指定表单域名称
     * @param ComponentName GenerateMode==FIELD 指定表单域名称
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get 是否必选，默认为false 
     * @return ComponentRequired 是否必选，默认为false
     */
    public Boolean getComponentRequired() {
        return this.ComponentRequired;
    }

    /**
     * Set 是否必选，默认为false
     * @param ComponentRequired 是否必选，默认为false
     */
    public void setComponentRequired(Boolean ComponentRequired) {
        this.ComponentRequired = ComponentRequired;
    }

    /**
     * Get 扩展参数：
ComponentType为SIGN_SIGNATURE类型可以控制签署方式
{“ComponentTypeLimit”: [“xxx”]}
xxx可以为：
HANDWRITE – 手写签名
BORDERLESS_ESIGN – 自动生成无边框腾讯体
OCR_ESIGN -- AI智能识别手写签名
ESIGN -- 个人印章类型
如：{“ComponentTypeLimit”: [“BORDERLESS_ESIGN”]} 
     * @return ComponentExtra 扩展参数：
ComponentType为SIGN_SIGNATURE类型可以控制签署方式
{“ComponentTypeLimit”: [“xxx”]}
xxx可以为：
HANDWRITE – 手写签名
BORDERLESS_ESIGN – 自动生成无边框腾讯体
OCR_ESIGN -- AI智能识别手写签名
ESIGN -- 个人印章类型
如：{“ComponentTypeLimit”: [“BORDERLESS_ESIGN”]}
     */
    public String getComponentExtra() {
        return this.ComponentExtra;
    }

    /**
     * Set 扩展参数：
ComponentType为SIGN_SIGNATURE类型可以控制签署方式
{“ComponentTypeLimit”: [“xxx”]}
xxx可以为：
HANDWRITE – 手写签名
BORDERLESS_ESIGN – 自动生成无边框腾讯体
OCR_ESIGN -- AI智能识别手写签名
ESIGN -- 个人印章类型
如：{“ComponentTypeLimit”: [“BORDERLESS_ESIGN”]}
     * @param ComponentExtra 扩展参数：
ComponentType为SIGN_SIGNATURE类型可以控制签署方式
{“ComponentTypeLimit”: [“xxx”]}
xxx可以为：
HANDWRITE – 手写签名
BORDERLESS_ESIGN – 自动生成无边框腾讯体
OCR_ESIGN -- AI智能识别手写签名
ESIGN -- 个人印章类型
如：{“ComponentTypeLimit”: [“BORDERLESS_ESIGN”]}
     */
    public void setComponentExtra(String ComponentExtra) {
        this.ComponentExtra = ComponentExtra;
    }

    /**
     * Get 控件关联的签署人ID 
     * @return ComponentRecipientId 控件关联的签署人ID
     */
    public String getComponentRecipientId() {
        return this.ComponentRecipientId;
    }

    /**
     * Set 控件关联的签署人ID
     * @param ComponentRecipientId 控件关联的签署人ID
     */
    public void setComponentRecipientId(String ComponentRecipientId) {
        this.ComponentRecipientId = ComponentRecipientId;
    }

    /**
     * Get 控件所填写的内容 
     * @return ComponentValue 控件所填写的内容
     */
    public String getComponentValue() {
        return this.ComponentValue;
    }

    /**
     * Set 控件所填写的内容
     * @param ComponentValue 控件所填写的内容
     */
    public void setComponentValue(String ComponentValue) {
        this.ComponentValue = ComponentValue;
    }

    /**
     * Get 是否是表单域类型，默认不存在 
     * @return IsFormType 是否是表单域类型，默认不存在
     */
    public Boolean getIsFormType() {
        return this.IsFormType;
    }

    /**
     * Set 是否是表单域类型，默认不存在
     * @param IsFormType 是否是表单域类型，默认不存在
     */
    public void setIsFormType(Boolean IsFormType) {
        this.IsFormType = IsFormType;
    }

    /**
     * Get NORMAL 正常模式，使用坐标制定签署控件位置
FIELD 表单域，需使用ComponentName指定表单域名称
KEYWORD 关键字，使用ComponentId指定关键字 
     * @return GenerateMode NORMAL 正常模式，使用坐标制定签署控件位置
FIELD 表单域，需使用ComponentName指定表单域名称
KEYWORD 关键字，使用ComponentId指定关键字
     */
    public String getGenerateMode() {
        return this.GenerateMode;
    }

    /**
     * Set NORMAL 正常模式，使用坐标制定签署控件位置
FIELD 表单域，需使用ComponentName指定表单域名称
KEYWORD 关键字，使用ComponentId指定关键字
     * @param GenerateMode NORMAL 正常模式，使用坐标制定签署控件位置
FIELD 表单域，需使用ComponentName指定表单域名称
KEYWORD 关键字，使用ComponentId指定关键字
     */
    public void setGenerateMode(String GenerateMode) {
        this.GenerateMode = GenerateMode;
    }

    /**
     * Get 日期控件类型字号 
     * @return ComponentDateFontSize 日期控件类型字号
     */
    public Long getComponentDateFontSize() {
        return this.ComponentDateFontSize;
    }

    /**
     * Set 日期控件类型字号
     * @param ComponentDateFontSize 日期控件类型字号
     */
    public void setComponentDateFontSize(Long ComponentDateFontSize) {
        this.ComponentDateFontSize = ComponentDateFontSize;
    }

    /**
     * Get 指定关键字时横坐标偏移量 
     * @return OffsetX 指定关键字时横坐标偏移量
     */
    public Float getOffsetX() {
        return this.OffsetX;
    }

    /**
     * Set 指定关键字时横坐标偏移量
     * @param OffsetX 指定关键字时横坐标偏移量
     */
    public void setOffsetX(Float OffsetX) {
        this.OffsetX = OffsetX;
    }

    /**
     * Get 指定关键字时纵坐标偏移量 
     * @return OffsetY 指定关键字时纵坐标偏移量
     */
    public Float getOffsetY() {
        return this.OffsetY;
    }

    /**
     * Set 指定关键字时纵坐标偏移量
     * @param OffsetY 指定关键字时纵坐标偏移量
     */
    public void setOffsetY(Float OffsetY) {
        this.OffsetY = OffsetY;
    }

    public Component() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Component(Component source) {
        if (source.ComponentType != null) {
            this.ComponentType = new String(source.ComponentType);
        }
        if (source.ComponentWidth != null) {
            this.ComponentWidth = new Float(source.ComponentWidth);
        }
        if (source.ComponentHeight != null) {
            this.ComponentHeight = new Float(source.ComponentHeight);
        }
        if (source.ComponentPage != null) {
            this.ComponentPage = new Long(source.ComponentPage);
        }
        if (source.ComponentPosX != null) {
            this.ComponentPosX = new Float(source.ComponentPosX);
        }
        if (source.ComponentPosY != null) {
            this.ComponentPosY = new Float(source.ComponentPosY);
        }
        if (source.FileIndex != null) {
            this.FileIndex = new Long(source.FileIndex);
        }
        if (source.ComponentId != null) {
            this.ComponentId = new String(source.ComponentId);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.ComponentRequired != null) {
            this.ComponentRequired = new Boolean(source.ComponentRequired);
        }
        if (source.ComponentExtra != null) {
            this.ComponentExtra = new String(source.ComponentExtra);
        }
        if (source.ComponentRecipientId != null) {
            this.ComponentRecipientId = new String(source.ComponentRecipientId);
        }
        if (source.ComponentValue != null) {
            this.ComponentValue = new String(source.ComponentValue);
        }
        if (source.IsFormType != null) {
            this.IsFormType = new Boolean(source.IsFormType);
        }
        if (source.GenerateMode != null) {
            this.GenerateMode = new String(source.GenerateMode);
        }
        if (source.ComponentDateFontSize != null) {
            this.ComponentDateFontSize = new Long(source.ComponentDateFontSize);
        }
        if (source.OffsetX != null) {
            this.OffsetX = new Float(source.OffsetX);
        }
        if (source.OffsetY != null) {
            this.OffsetY = new Float(source.OffsetY);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentType", this.ComponentType);
        this.setParamSimple(map, prefix + "ComponentWidth", this.ComponentWidth);
        this.setParamSimple(map, prefix + "ComponentHeight", this.ComponentHeight);
        this.setParamSimple(map, prefix + "ComponentPage", this.ComponentPage);
        this.setParamSimple(map, prefix + "ComponentPosX", this.ComponentPosX);
        this.setParamSimple(map, prefix + "ComponentPosY", this.ComponentPosY);
        this.setParamSimple(map, prefix + "FileIndex", this.FileIndex);
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "ComponentRequired", this.ComponentRequired);
        this.setParamSimple(map, prefix + "ComponentExtra", this.ComponentExtra);
        this.setParamSimple(map, prefix + "ComponentRecipientId", this.ComponentRecipientId);
        this.setParamSimple(map, prefix + "ComponentValue", this.ComponentValue);
        this.setParamSimple(map, prefix + "IsFormType", this.IsFormType);
        this.setParamSimple(map, prefix + "GenerateMode", this.GenerateMode);
        this.setParamSimple(map, prefix + "ComponentDateFontSize", this.ComponentDateFontSize);
        this.setParamSimple(map, prefix + "OffsetX", this.OffsetX);
        this.setParamSimple(map, prefix + "OffsetY", this.OffsetY);

    }
}

