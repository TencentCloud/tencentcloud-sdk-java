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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadFilesRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>文件对应业务类型,可以选择的类型如下<ul><li> <strong>TEMPLATE</strong> : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li><li> <strong>DOCUMENT</strong> : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html。如果上传的是非pdf文件，用来发起流程，还需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后得到的pdf文件才能用于发起合同接口。如果上传的文件不是用来发起合同，直接上传后使用返回的文件资源Id即可</li><li> <strong>SEAL</strong> : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li><li> <strong>ARCHIVE</strong> : 此文件用于归档文件夹，文件类型支持.pdf/.zip格式</li></ul></p><p>枚举值：</p><ul><li>TEMPLATE： 此上传的文件用户生成合同模板</li><li>DOCUMENT： 此文件用来发起合同流程</li><li>SEAL： 此文件用于印章的生成</li><li>ARCHIVE： 此文件用于归档文件夹</li></ul>
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * <p>上传文件内容数组，一次最多可上传20个文件。</p><p><b>若上传多个文件，所有文件必须为相同类型</b>，例如全部为PDF或全部为Word文件。不支持混合文件类型的上传。</p>
    */
    @SerializedName("FileInfos")
    @Expose
    private UploadFile [] FileInfos;

    /**
    * <p>操作者的信息</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>文件的截止有效期，最长有效期是当前时间后的一年。如果超过截止有效期则文件会失效。此功能是白名单功能，如需使用，请联系电子签开通</p><p>如果没有传入，则默认过期时间是上传时间加10分钟</p>
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>文件对应业务类型,可以选择的类型如下<ul><li> <strong>TEMPLATE</strong> : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li><li> <strong>DOCUMENT</strong> : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html。如果上传的是非pdf文件，用来发起流程，还需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后得到的pdf文件才能用于发起合同接口。如果上传的文件不是用来发起合同，直接上传后使用返回的文件资源Id即可</li><li> <strong>SEAL</strong> : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li><li> <strong>ARCHIVE</strong> : 此文件用于归档文件夹，文件类型支持.pdf/.zip格式</li></ul></p><p>枚举值：</p><ul><li>TEMPLATE： 此上传的文件用户生成合同模板</li><li>DOCUMENT： 此文件用来发起合同流程</li><li>SEAL： 此文件用于印章的生成</li><li>ARCHIVE： 此文件用于归档文件夹</li></ul> 
     * @return BusinessType <p>文件对应业务类型,可以选择的类型如下<ul><li> <strong>TEMPLATE</strong> : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li><li> <strong>DOCUMENT</strong> : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html。如果上传的是非pdf文件，用来发起流程，还需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后得到的pdf文件才能用于发起合同接口。如果上传的文件不是用来发起合同，直接上传后使用返回的文件资源Id即可</li><li> <strong>SEAL</strong> : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li><li> <strong>ARCHIVE</strong> : 此文件用于归档文件夹，文件类型支持.pdf/.zip格式</li></ul></p><p>枚举值：</p><ul><li>TEMPLATE： 此上传的文件用户生成合同模板</li><li>DOCUMENT： 此文件用来发起合同流程</li><li>SEAL： 此文件用于印章的生成</li><li>ARCHIVE： 此文件用于归档文件夹</li></ul>
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set <p>文件对应业务类型,可以选择的类型如下<ul><li> <strong>TEMPLATE</strong> : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li><li> <strong>DOCUMENT</strong> : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html。如果上传的是非pdf文件，用来发起流程，还需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后得到的pdf文件才能用于发起合同接口。如果上传的文件不是用来发起合同，直接上传后使用返回的文件资源Id即可</li><li> <strong>SEAL</strong> : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li><li> <strong>ARCHIVE</strong> : 此文件用于归档文件夹，文件类型支持.pdf/.zip格式</li></ul></p><p>枚举值：</p><ul><li>TEMPLATE： 此上传的文件用户生成合同模板</li><li>DOCUMENT： 此文件用来发起合同流程</li><li>SEAL： 此文件用于印章的生成</li><li>ARCHIVE： 此文件用于归档文件夹</li></ul>
     * @param BusinessType <p>文件对应业务类型,可以选择的类型如下<ul><li> <strong>TEMPLATE</strong> : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li><li> <strong>DOCUMENT</strong> : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html。如果上传的是非pdf文件，用来发起流程，还需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后得到的pdf文件才能用于发起合同接口。如果上传的文件不是用来发起合同，直接上传后使用返回的文件资源Id即可</li><li> <strong>SEAL</strong> : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li><li> <strong>ARCHIVE</strong> : 此文件用于归档文件夹，文件类型支持.pdf/.zip格式</li></ul></p><p>枚举值：</p><ul><li>TEMPLATE： 此上传的文件用户生成合同模板</li><li>DOCUMENT： 此文件用来发起合同流程</li><li>SEAL： 此文件用于印章的生成</li><li>ARCHIVE： 此文件用于归档文件夹</li></ul>
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get <p>上传文件内容数组，一次最多可上传20个文件。</p><p><b>若上传多个文件，所有文件必须为相同类型</b>，例如全部为PDF或全部为Word文件。不支持混合文件类型的上传。</p> 
     * @return FileInfos <p>上传文件内容数组，一次最多可上传20个文件。</p><p><b>若上传多个文件，所有文件必须为相同类型</b>，例如全部为PDF或全部为Word文件。不支持混合文件类型的上传。</p>
     */
    public UploadFile [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>上传文件内容数组，一次最多可上传20个文件。</p><p><b>若上传多个文件，所有文件必须为相同类型</b>，例如全部为PDF或全部为Word文件。不支持混合文件类型的上传。</p>
     * @param FileInfos <p>上传文件内容数组，一次最多可上传20个文件。</p><p><b>若上传多个文件，所有文件必须为相同类型</b>，例如全部为PDF或全部为Word文件。不支持混合文件类型的上传。</p>
     */
    public void setFileInfos(UploadFile [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get <p>操作者的信息</p> 
     * @return Operator <p>操作者的信息</p>
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者的信息</p>
     * @param Operator <p>操作者的信息</p>
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>文件的截止有效期，最长有效期是当前时间后的一年。如果超过截止有效期则文件会失效。此功能是白名单功能，如需使用，请联系电子签开通</p><p>如果没有传入，则默认过期时间是上传时间加10分钟</p> 
     * @return Deadline <p>文件的截止有效期，最长有效期是当前时间后的一年。如果超过截止有效期则文件会失效。此功能是白名单功能，如需使用，请联系电子签开通</p><p>如果没有传入，则默认过期时间是上传时间加10分钟</p>
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set <p>文件的截止有效期，最长有效期是当前时间后的一年。如果超过截止有效期则文件会失效。此功能是白名单功能，如需使用，请联系电子签开通</p><p>如果没有传入，则默认过期时间是上传时间加10分钟</p>
     * @param Deadline <p>文件的截止有效期，最长有效期是当前时间后的一年。如果超过截止有效期则文件会失效。此功能是白名单功能，如需使用，请联系电子签开通</p><p>如果没有传入，则默认过期时间是上传时间加10分钟</p>
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    public UploadFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadFilesRequest(UploadFilesRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new UploadFile[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new UploadFile(source.FileInfos[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);

    }
}

