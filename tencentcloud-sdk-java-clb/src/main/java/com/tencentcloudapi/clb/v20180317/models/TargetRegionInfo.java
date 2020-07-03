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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetRegionInfo extends AbstractModel{

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

