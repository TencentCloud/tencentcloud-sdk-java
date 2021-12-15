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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLivePackageInfoResponse extends AbstractModel{

    /**
    * 套餐包信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivePackageInfoList")
    @Expose
    private LivePackageInfo [] LivePackageInfoList;

    /**
    * 套餐包当前计费方式:
-1: 无计费方式或获取失败
0: 无计费方式
201: 月结带宽
202: 月结流量
203: 日结带宽
204: 日结流量
205: 日结时长
206: 月结时长
304: 日结流量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageBillMode")
    @Expose
    private Long PackageBillMode;

    /**
    * 总页数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * 数据总条数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 当前页数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 当前每页数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 当请求参数 PackageType = 0 时生效，逗号分隔，从第一个到最后一个分别表示：
标准直播，中国大陆（境内全地区）计费方式。
标准直播，国际/港澳台（境外多地区）计费方式。
快直播，中国大陆（境内全地区）计费方式。
快直播，国际/港澳台（境外多地区）计费方式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FluxPackageBillMode")
    @Expose
    private String FluxPackageBillMode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 套餐包信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivePackageInfoList 套餐包信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LivePackageInfo [] getLivePackageInfoList() {
        return this.LivePackageInfoList;
    }

    /**
     * Set 套餐包信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivePackageInfoList 套餐包信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivePackageInfoList(LivePackageInfo [] LivePackageInfoList) {
        this.LivePackageInfoList = LivePackageInfoList;
    }

    /**
     * Get 套餐包当前计费方式:
-1: 无计费方式或获取失败
0: 无计费方式
201: 月结带宽
202: 月结流量
203: 日结带宽
204: 日结流量
205: 日结时长
206: 月结时长
304: 日结流量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageBillMode 套餐包当前计费方式:
-1: 无计费方式或获取失败
0: 无计费方式
201: 月结带宽
202: 月结流量
203: 日结带宽
204: 日结流量
205: 日结时长
206: 月结时长
304: 日结流量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPackageBillMode() {
        return this.PackageBillMode;
    }

    /**
     * Set 套餐包当前计费方式:
-1: 无计费方式或获取失败
0: 无计费方式
201: 月结带宽
202: 月结流量
203: 日结带宽
204: 日结流量
205: 日结时长
206: 月结时长
304: 日结流量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageBillMode 套餐包当前计费方式:
-1: 无计费方式或获取失败
0: 无计费方式
201: 月结带宽
202: 月结流量
203: 日结带宽
204: 日结流量
205: 日结时长
206: 月结时长
304: 日结流量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageBillMode(Long PackageBillMode) {
        this.PackageBillMode = PackageBillMode;
    }

    /**
     * Get 总页数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPage 总页数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 总页数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPage 总页数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get 数据总条数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalNum 数据总条数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 数据总条数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalNum 数据总条数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 当前页数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNum 当前页数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 当前页数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNum 当前页数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 当前每页数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize 当前每页数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 当前每页数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize 当前每页数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 当请求参数 PackageType = 0 时生效，逗号分隔，从第一个到最后一个分别表示：
标准直播，中国大陆（境内全地区）计费方式。
标准直播，国际/港澳台（境外多地区）计费方式。
快直播，中国大陆（境内全地区）计费方式。
快直播，国际/港澳台（境外多地区）计费方式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FluxPackageBillMode 当请求参数 PackageType = 0 时生效，逗号分隔，从第一个到最后一个分别表示：
标准直播，中国大陆（境内全地区）计费方式。
标准直播，国际/港澳台（境外多地区）计费方式。
快直播，中国大陆（境内全地区）计费方式。
快直播，国际/港澳台（境外多地区）计费方式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFluxPackageBillMode() {
        return this.FluxPackageBillMode;
    }

    /**
     * Set 当请求参数 PackageType = 0 时生效，逗号分隔，从第一个到最后一个分别表示：
标准直播，中国大陆（境内全地区）计费方式。
标准直播，国际/港澳台（境外多地区）计费方式。
快直播，中国大陆（境内全地区）计费方式。
快直播，国际/港澳台（境外多地区）计费方式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FluxPackageBillMode 当请求参数 PackageType = 0 时生效，逗号分隔，从第一个到最后一个分别表示：
标准直播，中国大陆（境内全地区）计费方式。
标准直播，国际/港澳台（境外多地区）计费方式。
快直播，中国大陆（境内全地区）计费方式。
快直播，国际/港澳台（境外多地区）计费方式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFluxPackageBillMode(String FluxPackageBillMode) {
        this.FluxPackageBillMode = FluxPackageBillMode;
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

    public DescribeLivePackageInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLivePackageInfoResponse(DescribeLivePackageInfoResponse source) {
        if (source.LivePackageInfoList != null) {
            this.LivePackageInfoList = new LivePackageInfo[source.LivePackageInfoList.length];
            for (int i = 0; i < source.LivePackageInfoList.length; i++) {
                this.LivePackageInfoList[i] = new LivePackageInfo(source.LivePackageInfoList[i]);
            }
        }
        if (source.PackageBillMode != null) {
            this.PackageBillMode = new Long(source.PackageBillMode);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.FluxPackageBillMode != null) {
            this.FluxPackageBillMode = new String(source.FluxPackageBillMode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LivePackageInfoList.", this.LivePackageInfoList);
        this.setParamSimple(map, prefix + "PackageBillMode", this.PackageBillMode);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "FluxPackageBillMode", this.FluxPackageBillMode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

