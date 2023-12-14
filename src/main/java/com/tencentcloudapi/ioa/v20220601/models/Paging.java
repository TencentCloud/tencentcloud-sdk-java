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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Paging extends AbstractModel {

    /**
    * 每页条数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页码(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 总页数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * 记录总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get 每页条数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize 每页条数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页条数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize 每页条数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页码(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNum 页码(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页码(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNum 页码(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 总页数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageCount 总页数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageCount() {
        return this.PageCount;
    }

    /**
     * Set 总页数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageCount 总页数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageCount(Long PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * Get 记录总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 记录总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 记录总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 记录总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public Paging() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Paging(Paging source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageCount != null) {
            this.PageCount = new Long(source.PageCount);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

