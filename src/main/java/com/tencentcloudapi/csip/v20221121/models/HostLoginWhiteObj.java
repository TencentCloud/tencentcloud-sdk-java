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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostLoginWhiteObj extends AbstractModel {

    /**
    * <p>加白地域</p>
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
    * <p>加白源IP，支持网段，多个IP以逗号隔开</p>
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * <p>加白用户名，多个用户名以逗号隔开</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>是否对全局生效, 1：全局有效 0: 仅针对单台主机&#39;</p>
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * <p>白名单生效的机器信息列表</p>
    */
    @SerializedName("HostInfos")
    @Expose
    private HostInfo [] HostInfos;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>加白地域</p> 
     * @return Places <p>加白地域</p>
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set <p>加白地域</p>
     * @param Places <p>加白地域</p>
     */
    public void setPlaces(Place [] Places) {
        this.Places = Places;
    }

    /**
     * Get <p>加白源IP，支持网段，多个IP以逗号隔开</p> 
     * @return SrcIp <p>加白源IP，支持网段，多个IP以逗号隔开</p>
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set <p>加白源IP，支持网段，多个IP以逗号隔开</p>
     * @param SrcIp <p>加白源IP，支持网段，多个IP以逗号隔开</p>
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get <p>加白用户名，多个用户名以逗号隔开</p> 
     * @return UserName <p>加白用户名，多个用户名以逗号隔开</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>加白用户名，多个用户名以逗号隔开</p>
     * @param UserName <p>加白用户名，多个用户名以逗号隔开</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>是否对全局生效, 1：全局有效 0: 仅针对单台主机&#39;</p> 
     * @return IsGlobal <p>是否对全局生效, 1：全局有效 0: 仅针对单台主机&#39;</p>
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set <p>是否对全局生效, 1：全局有效 0: 仅针对单台主机&#39;</p>
     * @param IsGlobal <p>是否对全局生效, 1：全局有效 0: 仅针对单台主机&#39;</p>
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get <p>白名单生效的机器信息列表</p> 
     * @return HostInfos <p>白名单生效的机器信息列表</p>
     */
    public HostInfo [] getHostInfos() {
        return this.HostInfos;
    }

    /**
     * Set <p>白名单生效的机器信息列表</p>
     * @param HostInfos <p>白名单生效的机器信息列表</p>
     */
    public void setHostInfos(HostInfo [] HostInfos) {
        this.HostInfos = HostInfos;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
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

