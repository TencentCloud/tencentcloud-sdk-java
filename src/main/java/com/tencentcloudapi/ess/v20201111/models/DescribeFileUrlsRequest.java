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
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>文件对应的业务类型，目前支持：<ul><li><strong>FLOW</strong> : <font color="red">如需下载合同文件请选择此项</font></li><li><strong>TEMPLATE</strong> : 如需下载模板文件请选择此项</li><li><strong>DOCUMENT</strong>: 如需下载文档文件请选择此项</li><li><strong>SEAL</strong>: 如需下载印章图片请选择此项</li><li><strong>DIGITFILE</strong>: 如需下载加签文件请选择此项</li><li><strong>ARCHIVE</strong>: 如需下载合同归档文件请选择此项</li></ul></p><p>枚举值：</p><ul><li>FLOW： 如需下载合同文件请选择此项</li><li>TEMPLATE： 如需下载模板文件请选择此项</li><li>DOCUMENT： 如需下载文档文件请选择此项</li><li>SEAL： 如需下载印章图片请选择此项</li><li>DIGITFILE： 如需下载加签文件请选择此项</li><li>ARCHIVE： 如需下载合同归档文件请选择此项</li></ul>
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * <p>业务编号的数组，取值如下：<ul><li>流程编号</li><li>模板编号</li><li>文档编号</li><li>印章编号</li><li>加签文件编号</li><li>如需下载合同文件请传入FlowId，最大支持20个资源</li></ul></p>
    */
    @SerializedName("BusinessIds")
    @Expose
    private String [] BusinessIds;

    /**
    * <p>下载后的文件命名，只有FileType为zip的时候生效</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>要下载的文件类型，取值如下：</p><ul><li>JPG</li><li>PDF</li><li>ZIP</li></ul>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 1000。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24x60x60s(1天)</p>
    */
    @SerializedName("UrlTtl")
    @Expose
    private Long UrlTtl;

    /**
    * <p>暂不开放</p>
    */
    @SerializedName("CcToken")
    @Expose
    private String CcToken;

    /**
    * <p>暂不开放</p>
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>文件对应的业务类型，目前支持：<ul><li><strong>FLOW</strong> : <font color="red">如需下载合同文件请选择此项</font></li><li><strong>TEMPLATE</strong> : 如需下载模板文件请选择此项</li><li><strong>DOCUMENT</strong>: 如需下载文档文件请选择此项</li><li><strong>SEAL</strong>: 如需下载印章图片请选择此项</li><li><strong>DIGITFILE</strong>: 如需下载加签文件请选择此项</li><li><strong>ARCHIVE</strong>: 如需下载合同归档文件请选择此项</li></ul></p><p>枚举值：</p><ul><li>FLOW： 如需下载合同文件请选择此项</li><li>TEMPLATE： 如需下载模板文件请选择此项</li><li>DOCUMENT： 如需下载文档文件请选择此项</li><li>SEAL： 如需下载印章图片请选择此项</li><li>DIGITFILE： 如需下载加签文件请选择此项</li><li>ARCHIVE： 如需下载合同归档文件请选择此项</li></ul> 
     * @return BusinessType <p>文件对应的业务类型，目前支持：<ul><li><strong>FLOW</strong> : <font color="red">如需下载合同文件请选择此项</font></li><li><strong>TEMPLATE</strong> : 如需下载模板文件请选择此项</li><li><strong>DOCUMENT</strong>: 如需下载文档文件请选择此项</li><li><strong>SEAL</strong>: 如需下载印章图片请选择此项</li><li><strong>DIGITFILE</strong>: 如需下载加签文件请选择此项</li><li><strong>ARCHIVE</strong>: 如需下载合同归档文件请选择此项</li></ul></p><p>枚举值：</p><ul><li>FLOW： 如需下载合同文件请选择此项</li><li>TEMPLATE： 如需下载模板文件请选择此项</li><li>DOCUMENT： 如需下载文档文件请选择此项</li><li>SEAL： 如需下载印章图片请选择此项</li><li>DIGITFILE： 如需下载加签文件请选择此项</li><li>ARCHIVE： 如需下载合同归档文件请选择此项</li></ul>
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set <p>文件对应的业务类型，目前支持：<ul><li><strong>FLOW</strong> : <font color="red">如需下载合同文件请选择此项</font></li><li><strong>TEMPLATE</strong> : 如需下载模板文件请选择此项</li><li><strong>DOCUMENT</strong>: 如需下载文档文件请选择此项</li><li><strong>SEAL</strong>: 如需下载印章图片请选择此项</li><li><strong>DIGITFILE</strong>: 如需下载加签文件请选择此项</li><li><strong>ARCHIVE</strong>: 如需下载合同归档文件请选择此项</li></ul></p><p>枚举值：</p><ul><li>FLOW： 如需下载合同文件请选择此项</li><li>TEMPLATE： 如需下载模板文件请选择此项</li><li>DOCUMENT： 如需下载文档文件请选择此项</li><li>SEAL： 如需下载印章图片请选择此项</li><li>DIGITFILE： 如需下载加签文件请选择此项</li><li>ARCHIVE： 如需下载合同归档文件请选择此项</li></ul>
     * @param BusinessType <p>文件对应的业务类型，目前支持：<ul><li><strong>FLOW</strong> : <font color="red">如需下载合同文件请选择此项</font></li><li><strong>TEMPLATE</strong> : 如需下载模板文件请选择此项</li><li><strong>DOCUMENT</strong>: 如需下载文档文件请选择此项</li><li><strong>SEAL</strong>: 如需下载印章图片请选择此项</li><li><strong>DIGITFILE</strong>: 如需下载加签文件请选择此项</li><li><strong>ARCHIVE</strong>: 如需下载合同归档文件请选择此项</li></ul></p><p>枚举值：</p><ul><li>FLOW： 如需下载合同文件请选择此项</li><li>TEMPLATE： 如需下载模板文件请选择此项</li><li>DOCUMENT： 如需下载文档文件请选择此项</li><li>SEAL： 如需下载印章图片请选择此项</li><li>DIGITFILE： 如需下载加签文件请选择此项</li><li>ARCHIVE： 如需下载合同归档文件请选择此项</li></ul>
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get <p>业务编号的数组，取值如下：<ul><li>流程编号</li><li>模板编号</li><li>文档编号</li><li>印章编号</li><li>加签文件编号</li><li>如需下载合同文件请传入FlowId，最大支持20个资源</li></ul></p> 
     * @return BusinessIds <p>业务编号的数组，取值如下：<ul><li>流程编号</li><li>模板编号</li><li>文档编号</li><li>印章编号</li><li>加签文件编号</li><li>如需下载合同文件请传入FlowId，最大支持20个资源</li></ul></p>
     */
    public String [] getBusinessIds() {
        return this.BusinessIds;
    }

    /**
     * Set <p>业务编号的数组，取值如下：<ul><li>流程编号</li><li>模板编号</li><li>文档编号</li><li>印章编号</li><li>加签文件编号</li><li>如需下载合同文件请传入FlowId，最大支持20个资源</li></ul></p>
     * @param BusinessIds <p>业务编号的数组，取值如下：<ul><li>流程编号</li><li>模板编号</li><li>文档编号</li><li>印章编号</li><li>加签文件编号</li><li>如需下载合同文件请传入FlowId，最大支持20个资源</li></ul></p>
     */
    public void setBusinessIds(String [] BusinessIds) {
        this.BusinessIds = BusinessIds;
    }

    /**
     * Get <p>下载后的文件命名，只有FileType为zip的时候生效</p> 
     * @return FileName <p>下载后的文件命名，只有FileType为zip的时候生效</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>下载后的文件命名，只有FileType为zip的时候生效</p>
     * @param FileName <p>下载后的文件命名，只有FileType为zip的时候生效</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>要下载的文件类型，取值如下：</p><ul><li>JPG</li><li>PDF</li><li>ZIP</li></ul> 
     * @return FileType <p>要下载的文件类型，取值如下：</p><ul><li>JPG</li><li>PDF</li><li>ZIP</li></ul>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>要下载的文件类型，取值如下：</p><ul><li>JPG</li><li>PDF</li><li>ZIP</li></ul>
     * @param FileType <p>要下载的文件类型，取值如下：</p><ul><li>JPG</li><li>PDF</li><li>ZIP</li></ul>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 1000。</p> 
     * @return Offset <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 1000。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 1000。</p>
     * @param Offset <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0，最大 1000。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 100。</p> 
     * @return Limit <p>指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 100。</p>
     * @param Limit <p>指定分页每页返回的数据条数，如果不传默认为 20，单页最大支持 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24x60x60s(1天)</p> 
     * @return UrlTtl <p>下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24x60x60s(1天)</p>
     */
    public Long getUrlTtl() {
        return this.UrlTtl;
    }

    /**
     * Set <p>下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24x60x60s(1天)</p>
     * @param UrlTtl <p>下载url过期时间，单位秒。0: 按默认值5分钟，允许范围：1s~24x60x60s(1天)</p>
     */
    public void setUrlTtl(Long UrlTtl) {
        this.UrlTtl = UrlTtl;
    }

    /**
     * Get <p>暂不开放</p> 
     * @return CcToken <p>暂不开放</p>
     * @deprecated
     */
    @Deprecated
    public String getCcToken() {
        return this.CcToken;
    }

    /**
     * Set <p>暂不开放</p>
     * @param CcToken <p>暂不开放</p>
     * @deprecated
     */
    @Deprecated
    public void setCcToken(String CcToken) {
        this.CcToken = CcToken;
    }

    /**
     * Get <p>暂不开放</p> 
     * @return Scene <p>暂不开放</p>
     * @deprecated
     */
    @Deprecated
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set <p>暂不开放</p>
     * @param Scene <p>暂不开放</p>
     * @deprecated
     */
    @Deprecated
    public void setScene(String Scene) {
        this.Scene = Scene;
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

