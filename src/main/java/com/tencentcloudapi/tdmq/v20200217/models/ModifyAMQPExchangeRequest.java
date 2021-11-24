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

public class ModifyAMQPExchangeRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Vhost间名称
    */
    @SerializedName("VHostId")
    @Expose
    private String VHostId;

    /**
    * 交换机名称
    */
    @SerializedName("Exchange")
    @Expose
    private String Exchange;

    /**
    * 说明信息，最大128个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
     * Get Vhost间名称 
     * @return VHostId Vhost间名称
     */
    public String getVHostId() {
        return this.VHostId;
    }

    /**
     * Set Vhost间名称
     * @param VHostId Vhost间名称
     */
    public void setVHostId(String VHostId) {
        this.VHostId = VHostId;
    }

    /**
     * Get 交换机名称 
     * @return Exchange 交换机名称
     */
    public String getExchange() {
        return this.Exchange;
    }

    /**
     * Set 交换机名称
     * @param Exchange 交换机名称
     */
    public void setExchange(String Exchange) {
        this.Exchange = Exchange;
    }

    /**
     * Get 说明信息，最大128个字符 
     * @return Remark 说明信息，最大128个字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明信息，最大128个字符
     * @param Remark 说明信息，最大128个字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyAMQPExchangeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAMQPExchangeRequest(ModifyAMQPExchangeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.VHostId != null) {
            this.VHostId = new String(source.VHostId);
        }
        if (source.Exchange != null) {
            this.Exchange = new String(source.Exchange);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "VHostId", this.VHostId);
        this.setParamSimple(map, prefix + "Exchange", this.Exchange);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

