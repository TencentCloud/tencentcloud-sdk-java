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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServicePage extends AbstractModel{

    /**
    * 条目
    */
    @SerializedName("Records")
    @Expose
    private TemService [] Records;

    /**
    * 总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 条目
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 页数
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * 当前条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Current")
    @Expose
    private Long Current;

    /**
     * Get 条目 
     * @return Records 条目
     */
    public TemService [] getRecords() {
        return this.Records;
    }

    /**
     * Set 条目
     * @param Records 条目
     */
    public void setRecords(TemService [] Records) {
        this.Records = Records;
    }

    /**
     * Get 总数 
     * @return Total 总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
     * @param Total 总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 条目 
     * @return Size 条目
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 条目
     * @param Size 条目
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 页数 
     * @return Pages 页数
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set 页数
     * @param Pages 页数
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get 当前条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Current 当前条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrent() {
        return this.Current;
    }

    /**
     * Set 当前条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Current 当前条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrent(Long Current) {
        this.Current = Current;
    }

    public ServicePage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServicePage(ServicePage source) {
        if (source.Records != null) {
            this.Records = new TemService[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new TemService(source.Records[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.Current != null) {
            this.Current = new Long(source.Current);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamSimple(map, prefix + "Current", this.Current);

    }
}

