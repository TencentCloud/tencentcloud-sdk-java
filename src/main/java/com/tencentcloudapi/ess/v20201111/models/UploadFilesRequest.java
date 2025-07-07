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
    * 文件对应业务类型,可以选择的类型如下
<ul><li> **TEMPLATE** : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li>
<li> **DOCUMENT** : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li>
<li> **SEAL** : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li></ul>
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * 执行本接口操作的员工信息。其中OperatorId为必填字段，即用户的UserId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 请上传文件内容数组，最多可上传20个文件。

<b>所有文件必须符合<font color="red">FileType</font>指定的文件类型。</b>
    */
    @SerializedName("FileInfos")
    @Expose
    private UploadFile [] FileInfos;

    /**
    * 文件类型， 默认通过文件内容和文件后缀一起解析得到文件类型，调用接口时可以显示的指定上传文件的类型。
可支持的指定类型如下:
<ul><li>pdf</li>
<li>doc</li>
<li>docx</li>
<li>xls</li>
<li>xlsx</li>
<li>html</li>
<li>jpg</li>
<li>jpeg</li>
<li>png</li></ul>
如：pdf 表示上传的文件 张三入职合同.pdf的文件类型是 pdf
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 此参数仅对上传的PDF文件有效。其主要作用是确定是否将PDF中的灰色矩阵置为白色。
<ul><li>**true**：将灰色矩阵置为白色。</li>
<li>**false**：无需处理，不会将灰色矩阵置为白色（默认）。</li></ul>

注: `该参数仅在关键字定位时，需要去除关键字所在的灰框场景下使用。`
    */
    @SerializedName("CoverRect")
    @Expose
    private Boolean CoverRect;

    /**
    * 该字段已不再使用
    */
    @SerializedName("CustomIds")
    @Expose
    private String [] CustomIds;

    /**
    * 不再使用，上传文件链接数组，最多支持20个URL
    */
    @SerializedName("FileUrls")
    @Expose
    private String FileUrls;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 文件对应业务类型,可以选择的类型如下
<ul><li> **TEMPLATE** : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li>
<li> **DOCUMENT** : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li>
<li> **SEAL** : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li></ul> 
     * @return BusinessType 文件对应业务类型,可以选择的类型如下
<ul><li> **TEMPLATE** : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li>
<li> **DOCUMENT** : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li>
<li> **SEAL** : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li></ul>
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 文件对应业务类型,可以选择的类型如下
<ul><li> **TEMPLATE** : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li>
<li> **DOCUMENT** : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li>
<li> **SEAL** : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li></ul>
     * @param BusinessType 文件对应业务类型,可以选择的类型如下
<ul><li> **TEMPLATE** : 此上传的文件用户生成合同模板，文件类型支持.pdf/.doc/.docx/.html格式，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li>
<li> **DOCUMENT** : 此文件用来发起合同流程，文件类型支持.pdf/.doc/.docx/.jpg/.png/.xls.xlsx/.html，如果非pdf文件需要通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务</a>转换后才能使用</li>
<li> **SEAL** : 此文件用于印章的生成，文件类型支持.jpg/.jpeg/.png</li></ul>
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get 执行本接口操作的员工信息。其中OperatorId为必填字段，即用户的UserId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Caller 执行本接口操作的员工信息。其中OperatorId为必填字段，即用户的UserId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 执行本接口操作的员工信息。其中OperatorId为必填字段，即用户的UserId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Caller 执行本接口操作的员工信息。其中OperatorId为必填字段，即用户的UserId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 请上传文件内容数组，最多可上传20个文件。

<b>所有文件必须符合<font color="red">FileType</font>指定的文件类型。</b> 
     * @return FileInfos 请上传文件内容数组，最多可上传20个文件。

<b>所有文件必须符合<font color="red">FileType</font>指定的文件类型。</b>
     */
    public UploadFile [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set 请上传文件内容数组，最多可上传20个文件。

<b>所有文件必须符合<font color="red">FileType</font>指定的文件类型。</b>
     * @param FileInfos 请上传文件内容数组，最多可上传20个文件。

<b>所有文件必须符合<font color="red">FileType</font>指定的文件类型。</b>
     */
    public void setFileInfos(UploadFile [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get 文件类型， 默认通过文件内容和文件后缀一起解析得到文件类型，调用接口时可以显示的指定上传文件的类型。
可支持的指定类型如下:
<ul><li>pdf</li>
<li>doc</li>
<li>docx</li>
<li>xls</li>
<li>xlsx</li>
<li>html</li>
<li>jpg</li>
<li>jpeg</li>
<li>png</li></ul>
如：pdf 表示上传的文件 张三入职合同.pdf的文件类型是 pdf 
     * @return FileType 文件类型， 默认通过文件内容和文件后缀一起解析得到文件类型，调用接口时可以显示的指定上传文件的类型。
可支持的指定类型如下:
<ul><li>pdf</li>
<li>doc</li>
<li>docx</li>
<li>xls</li>
<li>xlsx</li>
<li>html</li>
<li>jpg</li>
<li>jpeg</li>
<li>png</li></ul>
如：pdf 表示上传的文件 张三入职合同.pdf的文件类型是 pdf
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型， 默认通过文件内容和文件后缀一起解析得到文件类型，调用接口时可以显示的指定上传文件的类型。
可支持的指定类型如下:
<ul><li>pdf</li>
<li>doc</li>
<li>docx</li>
<li>xls</li>
<li>xlsx</li>
<li>html</li>
<li>jpg</li>
<li>jpeg</li>
<li>png</li></ul>
如：pdf 表示上传的文件 张三入职合同.pdf的文件类型是 pdf
     * @param FileType 文件类型， 默认通过文件内容和文件后缀一起解析得到文件类型，调用接口时可以显示的指定上传文件的类型。
可支持的指定类型如下:
<ul><li>pdf</li>
<li>doc</li>
<li>docx</li>
<li>xls</li>
<li>xlsx</li>
<li>html</li>
<li>jpg</li>
<li>jpeg</li>
<li>png</li></ul>
如：pdf 表示上传的文件 张三入职合同.pdf的文件类型是 pdf
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 此参数仅对上传的PDF文件有效。其主要作用是确定是否将PDF中的灰色矩阵置为白色。
<ul><li>**true**：将灰色矩阵置为白色。</li>
<li>**false**：无需处理，不会将灰色矩阵置为白色（默认）。</li></ul>

注: `该参数仅在关键字定位时，需要去除关键字所在的灰框场景下使用。` 
     * @return CoverRect 此参数仅对上传的PDF文件有效。其主要作用是确定是否将PDF中的灰色矩阵置为白色。
<ul><li>**true**：将灰色矩阵置为白色。</li>
<li>**false**：无需处理，不会将灰色矩阵置为白色（默认）。</li></ul>

注: `该参数仅在关键字定位时，需要去除关键字所在的灰框场景下使用。`
     */
    public Boolean getCoverRect() {
        return this.CoverRect;
    }

    /**
     * Set 此参数仅对上传的PDF文件有效。其主要作用是确定是否将PDF中的灰色矩阵置为白色。
<ul><li>**true**：将灰色矩阵置为白色。</li>
<li>**false**：无需处理，不会将灰色矩阵置为白色（默认）。</li></ul>

注: `该参数仅在关键字定位时，需要去除关键字所在的灰框场景下使用。`
     * @param CoverRect 此参数仅对上传的PDF文件有效。其主要作用是确定是否将PDF中的灰色矩阵置为白色。
<ul><li>**true**：将灰色矩阵置为白色。</li>
<li>**false**：无需处理，不会将灰色矩阵置为白色（默认）。</li></ul>

注: `该参数仅在关键字定位时，需要去除关键字所在的灰框场景下使用。`
     */
    public void setCoverRect(Boolean CoverRect) {
        this.CoverRect = CoverRect;
    }

    /**
     * Get 该字段已不再使用 
     * @return CustomIds 该字段已不再使用
     */
    public String [] getCustomIds() {
        return this.CustomIds;
    }

    /**
     * Set 该字段已不再使用
     * @param CustomIds 该字段已不再使用
     */
    public void setCustomIds(String [] CustomIds) {
        this.CustomIds = CustomIds;
    }

    /**
     * Get 不再使用，上传文件链接数组，最多支持20个URL 
     * @return FileUrls 不再使用，上传文件链接数组，最多支持20个URL
     * @deprecated
     */
    @Deprecated
    public String getFileUrls() {
        return this.FileUrls;
    }

    /**
     * Set 不再使用，上传文件链接数组，最多支持20个URL
     * @param FileUrls 不再使用，上传文件链接数组，最多支持20个URL
     * @deprecated
     */
    @Deprecated
    public void setFileUrls(String FileUrls) {
        this.FileUrls = FileUrls;
    }

    /**
     * Get 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
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

