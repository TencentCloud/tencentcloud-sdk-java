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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PageByNumResult extends AbstractModel {

    /**
    * <p>总共有多少数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>总共有多少个分页</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * <p>当前的分页号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentPageNo")
    @Expose
    private Long CurrentPageNo;

    /**
     * Get <p>总共有多少数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount <p>总共有多少数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总共有多少数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount <p>总共有多少数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>总共有多少个分页</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPage <p>总共有多少个分页</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set <p>总共有多少个分页</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPage <p>总共有多少个分页</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get <p>当前的分页号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentPageNo <p>当前的分页号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentPageNo() {
        return this.CurrentPageNo;
    }

    /**
     * Set <p>当前的分页号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentPageNo <p>当前的分页号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentPageNo(Long CurrentPageNo) {
        this.CurrentPageNo = CurrentPageNo;
    }

    public PageByNumResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PageByNumResult(PageByNumResult source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.CurrentPageNo != null) {
            this.CurrentPageNo = new Long(source.CurrentPageNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "CurrentPageNo", this.CurrentPageNo);

    }
}

