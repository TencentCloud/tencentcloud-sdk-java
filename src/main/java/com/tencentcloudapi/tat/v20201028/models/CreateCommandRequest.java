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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCommandRequest extends AbstractModel {

    /**
    * <p>命令名称。名称仅支持中文、英文、数字、下划线、分隔符&quot;-&quot;、小数点，最大长度不能超60个字节。</p>
    */
    @SerializedName("CommandName")
    @Expose
    private String CommandName;

    /**
    * <p>命令脚本内容。 需 Base64 编码后传入。</p><p>当 EnableParameter = true 时，支持两种动态参数占位符：</p><ul><li>普通参数 {{key}}：例如脚本 <code>echo {{word}}</code> 配合参数 <code>{&quot;word&quot;: &quot;hello&quot;}</code>，实际执行 <code>echo hello</code>，执行记录显示 <code>{&quot;word&quot;: &quot;hello&quot;}</code>。</li><li>隐藏参数 {{tat-hidden:key}}：用于敏感信息脱敏。例如脚本 <code>echo {{tat-hidden:word}}</code> 配合参数 <code>{&quot;word&quot;: &quot;hello&quot;}</code>（传参 Key 不带前缀），实际执行 <code>echo hello</code>，记录显示 <code>{&quot;word&quot;: &quot;******&quot;}</code>。</li></ul><p>参数格式：Base64 编码字符串</p><p>入参限制：Base64 编码后的字符串长度不能超过 64KB</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>命令描述。不超过120字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>命令类型，目前支持取值：SHELL、POWERSHELL、BAT。默认：SHELL。</p>
    */
    @SerializedName("CommandType")
    @Expose
    private String CommandType;

    /**
    * <p>命令执行路径，对于 SHELL 命令默认为 /root，对于 POWERSHELL 命令默认为 C:\Program Files\qcloud\tat_agent\workdir。</p>
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * <p>命令超时时间，默认60秒。取值范围[1, 86400]。</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>是否启用自定义参数功能。<br>一旦创建，此值不提供修改。<br>默认值：false。</p>
    */
    @SerializedName("EnableParameter")
    @Expose
    private Boolean EnableParameter;

    /**
    * <p>启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{&quot;varA&quot;: &quot;222&quot;}。<br>key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。<br>如果InvokeCommand时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在 EnableParameter 参数为 true 时，才允许设置此参数。<br>自定义参数最多20个。<br>自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。</p>
    */
    @SerializedName("DefaultParameters")
    @Expose
    private String DefaultParameters;

    /**
    * <p>自定义参数数组。<br>如果InvokeCommand时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在 EnableParameter 参数为 true 时，才允许设置此参数。<br>自定义参数最多20个。</p>
    */
    @SerializedName("DefaultParameterConfs")
    @Expose
    private DefaultParameterConf [] DefaultParameterConfs;

    /**
    * <p>为命令关联的标签，列表长度不超过10。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>在 CVM 或 Lighthouse 实例中执行命令的用户名称。<br>使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。默认情况下，在 Linux 实例中以 root 用户执行命令；在Windows 实例中以 System 用户执行命令。</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>指定日志上传的cos bucket 地址，必须以https开头，如 https://BucketName-123454321.cos.ap-beijing.myqcloud.com。</p>
    */
    @SerializedName("OutputCOSBucketUrl")
    @Expose
    private String OutputCOSBucketUrl;

    /**
    * <p>指定日志在cos bucket中的目录，目录命名有如下规则：</p><ol><li>可用数字、中英文和可见字符的组合，长度最多为60。</li><li>用 / 分割路径，可快速创建子目录。</li><li>不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称</li></ol>
    */
    @SerializedName("OutputCOSKeyPrefix")
    @Expose
    private String OutputCOSKeyPrefix;

    /**
     * Get <p>命令名称。名称仅支持中文、英文、数字、下划线、分隔符&quot;-&quot;、小数点，最大长度不能超60个字节。</p> 
     * @return CommandName <p>命令名称。名称仅支持中文、英文、数字、下划线、分隔符&quot;-&quot;、小数点，最大长度不能超60个字节。</p>
     */
    public String getCommandName() {
        return this.CommandName;
    }

    /**
     * Set <p>命令名称。名称仅支持中文、英文、数字、下划线、分隔符&quot;-&quot;、小数点，最大长度不能超60个字节。</p>
     * @param CommandName <p>命令名称。名称仅支持中文、英文、数字、下划线、分隔符&quot;-&quot;、小数点，最大长度不能超60个字节。</p>
     */
    public void setCommandName(String CommandName) {
        this.CommandName = CommandName;
    }

    /**
     * Get <p>命令脚本内容。 需 Base64 编码后传入。</p><p>当 EnableParameter = true 时，支持两种动态参数占位符：</p><ul><li>普通参数 {{key}}：例如脚本 <code>echo {{word}}</code> 配合参数 <code>{&quot;word&quot;: &quot;hello&quot;}</code>，实际执行 <code>echo hello</code>，执行记录显示 <code>{&quot;word&quot;: &quot;hello&quot;}</code>。</li><li>隐藏参数 {{tat-hidden:key}}：用于敏感信息脱敏。例如脚本 <code>echo {{tat-hidden:word}}</code> 配合参数 <code>{&quot;word&quot;: &quot;hello&quot;}</code>（传参 Key 不带前缀），实际执行 <code>echo hello</code>，记录显示 <code>{&quot;word&quot;: &quot;******&quot;}</code>。</li></ul><p>参数格式：Base64 编码字符串</p><p>入参限制：Base64 编码后的字符串长度不能超过 64KB</p> 
     * @return Content <p>命令脚本内容。 需 Base64 编码后传入。</p><p>当 EnableParameter = true 时，支持两种动态参数占位符：</p><ul><li>普通参数 {{key}}：例如脚本 <code>echo {{word}}</code> 配合参数 <code>{&quot;word&quot;: &quot;hello&quot;}</code>，实际执行 <code>echo hello</code>，执行记录显示 <code>{&quot;word&quot;: &quot;hello&quot;}</code>。</li><li>隐藏参数 {{tat-hidden:key}}：用于敏感信息脱敏。例如脚本 <code>echo {{tat-hidden:word}}</code> 配合参数 <code>{&quot;word&quot;: &quot;hello&quot;}</code>（传参 Key 不带前缀），实际执行 <code>echo hello</code>，记录显示 <code>{&quot;word&quot;: &quot;******&quot;}</code>。</li></ul><p>参数格式：Base64 编码字符串</p><p>入参限制：Base64 编码后的字符串长度不能超过 64KB</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>命令脚本内容。 需 Base64 编码后传入。</p><p>当 EnableParameter = true 时，支持两种动态参数占位符：</p><ul><li>普通参数 {{key}}：例如脚本 <code>echo {{word}}</code> 配合参数 <code>{&quot;word&quot;: &quot;hello&quot;}</code>，实际执行 <code>echo hello</code>，执行记录显示 <code>{&quot;word&quot;: &quot;hello&quot;}</code>。</li><li>隐藏参数 {{tat-hidden:key}}：用于敏感信息脱敏。例如脚本 <code>echo {{tat-hidden:word}}</code> 配合参数 <code>{&quot;word&quot;: &quot;hello&quot;}</code>（传参 Key 不带前缀），实际执行 <code>echo hello</code>，记录显示 <code>{&quot;word&quot;: &quot;******&quot;}</code>。</li></ul><p>参数格式：Base64 编码字符串</p><p>入参限制：Base64 编码后的字符串长度不能超过 64KB</p>
     * @param Content <p>命令脚本内容。 需 Base64 编码后传入。</p><p>当 EnableParameter = true 时，支持两种动态参数占位符：</p><ul><li>普通参数 {{key}}：例如脚本 <code>echo {{word}}</code> 配合参数 <code>{&quot;word&quot;: &quot;hello&quot;}</code>，实际执行 <code>echo hello</code>，执行记录显示 <code>{&quot;word&quot;: &quot;hello&quot;}</code>。</li><li>隐藏参数 {{tat-hidden:key}}：用于敏感信息脱敏。例如脚本 <code>echo {{tat-hidden:word}}</code> 配合参数 <code>{&quot;word&quot;: &quot;hello&quot;}</code>（传参 Key 不带前缀），实际执行 <code>echo hello</code>，记录显示 <code>{&quot;word&quot;: &quot;******&quot;}</code>。</li></ul><p>参数格式：Base64 编码字符串</p><p>入参限制：Base64 编码后的字符串长度不能超过 64KB</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>命令描述。不超过120字符。</p> 
     * @return Description <p>命令描述。不超过120字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>命令描述。不超过120字符。</p>
     * @param Description <p>命令描述。不超过120字符。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>命令类型，目前支持取值：SHELL、POWERSHELL、BAT。默认：SHELL。</p> 
     * @return CommandType <p>命令类型，目前支持取值：SHELL、POWERSHELL、BAT。默认：SHELL。</p>
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set <p>命令类型，目前支持取值：SHELL、POWERSHELL、BAT。默认：SHELL。</p>
     * @param CommandType <p>命令类型，目前支持取值：SHELL、POWERSHELL、BAT。默认：SHELL。</p>
     */
    public void setCommandType(String CommandType) {
        this.CommandType = CommandType;
    }

    /**
     * Get <p>命令执行路径，对于 SHELL 命令默认为 /root，对于 POWERSHELL 命令默认为 C:\Program Files\qcloud\tat_agent\workdir。</p> 
     * @return WorkingDirectory <p>命令执行路径，对于 SHELL 命令默认为 /root，对于 POWERSHELL 命令默认为 C:\Program Files\qcloud\tat_agent\workdir。</p>
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set <p>命令执行路径，对于 SHELL 命令默认为 /root，对于 POWERSHELL 命令默认为 C:\Program Files\qcloud\tat_agent\workdir。</p>
     * @param WorkingDirectory <p>命令执行路径，对于 SHELL 命令默认为 /root，对于 POWERSHELL 命令默认为 C:\Program Files\qcloud\tat_agent\workdir。</p>
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get <p>命令超时时间，默认60秒。取值范围[1, 86400]。</p> 
     * @return Timeout <p>命令超时时间，默认60秒。取值范围[1, 86400]。</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>命令超时时间，默认60秒。取值范围[1, 86400]。</p>
     * @param Timeout <p>命令超时时间，默认60秒。取值范围[1, 86400]。</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>是否启用自定义参数功能。<br>一旦创建，此值不提供修改。<br>默认值：false。</p> 
     * @return EnableParameter <p>是否启用自定义参数功能。<br>一旦创建，此值不提供修改。<br>默认值：false。</p>
     */
    public Boolean getEnableParameter() {
        return this.EnableParameter;
    }

    /**
     * Set <p>是否启用自定义参数功能。<br>一旦创建，此值不提供修改。<br>默认值：false。</p>
     * @param EnableParameter <p>是否启用自定义参数功能。<br>一旦创建，此值不提供修改。<br>默认值：false。</p>
     */
    public void setEnableParameter(Boolean EnableParameter) {
        this.EnableParameter = EnableParameter;
    }

    /**
     * Get <p>启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{&quot;varA&quot;: &quot;222&quot;}。<br>key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。<br>如果InvokeCommand时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在 EnableParameter 参数为 true 时，才允许设置此参数。<br>自定义参数最多20个。<br>自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。</p> 
     * @return DefaultParameters <p>启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{&quot;varA&quot;: &quot;222&quot;}。<br>key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。<br>如果InvokeCommand时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在 EnableParameter 参数为 true 时，才允许设置此参数。<br>自定义参数最多20个。<br>自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。</p>
     */
    public String getDefaultParameters() {
        return this.DefaultParameters;
    }

    /**
     * Set <p>启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{&quot;varA&quot;: &quot;222&quot;}。<br>key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。<br>如果InvokeCommand时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在 EnableParameter 参数为 true 时，才允许设置此参数。<br>自定义参数最多20个。<br>自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。</p>
     * @param DefaultParameters <p>启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{&quot;varA&quot;: &quot;222&quot;}。<br>key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。<br>如果InvokeCommand时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在 EnableParameter 参数为 true 时，才允许设置此参数。<br>自定义参数最多20个。<br>自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。</p>
     */
    public void setDefaultParameters(String DefaultParameters) {
        this.DefaultParameters = DefaultParameters;
    }

    /**
     * Get <p>自定义参数数组。<br>如果InvokeCommand时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在 EnableParameter 参数为 true 时，才允许设置此参数。<br>自定义参数最多20个。</p> 
     * @return DefaultParameterConfs <p>自定义参数数组。<br>如果InvokeCommand时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在 EnableParameter 参数为 true 时，才允许设置此参数。<br>自定义参数最多20个。</p>
     */
    public DefaultParameterConf [] getDefaultParameterConfs() {
        return this.DefaultParameterConfs;
    }

    /**
     * Set <p>自定义参数数组。<br>如果InvokeCommand时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在 EnableParameter 参数为 true 时，才允许设置此参数。<br>自定义参数最多20个。</p>
     * @param DefaultParameterConfs <p>自定义参数数组。<br>如果InvokeCommand时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在 EnableParameter 参数为 true 时，才允许设置此参数。<br>自定义参数最多20个。</p>
     */
    public void setDefaultParameterConfs(DefaultParameterConf [] DefaultParameterConfs) {
        this.DefaultParameterConfs = DefaultParameterConfs;
    }

    /**
     * Get <p>为命令关联的标签，列表长度不超过10。</p> 
     * @return Tags <p>为命令关联的标签，列表长度不超过10。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>为命令关联的标签，列表长度不超过10。</p>
     * @param Tags <p>为命令关联的标签，列表长度不超过10。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>在 CVM 或 Lighthouse 实例中执行命令的用户名称。<br>使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。默认情况下，在 Linux 实例中以 root 用户执行命令；在Windows 实例中以 System 用户执行命令。</p> 
     * @return Username <p>在 CVM 或 Lighthouse 实例中执行命令的用户名称。<br>使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。默认情况下，在 Linux 实例中以 root 用户执行命令；在Windows 实例中以 System 用户执行命令。</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>在 CVM 或 Lighthouse 实例中执行命令的用户名称。<br>使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。默认情况下，在 Linux 实例中以 root 用户执行命令；在Windows 实例中以 System 用户执行命令。</p>
     * @param Username <p>在 CVM 或 Lighthouse 实例中执行命令的用户名称。<br>使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。默认情况下，在 Linux 实例中以 root 用户执行命令；在Windows 实例中以 System 用户执行命令。</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>指定日志上传的cos bucket 地址，必须以https开头，如 https://BucketName-123454321.cos.ap-beijing.myqcloud.com。</p> 
     * @return OutputCOSBucketUrl <p>指定日志上传的cos bucket 地址，必须以https开头，如 https://BucketName-123454321.cos.ap-beijing.myqcloud.com。</p>
     */
    public String getOutputCOSBucketUrl() {
        return this.OutputCOSBucketUrl;
    }

    /**
     * Set <p>指定日志上传的cos bucket 地址，必须以https开头，如 https://BucketName-123454321.cos.ap-beijing.myqcloud.com。</p>
     * @param OutputCOSBucketUrl <p>指定日志上传的cos bucket 地址，必须以https开头，如 https://BucketName-123454321.cos.ap-beijing.myqcloud.com。</p>
     */
    public void setOutputCOSBucketUrl(String OutputCOSBucketUrl) {
        this.OutputCOSBucketUrl = OutputCOSBucketUrl;
    }

    /**
     * Get <p>指定日志在cos bucket中的目录，目录命名有如下规则：</p><ol><li>可用数字、中英文和可见字符的组合，长度最多为60。</li><li>用 / 分割路径，可快速创建子目录。</li><li>不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称</li></ol> 
     * @return OutputCOSKeyPrefix <p>指定日志在cos bucket中的目录，目录命名有如下规则：</p><ol><li>可用数字、中英文和可见字符的组合，长度最多为60。</li><li>用 / 分割路径，可快速创建子目录。</li><li>不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称</li></ol>
     */
    public String getOutputCOSKeyPrefix() {
        return this.OutputCOSKeyPrefix;
    }

    /**
     * Set <p>指定日志在cos bucket中的目录，目录命名有如下规则：</p><ol><li>可用数字、中英文和可见字符的组合，长度最多为60。</li><li>用 / 分割路径，可快速创建子目录。</li><li>不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称</li></ol>
     * @param OutputCOSKeyPrefix <p>指定日志在cos bucket中的目录，目录命名有如下规则：</p><ol><li>可用数字、中英文和可见字符的组合，长度最多为60。</li><li>用 / 分割路径，可快速创建子目录。</li><li>不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称</li></ol>
     */
    public void setOutputCOSKeyPrefix(String OutputCOSKeyPrefix) {
        this.OutputCOSKeyPrefix = OutputCOSKeyPrefix;
    }

    public CreateCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCommandRequest(CreateCommandRequest source) {
        if (source.CommandName != null) {
            this.CommandName = new String(source.CommandName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CommandType != null) {
            this.CommandType = new String(source.CommandType);
        }
        if (source.WorkingDirectory != null) {
            this.WorkingDirectory = new String(source.WorkingDirectory);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.EnableParameter != null) {
            this.EnableParameter = new Boolean(source.EnableParameter);
        }
        if (source.DefaultParameters != null) {
            this.DefaultParameters = new String(source.DefaultParameters);
        }
        if (source.DefaultParameterConfs != null) {
            this.DefaultParameterConfs = new DefaultParameterConf[source.DefaultParameterConfs.length];
            for (int i = 0; i < source.DefaultParameterConfs.length; i++) {
                this.DefaultParameterConfs[i] = new DefaultParameterConf(source.DefaultParameterConfs[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.OutputCOSBucketUrl != null) {
            this.OutputCOSBucketUrl = new String(source.OutputCOSBucketUrl);
        }
        if (source.OutputCOSKeyPrefix != null) {
            this.OutputCOSKeyPrefix = new String(source.OutputCOSKeyPrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommandName", this.CommandName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CommandType", this.CommandType);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "EnableParameter", this.EnableParameter);
        this.setParamSimple(map, prefix + "DefaultParameters", this.DefaultParameters);
        this.setParamArrayObj(map, prefix + "DefaultParameterConfs.", this.DefaultParameterConfs);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

