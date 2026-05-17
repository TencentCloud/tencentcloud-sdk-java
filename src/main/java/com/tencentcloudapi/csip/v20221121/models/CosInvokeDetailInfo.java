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

public class CosInvokeDetailInfo extends AbstractModel {

    /**
    * 调用时间
    */
    @SerializedName("InvokeTimestamp")
    @Expose
    private Long InvokeTimestamp;

    /**
    * 请求id
    */
    @SerializedName("InvokeRequestId")
    @Expose
    private String InvokeRequestId;

    /**
    * 调用内容
    */
    @SerializedName("InvokeContent")
    @Expose
    private String InvokeContent;

    /**
     * Get 调用时间 
     * @return InvokeTimestamp 调用时间
     */
    public Long getInvokeTimestamp() {
        return this.InvokeTimestamp;
    }

    /**
     * Set 调用时间
     * @param InvokeTimestamp 调用时间
     */
    public void setInvokeTimestamp(Long InvokeTimestamp) {
        this.InvokeTimestamp = InvokeTimestamp;
    }

    /**
     * Get 请求id 
     * @return InvokeRequestId 请求id
     */
    public String getInvokeRequestId() {
        return this.InvokeRequestId;
    }

    /**
     * Set 请求id
     * @param InvokeRequestId 请求id
     */
    public void setInvokeRequestId(String InvokeRequestId) {
        this.InvokeRequestId = InvokeRequestId;
    }

    /**
     * Get 调用内容 
     * @return InvokeContent 调用内容
     */
    public String getInvokeContent() {
        return this.InvokeContent;
    }

    /**
     * Set 调用内容
     * @param InvokeContent 调用内容
     */
    public void setInvokeContent(String InvokeContent) {
        this.InvokeContent = InvokeContent;
    }

    public CosInvokeDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosInvokeDetailInfo(CosInvokeDetailInfo source) {
        if (source.InvokeTimestamp != null) {
            this.InvokeTimestamp = new Long(source.InvokeTimestamp);
        }
        if (source.InvokeRequestId != null) {
            this.InvokeRequestId = new String(source.InvokeRequestId);
        }
        if (source.InvokeContent != null) {
            this.InvokeContent = new String(source.InvokeContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokeTimestamp", this.InvokeTimestamp);
        this.setParamSimple(map, prefix + "InvokeRequestId", this.InvokeRequestId);
        this.setParamSimple(map, prefix + "InvokeContent", this.InvokeContent);

    }
}

