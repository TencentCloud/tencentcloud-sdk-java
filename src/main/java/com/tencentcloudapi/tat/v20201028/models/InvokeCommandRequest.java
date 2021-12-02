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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeCommandRequest extends AbstractModel{

    /**
    * 待触发的命令ID。
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * 待执行命令的实例ID列表，上限100。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Command 的自定义参数。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 Command 的 DefaultParameters 进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * 在 CVM 或 Lighthouse 实例中执行命令的用户名称。
使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。若不填，默认以 Command 配置的 Username 执行。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 命令执行路径, 默认以Command配置的WorkingDirectory执行。
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * 命令超时时间，取值范围[1, 86400]。默认以Command配置的Timeout执行。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 指定日志上传的cos bucket 地址，必须以https开头，如 https://BucketName-123454321.cos.ap-beijing.myqcloud.com。
    */
    @SerializedName("OutputCOSBucketUrl")
    @Expose
    private String OutputCOSBucketUrl;

    /**
    * 指定日志在cos bucket中的目录，目录命名有如下规则：
1. 可用数字、中英文和可见字符的组合，长度最多为60。
2. 用 / 分割路径，可快速创建子目录。
3. 不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称。
    */
    @SerializedName("OutputCOSKeyPrefix")
    @Expose
    private String OutputCOSKeyPrefix;

    /**
     * Get 待触发的命令ID。 
     * @return CommandId 待触发的命令ID。
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set 待触发的命令ID。
     * @param CommandId 待触发的命令ID。
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get 待执行命令的实例ID列表，上限100。 
     * @return InstanceIds 待执行命令的实例ID列表，上限100。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 待执行命令的实例ID列表，上限100。
     * @param InstanceIds 待执行命令的实例ID列表，上限100。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Command 的自定义参数。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 Command 的 DefaultParameters 进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。 
     * @return Parameters Command 的自定义参数。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 Command 的 DefaultParameters 进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set Command 的自定义参数。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 Command 的 DefaultParameters 进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
     * @param Parameters Command 的自定义参数。字段类型为json encoded string。如：{\"varA\": \"222\"}。
key为自定义参数名称，value为该参数的默认取值。kv均为字符串型。
如果未提供该参数取值，将使用 Command 的 DefaultParameters 进行替换。
自定义参数最多20个。
自定义参数名称需符合以下规范：字符数目上限64，可选范围【a-zA-Z0-9-_】。
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 在 CVM 或 Lighthouse 实例中执行命令的用户名称。
使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。若不填，默认以 Command 配置的 Username 执行。 
     * @return Username 在 CVM 或 Lighthouse 实例中执行命令的用户名称。
使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。若不填，默认以 Command 配置的 Username 执行。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 在 CVM 或 Lighthouse 实例中执行命令的用户名称。
使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。若不填，默认以 Command 配置的 Username 执行。
     * @param Username 在 CVM 或 Lighthouse 实例中执行命令的用户名称。
使用最小权限执行命令是权限管理的最佳实践，建议您以普通用户身份执行云助手命令。若不填，默认以 Command 配置的 Username 执行。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 命令执行路径, 默认以Command配置的WorkingDirectory执行。 
     * @return WorkingDirectory 命令执行路径, 默认以Command配置的WorkingDirectory执行。
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set 命令执行路径, 默认以Command配置的WorkingDirectory执行。
     * @param WorkingDirectory 命令执行路径, 默认以Command配置的WorkingDirectory执行。
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get 命令超时时间，取值范围[1, 86400]。默认以Command配置的Timeout执行。 
     * @return Timeout 命令超时时间，取值范围[1, 86400]。默认以Command配置的Timeout执行。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 命令超时时间，取值范围[1, 86400]。默认以Command配置的Timeout执行。
     * @param Timeout 命令超时时间，取值范围[1, 86400]。默认以Command配置的Timeout执行。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 指定日志上传的cos bucket 地址，必须以https开头，如 https://BucketName-123454321.cos.ap-beijing.myqcloud.com。 
     * @return OutputCOSBucketUrl 指定日志上传的cos bucket 地址，必须以https开头，如 https://BucketName-123454321.cos.ap-beijing.myqcloud.com。
     */
    public String getOutputCOSBucketUrl() {
        return this.OutputCOSBucketUrl;
    }

    /**
     * Set 指定日志上传的cos bucket 地址，必须以https开头，如 https://BucketName-123454321.cos.ap-beijing.myqcloud.com。
     * @param OutputCOSBucketUrl 指定日志上传的cos bucket 地址，必须以https开头，如 https://BucketName-123454321.cos.ap-beijing.myqcloud.com。
     */
    public void setOutputCOSBucketUrl(String OutputCOSBucketUrl) {
        this.OutputCOSBucketUrl = OutputCOSBucketUrl;
    }

    /**
     * Get 指定日志在cos bucket中的目录，目录命名有如下规则：
1. 可用数字、中英文和可见字符的组合，长度最多为60。
2. 用 / 分割路径，可快速创建子目录。
3. 不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称。 
     * @return OutputCOSKeyPrefix 指定日志在cos bucket中的目录，目录命名有如下规则：
1. 可用数字、中英文和可见字符的组合，长度最多为60。
2. 用 / 分割路径，可快速创建子目录。
3. 不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称。
     */
    public String getOutputCOSKeyPrefix() {
        return this.OutputCOSKeyPrefix;
    }

    /**
     * Set 指定日志在cos bucket中的目录，目录命名有如下规则：
1. 可用数字、中英文和可见字符的组合，长度最多为60。
2. 用 / 分割路径，可快速创建子目录。
3. 不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称。
     * @param OutputCOSKeyPrefix 指定日志在cos bucket中的目录，目录命名有如下规则：
1. 可用数字、中英文和可见字符的组合，长度最多为60。
2. 用 / 分割路径，可快速创建子目录。
3. 不允许连续 / ；不允许以 / 开头；不允许以..作为文件夹名称。
     */
    public void setOutputCOSKeyPrefix(String OutputCOSKeyPrefix) {
        this.OutputCOSKeyPrefix = OutputCOSKeyPrefix;
    }

    public InvokeCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeCommandRequest(InvokeCommandRequest source) {
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.WorkingDirectory != null) {
            this.WorkingDirectory = new String(source.WorkingDirectory);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
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
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

