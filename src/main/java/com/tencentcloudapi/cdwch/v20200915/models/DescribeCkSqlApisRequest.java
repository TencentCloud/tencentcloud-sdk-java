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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCkSqlApisRequest extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * api接口名称
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * 集群名称
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 用户名称
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get api接口名称 
     * @return ApiType api接口名称
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set api接口名称
     * @param ApiType api接口名称
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get 集群名称 
     * @return Cluster 集群名称
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set 集群名称
     * @param Cluster 集群名称
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get 用户名称 
     * @return UserName 用户名称
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名称
     * @param UserName 用户名称
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public DescribeCkSqlApisRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCkSqlApisRequest(DescribeCkSqlApisRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.Cluster != null) {
            this.Cluster = new String(source.Cluster);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

