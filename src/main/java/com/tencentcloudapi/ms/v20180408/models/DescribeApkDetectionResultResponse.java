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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApkDetectionResultResponse extends AbstractModel{

    /**
    * 响应结果，ok表示正常，error表示错误
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Result为error错误时的原因说明
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * APK检测结果数组
    */
    @SerializedName("ResultList")
    @Expose
    private ResultListItem [] ResultList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 响应结果，ok表示正常，error表示错误 
     * @return Result 响应结果，ok表示正常，error表示错误
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 响应结果，ok表示正常，error表示错误
     * @param Result 响应结果，ok表示正常，error表示错误
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Result为error错误时的原因说明 
     * @return Reason Result为error错误时的原因说明
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Result为error错误时的原因说明
     * @param Reason Result为error错误时的原因说明
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get APK检测结果数组 
     * @return ResultList APK检测结果数组
     */
    public ResultListItem [] getResultList() {
        return this.ResultList;
    }

    /**
     * Set APK检测结果数组
     * @param ResultList APK检测结果数组
     */
    public void setResultList(ResultListItem [] ResultList) {
        this.ResultList = ResultList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeApkDetectionResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApkDetectionResultResponse(DescribeApkDetectionResultResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.ResultList != null) {
            this.ResultList = new ResultListItem[source.ResultList.length];
            for (int i = 0; i < source.ResultList.length; i++) {
                this.ResultList[i] = new ResultListItem(source.ResultList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamArrayObj(map, prefix + "ResultList.", this.ResultList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

