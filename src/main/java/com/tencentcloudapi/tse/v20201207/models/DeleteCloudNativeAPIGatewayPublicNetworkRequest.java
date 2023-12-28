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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCloudNativeAPIGatewayPublicNetworkRequest extends AbstractModel {

    /**
    * 云原生API网关实例ID。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 分组id，kong类型时必填
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 公网类型
- IPV4 （默认值）
- IPV6
    */
    @SerializedName("InternetAddressVersion")
    @Expose
    private String InternetAddressVersion;

    /**
    * 公网ip，存在多个公网时必填
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get 云原生API网关实例ID。 
     * @return GatewayId 云原生API网关实例ID。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 云原生API网关实例ID。
     * @param GatewayId 云原生API网关实例ID。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 分组id，kong类型时必填 
     * @return GroupId 分组id，kong类型时必填
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组id，kong类型时必填
     * @param GroupId 分组id，kong类型时必填
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 公网类型
- IPV4 （默认值）
- IPV6 
     * @return InternetAddressVersion 公网类型
- IPV4 （默认值）
- IPV6
     */
    public String getInternetAddressVersion() {
        return this.InternetAddressVersion;
    }

    /**
     * Set 公网类型
- IPV4 （默认值）
- IPV6
     * @param InternetAddressVersion 公网类型
- IPV4 （默认值）
- IPV6
     */
    public void setInternetAddressVersion(String InternetAddressVersion) {
        this.InternetAddressVersion = InternetAddressVersion;
    }

    /**
     * Get 公网ip，存在多个公网时必填 
     * @return Vip 公网ip，存在多个公网时必填
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 公网ip，存在多个公网时必填
     * @param Vip 公网ip，存在多个公网时必填
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public DeleteCloudNativeAPIGatewayPublicNetworkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudNativeAPIGatewayPublicNetworkRequest(DeleteCloudNativeAPIGatewayPublicNetworkRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.InternetAddressVersion != null) {
            this.InternetAddressVersion = new String(source.InternetAddressVersion);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "InternetAddressVersion", this.InternetAddressVersion);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

