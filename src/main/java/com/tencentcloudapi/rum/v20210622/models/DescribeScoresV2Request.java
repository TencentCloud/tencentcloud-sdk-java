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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScoresV2Request extends AbstractModel {

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 项目 ID 列表
    */
    @SerializedName("IDList")
    @Expose
    private Long [] IDList;

    /**
    * 查询粒度，hour 或 day
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 环境
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 项目 ID 列表 
     * @return IDList 项目 ID 列表
     */
    public Long [] getIDList() {
        return this.IDList;
    }

    /**
     * Set 项目 ID 列表
     * @param IDList 项目 ID 列表
     */
    public void setIDList(Long [] IDList) {
        this.IDList = IDList;
    }

    /**
     * Get 查询粒度，hour 或 day 
     * @return Type 查询粒度，hour 或 day
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 查询粒度，hour 或 day
     * @param Type 查询粒度，hour 或 day
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 环境 
     * @return Env 环境
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set 环境
     * @param Env 环境
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    public DescribeScoresV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScoresV2Request(DescribeScoresV2Request source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.IDList != null) {
            this.IDList = new Long[source.IDList.length];
            for (int i = 0; i < source.IDList.length; i++) {
                this.IDList[i] = new Long(source.IDList[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "IDList.", this.IDList);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Env", this.Env);

    }
}

