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
package com.tencentcloudapi.essbasic.v20201222.models;

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
    */
    @SerializedName("ComponentId")
    @Expose
    private String ComponentId;

    /**
    * 如果是Component控件类型，则可选的字段为：
TEXT - 普通文本控件；
DATE - 普通日期控件；
SELECT- 勾选框控件；
如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL- 签署印章控件；
SIGN_DATE- 签署日期控件；
SIGN_SIGNATURE - 用户签名控件；
    */
    @SerializedName("ComponentType")
    @Expose
    private String ComponentType;

    /**
    * 控件名称
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
    * 控件所属文件的序号 (模板中的resourceId排列序号)
    */
    @SerializedName("FileIndex")
    @Expose
    private Long FileIndex;

    /**
    * 控件生成的方式：
0 - 普通控件
1 - 表单域
2 - html 控件
3 - 关键字
    */
    @SerializedName("GenerateMode")
    @Expose
    private Long GenerateMode;

    /**
    * 参数控件宽度，单位px
    */
    @SerializedName("ComponentWidth")
    @Expose
    private Float ComponentWidth;

    /**
    * 参数控件高度，单位px
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
    * 参数控件样式
    */
    @SerializedName("ComponentExtra")
    @Expose
    private String ComponentExtra;

    /**
    * 印章ID，如果是手写签名则为jpg或png格式的base64图片

SIGN_SEAL控件,可以用ORG_DEFAULT_SEAL表示主企业的默认印章
SIGN_SEAL控件,可以用SUBORG_DEFAULT_SEAL表示子企业的默认印章
SIGN_SEAL控件,可以用USER_DEFAULT_SEAL表示个人默认印章
    */
    @SerializedName("ComponentValue")
    @Expose
    private String ComponentValue;

    /**
    * 如果是SIGN_SEAL类型的签署控件, 参数标识H5签署界面是否在该签署区上进行放置展示, 1为放置,其他为不放置
    */
    @SerializedName("SealOperate")
    @Expose
    private Long SealOperate;

    /**
    * 不同GenerateMode对应的额外信息
    */
    @SerializedName("GenerateExtra")
    @Expose
    private String GenerateExtra;

    /**
     * Get 控件编号

注：
当GenerateMode=3时，通过"^"来决定是否使用关键字整词匹配能力。
例：
当GenerateMode=3时，如果传入关键字"^甲方签署^"，则会在PDF文件中有且仅有"甲方签署"关键字的地方进行对应操作。
如传入的关键字为"甲方签署"，则PDF文件中每个出现关键字的位置都会执行相应操作。 
     * @return ComponentId 控件编号

注：
当GenerateMode=3时，通过"^"来决定是否使用关键字整词匹配能力。
例：
当GenerateMode=3时，如果传入关键字"^甲方签署^"，则会在PDF文件中有且仅有"甲方签署"关键字的地方进行对应操作。
如传入的关键字为"甲方签署"，则PDF文件中每个出现关键字的位置都会执行相应操作。
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
     * @param ComponentId 控件编号

注：
当GenerateMode=3时，通过"^"来决定是否使用关键字整词匹配能力。
例：
当GenerateMode=3时，如果传入关键字"^甲方签署^"，则会在PDF文件中有且仅有"甲方签署"关键字的地方进行对应操作。
如传入的关键字为"甲方签署"，则PDF文件中每个出现关键字的位置都会执行相应操作。
     */
    public void setComponentId(String ComponentId) {
        this.ComponentId = ComponentId;
    }

    /**
     * Get 如果是Component控件类型，则可选的字段为：
TEXT - 普通文本控件；
DATE - 普通日期控件；
SELECT- 勾选框控件；
如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL- 签署印章控件；
SIGN_DATE- 签署日期控件；
SIGN_SIGNATURE - 用户签名控件； 
     * @return ComponentType 如果是Component控件类型，则可选的字段为：
TEXT - 普通文本控件；
DATE - 普通日期控件；
SELECT- 勾选框控件；
如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL- 签署印章控件；
SIGN_DATE- 签署日期控件；
SIGN_SIGNATURE - 用户签名控件；
     */
    public String getComponentType() {
        return this.ComponentType;
    }

    /**
     * Set 如果是Component控件类型，则可选的字段为：
TEXT - 普通文本控件；
DATE - 普通日期控件；
SELECT- 勾选框控件；
如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL- 签署印章控件；
SIGN_DATE- 签署日期控件；
SIGN_SIGNATURE - 用户签名控件；
     * @param ComponentType 如果是Component控件类型，则可选的字段为：
TEXT - 普通文本控件；
DATE - 普通日期控件；
SELECT- 勾选框控件；
如果是SignComponent控件类型，则可选的字段为
SIGN_SEAL- 签署印章控件；
SIGN_DATE- 签署日期控件；
SIGN_SIGNATURE - 用户签名控件；
     */
    public void setComponentType(String ComponentType) {
        this.ComponentType = ComponentType;
    }

    /**
     * Get 控件名称 
     * @return ComponentName 控件名称
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 控件名称
     * @param ComponentName 控件名称
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
     * Get 控件所属文件的序号 (模板中的resourceId排列序号) 
     * @return FileIndex 控件所属文件的序号 (模板中的resourceId排列序号)
     */
    public Long getFileIndex() {
        return this.FileIndex;
    }

    /**
     * Set 控件所属文件的序号 (模板中的resourceId排列序号)
     * @param FileIndex 控件所属文件的序号 (模板中的resourceId排列序号)
     */
    public void setFileIndex(Long FileIndex) {
        this.FileIndex = FileIndex;
    }

    /**
     * Get 控件生成的方式：
0 - 普通控件
1 - 表单域
2 - html 控件
3 - 关键字 
     * @return GenerateMode 控件生成的方式：
0 - 普通控件
1 - 表单域
2 - html 控件
3 - 关键字
     */
    public Long getGenerateMode() {
        return this.GenerateMode;
    }

    /**
     * Set 控件生成的方式：
0 - 普通控件
1 - 表单域
2 - html 控件
3 - 关键字
     * @param GenerateMode 控件生成的方式：
0 - 普通控件
1 - 表单域
2 - html 控件
3 - 关键字
     */
    public void setGenerateMode(Long GenerateMode) {
        this.GenerateMode = GenerateMode;
    }

    /**
     * Get 参数控件宽度，单位px 
     * @return ComponentWidth 参数控件宽度，单位px
     */
    public Float getComponentWidth() {
        return this.ComponentWidth;
    }

    /**
     * Set 参数控件宽度，单位px
     * @param ComponentWidth 参数控件宽度，单位px
     */
    public void setComponentWidth(Float ComponentWidth) {
        this.ComponentWidth = ComponentWidth;
    }

    /**
     * Get 参数控件高度，单位px 
     * @return ComponentHeight 参数控件高度，单位px
     */
    public Float getComponentHeight() {
        return this.ComponentHeight;
    }

    /**
     * Set 参数控件高度，单位px
     * @param ComponentHeight 参数控件高度，单位px
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
     * Get 参数控件样式 
     * @return ComponentExtra 参数控件样式
     */
    public String getComponentExtra() {
        return this.ComponentExtra;
    }

    /**
     * Set 参数控件样式
     * @param ComponentExtra 参数控件样式
     */
    public void setComponentExtra(String ComponentExtra) {
        this.ComponentExtra = ComponentExtra;
    }

    /**
     * Get 印章ID，如果是手写签名则为jpg或png格式的base64图片

SIGN_SEAL控件,可以用ORG_DEFAULT_SEAL表示主企业的默认印章
SIGN_SEAL控件,可以用SUBORG_DEFAULT_SEAL表示子企业的默认印章
SIGN_SEAL控件,可以用USER_DEFAULT_SEAL表示个人默认印章 
     * @return ComponentValue 印章ID，如果是手写签名则为jpg或png格式的base64图片

SIGN_SEAL控件,可以用ORG_DEFAULT_SEAL表示主企业的默认印章
SIGN_SEAL控件,可以用SUBORG_DEFAULT_SEAL表示子企业的默认印章
SIGN_SEAL控件,可以用USER_DEFAULT_SEAL表示个人默认印章
     */
    public String getComponentValue() {
        return this.ComponentValue;
    }

    /**
     * Set 印章ID，如果是手写签名则为jpg或png格式的base64图片

SIGN_SEAL控件,可以用ORG_DEFAULT_SEAL表示主企业的默认印章
SIGN_SEAL控件,可以用SUBORG_DEFAULT_SEAL表示子企业的默认印章
SIGN_SEAL控件,可以用USER_DEFAULT_SEAL表示个人默认印章
     * @param ComponentValue 印章ID，如果是手写签名则为jpg或png格式的base64图片

SIGN_SEAL控件,可以用ORG_DEFAULT_SEAL表示主企业的默认印章
SIGN_SEAL控件,可以用SUBORG_DEFAULT_SEAL表示子企业的默认印章
SIGN_SEAL控件,可以用USER_DEFAULT_SEAL表示个人默认印章
     */
    public void setComponentValue(String ComponentValue) {
        this.ComponentValue = ComponentValue;
    }

    /**
     * Get 如果是SIGN_SEAL类型的签署控件, 参数标识H5签署界面是否在该签署区上进行放置展示, 1为放置,其他为不放置 
     * @return SealOperate 如果是SIGN_SEAL类型的签署控件, 参数标识H5签署界面是否在该签署区上进行放置展示, 1为放置,其他为不放置
     */
    public Long getSealOperate() {
        return this.SealOperate;
    }

    /**
     * Set 如果是SIGN_SEAL类型的签署控件, 参数标识H5签署界面是否在该签署区上进行放置展示, 1为放置,其他为不放置
     * @param SealOperate 如果是SIGN_SEAL类型的签署控件, 参数标识H5签署界面是否在该签署区上进行放置展示, 1为放置,其他为不放置
     */
    public void setSealOperate(Long SealOperate) {
        this.SealOperate = SealOperate;
    }

    /**
     * Get 不同GenerateMode对应的额外信息 
     * @return GenerateExtra 不同GenerateMode对应的额外信息
     */
    public String getGenerateExtra() {
        return this.GenerateExtra;
    }

    /**
     * Set 不同GenerateMode对应的额外信息
     * @param GenerateExtra 不同GenerateMode对应的额外信息
     */
    public void setGenerateExtra(String GenerateExtra) {
        this.GenerateExtra = GenerateExtra;
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
            this.GenerateMode = new Long(source.GenerateMode);
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
        if (source.SealOperate != null) {
            this.SealOperate = new Long(source.SealOperate);
        }
        if (source.GenerateExtra != null) {
            this.GenerateExtra = new String(source.GenerateExtra);
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
        this.setParamSimple(map, prefix + "SealOperate", this.SealOperate);
        this.setParamSimple(map, prefix + "GenerateExtra", this.GenerateExtra);

    }
}

