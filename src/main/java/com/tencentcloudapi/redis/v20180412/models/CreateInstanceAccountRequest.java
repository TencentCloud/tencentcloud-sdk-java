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
    * 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 自定义的访问数据库的账号名称。
- 仅由字母、数字、下划线、中划线组成。
- 长度不能大于32位。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 设置自定义账号的密码。密码复杂度要求如下：
- 字符个数为[8,64]。
- 至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的两种。
- 不能以"/"开头。

    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * 指定账号的读请求路由分发至主节点或副本节点。未开启副本只读，不支持选择副本节点。
- master：主节点
- replication：副本节点
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * 账户读写权限，支持选择只读与读写权限。
- r：只读
- rw: 读写权限
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * 子账号描述信息，长度[0,64] 字节，支持中文。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。 
     * @return InstanceId 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     * @param InstanceId 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 自定义的访问数据库的账号名称。
- 仅由字母、数字、下划线、中划线组成。
- 长度不能大于32位。 
     * @return AccountName 自定义的访问数据库的账号名称。
- 仅由字母、数字、下划线、中划线组成。
- 长度不能大于32位。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 自定义的访问数据库的账号名称。
- 仅由字母、数字、下划线、中划线组成。
- 长度不能大于32位。
     * @param AccountName 自定义的访问数据库的账号名称。
- 仅由字母、数字、下划线、中划线组成。
- 长度不能大于32位。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 设置自定义账号的密码。密码复杂度要求如下：
- 字符个数为[8,64]。
- 至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的两种。
- 不能以"/"开头。
 
     * @return AccountPassword 设置自定义账号的密码。密码复杂度要求如下：
- 字符个数为[8,64]。
- 至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的两种。
- 不能以"/"开头。

     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set 设置自定义账号的密码。密码复杂度要求如下：
- 字符个数为[8,64]。
- 至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的两种。
- 不能以"/"开头。

     * @param AccountPassword 设置自定义账号的密码。密码复杂度要求如下：
- 字符个数为[8,64]。
- 至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的两种。
- 不能以"/"开头。

     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get 指定账号的读请求路由分发至主节点或副本节点。未开启副本只读，不支持选择副本节点。
- master：主节点
- replication：副本节点 
     * @return ReadonlyPolicy 指定账号的读请求路由分发至主节点或副本节点。未开启副本只读，不支持选择副本节点。
- master：主节点
- replication：副本节点
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set 指定账号的读请求路由分发至主节点或副本节点。未开启副本只读，不支持选择副本节点。
- master：主节点
- replication：副本节点
     * @param ReadonlyPolicy 指定账号的读请求路由分发至主节点或副本节点。未开启副本只读，不支持选择副本节点。
- master：主节点
- replication：副本节点
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * Get 账户读写权限，支持选择只读与读写权限。
- r：只读
- rw: 读写权限 
     * @return Privilege 账户读写权限，支持选择只读与读写权限。
- r：只读
- rw: 读写权限
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 账户读写权限，支持选择只读与读写权限。
- r：只读
- rw: 读写权限
     * @param Privilege 账户读写权限，支持选择只读与读写权限。
- r：只读
- rw: 读写权限
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get 子账号描述信息，长度[0,64] 字节，支持中文。 
     * @return Remark 子账号描述信息，长度[0,64] 字节，支持中文。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 子账号描述信息，长度[0,64] 字节，支持中文。
     * @param Remark 子账号描述信息，长度[0,64] 字节，支持中文。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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

    }
}

