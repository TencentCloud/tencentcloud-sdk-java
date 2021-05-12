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
1;订单正在使用。
2:订单未开始。
3:订单已经使用过，现在暂时未开始使用(该订单从其他服务转移而来)。
4:订单已过期。
5:订单已被退订。
6:定单已被转移到其他云存服务。
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
1;订单正在使用。
2:订单未开始。
3:订单已经使用过，现在暂时未开始使用(该订单从其他服务转移而来)。
4:订单已过期。
5:订单已被退订。
6:定单已被转移到其他云存服务。 
     * @return Status 定单服务状态
1;订单正在使用。
2:订单未开始。
3:订单已经使用过，现在暂时未开始使用(该订单从其他服务转移而来)。
4:订单已过期。
5:订单已被退订。
6:定单已被转移到其他云存服务。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 定单服务状态
1;订单正在使用。
2:订单未开始。
3:订单已经使用过，现在暂时未开始使用(该订单从其他服务转移而来)。
4:订单已过期。
5:订单已被退订。
6:定单已被转移到其他云存服务。
     * @param Status 定单服务状态
1;订单正在使用。
2:订单未开始。
3:订单已经使用过，现在暂时未开始使用(该订单从其他服务转移而来)。
4:订单已过期。
5:订单已被退订。
6:定单已被转移到其他云存服务。
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

    public StorageOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageOrder(StorageOrder source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
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

