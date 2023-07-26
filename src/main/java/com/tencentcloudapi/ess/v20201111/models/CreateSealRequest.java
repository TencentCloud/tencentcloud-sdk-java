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

public class CreateSealRequest extends AbstractModel{

    /**
    * 操作人信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 电子印章名字
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * 应用相关信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 本接口支持上传图片印章及系统直接生成印章；如果要使用系统生成印章，此值传：SealGenerateSourceSystem；如果要使用图片上传请传字段 Image
    */
    @SerializedName("GenerateSource")
    @Expose
    private String GenerateSource;

    /**
    * 电子印章类型，OFFICIAL-公章,CONTRACT-合同专用章
    */
    @SerializedName("SealType")
    @Expose
    private String SealType;

    /**
    * 电子印章图片文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 电子印章图片base64编码
参数Image,FileToken或GenerateSource=SealGenerateSourceSystem三选一。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 电子印章宽度,单位px
参数不再启用，系统会设置印章大小为标准尺寸。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 电子印章高度,单位px
参数不再启用，系统会设置印章大小为标准尺寸。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 电子印章印章颜色(默认红色RED),RED-红色

系统目前只支持红色印章创建。
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * 暂时不支持横向文字设置
    */
    @SerializedName("SealHorizontalText")
    @Expose
    private String SealHorizontalText;

    /**
    * 暂时不支持下弦文字设置
    */
    @SerializedName("SealChordText")
    @Expose
    private String SealChordText;

    /**
    * 系统生成的印章只支持STAR
    */
    @SerializedName("SealCentralType")
    @Expose
    private String SealCentralType;

    /**
    * 通过文件上传时，服务端生成的电子印章上传图片的token

    */
    @SerializedName("FileToken")
    @Expose
    private String FileToken;

    /**
     * Get 操作人信息 
     * @return Operator 操作人信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息
     * @param Operator 操作人信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 电子印章名字 
     * @return SealName 电子印章名字
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set 电子印章名字
     * @param SealName 电子印章名字
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get 应用相关信息 
     * @return Agent 应用相关信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息
     * @param Agent 应用相关信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 本接口支持上传图片印章及系统直接生成印章；如果要使用系统生成印章，此值传：SealGenerateSourceSystem；如果要使用图片上传请传字段 Image 
     * @return GenerateSource 本接口支持上传图片印章及系统直接生成印章；如果要使用系统生成印章，此值传：SealGenerateSourceSystem；如果要使用图片上传请传字段 Image
     */
    public String getGenerateSource() {
        return this.GenerateSource;
    }

    /**
     * Set 本接口支持上传图片印章及系统直接生成印章；如果要使用系统生成印章，此值传：SealGenerateSourceSystem；如果要使用图片上传请传字段 Image
     * @param GenerateSource 本接口支持上传图片印章及系统直接生成印章；如果要使用系统生成印章，此值传：SealGenerateSourceSystem；如果要使用图片上传请传字段 Image
     */
    public void setGenerateSource(String GenerateSource) {
        this.GenerateSource = GenerateSource;
    }

    /**
     * Get 电子印章类型，OFFICIAL-公章,CONTRACT-合同专用章 
     * @return SealType 电子印章类型，OFFICIAL-公章,CONTRACT-合同专用章
     */
    public String getSealType() {
        return this.SealType;
    }

    /**
     * Set 电子印章类型，OFFICIAL-公章,CONTRACT-合同专用章
     * @param SealType 电子印章类型，OFFICIAL-公章,CONTRACT-合同专用章
     */
    public void setSealType(String SealType) {
        this.SealType = SealType;
    }

    /**
     * Get 电子印章图片文件名称 
     * @return FileName 电子印章图片文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 电子印章图片文件名称
     * @param FileName 电子印章图片文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 电子印章图片base64编码
参数Image,FileToken或GenerateSource=SealGenerateSourceSystem三选一。 
     * @return Image 电子印章图片base64编码
参数Image,FileToken或GenerateSource=SealGenerateSourceSystem三选一。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 电子印章图片base64编码
参数Image,FileToken或GenerateSource=SealGenerateSourceSystem三选一。
     * @param Image 电子印章图片base64编码
参数Image,FileToken或GenerateSource=SealGenerateSourceSystem三选一。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 电子印章宽度,单位px
参数不再启用，系统会设置印章大小为标准尺寸。 
     * @return Width 电子印章宽度,单位px
参数不再启用，系统会设置印章大小为标准尺寸。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 电子印章宽度,单位px
参数不再启用，系统会设置印章大小为标准尺寸。
     * @param Width 电子印章宽度,单位px
参数不再启用，系统会设置印章大小为标准尺寸。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 电子印章高度,单位px
参数不再启用，系统会设置印章大小为标准尺寸。 
     * @return Height 电子印章高度,单位px
参数不再启用，系统会设置印章大小为标准尺寸。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 电子印章高度,单位px
参数不再启用，系统会设置印章大小为标准尺寸。
     * @param Height 电子印章高度,单位px
参数不再启用，系统会设置印章大小为标准尺寸。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 电子印章印章颜色(默认红色RED),RED-红色

系统目前只支持红色印章创建。 
     * @return Color 电子印章印章颜色(默认红色RED),RED-红色

系统目前只支持红色印章创建。
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set 电子印章印章颜色(默认红色RED),RED-红色

系统目前只支持红色印章创建。
     * @param Color 电子印章印章颜色(默认红色RED),RED-红色

系统目前只支持红色印章创建。
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get 暂时不支持横向文字设置 
     * @return SealHorizontalText 暂时不支持横向文字设置
     */
    public String getSealHorizontalText() {
        return this.SealHorizontalText;
    }

    /**
     * Set 暂时不支持横向文字设置
     * @param SealHorizontalText 暂时不支持横向文字设置
     */
    public void setSealHorizontalText(String SealHorizontalText) {
        this.SealHorizontalText = SealHorizontalText;
    }

    /**
     * Get 暂时不支持下弦文字设置 
     * @return SealChordText 暂时不支持下弦文字设置
     */
    public String getSealChordText() {
        return this.SealChordText;
    }

    /**
     * Set 暂时不支持下弦文字设置
     * @param SealChordText 暂时不支持下弦文字设置
     */
    public void setSealChordText(String SealChordText) {
        this.SealChordText = SealChordText;
    }

    /**
     * Get 系统生成的印章只支持STAR 
     * @return SealCentralType 系统生成的印章只支持STAR
     */
    public String getSealCentralType() {
        return this.SealCentralType;
    }

    /**
     * Set 系统生成的印章只支持STAR
     * @param SealCentralType 系统生成的印章只支持STAR
     */
    public void setSealCentralType(String SealCentralType) {
        this.SealCentralType = SealCentralType;
    }

    /**
     * Get 通过文件上传时，服务端生成的电子印章上传图片的token
 
     * @return FileToken 通过文件上传时，服务端生成的电子印章上传图片的token

     */
    public String getFileToken() {
        return this.FileToken;
    }

    /**
     * Set 通过文件上传时，服务端生成的电子印章上传图片的token

     * @param FileToken 通过文件上传时，服务端生成的电子印章上传图片的token

     */
    public void setFileToken(String FileToken) {
        this.FileToken = FileToken;
    }

    public CreateSealRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSealRequest(CreateSealRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.GenerateSource != null) {
            this.GenerateSource = new String(source.GenerateSource);
        }
        if (source.SealType != null) {
            this.SealType = new String(source.SealType);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.SealHorizontalText != null) {
            this.SealHorizontalText = new String(source.SealHorizontalText);
        }
        if (source.SealChordText != null) {
            this.SealChordText = new String(source.SealChordText);
        }
        if (source.SealCentralType != null) {
            this.SealCentralType = new String(source.SealCentralType);
        }
        if (source.FileToken != null) {
            this.FileToken = new String(source.FileToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "SealName", this.SealName);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "GenerateSource", this.GenerateSource);
        this.setParamSimple(map, prefix + "SealType", this.SealType);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "SealHorizontalText", this.SealHorizontalText);
        this.setParamSimple(map, prefix + "SealChordText", this.SealChordText);
        this.setParamSimple(map, prefix + "SealCentralType", this.SealCentralType);
        this.setParamSimple(map, prefix + "FileToken", this.FileToken);

    }
}

