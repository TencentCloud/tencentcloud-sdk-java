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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceReleaseVersion extends AbstractModel {

    /**
    * 发布版本总数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 发布版本列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionList")
    @Expose
    private DescribeServiceReleaseVersionResultVersionListInfo [] VersionList;

    /**
     * Get 发布版本总数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 发布版本总数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 发布版本总数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 发布版本总数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 发布版本列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionList 发布版本列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeServiceReleaseVersionResultVersionListInfo [] getVersionList() {
        return this.VersionList;
    }

    /**
     * Set 发布版本列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionList 发布版本列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionList(DescribeServiceReleaseVersionResultVersionListInfo [] VersionList) {
        this.VersionList = VersionList;
    }

    public ServiceReleaseVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceReleaseVersion(ServiceReleaseVersion source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VersionList != null) {
            this.VersionList = new DescribeServiceReleaseVersionResultVersionListInfo[source.VersionList.length];
            for (int i = 0; i < source.VersionList.length; i++) {
                this.VersionList[i] = new DescribeServiceReleaseVersionResultVersionListInfo(source.VersionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "VersionList.", this.VersionList);

    }
}

