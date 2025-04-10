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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublicAddressConfigResult extends AbstractModel {

    /**
    * 网关实例id
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 公网地址信息
    */
    @SerializedName("ConfigList")
    @Expose
    private PublicAddressConfig [] ConfigList;

    /**
    * 总个数	
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 网关实例id 
     * @return GatewayId 网关实例id
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关实例id
     * @param GatewayId 网关实例id
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 公网地址信息 
     * @return ConfigList 公网地址信息
     */
    public PublicAddressConfig [] getConfigList() {
        return this.ConfigList;
    }

    /**
     * Set 公网地址信息
     * @param ConfigList 公网地址信息
     */
    public void setConfigList(PublicAddressConfig [] ConfigList) {
        this.ConfigList = ConfigList;
    }

    /**
     * Get 总个数	 
     * @return TotalCount 总个数	
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总个数	
     * @param TotalCount 总个数	
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public DescribePublicAddressConfigResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicAddressConfigResult(DescribePublicAddressConfigResult source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ConfigList != null) {
            this.ConfigList = new PublicAddressConfig[source.ConfigList.length];
            for (int i = 0; i < source.ConfigList.length; i++) {
                this.ConfigList[i] = new PublicAddressConfig(source.ConfigList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamArrayObj(map, prefix + "ConfigList.", this.ConfigList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

