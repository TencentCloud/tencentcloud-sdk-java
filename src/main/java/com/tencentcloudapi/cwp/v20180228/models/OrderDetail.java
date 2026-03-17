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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderDetail extends AbstractModel {

    /**
    * 资源ID
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
    * 计费项
    */
    @SerializedName("InquireKey")
    @Expose
    private String InquireKey;

    /**
    * 订单状态
- 1 正常
- 2 隔离期
- 3 已销毁
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 资源ID 
     * @return ResourceID 资源ID
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set 资源ID
     * @param ResourceID 资源ID
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get 计费项 
     * @return InquireKey 计费项
     */
    public String getInquireKey() {
        return this.InquireKey;
    }

    /**
     * Set 计费项
     * @param InquireKey 计费项
     */
    public void setInquireKey(String InquireKey) {
        this.InquireKey = InquireKey;
    }

    /**
     * Get 订单状态
- 1 正常
- 2 隔离期
- 3 已销毁 
     * @return Status 订单状态
- 1 正常
- 2 隔离期
- 3 已销毁
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 订单状态
- 1 正常
- 2 隔离期
- 3 已销毁
     * @param Status 订单状态
- 1 正常
- 2 隔离期
- 3 已销毁
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public OrderDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderDetail(OrderDetail source) {
        if (source.ResourceID != null) {
            this.ResourceID = new String(source.ResourceID);
        }
        if (source.InquireKey != null) {
            this.InquireKey = new String(source.InquireKey);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);
        this.setParamSimple(map, prefix + "InquireKey", this.InquireKey);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

