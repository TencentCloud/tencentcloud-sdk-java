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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PaasSmsCampaignStatusResp extends AbstractModel{

    /**
    * 0-未发送 1-发送中 2-发送结束 3-发送取消
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 0-未发送 1-发送中 2-发送结束 3-发送取消 
     * @return Status 0-未发送 1-发送中 2-发送结束 3-发送取消
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0-未发送 1-发送中 2-发送结束 3-发送取消
     * @param Status 0-未发送 1-发送中 2-发送结束 3-发送取消
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public PaasSmsCampaignStatusResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PaasSmsCampaignStatusResp(PaasSmsCampaignStatusResp source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

