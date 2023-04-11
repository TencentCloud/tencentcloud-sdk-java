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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoginEventRequest extends AbstractModel{

    /**
    * 用户名，如果不包含其他条件时对user_name or real_name两个字段模糊查询
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 姓名，模糊查询
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 查询时间范围，起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询时间范围，结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 来源IP，模糊查询
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 登录入口：1-字符界面,2-图形界面，3-web页面, 4-API
    */
    @SerializedName("Entry")
    @Expose
    private Long Entry;

    /**
    * 操作结果，1-成功，2-失败
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 分页偏移位置，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页每页记录数，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 用户名，如果不包含其他条件时对user_name or real_name两个字段模糊查询 
     * @return UserName 用户名，如果不包含其他条件时对user_name or real_name两个字段模糊查询
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名，如果不包含其他条件时对user_name or real_name两个字段模糊查询
     * @param UserName 用户名，如果不包含其他条件时对user_name or real_name两个字段模糊查询
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 姓名，模糊查询 
     * @return RealName 姓名，模糊查询
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 姓名，模糊查询
     * @param RealName 姓名，模糊查询
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 查询时间范围，起始时间 
     * @return StartTime 查询时间范围，起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询时间范围，起始时间
     * @param StartTime 查询时间范围，起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询时间范围，结束时间 
     * @return EndTime 查询时间范围，结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询时间范围，结束时间
     * @param EndTime 查询时间范围，结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 来源IP，模糊查询 
     * @return SourceIp 来源IP，模糊查询
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 来源IP，模糊查询
     * @param SourceIp 来源IP，模糊查询
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 登录入口：1-字符界面,2-图形界面，3-web页面, 4-API 
     * @return Entry 登录入口：1-字符界面,2-图形界面，3-web页面, 4-API
     */
    public Long getEntry() {
        return this.Entry;
    }

    /**
     * Set 登录入口：1-字符界面,2-图形界面，3-web页面, 4-API
     * @param Entry 登录入口：1-字符界面,2-图形界面，3-web页面, 4-API
     */
    public void setEntry(Long Entry) {
        this.Entry = Entry;
    }

    /**
     * Get 操作结果，1-成功，2-失败 
     * @return Result 操作结果，1-成功，2-失败
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 操作结果，1-成功，2-失败
     * @param Result 操作结果，1-成功，2-失败
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 分页偏移位置，默认值为0 
     * @return Offset 分页偏移位置，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移位置，默认值为0
     * @param Offset 分页偏移位置，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页每页记录数，默认20 
     * @return Limit 分页每页记录数，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页每页记录数，默认20
     * @param Limit 分页每页记录数，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeLoginEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoginEventRequest(DescribeLoginEventRequest source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.Entry != null) {
            this.Entry = new Long(source.Entry);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "Entry", this.Entry);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

