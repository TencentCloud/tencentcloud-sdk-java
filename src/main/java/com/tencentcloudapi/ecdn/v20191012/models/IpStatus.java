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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpStatus extends AbstractModel {

    /**
    * 节点 IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 节点所属区域
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
    * 节点所属运营商
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * 节点所在城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 节点状态
online：上线状态，正常调度服务中
offline：下线状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 节点 IP 添加时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 节点 IP 
     * @return Ip 节点 IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 节点 IP
     * @param Ip 节点 IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 节点所属区域 
     * @return District 节点所属区域
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set 节点所属区域
     * @param District 节点所属区域
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Get 节点所属运营商 
     * @return Isp 节点所属运营商
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 节点所属运营商
     * @param Isp 节点所属运营商
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 节点所在城市 
     * @return City 节点所在城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 节点所在城市
     * @param City 节点所在城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 节点状态
online：上线状态，正常调度服务中
offline：下线状态 
     * @return Status 节点状态
online：上线状态，正常调度服务中
offline：下线状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态
online：上线状态，正常调度服务中
offline：下线状态
     * @param Status 节点状态
online：上线状态，正常调度服务中
offline：下线状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 节点 IP 添加时间 
     * @return CreateTime 节点 IP 添加时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 节点 IP 添加时间
     * @param CreateTime 节点 IP 添加时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public IpStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpStatus(IpStatus source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.District != null) {
            this.District = new String(source.District);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

