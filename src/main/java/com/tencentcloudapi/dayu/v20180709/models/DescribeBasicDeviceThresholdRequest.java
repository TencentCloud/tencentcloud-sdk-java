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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBasicDeviceThresholdRequest extends AbstractModel {

    /**
    * 查询的IP地址，取值如：1.1.1.1
    */
    @SerializedName("BasicIp")
    @Expose
    private String BasicIp;

    /**
    * 查询IP所属地域，取值如：gz、bj、sh、hk等地域缩写
    */
    @SerializedName("BasicRegion")
    @Expose
    private String BasicRegion;

    /**
    * 专区类型，取值如：公有云专区：public，黑石专区：bm, NAT服务器专区：nat，互联网通道：channel。
    */
    @SerializedName("BasicBizType")
    @Expose
    private String BasicBizType;

    /**
    * 设备类型，取值如：服务器：cvm，公有云负载均衡：clb，黑石负载均衡：lb，NAT服务器：nat，互联网通道：channel.
    */
    @SerializedName("BasicDeviceType")
    @Expose
    private String BasicDeviceType;

    /**
    * 有效性检查，取值为1
    */
    @SerializedName("BasicCheckFlag")
    @Expose
    private Long BasicCheckFlag;

    /**
    * 可选，IPInstance Nat 网关（如果查询的设备类型是NAT服务器，需要传此参数，通过nat资源查询接口获取）
    */
    @SerializedName("BasicIpInstance")
    @Expose
    private String BasicIpInstance;

    /**
    * 可选，运营商线路（如果查询的设备类型是NAT服务器，需要传此参数为5）
    */
    @SerializedName("BasicIspCode")
    @Expose
    private Long BasicIspCode;

    /**
     * Get 查询的IP地址，取值如：1.1.1.1 
     * @return BasicIp 查询的IP地址，取值如：1.1.1.1
     */
    public String getBasicIp() {
        return this.BasicIp;
    }

    /**
     * Set 查询的IP地址，取值如：1.1.1.1
     * @param BasicIp 查询的IP地址，取值如：1.1.1.1
     */
    public void setBasicIp(String BasicIp) {
        this.BasicIp = BasicIp;
    }

    /**
     * Get 查询IP所属地域，取值如：gz、bj、sh、hk等地域缩写 
     * @return BasicRegion 查询IP所属地域，取值如：gz、bj、sh、hk等地域缩写
     */
    public String getBasicRegion() {
        return this.BasicRegion;
    }

    /**
     * Set 查询IP所属地域，取值如：gz、bj、sh、hk等地域缩写
     * @param BasicRegion 查询IP所属地域，取值如：gz、bj、sh、hk等地域缩写
     */
    public void setBasicRegion(String BasicRegion) {
        this.BasicRegion = BasicRegion;
    }

    /**
     * Get 专区类型，取值如：公有云专区：public，黑石专区：bm, NAT服务器专区：nat，互联网通道：channel。 
     * @return BasicBizType 专区类型，取值如：公有云专区：public，黑石专区：bm, NAT服务器专区：nat，互联网通道：channel。
     */
    public String getBasicBizType() {
        return this.BasicBizType;
    }

    /**
     * Set 专区类型，取值如：公有云专区：public，黑石专区：bm, NAT服务器专区：nat，互联网通道：channel。
     * @param BasicBizType 专区类型，取值如：公有云专区：public，黑石专区：bm, NAT服务器专区：nat，互联网通道：channel。
     */
    public void setBasicBizType(String BasicBizType) {
        this.BasicBizType = BasicBizType;
    }

    /**
     * Get 设备类型，取值如：服务器：cvm，公有云负载均衡：clb，黑石负载均衡：lb，NAT服务器：nat，互联网通道：channel. 
     * @return BasicDeviceType 设备类型，取值如：服务器：cvm，公有云负载均衡：clb，黑石负载均衡：lb，NAT服务器：nat，互联网通道：channel.
     */
    public String getBasicDeviceType() {
        return this.BasicDeviceType;
    }

    /**
     * Set 设备类型，取值如：服务器：cvm，公有云负载均衡：clb，黑石负载均衡：lb，NAT服务器：nat，互联网通道：channel.
     * @param BasicDeviceType 设备类型，取值如：服务器：cvm，公有云负载均衡：clb，黑石负载均衡：lb，NAT服务器：nat，互联网通道：channel.
     */
    public void setBasicDeviceType(String BasicDeviceType) {
        this.BasicDeviceType = BasicDeviceType;
    }

    /**
     * Get 有效性检查，取值为1 
     * @return BasicCheckFlag 有效性检查，取值为1
     */
    public Long getBasicCheckFlag() {
        return this.BasicCheckFlag;
    }

    /**
     * Set 有效性检查，取值为1
     * @param BasicCheckFlag 有效性检查，取值为1
     */
    public void setBasicCheckFlag(Long BasicCheckFlag) {
        this.BasicCheckFlag = BasicCheckFlag;
    }

    /**
     * Get 可选，IPInstance Nat 网关（如果查询的设备类型是NAT服务器，需要传此参数，通过nat资源查询接口获取） 
     * @return BasicIpInstance 可选，IPInstance Nat 网关（如果查询的设备类型是NAT服务器，需要传此参数，通过nat资源查询接口获取）
     */
    public String getBasicIpInstance() {
        return this.BasicIpInstance;
    }

    /**
     * Set 可选，IPInstance Nat 网关（如果查询的设备类型是NAT服务器，需要传此参数，通过nat资源查询接口获取）
     * @param BasicIpInstance 可选，IPInstance Nat 网关（如果查询的设备类型是NAT服务器，需要传此参数，通过nat资源查询接口获取）
     */
    public void setBasicIpInstance(String BasicIpInstance) {
        this.BasicIpInstance = BasicIpInstance;
    }

    /**
     * Get 可选，运营商线路（如果查询的设备类型是NAT服务器，需要传此参数为5） 
     * @return BasicIspCode 可选，运营商线路（如果查询的设备类型是NAT服务器，需要传此参数为5）
     */
    public Long getBasicIspCode() {
        return this.BasicIspCode;
    }

    /**
     * Set 可选，运营商线路（如果查询的设备类型是NAT服务器，需要传此参数为5）
     * @param BasicIspCode 可选，运营商线路（如果查询的设备类型是NAT服务器，需要传此参数为5）
     */
    public void setBasicIspCode(Long BasicIspCode) {
        this.BasicIspCode = BasicIspCode;
    }

    public DescribeBasicDeviceThresholdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBasicDeviceThresholdRequest(DescribeBasicDeviceThresholdRequest source) {
        if (source.BasicIp != null) {
            this.BasicIp = new String(source.BasicIp);
        }
        if (source.BasicRegion != null) {
            this.BasicRegion = new String(source.BasicRegion);
        }
        if (source.BasicBizType != null) {
            this.BasicBizType = new String(source.BasicBizType);
        }
        if (source.BasicDeviceType != null) {
            this.BasicDeviceType = new String(source.BasicDeviceType);
        }
        if (source.BasicCheckFlag != null) {
            this.BasicCheckFlag = new Long(source.BasicCheckFlag);
        }
        if (source.BasicIpInstance != null) {
            this.BasicIpInstance = new String(source.BasicIpInstance);
        }
        if (source.BasicIspCode != null) {
            this.BasicIspCode = new Long(source.BasicIspCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BasicIp", this.BasicIp);
        this.setParamSimple(map, prefix + "BasicRegion", this.BasicRegion);
        this.setParamSimple(map, prefix + "BasicBizType", this.BasicBizType);
        this.setParamSimple(map, prefix + "BasicDeviceType", this.BasicDeviceType);
        this.setParamSimple(map, prefix + "BasicCheckFlag", this.BasicCheckFlag);
        this.setParamSimple(map, prefix + "BasicIpInstance", this.BasicIpInstance);
        this.setParamSimple(map, prefix + "BasicIspCode", this.BasicIspCode);

    }
}

