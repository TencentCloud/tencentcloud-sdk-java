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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulListResponse extends AbstractModel{

    /**
    * 漏洞列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulInfoList")
    @Expose
    private VulInfoList [] VulInfoList;

    /**
    * 漏洞总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 重点关注漏洞总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowVulCount")
    @Expose
    private Long FollowVulCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 漏洞列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulInfoList 漏洞列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VulInfoList [] getVulInfoList() {
        return this.VulInfoList;
    }

    /**
     * Set 漏洞列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulInfoList 漏洞列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulInfoList(VulInfoList [] VulInfoList) {
        this.VulInfoList = VulInfoList;
    }

    /**
     * Get 漏洞总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 漏洞总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 漏洞总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 漏洞总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 重点关注漏洞总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowVulCount 重点关注漏洞总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFollowVulCount() {
        return this.FollowVulCount;
    }

    /**
     * Set 重点关注漏洞总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowVulCount 重点关注漏洞总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowVulCount(Long FollowVulCount) {
        this.FollowVulCount = FollowVulCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVulListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulListResponse(DescribeVulListResponse source) {
        if (source.VulInfoList != null) {
            this.VulInfoList = new VulInfoList[source.VulInfoList.length];
            for (int i = 0; i < source.VulInfoList.length; i++) {
                this.VulInfoList[i] = new VulInfoList(source.VulInfoList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.FollowVulCount != null) {
            this.FollowVulCount = new Long(source.FollowVulCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VulInfoList.", this.VulInfoList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "FollowVulCount", this.FollowVulCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

