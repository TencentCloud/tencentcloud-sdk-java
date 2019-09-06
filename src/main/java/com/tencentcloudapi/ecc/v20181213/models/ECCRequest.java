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

public class ECCRequest  extends AbstractModel{

    /**
    * 作文文本，必填
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 作文题目，可选参数
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 年级标准， 默认以cet4为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及cet4和cet6 分别表示 英语4级和6级。
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
    * 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。
    */
    @SerializedName("EccAppid")
    @Expose
    private String EccAppid;

    /**
    * 异步模式标识，0：同步模式，1：异步模式，默认为同步模式
    */
    @SerializedName("IsAsync")
    @Expose
    private Long IsAsync;

    /**
    * 图像识别唯一标识，一次识别一个 SessionId。当传入此前识别接口使用过的 SessionId，则本次批改按图像批改价格收费；如使用了识别接口且本次没有传入 SessionId，则需要加取文本批改的费用；如果直接使用文本批改接口，则只收取文本批改的费用
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * 获取作文文本，必填
     * @return Content 作文文本，必填
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * 设置作文文本，必填
     * @param Content 作文文本，必填
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * 获取作文题目，可选参数
     * @return Title 作文题目，可选参数
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * 设置作文题目，可选参数
     * @param Title 作文题目，可选参数
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * 获取年级标准， 默认以cet4为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及cet4和cet6 分别表示 英语4级和6级。
     * @return Grade 年级标准， 默认以cet4为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及cet4和cet6 分别表示 英语4级和6级。
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * 设置年级标准， 默认以cet4为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及cet4和cet6 分别表示 英语4级和6级。
     * @param Grade 年级标准， 默认以cet4为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及cet4和cet6 分别表示 英语4级和6级。
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * 获取作文提纲，可选参数，作文的写作要求。
     * @return Requirement 作文提纲，可选参数，作文的写作要求。
     */
    public String getRequirement() {
        return this.Requirement;
    }

    /**
     * 设置作文提纲，可选参数，作文的写作要求。
     * @param Requirement 作文提纲，可选参数，作文的写作要求。
     */
    public void setRequirement(String Requirement) {
        this.Requirement = Requirement;
    }

    /**
     * 获取范文标题，可选参数，本接口可以依据提供的范文对作文进行评分。
     * @return ModelTitle 范文标题，可选参数，本接口可以依据提供的范文对作文进行评分。
     */
    public String getModelTitle() {
        return this.ModelTitle;
    }

    /**
     * 设置范文标题，可选参数，本接口可以依据提供的范文对作文进行评分。
     * @param ModelTitle 范文标题，可选参数，本接口可以依据提供的范文对作文进行评分。
     */
    public void setModelTitle(String ModelTitle) {
        this.ModelTitle = ModelTitle;
    }

    /**
     * 获取范文内容，可选参数，同上，范文的正文部分。
     * @return ModelContent 范文内容，可选参数，同上，范文的正文部分。
     */
    public String getModelContent() {
        return this.ModelContent;
    }

    /**
     * 设置范文内容，可选参数，同上，范文的正文部分。
     * @param ModelContent 范文内容，可选参数，同上，范文的正文部分。
     */
    public void setModelContent(String ModelContent) {
        this.ModelContent = ModelContent;
    }

    /**
     * 获取业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。
     * @return EccAppid 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。
     */
    public String getEccAppid() {
        return this.EccAppid;
    }

    /**
     * 设置业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。
     * @param EccAppid 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。
     */
    public void setEccAppid(String EccAppid) {
        this.EccAppid = EccAppid;
    }

    /**
     * 获取异步模式标识，0：同步模式，1：异步模式，默认为同步模式
     * @return IsAsync 异步模式标识，0：同步模式，1：异步模式，默认为同步模式
     */
    public Long getIsAsync() {
        return this.IsAsync;
    }

    /**
     * 设置异步模式标识，0：同步模式，1：异步模式，默认为同步模式
     * @param IsAsync 异步模式标识，0：同步模式，1：异步模式，默认为同步模式
     */
    public void setIsAsync(Long IsAsync) {
        this.IsAsync = IsAsync;
    }

    /**
     * 获取图像识别唯一标识，一次识别一个 SessionId。当传入此前识别接口使用过的 SessionId，则本次批改按图像批改价格收费；如使用了识别接口且本次没有传入 SessionId，则需要加取文本批改的费用；如果直接使用文本批改接口，则只收取文本批改的费用
     * @return SessionId 图像识别唯一标识，一次识别一个 SessionId。当传入此前识别接口使用过的 SessionId，则本次批改按图像批改价格收费；如使用了识别接口且本次没有传入 SessionId，则需要加取文本批改的费用；如果直接使用文本批改接口，则只收取文本批改的费用
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * 设置图像识别唯一标识，一次识别一个 SessionId。当传入此前识别接口使用过的 SessionId，则本次批改按图像批改价格收费；如使用了识别接口且本次没有传入 SessionId，则需要加取文本批改的费用；如果直接使用文本批改接口，则只收取文本批改的费用
     * @param SessionId 图像识别唯一标识，一次识别一个 SessionId。当传入此前识别接口使用过的 SessionId，则本次批改按图像批改价格收费；如使用了识别接口且本次没有传入 SessionId，则需要加取文本批改的费用；如果直接使用文本批改接口，则只收取文本批改的费用
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamSimple(map, prefix + "Requirement", this.Requirement);
        this.setParamSimple(map, prefix + "ModelTitle", this.ModelTitle);
        this.setParamSimple(map, prefix + "ModelContent", this.ModelContent);
        this.setParamSimple(map, prefix + "EccAppid", this.EccAppid);
        this.setParamSimple(map, prefix + "IsAsync", this.IsAsync);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

