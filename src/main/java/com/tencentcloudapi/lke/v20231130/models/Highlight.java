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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Highlight extends AbstractModel {

    /**
    * 高亮起始位置

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartPos")
    @Expose
    private String StartPos;

    /**
    * 高亮结束位置

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndPos")
    @Expose
    private String EndPos;

    /**
    * 高亮子文本

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get 高亮起始位置

注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartPos 高亮起始位置

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartPos() {
        return this.StartPos;
    }

    /**
     * Set 高亮起始位置

注意：此字段可能返回 null，表示取不到有效值。
     * @param StartPos 高亮起始位置

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartPos(String StartPos) {
        this.StartPos = StartPos;
    }

    /**
     * Get 高亮结束位置

注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndPos 高亮结束位置

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndPos() {
        return this.EndPos;
    }

    /**
     * Set 高亮结束位置

注意：此字段可能返回 null，表示取不到有效值。
     * @param EndPos 高亮结束位置

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndPos(String EndPos) {
        this.EndPos = EndPos;
    }

    /**
     * Get 高亮子文本

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 高亮子文本

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 高亮子文本

注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 高亮子文本

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    public Highlight() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Highlight(Highlight source) {
        if (source.StartPos != null) {
            this.StartPos = new String(source.StartPos);
        }
        if (source.EndPos != null) {
            this.EndPos = new String(source.EndPos);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartPos", this.StartPos);
        this.setParamSimple(map, prefix + "EndPos", this.EndPos);
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

