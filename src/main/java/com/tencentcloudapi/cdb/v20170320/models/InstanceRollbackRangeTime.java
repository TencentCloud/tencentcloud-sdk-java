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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceRollbackRangeTime  extends AbstractModel{

    /**
    * 查询数据库错误码
    */
    @SerializedName("Code")
    @Expose
    private Integer Code;

    /**
    * 查询数据库错误信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 实例ID列表，单个实例Id的格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 可回档时间范围
    */
    @SerializedName("Times")
    @Expose
    private RollbackTimeRange [] Times;

    /**
     * 获取查询数据库错误码
     * @return Code 查询数据库错误码
     */
    public Integer getCode() {
        return this.Code;
    }

    /**
     * 设置查询数据库错误码
     * @param Code 查询数据库错误码
     */
    public void setCode(Integer Code) {
        this.Code = Code;
    }

    /**
     * 获取查询数据库错误信息
     * @return Message 查询数据库错误信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置查询数据库错误信息
     * @param Message 查询数据库错误信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取实例ID列表，单个实例Id的格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同
     * @return InstanceId 实例ID列表，单个实例Id的格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID列表，单个实例Id的格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同
     * @param InstanceId 实例ID列表，单个实例Id的格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取可回档时间范围
     * @return Times 可回档时间范围
     */
    public RollbackTimeRange [] getTimes() {
        return this.Times;
    }

    /**
     * 设置可回档时间范围
     * @param Times 可回档时间范围
     */
    public void setTimes(RollbackTimeRange [] Times) {
        this.Times = Times;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Times.", this.Times);

    }
}

