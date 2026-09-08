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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancesAttributeRequest extends AbstractModel {

    /**
    * <p>一个或多个待操作的实例ID。可通过<a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> API返回值中的<code>InstanceId</code>获取。每次请求允许操作的实例数量上限是100。</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>修改后实例名称。可任意命名，但不得超过60个字符。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16 KB。关于获取此参数的详细介绍，请参阅 <a href="https://cloud.tencent.com/document/product/213/17526">Windows</a> 和 <a href="https://cloud.tencent.com/document/product/213/17525">Linux</a> 启动时运行命令。</p>
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * <p>指定实例的修改后的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。</p>
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * <p>给实例绑定用户角色，传空值为解绑操作</p>
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * <p>修改后实例的主机名。<li>点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li><li>Windows 实例：主机名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。</li><li>其他类型（Linux 等）实例：主机名字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li>注意点：修改主机名后实例会立即重启，重启后新的主机名生效。</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<li>true：表示开启实例保护，不允许通过api接口删除实例</li><li>false：表示关闭实例保护，允许通过api接口删除实例</li>默认取值：false。</p>
    */
    @SerializedName("DisableApiTermination")
    @Expose
    private Boolean DisableApiTermination;

    /**
    * <p>角色类别，与CamRoleName搭配使用，该值可从CAM <a href="https://cloud.tencent.com/document/product/598/36223"> DescribeRoleList </a>或<a href="https://cloud.tencent.com/document/product/598/36221"> GetRole </a>接口返回RoleType字段获取，当前只接受user、system和service_linked三种类别。<br>举例：一般CamRoleName中包含“LinkedRoleIn”（如TKE_QCSLinkedRoleInPrometheusService）时，DescribeRoleList和GetRole返回的RoleType为service_linked，则本参数也需要传递service_linked。<br>该参数默认值为user，若CameRoleName为非service_linked类型，本参数可不传递。</p>
    */
    @SerializedName("CamRoleType")
    @Expose
    private String CamRoleType;

    /**
    * <p>修改实例主机名是否自动重启实例，不传默认自动重启。</p><ul><li>true: 修改主机名，并自动重启实例；</li><li>false: 修改主机名，不自动重启实例，需要手动重启使新主机名生效。<br>注意点：本参数仅对修改主机名生效。</li></ul>
    */
    @SerializedName("AutoReboot")
    @Expose
    private Boolean AutoReboot;

    /**
    * <p>实例是否开启巨型帧，取值范围：<br></p><ul><li>true：表示实例开启巨型帧，只有支持巨型帧的机型可设置为true。</li><li>false：表示实例关闭巨型帧，只有支持巨型帧的机型可设置为false。<br><br>支持巨型帧的实例规格： <a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a></li></ul>
    */
    @SerializedName("EnableJumboFrame")
    @Expose
    private Boolean EnableJumboFrame;

    /**
     * Get <p>一个或多个待操作的实例ID。可通过<a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> API返回值中的<code>InstanceId</code>获取。每次请求允许操作的实例数量上限是100。</p> 
     * @return InstanceIds <p>一个或多个待操作的实例ID。可通过<a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> API返回值中的<code>InstanceId</code>获取。每次请求允许操作的实例数量上限是100。</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>一个或多个待操作的实例ID。可通过<a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> API返回值中的<code>InstanceId</code>获取。每次请求允许操作的实例数量上限是100。</p>
     * @param InstanceIds <p>一个或多个待操作的实例ID。可通过<a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> API返回值中的<code>InstanceId</code>获取。每次请求允许操作的实例数量上限是100。</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>修改后实例名称。可任意命名，但不得超过60个字符。</p> 
     * @return InstanceName <p>修改后实例名称。可任意命名，但不得超过60个字符。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>修改后实例名称。可任意命名，但不得超过60个字符。</p>
     * @param InstanceName <p>修改后实例名称。可任意命名，但不得超过60个字符。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16 KB。关于获取此参数的详细介绍，请参阅 <a href="https://cloud.tencent.com/document/product/213/17526">Windows</a> 和 <a href="https://cloud.tencent.com/document/product/213/17525">Linux</a> 启动时运行命令。</p> 
     * @return UserData <p>提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16 KB。关于获取此参数的详细介绍，请参阅 <a href="https://cloud.tencent.com/document/product/213/17526">Windows</a> 和 <a href="https://cloud.tencent.com/document/product/213/17525">Linux</a> 启动时运行命令。</p>
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set <p>提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16 KB。关于获取此参数的详细介绍，请参阅 <a href="https://cloud.tencent.com/document/product/213/17526">Windows</a> 和 <a href="https://cloud.tencent.com/document/product/213/17525">Linux</a> 启动时运行命令。</p>
     * @param UserData <p>提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16 KB。关于获取此参数的详细介绍，请参阅 <a href="https://cloud.tencent.com/document/product/213/17526">Windows</a> 和 <a href="https://cloud.tencent.com/document/product/213/17525">Linux</a> 启动时运行命令。</p>
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get <p>指定实例的修改后的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。</p> 
     * @return SecurityGroups <p>指定实例的修改后的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。</p>
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set <p>指定实例的修改后的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。</p>
     * @param SecurityGroups <p>指定实例的修改后的安全组Id列表，子机将重新关联指定列表的安全组，原本关联的安全组会被解绑。</p>
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get <p>给实例绑定用户角色，传空值为解绑操作</p> 
     * @return CamRoleName <p>给实例绑定用户角色，传空值为解绑操作</p>
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * Set <p>给实例绑定用户角色，传空值为解绑操作</p>
     * @param CamRoleName <p>给实例绑定用户角色，传空值为解绑操作</p>
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
    }

    /**
     * Get <p>修改后实例的主机名。<li>点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li><li>Windows 实例：主机名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。</li><li>其他类型（Linux 等）实例：主机名字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li>注意点：修改主机名后实例会立即重启，重启后新的主机名生效。</p> 
     * @return HostName <p>修改后实例的主机名。<li>点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li><li>Windows 实例：主机名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。</li><li>其他类型（Linux 等）实例：主机名字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li>注意点：修改主机名后实例会立即重启，重启后新的主机名生效。</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>修改后实例的主机名。<li>点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li><li>Windows 实例：主机名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。</li><li>其他类型（Linux 等）实例：主机名字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li>注意点：修改主机名后实例会立即重启，重启后新的主机名生效。</p>
     * @param HostName <p>修改后实例的主机名。<li>点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li><li>Windows 实例：主机名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。</li><li>其他类型（Linux 等）实例：主机名字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li>注意点：修改主机名后实例会立即重启，重启后新的主机名生效。</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<li>true：表示开启实例保护，不允许通过api接口删除实例</li><li>false：表示关闭实例保护，允许通过api接口删除实例</li>默认取值：false。</p> 
     * @return DisableApiTermination <p>实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<li>true：表示开启实例保护，不允许通过api接口删除实例</li><li>false：表示关闭实例保护，允许通过api接口删除实例</li>默认取值：false。</p>
     */
    public Boolean getDisableApiTermination() {
        return this.DisableApiTermination;
    }

    /**
     * Set <p>实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<li>true：表示开启实例保护，不允许通过api接口删除实例</li><li>false：表示关闭实例保护，允许通过api接口删除实例</li>默认取值：false。</p>
     * @param DisableApiTermination <p>实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<li>true：表示开启实例保护，不允许通过api接口删除实例</li><li>false：表示关闭实例保护，允许通过api接口删除实例</li>默认取值：false。</p>
     */
    public void setDisableApiTermination(Boolean DisableApiTermination) {
        this.DisableApiTermination = DisableApiTermination;
    }

    /**
     * Get <p>角色类别，与CamRoleName搭配使用，该值可从CAM <a href="https://cloud.tencent.com/document/product/598/36223"> DescribeRoleList </a>或<a href="https://cloud.tencent.com/document/product/598/36221"> GetRole </a>接口返回RoleType字段获取，当前只接受user、system和service_linked三种类别。<br>举例：一般CamRoleName中包含“LinkedRoleIn”（如TKE_QCSLinkedRoleInPrometheusService）时，DescribeRoleList和GetRole返回的RoleType为service_linked，则本参数也需要传递service_linked。<br>该参数默认值为user，若CameRoleName为非service_linked类型，本参数可不传递。</p> 
     * @return CamRoleType <p>角色类别，与CamRoleName搭配使用，该值可从CAM <a href="https://cloud.tencent.com/document/product/598/36223"> DescribeRoleList </a>或<a href="https://cloud.tencent.com/document/product/598/36221"> GetRole </a>接口返回RoleType字段获取，当前只接受user、system和service_linked三种类别。<br>举例：一般CamRoleName中包含“LinkedRoleIn”（如TKE_QCSLinkedRoleInPrometheusService）时，DescribeRoleList和GetRole返回的RoleType为service_linked，则本参数也需要传递service_linked。<br>该参数默认值为user，若CameRoleName为非service_linked类型，本参数可不传递。</p>
     */
    public String getCamRoleType() {
        return this.CamRoleType;
    }

    /**
     * Set <p>角色类别，与CamRoleName搭配使用，该值可从CAM <a href="https://cloud.tencent.com/document/product/598/36223"> DescribeRoleList </a>或<a href="https://cloud.tencent.com/document/product/598/36221"> GetRole </a>接口返回RoleType字段获取，当前只接受user、system和service_linked三种类别。<br>举例：一般CamRoleName中包含“LinkedRoleIn”（如TKE_QCSLinkedRoleInPrometheusService）时，DescribeRoleList和GetRole返回的RoleType为service_linked，则本参数也需要传递service_linked。<br>该参数默认值为user，若CameRoleName为非service_linked类型，本参数可不传递。</p>
     * @param CamRoleType <p>角色类别，与CamRoleName搭配使用，该值可从CAM <a href="https://cloud.tencent.com/document/product/598/36223"> DescribeRoleList </a>或<a href="https://cloud.tencent.com/document/product/598/36221"> GetRole </a>接口返回RoleType字段获取，当前只接受user、system和service_linked三种类别。<br>举例：一般CamRoleName中包含“LinkedRoleIn”（如TKE_QCSLinkedRoleInPrometheusService）时，DescribeRoleList和GetRole返回的RoleType为service_linked，则本参数也需要传递service_linked。<br>该参数默认值为user，若CameRoleName为非service_linked类型，本参数可不传递。</p>
     */
    public void setCamRoleType(String CamRoleType) {
        this.CamRoleType = CamRoleType;
    }

    /**
     * Get <p>修改实例主机名是否自动重启实例，不传默认自动重启。</p><ul><li>true: 修改主机名，并自动重启实例；</li><li>false: 修改主机名，不自动重启实例，需要手动重启使新主机名生效。<br>注意点：本参数仅对修改主机名生效。</li></ul> 
     * @return AutoReboot <p>修改实例主机名是否自动重启实例，不传默认自动重启。</p><ul><li>true: 修改主机名，并自动重启实例；</li><li>false: 修改主机名，不自动重启实例，需要手动重启使新主机名生效。<br>注意点：本参数仅对修改主机名生效。</li></ul>
     */
    public Boolean getAutoReboot() {
        return this.AutoReboot;
    }

    /**
     * Set <p>修改实例主机名是否自动重启实例，不传默认自动重启。</p><ul><li>true: 修改主机名，并自动重启实例；</li><li>false: 修改主机名，不自动重启实例，需要手动重启使新主机名生效。<br>注意点：本参数仅对修改主机名生效。</li></ul>
     * @param AutoReboot <p>修改实例主机名是否自动重启实例，不传默认自动重启。</p><ul><li>true: 修改主机名，并自动重启实例；</li><li>false: 修改主机名，不自动重启实例，需要手动重启使新主机名生效。<br>注意点：本参数仅对修改主机名生效。</li></ul>
     */
    public void setAutoReboot(Boolean AutoReboot) {
        this.AutoReboot = AutoReboot;
    }

    /**
     * Get <p>实例是否开启巨型帧，取值范围：<br></p><ul><li>true：表示实例开启巨型帧，只有支持巨型帧的机型可设置为true。</li><li>false：表示实例关闭巨型帧，只有支持巨型帧的机型可设置为false。<br><br>支持巨型帧的实例规格： <a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a></li></ul> 
     * @return EnableJumboFrame <p>实例是否开启巨型帧，取值范围：<br></p><ul><li>true：表示实例开启巨型帧，只有支持巨型帧的机型可设置为true。</li><li>false：表示实例关闭巨型帧，只有支持巨型帧的机型可设置为false。<br><br>支持巨型帧的实例规格： <a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a></li></ul>
     */
    public Boolean getEnableJumboFrame() {
        return this.EnableJumboFrame;
    }

    /**
     * Set <p>实例是否开启巨型帧，取值范围：<br></p><ul><li>true：表示实例开启巨型帧，只有支持巨型帧的机型可设置为true。</li><li>false：表示实例关闭巨型帧，只有支持巨型帧的机型可设置为false。<br><br>支持巨型帧的实例规格： <a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a></li></ul>
     * @param EnableJumboFrame <p>实例是否开启巨型帧，取值范围：<br></p><ul><li>true：表示实例开启巨型帧，只有支持巨型帧的机型可设置为true。</li><li>false：表示实例关闭巨型帧，只有支持巨型帧的机型可设置为false。<br><br>支持巨型帧的实例规格： <a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a></li></ul>
     */
    public void setEnableJumboFrame(Boolean EnableJumboFrame) {
        this.EnableJumboFrame = EnableJumboFrame;
    }

    public ModifyInstancesAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancesAttributeRequest(ModifyInstancesAttributeRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.DisableApiTermination != null) {
            this.DisableApiTermination = new Boolean(source.DisableApiTermination);
        }
        if (source.CamRoleType != null) {
            this.CamRoleType = new String(source.CamRoleType);
        }
        if (source.AutoReboot != null) {
            this.AutoReboot = new Boolean(source.AutoReboot);
        }
        if (source.EnableJumboFrame != null) {
            this.EnableJumboFrame = new Boolean(source.EnableJumboFrame);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "DisableApiTermination", this.DisableApiTermination);
        this.setParamSimple(map, prefix + "CamRoleType", this.CamRoleType);
        this.setParamSimple(map, prefix + "AutoReboot", this.AutoReboot);
        this.setParamSimple(map, prefix + "EnableJumboFrame", this.EnableJumboFrame);

    }
}

