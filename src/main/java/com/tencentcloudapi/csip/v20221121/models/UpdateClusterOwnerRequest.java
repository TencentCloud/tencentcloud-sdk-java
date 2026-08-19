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

public class UpdateClusterOwnerRequest extends AbstractModel {

    /**
    * <p>集群ClusterCaMD5列表</p>
    */
    @SerializedName("ClusterCaMD5List")
    @Expose
    private String [] ClusterCaMD5List;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>负责人名称</p>
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
     * Get <p>集群ClusterCaMD5列表</p> 
     * @return ClusterCaMD5List <p>集群ClusterCaMD5列表</p>
     */
    public String [] getClusterCaMD5List() {
        return this.ClusterCaMD5List;
    }

    /**
     * Set <p>集群ClusterCaMD5列表</p>
     * @param ClusterCaMD5List <p>集群ClusterCaMD5列表</p>
     */
    public void setClusterCaMD5List(String [] ClusterCaMD5List) {
        this.ClusterCaMD5List = ClusterCaMD5List;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>负责人名称</p> 
     * @return OwnerName <p>负责人名称</p>
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set <p>负责人名称</p>
     * @param OwnerName <p>负责人名称</p>
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public UpdateClusterOwnerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateClusterOwnerRequest(UpdateClusterOwnerRequest source) {
        if (source.ClusterCaMD5List != null) {
            this.ClusterCaMD5List = new String[source.ClusterCaMD5List.length];
            for (int i = 0; i < source.ClusterCaMD5List.length; i++) {
                this.ClusterCaMD5List[i] = new String(source.ClusterCaMD5List[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterCaMD5List.", this.ClusterCaMD5List);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);

    }
}

