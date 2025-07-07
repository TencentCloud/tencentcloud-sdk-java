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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EipConfigIn extends AbstractModel {

    /**
    * Eip开启状态，取值['ENABLE','DISABLE']
    */
    @SerializedName("EipStatus")
    @Expose
    private String EipStatus;

    /**
     * Get Eip开启状态，取值['ENABLE','DISABLE'] 
     * @return EipStatus Eip开启状态，取值['ENABLE','DISABLE']
     */
    public String getEipStatus() {
        return this.EipStatus;
    }

    /**
     * Set Eip开启状态，取值['ENABLE','DISABLE']
     * @param EipStatus Eip开启状态，取值['ENABLE','DISABLE']
     */
    public void setEipStatus(String EipStatus) {
        this.EipStatus = EipStatus;
    }

    public EipConfigIn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EipConfigIn(EipConfigIn source) {
        if (source.EipStatus != null) {
            this.EipStatus = new String(source.EipStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EipStatus", this.EipStatus);

    }
}

