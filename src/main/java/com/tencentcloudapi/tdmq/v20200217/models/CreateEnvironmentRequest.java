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

public class CreateEnvironmentRequest extends AbstractModel{

    /**
    * 环境（命名空间）名称，不支持中字以及除了短线和下划线外的特殊字符且不超过16个字符。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 未消费消息过期时间，单位：秒，最小60，最大1296000，（15天）。
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * 说明，128个字符以内。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 环境（命名空间）名称，不支持中字以及除了短线和下划线外的特殊字符且不超过16个字符。 
     * @return EnvironmentId 环境（命名空间）名称，不支持中字以及除了短线和下划线外的特殊字符且不超过16个字符。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境（命名空间）名称，不支持中字以及除了短线和下划线外的特殊字符且不超过16个字符。
     * @param EnvironmentId 环境（命名空间）名称，不支持中字以及除了短线和下划线外的特殊字符且不超过16个字符。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 未消费消息过期时间，单位：秒，最小60，最大1296000，（15天）。 
     * @return MsgTTL 未消费消息过期时间，单位：秒，最小60，最大1296000，（15天）。
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set 未消费消息过期时间，单位：秒，最小60，最大1296000，（15天）。
     * @param MsgTTL 未消费消息过期时间，单位：秒，最小60，最大1296000，（15天）。
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get 说明，128个字符以内。 
     * @return Remark 说明，128个字符以内。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明，128个字符以内。
     * @param Remark 说明，128个字符以内。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

