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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadFilesRequest extends AbstractModel {

    /**
    * <p>文件对应业务类型,可以选择的类型如下<ul><li> <strong>TEMPLATE</strong> : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li><li> <strong>DOCUMENT</strong> : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html。如果上传的是非pdf文件，用来发起流程，还需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后得到的pdf文件才能用于发起合同接口。如果上传的文件不是用来发起合同，直接上传后使用返回的文件资源Id即可</li><li> <strong>SEAL</strong> : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li><li> <strong>ARCHIVE</strong> : 此文件用于归档文件夹，文件类型支持.pdf/.zip格式</li></ul>   [&quot;yDRSRUUgygj6rq2wUuO4zjEyBZ2NHiyT&quot;]</p><p>枚举值：</p><ul><li>TEMPLATE： 此上传的文件用户生成合同模板</li><li>DOCUMENT： 此文件用来发起合同流程</li><li>SEAL： 此文件用于印章的生成</li><li>ARCHIVE： 此文件用于归档文件夹</li></ul>
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * <p>执行本接口操作的员工信息。其中OperatorId为必填字段，即用户的UserId。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * <p>请上传文件内容数组，最多可上传20个文件。</p><p><b>所有文件必须符合<font color="red">FileType</font>指定的文件类型。</b></p>
    */
    @SerializedName("FileInfos")
    @Expose
    private UploadFile [] FileInfos;

    /**
    * <p>文件类型， 默认通过文件内容和文件后缀一起解析得到文件类型，调用接口时可以显示的指定上传文件的类型。<br>可支持的指定类型如下:</p><ul><li>pdf</li><li>doc</li><li>docx</li><li>xls</li><li>xlsx</li><li>html</li><li>jpg</li><li>jpeg</li><li>png</li></ul>如：pdf 表示上传的文件 张三入职合同.pdf的文件类型是 pdf
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>此参数仅对上传的PDF文件有效。其主要作用是确定是否将PDF中的灰色矩阵置为白色。</p><ul><li>**true**：将灰色矩阵置为白色。</li><li>**false**：无需处理，不会将灰色矩阵置为白色（默认）。</li></ul><p>注: <code>该参数仅在关键字定位时，需要去除关键字所在的灰框场景下使用。</code></p>
    */
    @SerializedName("CoverRect")
    @Expose
    private Boolean CoverRect;

    /**
    * <p>该字段已不再使用</p>
    */
    @SerializedName("CustomIds")
    @Expose
    private String [] CustomIds;

    /**
    * <p>不再使用，上传文件链接数组，最多支持20个URL</p>
    */
    @SerializedName("FileUrls")
    @Expose
    private String FileUrls;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get <p>文件对应业务类型,可以选择的类型如下<ul><li> <strong>TEMPLATE</strong> : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li><li> <strong>DOCUMENT</strong> : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html。如果上传的是非pdf文件，用来发起流程，还需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后得到的pdf文件才能用于发起合同接口。如果上传的文件不是用来发起合同，直接上传后使用返回的文件资源Id即可</li><li> <strong>SEAL</strong> : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li><li> <strong>ARCHIVE</strong> : 此文件用于归档文件夹，文件类型支持.pdf/.zip格式</li></ul>   [&quot;yDRSRUUgygj6rq2wUuO4zjEyBZ2NHiyT&quot;]</p><p>枚举值：</p><ul><li>TEMPLATE： 此上传的文件用户生成合同模板</li><li>DOCUMENT： 此文件用来发起合同流程</li><li>SEAL： 此文件用于印章的生成</li><li>ARCHIVE： 此文件用于归档文件夹</li></ul> 
     * @return BusinessType <p>文件对应业务类型,可以选择的类型如下<ul><li> <strong>TEMPLATE</strong> : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li><li> <strong>DOCUMENT</strong> : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html。如果上传的是非pdf文件，用来发起流程，还需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后得到的pdf文件才能用于发起合同接口。如果上传的文件不是用来发起合同，直接上传后使用返回的文件资源Id即可</li><li> <strong>SEAL</strong> : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li><li> <strong>ARCHIVE</strong> : 此文件用于归档文件夹，文件类型支持.pdf/.zip格式</li></ul>   [&quot;yDRSRUUgygj6rq2wUuO4zjEyBZ2NHiyT&quot;]</p><p>枚举值：</p><ul><li>TEMPLATE： 此上传的文件用户生成合同模板</li><li>DOCUMENT： 此文件用来发起合同流程</li><li>SEAL： 此文件用于印章的生成</li><li>ARCHIVE： 此文件用于归档文件夹</li></ul>
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set <p>文件对应业务类型,可以选择的类型如下<ul><li> <strong>TEMPLATE</strong> : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li><li> <strong>DOCUMENT</strong> : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html。如果上传的是非pdf文件，用来发起流程，还需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后得到的pdf文件才能用于发起合同接口。如果上传的文件不是用来发起合同，直接上传后使用返回的文件资源Id即可</li><li> <strong>SEAL</strong> : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li><li> <strong>ARCHIVE</strong> : 此文件用于归档文件夹，文件类型支持.pdf/.zip格式</li></ul>   [&quot;yDRSRUUgygj6rq2wUuO4zjEyBZ2NHiyT&quot;]</p><p>枚举值：</p><ul><li>TEMPLATE： 此上传的文件用户生成合同模板</li><li>DOCUMENT： 此文件用来发起合同流程</li><li>SEAL： 此文件用于印章的生成</li><li>ARCHIVE： 此文件用于归档文件夹</li></ul>
     * @param BusinessType <p>文件对应业务类型,可以选择的类型如下<ul><li> <strong>TEMPLATE</strong> : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li><li> <strong>DOCUMENT</strong> : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html。如果上传的是非pdf文件，用来发起流程，还需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后得到的pdf文件才能用于发起合同接口。如果上传的文件不是用来发起合同，直接上传后使用返回的文件资源Id即可</li><li> <strong>SEAL</strong> : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li><li> <strong>ARCHIVE</strong> : 此文件用于归档文件夹，文件类型支持.pdf/.zip格式</li></ul>   [&quot;yDRSRUUgygj6rq2wUuO4zjEyBZ2NHiyT&quot;]</p><p>枚举值：</p><ul><li>TEMPLATE： 此上传的文件用户生成合同模板</li><li>DOCUMENT： 此文件用来发起合同流程</li><li>SEAL： 此文件用于印章的生成</li><li>ARCHIVE： 此文件用于归档文件夹</li></ul>
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get <p>执行本接口操作的员工信息。其中OperatorId为必填字段，即用户的UserId。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Caller <p>执行本接口操作的员工信息。其中OperatorId为必填字段，即用户的UserId。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set <p>执行本接口操作的员工信息。其中OperatorId为必填字段，即用户的UserId。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Caller <p>执行本接口操作的员工信息。其中OperatorId为必填字段，即用户的UserId。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get <p>请上传文件内容数组，最多可上传20个文件。</p><p><b>所有文件必须符合<font color="red">FileType</font>指定的文件类型。</b></p> 
     * @return FileInfos <p>请上传文件内容数组，最多可上传20个文件。</p><p><b>所有文件必须符合<font color="red">FileType</font>指定的文件类型。</b></p>
     */
    public UploadFile [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>请上传文件内容数组，最多可上传20个文件。</p><p><b>所有文件必须符合<font color="red">FileType</font>指定的文件类型。</b></p>
     * @param FileInfos <p>请上传文件内容数组，最多可上传20个文件。</p><p><b>所有文件必须符合<font color="red">FileType</font>指定的文件类型。</b></p>
     */
    public void setFileInfos(UploadFile [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get <p>文件类型， 默认通过文件内容和文件后缀一起解析得到文件类型，调用接口时可以显示的指定上传文件的类型。<br>可支持的指定类型如下:</p><ul><li>pdf</li><li>doc</li><li>docx</li><li>xls</li><li>xlsx</li><li>html</li><li>jpg</li><li>jpeg</li><li>png</li></ul>如：pdf 表示上传的文件 张三入职合同.pdf的文件类型是 pdf 
     * @return FileType <p>文件类型， 默认通过文件内容和文件后缀一起解析得到文件类型，调用接口时可以显示的指定上传文件的类型。<br>可支持的指定类型如下:</p><ul><li>pdf</li><li>doc</li><li>docx</li><li>xls</li><li>xlsx</li><li>html</li><li>jpg</li><li>jpeg</li><li>png</li></ul>如：pdf 表示上传的文件 张三入职合同.pdf的文件类型是 pdf
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>文件类型， 默认通过文件内容和文件后缀一起解析得到文件类型，调用接口时可以显示的指定上传文件的类型。<br>可支持的指定类型如下:</p><ul><li>pdf</li><li>doc</li><li>docx</li><li>xls</li><li>xlsx</li><li>html</li><li>jpg</li><li>jpeg</li><li>png</li></ul>如：pdf 表示上传的文件 张三入职合同.pdf的文件类型是 pdf
     * @param FileType <p>文件类型， 默认通过文件内容和文件后缀一起解析得到文件类型，调用接口时可以显示的指定上传文件的类型。<br>可支持的指定类型如下:</p><ul><li>pdf</li><li>doc</li><li>docx</li><li>xls</li><li>xlsx</li><li>html</li><li>jpg</li><li>jpeg</li><li>png</li></ul>如：pdf 表示上传的文件 张三入职合同.pdf的文件类型是 pdf
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>此参数仅对上传的PDF文件有效。其主要作用是确定是否将PDF中的灰色矩阵置为白色。</p><ul><li>**true**：将灰色矩阵置为白色。</li><li>**false**：无需处理，不会将灰色矩阵置为白色（默认）。</li></ul><p>注: <code>该参数仅在关键字定位时，需要去除关键字所在的灰框场景下使用。</code></p> 
     * @return CoverRect <p>此参数仅对上传的PDF文件有效。其主要作用是确定是否将PDF中的灰色矩阵置为白色。</p><ul><li>**true**：将灰色矩阵置为白色。</li><li>**false**：无需处理，不会将灰色矩阵置为白色（默认）。</li></ul><p>注: <code>该参数仅在关键字定位时，需要去除关键字所在的灰框场景下使用。</code></p>
     */
    public Boolean getCoverRect() {
        return this.CoverRect;
    }

    /**
     * Set <p>此参数仅对上传的PDF文件有效。其主要作用是确定是否将PDF中的灰色矩阵置为白色。</p><ul><li>**true**：将灰色矩阵置为白色。</li><li>**false**：无需处理，不会将灰色矩阵置为白色（默认）。</li></ul><p>注: <code>该参数仅在关键字定位时，需要去除关键字所在的灰框场景下使用。</code></p>
     * @param CoverRect <p>此参数仅对上传的PDF文件有效。其主要作用是确定是否将PDF中的灰色矩阵置为白色。</p><ul><li>**true**：将灰色矩阵置为白色。</li><li>**false**：无需处理，不会将灰色矩阵置为白色（默认）。</li></ul><p>注: <code>该参数仅在关键字定位时，需要去除关键字所在的灰框场景下使用。</code></p>
     */
    public void setCoverRect(Boolean CoverRect) {
        this.CoverRect = CoverRect;
    }

    /**
     * Get <p>该字段已不再使用</p> 
     * @return CustomIds <p>该字段已不再使用</p>
     */
    public String [] getCustomIds() {
        return this.CustomIds;
    }

    /**
     * Set <p>该字段已不再使用</p>
     * @param CustomIds <p>该字段已不再使用</p>
     */
    public void setCustomIds(String [] CustomIds) {
        this.CustomIds = CustomIds;
    }

    /**
     * Get <p>不再使用，上传文件链接数组，最多支持20个URL</p> 
     * @return FileUrls <p>不再使用，上传文件链接数组，最多支持20个URL</p>
     * @deprecated
     */
    @Deprecated
    public String getFileUrls() {
        return this.FileUrls;
    }

    /**
     * Set <p>不再使用，上传文件链接数组，最多支持20个URL</p>
     * @param FileUrls <p>不再使用，上传文件链接数组，最多支持20个URL</p>
     * @deprecated
     */
    @Deprecated
    public void setFileUrls(String FileUrls) {
        this.FileUrls = FileUrls;
    }

    /**
     * Get <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p> 
     * @return Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     * @param Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public UploadFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadFilesRequest(UploadFilesRequest source) {
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new UploadFile[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new UploadFile(source.FileInfos[i]);
            }
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.CoverRect != null) {
            this.CoverRect = new Boolean(source.CoverRect);
        }
        if (source.CustomIds != null) {
            this.CustomIds = new String[source.CustomIds.length];
            for (int i = 0; i < source.CustomIds.length; i++) {
                this.CustomIds[i] = new String(source.CustomIds[i]);
            }
        }
        if (source.FileUrls != null) {
            this.FileUrls = new String(source.FileUrls);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "CoverRect", this.CoverRect);
        this.setParamArraySimple(map, prefix + "CustomIds.", this.CustomIds);
        this.setParamSimple(map, prefix + "FileUrls", this.FileUrls);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

