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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvalidSample extends AbstractModel{

    /**
    * 关键词
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 无效代码:1-标签不存在;2-词过长;3-词类型不匹配;4-备注超长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvalidCode")
    @Expose
    private Long InvalidCode;

    /**
    * 无效描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvalidMessage")
    @Expose
    private String InvalidMessage;

    /**
     * Get 关键词
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 关键词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 关键词
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 关键词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 无效代码:1-标签不存在;2-词过长;3-词类型不匹配;4-备注超长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvalidCode 无效代码:1-标签不存在;2-词过长;3-词类型不匹配;4-备注超长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInvalidCode() {
        return this.InvalidCode;
    }

    /**
     * Set 无效代码:1-标签不存在;2-词过长;3-词类型不匹配;4-备注超长
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvalidCode 无效代码:1-标签不存在;2-词过长;3-词类型不匹配;4-备注超长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvalidCode(Long InvalidCode) {
        this.InvalidCode = InvalidCode;
    }

    /**
     * Get 无效描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvalidMessage 无效描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvalidMessage() {
        return this.InvalidMessage;
    }

    /**
     * Set 无效描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvalidMessage 无效描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvalidMessage(String InvalidMessage) {
        this.InvalidMessage = InvalidMessage;
    }

    public InvalidSample() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvalidSample(InvalidSample source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.InvalidCode != null) {
            this.InvalidCode = new Long(source.InvalidCode);
        }
        if (source.InvalidMessage != null) {
            this.InvalidMessage = new String(source.InvalidMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "InvalidCode", this.InvalidCode);
        this.setParamSimple(map, prefix + "InvalidMessage", this.InvalidMessage);

    }
}

