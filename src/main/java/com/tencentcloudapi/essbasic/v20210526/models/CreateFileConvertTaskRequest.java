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

public class CreateFileConvertTaskRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>需要进行转换的资源文件类型<br>支持的文件类型如下：</p><p>枚举值：</p><ul><li>doc： doc</li><li>docx： docx</li><li>xls： xls</li><li>xlsx： xlsx</li><li>jpg： jpg</li><li>jpeg： jpeg</li><li>png： png</li><li>bmp： bmp</li><li>html： html</li><li>txt： txt</li></ul>
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
    * <p>需要进行转换操作的文件资源Id，通过<a href="https://qian.tencent.com/developers/partnerApis/files/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源Id。</p><p>注:  <code>目前，此接口仅支持单个文件进行转换。</code></p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

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
     * Get <p>需要进行转换的资源文件类型<br>支持的文件类型如下：</p><p>枚举值：</p><ul><li>doc： doc</li><li>docx： docx</li><li>xls： xls</li><li>xlsx： xlsx</li><li>jpg： jpg</li><li>jpeg： jpeg</li><li>png： png</li><li>bmp： bmp</li><li>html： html</li><li>txt： txt</li></ul> 
     * @return ResourceType <p>需要进行转换的资源文件类型<br>支持的文件类型如下：</p><p>枚举值：</p><ul><li>doc： doc</li><li>docx： docx</li><li>xls： xls</li><li>xlsx： xlsx</li><li>jpg： jpg</li><li>jpeg： jpeg</li><li>png： png</li><li>bmp： bmp</li><li>html： html</li><li>txt： txt</li></ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>需要进行转换的资源文件类型<br>支持的文件类型如下：</p><p>枚举值：</p><ul><li>doc： doc</li><li>docx： docx</li><li>xls： xls</li><li>xlsx： xlsx</li><li>jpg： jpg</li><li>jpeg： jpeg</li><li>png： png</li><li>bmp： bmp</li><li>html： html</li><li>txt： txt</li></ul>
     * @param ResourceType <p>需要进行转换的资源文件类型<br>支持的文件类型如下：</p><p>枚举值：</p><ul><li>doc： doc</li><li>docx： docx</li><li>xls： xls</li><li>xlsx： xlsx</li><li>jpg： jpg</li><li>jpeg： jpeg</li><li>png： png</li><li>bmp： bmp</li><li>html： html</li><li>txt： txt</li></ul>
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
     * Get <p>需要进行转换操作的文件资源Id，通过<a href="https://qian.tencent.com/developers/partnerApis/files/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源Id。</p><p>注:  <code>目前，此接口仅支持单个文件进行转换。</code></p> 
     * @return ResourceId <p>需要进行转换操作的文件资源Id，通过<a href="https://qian.tencent.com/developers/partnerApis/files/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源Id。</p><p>注:  <code>目前，此接口仅支持单个文件进行转换。</code></p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>需要进行转换操作的文件资源Id，通过<a href="https://qian.tencent.com/developers/partnerApis/files/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源Id。</p><p>注:  <code>目前，此接口仅支持单个文件进行转换。</code></p>
     * @param ResourceId <p>需要进行转换操作的文件资源Id，通过<a href="https://qian.tencent.com/developers/partnerApis/files/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源Id。</p><p>注:  <code>目前，此接口仅支持单个文件进行转换。</code></p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public CreateFileConvertTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileConvertTaskRequest(CreateFileConvertTaskRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

