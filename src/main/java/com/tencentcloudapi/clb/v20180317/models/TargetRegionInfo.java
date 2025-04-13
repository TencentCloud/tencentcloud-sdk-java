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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetRegionInfo extends AbstractModel {

    /**
    * Target所属地域，如 ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Target所属网络，私有网络格式如 vpc-abcd1234，如果是基础网络，则为"0"
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Target所属网络，私有网络格式如86323，如果是基础网络，则为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
     * Get Target所属地域，如 ap-guangzhou 
     * @return Region Target所属地域，如 ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Target所属地域，如 ap-guangzhou
     * @param Region Target所属地域，如 ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Target所属网络，私有网络格式如 vpc-abcd1234，如果是基础网络，则为"0" 
     * @return VpcId Target所属网络，私有网络格式如 vpc-abcd1234，如果是基础网络，则为"0"
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Target所属网络，私有网络格式如 vpc-abcd1234，如果是基础网络，则为"0"
     * @param VpcId Target所属网络，私有网络格式如 vpc-abcd1234，如果是基础网络，则为"0"
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Target所属网络，私有网络格式如86323，如果是基础网络，则为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumericalVpcId Target所属网络，私有网络格式如86323，如果是基础网络，则为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set Target所属网络，私有网络格式如86323，如果是基础网络，则为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumericalVpcId Target所属网络，私有网络格式如86323，如果是基础网络，则为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    public TargetRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetRegionInfo(TargetRegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.NumericalVpcId != null) {
            this.NumericalVpcId = new Long(source.NumericalVpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NumericalVpcId", this.NumericalVpcId);

    }
}

