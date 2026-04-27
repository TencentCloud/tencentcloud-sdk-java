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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliverSummary extends AbstractModel {

    /**
    * <p>投递消费者，当前仅支持CLS</p>
    */
    @SerializedName("DeliverConsumer")
    @Expose
    private String DeliverConsumer;

    /**
    * <p>投递消费者名称，当前仅支持CLS</p>
    */
    @SerializedName("DeliverConsumerName")
    @Expose
    private String DeliverConsumerName;

    /**
    * <p>投递类型当前仅支持mq</p>
    */
    @SerializedName("DeliverType")
    @Expose
    private String DeliverType;

    /**
    * <p>投递子类型，当前仅支持CLS</p>
    */
    @SerializedName("DeliverSubType")
    @Expose
    private String DeliverSubType;

    /**
    * <p>投递报错</p>
    */
    @SerializedName("DeliverError")
    @Expose
    private String DeliverError;

    /**
     * Get <p>投递消费者，当前仅支持CLS</p> 
     * @return DeliverConsumer <p>投递消费者，当前仅支持CLS</p>
     */
    public String getDeliverConsumer() {
        return this.DeliverConsumer;
    }

    /**
     * Set <p>投递消费者，当前仅支持CLS</p>
     * @param DeliverConsumer <p>投递消费者，当前仅支持CLS</p>
     */
    public void setDeliverConsumer(String DeliverConsumer) {
        this.DeliverConsumer = DeliverConsumer;
    }

    /**
     * Get <p>投递消费者名称，当前仅支持CLS</p> 
     * @return DeliverConsumerName <p>投递消费者名称，当前仅支持CLS</p>
     */
    public String getDeliverConsumerName() {
        return this.DeliverConsumerName;
    }

    /**
     * Set <p>投递消费者名称，当前仅支持CLS</p>
     * @param DeliverConsumerName <p>投递消费者名称，当前仅支持CLS</p>
     */
    public void setDeliverConsumerName(String DeliverConsumerName) {
        this.DeliverConsumerName = DeliverConsumerName;
    }

    /**
     * Get <p>投递类型当前仅支持mq</p> 
     * @return DeliverType <p>投递类型当前仅支持mq</p>
     */
    public String getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set <p>投递类型当前仅支持mq</p>
     * @param DeliverType <p>投递类型当前仅支持mq</p>
     */
    public void setDeliverType(String DeliverType) {
        this.DeliverType = DeliverType;
    }

    /**
     * Get <p>投递子类型，当前仅支持CLS</p> 
     * @return DeliverSubType <p>投递子类型，当前仅支持CLS</p>
     */
    public String getDeliverSubType() {
        return this.DeliverSubType;
    }

    /**
     * Set <p>投递子类型，当前仅支持CLS</p>
     * @param DeliverSubType <p>投递子类型，当前仅支持CLS</p>
     */
    public void setDeliverSubType(String DeliverSubType) {
        this.DeliverSubType = DeliverSubType;
    }

    /**
     * Get <p>投递报错</p> 
     * @return DeliverError <p>投递报错</p>
     */
    public String getDeliverError() {
        return this.DeliverError;
    }

    /**
     * Set <p>投递报错</p>
     * @param DeliverError <p>投递报错</p>
     */
    public void setDeliverError(String DeliverError) {
        this.DeliverError = DeliverError;
    }

    public DeliverSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliverSummary(DeliverSummary source) {
        if (source.DeliverConsumer != null) {
            this.DeliverConsumer = new String(source.DeliverConsumer);
        }
        if (source.DeliverConsumerName != null) {
            this.DeliverConsumerName = new String(source.DeliverConsumerName);
        }
        if (source.DeliverType != null) {
            this.DeliverType = new String(source.DeliverType);
        }
        if (source.DeliverSubType != null) {
            this.DeliverSubType = new String(source.DeliverSubType);
        }
        if (source.DeliverError != null) {
            this.DeliverError = new String(source.DeliverError);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeliverConsumer", this.DeliverConsumer);
        this.setParamSimple(map, prefix + "DeliverConsumerName", this.DeliverConsumerName);
        this.setParamSimple(map, prefix + "DeliverType", this.DeliverType);
        this.setParamSimple(map, prefix + "DeliverSubType", this.DeliverSubType);
        this.setParamSimple(map, prefix + "DeliverError", this.DeliverError);

    }
}

