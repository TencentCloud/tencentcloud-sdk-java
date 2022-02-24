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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SslVpnClient extends AbstractModel{

    /**
    * VPC实例ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * SSL-VPN-SERVER 实例ID
    */
    @SerializedName("SslVpnServerId")
    @Expose
    private String SslVpnServerId;

    /**
    * 证书状态. 
0:创建中
1:正常
2:已停用
3.已过期
4.创建出错
    */
    @SerializedName("CertStatus")
    @Expose
    private Long CertStatus;

    /**
    * SSL-VPN-CLIENT 实例ID
    */
    @SerializedName("SslVpnClientId")
    @Expose
    private String SslVpnClientId;

    /**
    * 证书开始时间
    */
    @SerializedName("CertBeginTime")
    @Expose
    private String CertBeginTime;

    /**
    * 证书到期时间
    */
    @SerializedName("CertEndTime")
    @Expose
    private String CertEndTime;

    /**
    * CLIENT NAME
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 创建CLIENT 状态。
0 创建中
1 创建出错
2 更新中
3 更新出错
4 销毁中
5 销毁出粗
6 已连通
7 未知
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get VPC实例ID 
     * @return VpcId VPC实例ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID
     * @param VpcId VPC实例ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get SSL-VPN-SERVER 实例ID 
     * @return SslVpnServerId SSL-VPN-SERVER 实例ID
     */
    public String getSslVpnServerId() {
        return this.SslVpnServerId;
    }

    /**
     * Set SSL-VPN-SERVER 实例ID
     * @param SslVpnServerId SSL-VPN-SERVER 实例ID
     */
    public void setSslVpnServerId(String SslVpnServerId) {
        this.SslVpnServerId = SslVpnServerId;
    }

    /**
     * Get 证书状态. 
0:创建中
1:正常
2:已停用
3.已过期
4.创建出错 
     * @return CertStatus 证书状态. 
0:创建中
1:正常
2:已停用
3.已过期
4.创建出错
     */
    public Long getCertStatus() {
        return this.CertStatus;
    }

    /**
     * Set 证书状态. 
0:创建中
1:正常
2:已停用
3.已过期
4.创建出错
     * @param CertStatus 证书状态. 
0:创建中
1:正常
2:已停用
3.已过期
4.创建出错
     */
    public void setCertStatus(Long CertStatus) {
        this.CertStatus = CertStatus;
    }

    /**
     * Get SSL-VPN-CLIENT 实例ID 
     * @return SslVpnClientId SSL-VPN-CLIENT 实例ID
     */
    public String getSslVpnClientId() {
        return this.SslVpnClientId;
    }

    /**
     * Set SSL-VPN-CLIENT 实例ID
     * @param SslVpnClientId SSL-VPN-CLIENT 实例ID
     */
    public void setSslVpnClientId(String SslVpnClientId) {
        this.SslVpnClientId = SslVpnClientId;
    }

    /**
     * Get 证书开始时间 
     * @return CertBeginTime 证书开始时间
     */
    public String getCertBeginTime() {
        return this.CertBeginTime;
    }

    /**
     * Set 证书开始时间
     * @param CertBeginTime 证书开始时间
     */
    public void setCertBeginTime(String CertBeginTime) {
        this.CertBeginTime = CertBeginTime;
    }

    /**
     * Get 证书到期时间 
     * @return CertEndTime 证书到期时间
     */
    public String getCertEndTime() {
        return this.CertEndTime;
    }

    /**
     * Set 证书到期时间
     * @param CertEndTime 证书到期时间
     */
    public void setCertEndTime(String CertEndTime) {
        this.CertEndTime = CertEndTime;
    }

    /**
     * Get CLIENT NAME 
     * @return Name CLIENT NAME
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set CLIENT NAME
     * @param Name CLIENT NAME
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 创建CLIENT 状态。
0 创建中
1 创建出错
2 更新中
3 更新出错
4 销毁中
5 销毁出粗
6 已连通
7 未知 
     * @return State 创建CLIENT 状态。
0 创建中
1 创建出错
2 更新中
3 更新出错
4 销毁中
5 销毁出粗
6 已连通
7 未知
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 创建CLIENT 状态。
0 创建中
1 创建出错
2 更新中
3 更新出错
4 销毁中
5 销毁出粗
6 已连通
7 未知
     * @param State 创建CLIENT 状态。
0 创建中
1 创建出错
2 更新中
3 更新出错
4 销毁中
5 销毁出粗
6 已连通
7 未知
     */
    public void setState(String State) {
        this.State = State;
    }

    public SslVpnClient() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SslVpnClient(SslVpnClient source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SslVpnServerId != null) {
            this.SslVpnServerId = new String(source.SslVpnServerId);
        }
        if (source.CertStatus != null) {
            this.CertStatus = new Long(source.CertStatus);
        }
        if (source.SslVpnClientId != null) {
            this.SslVpnClientId = new String(source.SslVpnClientId);
        }
        if (source.CertBeginTime != null) {
            this.CertBeginTime = new String(source.CertBeginTime);
        }
        if (source.CertEndTime != null) {
            this.CertEndTime = new String(source.CertEndTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SslVpnServerId", this.SslVpnServerId);
        this.setParamSimple(map, prefix + "CertStatus", this.CertStatus);
        this.setParamSimple(map, prefix + "SslVpnClientId", this.SslVpnClientId);
        this.setParamSimple(map, prefix + "CertBeginTime", this.CertBeginTime);
        this.setParamSimple(map, prefix + "CertEndTime", this.CertEndTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

