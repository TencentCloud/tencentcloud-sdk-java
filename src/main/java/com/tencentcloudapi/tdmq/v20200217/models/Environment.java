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

public class Environment extends AbstractModel{

    /**
    * 环境（命名空间）名称
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 未消费消息过期时间，单位：秒，最大1296000（15天）
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 环境（命名空间）名称 
     * @return EnvironmentId 环境（命名空间）名称
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境（命名空间）名称
     * @param EnvironmentId 环境（命名空间）名称
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 说明 
     * @return Remark 说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明
     * @param Remark 说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 未消费消息过期时间，单位：秒，最大1296000（15天） 
     * @return MsgTTL 未消费消息过期时间，单位：秒，最大1296000（15天）
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set 未消费消息过期时间，单位：秒，最大1296000（15天）
     * @param MsgTTL 未消费消息过期时间，单位：秒，最大1296000（15天）
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近修改时间 
     * @return UpdateTime 最近修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近修改时间
     * @param UpdateTime 最近修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

