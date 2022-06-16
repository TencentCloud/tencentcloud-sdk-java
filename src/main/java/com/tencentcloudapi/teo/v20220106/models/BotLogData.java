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

public class BotLogData extends AbstractModel{

    /**
    * Bot攻击日志数据集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private BotLog [] List;

    /**
    * 当前页
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 每页展示条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

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
     * Get Bot攻击日志数据集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List Bot攻击日志数据集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BotLog [] getList() {
        return this.List;
    }

    /**
     * Set Bot攻击日志数据集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param List Bot攻击日志数据集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(BotLog [] List) {
        this.List = List;
    }

    /**
     * Get 当前页
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNo 当前页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 当前页
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNo 当前页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 每页展示条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize 每页展示条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页展示条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize 每页展示条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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

    public BotLogData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotLogData(BotLogData source) {
        if (source.List != null) {
            this.List = new BotLog[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new BotLog(source.List[i]);
            }
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);

    }
}

