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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayNodeConfig extends AbstractModel {

    /**
    * 节点配置, 1c2g|2c4g|4c8g|8c16g。
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * 节点数量，2-9。
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
     * Get 节点配置, 1c2g|2c4g|4c8g|8c16g。 
     * @return Specification 节点配置, 1c2g|2c4g|4c8g|8c16g。
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set 节点配置, 1c2g|2c4g|4c8g|8c16g。
     * @param Specification 节点配置, 1c2g|2c4g|4c8g|8c16g。
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get 节点数量，2-9。 
     * @return Number 节点数量，2-9。
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 节点数量，2-9。
     * @param Number 节点数量，2-9。
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    public CloudNativeAPIGatewayNodeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayNodeConfig(CloudNativeAPIGatewayNodeConfig source) {
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "Number", this.Number);

    }
}

