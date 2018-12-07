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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FailedTaskInfo  extends AbstractModel{

    /**
    * 运行脚本的设备ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 失败原因
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
     * 获取运行脚本的设备ID
     * @return InstanceId 运行脚本的设备ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置运行脚本的设备ID
     * @param InstanceId 运行脚本的设备ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取失败原因
     * @return ErrorMsg 失败原因
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * 设置失败原因
     * @param ErrorMsg 失败原因
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);

    }
}

