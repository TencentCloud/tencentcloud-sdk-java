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
package com.tencentcloudapi.ecc.v20181213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EHOCRRequest extends AbstractModel{

    /**
    * 图片所在的url或base64编码后的图像数据，依据InputType而定
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 输出图片类型，0 表示 Image 字段是图片所在的 url，1 表示 Image 字段是 base64 编码后的图像数据
    */
    @SerializedName("InputType")
    @Expose
    private Long InputType;

    /**
    * 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。
    */
    @SerializedName("EccAppid")
    @Expose
    private String EccAppid;

    /**
    * 图像识别唯一标识，一次识别一个 SessionId，使用识别功能时 SessionId 可用于使用文本批改接口，此时按图像批改价格收费；如使用文本批改接口时没有传入 SessionId，则需要收取文本批改的费用
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 服务类型，0：“图像识别”，只返回识别结果，1：“图像批改”，同时返回识别结果与批改结果。默认为 0
    */
    @SerializedName("ServerType")
    @Expose
    private Long ServerType;

    /**
    * 作文题目，可选参数
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 年级标准， 默认以 cet4 为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及 cet4 和 cet6 分别表示 英语4级和6级。
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * 作文提纲，可选参数，作文的写作要求。
    */
    @SerializedName("Requirement")
    @Expose
    private String Requirement;

    /**
    * 范文标题，可选参数，本接口可以依据提供的范文对作文进行评分。
    */
    @SerializedName("ModelTitle")
    @Expose
    private String ModelTitle;

    /**
    * 范文内容，可选参数，同上，范文的正文部分。
    */
    @SerializedName("ModelContent")
    @Expose
    private String ModelContent;

    /**
    * 异步模式标识，0：同步模式，1：异步模式。默认为同步模式
    */
    @SerializedName("IsAsync")
    @Expose
    private Long IsAsync;

    /**
     * Get 图片所在的url或base64编码后的图像数据，依据InputType而定 
     * @return Image 图片所在的url或base64编码后的图像数据，依据InputType而定
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片所在的url或base64编码后的图像数据，依据InputType而定
     * @param Image 图片所在的url或base64编码后的图像数据，依据InputType而定
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 输出图片类型，0 表示 Image 字段是图片所在的 url，1 表示 Image 字段是 base64 编码后的图像数据 
     * @return InputType 输出图片类型，0 表示 Image 字段是图片所在的 url，1 表示 Image 字段是 base64 编码后的图像数据
     */
    public Long getInputType() {
        return this.InputType;
    }

    /**
     * Set 输出图片类型，0 表示 Image 字段是图片所在的 url，1 表示 Image 字段是 base64 编码后的图像数据
     * @param InputType 输出图片类型，0 表示 Image 字段是图片所在的 url，1 表示 Image 字段是 base64 编码后的图像数据
     */
    public void setInputType(Long InputType) {
        this.InputType = InputType;
    }

    /**
     * Get 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。 
     * @return EccAppid 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。
     */
    public String getEccAppid() {
        return this.EccAppid;
    }

    /**
     * Set 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。
     * @param EccAppid 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。
     */
    public void setEccAppid(String EccAppid) {
        this.EccAppid = EccAppid;
    }

    /**
     * Get 图像识别唯一标识，一次识别一个 SessionId，使用识别功能时 SessionId 可用于使用文本批改接口，此时按图像批改价格收费；如使用文本批改接口时没有传入 SessionId，则需要收取文本批改的费用 
     * @return SessionId 图像识别唯一标识，一次识别一个 SessionId，使用识别功能时 SessionId 可用于使用文本批改接口，此时按图像批改价格收费；如使用文本批改接口时没有传入 SessionId，则需要收取文本批改的费用
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 图像识别唯一标识，一次识别一个 SessionId，使用识别功能时 SessionId 可用于使用文本批改接口，此时按图像批改价格收费；如使用文本批改接口时没有传入 SessionId，则需要收取文本批改的费用
     * @param SessionId 图像识别唯一标识，一次识别一个 SessionId，使用识别功能时 SessionId 可用于使用文本批改接口，此时按图像批改价格收费；如使用文本批改接口时没有传入 SessionId，则需要收取文本批改的费用
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 服务类型，0：“图像识别”，只返回识别结果，1：“图像批改”，同时返回识别结果与批改结果。默认为 0 
     * @return ServerType 服务类型，0：“图像识别”，只返回识别结果，1：“图像批改”，同时返回识别结果与批改结果。默认为 0
     */
    public Long getServerType() {
        return this.ServerType;
    }

    /**
     * Set 服务类型，0：“图像识别”，只返回识别结果，1：“图像批改”，同时返回识别结果与批改结果。默认为 0
     * @param ServerType 服务类型，0：“图像识别”，只返回识别结果，1：“图像批改”，同时返回识别结果与批改结果。默认为 0
     */
    public void setServerType(Long ServerType) {
        this.ServerType = ServerType;
    }

    /**
     * Get 作文题目，可选参数 
     * @return Title 作文题目，可选参数
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 作文题目，可选参数
     * @param Title 作文题目，可选参数
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 年级标准， 默认以 cet4 为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及 cet4 和 cet6 分别表示 英语4级和6级。 
     * @return Grade 年级标准， 默认以 cet4 为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及 cet4 和 cet6 分别表示 英语4级和6级。
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set 年级标准， 默认以 cet4 为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及 cet4 和 cet6 分别表示 英语4级和6级。
     * @param Grade 年级标准， 默认以 cet4 为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及 cet4 和 cet6 分别表示 英语4级和6级。
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get 作文提纲，可选参数，作文的写作要求。 
     * @return Requirement 作文提纲，可选参数，作文的写作要求。
     */
    public String getRequirement() {
        return this.Requirement;
    }

    /**
     * Set 作文提纲，可选参数，作文的写作要求。
     * @param Requirement 作文提纲，可选参数，作文的写作要求。
     */
    public void setRequirement(String Requirement) {
        this.Requirement = Requirement;
    }

    /**
     * Get 范文标题，可选参数，本接口可以依据提供的范文对作文进行评分。 
     * @return ModelTitle 范文标题，可选参数，本接口可以依据提供的范文对作文进行评分。
     */
    public String getModelTitle() {
        return this.ModelTitle;
    }

    /**
     * Set 范文标题，可选参数，本接口可以依据提供的范文对作文进行评分。
     * @param ModelTitle 范文标题，可选参数，本接口可以依据提供的范文对作文进行评分。
     */
    public void setModelTitle(String ModelTitle) {
        this.ModelTitle = ModelTitle;
    }

    /**
     * Get 范文内容，可选参数，同上，范文的正文部分。 
     * @return ModelContent 范文内容，可选参数，同上，范文的正文部分。
     */
    public String getModelContent() {
        return this.ModelContent;
    }

    /**
     * Set 范文内容，可选参数，同上，范文的正文部分。
     * @param ModelContent 范文内容，可选参数，同上，范文的正文部分。
     */
    public void setModelContent(String ModelContent) {
        this.ModelContent = ModelContent;
    }

    /**
     * Get 异步模式标识，0：同步模式，1：异步模式。默认为同步模式 
     * @return IsAsync 异步模式标识，0：同步模式，1：异步模式。默认为同步模式
     */
    public Long getIsAsync() {
        return this.IsAsync;
    }

    /**
     * Set 异步模式标识，0：同步模式，1：异步模式。默认为同步模式
     * @param IsAsync 异步模式标识，0：同步模式，1：异步模式。默认为同步模式
     */
    public void setIsAsync(Long IsAsync) {
        this.IsAsync = IsAsync;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "EccAppid", this.EccAppid);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ServerType", this.ServerType);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamSimple(map, prefix + "Requirement", this.Requirement);
        this.setParamSimple(map, prefix + "ModelTitle", this.ModelTitle);
        this.setParamSimple(map, prefix + "ModelContent", this.ModelContent);
        this.setParamSimple(map, prefix + "IsAsync", this.IsAsync);

    }
}

