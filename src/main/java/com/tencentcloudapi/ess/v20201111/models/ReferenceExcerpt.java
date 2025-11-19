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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReferenceExcerpt extends AbstractModel {

    /**
    * 原文内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 坐标信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private PositionInfo Position;

    /**
     * Get 原文内容 
     * @return Content 原文内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 原文内容
     * @param Content 原文内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 坐标信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position 坐标信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PositionInfo getPosition() {
        return this.Position;
    }

    /**
     * Set 坐标信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position 坐标信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(PositionInfo Position) {
        this.Position = Position;
    }

    public ReferenceExcerpt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReferenceExcerpt(ReferenceExcerpt source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Position != null) {
            this.Position = new PositionInfo(source.Position);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamObj(map, prefix + "Position.", this.Position);

    }
}

