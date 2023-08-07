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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoDownloadUrlData extends AbstractModel{

    /**
    * 录像文件下载 URL
注意：
URL 有效期是10分钟，过期后将拒绝访问，若需再用请重新获取 
录像文件下载采用分块传输编码，响应头Transfer-Encoding:chunked 
下载文件命名格式为{ChannelId}-{BeginTime}-{EndTime}.{FileType} 
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 实际下载录像的开始时间
注意：当请求中指定IsRespActualTime参数为true时，才有该字段
    */
    @SerializedName("ActualBeginTime")
    @Expose
    private String ActualBeginTime;

    /**
    * 实际下载录像的结束时间
注意：当请求中指定IsRespActualTime参数为true时，才有该字段
    */
    @SerializedName("ActualEndTime")
    @Expose
    private String ActualEndTime;

    /**
     * Get 录像文件下载 URL
注意：
URL 有效期是10分钟，过期后将拒绝访问，若需再用请重新获取 
录像文件下载采用分块传输编码，响应头Transfer-Encoding:chunked 
下载文件命名格式为{ChannelId}-{BeginTime}-{EndTime}.{FileType}  
     * @return Url 录像文件下载 URL
注意：
URL 有效期是10分钟，过期后将拒绝访问，若需再用请重新获取 
录像文件下载采用分块传输编码，响应头Transfer-Encoding:chunked 
下载文件命名格式为{ChannelId}-{BeginTime}-{EndTime}.{FileType} 
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 录像文件下载 URL
注意：
URL 有效期是10分钟，过期后将拒绝访问，若需再用请重新获取 
录像文件下载采用分块传输编码，响应头Transfer-Encoding:chunked 
下载文件命名格式为{ChannelId}-{BeginTime}-{EndTime}.{FileType} 
     * @param Url 录像文件下载 URL
注意：
URL 有效期是10分钟，过期后将拒绝访问，若需再用请重新获取 
录像文件下载采用分块传输编码，响应头Transfer-Encoding:chunked 
下载文件命名格式为{ChannelId}-{BeginTime}-{EndTime}.{FileType} 
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 实际下载录像的开始时间
注意：当请求中指定IsRespActualTime参数为true时，才有该字段 
     * @return ActualBeginTime 实际下载录像的开始时间
注意：当请求中指定IsRespActualTime参数为true时，才有该字段
     */
    public String getActualBeginTime() {
        return this.ActualBeginTime;
    }

    /**
     * Set 实际下载录像的开始时间
注意：当请求中指定IsRespActualTime参数为true时，才有该字段
     * @param ActualBeginTime 实际下载录像的开始时间
注意：当请求中指定IsRespActualTime参数为true时，才有该字段
     */
    public void setActualBeginTime(String ActualBeginTime) {
        this.ActualBeginTime = ActualBeginTime;
    }

    /**
     * Get 实际下载录像的结束时间
注意：当请求中指定IsRespActualTime参数为true时，才有该字段 
     * @return ActualEndTime 实际下载录像的结束时间
注意：当请求中指定IsRespActualTime参数为true时，才有该字段
     */
    public String getActualEndTime() {
        return this.ActualEndTime;
    }

    /**
     * Set 实际下载录像的结束时间
注意：当请求中指定IsRespActualTime参数为true时，才有该字段
     * @param ActualEndTime 实际下载录像的结束时间
注意：当请求中指定IsRespActualTime参数为true时，才有该字段
     */
    public void setActualEndTime(String ActualEndTime) {
        this.ActualEndTime = ActualEndTime;
    }

    public DescribeVideoDownloadUrlData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoDownloadUrlData(DescribeVideoDownloadUrlData source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ActualBeginTime != null) {
            this.ActualBeginTime = new String(source.ActualBeginTime);
        }
        if (source.ActualEndTime != null) {
            this.ActualEndTime = new String(source.ActualEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ActualBeginTime", this.ActualBeginTime);
        this.setParamSimple(map, prefix + "ActualEndTime", this.ActualEndTime);

    }
}

