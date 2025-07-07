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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClientSwitchTraTaskInfoRequest extends AbstractModel {

    /**
    * 代客UIN
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;

    /**
    * 1：代理，2：代采
    */
    @SerializedName("SwitchType")
    @Expose
    private Long SwitchType;

    /**
     * Get 代客UIN 
     * @return ClientUin 代客UIN
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 代客UIN
     * @param ClientUin 代客UIN
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 1：代理，2：代采 
     * @return SwitchType 1：代理，2：代采
     */
    public Long getSwitchType() {
        return this.SwitchType;
    }

    /**
     * Set 1：代理，2：代采
     * @param SwitchType 1：代理，2：代采
     */
    public void setSwitchType(Long SwitchType) {
        this.SwitchType = SwitchType;
    }

    public DescribeClientSwitchTraTaskInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClientSwitchTraTaskInfoRequest(DescribeClientSwitchTraTaskInfoRequest source) {
        if (source.ClientUin != null) {
            this.ClientUin = new String(source.ClientUin);
        }
        if (source.SwitchType != null) {
            this.SwitchType = new Long(source.SwitchType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "SwitchType", this.SwitchType);

    }
}

