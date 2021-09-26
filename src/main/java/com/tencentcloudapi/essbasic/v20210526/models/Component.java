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
DATE - 普通日期控件；跟TEXT相比会有校验逻辑
如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL - 签署印章控件；
SIGN_DATE - 签署日期控件；
SIGN_SIGNATURE - 用户签名控件；
SIGN_PERSONAL_SEAL - 个人签署印章控件；

表单域的控件不能作为印章和签名控件
    */
    @SerializedName("ComponentType")
    @Expose
    private String ComponentType;

    /**
    * 控件简称
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
    * 控件所属文件的序号 (文档中文件的排列序号)
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
    * 参数控件所在页码
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
TEXT控件可以指定字体
例如：{"FontSize":12}
    */
    @SerializedName("ComponentExtra")
    @Expose
    private String ComponentExtra;

    /**
    * 印章 ID，传参 DEFAULT_COMPANY_SEAL 表示使用默认印章。
控件填入内容，印章控件里面，如果是手写签名内容为PNG图片格式的base64编码
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
    * 控件描述
    */
    @SerializedName("ComponentDescription")
    @Expose
    private String ComponentDescription;

    /**
     * Get 控件编号

注：
当GenerateMode=3时，通过"^"来决定是否使用关键字整词匹配能力。
例：
当GenerateMode=3时，如果传入关键字"^甲方签署^"，则会在PDF文件中有且仅有"甲方签署"关键字的地方进行对应操作。
如传入的关键字为"甲方签署"，则PDF文件中每个出现关键字的位置都会执行相应操作。

创建控件时，此值为空
查询时返回完整结构 
     * @return ComponentId 控件编号

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

注：
当GenerateMode=3时，通过"^"来决定是否使用关键字整词匹配能力。
例：
当GenerateMode=3时，如果传入关键字"^甲方签署^"，则会在PDF文件中有且仅有"甲方签署"关键字的地方进行对应操作。
如传入的关键字为"甲方签署"，则PDF文件中每个出现关键字的位置都会执行相应操作。

创建控件时，此值为空
查询时返回完整结构
     * @param ComponentId 控件编号

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
DATE - 普通日期控件；跟TEXT相比会有校验逻辑
如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL - 签署印章控件；
SIGN_DATE - 签署日期控件；
SIGN_SIGNATURE - 用户签名控件；
SIGN_PERSONAL_SEAL - 个人签署印章控件；

表单域的控件不能作为印章和签名控件 
     * @return ComponentType 如果是Component控件类型，则可选的字段为：
TEXT - 普通文本控件；
DATE - 普通日期控件；跟TEXT相比会有校验逻辑
如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL - 签署印章控件；
SIGN_DATE - 签署日期控件；
SIGN_SIGNATURE - 用户签名控件；
SIGN_PERSONAL_SEAL - 个人签署印章控件；

表单域的控件不能作为印章和签名控件
     */
    public String getComponentType() {
        return this.ComponentType;
    }

    /**
     * Set 如果是Component控件类型，则可选的字段为：
TEXT - 普通文本控件；
DATE - 普通日期控件；跟TEXT相比会有校验逻辑
如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL - 签署印章控件；
SIGN_DATE - 签署日期控件；
SIGN_SIGNATURE - 用户签名控件；
SIGN_PERSONAL_SEAL - 个人签署印章控件；

表单域的控件不能作为印章和签名控件
     * @param ComponentType 如果是Component控件类型，则可选的字段为：
TEXT - 普通文本控件；
DATE - 普通日期控件；跟TEXT相比会有校验逻辑
如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL - 签署印章控件；
SIGN_DATE - 签署日期控件；
SIGN_SIGNATURE - 用户签名控件；
SIGN_PERSONAL_SEAL - 个人签署印章控件；

表单域的控件不能作为印章和签名控件
     */
    public void setComponentType(String ComponentType) {
        this.ComponentType = ComponentType;
    }

    /**
     * Get 控件简称 
     * @return ComponentName 控件简称
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 控件简称
     * @param ComponentName 控件简称
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
     * Get 控件所属文件的序号 (文档中文件的排列序号) 
     * @return FileIndex 控件所属文件的序号 (文档中文件的排列序号)
     */
    public Long getFileIndex() {
        return this.FileIndex;
    }

    /**
     * Set 控件所属文件的序号 (文档中文件的排列序号)
     * @param FileIndex 控件所属文件的序号 (文档中文件的排列序号)
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
     * Get 参数控件所在页码 
     * @return ComponentPage 参数控件所在页码
     */
    public Long getComponentPage() {
        return this.ComponentPage;
    }

    /**
     * Set 参数控件所在页码
     * @param ComponentPage 参数控件所在页码
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
TEXT控件可以指定字体
例如：{"FontSize":12} 
     * @return ComponentExtra 参数控件样式，json格式表述
不同类型的控件会有部分非通用参数
TEXT控件可以指定字体
例如：{"FontSize":12}
     */
    public String getComponentExtra() {
        return this.ComponentExtra;
    }

    /**
     * Set 参数控件样式，json格式表述
不同类型的控件会有部分非通用参数
TEXT控件可以指定字体
例如：{"FontSize":12}
     * @param ComponentExtra 参数控件样式，json格式表述
不同类型的控件会有部分非通用参数
TEXT控件可以指定字体
例如：{"FontSize":12}
     */
    public void setComponentExtra(String ComponentExtra) {
        this.ComponentExtra = ComponentExtra;
    }

    /**
     * Get 印章 ID，传参 DEFAULT_COMPANY_SEAL 表示使用默认印章。
控件填入内容，印章控件里面，如果是手写签名内容为PNG图片格式的base64编码 
     * @return ComponentValue 印章 ID，传参 DEFAULT_COMPANY_SEAL 表示使用默认印章。
控件填入内容，印章控件里面，如果是手写签名内容为PNG图片格式的base64编码
     */
    public String getComponentValue() {
        return this.ComponentValue;
    }

    /**
     * Set 印章 ID，传参 DEFAULT_COMPANY_SEAL 表示使用默认印章。
控件填入内容，印章控件里面，如果是手写签名内容为PNG图片格式的base64编码
     * @param ComponentValue 印章 ID，传参 DEFAULT_COMPANY_SEAL 表示使用默认印章。
控件填入内容，印章控件里面，如果是手写签名内容为PNG图片格式的base64编码
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
     * Get 控件描述 
     * @return ComponentDescription 控件描述
     */
    public String getComponentDescription() {
        return this.ComponentDescription;
    }

    /**
     * Set 控件描述
     * @param ComponentDescription 控件描述
     */
    public void setComponentDescription(String ComponentDescription) {
        this.ComponentDescription = ComponentDescription;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);
        this.setParamSimple(map, prefix + "ComponentType", this.ComponentType);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "ComponentRequired", this.ComponentRequired);
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

    }
}

