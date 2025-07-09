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

public class RiskCallRecord extends AbstractModel {

    /**
    * 接口名称
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 接口中文描述
    */
    @SerializedName("EventDescCN")
    @Expose
    private String EventDescCN;

    /**
    * 接口英文描述
    */
    @SerializedName("EventDescEN")
    @Expose
    private String EventDescEN;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品中文名称
    */
    @SerializedName("ProductNameCN")
    @Expose
    private String ProductNameCN;

    /**
    * 调用次数
    */
    @SerializedName("CallCount")
    @Expose
    private Long CallCount;

    /**
     * Get 接口名称 
     * @return EventName 接口名称
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 接口名称
     * @param EventName 接口名称
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 接口中文描述 
     * @return EventDescCN 接口中文描述
     */
    public String getEventDescCN() {
        return this.EventDescCN;
    }

    /**
     * Set 接口中文描述
     * @param EventDescCN 接口中文描述
     */
    public void setEventDescCN(String EventDescCN) {
        this.EventDescCN = EventDescCN;
    }

    /**
     * Get 接口英文描述 
     * @return EventDescEN 接口英文描述
     */
    public String getEventDescEN() {
        return this.EventDescEN;
    }

    /**
     * Set 接口英文描述
     * @param EventDescEN 接口英文描述
     */
    public void setEventDescEN(String EventDescEN) {
        this.EventDescEN = EventDescEN;
    }

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 产品中文名称 
     * @return ProductNameCN 产品中文名称
     */
    public String getProductNameCN() {
        return this.ProductNameCN;
    }

    /**
     * Set 产品中文名称
     * @param ProductNameCN 产品中文名称
     */
    public void setProductNameCN(String ProductNameCN) {
        this.ProductNameCN = ProductNameCN;
    }

    /**
     * Get 调用次数 
     * @return CallCount 调用次数
     */
    public Long getCallCount() {
        return this.CallCount;
    }

    /**
     * Set 调用次数
     * @param CallCount 调用次数
     */
    public void setCallCount(Long CallCount) {
        this.CallCount = CallCount;
    }

    public RiskCallRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskCallRecord(RiskCallRecord source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventDescCN != null) {
            this.EventDescCN = new String(source.EventDescCN);
        }
        if (source.EventDescEN != null) {
            this.EventDescEN = new String(source.EventDescEN);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductNameCN != null) {
            this.ProductNameCN = new String(source.ProductNameCN);
        }
        if (source.CallCount != null) {
            this.CallCount = new Long(source.CallCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventDescCN", this.EventDescCN);
        this.setParamSimple(map, prefix + "EventDescEN", this.EventDescEN);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductNameCN", this.ProductNameCN);
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);

    }
}

