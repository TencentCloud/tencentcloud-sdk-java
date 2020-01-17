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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTemplateStatus extends AbstractModel{

    /**
    * 删除状态信息。
    */
    @SerializedName("DeleteStatus")
    @Expose
    private String DeleteStatus;

    /**
    * 删除时间，UNIX 时间戳（单位：秒）。
    */
    @SerializedName("DeleteTime")
    @Expose
    private Long DeleteTime;

    /**
     * Get 删除状态信息。 
     * @return DeleteStatus 删除状态信息。
     */
    public String getDeleteStatus() {
        return this.DeleteStatus;
    }

    /**
     * Set 删除状态信息。
     * @param DeleteStatus 删除状态信息。
     */
    public void setDeleteStatus(String DeleteStatus) {
        this.DeleteStatus = DeleteStatus;
    }

    /**
     * Get 删除时间，UNIX 时间戳（单位：秒）。 
     * @return DeleteTime 删除时间，UNIX 时间戳（单位：秒）。
     */
    public Long getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set 删除时间，UNIX 时间戳（单位：秒）。
     * @param DeleteTime 删除时间，UNIX 时间戳（单位：秒）。
     */
    public void setDeleteTime(Long DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeleteStatus", this.DeleteStatus);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);

    }
}

