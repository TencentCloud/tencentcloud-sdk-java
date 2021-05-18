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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcInfo extends AbstractModel{

    /**
    * VpcId： vpc-xadsafsdasd
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Vpc所属地区: ap-guangzhou, ap-shanghai
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get VpcId： vpc-xadsafsdasd 
     * @return UniqVpcId VpcId： vpc-xadsafsdasd
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VpcId： vpc-xadsafsdasd
     * @param UniqVpcId VpcId： vpc-xadsafsdasd
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Vpc所属地区: ap-guangzhou, ap-shanghai 
     * @return Region Vpc所属地区: ap-guangzhou, ap-shanghai
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Vpc所属地区: ap-guangzhou, ap-shanghai
     * @param Region Vpc所属地区: ap-guangzhou, ap-shanghai
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public VpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcInfo(VpcInfo source) {
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

