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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceConfigLicense extends AbstractModel {

    /**
    * 功能
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Function")
    @Expose
    private DescribeResourceConfigLicenseFunction [] Function;

    /**
    * 资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private DescribeResourceConfigLicenseResource [] Resource;

    /**
    * utc时间 单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * utc时间 单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Countdown")
    @Expose
    private Long Countdown;

    /**
    * 规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
     * Get 功能
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Function 功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeResourceConfigLicenseFunction [] getFunction() {
        return this.Function;
    }

    /**
     * Set 功能
注意：此字段可能返回 null，表示取不到有效值。
     * @param Function 功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunction(DescribeResourceConfigLicenseFunction [] Function) {
        this.Function = Function;
    }

    /**
     * Get 资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeResourceConfigLicenseResource [] getResource() {
        return this.Resource;
    }

    /**
     * Set 资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(DescribeResourceConfigLicenseResource [] Resource) {
        this.Resource = Resource;
    }

    /**
     * Get utc时间 单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime utc时间 单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set utc时间 单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime utc时间 单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get utc时间 单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Countdown utc时间 单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCountdown() {
        return this.Countdown;
    }

    /**
     * Set utc时间 单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Countdown utc时间 单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountdown(Long Countdown) {
        this.Countdown = Countdown;
    }

    /**
     * Get 规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Spec 规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Spec 规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    public DescribeResourceConfigLicense() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceConfigLicense(DescribeResourceConfigLicense source) {
        if (source.Function != null) {
            this.Function = new DescribeResourceConfigLicenseFunction[source.Function.length];
            for (int i = 0; i < source.Function.length; i++) {
                this.Function[i] = new DescribeResourceConfigLicenseFunction(source.Function[i]);
            }
        }
        if (source.Resource != null) {
            this.Resource = new DescribeResourceConfigLicenseResource[source.Resource.length];
            for (int i = 0; i < source.Resource.length; i++) {
                this.Resource[i] = new DescribeResourceConfigLicenseResource(source.Resource[i]);
            }
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.Countdown != null) {
            this.Countdown = new Long(source.Countdown);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Function.", this.Function);
        this.setParamArrayObj(map, prefix + "Resource.", this.Resource);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Countdown", this.Countdown);
        this.setParamSimple(map, prefix + "Spec", this.Spec);

    }
}

