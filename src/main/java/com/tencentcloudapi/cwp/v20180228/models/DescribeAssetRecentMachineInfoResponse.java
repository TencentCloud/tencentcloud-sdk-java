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

public class DescribeAssetRecentMachineInfoResponse extends AbstractModel{

    /**
    * 总数量列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalList")
    @Expose
    private AssetKeyVal [] TotalList;

    /**
    * 在线数量列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveList")
    @Expose
    private AssetKeyVal [] LiveList;

    /**
    * 离线数量列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineList")
    @Expose
    private AssetKeyVal [] OfflineList;

    /**
    * 风险数量列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskList")
    @Expose
    private AssetKeyVal [] RiskList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数量列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalList 总数量列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetKeyVal [] getTotalList() {
        return this.TotalList;
    }

    /**
     * Set 总数量列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalList 总数量列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalList(AssetKeyVal [] TotalList) {
        this.TotalList = TotalList;
    }

    /**
     * Get 在线数量列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveList 在线数量列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetKeyVal [] getLiveList() {
        return this.LiveList;
    }

    /**
     * Set 在线数量列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveList 在线数量列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveList(AssetKeyVal [] LiveList) {
        this.LiveList = LiveList;
    }

    /**
     * Get 离线数量列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineList 离线数量列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetKeyVal [] getOfflineList() {
        return this.OfflineList;
    }

    /**
     * Set 离线数量列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineList 离线数量列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineList(AssetKeyVal [] OfflineList) {
        this.OfflineList = OfflineList;
    }

    /**
     * Get 风险数量列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskList 风险数量列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetKeyVal [] getRiskList() {
        return this.RiskList;
    }

    /**
     * Set 风险数量列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskList 风险数量列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskList(AssetKeyVal [] RiskList) {
        this.RiskList = RiskList;
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

    public DescribeAssetRecentMachineInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetRecentMachineInfoResponse(DescribeAssetRecentMachineInfoResponse source) {
        if (source.TotalList != null) {
            this.TotalList = new AssetKeyVal[source.TotalList.length];
            for (int i = 0; i < source.TotalList.length; i++) {
                this.TotalList[i] = new AssetKeyVal(source.TotalList[i]);
            }
        }
        if (source.LiveList != null) {
            this.LiveList = new AssetKeyVal[source.LiveList.length];
            for (int i = 0; i < source.LiveList.length; i++) {
                this.LiveList[i] = new AssetKeyVal(source.LiveList[i]);
            }
        }
        if (source.OfflineList != null) {
            this.OfflineList = new AssetKeyVal[source.OfflineList.length];
            for (int i = 0; i < source.OfflineList.length; i++) {
                this.OfflineList[i] = new AssetKeyVal(source.OfflineList[i]);
            }
        }
        if (source.RiskList != null) {
            this.RiskList = new AssetKeyVal[source.RiskList.length];
            for (int i = 0; i < source.RiskList.length; i++) {
                this.RiskList[i] = new AssetKeyVal(source.RiskList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TotalList.", this.TotalList);
        this.setParamArrayObj(map, prefix + "LiveList.", this.LiveList);
        this.setParamArrayObj(map, prefix + "OfflineList.", this.OfflineList);
        this.setParamArrayObj(map, prefix + "RiskList.", this.RiskList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

