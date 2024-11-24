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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleCNOutUpInstanceRequest extends AbstractModel {

    /**
    * 实例唯一ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * warehouse名称
    */
    @SerializedName("VirtualCluster")
    @Expose
    private String VirtualCluster;

    /**
    * 子网id
    */
    @SerializedName("UserSubnetID")
    @Expose
    private String UserSubnetID;

    /**
    * 新的warehouse的个数
    */
    @SerializedName("NewCount")
    @Expose
    private Long NewCount;

    /**
    * 集群的规格2X-Small、X-Small、Small
    */
    @SerializedName("NewSpecName")
    @Expose
    private String NewSpecName;

    /**
     * Get 实例唯一ID 
     * @return InstanceId 实例唯一ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例唯一ID
     * @param InstanceId 实例唯一ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get warehouse名称 
     * @return VirtualCluster warehouse名称
     */
    public String getVirtualCluster() {
        return this.VirtualCluster;
    }

    /**
     * Set warehouse名称
     * @param VirtualCluster warehouse名称
     */
    public void setVirtualCluster(String VirtualCluster) {
        this.VirtualCluster = VirtualCluster;
    }

    /**
     * Get 子网id 
     * @return UserSubnetID 子网id
     */
    public String getUserSubnetID() {
        return this.UserSubnetID;
    }

    /**
     * Set 子网id
     * @param UserSubnetID 子网id
     */
    public void setUserSubnetID(String UserSubnetID) {
        this.UserSubnetID = UserSubnetID;
    }

    /**
     * Get 新的warehouse的个数 
     * @return NewCount 新的warehouse的个数
     */
    public Long getNewCount() {
        return this.NewCount;
    }

    /**
     * Set 新的warehouse的个数
     * @param NewCount 新的warehouse的个数
     */
    public void setNewCount(Long NewCount) {
        this.NewCount = NewCount;
    }

    /**
     * Get 集群的规格2X-Small、X-Small、Small 
     * @return NewSpecName 集群的规格2X-Small、X-Small、Small
     */
    public String getNewSpecName() {
        return this.NewSpecName;
    }

    /**
     * Set 集群的规格2X-Small、X-Small、Small
     * @param NewSpecName 集群的规格2X-Small、X-Small、Small
     */
    public void setNewSpecName(String NewSpecName) {
        this.NewSpecName = NewSpecName;
    }

    public ScaleCNOutUpInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleCNOutUpInstanceRequest(ScaleCNOutUpInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualCluster != null) {
            this.VirtualCluster = new String(source.VirtualCluster);
        }
        if (source.UserSubnetID != null) {
            this.UserSubnetID = new String(source.UserSubnetID);
        }
        if (source.NewCount != null) {
            this.NewCount = new Long(source.NewCount);
        }
        if (source.NewSpecName != null) {
            this.NewSpecName = new String(source.NewSpecName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualCluster", this.VirtualCluster);
        this.setParamSimple(map, prefix + "UserSubnetID", this.UserSubnetID);
        this.setParamSimple(map, prefix + "NewCount", this.NewCount);
        this.setParamSimple(map, prefix + "NewSpecName", this.NewSpecName);

    }
}

