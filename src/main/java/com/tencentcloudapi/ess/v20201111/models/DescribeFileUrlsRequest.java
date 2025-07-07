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

public class DescribeFileUrlsRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 文件对应的业务类型，目前支持：<ul><li>**FLOW ** : <font color="red">如需下载合同文件请选择此项</font></li><li>**TEMPLATE ** : 如需下载模板文件请选择此项</li><li>**DOCUMENT  **: 如需下载文档文件请选择此项</li><li>**SEAL  **: 如需下载印章图片请选择此项</li><li>**DIGITFILE**: 如需下载加签文件请选择此项</li></ul>
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * 业务编号的数组，取值如下：<ul><li>流程编号</li><li>模板编号</li><li>文档编号</li><li>印章编号</li><li>加签文件编号</li><li>如需下载合同文件请传入FlowId，最大支持20个资源</li></ul>
    */
    @SerializedName("BusinessIds")
    @Expose
    private String [] BusinessIds;

    /**
    * 下载后的文件命名，只有FileType为zip的时候生效
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 要下载的文件类型，取值如下：
<ul>
<li>JPG</li>
<li>PDF</li>
<li>ZIP</li>
</ul>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 1000。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24x60x60s(1天)
    */
    @SerializedName("UrlTtl")
    @Expose
    private Long UrlTtl;

    /**
    * 暂不开放
    */
    @SerializedName("CcToken")
    @Expose
    private String CcToken;

    /**
    * 暂不开放
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 文件对应的业务类型，目前支持：<ul><li>**FLOW ** : <font color="red">如需下载合同文件请选择此项</font></li><li>**TEMPLATE ** : 如需下载模板文件请选择此项</li><li>**DOCUMENT  **: 如需下载文档文件请选择此项</li><li>**SEAL  **: 如需下载印章图片请选择此项</li><li>**DIGITFILE**: 如需下载加签文件请选择此项</li></ul> 
     * @return BusinessType 文件对应的业务类型，目前支持：<ul><li>**FLOW ** : <font color="red">如需下载合同文件请选择此项</font></li><li>**TEMPLATE ** : 如需下载模板文件请选择此项</li><li>**DOCUMENT  **: 如需下载文档文件请选择此项</li><li>**SEAL  **: 如需下载印章图片请选择此项</li><li>**DIGITFILE**: 如需下载加签文件请选择此项</li></ul>
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 文件对应的业务类型，目前支持：<ul><li>**FLOW ** : <font color="red">如需下载合同文件请选择此项</font></li><li>**TEMPLATE ** : 如需下载模板文件请选择此项</li><li>**DOCUMENT  **: 如需下载文档文件请选择此项</li><li>**SEAL  **: 如需下载印章图片请选择此项</li><li>**DIGITFILE**: 如需下载加签文件请选择此项</li></ul>
     * @param BusinessType 文件对应的业务类型，目前支持：<ul><li>**FLOW ** : <font color="red">如需下载合同文件请选择此项</font></li><li>**TEMPLATE ** : 如需下载模板文件请选择此项</li><li>**DOCUMENT  **: 如需下载文档文件请选择此项</li><li>**SEAL  **: 如需下载印章图片请选择此项</li><li>**DIGITFILE**: 如需下载加签文件请选择此项</li></ul>
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get 业务编号的数组，取值如下：<ul><li>流程编号</li><li>模板编号</li><li>文档编号</li><li>印章编号</li><li>加签文件编号</li><li>如需下载合同文件请传入FlowId，最大支持20个资源</li></ul> 
     * @return BusinessIds 业务编号的数组，取值如下：<ul><li>流程编号</li><li>模板编号</li><li>文档编号</li><li>印章编号</li><li>加签文件编号</li><li>如需下载合同文件请传入FlowId，最大支持20个资源</li></ul>
     */
    public String [] getBusinessIds() {
        return this.BusinessIds;
    }

    /**
     * Set 业务编号的数组，取值如下：<ul><li>流程编号</li><li>模板编号</li><li>文档编号</li><li>印章编号</li><li>加签文件编号</li><li>如需下载合同文件请传入FlowId，最大支持20个资源</li></ul>
     * @param BusinessIds 业务编号的数组，取值如下：<ul><li>流程编号</li><li>模板编号</li><li>文档编号</li><li>印章编号</li><li>加签文件编号</li><li>如需下载合同文件请传入FlowId，最大支持20个资源</li></ul>
     */
    public void setBusinessIds(String [] BusinessIds) {
        this.BusinessIds = BusinessIds;
    }

    /**
     * Get 下载后的文件命名，只有FileType为zip的时候生效 
     * @return FileName 下载后的文件命名，只有FileType为zip的时候生效
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 下载后的文件命名，只有FileType为zip的时候生效
     * @param FileName 下载后的文件命名，只有FileType为zip的时候生效
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 要下载的文件类型，取值如下：
<ul>
<li>JPG</li>
<li>PDF</li>
<li>ZIP</li>
</ul> 
     * @return FileType 要下载的文件类型，取值如下：
<ul>
<li>JPG</li>
<li>PDF</li>
<li>ZIP</li>
</ul>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 要下载的文件类型，取值如下：
<ul>
<li>JPG</li>
<li>PDF</li>
<li>ZIP</li>
</ul>
     * @param FileType 要下载的文件类型，取值如下：
<ul>
<li>JPG</li>
<li>PDF</li>
<li>ZIP</li>
</ul>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 1000。 
     * @return Offset 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 1000。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 1000。
     * @param Offset 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 1000。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 100。 
     * @return Limit 指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 100。
     * @param Limit 指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24x60x60s(1天) 
     * @return UrlTtl 下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24x60x60s(1天)
     */
    public Long getUrlTtl() {
        return this.UrlTtl;
    }

    /**
     * Set 下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24x60x60s(1天)
     * @param UrlTtl 下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24x60x60s(1天)
     */
    public void setUrlTtl(Long UrlTtl) {
        this.UrlTtl = UrlTtl;
    }

    /**
     * Get 暂不开放 
     * @return CcToken 暂不开放
     * @deprecated
     */
    @Deprecated
    public String getCcToken() {
        return this.CcToken;
    }

    /**
     * Set 暂不开放
     * @param CcToken 暂不开放
     * @deprecated
     */
    @Deprecated
    public void setCcToken(String CcToken) {
        this.CcToken = CcToken;
    }

    /**
     * Get 暂不开放 
     * @return Scene 暂不开放
     * @deprecated
     */
    @Deprecated
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 暂不开放
     * @param Scene 暂不开放
     * @deprecated
     */
    @Deprecated
    public void setScene(String Scene) {
        this.Scene = Scene;
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

    public DescribeFileUrlsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileUrlsRequest(DescribeFileUrlsRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.BusinessIds != null) {
            this.BusinessIds = new String[source.BusinessIds.length];
            for (int i = 0; i < source.BusinessIds.length; i++) {
                this.BusinessIds[i] = new String(source.BusinessIds[i]);
            }
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.UrlTtl != null) {
            this.UrlTtl = new Long(source.UrlTtl);
        }
        if (source.CcToken != null) {
            this.CcToken = new String(source.CcToken);
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamArraySimple(map, prefix + "BusinessIds.", this.BusinessIds);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "UrlTtl", this.UrlTtl);
        this.setParamSimple(map, prefix + "CcToken", this.CcToken);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

