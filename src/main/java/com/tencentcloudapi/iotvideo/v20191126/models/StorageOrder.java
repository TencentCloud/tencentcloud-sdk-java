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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageOrder extends AbstractModel{

    /**
    * 定单唯一性ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 云存套餐ID
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 定单服务状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 定单服务生效时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 定单服务失效时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 定单唯一性ID 
     * @return OrderId 定单唯一性ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 定单唯一性ID
     * @param OrderId 定单唯一性ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 云存套餐ID 
     * @return PkgId 云存套餐ID
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 云存套餐ID
     * @param PkgId 云存套餐ID
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 定单服务状态 
     * @return Status 定单服务状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 定单服务状态
     * @param Status 定单服务状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 定单服务生效时间 
     * @return StartTime 定单服务生效时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 定单服务生效时间
     * @param StartTime 定单服务生效时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 定单服务失效时间 
     * @return EndTime 定单服务失效时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 定单服务失效时间
     * @param EndTime 定单服务失效时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

