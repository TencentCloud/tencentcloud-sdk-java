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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInputHLSPullSettings extends AbstractModel{

    /**
    * HLS源站地址信息。
    */
    @SerializedName("SourceAddresses")
    @Expose
    private DescribeHLSPullSourceAddress [] SourceAddresses;

    /**
     * Get HLS源站地址信息。 
     * @return SourceAddresses HLS源站地址信息。
     */
    public DescribeHLSPullSourceAddress [] getSourceAddresses() {
        return this.SourceAddresses;
    }

    /**
     * Set HLS源站地址信息。
     * @param SourceAddresses HLS源站地址信息。
     */
    public void setSourceAddresses(DescribeHLSPullSourceAddress [] SourceAddresses) {
        this.SourceAddresses = SourceAddresses;
    }

    public DescribeInputHLSPullSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInputHLSPullSettings(DescribeInputHLSPullSettings source) {
        if (source.SourceAddresses != null) {
            this.SourceAddresses = new DescribeHLSPullSourceAddress[source.SourceAddresses.length];
            for (int i = 0; i < source.SourceAddresses.length; i++) {
                this.SourceAddresses[i] = new DescribeHLSPullSourceAddress(source.SourceAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SourceAddresses.", this.SourceAddresses);

    }
}

