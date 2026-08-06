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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseRunBuildLog extends AbstractModel {

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 触达ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Delivered")
    @Expose
    private Long Delivered;

    /**
    * 文档
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 是否更多
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("More")
    @Expose
    private Boolean More;

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 触达ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Delivered 触达ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelivered() {
        return this.Delivered;
    }

    /**
     * Set 触达ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Delivered 触达ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelivered(Long Delivered) {
        this.Delivered = Delivered;
    }

    /**
     * Get 文档
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 文档
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 是否更多
注意：此字段可能返回 null，表示取不到有效值。 
     * @return More 是否更多
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getMore() {
        return this.More;
    }

    /**
     * Set 是否更多
注意：此字段可能返回 null，表示取不到有效值。
     * @param More 是否更多
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMore(Boolean More) {
        this.More = More;
    }

    public CloudBaseRunBuildLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseRunBuildLog(CloudBaseRunBuildLog source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Delivered != null) {
            this.Delivered = new Long(source.Delivered);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.More != null) {
            this.More = new Boolean(source.More);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Delivered", this.Delivered);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "More", this.More);

    }
}

