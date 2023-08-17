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

public class UpdateLocalTaskResultRequest extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * 一级任务code。标记任务状态
    */
    @SerializedName("ResultCode")
    @Expose
    private Long ResultCode;

    /**
    * 二级错误码
    */
    @SerializedName("SubCode")
    @Expose
    private Long SubCode;

    /**
    * 二级错误信息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
     * Get 任务id 
     * @return Sid 任务id
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set 任务id
     * @param Sid 任务id
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get 一级任务code。标记任务状态 
     * @return ResultCode 一级任务code。标记任务状态
     */
    public Long getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set 一级任务code。标记任务状态
     * @param ResultCode 一级任务code。标记任务状态
     */
    public void setResultCode(Long ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get 二级错误码 
     * @return SubCode 二级错误码
     */
    public Long getSubCode() {
        return this.SubCode;
    }

    /**
     * Set 二级错误码
     * @param SubCode 二级错误码
     */
    public void setSubCode(Long SubCode) {
        this.SubCode = SubCode;
    }

    /**
     * Get 二级错误信息 
     * @return ErrMsg 二级错误信息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 二级错误信息
     * @param ErrMsg 二级错误信息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 结果 
     * @return Result 结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 结果
     * @param Result 结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    public UpdateLocalTaskResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateLocalTaskResultRequest(UpdateLocalTaskResultRequest source) {
        if (source.Sid != null) {
            this.Sid = new String(source.Sid);
        }
        if (source.ResultCode != null) {
            this.ResultCode = new Long(source.ResultCode);
        }
        if (source.SubCode != null) {
            this.SubCode = new Long(source.SubCode);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sid", this.Sid);
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "SubCode", this.SubCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

