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

public class OrderDetail extends AbstractModel {

    /**
    * <p>资源ID</p>
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
    * <p>计费项</p>
    */
    @SerializedName("InquireKey")
    @Expose
    private String InquireKey;

    /**
    * <p>订单状态</p><ul><li>1 正常</li><li>2 隔离期</li><li>3 已销毁</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>订单类型</p>
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
     * Get <p>资源ID</p> 
     * @return ResourceID <p>资源ID</p>
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set <p>资源ID</p>
     * @param ResourceID <p>资源ID</p>
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get <p>计费项</p> 
     * @return InquireKey <p>计费项</p>
     */
    public String getInquireKey() {
        return this.InquireKey;
    }

    /**
     * Set <p>计费项</p>
     * @param InquireKey <p>计费项</p>
     */
    public void setInquireKey(String InquireKey) {
        this.InquireKey = InquireKey;
    }

    /**
     * Get <p>订单状态</p><ul><li>1 正常</li><li>2 隔离期</li><li>3 已销毁</li></ul> 
     * @return Status <p>订单状态</p><ul><li>1 正常</li><li>2 隔离期</li><li>3 已销毁</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>订单状态</p><ul><li>1 正常</li><li>2 隔离期</li><li>3 已销毁</li></ul>
     * @param Status <p>订单状态</p><ul><li>1 正常</li><li>2 隔离期</li><li>3 已销毁</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>订单类型</p> 
     * @return SourceType <p>订单类型</p>
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>订单类型</p>
     * @param SourceType <p>订单类型</p>
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
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
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);
        this.setParamSimple(map, prefix + "InquireKey", this.InquireKey);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

