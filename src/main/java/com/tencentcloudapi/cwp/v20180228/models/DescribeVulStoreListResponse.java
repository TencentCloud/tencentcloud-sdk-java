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

public class DescribeVulStoreListResponse extends AbstractModel{

    /**
    * 漏洞信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private VulStoreListInfo [] List;

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 今日剩余搜索此时
    */
    @SerializedName("Remaining")
    @Expose
    private Long Remaining;

    /**
    * 免费搜索次数
    */
    @SerializedName("FreeSearchTimes")
    @Expose
    private Long FreeSearchTimes;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 漏洞信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 漏洞信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VulStoreListInfo [] getList() {
        return this.List;
    }

    /**
     * Set 漏洞信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 漏洞信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(VulStoreListInfo [] List) {
        this.List = List;
    }

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 今日剩余搜索此时 
     * @return Remaining 今日剩余搜索此时
     */
    public Long getRemaining() {
        return this.Remaining;
    }

    /**
     * Set 今日剩余搜索此时
     * @param Remaining 今日剩余搜索此时
     */
    public void setRemaining(Long Remaining) {
        this.Remaining = Remaining;
    }

    /**
     * Get 免费搜索次数 
     * @return FreeSearchTimes 免费搜索次数
     */
    public Long getFreeSearchTimes() {
        return this.FreeSearchTimes;
    }

    /**
     * Set 免费搜索次数
     * @param FreeSearchTimes 免费搜索次数
     */
    public void setFreeSearchTimes(Long FreeSearchTimes) {
        this.FreeSearchTimes = FreeSearchTimes;
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

    public DescribeVulStoreListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulStoreListResponse(DescribeVulStoreListResponse source) {
        if (source.List != null) {
            this.List = new VulStoreListInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new VulStoreListInfo(source.List[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Remaining != null) {
            this.Remaining = new Long(source.Remaining);
        }
        if (source.FreeSearchTimes != null) {
            this.FreeSearchTimes = new Long(source.FreeSearchTimes);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Remaining", this.Remaining);
        this.setParamSimple(map, prefix + "FreeSearchTimes", this.FreeSearchTimes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

