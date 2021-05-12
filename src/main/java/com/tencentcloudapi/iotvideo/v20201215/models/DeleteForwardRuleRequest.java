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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteForwardRuleRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 控制台Skey
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

    /**
    * 队列类型
    */
    @SerializedName("QueueType")
    @Expose
    private Long QueueType;

    /**
    * 队列名称
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
     * Get 产品ID 
     * @return ProductID 产品ID
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 产品ID
     * @param ProductID 产品ID
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 控制台Skey 
     * @return Skey 控制台Skey
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * Set 控制台Skey
     * @param Skey 控制台Skey
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    /**
     * Get 队列类型 
     * @return QueueType 队列类型
     */
    public Long getQueueType() {
        return this.QueueType;
    }

    /**
     * Set 队列类型
     * @param QueueType 队列类型
     */
    public void setQueueType(Long QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get 队列名称 
     * @return QueueName 队列名称
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名称
     * @param QueueName 队列名称
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    public DeleteForwardRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteForwardRuleRequest(DeleteForwardRuleRequest source) {
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.Skey != null) {
            this.Skey = new String(source.Skey);
        }
        if (source.QueueType != null) {
            this.QueueType = new Long(source.QueueType);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "Skey", this.Skey);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);

    }
}

