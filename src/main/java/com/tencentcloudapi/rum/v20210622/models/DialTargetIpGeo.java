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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DialTargetIpGeo extends AbstractModel {

    /**
    * <p>目标 IP，与 TargetIps 中的地址一致</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>目标 IP 所在地区。无法解析时为未知。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>目标 IP 所属运营商。无法解析时为未知。</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get <p>目标 IP，与 TargetIps 中的地址一致</p> 
     * @return Ip <p>目标 IP，与 TargetIps 中的地址一致</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>目标 IP，与 TargetIps 中的地址一致</p>
     * @param Ip <p>目标 IP，与 TargetIps 中的地址一致</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>目标 IP 所在地区。无法解析时为未知。</p> 
     * @return Region <p>目标 IP 所在地区。无法解析时为未知。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>目标 IP 所在地区。无法解析时为未知。</p>
     * @param Region <p>目标 IP 所在地区。无法解析时为未知。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>目标 IP 所属运营商。无法解析时为未知。</p> 
     * @return Operator <p>目标 IP 所属运营商。无法解析时为未知。</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>目标 IP 所属运营商。无法解析时为未知。</p>
     * @param Operator <p>目标 IP 所属运营商。无法解析时为未知。</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public DialTargetIpGeo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DialTargetIpGeo(DialTargetIpGeo source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

