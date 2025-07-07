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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlanQRCode extends AbstractModel {

    /**
    * 二维码
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 状态，0:未激活 1:已激活 2:已冻结
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 二维码 
     * @return Url 二维码
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 二维码
     * @param Url 二维码
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 状态，0:未激活 1:已激活 2:已冻结 
     * @return Status 状态，0:未激活 1:已激活 2:已冻结
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，0:未激活 1:已激活 2:已冻结
     * @param Status 状态，0:未激活 1:已激活 2:已冻结
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public PlanQRCode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlanQRCode(PlanQRCode source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

