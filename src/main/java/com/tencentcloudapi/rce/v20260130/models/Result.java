/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Result extends AbstractModel {

    /**
    * <p>实际是否完成状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>failure： 失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>失败原因</p>
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
     * Get <p>实际是否完成状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>failure： 失败</li></ul> 
     * @return Status <p>实际是否完成状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>failure： 失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实际是否完成状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>failure： 失败</li></ul>
     * @param Status <p>实际是否完成状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>failure： 失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>失败原因</p> 
     * @return FailureReason <p>失败原因</p>
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set <p>失败原因</p>
     * @param FailureReason <p>失败原因</p>
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    public Result() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Result(Result source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);

    }
}

