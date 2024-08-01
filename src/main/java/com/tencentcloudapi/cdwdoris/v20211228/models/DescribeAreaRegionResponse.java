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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAreaRegionResponse extends AbstractModel {

    /**
    * 地域列表
    */
    @SerializedName("Items")
    @Expose
    private RegionAreaInfo [] Items;

    /**
    * 前端规则描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrontEndRules")
    @Expose
    private FrontEndRule [] FrontEndRules;

    /**
    * 返回可用的白名单名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableWhiteListNames")
    @Expose
    private String [] AvailableWhiteListNames;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 地域列表 
     * @return Items 地域列表
     */
    public RegionAreaInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set 地域列表
     * @param Items 地域列表
     */
    public void setItems(RegionAreaInfo [] Items) {
        this.Items = Items;
    }

    /**
     * Get 前端规则描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrontEndRules 前端规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FrontEndRule [] getFrontEndRules() {
        return this.FrontEndRules;
    }

    /**
     * Set 前端规则描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrontEndRules 前端规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrontEndRules(FrontEndRule [] FrontEndRules) {
        this.FrontEndRules = FrontEndRules;
    }

    /**
     * Get 返回可用的白名单名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableWhiteListNames 返回可用的白名单名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAvailableWhiteListNames() {
        return this.AvailableWhiteListNames;
    }

    /**
     * Set 返回可用的白名单名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableWhiteListNames 返回可用的白名单名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableWhiteListNames(String [] AvailableWhiteListNames) {
        this.AvailableWhiteListNames = AvailableWhiteListNames;
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

    public DescribeAreaRegionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAreaRegionResponse(DescribeAreaRegionResponse source) {
        if (source.Items != null) {
            this.Items = new RegionAreaInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new RegionAreaInfo(source.Items[i]);
            }
        }
        if (source.FrontEndRules != null) {
            this.FrontEndRules = new FrontEndRule[source.FrontEndRules.length];
            for (int i = 0; i < source.FrontEndRules.length; i++) {
                this.FrontEndRules[i] = new FrontEndRule(source.FrontEndRules[i]);
            }
        }
        if (source.AvailableWhiteListNames != null) {
            this.AvailableWhiteListNames = new String[source.AvailableWhiteListNames.length];
            for (int i = 0; i < source.AvailableWhiteListNames.length; i++) {
                this.AvailableWhiteListNames[i] = new String(source.AvailableWhiteListNames[i]);
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
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamArrayObj(map, prefix + "FrontEndRules.", this.FrontEndRules);
        this.setParamArraySimple(map, prefix + "AvailableWhiteListNames.", this.AvailableWhiteListNames);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

