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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetPayModeRequest extends AbstractModel {

    /**
    * 设置后付费状态，0：后付费；1：预付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
     * Get 设置后付费状态，0：后付费；1：预付费 
     * @return PayMode 设置后付费状态，0：后付费；1：预付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 设置后付费状态，0：后付费；1：预付费
     * @param PayMode 设置后付费状态，0：后付费；1：预付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    public SetPayModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetPayModeRequest(SetPayModeRequest source) {
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

