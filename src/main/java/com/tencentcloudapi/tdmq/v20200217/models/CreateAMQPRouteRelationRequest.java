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

public class CreateAMQPRouteRelationRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 交换机所在的vhost
    */
    @SerializedName("VHostId")
    @Expose
    private String VHostId;

    /**
    * 源Exchange名称
    */
    @SerializedName("SourceExchange")
    @Expose
    private String SourceExchange;

    /**
    * 目标类型:Queue|Exchange
    */
    @SerializedName("DestType")
    @Expose
    private String DestType;

    /**
    * 目标值
    */
    @SerializedName("DestValue")
    @Expose
    private String DestValue;

    /**
    * 交换机说明，最大128个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 绑定key,缺省值为default
    */
    @SerializedName("RoutingKey")
    @Expose
    private String RoutingKey;

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
     * Get 交换机所在的vhost 
     * @return VHostId 交换机所在的vhost
     */
    public String getVHostId() {
        return this.VHostId;
    }

    /**
     * Set 交换机所在的vhost
     * @param VHostId 交换机所在的vhost
     */
    public void setVHostId(String VHostId) {
        this.VHostId = VHostId;
    }

    /**
     * Get 源Exchange名称 
     * @return SourceExchange 源Exchange名称
     */
    public String getSourceExchange() {
        return this.SourceExchange;
    }

    /**
     * Set 源Exchange名称
     * @param SourceExchange 源Exchange名称
     */
    public void setSourceExchange(String SourceExchange) {
        this.SourceExchange = SourceExchange;
    }

    /**
     * Get 目标类型:Queue|Exchange 
     * @return DestType 目标类型:Queue|Exchange
     */
    public String getDestType() {
        return this.DestType;
    }

    /**
     * Set 目标类型:Queue|Exchange
     * @param DestType 目标类型:Queue|Exchange
     */
    public void setDestType(String DestType) {
        this.DestType = DestType;
    }

    /**
     * Get 目标值 
     * @return DestValue 目标值
     */
    public String getDestValue() {
        return this.DestValue;
    }

    /**
     * Set 目标值
     * @param DestValue 目标值
     */
    public void setDestValue(String DestValue) {
        this.DestValue = DestValue;
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
     * Get 绑定key,缺省值为default 
     * @return RoutingKey 绑定key,缺省值为default
     */
    public String getRoutingKey() {
        return this.RoutingKey;
    }

    /**
     * Set 绑定key,缺省值为default
     * @param RoutingKey 绑定key,缺省值为default
     */
    public void setRoutingKey(String RoutingKey) {
        this.RoutingKey = RoutingKey;
    }

    public CreateAMQPRouteRelationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAMQPRouteRelationRequest(CreateAMQPRouteRelationRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.VHostId != null) {
            this.VHostId = new String(source.VHostId);
        }
        if (source.SourceExchange != null) {
            this.SourceExchange = new String(source.SourceExchange);
        }
        if (source.DestType != null) {
            this.DestType = new String(source.DestType);
        }
        if (source.DestValue != null) {
            this.DestValue = new String(source.DestValue);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RoutingKey != null) {
            this.RoutingKey = new String(source.RoutingKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "VHostId", this.VHostId);
        this.setParamSimple(map, prefix + "SourceExchange", this.SourceExchange);
        this.setParamSimple(map, prefix + "DestType", this.DestType);
        this.setParamSimple(map, prefix + "DestValue", this.DestValue);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RoutingKey", this.RoutingKey);

    }
}

