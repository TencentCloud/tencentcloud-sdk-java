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
    * 如果是Component控件类型，则可选的字段为：
TEXT - 普通文本控件；
MULTI_LINE_TEXT - 多行文本控件；
CHECK_BOX - 勾选框控件；
FILL_IMAGE - 图片控件；
DYNAMIC_TABLE - 动态表格控件；
ATTACHMENT - 附件控件；
SELECTOR - 选择器控件；
DATE - 日期控件；默认是格式化为xxxx年xx月xx日；
DISTRICT - 省市区行政区划控件；

如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL - 签署印章控件；
SIGN_DATE - 签署日期控件；
SIGN_SIGNATURE - 用户签名控件；
SIGN_PERSONAL_SEAL - 个人签署印章控件（使用文件发起暂不支持此类型）；
SIGN_PAGING_SEAL - 骑缝章；若文件发起，需要对应填充ComponentPosY、ComponentWidth、ComponentHeight
SIGN_OPINION - 签署意见控件，用户需要根据配置的签署意见内容，完成对意见内容的确认

表单域的控件不能作为印章和签名控件
    */
    @SerializedName("ComponentType")
    @Expose
    private String ComponentType;

    /**
    * 控件所属文件的序号（模板中的resourceId排列序号，取值为：0-N）
    */
    @SerializedName("FileIndex")
    @Expose
    private Long FileIndex;

    /**
    * 参数控件高度，单位pt
    */
    @SerializedName("ComponentHeight")
    @Expose
    private Float ComponentHeight;

    /**
    * 参数控件宽度，单位pt
    */
    @SerializedName("ComponentWidth")
    @Expose
    private Float ComponentWidth;

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
    * 控件关联的签署人ID
    */
    @SerializedName("ComponentRecipientId")
    @Expose
    private String ComponentRecipientId;

    /**
    * 扩展参数：
为JSON格式。

ComponentType为FILL_IMAGE时，支持以下参数：
NotMakeImageCenter：bool。是否设置图片居中。false：居中（默认）。 true: 不居中
FillMethod: int. 填充方式。0-铺满（默认）；1-等比例缩放

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
    * 是否是表单域类型，默认不存在
    */
    @SerializedName("IsFormType")
    @Expose
    private Boolean IsFormType;

    /**
    * 控件填充vaule，ComponentType和传入值类型对应关系：
TEXT - 文本内容
MULTI_LINE_TEXT - 文本内容
CHECK_BOX - true/false
FILL_IMAGE、ATTACHMENT - 附件的FileId，需要通过UploadFiles接口上传获取
SELECTOR - 选项值
DYNAMIC_TABLE - 传入json格式的表格内容，具体见数据结构FlowInfo：https://cloud.tencent.com/document/api/1420/61525#FlowInfo
DATE - 默认是格式化为xxxx年xx月xx日
SIGN_SEAL - 印章ID，于控制台查询获取
SIGN_PAGING_SEAL - 可以指定印章ID，于控制台查询获取
    */
    @SerializedName("ComponentValue")
    @Expose
    private String ComponentValue;

    /**
    * NORMAL 正常模式，使用坐标制定签署控件位置
FIELD 表单域，需使用ComponentName指定表单域名称
KEYWORD 关键字，使用ComponentId指定关键字
    */
    @SerializedName("GenerateMode")
    @Expose
    private String GenerateMode;

    /**
    * 日期签署控件的字号，默认为 12
    */
    @SerializedName("ComponentDateFontSize")
    @Expose
    private Long ComponentDateFontSize;

    /**
    * 渠道版控件 id 标识
    */
    @SerializedName("ChannelComponentId")
    @Expose
    private String ChannelComponentId;

    /**
    * 指定关键字时横坐标偏移量，单位pt
    */
    @SerializedName("OffsetX")
    @Expose
    private Float OffsetX;

    /**
    * 指定关键字时纵坐标偏移量，单位pt
    */
    @SerializedName("OffsetY")
    @Expose
    private Float OffsetY;

    /**
    * //渠道子客控件来源。0-渠道指定；1-用户自定义
    */
    @SerializedName("ChannelComponentSource")
    @Expose
    private Long ChannelComponentSource;

    /**
    * 指定关键字排序规则，Positive-正序，Reverse-倒序。传入Positive时会根据关键字在PDF文件内的顺序进行排列。在指定KeywordIndexes时，0代表在PDF内查找内容时，查找到的第一个关键字。
传入Reverse时会根据关键字在PDF文件内的反序进行排列。在指定KeywordIndexes时，0代表在PDF内查找内容时，查找到的最后一个关键字。
    */
    @SerializedName("KeywordOrder")
    @Expose
    private String KeywordOrder;

    /**
    * 指定关键字页码，可选参数，指定页码后，将只在指定的页码内查找关键字，非该页码的关键字将不会查询出来
    */
    @SerializedName("KeywordPage")
    @Expose
    private Long KeywordPage;

    /**
    * 关键字位置模式，Middle-居中，Below-正下方，Right-正右方，LowerRight-右上角，UpperRight-右下角。示例：如果设置Middle的关键字盖章，则印章的中心会和关键字的中心重合，如果设置Below，则印章在关键字的正下方
    */
    @SerializedName("RelativeLocation")
    @Expose
    private String RelativeLocation;

    /**
    * 关键字索引，可选参数，如果一个关键字在PDF文件中存在多个，可以通过关键字索引指定使用第几个关键字作为最后的结果，可指定多个索引。示例：[0,2]，说明使用PDF文件内第1个和第3个关键字位置。
    */
    @SerializedName("KeywordIndexes")
    @Expose
    private Long [] KeywordIndexes;

    /**
     * Get 如果是Component控件类型，则可选的字段为：
TEXT - 普通文本控件；
MULTI_LINE_TEXT - 多行文本控件；
CHECK_BOX - 勾选框控件；
FILL_IMAGE - 图片控件；
DYNAMIC_TABLE - 动态表格控件；
ATTACHMENT - 附件控件；
SELECTOR - 选择器控件；
DATE - 日期控件；默认是格式化为xxxx年xx月xx日；
DISTRICT - 省市区行政区划控件；

如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL - 签署印章控件；
SIGN_DATE - 签署日期控件；
SIGN_SIGNATURE - 用户签名控件；
SIGN_PERSONAL_SEAL - 个人签署印章控件（使用文件发起暂不支持此类型）；
SIGN_PAGING_SEAL - 骑缝章；若文件发起，需要对应填充ComponentPosY、ComponentWidth、ComponentHeight
SIGN_OPINION - 签署意见控件，用户需要根据配置的签署意见内容，完成对意见内容的确认

表单域的控件不能作为印章和签名控件 
     * @return ComponentType 如果是Component控件类型，则可选的字段为：
TEXT - 普通文本控件；
MULTI_LINE_TEXT - 多行文本控件；
CHECK_BOX - 勾选框控件；
FILL_IMAGE - 图片控件；
DYNAMIC_TABLE - 动态表格控件；
ATTACHMENT - 附件控件；
SELECTOR - 选择器控件；
DATE - 日期控件；默认是格式化为xxxx年xx月xx日；
DISTRICT - 省市区行政区划控件；

如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL - 签署印章控件；
SIGN_DATE - 签署日期控件；
SIGN_SIGNATURE - 用户签名控件；
SIGN_PERSONAL_SEAL - 个人签署印章控件（使用文件发起暂不支持此类型）；
SIGN_PAGING_SEAL - 骑缝章；若文件发起，需要对应填充ComponentPosY、ComponentWidth、ComponentHeight
SIGN_OPINION - 签署意见控件，用户需要根据配置的签署意见内容，完成对意见内容的确认

表单域的控件不能作为印章和签名控件
     */
    public String getComponentType() {
        return this.ComponentType;
    }

    /**
     * Set 如果是Component控件类型，则可选的字段为：
TEXT - 普通文本控件；
MULTI_LINE_TEXT - 多行文本控件；
CHECK_BOX - 勾选框控件；
FILL_IMAGE - 图片控件；
DYNAMIC_TABLE - 动态表格控件；
ATTACHMENT - 附件控件；
SELECTOR - 选择器控件；
DATE - 日期控件；默认是格式化为xxxx年xx月xx日；
DISTRICT - 省市区行政区划控件；

如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL - 签署印章控件；
SIGN_DATE - 签署日期控件；
SIGN_SIGNATURE - 用户签名控件；
SIGN_PERSONAL_SEAL - 个人签署印章控件（使用文件发起暂不支持此类型）；
SIGN_PAGING_SEAL - 骑缝章；若文件发起，需要对应填充ComponentPosY、ComponentWidth、ComponentHeight
SIGN_OPINION - 签署意见控件，用户需要根据配置的签署意见内容，完成对意见内容的确认

表单域的控件不能作为印章和签名控件
     * @param ComponentType 如果是Component控件类型，则可选的字段为：
TEXT - 普通文本控件；
MULTI_LINE_TEXT - 多行文本控件；
CHECK_BOX - 勾选框控件；
FILL_IMAGE - 图片控件；
DYNAMIC_TABLE - 动态表格控件；
ATTACHMENT - 附件控件；
SELECTOR - 选择器控件；
DATE - 日期控件；默认是格式化为xxxx年xx月xx日；
DISTRICT - 省市区行政区划控件；

如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL - 签署印章控件；
SIGN_DATE - 签署日期控件；
SIGN_SIGNATURE - 用户签名控件；
SIGN_PERSONAL_SEAL - 个人签署印章控件（使用文件发起暂不支持此类型）；
SIGN_PAGING_SEAL - 骑缝章；若文件发起，需要对应填充ComponentPosY、ComponentWidth、ComponentHeight
SIGN_OPINION - 签署意见控件，用户需要根据配置的签署意见内容，完成对意见内容的确认

表单域的控件不能作为印章和签名控件
     */
    public void setComponentType(String ComponentType) {
        this.ComponentType = ComponentType;
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
     * Get 扩展参数：
为JSON格式。

ComponentType为FILL_IMAGE时，支持以下参数：
NotMakeImageCenter：bool。是否设置图片居中。false：居中（默认）。 true: 不居中
FillMethod: int. 填充方式。0-铺满（默认）；1-等比例缩放

ComponentType为SIGN_SIGNATURE类型可以控制签署方式
{“ComponentTypeLimit”: [“xxx”]}
xxx可以为：
HANDWRITE – 手写签名
BORDERLESS_ESIGN – 自动生成无边框腾讯体
OCR_ESIGN -- AI智能识别手写签名
ESIGN -- 个人印章类型
如：{“ComponentTypeLimit”: [“BORDERLESS_ESIGN”]} 
     * @return ComponentExtra 扩展参数：
为JSON格式。

ComponentType为FILL_IMAGE时，支持以下参数：
NotMakeImageCenter：bool。是否设置图片居中。false：居中（默认）。 true: 不居中
FillMethod: int. 填充方式。0-铺满（默认）；1-等比例缩放

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
为JSON格式。

ComponentType为FILL_IMAGE时，支持以下参数：
NotMakeImageCenter：bool。是否设置图片居中。false：居中（默认）。 true: 不居中
FillMethod: int. 填充方式。0-铺满（默认）；1-等比例缩放

ComponentType为SIGN_SIGNATURE类型可以控制签署方式
{“ComponentTypeLimit”: [“xxx”]}
xxx可以为：
HANDWRITE – 手写签名
BORDERLESS_ESIGN – 自动生成无边框腾讯体
OCR_ESIGN -- AI智能识别手写签名
ESIGN -- 个人印章类型
如：{“ComponentTypeLimit”: [“BORDERLESS_ESIGN”]}
     * @param ComponentExtra 扩展参数：
为JSON格式。

ComponentType为FILL_IMAGE时，支持以下参数：
NotMakeImageCenter：bool。是否设置图片居中。false：居中（默认）。 true: 不居中
FillMethod: int. 填充方式。0-铺满（默认）；1-等比例缩放

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
     * Get 控件填充vaule，ComponentType和传入值类型对应关系：
TEXT - 文本内容
MULTI_LINE_TEXT - 文本内容
CHECK_BOX - true/false
FILL_IMAGE、ATTACHMENT - 附件的FileId，需要通过UploadFiles接口上传获取
SELECTOR - 选项值
DYNAMIC_TABLE - 传入json格式的表格内容，具体见数据结构FlowInfo：https://cloud.tencent.com/document/api/1420/61525#FlowInfo
DATE - 默认是格式化为xxxx年xx月xx日
SIGN_SEAL - 印章ID，于控制台查询获取
SIGN_PAGING_SEAL - 可以指定印章ID，于控制台查询获取 
     * @return ComponentValue 控件填充vaule，ComponentType和传入值类型对应关系：
TEXT - 文本内容
MULTI_LINE_TEXT - 文本内容
CHECK_BOX - true/false
FILL_IMAGE、ATTACHMENT - 附件的FileId，需要通过UploadFiles接口上传获取
SELECTOR - 选项值
DYNAMIC_TABLE - 传入json格式的表格内容，具体见数据结构FlowInfo：https://cloud.tencent.com/document/api/1420/61525#FlowInfo
DATE - 默认是格式化为xxxx年xx月xx日
SIGN_SEAL - 印章ID，于控制台查询获取
SIGN_PAGING_SEAL - 可以指定印章ID，于控制台查询获取
     */
    public String getComponentValue() {
        return this.ComponentValue;
    }

    /**
     * Set 控件填充vaule，ComponentType和传入值类型对应关系：
TEXT - 文本内容
MULTI_LINE_TEXT - 文本内容
CHECK_BOX - true/false
FILL_IMAGE、ATTACHMENT - 附件的FileId，需要通过UploadFiles接口上传获取
SELECTOR - 选项值
DYNAMIC_TABLE - 传入json格式的表格内容，具体见数据结构FlowInfo：https://cloud.tencent.com/document/api/1420/61525#FlowInfo
DATE - 默认是格式化为xxxx年xx月xx日
SIGN_SEAL - 印章ID，于控制台查询获取
SIGN_PAGING_SEAL - 可以指定印章ID，于控制台查询获取
     * @param ComponentValue 控件填充vaule，ComponentType和传入值类型对应关系：
TEXT - 文本内容
MULTI_LINE_TEXT - 文本内容
CHECK_BOX - true/false
FILL_IMAGE、ATTACHMENT - 附件的FileId，需要通过UploadFiles接口上传获取
SELECTOR - 选项值
DYNAMIC_TABLE - 传入json格式的表格内容，具体见数据结构FlowInfo：https://cloud.tencent.com/document/api/1420/61525#FlowInfo
DATE - 默认是格式化为xxxx年xx月xx日
SIGN_SEAL - 印章ID，于控制台查询获取
SIGN_PAGING_SEAL - 可以指定印章ID，于控制台查询获取
     */
    public void setComponentValue(String ComponentValue) {
        this.ComponentValue = ComponentValue;
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
     * Get 日期签署控件的字号，默认为 12 
     * @return ComponentDateFontSize 日期签署控件的字号，默认为 12
     */
    public Long getComponentDateFontSize() {
        return this.ComponentDateFontSize;
    }

    /**
     * Set 日期签署控件的字号，默认为 12
     * @param ComponentDateFontSize 日期签署控件的字号，默认为 12
     */
    public void setComponentDateFontSize(Long ComponentDateFontSize) {
        this.ComponentDateFontSize = ComponentDateFontSize;
    }

    /**
     * Get 渠道版控件 id 标识 
     * @return ChannelComponentId 渠道版控件 id 标识
     */
    public String getChannelComponentId() {
        return this.ChannelComponentId;
    }

    /**
     * Set 渠道版控件 id 标识
     * @param ChannelComponentId 渠道版控件 id 标识
     */
    public void setChannelComponentId(String ChannelComponentId) {
        this.ChannelComponentId = ChannelComponentId;
    }

    /**
     * Get 指定关键字时横坐标偏移量，单位pt 
     * @return OffsetX 指定关键字时横坐标偏移量，单位pt
     */
    public Float getOffsetX() {
        return this.OffsetX;
    }

    /**
     * Set 指定关键字时横坐标偏移量，单位pt
     * @param OffsetX 指定关键字时横坐标偏移量，单位pt
     */
    public void setOffsetX(Float OffsetX) {
        this.OffsetX = OffsetX;
    }

    /**
     * Get 指定关键字时纵坐标偏移量，单位pt 
     * @return OffsetY 指定关键字时纵坐标偏移量，单位pt
     */
    public Float getOffsetY() {
        return this.OffsetY;
    }

    /**
     * Set 指定关键字时纵坐标偏移量，单位pt
     * @param OffsetY 指定关键字时纵坐标偏移量，单位pt
     */
    public void setOffsetY(Float OffsetY) {
        this.OffsetY = OffsetY;
    }

    /**
     * Get //渠道子客控件来源。0-渠道指定；1-用户自定义 
     * @return ChannelComponentSource //渠道子客控件来源。0-渠道指定；1-用户自定义
     */
    public Long getChannelComponentSource() {
        return this.ChannelComponentSource;
    }

    /**
     * Set //渠道子客控件来源。0-渠道指定；1-用户自定义
     * @param ChannelComponentSource //渠道子客控件来源。0-渠道指定；1-用户自定义
     */
    public void setChannelComponentSource(Long ChannelComponentSource) {
        this.ChannelComponentSource = ChannelComponentSource;
    }

    /**
     * Get 指定关键字排序规则，Positive-正序，Reverse-倒序。传入Positive时会根据关键字在PDF文件内的顺序进行排列。在指定KeywordIndexes时，0代表在PDF内查找内容时，查找到的第一个关键字。
传入Reverse时会根据关键字在PDF文件内的反序进行排列。在指定KeywordIndexes时，0代表在PDF内查找内容时，查找到的最后一个关键字。 
     * @return KeywordOrder 指定关键字排序规则，Positive-正序，Reverse-倒序。传入Positive时会根据关键字在PDF文件内的顺序进行排列。在指定KeywordIndexes时，0代表在PDF内查找内容时，查找到的第一个关键字。
传入Reverse时会根据关键字在PDF文件内的反序进行排列。在指定KeywordIndexes时，0代表在PDF内查找内容时，查找到的最后一个关键字。
     */
    public String getKeywordOrder() {
        return this.KeywordOrder;
    }

    /**
     * Set 指定关键字排序规则，Positive-正序，Reverse-倒序。传入Positive时会根据关键字在PDF文件内的顺序进行排列。在指定KeywordIndexes时，0代表在PDF内查找内容时，查找到的第一个关键字。
传入Reverse时会根据关键字在PDF文件内的反序进行排列。在指定KeywordIndexes时，0代表在PDF内查找内容时，查找到的最后一个关键字。
     * @param KeywordOrder 指定关键字排序规则，Positive-正序，Reverse-倒序。传入Positive时会根据关键字在PDF文件内的顺序进行排列。在指定KeywordIndexes时，0代表在PDF内查找内容时，查找到的第一个关键字。
传入Reverse时会根据关键字在PDF文件内的反序进行排列。在指定KeywordIndexes时，0代表在PDF内查找内容时，查找到的最后一个关键字。
     */
    public void setKeywordOrder(String KeywordOrder) {
        this.KeywordOrder = KeywordOrder;
    }

    /**
     * Get 指定关键字页码，可选参数，指定页码后，将只在指定的页码内查找关键字，非该页码的关键字将不会查询出来 
     * @return KeywordPage 指定关键字页码，可选参数，指定页码后，将只在指定的页码内查找关键字，非该页码的关键字将不会查询出来
     */
    public Long getKeywordPage() {
        return this.KeywordPage;
    }

    /**
     * Set 指定关键字页码，可选参数，指定页码后，将只在指定的页码内查找关键字，非该页码的关键字将不会查询出来
     * @param KeywordPage 指定关键字页码，可选参数，指定页码后，将只在指定的页码内查找关键字，非该页码的关键字将不会查询出来
     */
    public void setKeywordPage(Long KeywordPage) {
        this.KeywordPage = KeywordPage;
    }

    /**
     * Get 关键字位置模式，Middle-居中，Below-正下方，Right-正右方，LowerRight-右上角，UpperRight-右下角。示例：如果设置Middle的关键字盖章，则印章的中心会和关键字的中心重合，如果设置Below，则印章在关键字的正下方 
     * @return RelativeLocation 关键字位置模式，Middle-居中，Below-正下方，Right-正右方，LowerRight-右上角，UpperRight-右下角。示例：如果设置Middle的关键字盖章，则印章的中心会和关键字的中心重合，如果设置Below，则印章在关键字的正下方
     */
    public String getRelativeLocation() {
        return this.RelativeLocation;
    }

    /**
     * Set 关键字位置模式，Middle-居中，Below-正下方，Right-正右方，LowerRight-右上角，UpperRight-右下角。示例：如果设置Middle的关键字盖章，则印章的中心会和关键字的中心重合，如果设置Below，则印章在关键字的正下方
     * @param RelativeLocation 关键字位置模式，Middle-居中，Below-正下方，Right-正右方，LowerRight-右上角，UpperRight-右下角。示例：如果设置Middle的关键字盖章，则印章的中心会和关键字的中心重合，如果设置Below，则印章在关键字的正下方
     */
    public void setRelativeLocation(String RelativeLocation) {
        this.RelativeLocation = RelativeLocation;
    }

    /**
     * Get 关键字索引，可选参数，如果一个关键字在PDF文件中存在多个，可以通过关键字索引指定使用第几个关键字作为最后的结果，可指定多个索引。示例：[0,2]，说明使用PDF文件内第1个和第3个关键字位置。 
     * @return KeywordIndexes 关键字索引，可选参数，如果一个关键字在PDF文件中存在多个，可以通过关键字索引指定使用第几个关键字作为最后的结果，可指定多个索引。示例：[0,2]，说明使用PDF文件内第1个和第3个关键字位置。
     */
    public Long [] getKeywordIndexes() {
        return this.KeywordIndexes;
    }

    /**
     * Set 关键字索引，可选参数，如果一个关键字在PDF文件中存在多个，可以通过关键字索引指定使用第几个关键字作为最后的结果，可指定多个索引。示例：[0,2]，说明使用PDF文件内第1个和第3个关键字位置。
     * @param KeywordIndexes 关键字索引，可选参数，如果一个关键字在PDF文件中存在多个，可以通过关键字索引指定使用第几个关键字作为最后的结果，可指定多个索引。示例：[0,2]，说明使用PDF文件内第1个和第3个关键字位置。
     */
    public void setKeywordIndexes(Long [] KeywordIndexes) {
        this.KeywordIndexes = KeywordIndexes;
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
        if (source.FileIndex != null) {
            this.FileIndex = new Long(source.FileIndex);
        }
        if (source.ComponentHeight != null) {
            this.ComponentHeight = new Float(source.ComponentHeight);
        }
        if (source.ComponentWidth != null) {
            this.ComponentWidth = new Float(source.ComponentWidth);
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
        if (source.ComponentId != null) {
            this.ComponentId = new String(source.ComponentId);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.ComponentRequired != null) {
            this.ComponentRequired = new Boolean(source.ComponentRequired);
        }
        if (source.ComponentRecipientId != null) {
            this.ComponentRecipientId = new String(source.ComponentRecipientId);
        }
        if (source.ComponentExtra != null) {
            this.ComponentExtra = new String(source.ComponentExtra);
        }
        if (source.IsFormType != null) {
            this.IsFormType = new Boolean(source.IsFormType);
        }
        if (source.ComponentValue != null) {
            this.ComponentValue = new String(source.ComponentValue);
        }
        if (source.GenerateMode != null) {
            this.GenerateMode = new String(source.GenerateMode);
        }
        if (source.ComponentDateFontSize != null) {
            this.ComponentDateFontSize = new Long(source.ComponentDateFontSize);
        }
        if (source.ChannelComponentId != null) {
            this.ChannelComponentId = new String(source.ChannelComponentId);
        }
        if (source.OffsetX != null) {
            this.OffsetX = new Float(source.OffsetX);
        }
        if (source.OffsetY != null) {
            this.OffsetY = new Float(source.OffsetY);
        }
        if (source.ChannelComponentSource != null) {
            this.ChannelComponentSource = new Long(source.ChannelComponentSource);
        }
        if (source.KeywordOrder != null) {
            this.KeywordOrder = new String(source.KeywordOrder);
        }
        if (source.KeywordPage != null) {
            this.KeywordPage = new Long(source.KeywordPage);
        }
        if (source.RelativeLocation != null) {
            this.RelativeLocation = new String(source.RelativeLocation);
        }
        if (source.KeywordIndexes != null) {
            this.KeywordIndexes = new Long[source.KeywordIndexes.length];
            for (int i = 0; i < source.KeywordIndexes.length; i++) {
                this.KeywordIndexes[i] = new Long(source.KeywordIndexes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentType", this.ComponentType);
        this.setParamSimple(map, prefix + "FileIndex", this.FileIndex);
        this.setParamSimple(map, prefix + "ComponentHeight", this.ComponentHeight);
        this.setParamSimple(map, prefix + "ComponentWidth", this.ComponentWidth);
        this.setParamSimple(map, prefix + "ComponentPage", this.ComponentPage);
        this.setParamSimple(map, prefix + "ComponentPosX", this.ComponentPosX);
        this.setParamSimple(map, prefix + "ComponentPosY", this.ComponentPosY);
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "ComponentRequired", this.ComponentRequired);
        this.setParamSimple(map, prefix + "ComponentRecipientId", this.ComponentRecipientId);
        this.setParamSimple(map, prefix + "ComponentExtra", this.ComponentExtra);
        this.setParamSimple(map, prefix + "IsFormType", this.IsFormType);
        this.setParamSimple(map, prefix + "ComponentValue", this.ComponentValue);
        this.setParamSimple(map, prefix + "GenerateMode", this.GenerateMode);
        this.setParamSimple(map, prefix + "ComponentDateFontSize", this.ComponentDateFontSize);
        this.setParamSimple(map, prefix + "ChannelComponentId", this.ChannelComponentId);
        this.setParamSimple(map, prefix + "OffsetX", this.OffsetX);
        this.setParamSimple(map, prefix + "OffsetY", this.OffsetY);
        this.setParamSimple(map, prefix + "ChannelComponentSource", this.ChannelComponentSource);
        this.setParamSimple(map, prefix + "KeywordOrder", this.KeywordOrder);
        this.setParamSimple(map, prefix + "KeywordPage", this.KeywordPage);
        this.setParamSimple(map, prefix + "RelativeLocation", this.RelativeLocation);
        this.setParamArraySimple(map, prefix + "KeywordIndexes.", this.KeywordIndexes);

    }
}

