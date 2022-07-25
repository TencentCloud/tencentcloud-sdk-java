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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DropCls extends AbstractModel{

    /**
    * 是否投递到cls
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DropInvalidMessageToCls")
    @Expose
    private Boolean DropInvalidMessageToCls;

    /**
    * 投递cls的地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DropClsRegion")
    @Expose
    private String DropClsRegion;

    /**
    * 投递cls的账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DropClsOwneruin")
    @Expose
    private String DropClsOwneruin;

    /**
    * 投递cls的主题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DropClsTopicId")
    @Expose
    private String DropClsTopicId;

    /**
    * 投递cls的日志集id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DropClsLogSet")
    @Expose
    private String DropClsLogSet;

    /**
     * Get 是否投递到cls
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DropInvalidMessageToCls 是否投递到cls
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDropInvalidMessageToCls() {
        return this.DropInvalidMessageToCls;
    }

    /**
     * Set 是否投递到cls
注意：此字段可能返回 null，表示取不到有效值。
     * @param DropInvalidMessageToCls 是否投递到cls
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDropInvalidMessageToCls(Boolean DropInvalidMessageToCls) {
        this.DropInvalidMessageToCls = DropInvalidMessageToCls;
    }

    /**
     * Get 投递cls的地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DropClsRegion 投递cls的地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDropClsRegion() {
        return this.DropClsRegion;
    }

    /**
     * Set 投递cls的地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param DropClsRegion 投递cls的地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDropClsRegion(String DropClsRegion) {
        this.DropClsRegion = DropClsRegion;
    }

    /**
     * Get 投递cls的账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DropClsOwneruin 投递cls的账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDropClsOwneruin() {
        return this.DropClsOwneruin;
    }

    /**
     * Set 投递cls的账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param DropClsOwneruin 投递cls的账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDropClsOwneruin(String DropClsOwneruin) {
        this.DropClsOwneruin = DropClsOwneruin;
    }

    /**
     * Get 投递cls的主题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DropClsTopicId 投递cls的主题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDropClsTopicId() {
        return this.DropClsTopicId;
    }

    /**
     * Set 投递cls的主题
注意：此字段可能返回 null，表示取不到有效值。
     * @param DropClsTopicId 投递cls的主题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDropClsTopicId(String DropClsTopicId) {
        this.DropClsTopicId = DropClsTopicId;
    }

    /**
     * Get 投递cls的日志集id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DropClsLogSet 投递cls的日志集id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDropClsLogSet() {
        return this.DropClsLogSet;
    }

    /**
     * Set 投递cls的日志集id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DropClsLogSet 投递cls的日志集id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDropClsLogSet(String DropClsLogSet) {
        this.DropClsLogSet = DropClsLogSet;
    }

    public DropCls() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DropCls(DropCls source) {
        if (source.DropInvalidMessageToCls != null) {
            this.DropInvalidMessageToCls = new Boolean(source.DropInvalidMessageToCls);
        }
        if (source.DropClsRegion != null) {
            this.DropClsRegion = new String(source.DropClsRegion);
        }
        if (source.DropClsOwneruin != null) {
            this.DropClsOwneruin = new String(source.DropClsOwneruin);
        }
        if (source.DropClsTopicId != null) {
            this.DropClsTopicId = new String(source.DropClsTopicId);
        }
        if (source.DropClsLogSet != null) {
            this.DropClsLogSet = new String(source.DropClsLogSet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DropInvalidMessageToCls", this.DropInvalidMessageToCls);
        this.setParamSimple(map, prefix + "DropClsRegion", this.DropClsRegion);
        this.setParamSimple(map, prefix + "DropClsOwneruin", this.DropClsOwneruin);
        this.setParamSimple(map, prefix + "DropClsTopicId", this.DropClsTopicId);
        this.setParamSimple(map, prefix + "DropClsLogSet", this.DropClsLogSet);

    }
}

