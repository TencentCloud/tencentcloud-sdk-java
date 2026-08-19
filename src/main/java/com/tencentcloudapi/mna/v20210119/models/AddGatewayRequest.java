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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddGatewayRequest extends AbstractModel {

    /**
    * <p>集群 ID。可通过 GetCustomerGatewayClusterList 接口获取。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>网关登录用户名。最大 64 字符。</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>网关登录密码。最大 128 字符。</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>网关内网IP。</p>
    */
    @SerializedName("GatewayIp")
    @Expose
    private String GatewayIp;

    /**
    * <p>地域标识。最大 32 字符。例如 ap-guangzhou。可通过 DescribeAccessPointList 接口获取。</p>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
     * Get <p>集群 ID。可通过 GetCustomerGatewayClusterList 接口获取。</p> 
     * @return ClusterId <p>集群 ID。可通过 GetCustomerGatewayClusterList 接口获取。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID。可通过 GetCustomerGatewayClusterList 接口获取。</p>
     * @param ClusterId <p>集群 ID。可通过 GetCustomerGatewayClusterList 接口获取。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>网关登录用户名。最大 64 字符。</p> 
     * @return Username <p>网关登录用户名。最大 64 字符。</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>网关登录用户名。最大 64 字符。</p>
     * @param Username <p>网关登录用户名。最大 64 字符。</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>网关登录密码。最大 128 字符。</p> 
     * @return Password <p>网关登录密码。最大 128 字符。</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>网关登录密码。最大 128 字符。</p>
     * @param Password <p>网关登录密码。最大 128 字符。</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>网关内网IP。</p> 
     * @return GatewayIp <p>网关内网IP。</p>
     */
    public String getGatewayIp() {
        return this.GatewayIp;
    }

    /**
     * Set <p>网关内网IP。</p>
     * @param GatewayIp <p>网关内网IP。</p>
     */
    public void setGatewayIp(String GatewayIp) {
        this.GatewayIp = GatewayIp;
    }

    /**
     * Get <p>地域标识。最大 32 字符。例如 ap-guangzhou。可通过 DescribeAccessPointList 接口获取。</p> 
     * @return RegionId <p>地域标识。最大 32 字符。例如 ap-guangzhou。可通过 DescribeAccessPointList 接口获取。</p>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域标识。最大 32 字符。例如 ap-guangzhou。可通过 DescribeAccessPointList 接口获取。</p>
     * @param RegionId <p>地域标识。最大 32 字符。例如 ap-guangzhou。可通过 DescribeAccessPointList 接口获取。</p>
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    public AddGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddGatewayRequest(AddGatewayRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.GatewayIp != null) {
            this.GatewayIp = new String(source.GatewayIp);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "GatewayIp", this.GatewayIp);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

