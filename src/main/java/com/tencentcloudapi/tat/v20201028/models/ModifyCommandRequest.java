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

public class ModifyCommandRequest extends AbstractModel {

    /**
    * <p>命令ID。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取。</p>
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * <p>命令名称。名称仅支持中文、英文、数字、下划线、分隔符&quot;-&quot;、小数点，最大长度不能超60个字节。</p>
    */
    @SerializedName("CommandName")
    @Expose
    private String CommandName;

    /**
    * <p>命令描述。不超过120字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Base64编码后的命令内容，长度不可超过64KB。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>命令类型，目前支持取值：SHELL、POWERSHELL、BAT。</p>
    */
    @SerializedName("CommandType")
    @Expose
    private String CommandType;

    /**
    * <p>命令执行路径。</p>
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * <p>命令超时时间。</p><p>取值范围：[1, 86400]</p><p>单位：秒</p><p>默认值：60</p><p>指定 OutputCOSBucketUrl 参数时，超时时间将包含命令输出上传 COS 的耗时</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{&quot;varA&quot;: &quot;222&quot;}。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>采取整体全覆盖式修改，即修改时必须提供所有新默认值。<br>仅在命令的 EnableParameter 为 true 时，才允许修改此参数。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取命令的 EnableParameter 设置。<br>key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。<br>自定义参数最多20个。<br>自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。</p>
    */
    @SerializedName("DefaultParameters")
    @Expose
    private String DefaultParameters;

    /**
    * <p>自定义参数数组。如果 InvokeCommand 时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在命令的 EnableParameter 为 true 时，才允许修改此参数。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取命令的 EnableParameter 设置。<br>自定义参数最多20个。</p>
    */
    @SerializedName("DefaultParameterConfs")
    @Expose
    private DefaultParameterConf [] DefaultParameterConfs;

    /**
    * <p>在 CVM 或 Lighthouse 实例中执行命令的用户名称。<br>使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。</p>
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
    * <p>指定日志在cos bucket中的目录，目录命名有如下规则：</p><ol><li>可用数字、中英文和可见字符的组合，长度最多为60。</li><li>用 / 分割路径，可快速创建子目录。</li><li>不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称。</li></ol>
    */
    @SerializedName("OutputCOSKeyPrefix")
    @Expose
    private String OutputCOSKeyPrefix;

    /**
     * Get <p>命令ID。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取。</p> 
     * @return CommandId <p>命令ID。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取。</p>
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set <p>命令ID。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取。</p>
     * @param CommandId <p>命令ID。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取。</p>
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

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
     * Get <p>Base64编码后的命令内容，长度不可超过64KB。</p> 
     * @return Content <p>Base64编码后的命令内容，长度不可超过64KB。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Base64编码后的命令内容，长度不可超过64KB。</p>
     * @param Content <p>Base64编码后的命令内容，长度不可超过64KB。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>命令类型，目前支持取值：SHELL、POWERSHELL、BAT。</p> 
     * @return CommandType <p>命令类型，目前支持取值：SHELL、POWERSHELL、BAT。</p>
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set <p>命令类型，目前支持取值：SHELL、POWERSHELL、BAT。</p>
     * @param CommandType <p>命令类型，目前支持取值：SHELL、POWERSHELL、BAT。</p>
     */
    public void setCommandType(String CommandType) {
        this.CommandType = CommandType;
    }

    /**
     * Get <p>命令执行路径。</p> 
     * @return WorkingDirectory <p>命令执行路径。</p>
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set <p>命令执行路径。</p>
     * @param WorkingDirectory <p>命令执行路径。</p>
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get <p>命令超时时间。</p><p>取值范围：[1, 86400]</p><p>单位：秒</p><p>默认值：60</p><p>指定 OutputCOSBucketUrl 参数时，超时时间将包含命令输出上传 COS 的耗时</p> 
     * @return Timeout <p>命令超时时间。</p><p>取值范围：[1, 86400]</p><p>单位：秒</p><p>默认值：60</p><p>指定 OutputCOSBucketUrl 参数时，超时时间将包含命令输出上传 COS 的耗时</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>命令超时时间。</p><p>取值范围：[1, 86400]</p><p>单位：秒</p><p>默认值：60</p><p>指定 OutputCOSBucketUrl 参数时，超时时间将包含命令输出上传 COS 的耗时</p>
     * @param Timeout <p>命令超时时间。</p><p>取值范围：[1, 86400]</p><p>单位：秒</p><p>默认值：60</p><p>指定 OutputCOSBucketUrl 参数时，超时时间将包含命令输出上传 COS 的耗时</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{&quot;varA&quot;: &quot;222&quot;}。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>采取整体全覆盖式修改，即修改时必须提供所有新默认值。<br>仅在命令的 EnableParameter 为 true 时，才允许修改此参数。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取命令的 EnableParameter 设置。<br>key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。<br>自定义参数最多20个。<br>自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。</p> 
     * @return DefaultParameters <p>启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{&quot;varA&quot;: &quot;222&quot;}。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>采取整体全覆盖式修改，即修改时必须提供所有新默认值。<br>仅在命令的 EnableParameter 为 true 时，才允许修改此参数。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取命令的 EnableParameter 设置。<br>key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。<br>自定义参数最多20个。<br>自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。</p>
     */
    public String getDefaultParameters() {
        return this.DefaultParameters;
    }

    /**
     * Set <p>启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{&quot;varA&quot;: &quot;222&quot;}。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>采取整体全覆盖式修改，即修改时必须提供所有新默认值。<br>仅在命令的 EnableParameter 为 true 时，才允许修改此参数。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取命令的 EnableParameter 设置。<br>key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。<br>自定义参数最多20个。<br>自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。</p>
     * @param DefaultParameters <p>启用自定义参数功能时，自定义参数的默认取值。字段类型为json encoded string。如：{&quot;varA&quot;: &quot;222&quot;}。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>采取整体全覆盖式修改，即修改时必须提供所有新默认值。<br>仅在命令的 EnableParameter 为 true 时，才允许修改此参数。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取命令的 EnableParameter 设置。<br>key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。<br>自定义参数最多20个。<br>自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。</p>
     */
    public void setDefaultParameters(String DefaultParameters) {
        this.DefaultParameters = DefaultParameters;
    }

    /**
     * Get <p>自定义参数数组。如果 InvokeCommand 时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在命令的 EnableParameter 为 true 时，才允许修改此参数。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取命令的 EnableParameter 设置。<br>自定义参数最多20个。</p> 
     * @return DefaultParameterConfs <p>自定义参数数组。如果 InvokeCommand 时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在命令的 EnableParameter 为 true 时，才允许修改此参数。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取命令的 EnableParameter 设置。<br>自定义参数最多20个。</p>
     */
    public DefaultParameterConf [] getDefaultParameterConfs() {
        return this.DefaultParameterConfs;
    }

    /**
     * Set <p>自定义参数数组。如果 InvokeCommand 时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在命令的 EnableParameter 为 true 时，才允许修改此参数。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取命令的 EnableParameter 设置。<br>自定义参数最多20个。</p>
     * @param DefaultParameterConfs <p>自定义参数数组。如果 InvokeCommand 时未提供参数取值，将使用这里的默认值进行替换。<br>参数不支持同时指定 <code>DefaultParameters</code> 和 <code>DefaultParameterConfs</code> 。<br>仅在命令的 EnableParameter 为 true 时，才允许修改此参数。可通过 <a href="https://cloud.tencent.com/document/api/1340/52681">DescribeCommands(查询命令详情)</a> 接口获取命令的 EnableParameter 设置。<br>自定义参数最多20个。</p>
     */
    public void setDefaultParameterConfs(DefaultParameterConf [] DefaultParameterConfs) {
        this.DefaultParameterConfs = DefaultParameterConfs;
    }

    /**
     * Get <p>在 CVM 或 Lighthouse 实例中执行命令的用户名称。<br>使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。</p> 
     * @return Username <p>在 CVM 或 Lighthouse 实例中执行命令的用户名称。<br>使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>在 CVM 或 Lighthouse 实例中执行命令的用户名称。<br>使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。</p>
     * @param Username <p>在 CVM 或 Lighthouse 实例中执行命令的用户名称。<br>使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。</p>
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
     * Get <p>指定日志在cos bucket中的目录，目录命名有如下规则：</p><ol><li>可用数字、中英文和可见字符的组合，长度最多为60。</li><li>用 / 分割路径，可快速创建子目录。</li><li>不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称。</li></ol> 
     * @return OutputCOSKeyPrefix <p>指定日志在cos bucket中的目录，目录命名有如下规则：</p><ol><li>可用数字、中英文和可见字符的组合，长度最多为60。</li><li>用 / 分割路径，可快速创建子目录。</li><li>不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称。</li></ol>
     */
    public String getOutputCOSKeyPrefix() {
        return this.OutputCOSKeyPrefix;
    }

    /**
     * Set <p>指定日志在cos bucket中的目录，目录命名有如下规则：</p><ol><li>可用数字、中英文和可见字符的组合，长度最多为60。</li><li>用 / 分割路径，可快速创建子目录。</li><li>不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称。</li></ol>
     * @param OutputCOSKeyPrefix <p>指定日志在cos bucket中的目录，目录命名有如下规则：</p><ol><li>可用数字、中英文和可见字符的组合，长度最多为60。</li><li>用 / 分割路径，可快速创建子目录。</li><li>不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称。</li></ol>
     */
    public void setOutputCOSKeyPrefix(String OutputCOSKeyPrefix) {
        this.OutputCOSKeyPrefix = OutputCOSKeyPrefix;
    }

    public ModifyCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCommandRequest(ModifyCommandRequest source) {
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.CommandName != null) {
            this.CommandName = new String(source.CommandName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
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
        if (source.DefaultParameters != null) {
            this.DefaultParameters = new String(source.DefaultParameters);
        }
        if (source.DefaultParameterConfs != null) {
            this.DefaultParameterConfs = new DefaultParameterConf[source.DefaultParameterConfs.length];
            for (int i = 0; i < source.DefaultParameterConfs.length; i++) {
                this.DefaultParameterConfs[i] = new DefaultParameterConf(source.DefaultParameterConfs[i]);
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
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "CommandName", this.CommandName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CommandType", this.CommandType);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "DefaultParameters", this.DefaultParameters);
        this.setParamArrayObj(map, prefix + "DefaultParameterConfs.", this.DefaultParameterConfs);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

