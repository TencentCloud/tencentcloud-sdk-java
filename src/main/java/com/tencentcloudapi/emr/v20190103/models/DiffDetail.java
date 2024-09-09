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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiffDetail extends AbstractModel {

    /**
    * tab页的头
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 变化项的个数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 要渲染的明细数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rows")
    @Expose
    private DiffDetailItem [] Rows;

    /**
    * 要渲染的头部信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Header")
    @Expose
    private DiffHeader [] Header;

    /**
     * Get tab页的头 
     * @return Name tab页的头
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set tab页的头
     * @param Name tab页的头
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 变化项的个数 
     * @return Count 变化项的个数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 变化项的个数
     * @param Count 变化项的个数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 要渲染的明细数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rows 要渲染的明细数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiffDetailItem [] getRows() {
        return this.Rows;
    }

    /**
     * Set 要渲染的明细数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rows 要渲染的明细数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRows(DiffDetailItem [] Rows) {
        this.Rows = Rows;
    }

    /**
     * Get 要渲染的头部信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Header 要渲染的头部信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiffHeader [] getHeader() {
        return this.Header;
    }

    /**
     * Set 要渲染的头部信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Header 要渲染的头部信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeader(DiffHeader [] Header) {
        this.Header = Header;
    }

    public DiffDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiffDetail(DiffDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Rows != null) {
            this.Rows = new DiffDetailItem[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new DiffDetailItem(source.Rows[i]);
            }
        }
        if (source.Header != null) {
            this.Header = new DiffHeader[source.Header.length];
            for (int i = 0; i < source.Header.length; i++) {
                this.Header[i] = new DiffHeader(source.Header[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamArrayObj(map, prefix + "Header.", this.Header);

    }
}

