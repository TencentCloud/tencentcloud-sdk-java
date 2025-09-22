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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataForBudgetOperationLogPage extends AbstractModel {

    /**
    * 分页
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * 分页大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 总量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 查询数据列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Records")
    @Expose
    private BudgetOperationLogEntity [] Records;

    /**
    * 当前页
    */
    @SerializedName("Current")
    @Expose
    private Long Current;

    /**
     * Get 分页 
     * @return Pages 分页
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set 分页
     * @param Pages 分页
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get 分页大小 
     * @return Size 分页大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 分页大小
     * @param Size 分页大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 总量 
     * @return Total 总量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总量
     * @param Total 总量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 查询数据列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Records 查询数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BudgetOperationLogEntity [] getRecords() {
        return this.Records;
    }

    /**
     * Set 查询数据列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Records 查询数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecords(BudgetOperationLogEntity [] Records) {
        this.Records = Records;
    }

    /**
     * Get 当前页 
     * @return Current 当前页
     */
    public Long getCurrent() {
        return this.Current;
    }

    /**
     * Set 当前页
     * @param Current 当前页
     */
    public void setCurrent(Long Current) {
        this.Current = Current;
    }

    public DataForBudgetOperationLogPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataForBudgetOperationLogPage(DataForBudgetOperationLogPage source) {
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Records != null) {
            this.Records = new BudgetOperationLogEntity[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new BudgetOperationLogEntity(source.Records[i]);
            }
        }
        if (source.Current != null) {
            this.Current = new Long(source.Current);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamSimple(map, prefix + "Current", this.Current);

    }
}

