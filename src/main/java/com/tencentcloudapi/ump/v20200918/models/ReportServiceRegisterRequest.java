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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportServiceRegisterRequest extends AbstractModel{

    /**
    * 集团编码
    */
    @SerializedName("GroupCode")
    @Expose
    private String GroupCode;

    /**
    * 广场ID
    */
    @SerializedName("MallId")
    @Expose
    private Long MallId;

    /**
    * 服务上报当前的服务能力信息
    */
    @SerializedName("ServiceRegisterInfos")
    @Expose
    private ServiceRegisterInfo [] ServiceRegisterInfos;

    /**
    * 服务内网Ip
    */
    @SerializedName("ServerIp")
    @Expose
    private String ServerIp;

    /**
    * 上报服务所在服务器的唯一ID
    */
    @SerializedName("ServerNodeId")
    @Expose
    private String ServerNodeId;

    /**
    * 上报时间戳, 单位毫秒
    */
    @SerializedName("ReportTime")
    @Expose
    private Long ReportTime;

    /**
     * Get 集团编码 
     * @return GroupCode 集团编码
     */
    public String getGroupCode() {
        return this.GroupCode;
    }

    /**
     * Set 集团编码
     * @param GroupCode 集团编码
     */
    public void setGroupCode(String GroupCode) {
        this.GroupCode = GroupCode;
    }

    /**
     * Get 广场ID 
     * @return MallId 广场ID
     */
    public Long getMallId() {
        return this.MallId;
    }

    /**
     * Set 广场ID
     * @param MallId 广场ID
     */
    public void setMallId(Long MallId) {
        this.MallId = MallId;
    }

    /**
     * Get 服务上报当前的服务能力信息 
     * @return ServiceRegisterInfos 服务上报当前的服务能力信息
     */
    public ServiceRegisterInfo [] getServiceRegisterInfos() {
        return this.ServiceRegisterInfos;
    }

    /**
     * Set 服务上报当前的服务能力信息
     * @param ServiceRegisterInfos 服务上报当前的服务能力信息
     */
    public void setServiceRegisterInfos(ServiceRegisterInfo [] ServiceRegisterInfos) {
        this.ServiceRegisterInfos = ServiceRegisterInfos;
    }

    /**
     * Get 服务内网Ip 
     * @return ServerIp 服务内网Ip
     */
    public String getServerIp() {
        return this.ServerIp;
    }

    /**
     * Set 服务内网Ip
     * @param ServerIp 服务内网Ip
     */
    public void setServerIp(String ServerIp) {
        this.ServerIp = ServerIp;
    }

    /**
     * Get 上报服务所在服务器的唯一ID 
     * @return ServerNodeId 上报服务所在服务器的唯一ID
     */
    public String getServerNodeId() {
        return this.ServerNodeId;
    }

    /**
     * Set 上报服务所在服务器的唯一ID
     * @param ServerNodeId 上报服务所在服务器的唯一ID
     */
    public void setServerNodeId(String ServerNodeId) {
        this.ServerNodeId = ServerNodeId;
    }

    /**
     * Get 上报时间戳, 单位毫秒 
     * @return ReportTime 上报时间戳, 单位毫秒
     */
    public Long getReportTime() {
        return this.ReportTime;
    }

    /**
     * Set 上报时间戳, 单位毫秒
     * @param ReportTime 上报时间戳, 单位毫秒
     */
    public void setReportTime(Long ReportTime) {
        this.ReportTime = ReportTime;
    }

    public ReportServiceRegisterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportServiceRegisterRequest(ReportServiceRegisterRequest source) {
        if (source.GroupCode != null) {
            this.GroupCode = new String(source.GroupCode);
        }
        if (source.MallId != null) {
            this.MallId = new Long(source.MallId);
        }
        if (source.ServiceRegisterInfos != null) {
            this.ServiceRegisterInfos = new ServiceRegisterInfo[source.ServiceRegisterInfos.length];
            for (int i = 0; i < source.ServiceRegisterInfos.length; i++) {
                this.ServiceRegisterInfos[i] = new ServiceRegisterInfo(source.ServiceRegisterInfos[i]);
            }
        }
        if (source.ServerIp != null) {
            this.ServerIp = new String(source.ServerIp);
        }
        if (source.ServerNodeId != null) {
            this.ServerNodeId = new String(source.ServerNodeId);
        }
        if (source.ReportTime != null) {
            this.ReportTime = new Long(source.ReportTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupCode", this.GroupCode);
        this.setParamSimple(map, prefix + "MallId", this.MallId);
        this.setParamArrayObj(map, prefix + "ServiceRegisterInfos.", this.ServiceRegisterInfos);
        this.setParamSimple(map, prefix + "ServerIp", this.ServerIp);
        this.setParamSimple(map, prefix + "ServerNodeId", this.ServerNodeId);
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);

    }
}

