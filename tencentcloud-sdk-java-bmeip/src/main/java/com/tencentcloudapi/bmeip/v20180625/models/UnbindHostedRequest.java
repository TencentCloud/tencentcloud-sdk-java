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

public class UnbindHostedRequest extends AbstractModel{

    /**
    * 托管机器实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Eip实例ID，可通过DescribeBmEip 接口返回字段中的 eipId获取。Eip和EipId参数必须要填写一个。
    */
    @SerializedName("EipId")
    @Expose
    private String EipId;

    /**
    * 弹性IP。Eip和EipId参数必须要填写一个。
    */
    @SerializedName("Eip")
    @Expose
    private String Eip;

    /**
     * Get 托管机器实例ID 
     * @return InstanceId 托管机器实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 托管机器实例ID
     * @param InstanceId 托管机器实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Eip实例ID，可通过DescribeBmEip 接口返回字段中的 eipId获取。Eip和EipId参数必须要填写一个。 
     * @return EipId Eip实例ID，可通过DescribeBmEip 接口返回字段中的 eipId获取。Eip和EipId参数必须要填写一个。
     */
    public String getEipId() {
        return this.EipId;
    }

    /**
     * Set Eip实例ID，可通过DescribeBmEip 接口返回字段中的 eipId获取。Eip和EipId参数必须要填写一个。
     * @param EipId Eip实例ID，可通过DescribeBmEip 接口返回字段中的 eipId获取。Eip和EipId参数必须要填写一个。
     */
    public void setEipId(String EipId) {
        this.EipId = EipId;
    }

    /**
     * Get 弹性IP。Eip和EipId参数必须要填写一个。 
     * @return Eip 弹性IP。Eip和EipId参数必须要填写一个。
     */
    public String getEip() {
        return this.Eip;
    }

    /**
     * Set 弹性IP。Eip和EipId参数必须要填写一个。
     * @param Eip 弹性IP。Eip和EipId参数必须要填写一个。
     */
    public void setEip(String Eip) {
        this.Eip = Eip;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EipId", this.EipId);
        this.setParamSimple(map, prefix + "Eip", this.Eip);

    }
}

