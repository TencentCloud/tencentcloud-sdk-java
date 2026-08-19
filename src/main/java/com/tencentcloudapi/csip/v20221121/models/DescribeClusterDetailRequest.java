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

public class DescribeClusterDetailRequest extends AbstractModel {

    /**
    * <p>集群资产id</p>
    */
    @SerializedName("ClusterAssetId")
    @Expose
    private String ClusterAssetId;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>集群ca证书md5值，集群的唯一标识</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
     * Get <p>集群资产id</p> 
     * @return ClusterAssetId <p>集群资产id</p>
     * @deprecated
     */
    @Deprecated
    public String getClusterAssetId() {
        return this.ClusterAssetId;
    }

    /**
     * Set <p>集群资产id</p>
     * @param ClusterAssetId <p>集群资产id</p>
     * @deprecated
     */
    @Deprecated
    public void setClusterAssetId(String ClusterAssetId) {
        this.ClusterAssetId = ClusterAssetId;
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
     * Get <p>集群ca证书md5值，集群的唯一标识</p> 
     * @return ClusterCaMD5 <p>集群ca证书md5值，集群的唯一标识</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>集群ca证书md5值，集群的唯一标识</p>
     * @param ClusterCaMD5 <p>集群ca证书md5值，集群的唯一标识</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    public DescribeClusterDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterDetailRequest(DescribeClusterDetailRequest source) {
        if (source.ClusterAssetId != null) {
            this.ClusterAssetId = new String(source.ClusterAssetId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterAssetId", this.ClusterAssetId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);

    }
}

