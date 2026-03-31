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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpWhitelistDTO extends AbstractModel {

    /**
    * <p>放通IP或网段</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>描述</p>
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

    /**
     * Get <p>放通IP或网段</p> 
     * @return CidrBlock <p>放通IP或网段</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>放通IP或网段</p>
     * @param CidrBlock <p>放通IP或网段</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>描述</p> 
     * @return PolicyDescription <p>描述</p>
     */
    public String getPolicyDescription() {
        return this.PolicyDescription;
    }

    /**
     * Set <p>描述</p>
     * @param PolicyDescription <p>描述</p>
     */
    public void setPolicyDescription(String PolicyDescription) {
        this.PolicyDescription = PolicyDescription;
    }

    public IpWhitelistDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpWhitelistDTO(IpWhitelistDTO source) {
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.PolicyDescription != null) {
            this.PolicyDescription = new String(source.PolicyDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);

    }
}

