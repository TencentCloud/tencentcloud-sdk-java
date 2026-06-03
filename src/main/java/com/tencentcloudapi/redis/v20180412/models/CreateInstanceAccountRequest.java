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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceAccountRequest extends AbstractModel {

    /**
    * <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>自定义的访问数据库的账号名称。</p><ul><li>仅由字母、数字、下划线、中划线组成。</li><li>长度不能大于32位。</li></ul>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>设置自定义账号的密码。密码复杂度要求如下：</p><ul><li>字符个数为[8,64]。</li><li>至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的两种。</li><li>不能以&quot;/&quot;开头。</li></ul>
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * <p>指定账号的读请求路由分发至主节点或副本节点。未开启副本只读，不支持选择副本节点。</p><ul><li>master：主节点</li><li>replication：副本节点</li></ul>
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * <p>账户读写权限，支持选择只读与读写权限。</p><ul><li>r：只读。</li><li>rw: 读写。</li></ul>
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * <p>账号备注描述信息，长度为[0,64] 字节，支持中文。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>是否启用密码加密传输。</p><ul><li>true：加密。</li><li>false：不加密（默认值）。</li></ul>
    */
    @SerializedName("EncryptPassword")
    @Expose
    private Boolean EncryptPassword;

    /**
     * Get <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>自定义的访问数据库的账号名称。</p><ul><li>仅由字母、数字、下划线、中划线组成。</li><li>长度不能大于32位。</li></ul> 
     * @return AccountName <p>自定义的访问数据库的账号名称。</p><ul><li>仅由字母、数字、下划线、中划线组成。</li><li>长度不能大于32位。</li></ul>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>自定义的访问数据库的账号名称。</p><ul><li>仅由字母、数字、下划线、中划线组成。</li><li>长度不能大于32位。</li></ul>
     * @param AccountName <p>自定义的访问数据库的账号名称。</p><ul><li>仅由字母、数字、下划线、中划线组成。</li><li>长度不能大于32位。</li></ul>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>设置自定义账号的密码。密码复杂度要求如下：</p><ul><li>字符个数为[8,64]。</li><li>至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的两种。</li><li>不能以&quot;/&quot;开头。</li></ul> 
     * @return AccountPassword <p>设置自定义账号的密码。密码复杂度要求如下：</p><ul><li>字符个数为[8,64]。</li><li>至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的两种。</li><li>不能以&quot;/&quot;开头。</li></ul>
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set <p>设置自定义账号的密码。密码复杂度要求如下：</p><ul><li>字符个数为[8,64]。</li><li>至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的两种。</li><li>不能以&quot;/&quot;开头。</li></ul>
     * @param AccountPassword <p>设置自定义账号的密码。密码复杂度要求如下：</p><ul><li>字符个数为[8,64]。</li><li>至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的两种。</li><li>不能以&quot;/&quot;开头。</li></ul>
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get <p>指定账号的读请求路由分发至主节点或副本节点。未开启副本只读，不支持选择副本节点。</p><ul><li>master：主节点</li><li>replication：副本节点</li></ul> 
     * @return ReadonlyPolicy <p>指定账号的读请求路由分发至主节点或副本节点。未开启副本只读，不支持选择副本节点。</p><ul><li>master：主节点</li><li>replication：副本节点</li></ul>
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set <p>指定账号的读请求路由分发至主节点或副本节点。未开启副本只读，不支持选择副本节点。</p><ul><li>master：主节点</li><li>replication：副本节点</li></ul>
     * @param ReadonlyPolicy <p>指定账号的读请求路由分发至主节点或副本节点。未开启副本只读，不支持选择副本节点。</p><ul><li>master：主节点</li><li>replication：副本节点</li></ul>
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get <p>账户读写权限，支持选择只读与读写权限。</p><ul><li>r：只读。</li><li>rw: 读写。</li></ul> 
     * @return Privilege <p>账户读写权限，支持选择只读与读写权限。</p><ul><li>r：只读。</li><li>rw: 读写。</li></ul>
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set <p>账户读写权限，支持选择只读与读写权限。</p><ul><li>r：只读。</li><li>rw: 读写。</li></ul>
     * @param Privilege <p>账户读写权限，支持选择只读与读写权限。</p><ul><li>r：只读。</li><li>rw: 读写。</li></ul>
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get <p>账号备注描述信息，长度为[0,64] 字节，支持中文。</p> 
     * @return Remark <p>账号备注描述信息，长度为[0,64] 字节，支持中文。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>账号备注描述信息，长度为[0,64] 字节，支持中文。</p>
     * @param Remark <p>账号备注描述信息，长度为[0,64] 字节，支持中文。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>是否启用密码加密传输。</p><ul><li>true：加密。</li><li>false：不加密（默认值）。</li></ul> 
     * @return EncryptPassword <p>是否启用密码加密传输。</p><ul><li>true：加密。</li><li>false：不加密（默认值）。</li></ul>
     */
    public Boolean getEncryptPassword() {
        return this.EncryptPassword;
    }

    /**
     * Set <p>是否启用密码加密传输。</p><ul><li>true：加密。</li><li>false：不加密（默认值）。</li></ul>
     * @param EncryptPassword <p>是否启用密码加密传输。</p><ul><li>true：加密。</li><li>false：不加密（默认值）。</li></ul>
     */
    public void setEncryptPassword(Boolean EncryptPassword) {
        this.EncryptPassword = EncryptPassword;
    }

    public CreateInstanceAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceAccountRequest(CreateInstanceAccountRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AccountPassword != null) {
            this.AccountPassword = new String(source.AccountPassword);
        }
        if (source.ReadonlyPolicy != null) {
            this.ReadonlyPolicy = new String[source.ReadonlyPolicy.length];
            for (int i = 0; i < source.ReadonlyPolicy.length; i++) {
                this.ReadonlyPolicy[i] = new String(source.ReadonlyPolicy[i]);
            }
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.EncryptPassword != null) {
            this.EncryptPassword = new Boolean(source.EncryptPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AccountPassword", this.AccountPassword);
        this.setParamArraySimple(map, prefix + "ReadonlyPolicy.", this.ReadonlyPolicy);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "EncryptPassword", this.EncryptPassword);

    }
}

