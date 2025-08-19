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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceRollbackRangeTime extends AbstractModel {

    /**
    * 查询数据库错误码。0 - 正常，1600001 - 内部错误，1600003 - 入参异常，1600009 - 实例不存在，1624001 - DB 访问异常。
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

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
     * Get 查询数据库错误码。0 - 正常，1600001 - 内部错误，1600003 - 入参异常，1600009 - 实例不存在，1624001 - DB 访问异常。 
     * @return Code 查询数据库错误码。0 - 正常，1600001 - 内部错误，1600003 - 入参异常，1600009 - 实例不存在，1624001 - DB 访问异常。
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 查询数据库错误码。0 - 正常，1600001 - 内部错误，1600003 - 入参异常，1600009 - 实例不存在，1624001 - DB 访问异常。
     * @param Code 查询数据库错误码。0 - 正常，1600001 - 内部错误，1600003 - 入参异常，1600009 - 实例不存在，1624001 - DB 访问异常。
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 查询数据库错误信息 
     * @return Message 查询数据库错误信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 查询数据库错误信息
     * @param Message 查询数据库错误信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 实例ID列表，单个实例Id的格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同 
     * @return InstanceId 实例ID列表，单个实例Id的格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID列表，单个实例Id的格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同
     * @param InstanceId 实例ID列表，单个实例Id的格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 可回档时间范围 
     * @return Times 可回档时间范围
     */
    public RollbackTimeRange [] getTimes() {
        return this.Times;
    }

    /**
     * Set 可回档时间范围
     * @param Times 可回档时间范围
     */
    public void setTimes(RollbackTimeRange [] Times) {
        this.Times = Times;
    }

    public InstanceRollbackRangeTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceRollbackRangeTime(InstanceRollbackRangeTime source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Times != null) {
            this.Times = new RollbackTimeRange[source.Times.length];
            for (int i = 0; i < source.Times.length; i++) {
                this.Times[i] = new RollbackTimeRange(source.Times[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Times.", this.Times);

    }
}

