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
package com.tencentcloudapi.tms.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TipoffResponse extends AbstractModel{

    /**
    * 举报结果， "0-举报数据提交成功  99-举报数据提交失败"
    */
    @SerializedName("ResultCode")
    @Expose
    private Long ResultCode;

    /**
    * 结果描述
    */
    @SerializedName("ResultMsg")
    @Expose
    private String ResultMsg;

    /**
     * Get 举报结果， "0-举报数据提交成功  99-举报数据提交失败" 
     * @return ResultCode 举报结果， "0-举报数据提交成功  99-举报数据提交失败"
     */
    public Long getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set 举报结果， "0-举报数据提交成功  99-举报数据提交失败"
     * @param ResultCode 举报结果， "0-举报数据提交成功  99-举报数据提交失败"
     */
    public void setResultCode(Long ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get 结果描述 
     * @return ResultMsg 结果描述
     */
    public String getResultMsg() {
        return this.ResultMsg;
    }

    /**
     * Set 结果描述
     * @param ResultMsg 结果描述
     */
    public void setResultMsg(String ResultMsg) {
        this.ResultMsg = ResultMsg;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "ResultMsg", this.ResultMsg);

    }
}

