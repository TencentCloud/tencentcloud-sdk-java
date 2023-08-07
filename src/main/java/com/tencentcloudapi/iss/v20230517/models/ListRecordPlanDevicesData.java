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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListRecordPlanDevicesData extends AbstractModel{

    /**
    * 第几页
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 当前页的设备数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 本次查询的设备通道总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 设备通道信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private RecordPlanChannelInfo [] List;

    /**
     * Get 第几页 
     * @return PageNumber 第几页
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 第几页
     * @param PageNumber 第几页
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 当前页的设备数量 
     * @return PageSize 当前页的设备数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 当前页的设备数量
     * @param PageSize 当前页的设备数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 本次查询的设备通道总数 
     * @return TotalCount 本次查询的设备通道总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 本次查询的设备通道总数
     * @param TotalCount 本次查询的设备通道总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 设备通道信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 设备通道信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordPlanChannelInfo [] getList() {
        return this.List;
    }

    /**
     * Set 设备通道信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 设备通道信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(RecordPlanChannelInfo [] List) {
        this.List = List;
    }

    public ListRecordPlanDevicesData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRecordPlanDevicesData(ListRecordPlanDevicesData source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.List != null) {
            this.List = new RecordPlanChannelInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new RecordPlanChannelInfo(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

