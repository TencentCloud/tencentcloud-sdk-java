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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFaceIdResultsRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 慧眼业务ID
    */
    @SerializedName("WbAppId")
    @Expose
    private String WbAppId;

    /**
    * 订单号(orderNo); 限制在3个或以内
    */
    @SerializedName("OrderNumbers")
    @Expose
    private String [] OrderNumbers;

    /**
    * 1:视频+照片,2:照片,3:视频,0（或其他数字）:无; 可选
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 慧眼业务ID 
     * @return WbAppId 慧眼业务ID
     */
    public String getWbAppId() {
        return this.WbAppId;
    }

    /**
     * Set 慧眼业务ID
     * @param WbAppId 慧眼业务ID
     */
    public void setWbAppId(String WbAppId) {
        this.WbAppId = WbAppId;
    }

    /**
     * Get 订单号(orderNo); 限制在3个或以内 
     * @return OrderNumbers 订单号(orderNo); 限制在3个或以内
     */
    public String [] getOrderNumbers() {
        return this.OrderNumbers;
    }

    /**
     * Set 订单号(orderNo); 限制在3个或以内
     * @param OrderNumbers 订单号(orderNo); 限制在3个或以内
     */
    public void setOrderNumbers(String [] OrderNumbers) {
        this.OrderNumbers = OrderNumbers;
    }

    /**
     * Get 1:视频+照片,2:照片,3:视频,0（或其他数字）:无; 可选 
     * @return FileType 1:视频+照片,2:照片,3:视频,0（或其他数字）:无; 可选
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set 1:视频+照片,2:照片,3:视频,0（或其他数字）:无; 可选
     * @param FileType 1:视频+照片,2:照片,3:视频,0（或其他数字）:无; 可选
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
    }

    public DescribeFaceIdResultsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFaceIdResultsRequest(DescribeFaceIdResultsRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.WbAppId != null) {
            this.WbAppId = new String(source.WbAppId);
        }
        if (source.OrderNumbers != null) {
            this.OrderNumbers = new String[source.OrderNumbers.length];
            for (int i = 0; i < source.OrderNumbers.length; i++) {
                this.OrderNumbers[i] = new String(source.OrderNumbers[i]);
            }
        }
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "WbAppId", this.WbAppId);
        this.setParamArraySimple(map, prefix + "OrderNumbers.", this.OrderNumbers);
        this.setParamSimple(map, prefix + "FileType", this.FileType);

    }
}

