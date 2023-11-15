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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceTagInfo extends AbstractModel {

    /**
    * 标签Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagId")
    @Expose
    private Long TagId;

    /**
    * 标签名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
     * Get 标签Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagId 标签Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTagId() {
        return this.TagId;
    }

    /**
     * Set 标签Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagId 标签Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagId(Long TagId) {
        this.TagId = TagId;
    }

    /**
     * Get 标签名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagName 标签名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 标签名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagName 标签名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    public DeviceTagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceTagInfo(DeviceTagInfo source) {
        if (source.TagId != null) {
            this.TagId = new Long(source.TagId);
        }
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "TagName", this.TagName);

    }
}

