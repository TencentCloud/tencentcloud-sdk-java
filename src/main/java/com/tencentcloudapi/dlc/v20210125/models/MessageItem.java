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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageItem extends AbstractModel {

    /**
    * <p>计费项标识</p>
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
    * <p>校验失败描述信息</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get <p>计费项标识</p> 
     * @return BillingItem <p>计费项标识</p>
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set <p>计费项标识</p>
     * @param BillingItem <p>计费项标识</p>
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    /**
     * Get <p>校验失败描述信息</p> 
     * @return Message <p>校验失败描述信息</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>校验失败描述信息</p>
     * @param Message <p>校验失败描述信息</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public MessageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageItem(MessageItem source) {
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

