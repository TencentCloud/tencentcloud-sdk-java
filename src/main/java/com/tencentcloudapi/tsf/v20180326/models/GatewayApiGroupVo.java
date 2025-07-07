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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayApiGroupVo extends AbstractModel {

    /**
    * 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 分组下API个数
    */
    @SerializedName("GroupApiCount")
    @Expose
    private Long GroupApiCount;

    /**
    * 分组API列表
    */
    @SerializedName("GroupApis")
    @Expose
    private GatewayGroupApiVo [] GroupApis;

    /**
    * 网关实例的类型
    */
    @SerializedName("GatewayInstanceType")
    @Expose
    private String GatewayInstanceType;

    /**
    * 网关实例ID
    */
    @SerializedName("GatewayInstanceId")
    @Expose
    private String GatewayInstanceId;

    /**
     * Get 分组ID 
     * @return GroupId 分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID
     * @param GroupId 分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 分组名称 
     * @return GroupName 分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称
     * @param GroupName 分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 分组下API个数 
     * @return GroupApiCount 分组下API个数
     */
    public Long getGroupApiCount() {
        return this.GroupApiCount;
    }

    /**
     * Set 分组下API个数
     * @param GroupApiCount 分组下API个数
     */
    public void setGroupApiCount(Long GroupApiCount) {
        this.GroupApiCount = GroupApiCount;
    }

    /**
     * Get 分组API列表 
     * @return GroupApis 分组API列表
     */
    public GatewayGroupApiVo [] getGroupApis() {
        return this.GroupApis;
    }

    /**
     * Set 分组API列表
     * @param GroupApis 分组API列表
     */
    public void setGroupApis(GatewayGroupApiVo [] GroupApis) {
        this.GroupApis = GroupApis;
    }

    /**
     * Get 网关实例的类型 
     * @return GatewayInstanceType 网关实例的类型
     */
    public String getGatewayInstanceType() {
        return this.GatewayInstanceType;
    }

    /**
     * Set 网关实例的类型
     * @param GatewayInstanceType 网关实例的类型
     */
    public void setGatewayInstanceType(String GatewayInstanceType) {
        this.GatewayInstanceType = GatewayInstanceType;
    }

    /**
     * Get 网关实例ID 
     * @return GatewayInstanceId 网关实例ID
     */
    public String getGatewayInstanceId() {
        return this.GatewayInstanceId;
    }

    /**
     * Set 网关实例ID
     * @param GatewayInstanceId 网关实例ID
     */
    public void setGatewayInstanceId(String GatewayInstanceId) {
        this.GatewayInstanceId = GatewayInstanceId;
    }

    public GatewayApiGroupVo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayApiGroupVo(GatewayApiGroupVo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupApiCount != null) {
            this.GroupApiCount = new Long(source.GroupApiCount);
        }
        if (source.GroupApis != null) {
            this.GroupApis = new GatewayGroupApiVo[source.GroupApis.length];
            for (int i = 0; i < source.GroupApis.length; i++) {
                this.GroupApis[i] = new GatewayGroupApiVo(source.GroupApis[i]);
            }
        }
        if (source.GatewayInstanceType != null) {
            this.GatewayInstanceType = new String(source.GatewayInstanceType);
        }
        if (source.GatewayInstanceId != null) {
            this.GatewayInstanceId = new String(source.GatewayInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupApiCount", this.GroupApiCount);
        this.setParamArrayObj(map, prefix + "GroupApis.", this.GroupApis);
        this.setParamSimple(map, prefix + "GatewayInstanceType", this.GatewayInstanceType);
        this.setParamSimple(map, prefix + "GatewayInstanceId", this.GatewayInstanceId);

    }
}

