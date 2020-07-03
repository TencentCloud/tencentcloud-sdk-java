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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetBashEventsStatusRequest extends AbstractModel{

    /**
    * ID数组，最大100条。
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 新状态(0-待处理 1-高危 2-正常)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get ID数组，最大100条。 
     * @return Ids ID数组，最大100条。
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set ID数组，最大100条。
     * @param Ids ID数组，最大100条。
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 新状态(0-待处理 1-高危 2-正常) 
     * @return Status 新状态(0-待处理 1-高危 2-正常)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 新状态(0-待处理 1-高危 2-正常)
     * @param Status 新状态(0-待处理 1-高危 2-正常)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

