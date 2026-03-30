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

public class PageByNoResult extends AbstractModel {

    /**
    * 总共有多少数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 总共有多少个分页
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * 当前的分页号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentPageNo")
    @Expose
    private Long CurrentPageNo;

    /**
    * 【已弃用】是否遍历到末尾
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsEnd")
    @Expose
    private Boolean IsEnd;

    /**
    * 是否遍历到末尾
    */
    @SerializedName("End")
    @Expose
    private Boolean End;

    /**
     * Get 总共有多少数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总共有多少数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总共有多少数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总共有多少数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 总共有多少个分页
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPage 总共有多少个分页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 总共有多少个分页
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPage 总共有多少个分页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get 当前的分页号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentPageNo 当前的分页号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentPageNo() {
        return this.CurrentPageNo;
    }

    /**
     * Set 当前的分页号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentPageNo 当前的分页号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentPageNo(Long CurrentPageNo) {
        this.CurrentPageNo = CurrentPageNo;
    }

    /**
     * Get 【已弃用】是否遍历到末尾
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsEnd 【已弃用】是否遍历到末尾
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Boolean getIsEnd() {
        return this.IsEnd;
    }

    /**
     * Set 【已弃用】是否遍历到末尾
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsEnd 【已弃用】是否遍历到末尾
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setIsEnd(Boolean IsEnd) {
        this.IsEnd = IsEnd;
    }

    /**
     * Get 是否遍历到末尾 
     * @return End 是否遍历到末尾
     */
    public Boolean getEnd() {
        return this.End;
    }

    /**
     * Set 是否遍历到末尾
     * @param End 是否遍历到末尾
     */
    public void setEnd(Boolean End) {
        this.End = End;
    }

    public PageByNoResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PageByNoResult(PageByNoResult source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.CurrentPageNo != null) {
            this.CurrentPageNo = new Long(source.CurrentPageNo);
        }
        if (source.IsEnd != null) {
            this.IsEnd = new Boolean(source.IsEnd);
        }
        if (source.End != null) {
            this.End = new Boolean(source.End);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "CurrentPageNo", this.CurrentPageNo);
        this.setParamSimple(map, prefix + "IsEnd", this.IsEnd);
        this.setParamSimple(map, prefix + "End", this.End);

    }
}

