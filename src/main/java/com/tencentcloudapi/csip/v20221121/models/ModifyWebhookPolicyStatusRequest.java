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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWebhookPolicyStatusRequest extends AbstractModel {

    /**
    * 策略 ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 目标状态
枚举值：
ON：启用
OFF：禁用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 策略 ID 
     * @return ID 策略 ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 策略 ID
     * @param ID 策略 ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 目标状态
枚举值：
ON：启用
OFF：禁用 
     * @return Status 目标状态
枚举值：
ON：启用
OFF：禁用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 目标状态
枚举值：
ON：启用
OFF：禁用
     * @param Status 目标状态
枚举值：
ON：启用
OFF：禁用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyWebhookPolicyStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebhookPolicyStatusRequest(ModifyWebhookPolicyStatusRequest source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

