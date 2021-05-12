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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportTrendData extends AbstractModel{

    /**
    * 总次数
    */
    @SerializedName("TotalList")
    @Expose
    private String [] TotalList;

    /**
    * 被取消次数
    */
    @SerializedName("CancelList")
    @Expose
    private String [] CancelList;

    /**
    * 成功次数
    */
    @SerializedName("SuccessList")
    @Expose
    private String [] SuccessList;

    /**
    * 失败次数
    */
    @SerializedName("FailList")
    @Expose
    private String [] FailList;

    /**
    * 超时次数
    */
    @SerializedName("TimeoutList")
    @Expose
    private String [] TimeoutList;

    /**
    * 时间数组，单位：秒
    */
    @SerializedName("TimeList")
    @Expose
    private String [] TimeList;

    /**
     * Get 总次数 
     * @return TotalList 总次数
     */
    public String [] getTotalList() {
        return this.TotalList;
    }

    /**
     * Set 总次数
     * @param TotalList 总次数
     */
    public void setTotalList(String [] TotalList) {
        this.TotalList = TotalList;
    }

    /**
     * Get 被取消次数 
     * @return CancelList 被取消次数
     */
    public String [] getCancelList() {
        return this.CancelList;
    }

    /**
     * Set 被取消次数
     * @param CancelList 被取消次数
     */
    public void setCancelList(String [] CancelList) {
        this.CancelList = CancelList;
    }

    /**
     * Get 成功次数 
     * @return SuccessList 成功次数
     */
    public String [] getSuccessList() {
        return this.SuccessList;
    }

    /**
     * Set 成功次数
     * @param SuccessList 成功次数
     */
    public void setSuccessList(String [] SuccessList) {
        this.SuccessList = SuccessList;
    }

    /**
     * Get 失败次数 
     * @return FailList 失败次数
     */
    public String [] getFailList() {
        return this.FailList;
    }

    /**
     * Set 失败次数
     * @param FailList 失败次数
     */
    public void setFailList(String [] FailList) {
        this.FailList = FailList;
    }

    /**
     * Get 超时次数 
     * @return TimeoutList 超时次数
     */
    public String [] getTimeoutList() {
        return this.TimeoutList;
    }

    /**
     * Set 超时次数
     * @param TimeoutList 超时次数
     */
    public void setTimeoutList(String [] TimeoutList) {
        this.TimeoutList = TimeoutList;
    }

    /**
     * Get 时间数组，单位：秒 
     * @return TimeList 时间数组，单位：秒
     */
    public String [] getTimeList() {
        return this.TimeList;
    }

    /**
     * Set 时间数组，单位：秒
     * @param TimeList 时间数组，单位：秒
     */
    public void setTimeList(String [] TimeList) {
        this.TimeList = TimeList;
    }

    public ReportTrendData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportTrendData(ReportTrendData source) {
        if (source.TotalList != null) {
            this.TotalList = new String[source.TotalList.length];
            for (int i = 0; i < source.TotalList.length; i++) {
                this.TotalList[i] = new String(source.TotalList[i]);
            }
        }
        if (source.CancelList != null) {
            this.CancelList = new String[source.CancelList.length];
            for (int i = 0; i < source.CancelList.length; i++) {
                this.CancelList[i] = new String(source.CancelList[i]);
            }
        }
        if (source.SuccessList != null) {
            this.SuccessList = new String[source.SuccessList.length];
            for (int i = 0; i < source.SuccessList.length; i++) {
                this.SuccessList[i] = new String(source.SuccessList[i]);
            }
        }
        if (source.FailList != null) {
            this.FailList = new String[source.FailList.length];
            for (int i = 0; i < source.FailList.length; i++) {
                this.FailList[i] = new String(source.FailList[i]);
            }
        }
        if (source.TimeoutList != null) {
            this.TimeoutList = new String[source.TimeoutList.length];
            for (int i = 0; i < source.TimeoutList.length; i++) {
                this.TimeoutList[i] = new String(source.TimeoutList[i]);
            }
        }
        if (source.TimeList != null) {
            this.TimeList = new String[source.TimeList.length];
            for (int i = 0; i < source.TimeList.length; i++) {
                this.TimeList[i] = new String(source.TimeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TotalList.", this.TotalList);
        this.setParamArraySimple(map, prefix + "CancelList.", this.CancelList);
        this.setParamArraySimple(map, prefix + "SuccessList.", this.SuccessList);
        this.setParamArraySimple(map, prefix + "FailList.", this.FailList);
        this.setParamArraySimple(map, prefix + "TimeoutList.", this.TimeoutList);
        this.setParamArraySimple(map, prefix + "TimeList.", this.TimeList);

    }
}

