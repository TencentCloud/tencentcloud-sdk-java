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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddMemberInfo extends AbstractModel {

    /**
    * 团队成员 ID。
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * 团队成员备注。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 团队成员角色，不填则默认添加普通成员。可选值：
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
     * Get 团队成员 ID。 
     * @return MemberId 团队成员 ID。
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 团队成员 ID。
     * @param MemberId 团队成员 ID。
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 团队成员备注。 
     * @return Remark 团队成员备注。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 团队成员备注。
     * @param Remark 团队成员备注。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 团队成员角色，不填则默认添加普通成员。可选值：
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li> 
     * @return Role 团队成员角色，不填则默认添加普通成员。可选值：
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 团队成员角色，不填则默认添加普通成员。可选值：
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li>
     * @param Role 团队成员角色，不填则默认添加普通成员。可选值：
<li>Admin：团队管理员；</li>
<li>Member：普通成员。</li>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    public AddMemberInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddMemberInfo(AddMemberInfo source) {
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

