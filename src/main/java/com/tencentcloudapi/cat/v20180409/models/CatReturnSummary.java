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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CatReturnSummary extends AbstractModel{

    /**
    * 拨测失败个数
    */
    @SerializedName("ResultCount")
    @Expose
    private Long ResultCount;

    /**
    * 拨测失败返回码
    */
    @SerializedName("ResultCode")
    @Expose
    private Long ResultCode;

    /**
    * 拨测失败原因描述
    */
    @SerializedName("ErrorReason")
    @Expose
    private String ErrorReason;

    /**
     * Get 拨测失败个数 
     * @return ResultCount 拨测失败个数
     */
    public Long getResultCount() {
        return this.ResultCount;
    }

    /**
     * Set 拨测失败个数
     * @param ResultCount 拨测失败个数
     */
    public void setResultCount(Long ResultCount) {
        this.ResultCount = ResultCount;
    }

    /**
     * Get 拨测失败返回码 
     * @return ResultCode 拨测失败返回码
     */
    public Long getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set 拨测失败返回码
     * @param ResultCode 拨测失败返回码
     */
    public void setResultCode(Long ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get 拨测失败原因描述 
     * @return ErrorReason 拨测失败原因描述
     */
    public String getErrorReason() {
        return this.ErrorReason;
    }

    /**
     * Set 拨测失败原因描述
     * @param ErrorReason 拨测失败原因描述
     */
    public void setErrorReason(String ErrorReason) {
        this.ErrorReason = ErrorReason;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultCount", this.ResultCount);
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "ErrorReason", this.ErrorReason);

    }
}

