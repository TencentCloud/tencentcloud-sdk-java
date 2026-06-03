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

public class DescribeCheckViewRisksResponse extends AbstractModel {

    /**
    * <p>检查视角下风险数量</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>检查视角下风险列表</p>
    */
    @SerializedName("CheckViewRiskList")
    @Expose
    private CheckViewRiskItem [] CheckViewRiskList;

    /**
    * <p>检查视角下cspm规范标签列表</p>
    */
    @SerializedName("StandardNameList")
    @Expose
    private StandardItem [] StandardNameList;

    /**
    * <p>资产类型集合</p>
    */
    @SerializedName("AssetTypeList")
    @Expose
    private AttributeOptionSet [] AssetTypeList;

    /**
    * <p>云厂商类型集合</p>
    */
    @SerializedName("ProviderList")
    @Expose
    private AttributeOptionSet [] ProviderList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>检查视角下风险数量</p> 
     * @return TotalCount <p>检查视角下风险数量</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>检查视角下风险数量</p>
     * @param TotalCount <p>检查视角下风险数量</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>检查视角下风险列表</p> 
     * @return CheckViewRiskList <p>检查视角下风险列表</p>
     */
    public CheckViewRiskItem [] getCheckViewRiskList() {
        return this.CheckViewRiskList;
    }

    /**
     * Set <p>检查视角下风险列表</p>
     * @param CheckViewRiskList <p>检查视角下风险列表</p>
     */
    public void setCheckViewRiskList(CheckViewRiskItem [] CheckViewRiskList) {
        this.CheckViewRiskList = CheckViewRiskList;
    }

    /**
     * Get <p>检查视角下cspm规范标签列表</p> 
     * @return StandardNameList <p>检查视角下cspm规范标签列表</p>
     */
    public StandardItem [] getStandardNameList() {
        return this.StandardNameList;
    }

    /**
     * Set <p>检查视角下cspm规范标签列表</p>
     * @param StandardNameList <p>检查视角下cspm规范标签列表</p>
     */
    public void setStandardNameList(StandardItem [] StandardNameList) {
        this.StandardNameList = StandardNameList;
    }

    /**
     * Get <p>资产类型集合</p> 
     * @return AssetTypeList <p>资产类型集合</p>
     */
    public AttributeOptionSet [] getAssetTypeList() {
        return this.AssetTypeList;
    }

    /**
     * Set <p>资产类型集合</p>
     * @param AssetTypeList <p>资产类型集合</p>
     */
    public void setAssetTypeList(AttributeOptionSet [] AssetTypeList) {
        this.AssetTypeList = AssetTypeList;
    }

    /**
     * Get <p>云厂商类型集合</p> 
     * @return ProviderList <p>云厂商类型集合</p>
     */
    public AttributeOptionSet [] getProviderList() {
        return this.ProviderList;
    }

    /**
     * Set <p>云厂商类型集合</p>
     * @param ProviderList <p>云厂商类型集合</p>
     */
    public void setProviderList(AttributeOptionSet [] ProviderList) {
        this.ProviderList = ProviderList;
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

    public DescribeCheckViewRisksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCheckViewRisksResponse(DescribeCheckViewRisksResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.CheckViewRiskList != null) {
            this.CheckViewRiskList = new CheckViewRiskItem[source.CheckViewRiskList.length];
            for (int i = 0; i < source.CheckViewRiskList.length; i++) {
                this.CheckViewRiskList[i] = new CheckViewRiskItem(source.CheckViewRiskList[i]);
            }
        }
        if (source.StandardNameList != null) {
            this.StandardNameList = new StandardItem[source.StandardNameList.length];
            for (int i = 0; i < source.StandardNameList.length; i++) {
                this.StandardNameList[i] = new StandardItem(source.StandardNameList[i]);
            }
        }
        if (source.AssetTypeList != null) {
            this.AssetTypeList = new AttributeOptionSet[source.AssetTypeList.length];
            for (int i = 0; i < source.AssetTypeList.length; i++) {
                this.AssetTypeList[i] = new AttributeOptionSet(source.AssetTypeList[i]);
            }
        }
        if (source.ProviderList != null) {
            this.ProviderList = new AttributeOptionSet[source.ProviderList.length];
            for (int i = 0; i < source.ProviderList.length; i++) {
                this.ProviderList[i] = new AttributeOptionSet(source.ProviderList[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "CheckViewRiskList.", this.CheckViewRiskList);
        this.setParamArrayObj(map, prefix + "StandardNameList.", this.StandardNameList);
        this.setParamArrayObj(map, prefix + "AssetTypeList.", this.AssetTypeList);
        this.setParamArrayObj(map, prefix + "ProviderList.", this.ProviderList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

