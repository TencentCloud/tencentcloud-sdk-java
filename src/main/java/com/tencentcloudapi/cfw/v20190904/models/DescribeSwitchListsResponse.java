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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSwitchListsResponse extends AbstractModel{

    /**
    * 总条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 列表数据
    */
    @SerializedName("Data")
    @Expose
    private SwitchListsData [] Data;

    /**
    * 区域列表
    */
    @SerializedName("AreaLists")
    @Expose
    private String [] AreaLists;

    /**
    * 打开个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnNum")
    @Expose
    private Long OnNum;

    /**
    * 关闭个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OffNum")
    @Expose
    private Long OffNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总条数 
     * @return Total 总条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总条数
     * @param Total 总条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 列表数据 
     * @return Data 列表数据
     */
    public SwitchListsData [] getData() {
        return this.Data;
    }

    /**
     * Set 列表数据
     * @param Data 列表数据
     */
    public void setData(SwitchListsData [] Data) {
        this.Data = Data;
    }

    /**
     * Get 区域列表 
     * @return AreaLists 区域列表
     */
    public String [] getAreaLists() {
        return this.AreaLists;
    }

    /**
     * Set 区域列表
     * @param AreaLists 区域列表
     */
    public void setAreaLists(String [] AreaLists) {
        this.AreaLists = AreaLists;
    }

    /**
     * Get 打开个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnNum 打开个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOnNum() {
        return this.OnNum;
    }

    /**
     * Set 打开个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnNum 打开个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnNum(Long OnNum) {
        this.OnNum = OnNum;
    }

    /**
     * Get 关闭个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OffNum 关闭个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffNum() {
        return this.OffNum;
    }

    /**
     * Set 关闭个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OffNum 关闭个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffNum(Long OffNum) {
        this.OffNum = OffNum;
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

    public DescribeSwitchListsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSwitchListsResponse(DescribeSwitchListsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new SwitchListsData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SwitchListsData(source.Data[i]);
            }
        }
        if (source.AreaLists != null) {
            this.AreaLists = new String[source.AreaLists.length];
            for (int i = 0; i < source.AreaLists.length; i++) {
                this.AreaLists[i] = new String(source.AreaLists[i]);
            }
        }
        if (source.OnNum != null) {
            this.OnNum = new Long(source.OnNum);
        }
        if (source.OffNum != null) {
            this.OffNum = new Long(source.OffNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArraySimple(map, prefix + "AreaLists.", this.AreaLists);
        this.setParamSimple(map, prefix + "OnNum", this.OnNum);
        this.setParamSimple(map, prefix + "OffNum", this.OffNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

