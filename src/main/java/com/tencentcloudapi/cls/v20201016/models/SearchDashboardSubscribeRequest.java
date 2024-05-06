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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchDashboardSubscribeRequest extends AbstractModel {

    /**
    * 仪表盘id。
    */
    @SerializedName("DashboardId")
    @Expose
    private String DashboardId;

    /**
    * 仪表盘订阅数据。
    */
    @SerializedName("SubscribeData")
    @Expose
    private DashboardSubscribeData SubscribeData;

    /**
    * 仪表盘订阅Id。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 仪表盘订阅名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 仪表盘id。 
     * @return DashboardId 仪表盘id。
     */
    public String getDashboardId() {
        return this.DashboardId;
    }

    /**
     * Set 仪表盘id。
     * @param DashboardId 仪表盘id。
     */
    public void setDashboardId(String DashboardId) {
        this.DashboardId = DashboardId;
    }

    /**
     * Get 仪表盘订阅数据。 
     * @return SubscribeData 仪表盘订阅数据。
     */
    public DashboardSubscribeData getSubscribeData() {
        return this.SubscribeData;
    }

    /**
     * Set 仪表盘订阅数据。
     * @param SubscribeData 仪表盘订阅数据。
     */
    public void setSubscribeData(DashboardSubscribeData SubscribeData) {
        this.SubscribeData = SubscribeData;
    }

    /**
     * Get 仪表盘订阅Id。 
     * @return Id 仪表盘订阅Id。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 仪表盘订阅Id。
     * @param Id 仪表盘订阅Id。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 仪表盘订阅名称。 
     * @return Name 仪表盘订阅名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 仪表盘订阅名称。
     * @param Name 仪表盘订阅名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public SearchDashboardSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchDashboardSubscribeRequest(SearchDashboardSubscribeRequest source) {
        if (source.DashboardId != null) {
            this.DashboardId = new String(source.DashboardId);
        }
        if (source.SubscribeData != null) {
            this.SubscribeData = new DashboardSubscribeData(source.SubscribeData);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DashboardId", this.DashboardId);
        this.setParamObj(map, prefix + "SubscribeData.", this.SubscribeData);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

