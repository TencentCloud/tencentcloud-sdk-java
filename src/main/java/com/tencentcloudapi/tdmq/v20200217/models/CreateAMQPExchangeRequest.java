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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAMQPExchangeRequest extends AbstractModel{

    /**
    * 交换机名称，3-64个字符，只能包含字母、数字、“-”及“_”
    */
    @SerializedName("Exchange")
    @Expose
    private String Exchange;

    /**
    * 交换机所在的vhost，目前支持在单个vhost下创建主题
    */
    @SerializedName("VHosts")
    @Expose
    private String [] VHosts;

    /**
    * 交换机类型，可选值为Direct, Fanout, Topic, x-delayed-message
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 交换机说明，最大128个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 备用交换机名称
    */
    @SerializedName("AlternateExchange")
    @Expose
    private String AlternateExchange;

    /**
    * 延迟交换机类型，可选值为Direct, Fanout, Topic, 不允许为x-delayed-message
    */
    @SerializedName("DelayedType")
    @Expose
    private String DelayedType;

    /**
     * Get 交换机名称，3-64个字符，只能包含字母、数字、“-”及“_” 
     * @return Exchange 交换机名称，3-64个字符，只能包含字母、数字、“-”及“_”
     */
    public String getExchange() {
        return this.Exchange;
    }

    /**
     * Set 交换机名称，3-64个字符，只能包含字母、数字、“-”及“_”
     * @param Exchange 交换机名称，3-64个字符，只能包含字母、数字、“-”及“_”
     */
    public void setExchange(String Exchange) {
        this.Exchange = Exchange;
    }

    /**
     * Get 交换机所在的vhost，目前支持在单个vhost下创建主题 
     * @return VHosts 交换机所在的vhost，目前支持在单个vhost下创建主题
     */
    public String [] getVHosts() {
        return this.VHosts;
    }

    /**
     * Set 交换机所在的vhost，目前支持在单个vhost下创建主题
     * @param VHosts 交换机所在的vhost，目前支持在单个vhost下创建主题
     */
    public void setVHosts(String [] VHosts) {
        this.VHosts = VHosts;
    }

    /**
     * Get 交换机类型，可选值为Direct, Fanout, Topic, x-delayed-message 
     * @return Type 交换机类型，可选值为Direct, Fanout, Topic, x-delayed-message
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 交换机类型，可选值为Direct, Fanout, Topic, x-delayed-message
     * @param Type 交换机类型，可选值为Direct, Fanout, Topic, x-delayed-message
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 交换机说明，最大128个字符 
     * @return Remark 交换机说明，最大128个字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 交换机说明，最大128个字符
     * @param Remark 交换机说明，最大128个字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 备用交换机名称 
     * @return AlternateExchange 备用交换机名称
     */
    public String getAlternateExchange() {
        return this.AlternateExchange;
    }

    /**
     * Set 备用交换机名称
     * @param AlternateExchange 备用交换机名称
     */
    public void setAlternateExchange(String AlternateExchange) {
        this.AlternateExchange = AlternateExchange;
    }

    /**
     * Get 延迟交换机类型，可选值为Direct, Fanout, Topic, 不允许为x-delayed-message 
     * @return DelayedType 延迟交换机类型，可选值为Direct, Fanout, Topic, 不允许为x-delayed-message
     */
    public String getDelayedType() {
        return this.DelayedType;
    }

    /**
     * Set 延迟交换机类型，可选值为Direct, Fanout, Topic, 不允许为x-delayed-message
     * @param DelayedType 延迟交换机类型，可选值为Direct, Fanout, Topic, 不允许为x-delayed-message
     */
    public void setDelayedType(String DelayedType) {
        this.DelayedType = DelayedType;
    }

    public CreateAMQPExchangeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAMQPExchangeRequest(CreateAMQPExchangeRequest source) {
        if (source.Exchange != null) {
            this.Exchange = new String(source.Exchange);
        }
        if (source.VHosts != null) {
            this.VHosts = new String[source.VHosts.length];
            for (int i = 0; i < source.VHosts.length; i++) {
                this.VHosts[i] = new String(source.VHosts[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AlternateExchange != null) {
            this.AlternateExchange = new String(source.AlternateExchange);
        }
        if (source.DelayedType != null) {
            this.DelayedType = new String(source.DelayedType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Exchange", this.Exchange);
        this.setParamArraySimple(map, prefix + "VHosts.", this.VHosts);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AlternateExchange", this.AlternateExchange);
        this.setParamSimple(map, prefix + "DelayedType", this.DelayedType);

    }
}

