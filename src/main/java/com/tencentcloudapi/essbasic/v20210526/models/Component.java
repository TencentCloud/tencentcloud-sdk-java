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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Component extends AbstractModel{

    /**
    * 控件编号

CreateFlowByTemplates发起合同时优先以ComponentId（不为空）填充；否则以ComponentName填充

注：
当GenerateMode=3时，通过"^"来决定是否使用关键字整词匹配能力。
例：
当GenerateMode=3时，如果传入关键字"^甲方签署^"，则会在PDF文件中有且仅有"甲方签署"关键字的地方进行对应操作。
如传入的关键字为"甲方签署"，则PDF文件中每个出现关键字的位置都会执行相应操作。

创建控件时，此值为空
查询时返回完整结构
    */
    @SerializedName("ComponentId")
    @Expose
    private String ComponentId;

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
    * 控件简称，不能超过30个字符
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * 定义控件是否为必填项，默认为false
    */
    @SerializedName("ComponentRequired")
    @Expose
    private Boolean ComponentRequired;

    /**
    * 控件关联的签署方id
    */
    @SerializedName("ComponentRecipientId")
    @Expose
    private String ComponentRecipientId;

    /**
    * 控件所属文件的序号 (文档中文件的排列序号，从0开始)
    */
    @SerializedName("FileIndex")
    @Expose
    private Long FileIndex;

    /**
    * 控件生成的方式：
NORMAL - 普通控件
FIELD - 表单域
KEYWORD - 关键字
    */
    @SerializedName("GenerateMode")
    @Expose
    private String GenerateMode;

    /**
    * 参数控件宽度，默认100，单位px
表单域和关键字转换控件不用填
    */
    @SerializedName("ComponentWidth")
    @Expose
    private Float ComponentWidth;

    /**
    * 参数控件高度，默认100，单位px
表单域和关键字转换控件不用填
    */
    @SerializedName("ComponentHeight")
    @Expose
    private Float ComponentHeight;

    /**
    * 参数控件所在页码，从1开始
    */
    @SerializedName("ComponentPage")
    @Expose
    private Long ComponentPage;

    /**
    * 参数控件X位置，单位px
    */
    @SerializedName("ComponentPosX")
    @Expose
    private Float ComponentPosX;

    /**
    * 参数控件Y位置，单位px
    */
    @SerializedName("ComponentPosY")
    @Expose
    private Float ComponentPosY;

    /**
    * 参数控件样式，json格式表述

不同类型的控件会有部分非通用参数

TEXT/MULTI_LINE_TEXT控件可以指定
1 Font：目前只支持黑体、宋体
2 FontSize： 范围12-72
3 FontAlign： Left/Right/Center，左对齐/居中/右对齐
例如：{"FontSize":12}

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
    * 控件填充vaule，ComponentType和传入值类型对应关系：
TEXT - 文本内容
MULTI_LINE_TEXT - 文本内容
CHECK_BOX - true/false
FILL_IMAGE、ATTACHMENT - 附件的FileId，需要通过UploadFiles接口上传获取
SELECTOR - 选项值
DATE - 默认是格式化为xxxx年xx月xx日
DYNAMIC_TABLE - 传入json格式的表格内容，具体见数据结构FlowInfo：https://cloud.tencent.com/document/api/1420/61525#FlowInfo
SIGN_SEAL - 印章ID
SIGN_PAGING_SEAL - 可以指定印章ID
    */
    @SerializedName("ComponentValue")
    @Expose
    private String ComponentValue;

    /**
    * 日期签署控件的字号，默认为 12

签署区日期控件会转换成图片格式并带存证，需要通过字体决定图片大小
    */
    @SerializedName("ComponentDateFontSize")
    @Expose
    private Long ComponentDateFontSize;

    /**
    * 控件所属文档的Id, 模块相关接口为空值
    */
    @SerializedName("DocumentId")
    @Expose
    private String DocumentId;

    /**
    * 控件描述，不能超过30个字符
    */
    @SerializedName("ComponentDescription")
    @Expose
    private String ComponentDescription;

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
    * 渠道控件ID。
如果不为空，属于渠道预设控件；
    */
    @SerializedName("ChannelComponentId")
    @Expose
    private String ChannelComponentId;

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
    * 关键字索引，可选参数，如果一个关键字在PDF文件中存在多个，可以通过关键字索引指定使用第几个关键字作为最后的结果，可指定多个索引。示例[0,2]，说明使用PDF文件内第1个和第3个关键字位置。
    */
    @SerializedName("KeywordIndexes")
    @Expose
    private Long [] KeywordIndexes;

    /**
     * Get 控件编号

CreateFlowByTemplates发起合同时优先以ComponentId（不为空）填充；否则以ComponentName填充

注：
当GenerateMode=3时，通过"^"来决定是否使用关键字整词匹配能力。
例：
当GenerateMode=3时，如果传入关键字"^甲方签署^"，则会在PDF文件中有且仅有"甲方签署"关键字的地方进行对应操作。
如传入的关键字为"甲方签署"，则PDF文件中每个出现关键字的位置都会执行相应操作。

创建控件时，此值为空
查询时返回完整结构 
     * @return ComponentId 控件编号

CreateFlowByTemplates发起合同时优先以ComponentId（不为空）填充；否则以ComponentName填充

注：
当GenerateMode=3时，通过"^"来决定是否使用关键字整词匹配能力。
例：
当GenerateMode=3时，如果传入关键字"^甲方签署^"，则会在PDF文件中有且仅有"甲方签署"关键字的地方进行对应操作。
如传入的关键字为"甲方签署"，则PDF文件中每个出现关键字的位置都会执行相应操作。

创建控件时，此值为空
查询时返回完整结构
     */
    public String getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set 控件编号

CreateFlowByTemplates发起合同时优先以ComponentId（不为空）填充；否则以ComponentName填充

注：
当GenerateMode=3时，通过"^"来决定是否使用关键字整词匹配能力。
例：
当GenerateMode=3时，如果传入关键字"^甲方签署^"，则会在PDF文件中有且仅有"甲方签署"关键字的地方进行对应操作。
如传入的关键字为"甲方签署"，则PDF文件中每个出现关键字的位置都会执行相应操作。

创建控件时，此值为空
查询时返回完整结构
     * @param ComponentId 控件编号

CreateFlowByTemplates发起合同时优先以ComponentId（不为空）填充；否则以ComponentName填充

注：
当GenerateMode=3时，通过"^"来决定是否使用关键字整词匹配能力。
例：
当GenerateMode=3时，如果传入关键字"^甲方签署^"，则会在PDF文件中有且仅有"甲方签署"关键字的地方进行对应操作。
如传入的关键字为"甲方签署"，则PDF文件中每个出现关键字的位置都会执行相应操作。

创建控件时，此值为空
查询时返回完整结构
     */
    public void setComponentId(String ComponentId) {
        this.ComponentId = ComponentId;
    }

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
     * Get 控件简称，不能超过30个字符 
     * @return ComponentName 控件简称，不能超过30个字符
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 控件简称，不能超过30个字符
     * @param ComponentName 控件简称，不能超过30个字符
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get 定义控件是否为必填项，默认为false 
     * @return ComponentRequired 定义控件是否为必填项，默认为false
     */
    public Boolean getComponentRequired() {
        return this.ComponentRequired;
    }

    /**
     * Set 定义控件是否为必填项，默认为false
     * @param ComponentRequired 定义控件是否为必填项，默认为false
     */
    public void setComponentRequired(Boolean ComponentRequired) {
        this.ComponentRequired = ComponentRequired;
    }

    /**
     * Get 控件关联的签署方id 
     * @return ComponentRecipientId 控件关联的签署方id
     */
    public String getComponentRecipientId() {
        return this.ComponentRecipientId;
    }

    /**
     * Set 控件关联的签署方id
     * @param ComponentRecipientId 控件关联的签署方id
     */
    public void setComponentRecipientId(String ComponentRecipientId) {
        this.ComponentRecipientId = ComponentRecipientId;
    }

    /**
     * Get 控件所属文件的序号 (文档中文件的排列序号，从0开始) 
     * @return FileIndex 控件所属文件的序号 (文档中文件的排列序号，从0开始)
     */
    public Long getFileIndex() {
        return this.FileIndex;
    }

    /**
     * Set 控件所属文件的序号 (文档中文件的排列序号，从0开始)
     * @param FileIndex 控件所属文件的序号 (文档中文件的排列序号，从0开始)
     */
    public void setFileIndex(Long FileIndex) {
        this.FileIndex = FileIndex;
    }

    /**
     * Get 控件生成的方式：
NORMAL - 普通控件
FIELD - 表单域
KEYWORD - 关键字 
     * @return GenerateMode 控件生成的方式：
NORMAL - 普通控件
FIELD - 表单域
KEYWORD - 关键字
     */
    public String getGenerateMode() {
        return this.GenerateMode;
    }

    /**
     * Set 控件生成的方式：
NORMAL - 普通控件
FIELD - 表单域
KEYWORD - 关键字
     * @param GenerateMode 控件生成的方式：
NORMAL - 普通控件
FIELD - 表单域
KEYWORD - 关键字
     */
    public void setGenerateMode(String GenerateMode) {
        this.GenerateMode = GenerateMode;
    }

    /**
     * Get 参数控件宽度，默认100，单位px
表单域和关键字转换控件不用填 
     * @return ComponentWidth 参数控件宽度，默认100，单位px
表单域和关键字转换控件不用填
     */
    public Float getComponentWidth() {
        return this.ComponentWidth;
    }

    /**
     * Set 参数控件宽度，默认100，单位px
表单域和关键字转换控件不用填
     * @param ComponentWidth 参数控件宽度，默认100，单位px
表单域和关键字转换控件不用填
     */
    public void setComponentWidth(Float ComponentWidth) {
        this.ComponentWidth = ComponentWidth;
    }

    /**
     * Get 参数控件高度，默认100，单位px
表单域和关键字转换控件不用填 
     * @return ComponentHeight 参数控件高度，默认100，单位px
表单域和关键字转换控件不用填
     */
    public Float getComponentHeight() {
        return this.ComponentHeight;
    }

    /**
     * Set 参数控件高度，默认100，单位px
表单域和关键字转换控件不用填
     * @param ComponentHeight 参数控件高度，默认100，单位px
表单域和关键字转换控件不用填
     */
    public void setComponentHeight(Float ComponentHeight) {
        this.ComponentHeight = ComponentHeight;
    }

    /**
     * Get 参数控件所在页码，从1开始 
     * @return ComponentPage 参数控件所在页码，从1开始
     */
    public Long getComponentPage() {
        return this.ComponentPage;
    }

    /**
     * Set 参数控件所在页码，从1开始
     * @param ComponentPage 参数控件所在页码，从1开始
     */
    public void setComponentPage(Long ComponentPage) {
        this.ComponentPage = ComponentPage;
    }

    /**
     * Get 参数控件X位置，单位px 
     * @return ComponentPosX 参数控件X位置，单位px
     */
    public Float getComponentPosX() {
        return this.ComponentPosX;
    }

    /**
     * Set 参数控件X位置，单位px
     * @param ComponentPosX 参数控件X位置，单位px
     */
    public void setComponentPosX(Float ComponentPosX) {
        this.ComponentPosX = ComponentPosX;
    }

    /**
     * Get 参数控件Y位置，单位px 
     * @return ComponentPosY 参数控件Y位置，单位px
     */
    public Float getComponentPosY() {
        return this.ComponentPosY;
    }

    /**
     * Set 参数控件Y位置，单位px
     * @param ComponentPosY 参数控件Y位置，单位px
     */
    public void setComponentPosY(Float ComponentPosY) {
        this.ComponentPosY = ComponentPosY;
    }

    /**
     * Get 参数控件样式，json格式表述

不同类型的控件会有部分非通用参数

TEXT/MULTI_LINE_TEXT控件可以指定
1 Font：目前只支持黑体、宋体
2 FontSize： 范围12-72
3 FontAlign： Left/Right/Center，左对齐/居中/右对齐
例如：{"FontSize":12}

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
     * @return ComponentExtra 参数控件样式，json格式表述

不同类型的控件会有部分非通用参数

TEXT/MULTI_LINE_TEXT控件可以指定
1 Font：目前只支持黑体、宋体
2 FontSize： 范围12-72
3 FontAlign： Left/Right/Center，左对齐/居中/右对齐
例如：{"FontSize":12}

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
     * Set 参数控件样式，json格式表述

不同类型的控件会有部分非通用参数

TEXT/MULTI_LINE_TEXT控件可以指定
1 Font：目前只支持黑体、宋体
2 FontSize： 范围12-72
3 FontAlign： Left/Right/Center，左对齐/居中/右对齐
例如：{"FontSize":12}

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
     * @param ComponentExtra 参数控件样式，json格式表述

不同类型的控件会有部分非通用参数

TEXT/MULTI_LINE_TEXT控件可以指定
1 Font：目前只支持黑体、宋体
2 FontSize： 范围12-72
3 FontAlign： Left/Right/Center，左对齐/居中/右对齐
例如：{"FontSize":12}

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
     * Get 控件填充vaule，ComponentType和传入值类型对应关系：
TEXT - 文本内容
MULTI_LINE_TEXT - 文本内容
CHECK_BOX - true/false
FILL_IMAGE、ATTACHMENT - 附件的FileId，需要通过UploadFiles接口上传获取
SELECTOR - 选项值
DATE - 默认是格式化为xxxx年xx月xx日
DYNAMIC_TABLE - 传入json格式的表格内容，具体见数据结构FlowInfo：https://cloud.tencent.com/document/api/1420/61525#FlowInfo
SIGN_SEAL - 印章ID
SIGN_PAGING_SEAL - 可以指定印章ID 
     * @return ComponentValue 控件填充vaule，ComponentType和传入值类型对应关系：
TEXT - 文本内容
MULTI_LINE_TEXT - 文本内容
CHECK_BOX - true/false
FILL_IMAGE、ATTACHMENT - 附件的FileId，需要通过UploadFiles接口上传获取
SELECTOR - 选项值
DATE - 默认是格式化为xxxx年xx月xx日
DYNAMIC_TABLE - 传入json格式的表格内容，具体见数据结构FlowInfo：https://cloud.tencent.com/document/api/1420/61525#FlowInfo
SIGN_SEAL - 印章ID
SIGN_PAGING_SEAL - 可以指定印章ID
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
DATE - 默认是格式化为xxxx年xx月xx日
DYNAMIC_TABLE - 传入json格式的表格内容，具体见数据结构FlowInfo：https://cloud.tencent.com/document/api/1420/61525#FlowInfo
SIGN_SEAL - 印章ID
SIGN_PAGING_SEAL - 可以指定印章ID
     * @param ComponentValue 控件填充vaule，ComponentType和传入值类型对应关系：
TEXT - 文本内容
MULTI_LINE_TEXT - 文本内容
CHECK_BOX - true/false
FILL_IMAGE、ATTACHMENT - 附件的FileId，需要通过UploadFiles接口上传获取
SELECTOR - 选项值
DATE - 默认是格式化为xxxx年xx月xx日
DYNAMIC_TABLE - 传入json格式的表格内容，具体见数据结构FlowInfo：https://cloud.tencent.com/document/api/1420/61525#FlowInfo
SIGN_SEAL - 印章ID
SIGN_PAGING_SEAL - 可以指定印章ID
     */
    public void setComponentValue(String ComponentValue) {
        this.ComponentValue = ComponentValue;
    }

    /**
     * Get 日期签署控件的字号，默认为 12

签署区日期控件会转换成图片格式并带存证，需要通过字体决定图片大小 
     * @return ComponentDateFontSize 日期签署控件的字号，默认为 12

签署区日期控件会转换成图片格式并带存证，需要通过字体决定图片大小
     */
    public Long getComponentDateFontSize() {
        return this.ComponentDateFontSize;
    }

    /**
     * Set 日期签署控件的字号，默认为 12

签署区日期控件会转换成图片格式并带存证，需要通过字体决定图片大小
     * @param ComponentDateFontSize 日期签署控件的字号，默认为 12

签署区日期控件会转换成图片格式并带存证，需要通过字体决定图片大小
     */
    public void setComponentDateFontSize(Long ComponentDateFontSize) {
        this.ComponentDateFontSize = ComponentDateFontSize;
    }

    /**
     * Get 控件所属文档的Id, 模块相关接口为空值 
     * @return DocumentId 控件所属文档的Id, 模块相关接口为空值
     */
    public String getDocumentId() {
        return this.DocumentId;
    }

    /**
     * Set 控件所属文档的Id, 模块相关接口为空值
     * @param DocumentId 控件所属文档的Id, 模块相关接口为空值
     */
    public void setDocumentId(String DocumentId) {
        this.DocumentId = DocumentId;
    }

    /**
     * Get 控件描述，不能超过30个字符 
     * @return ComponentDescription 控件描述，不能超过30个字符
     */
    public String getComponentDescription() {
        return this.ComponentDescription;
    }

    /**
     * Set 控件描述，不能超过30个字符
     * @param ComponentDescription 控件描述，不能超过30个字符
     */
    public void setComponentDescription(String ComponentDescription) {
        this.ComponentDescription = ComponentDescription;
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
     * Get 渠道控件ID。
如果不为空，属于渠道预设控件； 
     * @return ChannelComponentId 渠道控件ID。
如果不为空，属于渠道预设控件；
     */
    public String getChannelComponentId() {
        return this.ChannelComponentId;
    }

    /**
     * Set 渠道控件ID。
如果不为空，属于渠道预设控件；
     * @param ChannelComponentId 渠道控件ID。
如果不为空，属于渠道预设控件；
     */
    public void setChannelComponentId(String ChannelComponentId) {
        this.ChannelComponentId = ChannelComponentId;
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
     * Get 关键字索引，可选参数，如果一个关键字在PDF文件中存在多个，可以通过关键字索引指定使用第几个关键字作为最后的结果，可指定多个索引。示例[0,2]，说明使用PDF文件内第1个和第3个关键字位置。 
     * @return KeywordIndexes 关键字索引，可选参数，如果一个关键字在PDF文件中存在多个，可以通过关键字索引指定使用第几个关键字作为最后的结果，可指定多个索引。示例[0,2]，说明使用PDF文件内第1个和第3个关键字位置。
     */
    public Long [] getKeywordIndexes() {
        return this.KeywordIndexes;
    }

    /**
     * Set 关键字索引，可选参数，如果一个关键字在PDF文件中存在多个，可以通过关键字索引指定使用第几个关键字作为最后的结果，可指定多个索引。示例[0,2]，说明使用PDF文件内第1个和第3个关键字位置。
     * @param KeywordIndexes 关键字索引，可选参数，如果一个关键字在PDF文件中存在多个，可以通过关键字索引指定使用第几个关键字作为最后的结果，可指定多个索引。示例[0,2]，说明使用PDF文件内第1个和第3个关键字位置。
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
        if (source.ComponentId != null) {
            this.ComponentId = new String(source.ComponentId);
        }
        if (source.ComponentType != null) {
            this.ComponentType = new String(source.ComponentType);
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
        if (source.FileIndex != null) {
            this.FileIndex = new Long(source.FileIndex);
        }
        if (source.GenerateMode != null) {
            this.GenerateMode = new String(source.GenerateMode);
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
        if (source.ComponentExtra != null) {
            this.ComponentExtra = new String(source.ComponentExtra);
        }
        if (source.ComponentValue != null) {
            this.ComponentValue = new String(source.ComponentValue);
        }
        if (source.ComponentDateFontSize != null) {
            this.ComponentDateFontSize = new Long(source.ComponentDateFontSize);
        }
        if (source.DocumentId != null) {
            this.DocumentId = new String(source.DocumentId);
        }
        if (source.ComponentDescription != null) {
            this.ComponentDescription = new String(source.ComponentDescription);
        }
        if (source.OffsetX != null) {
            this.OffsetX = new Float(source.OffsetX);
        }
        if (source.OffsetY != null) {
            this.OffsetY = new Float(source.OffsetY);
        }
        if (source.ChannelComponentId != null) {
            this.ChannelComponentId = new String(source.ChannelComponentId);
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
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);
        this.setParamSimple(map, prefix + "ComponentType", this.ComponentType);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "ComponentRequired", this.ComponentRequired);
        this.setParamSimple(map, prefix + "ComponentRecipientId", this.ComponentRecipientId);
        this.setParamSimple(map, prefix + "FileIndex", this.FileIndex);
        this.setParamSimple(map, prefix + "GenerateMode", this.GenerateMode);
        this.setParamSimple(map, prefix + "ComponentWidth", this.ComponentWidth);
        this.setParamSimple(map, prefix + "ComponentHeight", this.ComponentHeight);
        this.setParamSimple(map, prefix + "ComponentPage", this.ComponentPage);
        this.setParamSimple(map, prefix + "ComponentPosX", this.ComponentPosX);
        this.setParamSimple(map, prefix + "ComponentPosY", this.ComponentPosY);
        this.setParamSimple(map, prefix + "ComponentExtra", this.ComponentExtra);
        this.setParamSimple(map, prefix + "ComponentValue", this.ComponentValue);
        this.setParamSimple(map, prefix + "ComponentDateFontSize", this.ComponentDateFontSize);
        this.setParamSimple(map, prefix + "DocumentId", this.DocumentId);
        this.setParamSimple(map, prefix + "ComponentDescription", this.ComponentDescription);
        this.setParamSimple(map, prefix + "OffsetX", this.OffsetX);
        this.setParamSimple(map, prefix + "OffsetY", this.OffsetY);
        this.setParamSimple(map, prefix + "ChannelComponentId", this.ChannelComponentId);
        this.setParamSimple(map, prefix + "KeywordPage", this.KeywordPage);
        this.setParamSimple(map, prefix + "RelativeLocation", this.RelativeLocation);
        this.setParamArraySimple(map, prefix + "KeywordIndexes.", this.KeywordIndexes);

    }
}

