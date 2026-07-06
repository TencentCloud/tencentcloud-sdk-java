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

public class CreateFileConvertTaskRequest extends AbstractModel {

    /**
    * <p>需要进行转换的资源文件类型<br>支持的文件类型如下：</p><p>枚举值：</p><ul><li>doc： doc</li><li>docx： docx</li><li>xls： xls</li><li>xlsx： xlsx</li><li>jpg： jpg</li><li>jpeg： jpeg</li><li>png： png</li><li>html： html</li><li>bmp： bmp</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>需要进行转换操作的文件资源名称，带资源后缀名。</p><p>注:  <code>资源名称长度限制为256个字符</code></p>
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>需要进行转换操作的文件资源Id，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源Id。</p><p>注:  <code>目前，此接口仅支持单个文件进行转换。</code></p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get <p>需要进行转换的资源文件类型<br>支持的文件类型如下：</p><p>枚举值：</p><ul><li>doc： doc</li><li>docx： docx</li><li>xls： xls</li><li>xlsx： xlsx</li><li>jpg： jpg</li><li>jpeg： jpeg</li><li>png： png</li><li>html： html</li><li>bmp： bmp</li></ul> 
     * @return ResourceType <p>需要进行转换的资源文件类型<br>支持的文件类型如下：</p><p>枚举值：</p><ul><li>doc： doc</li><li>docx： docx</li><li>xls： xls</li><li>xlsx： xlsx</li><li>jpg： jpg</li><li>jpeg： jpeg</li><li>png： png</li><li>html： html</li><li>bmp： bmp</li></ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>需要进行转换的资源文件类型<br>支持的文件类型如下：</p><p>枚举值：</p><ul><li>doc： doc</li><li>docx： docx</li><li>xls： xls</li><li>xlsx： xlsx</li><li>jpg： jpg</li><li>jpeg： jpeg</li><li>png： png</li><li>html： html</li><li>bmp： bmp</li></ul>
     * @param ResourceType <p>需要进行转换的资源文件类型<br>支持的文件类型如下：</p><p>枚举值：</p><ul><li>doc： doc</li><li>docx： docx</li><li>xls： xls</li><li>xlsx： xlsx</li><li>jpg： jpg</li><li>jpeg： jpeg</li><li>png： png</li><li>html： html</li><li>bmp： bmp</li></ul>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>需要进行转换操作的文件资源名称，带资源后缀名。</p><p>注:  <code>资源名称长度限制为256个字符</code></p> 
     * @return ResourceName <p>需要进行转换操作的文件资源名称，带资源后缀名。</p><p>注:  <code>资源名称长度限制为256个字符</code></p>
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set <p>需要进行转换操作的文件资源名称，带资源后缀名。</p><p>注:  <code>资源名称长度限制为256个字符</code></p>
     * @param ResourceName <p>需要进行转换操作的文件资源名称，带资源后缀名。</p><p>注:  <code>资源名称长度限制为256个字符</code></p>
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get <p>需要进行转换操作的文件资源Id，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源Id。</p><p>注:  <code>目前，此接口仅支持单个文件进行转换。</code></p> 
     * @return ResourceId <p>需要进行转换操作的文件资源Id，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源Id。</p><p>注:  <code>目前，此接口仅支持单个文件进行转换。</code></p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>需要进行转换操作的文件资源Id，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源Id。</p><p>注:  <code>目前，此接口仅支持单个文件进行转换。</code></p>
     * @param ResourceId <p>需要进行转换操作的文件资源Id，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源Id。</p><p>注:  <code>目前，此接口仅支持单个文件进行转换。</code></p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

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

    public CreateFileConvertTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileConvertTaskRequest(CreateFileConvertTaskRequest source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

