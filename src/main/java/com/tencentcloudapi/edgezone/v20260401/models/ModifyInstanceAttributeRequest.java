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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceAttributeRequest extends AbstractModel {

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 新的实例名称，1-60字符。与 NewPublicIp 至少传入一个。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 新的公网IP（需从该实例所绑定公网实例的可用IP中选择）。与 InstanceName 至少传入一个。
    */
    @SerializedName("NewPublicIp")
    @Expose
    private String NewPublicIp;

    /**
    * IP类型，ipv4 或 ipv6，默认 ipv4。仅在指定 NewPublicIp 时有效。
    */
    @SerializedName("IpType")
    @Expose
    private String IpType;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 新的实例名称，1-60字符。与 NewPublicIp 至少传入一个。 
     * @return InstanceName 新的实例名称，1-60字符。与 NewPublicIp 至少传入一个。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 新的实例名称，1-60字符。与 NewPublicIp 至少传入一个。
     * @param InstanceName 新的实例名称，1-60字符。与 NewPublicIp 至少传入一个。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 新的公网IP（需从该实例所绑定公网实例的可用IP中选择）。与 InstanceName 至少传入一个。 
     * @return NewPublicIp 新的公网IP（需从该实例所绑定公网实例的可用IP中选择）。与 InstanceName 至少传入一个。
     * @deprecated
     */
    @Deprecated
    public String getNewPublicIp() {
        return this.NewPublicIp;
    }

    /**
     * Set 新的公网IP（需从该实例所绑定公网实例的可用IP中选择）。与 InstanceName 至少传入一个。
     * @param NewPublicIp 新的公网IP（需从该实例所绑定公网实例的可用IP中选择）。与 InstanceName 至少传入一个。
     * @deprecated
     */
    @Deprecated
    public void setNewPublicIp(String NewPublicIp) {
        this.NewPublicIp = NewPublicIp;
    }

    /**
     * Get IP类型，ipv4 或 ipv6，默认 ipv4。仅在指定 NewPublicIp 时有效。 
     * @return IpType IP类型，ipv4 或 ipv6，默认 ipv4。仅在指定 NewPublicIp 时有效。
     * @deprecated
     */
    @Deprecated
    public String getIpType() {
        return this.IpType;
    }

    /**
     * Set IP类型，ipv4 或 ipv6，默认 ipv4。仅在指定 NewPublicIp 时有效。
     * @param IpType IP类型，ipv4 或 ipv6，默认 ipv4。仅在指定 NewPublicIp 时有效。
     * @deprecated
     */
    @Deprecated
    public void setIpType(String IpType) {
        this.IpType = IpType;
    }

    public ModifyInstanceAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceAttributeRequest(ModifyInstanceAttributeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.NewPublicIp != null) {
            this.NewPublicIp = new String(source.NewPublicIp);
        }
        if (source.IpType != null) {
            this.IpType = new String(source.IpType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NewPublicIp", this.NewPublicIp);
        this.setParamSimple(map, prefix + "IpType", this.IpType);

    }
}

