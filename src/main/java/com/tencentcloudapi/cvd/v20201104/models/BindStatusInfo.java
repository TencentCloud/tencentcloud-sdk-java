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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindStatusInfo extends AbstractModel {

    /**
    * <p>桌面实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例的绑定状态。取值：<br>UNBOUND - 未绑定<br>BINDING - 绑定中<br>BOUND - 绑定<br>UNBINDING-解绑中</p>
    */
    @SerializedName("BindStatus")
    @Expose
    private String BindStatus;

    /**
    * <p>绑定的用户id【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>绑定用户名称【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>绑定用户显示名称【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
     * Get <p>桌面实例id</p> 
     * @return InstanceId <p>桌面实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>桌面实例id</p>
     * @param InstanceId <p>桌面实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例的绑定状态。取值：<br>UNBOUND - 未绑定<br>BINDING - 绑定中<br>BOUND - 绑定<br>UNBINDING-解绑中</p> 
     * @return BindStatus <p>实例的绑定状态。取值：<br>UNBOUND - 未绑定<br>BINDING - 绑定中<br>BOUND - 绑定<br>UNBINDING-解绑中</p>
     */
    public String getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set <p>实例的绑定状态。取值：<br>UNBOUND - 未绑定<br>BINDING - 绑定中<br>BOUND - 绑定<br>UNBINDING-解绑中</p>
     * @param BindStatus <p>实例的绑定状态。取值：<br>UNBOUND - 未绑定<br>BINDING - 绑定中<br>BOUND - 绑定<br>UNBINDING-解绑中</p>
     */
    public void setBindStatus(String BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get <p>绑定的用户id【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId <p>绑定的用户id【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>绑定的用户id【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId <p>绑定的用户id【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>绑定用户名称【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName <p>绑定用户名称【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>绑定用户名称【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName <p>绑定用户名称【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>绑定用户显示名称【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName <p>绑定用户显示名称【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>绑定用户显示名称【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName <p>绑定用户显示名称【BOUND状态不允许为空】</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    public BindStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindStatusInfo(BindStatusInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new String(source.BindStatus);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);

    }
}

