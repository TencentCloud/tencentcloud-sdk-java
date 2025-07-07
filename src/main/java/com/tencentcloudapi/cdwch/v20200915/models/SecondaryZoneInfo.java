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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecondaryZoneInfo extends AbstractModel {

    /**
    * 副可用区
    */
    @SerializedName("SecondaryZone")
    @Expose
    private String SecondaryZone;

    /**
    * 可用区可用的子网id
    */
    @SerializedName("SecondarySubnet")
    @Expose
    private String SecondarySubnet;

    /**
    * 可用区可用的子网可用ip的数量
    */
    @SerializedName("UserIpNum")
    @Expose
    private String UserIpNum;

    /**
    * 可用区可用的子网可用ip的数量
    */
    @SerializedName("SecondaryUserSubnetIPNum")
    @Expose
    private Long SecondaryUserSubnetIPNum;

    /**
     * Get 副可用区 
     * @return SecondaryZone 副可用区
     */
    public String getSecondaryZone() {
        return this.SecondaryZone;
    }

    /**
     * Set 副可用区
     * @param SecondaryZone 副可用区
     */
    public void setSecondaryZone(String SecondaryZone) {
        this.SecondaryZone = SecondaryZone;
    }

    /**
     * Get 可用区可用的子网id 
     * @return SecondarySubnet 可用区可用的子网id
     */
    public String getSecondarySubnet() {
        return this.SecondarySubnet;
    }

    /**
     * Set 可用区可用的子网id
     * @param SecondarySubnet 可用区可用的子网id
     */
    public void setSecondarySubnet(String SecondarySubnet) {
        this.SecondarySubnet = SecondarySubnet;
    }

    /**
     * Get 可用区可用的子网可用ip的数量 
     * @return UserIpNum 可用区可用的子网可用ip的数量
     */
    public String getUserIpNum() {
        return this.UserIpNum;
    }

    /**
     * Set 可用区可用的子网可用ip的数量
     * @param UserIpNum 可用区可用的子网可用ip的数量
     */
    public void setUserIpNum(String UserIpNum) {
        this.UserIpNum = UserIpNum;
    }

    /**
     * Get 可用区可用的子网可用ip的数量 
     * @return SecondaryUserSubnetIPNum 可用区可用的子网可用ip的数量
     */
    public Long getSecondaryUserSubnetIPNum() {
        return this.SecondaryUserSubnetIPNum;
    }

    /**
     * Set 可用区可用的子网可用ip的数量
     * @param SecondaryUserSubnetIPNum 可用区可用的子网可用ip的数量
     */
    public void setSecondaryUserSubnetIPNum(Long SecondaryUserSubnetIPNum) {
        this.SecondaryUserSubnetIPNum = SecondaryUserSubnetIPNum;
    }

    public SecondaryZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecondaryZoneInfo(SecondaryZoneInfo source) {
        if (source.SecondaryZone != null) {
            this.SecondaryZone = new String(source.SecondaryZone);
        }
        if (source.SecondarySubnet != null) {
            this.SecondarySubnet = new String(source.SecondarySubnet);
        }
        if (source.UserIpNum != null) {
            this.UserIpNum = new String(source.UserIpNum);
        }
        if (source.SecondaryUserSubnetIPNum != null) {
            this.SecondaryUserSubnetIPNum = new Long(source.SecondaryUserSubnetIPNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecondaryZone", this.SecondaryZone);
        this.setParamSimple(map, prefix + "SecondarySubnet", this.SecondarySubnet);
        this.setParamSimple(map, prefix + "UserIpNum", this.UserIpNum);
        this.setParamSimple(map, prefix + "SecondaryUserSubnetIPNum", this.SecondaryUserSubnetIPNum);

    }
}

