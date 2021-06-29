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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalUserMappingInfo extends AbstractModel{

    /**
    * 企业主体对应的外部联系人userId
    */
    @SerializedName("CorpExternalUserId")
    @Expose
    private String CorpExternalUserId;

    /**
    * 乐销车应用主体对应的外部联系人, 当不存在好友关系时，该字段值为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalUserId")
    @Expose
    private String ExternalUserId;

    /**
     * Get 企业主体对应的外部联系人userId 
     * @return CorpExternalUserId 企业主体对应的外部联系人userId
     */
    public String getCorpExternalUserId() {
        return this.CorpExternalUserId;
    }

    /**
     * Set 企业主体对应的外部联系人userId
     * @param CorpExternalUserId 企业主体对应的外部联系人userId
     */
    public void setCorpExternalUserId(String CorpExternalUserId) {
        this.CorpExternalUserId = CorpExternalUserId;
    }

    /**
     * Get 乐销车应用主体对应的外部联系人, 当不存在好友关系时，该字段值为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalUserId 乐销车应用主体对应的外部联系人, 当不存在好友关系时，该字段值为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalUserId() {
        return this.ExternalUserId;
    }

    /**
     * Set 乐销车应用主体对应的外部联系人, 当不存在好友关系时，该字段值为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalUserId 乐销车应用主体对应的外部联系人, 当不存在好友关系时，该字段值为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalUserId(String ExternalUserId) {
        this.ExternalUserId = ExternalUserId;
    }

    public ExternalUserMappingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalUserMappingInfo(ExternalUserMappingInfo source) {
        if (source.CorpExternalUserId != null) {
            this.CorpExternalUserId = new String(source.CorpExternalUserId);
        }
        if (source.ExternalUserId != null) {
            this.ExternalUserId = new String(source.ExternalUserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CorpExternalUserId", this.CorpExternalUserId);
        this.setParamSimple(map, prefix + "ExternalUserId", this.ExternalUserId);

    }
}

