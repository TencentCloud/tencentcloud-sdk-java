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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetUsageByDateRequest extends AbstractModel {

    /**
    * 需要查询的业务类型名字列表
- asr_rt 实时识别
- asr_rec 录音文件识别
    */
    @SerializedName("BizNameList")
    @Expose
    private String [] BizNameList;

    /**
    * 查询开始时间
开始时间包含当天，支持 YYYY-MM-DD 日期以国内时区为准
开始时间到结束时间需要在3个月以内
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 查询结束时间
结束时间包含当天，，支持 YYYY-MM-DD 日期以国内时区为准
开始时间到结束时间需要在3个月以内
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
     * Get 需要查询的业务类型名字列表
- asr_rt 实时识别
- asr_rec 录音文件识别 
     * @return BizNameList 需要查询的业务类型名字列表
- asr_rt 实时识别
- asr_rec 录音文件识别
     */
    public String [] getBizNameList() {
        return this.BizNameList;
    }

    /**
     * Set 需要查询的业务类型名字列表
- asr_rt 实时识别
- asr_rec 录音文件识别
     * @param BizNameList 需要查询的业务类型名字列表
- asr_rt 实时识别
- asr_rec 录音文件识别
     */
    public void setBizNameList(String [] BizNameList) {
        this.BizNameList = BizNameList;
    }

    /**
     * Get 查询开始时间
开始时间包含当天，支持 YYYY-MM-DD 日期以国内时区为准
开始时间到结束时间需要在3个月以内 
     * @return StartDate 查询开始时间
开始时间包含当天，支持 YYYY-MM-DD 日期以国内时区为准
开始时间到结束时间需要在3个月以内
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 查询开始时间
开始时间包含当天，支持 YYYY-MM-DD 日期以国内时区为准
开始时间到结束时间需要在3个月以内
     * @param StartDate 查询开始时间
开始时间包含当天，支持 YYYY-MM-DD 日期以国内时区为准
开始时间到结束时间需要在3个月以内
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 查询结束时间
结束时间包含当天，，支持 YYYY-MM-DD 日期以国内时区为准
开始时间到结束时间需要在3个月以内 
     * @return EndDate 查询结束时间
结束时间包含当天，，支持 YYYY-MM-DD 日期以国内时区为准
开始时间到结束时间需要在3个月以内
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 查询结束时间
结束时间包含当天，，支持 YYYY-MM-DD 日期以国内时区为准
开始时间到结束时间需要在3个月以内
     * @param EndDate 查询结束时间
结束时间包含当天，，支持 YYYY-MM-DD 日期以国内时区为准
开始时间到结束时间需要在3个月以内
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public GetUsageByDateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUsageByDateRequest(GetUsageByDateRequest source) {
        if (source.BizNameList != null) {
            this.BizNameList = new String[source.BizNameList.length];
            for (int i = 0; i < source.BizNameList.length; i++) {
                this.BizNameList[i] = new String(source.BizNameList[i]);
            }
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BizNameList.", this.BizNameList);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);

    }
}

