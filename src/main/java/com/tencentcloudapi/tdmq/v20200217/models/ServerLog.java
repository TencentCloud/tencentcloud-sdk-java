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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerLog extends AbstractModel {

    /**
    * 存储时间。
    */
    @SerializedName("SaveTime")
    @Expose
    private String SaveTime;

    /**
    * 状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 存储时间。 
     * @return SaveTime 存储时间。
     */
    public String getSaveTime() {
        return this.SaveTime;
    }

    /**
     * Set 存储时间。
     * @param SaveTime 存储时间。
     */
    public void setSaveTime(String SaveTime) {
        this.SaveTime = SaveTime;
    }

    /**
     * Get 状态。 
     * @return Status 状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。
     * @param Status 状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ServerLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerLog(ServerLog source) {
        if (source.SaveTime != null) {
            this.SaveTime = new String(source.SaveTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SaveTime", this.SaveTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

