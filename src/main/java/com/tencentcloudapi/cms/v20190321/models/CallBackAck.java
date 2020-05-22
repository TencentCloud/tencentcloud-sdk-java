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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallBackAck extends AbstractModel{

    /**
    * 异步ACK-CODE
    */
    @SerializedName("StdRetCode")
    @Expose
    private Long StdRetCode;

    /**
    * 异步ACK
    */
    @SerializedName("StdRetMsg")
    @Expose
    private String StdRetMsg;

    /**
     * Get 异步ACK-CODE 
     * @return StdRetCode 异步ACK-CODE
     */
    public Long getStdRetCode() {
        return this.StdRetCode;
    }

    /**
     * Set 异步ACK-CODE
     * @param StdRetCode 异步ACK-CODE
     */
    public void setStdRetCode(Long StdRetCode) {
        this.StdRetCode = StdRetCode;
    }

    /**
     * Get 异步ACK 
     * @return StdRetMsg 异步ACK
     */
    public String getStdRetMsg() {
        return this.StdRetMsg;
    }

    /**
     * Set 异步ACK
     * @param StdRetMsg 异步ACK
     */
    public void setStdRetMsg(String StdRetMsg) {
        this.StdRetMsg = StdRetMsg;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StdRetCode", this.StdRetCode);
        this.setParamSimple(map, prefix + "StdRetMsg", this.StdRetMsg);

    }
}

