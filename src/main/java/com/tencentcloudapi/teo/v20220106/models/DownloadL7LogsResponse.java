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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadL7LogsResponse extends AbstractModel{

    /**
    * 七层离线日志data
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private L7OfflineLog [] Data;

    /**
    * 页面大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 总页数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * 总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 七层离线日志data
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 七层离线日志data
注意：此字段可能返回 null，表示取不到有效值。
     */
    public L7OfflineLog [] getData() {
        return this.Data;
    }

    /**
     * Set 七层离线日志data
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 七层离线日志data
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(L7OfflineLog [] Data) {
        this.Data = Data;
    }

    /**
     * Get 页面大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize 页面大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页面大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize 页面大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNo 页号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNo 页号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 总页数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pages 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set 总页数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pages 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get 总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalSize 总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalSize 总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
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

    public DownloadL7LogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadL7LogsResponse(DownloadL7LogsResponse source) {
        if (source.Data != null) {
            this.Data = new L7OfflineLog[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new L7OfflineLog(source.Data[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

