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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCfsRuleRequest extends AbstractModel {

    /**
    * 权限组 ID，通过创建权限组接口或者创建权限组规则接口获取
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * 可以填写单个 IP 或者单个网段，例如 10.1.10.11 或者 10.10.1.0/24。默认来访地址为*表示允许所有。同时需要注意，此处需填写 CVM 的内网 IP。
    */
    @SerializedName("AuthClientIp")
    @Expose
    private String AuthClientIp;

    /**
    * 规则优先级，参数范围1-100。 其中 1 为最高，100为最低
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 读写权限, 值为 RO、RW；其中 RO 为只读，RW 为读写，不填默认为只读
    */
    @SerializedName("RWPermission")
    @Expose
    private String RWPermission;

    /**
    * 用户权限，值为 all_squash、no_all_squash、root_squash、no_root_squash。
all_squash：所有访问用户（含 root 用户）都会被映射为匿名用户或用户组。
no_all_squash：所有访问用户（含 root 用户）均保持原有的 UID/GID 信息。
root_squash：将来访的 root 用户映射为匿名用户或用户组，非 root 用户保持原有的 UID/GID 信息。
no_root_squash：与 no_all_squash 效果一致，所有访问用户（含 root 用户）均保持原有的 UID/GID 信息

    */
    @SerializedName("UserPermission")
    @Expose
    private String UserPermission;

    /**
     * Get 权限组 ID，通过创建权限组接口或者创建权限组规则接口获取 
     * @return PGroupId 权限组 ID，通过创建权限组接口或者创建权限组规则接口获取
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set 权限组 ID，通过创建权限组接口或者创建权限组规则接口获取
     * @param PGroupId 权限组 ID，通过创建权限组接口或者创建权限组规则接口获取
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get 可以填写单个 IP 或者单个网段，例如 10.1.10.11 或者 10.10.1.0/24。默认来访地址为*表示允许所有。同时需要注意，此处需填写 CVM 的内网 IP。 
     * @return AuthClientIp 可以填写单个 IP 或者单个网段，例如 10.1.10.11 或者 10.10.1.0/24。默认来访地址为*表示允许所有。同时需要注意，此处需填写 CVM 的内网 IP。
     */
    public String getAuthClientIp() {
        return this.AuthClientIp;
    }

    /**
     * Set 可以填写单个 IP 或者单个网段，例如 10.1.10.11 或者 10.10.1.0/24。默认来访地址为*表示允许所有。同时需要注意，此处需填写 CVM 的内网 IP。
     * @param AuthClientIp 可以填写单个 IP 或者单个网段，例如 10.1.10.11 或者 10.10.1.0/24。默认来访地址为*表示允许所有。同时需要注意，此处需填写 CVM 的内网 IP。
     */
    public void setAuthClientIp(String AuthClientIp) {
        this.AuthClientIp = AuthClientIp;
    }

    /**
     * Get 规则优先级，参数范围1-100。 其中 1 为最高，100为最低 
     * @return Priority 规则优先级，参数范围1-100。 其中 1 为最高，100为最低
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 规则优先级，参数范围1-100。 其中 1 为最高，100为最低
     * @param Priority 规则优先级，参数范围1-100。 其中 1 为最高，100为最低
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 读写权限, 值为 RO、RW；其中 RO 为只读，RW 为读写，不填默认为只读 
     * @return RWPermission 读写权限, 值为 RO、RW；其中 RO 为只读，RW 为读写，不填默认为只读
     */
    public String getRWPermission() {
        return this.RWPermission;
    }

    /**
     * Set 读写权限, 值为 RO、RW；其中 RO 为只读，RW 为读写，不填默认为只读
     * @param RWPermission 读写权限, 值为 RO、RW；其中 RO 为只读，RW 为读写，不填默认为只读
     */
    public void setRWPermission(String RWPermission) {
        this.RWPermission = RWPermission;
    }

    /**
     * Get 用户权限，值为 all_squash、no_all_squash、root_squash、no_root_squash。
all_squash：所有访问用户（含 root 用户）都会被映射为匿名用户或用户组。
no_all_squash：所有访问用户（含 root 用户）均保持原有的 UID/GID 信息。
root_squash：将来访的 root 用户映射为匿名用户或用户组，非 root 用户保持原有的 UID/GID 信息。
no_root_squash：与 no_all_squash 效果一致，所有访问用户（含 root 用户）均保持原有的 UID/GID 信息
 
     * @return UserPermission 用户权限，值为 all_squash、no_all_squash、root_squash、no_root_squash。
all_squash：所有访问用户（含 root 用户）都会被映射为匿名用户或用户组。
no_all_squash：所有访问用户（含 root 用户）均保持原有的 UID/GID 信息。
root_squash：将来访的 root 用户映射为匿名用户或用户组，非 root 用户保持原有的 UID/GID 信息。
no_root_squash：与 no_all_squash 效果一致，所有访问用户（含 root 用户）均保持原有的 UID/GID 信息

     */
    public String getUserPermission() {
        return this.UserPermission;
    }

    /**
     * Set 用户权限，值为 all_squash、no_all_squash、root_squash、no_root_squash。
all_squash：所有访问用户（含 root 用户）都会被映射为匿名用户或用户组。
no_all_squash：所有访问用户（含 root 用户）均保持原有的 UID/GID 信息。
root_squash：将来访的 root 用户映射为匿名用户或用户组，非 root 用户保持原有的 UID/GID 信息。
no_root_squash：与 no_all_squash 效果一致，所有访问用户（含 root 用户）均保持原有的 UID/GID 信息

     * @param UserPermission 用户权限，值为 all_squash、no_all_squash、root_squash、no_root_squash。
all_squash：所有访问用户（含 root 用户）都会被映射为匿名用户或用户组。
no_all_squash：所有访问用户（含 root 用户）均保持原有的 UID/GID 信息。
root_squash：将来访的 root 用户映射为匿名用户或用户组，非 root 用户保持原有的 UID/GID 信息。
no_root_squash：与 no_all_squash 效果一致，所有访问用户（含 root 用户）均保持原有的 UID/GID 信息

     */
    public void setUserPermission(String UserPermission) {
        this.UserPermission = UserPermission;
    }

    public CreateCfsRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCfsRuleRequest(CreateCfsRuleRequest source) {
        if (source.PGroupId != null) {
            this.PGroupId = new String(source.PGroupId);
        }
        if (source.AuthClientIp != null) {
            this.AuthClientIp = new String(source.AuthClientIp);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.RWPermission != null) {
            this.RWPermission = new String(source.RWPermission);
        }
        if (source.UserPermission != null) {
            this.UserPermission = new String(source.UserPermission);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "AuthClientIp", this.AuthClientIp);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "RWPermission", this.RWPermission);
        this.setParamSimple(map, prefix + "UserPermission", this.UserPermission);

    }
}

