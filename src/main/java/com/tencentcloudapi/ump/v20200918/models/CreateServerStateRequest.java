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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServerStateRequest extends AbstractModel {

    /**
    * 集团编码
    */
    @SerializedName("GroupCode")
    @Expose
    private String GroupCode;

    /**
    * 服务器监控信息列表
    */
    @SerializedName("ServerStateItems")
    @Expose
    private ServerStateItem [] ServerStateItems;

    /**
    * 商场ID
    */
    @SerializedName("MallId")
    @Expose
    private Long MallId;

    /**
    * 服务器监控信息上报时间戳，单位毫秒
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
     * Get 服务器监控信息列表 
     * @return ServerStateItems 服务器监控信息列表
     */
    public ServerStateItem [] getServerStateItems() {
        return this.ServerStateItems;
    }

    /**
     * Set 服务器监控信息列表
     * @param ServerStateItems 服务器监控信息列表
     */
    public void setServerStateItems(ServerStateItem [] ServerStateItems) {
        this.ServerStateItems = ServerStateItems;
    }

    /**
     * Get 商场ID 
     * @return MallId 商场ID
     */
    public Long getMallId() {
        return this.MallId;
    }

    /**
     * Set 商场ID
     * @param MallId 商场ID
     */
    public void setMallId(Long MallId) {
        this.MallId = MallId;
    }

    /**
     * Get 服务器监控信息上报时间戳，单位毫秒 
     * @return ReportTime 服务器监控信息上报时间戳，单位毫秒
     */
    public Long getReportTime() {
        return this.ReportTime;
    }

    /**
     * Set 服务器监控信息上报时间戳，单位毫秒
     * @param ReportTime 服务器监控信息上报时间戳，单位毫秒
     */
    public void setReportTime(Long ReportTime) {
        this.ReportTime = ReportTime;
    }

    public CreateServerStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServerStateRequest(CreateServerStateRequest source) {
        if (source.GroupCode != null) {
            this.GroupCode = new String(source.GroupCode);
        }
        if (source.ServerStateItems != null) {
            this.ServerStateItems = new ServerStateItem[source.ServerStateItems.length];
            for (int i = 0; i < source.ServerStateItems.length; i++) {
                this.ServerStateItems[i] = new ServerStateItem(source.ServerStateItems[i]);
            }
        }
        if (source.MallId != null) {
            this.MallId = new Long(source.MallId);
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
        this.setParamArrayObj(map, prefix + "ServerStateItems.", this.ServerStateItems);
        this.setParamSimple(map, prefix + "MallId", this.MallId);
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);

    }
}

