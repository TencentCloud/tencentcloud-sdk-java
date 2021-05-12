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

public class DescribeForwardRuleRequest extends AbstractModel{

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
    * 队列类型，0：CMQ，1：Ckafka
    */
    @SerializedName("QueueType")
    @Expose
    private Long QueueType;

    /**
    * 临时密钥
    */
    @SerializedName("Consecretid")
    @Expose
    private String Consecretid;

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
     * Get 队列类型，0：CMQ，1：Ckafka 
     * @return QueueType 队列类型，0：CMQ，1：Ckafka
     */
    public Long getQueueType() {
        return this.QueueType;
    }

    /**
     * Set 队列类型，0：CMQ，1：Ckafka
     * @param QueueType 队列类型，0：CMQ，1：Ckafka
     */
    public void setQueueType(Long QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get 临时密钥 
     * @return Consecretid 临时密钥
     */
    public String getConsecretid() {
        return this.Consecretid;
    }

    /**
     * Set 临时密钥
     * @param Consecretid 临时密钥
     */
    public void setConsecretid(String Consecretid) {
        this.Consecretid = Consecretid;
    }

    public DescribeForwardRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeForwardRuleRequest(DescribeForwardRuleRequest source) {
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.Skey != null) {
            this.Skey = new String(source.Skey);
        }
        if (source.QueueType != null) {
            this.QueueType = new Long(source.QueueType);
        }
        if (source.Consecretid != null) {
            this.Consecretid = new String(source.Consecretid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "Skey", this.Skey);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "Consecretid", this.Consecretid);

    }
}

