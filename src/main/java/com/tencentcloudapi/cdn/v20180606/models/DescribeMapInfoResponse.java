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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMapInfoResponse extends AbstractModel {

    /**
    * 映射关系数组。
    */
    @SerializedName("MapInfoList")
    @Expose
    private MapInfo [] MapInfoList;

    /**
    * 服务端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerRegionRelation")
    @Expose
    private RegionMapRelation [] ServerRegionRelation;

    /**
    * 客户端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientRegionRelation")
    @Expose
    private RegionMapRelation [] ClientRegionRelation;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 映射关系数组。 
     * @return MapInfoList 映射关系数组。
     */
    public MapInfo [] getMapInfoList() {
        return this.MapInfoList;
    }

    /**
     * Set 映射关系数组。
     * @param MapInfoList 映射关系数组。
     */
    public void setMapInfoList(MapInfo [] MapInfoList) {
        this.MapInfoList = MapInfoList;
    }

    /**
     * Get 服务端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerRegionRelation 服务端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegionMapRelation [] getServerRegionRelation() {
        return this.ServerRegionRelation;
    }

    /**
     * Set 服务端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerRegionRelation 服务端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerRegionRelation(RegionMapRelation [] ServerRegionRelation) {
        this.ServerRegionRelation = ServerRegionRelation;
    }

    /**
     * Get 客户端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientRegionRelation 客户端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegionMapRelation [] getClientRegionRelation() {
        return this.ClientRegionRelation;
    }

    /**
     * Set 客户端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientRegionRelation 客户端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientRegionRelation(RegionMapRelation [] ClientRegionRelation) {
        this.ClientRegionRelation = ClientRegionRelation;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMapInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMapInfoResponse(DescribeMapInfoResponse source) {
        if (source.MapInfoList != null) {
            this.MapInfoList = new MapInfo[source.MapInfoList.length];
            for (int i = 0; i < source.MapInfoList.length; i++) {
                this.MapInfoList[i] = new MapInfo(source.MapInfoList[i]);
            }
        }
        if (source.ServerRegionRelation != null) {
            this.ServerRegionRelation = new RegionMapRelation[source.ServerRegionRelation.length];
            for (int i = 0; i < source.ServerRegionRelation.length; i++) {
                this.ServerRegionRelation[i] = new RegionMapRelation(source.ServerRegionRelation[i]);
            }
        }
        if (source.ClientRegionRelation != null) {
            this.ClientRegionRelation = new RegionMapRelation[source.ClientRegionRelation.length];
            for (int i = 0; i < source.ClientRegionRelation.length; i++) {
                this.ClientRegionRelation[i] = new RegionMapRelation(source.ClientRegionRelation[i]);
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
        this.setParamArrayObj(map, prefix + "MapInfoList.", this.MapInfoList);
        this.setParamArrayObj(map, prefix + "ServerRegionRelation.", this.ServerRegionRelation);
        this.setParamArrayObj(map, prefix + "ClientRegionRelation.", this.ClientRegionRelation);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

