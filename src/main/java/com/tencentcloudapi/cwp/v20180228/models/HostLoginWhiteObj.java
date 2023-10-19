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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostLoginWhiteObj extends AbstractModel {

    /**
    * 加白地域
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
    * 加白源IP，支持网段，多个IP以逗号隔开
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 加白用户名，多个用户名以逗号隔开
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 是否对全局生效, 1：全局有效 0: 仅针对单台主机'
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 白名单生效的机器信息列表
    */
    @SerializedName("HostInfos")
    @Expose
    private HostInfo [] HostInfos;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 加白地域 
     * @return Places 加白地域
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set 加白地域
     * @param Places 加白地域
     */
    public void setPlaces(Place [] Places) {
        this.Places = Places;
    }

    /**
     * Get 加白源IP，支持网段，多个IP以逗号隔开 
     * @return SrcIp 加白源IP，支持网段，多个IP以逗号隔开
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 加白源IP，支持网段，多个IP以逗号隔开
     * @param SrcIp 加白源IP，支持网段，多个IP以逗号隔开
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 加白用户名，多个用户名以逗号隔开 
     * @return UserName 加白用户名，多个用户名以逗号隔开
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 加白用户名，多个用户名以逗号隔开
     * @param UserName 加白用户名，多个用户名以逗号隔开
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 是否对全局生效, 1：全局有效 0: 仅针对单台主机' 
     * @return IsGlobal 是否对全局生效, 1：全局有效 0: 仅针对单台主机'
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否对全局生效, 1：全局有效 0: 仅针对单台主机'
     * @param IsGlobal 是否对全局生效, 1：全局有效 0: 仅针对单台主机'
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 白名单生效的机器信息列表 
     * @return HostInfos 白名单生效的机器信息列表
     */
    public HostInfo [] getHostInfos() {
        return this.HostInfos;
    }

    /**
     * Set 白名单生效的机器信息列表
     * @param HostInfos 白名单生效的机器信息列表
     */
    public void setHostInfos(HostInfo [] HostInfos) {
        this.HostInfos = HostInfos;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public HostLoginWhiteObj() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostLoginWhiteObj(HostLoginWhiteObj source) {
        if (source.Places != null) {
            this.Places = new Place[source.Places.length];
            for (int i = 0; i < source.Places.length; i++) {
                this.Places[i] = new Place(source.Places[i]);
            }
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.HostInfos != null) {
            this.HostInfos = new HostInfo[source.HostInfos.length];
            for (int i = 0; i < source.HostInfos.length; i++) {
                this.HostInfos[i] = new HostInfo(source.HostInfos[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Places.", this.Places);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamArrayObj(map, prefix + "HostInfos.", this.HostInfos);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

