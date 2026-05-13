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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmIpCount extends AbstractModel {

    /**
    * 访问Ip个数
    */
    @SerializedName("IpCount")
    @Expose
    private Long IpCount;

    /**
    * 未打标公网Ip个数
    */
    @SerializedName("UnmarkedPublicIpCount")
    @Expose
    private Long UnmarkedPublicIpCount;

    /**
    * 内网Ip个数
    */
    @SerializedName("PrivateIpCount")
    @Expose
    private Long PrivateIpCount;

    /**
     * Get 访问Ip个数 
     * @return IpCount 访问Ip个数
     */
    public Long getIpCount() {
        return this.IpCount;
    }

    /**
     * Set 访问Ip个数
     * @param IpCount 访问Ip个数
     */
    public void setIpCount(Long IpCount) {
        this.IpCount = IpCount;
    }

    /**
     * Get 未打标公网Ip个数 
     * @return UnmarkedPublicIpCount 未打标公网Ip个数
     */
    public Long getUnmarkedPublicIpCount() {
        return this.UnmarkedPublicIpCount;
    }

    /**
     * Set 未打标公网Ip个数
     * @param UnmarkedPublicIpCount 未打标公网Ip个数
     */
    public void setUnmarkedPublicIpCount(Long UnmarkedPublicIpCount) {
        this.UnmarkedPublicIpCount = UnmarkedPublicIpCount;
    }

    /**
     * Get 内网Ip个数 
     * @return PrivateIpCount 内网Ip个数
     */
    public Long getPrivateIpCount() {
        return this.PrivateIpCount;
    }

    /**
     * Set 内网Ip个数
     * @param PrivateIpCount 内网Ip个数
     */
    public void setPrivateIpCount(Long PrivateIpCount) {
        this.PrivateIpCount = PrivateIpCount;
    }

    public DspmIpCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIpCount(DspmIpCount source) {
        if (source.IpCount != null) {
            this.IpCount = new Long(source.IpCount);
        }
        if (source.UnmarkedPublicIpCount != null) {
            this.UnmarkedPublicIpCount = new Long(source.UnmarkedPublicIpCount);
        }
        if (source.PrivateIpCount != null) {
            this.PrivateIpCount = new Long(source.PrivateIpCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpCount", this.IpCount);
        this.setParamSimple(map, prefix + "UnmarkedPublicIpCount", this.UnmarkedPublicIpCount);
        this.setParamSimple(map, prefix + "PrivateIpCount", this.PrivateIpCount);

    }
}

