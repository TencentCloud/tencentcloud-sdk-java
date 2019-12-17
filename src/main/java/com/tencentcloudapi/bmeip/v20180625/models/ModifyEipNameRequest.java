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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEipNameRequest extends AbstractModel{

    /**
    * Eip实例ID，可通过/v2/DescribeEip 接口返回字段中的 eipId获取
    */
    @SerializedName("EipId")
    @Expose
    private String EipId;

    /**
    * EIP 实例别名
    */
    @SerializedName("EipName")
    @Expose
    private String EipName;

    /**
     * Get Eip实例ID，可通过/v2/DescribeEip 接口返回字段中的 eipId获取 
     * @return EipId Eip实例ID，可通过/v2/DescribeEip 接口返回字段中的 eipId获取
     */
    public String getEipId() {
        return this.EipId;
    }

    /**
     * Set Eip实例ID，可通过/v2/DescribeEip 接口返回字段中的 eipId获取
     * @param EipId Eip实例ID，可通过/v2/DescribeEip 接口返回字段中的 eipId获取
     */
    public void setEipId(String EipId) {
        this.EipId = EipId;
    }

    /**
     * Get EIP 实例别名 
     * @return EipName EIP 实例别名
     */
    public String getEipName() {
        return this.EipName;
    }

    /**
     * Set EIP 实例别名
     * @param EipName EIP 实例别名
     */
    public void setEipName(String EipName) {
        this.EipName = EipName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EipId", this.EipId);
        this.setParamSimple(map, prefix + "EipName", this.EipName);

    }
}

